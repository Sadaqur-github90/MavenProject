package MavenBasics;

public class UseConstructor {
    // Constructor is a special type of method
    // Constructor name should be same as class name;
    int age =35;
    String houseName = "Rumel's Palace";
    String address = "Bronx, NY";
    String phoneNumber = "9175846983";

    //Default Constructor
    public UseConstructor() {

    }
    // Parameterised Constructor
    public UseConstructor(String houseName){
        this.houseName= houseName;
    }

    public UseConstructor(String houseName, String address, String phoneNumber) {
        this.houseName= houseName;
        this.address= address;
        this.phoneNumber= phoneNumber;

    }

    void house(){
        System.out.println(houseName + " House Address "+ address+ "Phone Number "+phoneNumber);
    }
}
