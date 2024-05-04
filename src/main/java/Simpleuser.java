import com.google.gson.Gson;

import javax.swing.*;

public class Simpleuser {
    String name;
    String address;
    int age;
    String nationality;

    public static void main(String args[]) {

        System.out.println("Welcome to Gson-01- Getting started");
        Serializeobject();
        Deserializeobject();

    }

    public Simpleuser(String name, String address, int age, String nationality) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.nationality = nationality;

    }

    public static void Serializeobject() {

        Simpleuser user1 = new Simpleuser("Aniket", "771 bethany", 24, "Indian");
        Gson gson= new Gson();
        String json= gson.toJson(user1);

        System.out.println(json);

    }

    public static void Deserializeobject(){

        String json1= "{'name:'Aniket', 'address':'771 bethany', 'age':24, 'nationality':'Indian' }";

        Gson gson= new Gson();
        Simpleuser user2= gson.fromJson(json1,Simpleuser.class);
        System.out.println(user2);

    }

}
