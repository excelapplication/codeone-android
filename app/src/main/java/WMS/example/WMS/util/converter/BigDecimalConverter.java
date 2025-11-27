package WMS.example.WMS.util.converter;

import java.math.BigDecimal;

import androidx.room.TypeConverter;

public class BigDecimalConverter {

    @TypeConverter
    public BigDecimal fromString(String value) {
        return value == null ? null : new BigDecimal(value);
    }

    @TypeConverter
    public String amountToString(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        } else {
            return bigDecimal.toString();
        }
    }

}