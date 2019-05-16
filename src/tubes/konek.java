package tubes;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.time.zone.ZoneRulesProvider.refresh;

public class konek {
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/klinik", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        refresh();

        return con;
    }
}