import com.google.gson.Gson;

public class NestedUser {
    String name;
    String email;
    int age;
    boolean isDeveloper;



    public NestedUser(String name, String email, int age, boolean isDeveloper, Useraddress) {

        this.age = age;
        this.email = email;
        this.name = name;
        this.isDeveloper = isDeveloper;

    }

    public static void main(String args[]) {

        System.out.println("Welcome to GSON2-Nested Objects");

        Serializeobject();


    }

    public static void Serializeobject() {
        Useraddress address = new Useraddress(
                "Main Street",
                "42A",
                "lUDHIANA",
                "India"

        );

        NestedUser usernested = new NestedUser(
                "Aniket",
                "aniket.17.goyal@gmail.com",
                24,
                true,
                address
        );

        Gson gson=new Gson();// creating a gson instance
        String json2= gson.toJson(usernested);
        System.out.println(usernested);

    }
}