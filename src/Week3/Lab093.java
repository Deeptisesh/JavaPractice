package Week3;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day in num");
        String browser=sc.nextLine();
        browser=browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("chrome");
            case "firefox":
                System.out.println("FF");
            case "edge":
                System.out.println("Edge");
        }
    }
}
