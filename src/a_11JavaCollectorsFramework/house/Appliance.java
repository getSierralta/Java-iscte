package a_11JavaCollectorsFramework.house;

public class Appliance {
    /**
     * Fields of our appliance
     */
    private final String type;
    private final String brand;
    private final float power;

    /**
     * Constructor
     * @param type of appliance
     * @param brand maker of the appliance
     * @param power electrical power of the appliance
     */
    public Appliance(String type, String brand, float power) {
        this.type = type;
        this.brand = brand;
        this.power = power;
    }

    /**
     * Getters
     * @return different fields of our appliance
     */
    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }

    public float getPower() {
        return power;
    }

    /**
     *
     * @return the information of our appliance
     */

    @Override
    public String toString() {
        return getType()+" |\tBrand: "+getBrand()+" |\tPower: "+getPower();
    }

}
