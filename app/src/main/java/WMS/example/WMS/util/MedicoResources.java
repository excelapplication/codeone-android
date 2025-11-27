package WMS.example.WMS.util;

import android.app.AlertDialog;
import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MedicoResources {

    public static String convertCalendarUtilDateToString_DD_MMM_YYYY(Date date) {
        DateFormat df = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        return df.format(date);
    }

    public static String convertUtilDateToString_DD_MM_YYYY(Date date) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return df.format(date);
    }

    public static String convertUtilDateToString_DDMMYYYY(Date date) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return df.format(date);
    }


    public static String convertStringDateToDD_MM_YYYY(String stringDate) throws Exception {
        DateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return fromUser.format(myFormat.parse(stringDate));
    }

    public static String convertString_dd_MM_yyyy_DateToString_yyyy_MM_dd(String stringDate) throws Exception {
        DateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return myFormat.format(fromUser.parse(stringDate));
    }

    public static String convert_dd_MM_yyyy_DateToString_yyyy_MM_dd(String stringDate) throws Exception {
        DateFormat fromUser = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return myFormat.format(fromUser.parse(stringDate));
    }

    public static String convertString_yy_mm_ddDateToString_dd_MMM_yyyy(String stringDate) throws Exception {
        DateFormat fromUser = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return fromUser.format(myFormat.parse(stringDate));
    }

    public static Date convert_DD_MM_YYYY_toDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return df.parse(date);
    }

    public static Date convert_yyyy_MM_dd_toDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));//TODO
        return df.parse(date);
    }

    public static Date convert_dd_MMM_yyyy_toDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));//TODO
        return df.parse(date);
    }

    public static String convert_yyyy_MM_dd_FromDate(Date date) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return df.format(date);
    }

    public static String convertCurrentUtilDateToString_YYYY_MM_DD(Date date) {
        DateFormat currentDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        currentDate.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));//TODO
        return currentDate.format(date);
    }

    public static Date convert_DD_MM_YYYY_toDateTypeConverter(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
        return df.parse(date);
    }

    public static String convertStringDateTo_yyyy_MM_dd(String stringDate) throws Exception {
        DateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        DateFormat fromUser = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        return myFormat.format(fromUser.parse(stringDate));
    }

    public static String convertUtilDateToString_MM(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("MM", Locale.ENGLISH);
        return dateFormat.format(date);
    }

    public static String convertDateAndTime_to_DD_MM_YYYY_date(String userDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = inputFormat.parse(userDate);
        return outputFormat.format(date);
    }

    public static String convertDate_to_DD_MM_YYYY_date(String userDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = inputFormat.parse(userDate);
        return outputFormat.format(date);
    }

    public static Date atStartOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date atEndOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date addDays(Date date, int days) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_WEEK, days);
        return calendar.getTime();
    }


    public static String toCamelCase(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");

        StringBuilder camelCase = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            camelCase.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase());

            if (i < words.length - 1) {
                camelCase.append(" ");
            }
        }
        return camelCase.toString();
    }



}
