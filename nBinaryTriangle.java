public class nBinaryTriangle {
    
    public static void main(String[] args) {

        // int n = 4;
        // int start = 1;
        
        //  for ( int i = 0 ; i <= n ; i++){

        //     if(i %2== 0) start = 1;
        //     else start = 0; 

        //     for ( int j = 0 ; j <= i ; j++ ){

        //         System.out.print(start);
        //         start = 1 - start;
                
        //     }

        //     System.out.println( " " );

        
        // }

        // int num = 5;

        // for ( int i = 1 ; i < num ; i++){

        //     int spaces = 2*num - 2*i;

        //     for( int j = 1 ; j <= i ; j++ ){ //First Number

        //         System.out.print(j);

        //     }

        //     for( int k = 1 ; k < spaces ; k++){

        //         System.out.print(" ");

        //     }

        //      for( int j = i ; j >= 1 ; j-- ){ //First Number

        //         System.out.print(j);

        //     }

        //     System.out.println(" ");

            // for( ) //Spaces

            // for( ) //Second Number


            int n = 5;

            for ( int i = 0;i < n ; i++){

                for( char ch = 'A' ; ch < 'A' + n- i - 1 ; ch++){

                    System.out.print(ch);

                }

                System.out.println(" ");;

            }

            // int start = 1;

            // for ( int i = 1 ; i <= n ; i++){

            //     for ( int j = i ; j > 0 ; j--){

            //         System.out.print(start);
            //         start = start + 1;

            //     }

            //     System.out.println(" ");

            // }

        // }

    }
}
