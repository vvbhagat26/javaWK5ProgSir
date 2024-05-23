import java.util.ArrayList;

public class Prog7UnderGroundTubeNames {
    /**
     * Write a Java program to test an array list is empty or not. Define array list with underground tube names
     */
    public static void main(String[] args) {
        Prog7UnderGroundTubeNames obj = new Prog7UnderGroundTubeNames();
        obj.isEmpty();
    }

    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_lines");
        tubeNames.add("Central_lines");
        tubeNames.add("Circle_lines");
        tubeNames.add("District_lines");
        tubeNames.add("Hammersmith_and_City_line");
        tubeNames.add("Jubilee_line");
        tubeNames.add("Metropolitan_line");
        tubeNames.add("Northern_line");
        tubeNames.add("Piccadilly_line");
        tubeNames.add("Victoria_line");
        tubeNames.add("Waterloo_and_City_line");
        System.out.println("Given Array List : " + tubeNames);
        if (tubeNames.isEmpty()) {
            System.out.println("Given Array List is Empty!!");
        } else {
            System.out.println("Given Array List is not Empty!!");
        }
    }
}
