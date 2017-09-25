import java.util.Scanner;

import static java.lang.System.*;

public class Homework4 {
    public static void main(String[] args) {

        drawRectangle();
        drawRectangleOneSize(3, '+');
        function();
        getMax(15, 8);
        recursion(10);
        System.out.println(recursion(10));
        drawRectRecursion(5, 4);
    }

    public static void function() {
        int x = 3;
        int count = x;
        {
            for (int i = 1; i <= x; i++) {
                System.out.println(i + "\n");
            }
        }
    }

    public static void drawRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Высота прямоугольника:");
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


    static void drawRectangleOneSize(int width, char c) {
        String result = "";
        for (int i = 0; i < width; i++) {
            String line = "";
            for (int j = 0; j < width; j++)
                line += c;
            result += line + "\n";
        }
        System.out.print(result);
    }


    public static void Getmax(String[] args) {
        getMax(15, 8);
    }

    static int getMax(int a, int b) {
        if (a > b) {
            System.out.println(a + " Больше");
            return a;
        }
        if (a < b) {
            System.out.println(b + " Больше");
            return b;
        }
        if (a == b)
            return a;
        return a;
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + "" + n;
    }
    public static void drawRectRecursion(int w, int h){
        if (h == 0) return;
        drawRow(w);
        drawRectRecursion(w, h - 1);
    }

    public static void drawRow(int w){
        if(w == 0) {
            System.out.print("\n");
            return;
        }
        System.out.print("+ ");
        drawRow(w - 1);
    }
    }



















