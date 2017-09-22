import java.util.Scanner;

public class Homework4 {

/* 1
    public static void main(String[] args) {
        int x = 10;
        int count=x;
        {
        for (int i=1;i <= x;i++){
        System.out.println(i + "\n");
        }
        }
        }
*/

/* 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Высота прямоугольника::");
        int a = sc.nextInt();
        System.out.println("Ширина прямоугольника:");
        int b = sc.nextInt();

        String[][] sqr = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sqr[i][j] = "X";
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(sqr[i][j]);
            }
            System.out.println();
        }
    }

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

/* 6
   static String drawRectangle(int width, int height, char c) {
        String result = "";
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += c;
            }
            result += line + "\n";
        }
        return result;}

   public static void main(String[] args) {
        System.out.println(drawRectangle(3, 5, '+'));
    }

*/

    }









