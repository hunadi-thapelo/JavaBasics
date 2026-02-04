package collectionsAPI;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

    public static void main (String[] args) {

        LinkedHashMap<String, Integer> soccerPlayers = new LinkedHashMap<String, Integer>();

        soccerPlayers.put("C.Ronaldo", 7);
        soccerPlayers.put("Messi", 33);
        soccerPlayers.put("S.Tshabalala", 14);

        System.out.println(soccerPlayers);
        System.out.println(soccerPlayers.get("Messi"));






    }
}
