package Model;

import java.text.ParseException;
import java.util.Date;

public enum Creator {
    Cat,
    Dog,
    Donkey;

    
    public Cat create_Cat (String name, String command, String bday) throws ParseException{

        Cat cat = new Cat(name, command, bday);
        return cat;

    }


    public Dog create_Dog (String name, String command, String bday) throws ParseException{

        Dog dog = new Dog(name, command, bday);
        return dog;

    }


    public Donkey create_Donkey (String name, String command, String bday) throws ParseException{

        Donkey donkey = new Donkey(name, command, bday);
        return donkey;

    }

    
}
