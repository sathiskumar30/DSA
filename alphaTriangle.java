public class alphaTriangle {
    
    public static void main(String[] args) {
        
        int n = 3;

        for ( int i = 0 ; i < n ; i++){

            for ( char ch = (char)('A' + n - 1) ; ch >= (char)('A' + n - i - 1 )  ; ch--){

                System.out.print(ch);

            }

            System.out.println(" ");

        }

    }

}


// C
// B C
// A B C