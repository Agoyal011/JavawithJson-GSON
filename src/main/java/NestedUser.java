import com.google.gson.Gson;

public class NestedUser {
    String name;
    String email;
    int age;
    boolean isDeveloper;
    Useraddress address;


    public NestedUser(String name, String email, int age, boolean isDeveloper, Useraddress address) {

        this.age = age;
        this.email = email;
        this.name = name;
        this.isDeveloper = isDeveloper;
        this.address=address;

    }

}