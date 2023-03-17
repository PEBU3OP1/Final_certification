package Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Pet;

public class Farm_db implements Farm_database_intfc {

    public static Connection get_Connection() throws SQLException {
        String url_To_Connect = "jdbc:mysql://localhost:3306/human_friends";
        String userName = "root";
        String password = "Vsevolod27";

        return DriverManager.getConnection(url_To_Connect, userName, password);

    }

    @Override
    public List<String> getAll() {
        ArrayList<String> pet_list = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = get_Connection();
            java.sql.Statement stmt = con.createStatement();
            ResultSet rslt = stmt.executeQuery("SELECT * FROM farm;");
            while (rslt.next()) {
                String id = rslt.getString(1);
                String name = rslt.getString(2);
                String command = rslt.getString(3);
                String bday = rslt.getString(4);
                String klass = rslt.getString(5);
                String years = rslt.getString(6);

                pet_list.add(id + ";" + name + ";" + command + ";" + bday + ";" + klass + ";" + years);

            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return pet_list;
    }

    @Override
    public String getById() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String train() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(int Id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = get_Connection();
            PreparedStatement stmt = con.prepareStatement("DELETE FROM farm WHERE Id = ?");
            stmt.setInt(1, Id);
            stmt.executeUpdate();
            con.close();

        } catch (Exception e) {
            System.out.println(e);

        }
        
        System.out.printf("Животное под номером %d удалено\n", Id);
    }

    @Override
    public void toAdd(String name, String command, Date bday, String class_name, Integer Bday_IN_Years) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = get_Connection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO farm (horse_name, horse_comand, horse_birthday, pack_type_name, Bday_IN_years) VALUES (?, ?, ?,?,?);");
            stmt.setString(1, name);
            stmt.setString(2, command);
            stmt.setDate(3, bday);
            stmt.setString(4, class_name);
            stmt.setInt(5, Bday_IN_Years);

            stmt.executeUpdate();

            con.close();

            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("New " + class_name + " was added!");
    }

}
