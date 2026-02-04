package collectionsAPI;

import java.util.TreeMap;

public class TreeMapClass {

    public static void main (String[] args){

        TreeMap<String, String> devTeamMembers = new TreeMap<>();

        devTeamMembers.put("Product Owner", "Lizzy Jones");
        devTeamMembers.put("Technical BA", "Shehani Dovey");
        devTeamMembers.put("FrontEnd Developer", "Pete Miller");
        devTeamMembers.put("BackEnd Developer", "Steve Harvey");
        devTeamMembers.put("Product Designer", "James Bond Smith");
        devTeamMembers.put("QA Engineer", "Hunadi Naledi");

        System.out.println(devTeamMembers); //TreeMap class - returns ordered by key
        System.out.println(devTeamMembers.get("Product Designer")); //returns value of the specified key
        System.out.println(devTeamMembers.keySet());


    }
}
