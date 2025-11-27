package WMS.example.WMS.util.converter;


import WMS.example.WMS.util.MedicoResources;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import androidx.room.TypeConverter;

public class DateTypeConverter {

    @TypeConverter
    public static Date toDate(Long value) {
        try {
            if (value != null) {
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
                df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
                return MedicoResources.convert_DD_MM_YYYY_toDateTypeConverter(df.format(value));
            }
            return null;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @TypeConverter
    public static Long toLong(Date value) {
        return value == null ? null : value.getTime();
    }

}