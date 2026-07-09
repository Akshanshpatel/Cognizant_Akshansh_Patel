package Classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_basics {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ott_db";
        String user = "root";
        String password = "Cherry@123";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            String query="Select * from hotstar where hotstar.year>2010";

            Statement st=con.createStatement();

            ResultSet ans=st.executeQuery(query);

            int t=0;
            while(ans.next() && t<10){
                System.out.println("Movie: "+ans.getString("title")+"--> Genre: "+ans.getString("genre"));
                t+=1;
            }

        } catch (Exception e) {
            System.out.println("Error"+e);
        }


    }
}
