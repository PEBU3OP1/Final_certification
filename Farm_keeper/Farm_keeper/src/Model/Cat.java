package Model;

import java.text.ParseException;
import java.util.Date;

import Database.Farm_db;


public class Cat extends Pet{

    
    /**
     * @param name
     * @param command
     * @param bday
     * @param class_name
     * @throws ParseException
     */
    public Cat(String name, String command, String bday) throws ParseException {

        this.name = name;
        this.command = command;
        this.bday = bday;
        this.class_name = "Cat";
         
        new_entry(name, command, bday, class_name);

         

    }

     



}
