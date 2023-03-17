import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/human_friends", "root","Vsevolod27");
            java.sql.Statement stmt= con.createStatement();
            ResultSet rslt = stmt.executeQuery("SELECT * FROM donkey;");
            while(rslt.next()){
                System.out.println(rslt.getString(2));
            }
            con.close();

       }
       catch(Exception e){
        System.out.println(e);
       }

    }
}
