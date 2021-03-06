import java.util.Scanner;

public class _1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the length from the center to a vertex: ");
            double r = in.nextDouble();
            double pi = Math.PI / 5;
            double s = 2 * r * (Math.sin(pi));
            double square = (5 * Math.pow(s, 2)) / (4 * Math.tan(pi));
            System.out.println("The area of the pentagon is " + square);
        }
        finally{
            in.close();
        }
    }
}