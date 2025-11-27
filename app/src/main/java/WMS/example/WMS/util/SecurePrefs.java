package WMS.example.WMS.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;

import WMS.example.WMS.ContextApplication;

public class SecurePrefs {

    private static final String FILE_NAME = "secure_prefs";

    // Lazy-loaded singleton, always non-null
    private static SharedPreferences getPrefs() {
        return Holder.INSTANCE;
    }

    // Thread-safe, lazy initialization
    private static class Holder {
        private static final SharedPreferences INSTANCE = createPrefs();
    }

    private static SharedPreferences createPrefs() {
        Context context = ContextApplication.getContext(); // MUST use Application context

        try {
            MasterKey masterKey = new MasterKey.Builder(context)
                    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                    .build();

            return EncryptedSharedPreferences.create(
                    context,
                    FILE_NAME,
                    masterKey,
                    EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                    EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            );

        } catch (Exception e) {
            e.printStackTrace();

            // FINAL SAFETY FALLBACK → Never return null
            return PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    // -------------------------
    // Public API
    // -------------------------

    public static void put(String key, String value) {
        getPrefs().edit().putString(key, value).apply();
    }

    public static String get(String key) {
        return getPrefs().getString(key, null);
    }

    public static void clear() {
        getPrefs().edit().clear().apply();
    }
}
