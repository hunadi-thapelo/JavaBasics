package collectionsAPI;

import java.util.HashMap;

public class HashMapClass {

    public static void main (String[] args){

        //HashMap class implements Map interface
        //Use it to store key-value pairs

        HashMap<String, String> teamMembers = new HashMap<>();

        teamMembers.put("Product Owner", "Lizzy Jones");
        teamMembers.put("Technical BA", "Shehani Dovey");
        teamMembers.put("FrontEnd Developer", "Pete Miller");
        teamMembers.put("BackEnd Developer", "Steve Harvey");
        teamMembers.put("Product Designer", "James Bond Smith");
        teamMembers.put("QA Engineer", "Hunadi Naledi");
        teamMembers.put("Product Owner", "Soso Mudd"); //this updates the first ("Product Owner", "Lizzy Jones") input


        System.out.println(teamMembers); //HashMap class - fast and unordered
        System.out.println(teamMembers.get("Product Designer")); //returns value of the specified key
        System.out.println(teamMembers.keySet());




        //methods:
        /*
        .put()
        .get()
        .remove()
        .containsKeys()
        .keySets()
        * */

    }
}
