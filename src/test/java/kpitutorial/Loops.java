package kpitutorial;

public class Loops {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[3] = "Posad";
        friends[18] = "Hillary";
        friends[19] = "Natasha";
        int totalElements = friends.length;
        for (int i = 0; i < totalElements; i++) {
            System.out.println("Total elem of index " + i + "=" + friends[i]);
        }
    }
}
