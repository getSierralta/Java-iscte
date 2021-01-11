package aula11JavaCollectors.House;


import java.util.*;

public class House {
    //We create a hash map for the different divisions of the house to hold appliances
    //the key being the division
    Map<String, List<Appliance>> divisions = new HashMap<>();

    /**
     * add and appliance to a division in the house
     * @param division the name of the division in the house
     * @param appliance the object appliance that we want to add to that division
     */
    public void addAppliance(String division, Appliance appliance) {

        List<Appliance> appliances = this.divisions.get(division); // get the list of appliances in the division
        if (appliances == null) { //We check if that division already exist
            appliances  = new ArrayList<>();//if it doesn't exist we create a new list to add ours appliances to
            divisions.put(division, appliances); //we add the appliance to the division hash map we have in the house
            //using the division name as the key oof the hashmap
        }
        appliances.add(appliance);
        //if the division already exist we simple add the appliance to the list that uses the division as a key

    }

    /**
     * it will remove all the appliances from a certain brand from a certain division
     * @param division the division from where you want to remove the appliance from
     * @param brand the brand of the appliances you want to remove
     */
    public void removeBrandFromDivision(String division, String brand){
        List<Appliance> appliances = this.divisions.get(division);
        appliances.removeIf(appliance -> appliance.getBrand().equals(brand));

    }

    /**
     *
     * @return all the divisions and appliances from a house
     */
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for(String division : divisions.keySet()) {
            ret.append(division).append(":\n");
            for(Appliance appliance : divisions.get(division)) {
                ret.append("\t").append(appliance).append("\n");
            }
        }
        return ret.toString();
    }
}
