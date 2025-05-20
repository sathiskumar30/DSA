public class bothInverted {

    public static void NormalPyramid(int a) {

        System.out.println("Came inside");

        for (int i = 0; i < a; i++) { // This loop for no of rows...

            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println(" ");

        }

    }

    static void InvertedPyramid(int a) {

        for (int i = 0; i < a; i++) { // This loop for no of rows...

            for (int j = 0; j < i; j++) {

                System.out.print(" ");

            }

            for (int k = 0; k < 2*a-(2 * i + 1); k++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {

                System.out.print(" ");

            }

            System.out.println(" ");

        }

    }

    public static void main(String[] args) {

        int num = 3;
        NormalPyramid(num);
        InvertedPyramid(num);

    }
}
