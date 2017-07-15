package Controller;

import DB.ConnectDB;
import Model.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by jhgonzalez on 7/15/17.
 */
public class CreditController {

    public static Connection con;
    public static ArrayList<Person> result;

    public static void addCredit(int monto, Person person){

        ConnectDB connectDB = new ConnectDB();
        try {
            con = connectDB.connectToDB();
            if (con != null){
                mapPerson(connectDB.getAllDataPersons());

                connectDB.updateData(monto,result.get(0));

                connectDB.close();
            }

        } catch (Exception e){

        }


    }

    public static void mapPerson(ResultSet resultSet){
        result = new ArrayList<>();
        Person p = new Person();
        try {
            while (resultSet.next()){
                p.setId(resultSet.getInt("per_id"));
                p.setName(resultSet.getString("per_name"));
                p.setLastName(resultSet.getString("per_lastname"));
                p.setCredit(resultSet.getInt("per_credit"));

                result.add(p);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
