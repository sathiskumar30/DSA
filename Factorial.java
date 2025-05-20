
class Factorial {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6 , 7, 8, 9 };
        int target = 6;

        for (int num : numbers) {
            // if (num == target) {
            //     System.out.println("This is the target" + " " + num);
            //     break;
            // }
            if(num % 2 == 0){
                continue;
            }
            System.out.println(num);
        }

    }



}