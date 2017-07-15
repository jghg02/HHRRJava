package Model;

import java.util.ArrayList;

/**
 * Created by jhgonzalez on 7/15/17.
 */
public class Person {

    private int id;
    private String name;
    private String lastName;
    private int credit;
    private ArrayList<Person> list;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setList(ArrayList<Person> lista){
        this.list = lista;
    }

    public ArrayList<Person> getList(){
        return list;
    }
}
