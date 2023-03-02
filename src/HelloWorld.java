import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("type your name please!");
        String name = scnr.nextLine();

        System.out.println("hello " + name);
    }
}
