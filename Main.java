import Person.Farmer;
import Person.WholeSaler;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("Akash Thallam",(long) 1222233344);

        Farmer farmer1 = new Farmer("Siddharth sharma", (long) 123456789);
        Farmer farmer2 = new Farmer("rajiv", (long) 78945123);
        Farmer farmer3 = new Farmer("Navin", (long) 456123789);
        Farmer farmer4 = new Farmer("Amit", (long) 789451263);
        Farmer farmer5 = new Farmer("Nayan", (long) 879546213);
        Farmer farmer6 = new Farmer("Vikash", (long) 9987451000);
        try {
            wholeSaler1.addFarmer(farmer1);
            wholeSaler1.addFarmer(farmer2);
            wholeSaler1.addFarmer(farmer3);
            wholeSaler1.addFarmer(farmer4);
            wholeSaler1.addFarmer(farmer5);
            wholeSaler1.addFarmer(farmer6);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }

        System.out.println("List of Farmers");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n Farmer name: %s and Phone number: %s", f.getName(), f.getContact());
        }

    }

}
