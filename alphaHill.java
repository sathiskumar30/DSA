public class alphaHill {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");

            }

            for (char ch = 'A'; ch < 'A' + i + 1; ch++) {

                System.out.print(ch);

            }

            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {

                System.out.print(ch);

            }

            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");

            }

            System.out.println("");
        }

    }

}

// A
// A B A
// A B C B A