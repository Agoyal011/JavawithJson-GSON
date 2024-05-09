import com.google.gson.Gson;

public class Main {


    public static void main(String args[]) {

        System.out.println("Welcome to GSON2-Nested Objects");

        //Serializeobject();
        deserializeobject();


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

        Gson gson = new Gson();// creating a gson instance
        String json2 = gson.toJson(usernested);
        System.out.println(json2);

    }
        public static void deserializeobject()
        {
            String restaurantJson="{'name':'Future Studio Steak house','owner':{'name':'Christian','address':{ 'city':'Ludhiana','country':'India','houseNumber':'771','street':'Main Street','cook':{'age':18,'name':'Aniket','salary':1500,'waiter':{ 'age':18,'name':'Norman','salary':1000}";

            Restaurant restaurant= new Gson().fromJson(restaurantJson,Restaurant.class);
            //System.out.println(restaurant);

        }
    }

