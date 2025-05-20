public class symmetricVoid {

    public static void main(String[] args) {

        int n = 3;
        int spaces = 0;
        int anotherSpaces = 2*n - 2;

        for ( int i = 0 ; i < n ; i++){


            for ( int j = 0 ; j < n - i ; j++){

                System.out.print("*");

            }

            for ( int k = 0 ; k < spaces ; k++){

                System.out.print(" ");

            }


             for ( int j = 0 ; j < n - i ; j++){

                System.out.print("*");

            }
            spaces+=2;
            System.out.println("");

        }


        for ( int i = 0 ; i < n ; i++){


            for ( int j = 0 ; j <= i ; j++){

                System.out.print("*");

            }

            for ( int k = 0 ; k < anotherSpaces ; k++){

                System.out.print(" ");

            }


             for ( int j = 0 ; j <= i ; j++){

                System.out.print("*");

            }
            anotherSpaces-=2;
            System.out.println("");

        }


    }

}
