package Model;

import java.text.ParseException;
import java.util.Date;

import javax.xml.crypto.Data;

public class Dog extends Pet {

    /**
     * @param name
     * @param command
     * @param bday
     * @param class_name
     * @throws ParseException
     */
    public Dog(String name, String command, String bday) throws ParseException {

        this.name = name;
        this.command = command;
        this.bday = bday;
        this.class_name = "Dog";
        new_entry(name, command, bday, class_name);


    }

}
