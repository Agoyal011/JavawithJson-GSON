import com.google.gson.Gson;

public class Main {


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
                true

                address

        );

        Gson gson=new Gson();// creating a gson instance
        String json2= gson.toJson(usernested);
        System.out.println(usernested);

    }
}
