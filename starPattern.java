import java.text.NumberFormat.Style;

public class starPattern {

    // public static void main(String[] args) {

    // int num = 5;

    // for (int i = 0; i < num; i++) { // First For loop

    // for (int j = 0; j < num - i - 1; j++) {

    // System.out.print(" ");

    // }

    // for (int k = 0; k < 2 * i + 1; k++) {

    // System.out.print("*");

    // }

    // for (int j = 0; j < num - i - 1; j++) {

    // System.out.print(" ");

    // }

    // System.out.println(" ");

    // }

    // }

    public static void main(String[] args) {

        int num = 5;

        for (int i = 0; i < num; i++) { // First For loop

            for (int j = 0; j < i; j++) {

                System.out.print(" ");

            }

            for (int k = 0; k < 2 * num - (2 * i + 1); k++) {

                System.out.print("*");

            }

            for (int j = 0; j < i - 1; j++) {

                System.out.print(" ");

            }

            System.out.println(" ");

        }

    }

}
