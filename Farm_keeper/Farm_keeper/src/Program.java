import java.sql.PreparedStatement;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.validation.Validator;

import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;

import Controller.Controller;
import Controller.Date_validator;
import Database.Farm_db;
import Model.Cat;
import Model.Creator;
import Model.Donkey;
import View.View;

public class Program {
    public static void main(String[] args) throws ParseException {
        
        View menu = new View();
        menu.start();

    


        
     
        
        
    }
    
    
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }


    
}
