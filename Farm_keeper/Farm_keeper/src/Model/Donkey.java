package Model;

import java.text.ParseException;
import java.util.Date;

public class Donkey extends Pet{

    /**
     * @param name
     * @param command
     * @param bday
     * @param class_name
     * @throws ParseException
     */
    public Donkey (String name, String command, String bday) throws ParseException {

        this.name = name;
        this.command = command;
        this.bday = bday;
        this.class_name = "Donkey";

        new_entry(name, command, bday, class_name);
    }

    

}
