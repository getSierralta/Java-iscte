package A_11JavaCollectorsFramework.House;



public class Main {

    public static void main(String[] args) {

        //We create a house
        House house = new House();
        //We create appliances
        Appliance dvd = new Appliance("DVD", "Sony", 200);
        Appliance radio = new Appliance("Radio", "Sony", 200);
        Appliance tv = new Appliance("TV", "Samsung", 500);
        Appliance freezer = new Appliance("Freezer", "LG", 300);

        //We add the appliances to our house
        house.addAppliance("Living Room", dvd);
        house.addAppliance("Living Room", tv);
        house.addAppliance("Living Room",radio);
        house.addAppliance("Kitchen", freezer);

        //We print our house
        System.out.println(house);

        //We Remove some brands from our living room and kitchen and print the house to see the process of elimination
        house.removeBrandFromDivision("Living Room","Sony");
        System.out.println(house);
        house.removeBrandFromDivision("Living Room","Samsung");
        System.out.println(house);
        house.removeBrandFromDivision("Kitchen","LG");
        //Finally our house is empty again
        System.out.println(house);

    }
}
