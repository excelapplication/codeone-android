package WMS.example.WMS.util;

import android.content.Context;

import WMS.example.WMS.repositoryconfig.MedicoStockistDatabase;
import WMS.example.WMS.util.interceptor.HttpInterceptor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;


public class RetrofitUtil {

    private static final String DATABASE_NAME = "medicoStockist.db";
    private static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            // Table 1: PICKSLIP_HDR
            database.execSQL("CREATE TABLE IF NOT EXISTS PICKSLIP_HDR (" +
                    "PK INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "SL_NO INTEGER, " +
                    "PS_TRAN_DATE TEXT, " +
                    "PS_HDR_STATUS TEXT, " +
                    "PS_TRAN_NO TEXT, " +
                    "PS_COMP_CD TEXT, " +
                    "FIN_YEAR_ID INTEGER, " +
                    "PERIOD_CD TEXT, " +
                    "WH_ID INTEGER, " +
                    "SUB_COMPANY TEXT, " +
                    "PS_TOTAL_WEIGHT REAL, " +   // BigDecimal stored as REAL
                    "PS_TOTAL_VOLUME REAL, " +   // BigDecimal stored as REAL
                    "INSERT_USER_ID TEXT, " +
                    "MOD_USER_ID TEXT, " +
                    "MOD_DATE TEXT, " +
                    "PICKSLIP_NO INTEGER, " +
                    "PS_HDR_CONFIRM TEXT" +
                    ");");

            // Table 2: pickslip_bin_detail
            database.execSQL("CREATE TABLE IF NOT EXISTS pickslip_bin_detail (" +
                    "PK INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "slno INTEGER, " +
                    "ps_hdr_slno INTEGER, " +
                    "product_id INTEGER, " +
                    "batch_id INTEGER, " +
                    "bin_id INTEGER, " +
                    "bin_number TEXT, " +
                    "product_qty INTEGER, " +
                    "wh_id TEXT" +
                    ");");

            // Table 3: PICKSLIP_DTL
            database.execSQL("CREATE TABLE IF NOT EXISTS PICKSLIP_DTL (" +
                    "PK INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "SL_NO INTEGER, " +
                    "PS_HDR_SLNO INTEGER, " +
                    "SD_TRAN_HDR_ID INTEGER, " +
                    "SD_TRAN_HDR_NO TEXT, " +
                    "PARTY_NAME TEXT, " +
                    "PS_DTL_STATUS TEXT, " +
                    "INSERT_USER_ID TEXT, " +
                    "MOD_USER_ID TEXT, " +
                    "MOD_DATE TEXT, " +
                    "SAP_CUST_CD TEXT, " +
                    "SAP_TRANS_CD TEXT, " +
                    "PACKING_CONFIRM TEXT, " +
                    "DSP_LR_NO TEXT, " +
                    "DSP_LR_DT TEXT, " +
                    "DSP_LORRY_NO TEXT, " +
                    "DSP_TRANSPORTER TEXT, " +
                    "DSP_WT REAL, " +
                    "DSP_CASES INTEGER, " +
                    "DSP_BILLABLE_WT REAL, " +
                    "DSP_DELIVERY_DATE TEXT, " +
                    "DSP_RECD_BY TEXT, " +
                    "DSP_REMARK TEXT, " +
                    "COURIER_EXPENSES REAL, " +
                    "ACTUAL_DELIVERY_DATE TEXT, " +
                    "DELIVERY_DETAIL_MODIFY_DATE TEXT, " +
                    "EMAIL_SEND_IND_AFTER_LR TEXT, " +
                    "TRANSPORT_MODE TEXT, " +
                    "INSERT_IP_ADDRESS TEXT, " +
                    "MOD_IP_ADDRESS TEXT" +
                    ");");


        }
    };
    
    public static OkHttpClient getClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .readTimeout(1000, TimeUnit.SECONDS)
                .writeTimeout(1000, TimeUnit.SECONDS)
                .connectTimeout(1000, TimeUnit.SECONDS)
                // Add JWT Authorization header
                .addInterceptor(new TokenInterceptor())
                // Auto refresh token on 401
                .authenticator(new TokenAuthenticator())
                // Logging
                .addInterceptor(logging)
                .build();
    }

//    public static OkHttpClient getClient() {
//
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//        CertificatePinner certificatePinner = new CertificatePinner.Builder()
//                .add("sampro-pfizerindia.com", "sha256/xxxxxxxxxxxxxxxxxxxxxxx")
//                .build();
//
//        return new OkHttpClient.Builder()
//                .readTimeout(1000, TimeUnit.SECONDS)
//                .writeTimeout(1000, TimeUnit.SECONDS)
//                .connectTimeout(1000, TimeUnit.SECONDS)
//                .addInterceptor(new TokenInterceptor())  // JWT Authorization
//                .authenticator(new TokenAuthenticator()) // Auto token refresh
//                .certificatePinner(certificatePinner)     // Certificate pinning
//                .addInterceptor(logging)                  // Logging
//                .build();
//    }



    public static MedicoStockistDatabase getDatabase(Context context) {
        return Room.databaseBuilder(context, MedicoStockistDatabase.class, DATABASE_NAME).allowMainThreadQueries().addMigrations(MIGRATION_1_2).build();
    }

}