package Controller;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date_validator {

public boolean valid_date (String checking_date){
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    dateFormat.setLenient(false);

    try {
        dateFormat.parse(checking_date.trim());
    } catch (ParseException e) {
        return false;
    }

    return true;
}



public Date string_to_date_converter (String date_To_convert) throws ParseException{
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    dateFormat.setLenient(false);
    Date final_date = (Date) dateFormat.parse(date_To_convert.trim());
    return final_date;
}


public LocalDate date_to_localdate_converter (Date date_to_convert){
    Date in = new Date();
    LocalDate localdate = in.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    return localdate;
}


public LocalDate string_to_local_date_converter (String date_To_convert) throws ParseException{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    formatter = formatter.withLocale(Locale.US);
    LocalDate final_date = LocalDate.parse(date_To_convert,formatter);
    return final_date;
}
    
}
