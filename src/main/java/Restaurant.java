import javax.management.relation.RelationServiceNotRegisteredException;

public class Restaurant {

    String name;

   RestaurantOwner owner;
   RestaurantStaff cook;
   RestaurantStaff waiter;

    public class RestaurantOwner {

        String name;
        Useraddress address1;

        public RestaurantOwner(String name, Useraddress address1){
            this.name=name;
            this.address1=address1;
        }

    }

    private class RestaurantStaff {

        int age;
        String name;
        int salary;

        public RestaurantStaff(int age,String name, int salary){

            this.name=name;
            this.age=age;
            this.salary=salary;

        }
    }


}


