public class butterfly {

    public static void main(String[] args) {

        int n = 5;
        int stars = 0;
        int spaces;

        for (int i = 0; i < 2 * n - 1; i++) {

            if (i < n)
                stars = i + 1;
            else
                stars = 2 * n - i - 1;

            for (int k = 0; k < stars; k++) {

                System.out.print("*");

            }

            System.out.println(" ");

        }

    }

}
