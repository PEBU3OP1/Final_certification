package Model;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


import Controller.Date_validator;
import Database.Farm_db;

public abstract class Pet {
    protected int id;
    protected String name;
    protected String command;
    protected String bday;
    protected String class_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public void new_entry(String name, String command, String bday, String class_name) throws ParseException {
        Date_validator date_validator = new Date_validator();

        Date bday_new = date_validator.string_to_date_converter(bday);
        java.sql.Date sqldate = new java.sql.Date(bday_new.getTime());
        Farm_db pet_entry = new Farm_db();


        pet_entry.toAdd(name, command, sqldate, class_name,
                (calculateAge(date_validator.string_to_local_date_converter(bday),
                                        date_validator.string_to_local_date_converter("17-03-2023"))));
                        
    }

}
