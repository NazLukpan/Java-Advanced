public class HW5 {

    public static void add(int a, int b){
        System.out.println("a + b = " + a + b);
    }

    public static void sub(int a, int b){
        System.out.println("a - b = " + (a - b));
    }

    public static void mult(int a, int b){
        System.out.println("a * b = " + a * b);
    }

    public static void div(int a, int b){
        System.out.println("a / b = " + a / b);
    }
    public static void task(int number){
        System.out.println("Task" + number);
    }

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        i = i * 2;
        return i;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower2 % 2 == 0 && flower1% 2 != 0) ||  (flower1 % 2 == 0 && flower2% 2 != 0);
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        String num1 = Integer.toString(num);
        return num1;
    }

    public static int findSmallestInt(int[] args) {
        int array[] = {34, 15, 88, 2};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

//    public static String countingSheep(int num) {
//        //Add your code here
//        String result = "";
//        for (int i = 1; i <= num; num++) {
//            result += i = " sheep";
//        }
//        return result;
//    }



    public static void main(String[] args) {

        task(1);

        add(6,4);
        sub(6,4);
        mult(6,4);
        div(6,4);

        task(2);
        doubleInteger(5);

        isLove(5,6);
        isLove(6,6);

        numberToString(5);

        //        int num = 3;
//        for (int i = 0; i <= num; num++) {
//
//        System.out.println(num + " sheep");}
//
//        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            if ()
//                break;
//        }









    }

}
