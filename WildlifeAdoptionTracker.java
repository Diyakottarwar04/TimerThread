// Problem Statement
// In a wildlife reserve, animals are adopted by donors.
// You need to build a system to:
// ✅ Store animalID → adopterName using a TreeMap<Integer, String>
// ✅ Insert at least 5 sample entries
// ✅ Display all animals sorted by their ID
// ✅ If adopter name is “null” or blank, throw InvalidAdopterException
// ✅Print total  umber of adoptions

import java.util.*;
public class WildlifeAdoptionTracker{
    public static void main(String[] args) {
        // Create a TreeMap to store animalID and adopterName
        TreeMap<Integer, String> adoptionMap = new TreeMap<>();

        // Add 5 sample entries
        addAnimal(adoptionMap, 101, "Ravi");
        addAnimal(adoptionMap, 102, "Aisha");
        addAnimal(adoptionMap, 103, "");         // Invalid
        addAnimal(adoptionMap, 104, "Meera");
        addAnimal(adoptionMap, 105, null);       // Invalid

        // Print all valid animals in sorted order
        System.out.println("Adopted Animals:");
        for (Map.Entry<Integer, String> entry : adoptionMap.entrySet()) {
            System.out.println("Animal ID: " + entry.getKey() + " → Adopter Name: " + entry.getValue());
        }
    }
    public static void addAnimal(TreeMap<Integer, String> map, int animalID, String adopterName) {
        if (adopterName == null || adopterName.trim().equals("")) {
            System.out.println("Warning: Invalid adopter name for Animal ID " + animalID);
        } else {
            map.put(animalID, adopterName);
        }
    }
}