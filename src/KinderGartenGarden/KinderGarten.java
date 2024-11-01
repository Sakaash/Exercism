package KinderGartenGarden;

import java.util.HashMap;

enum Plants {
    Violets, Radishes, Clover, Grass;

    static String getPlants(char code){
        switch (code) {
            case 'G':
                return Grass.toString();
            case 'C':
                return Clover.toString();
            case 'R':
                return Radishes.toString();
            case 'V':
                return Violets.toString();
        }
        return null;
    }
}

public class KinderGarten {
    static HashMap<String, Integer> map;
    static{
        map = new HashMap<>();
        map.put("Alice", 0);
        map.put("Bob", 1);
        map.put("Charlie", 2);
        map.put("David", 3);
        map.put("Eve", 4);
        map.put("Fred", 5);
        map.put("Ginny",6);
        map.put("Harriet", 7);
        map.put("Ileana", 8);
        map.put("Joseph", 9);
        map.put("Kincaid", 10);
        map.put("Larry", 11);
    }
    private String[] plantedPlants = new String[2];

    KinderGarten(String[] plants) {
        for (int i = 0; i < plants.length; i++) {
            plantedPlants[i] = plants[i];
        }
    }

    public String findThePlants(String studentName) {
        String row1Plant1 = "";
        String row1Plant2 = "";
        String row2Plant1 = "";
        String row2Plant2 = "";

        int index = map.get(studentName) * 2;

        row1Plant1 = Plants.getPlants(plantedPlants[0].charAt(index));
        row1Plant2 = Plants.getPlants(plantedPlants[0].charAt(index+1));
        row2Plant1 = Plants.getPlants(plantedPlants[1].charAt(index));
        row2Plant2 = Plants.getPlants(plantedPlants[1].charAt(index+1));


        return row1Plant1+", "+row1Plant2+", "+row2Plant1+", "+row2Plant2;
    } 
}
