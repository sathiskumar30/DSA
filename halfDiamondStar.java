public class halfDiamondStar {


    static void firsthalf(int input){

        for ( int i = 0 ; i < input ; i++){ //Outer loop for no of rows..

            for ( int j = 0 ; j < i ; j++){ //Inner loop for no of colums...

                System.out.print( "*");

            }

            System.out.println(" ");

        }

    }

    static void secondhalf(int input){

        for ( int i = 0 ; i < input ; i++){ //OuterLoop for no of rows

            for ( int j = input ; j > i ; j--){

                System.out.print("*");

            }

            System.out.println( " ");

        }

    }
    
    public static void main(String[] args) {

        // int num = 6;
        // firsthalf(num);
        // secondhalf(num);

        int num = 10;

        for ( int i = 0 ; i <= num * 2 - 1 ; i++){ //Now because of half diamond , we are making this , * 2 and Minus 1

            int stars = i;

            if( i > num) stars = 2 * num - i;

            for ( int j = 0 ; j < stars ; j++){
                
                System.out.print("*");

            }

            System.out.println( " ");

        }

    }

}
