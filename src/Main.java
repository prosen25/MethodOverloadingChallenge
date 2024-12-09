//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Height in centimeters = " + convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters (int heightInInches) {

        return heightInInches * 2.54;
    }

    public static double convertToCentimeters (int heightInFeet, int heightInInches) {

        return convertToCentimeters((heightInFeet * 12) + heightInInches);
    }
}