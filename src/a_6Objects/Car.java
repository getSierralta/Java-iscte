package a_6Objects;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

public class Car {

    private final String maker;
    private final String model;
    private final int sits;
    private String registration;
    private int monthOfRegistration;
    private int dayOfRegistration;
    private int yearOfRegistration;
    private final double consumptionPerK;
    private double gasTankStatus;
    private final double gasTank;
    private boolean flag;
    private Person owner;



    public Car(String maker,String model, int sits,double consumption100Km, double gasTank){
        this.maker = maker;
        this.model = model;
        this.sits = sits;
        this.consumptionPerK = (consumption100Km/100);
        this.gasTank = gasTank;

    }

    /**
     *
     * @return All the information of the registration of the vehicle
     */
    public String getRegistration(){
        return  "\nRegistration: " +registration+
                "\nRegistered by: "+owner.getLastName()+" "+owner.getFirstName()+"."+
                "\nOn the "+dayOfRegistration+", "+monthOfRegistration+" of "+ yearOfRegistration +".\n";
    }

    /**
     *
     * @return how much gas does the car has at the moment
     */
    public String getGasTankStatus(){
        NumberFormat format = NumberFormat.getInstance();
        format.setRoundingMode(RoundingMode.DOWN);
        format.setMaximumFractionDigits(2);
        return format.format(gasTankStatus);
    }

    /**
     * sets all the information of the registration
     * @param day of registration
     * @param month of registration
     * @param year of registration
     * @param registration of registration
     * @param person owner of the car
     */
    public void registerCar(int day, int month, int year, String registration, Person person){
        this.dayOfRegistration = day;
        this.monthOfRegistration = month;
        this.yearOfRegistration = year;
        this.registration = registration;
        this.owner = person;

    }

    /**
     *
     * @param liters the amount of gas to be filled
     * @return whether it filled the gas or not and the status of the gas tank
     */
    public String fillGas(double liters){
        if (gasTankStatus + liters <= gasTank){
            gasTankStatus = gasTankStatus + liters;
            return "Gas status: " + getGasTankStatus();
        }else{
            this.gasTankStatus = this.gasTank;
            return "Gas tank overflow."+"\nGas status: "+getGasTankStatus();
        }

    }

    /**
     *
     * @param kilometers the amount of kilometers you wish your car to run
     */
    public void run(double kilometers) {
        for(int i = 0; i <= kilometers; i++){
            if (gasTankStatus > 0){
                System.out.println("Running......");
                try {
                    TimeUnit.SECONDS.sleep( 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.gasTankStatus = gasTankStatus - consumptionPerK;
                this.flag = true;
            }else{
                System.out.println("Not enough gas!");
                break;
            }
        }
        this.flag = false;
        System.out.println("Stopped.");

    }

    /**
     *
     * @return if the car is running or not
     */
    public String isRunning(){
        if (flag){
            return "The car is running.";
        }
        return "The car is not running.";
    }

    @Override
    public String toString() {
        return owner+"'s car {" +
                "maker ='" + maker + '\'' +
                ", model ='" + model + '\'' +
                ", sits =" + sits +
                ", consumption100Km =" + consumptionPerK*100 +
                "}";
    }

    public static void main(String[] args) {
        Person maria = new Person("Maria","Silva",28);
        Car beetle = new Car("Volkswagen","Beetle",4,9.45, 54.9);
        beetle.registerCar(22,10,2020,"AA-01-AA",maria);

        //We create two theads one the runs the car and another that checks if the car is running
        Thread thread1 = new Thread(() -> {
            System.out.println(beetle.getRegistration());
            beetle.run(10);
            System.out.println(beetle.fillGas(10));
            beetle.run(5);
            System.out.println(beetle.fillGas(55));
            beetle.run(3);
            beetle.run(5);
        });

        Thread thread2 = new Thread(() -> {
            System.out.println(beetle.isRunning());
            try {
                System.out.println(beetle.isRunning());
                TimeUnit.SECONDS.sleep( 2);
                System.out.println(beetle.isRunning());
                TimeUnit.SECONDS.sleep( 7);
                System.out.println(beetle.isRunning());
                TimeUnit.SECONDS.sleep( 3);
                System.out.println(beetle.isRunning());
                TimeUnit.SECONDS.sleep( 5);
                System.out.println(beetle.isRunning());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
