package Database;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public interface Farm_database_intfc {
    <Pet> List getAll();

    String getById();

    String train();
    void toAdd(String name, String command, Date bday, String class_name, Integer Bday_IN_Years);
    void delete(int Id);



}
