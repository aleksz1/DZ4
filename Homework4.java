public class Homework4 {

    /* 2
        static String drawRectangle(int width, int height, char c) {
        String result = "";
        for (int i = 0; i < height; i++) {
        String line = "";
        for (int j = 0; j < width; j++) {
        line += c;
        }
        result += line + "\n";
        }
        return result;

        public static void main(String[] args) {
        System.out.println(drawRectangle(3, 5, '+'));
   */

/* 3
        static String drawRectangle(int width, char c){
        String result = "";
        for (int i = 0; i < width; i++) {
        String line = "";
        for (int j = 0; j < width; j++)
        line += c;
        }
        result += line + "\n";
        }
        return result;
        }

        public static void main(String[] args) {
        System.out.println(drawRectangle(10, '+'));
        }
*/

    /* 4
    public static void main(String[] args) {
        getMax(15, 8);
    }
    static int getMax(int a, int b ){
        if(a>b) {
            System.out.println(a + " Больше");
            return a;
        }
        if (a<b) {
            System.out.println(b + " Больше");
            return b;
        }
        if(a==b)
            return a;
        return a;
    }
  */

    /* 5
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + "" + n;
    }
    public static void main(String[] args){
        System.out.println(recursion(20));
    }
   */




}













