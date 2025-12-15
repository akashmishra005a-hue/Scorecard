package SplashScreen;
import java. util.Scanner;
public class FrontPage {
    public static void teamName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first team name ");
        String tname1 = sc.nextLine();
        System.out.println("Enter your first team name ");
        String tname2 = sc.nextLine();
        System.out.println("Secoand team is "+tname1);
        System.out.println("Secaond  team is "+tname2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Scoring area");
        System.out.println("enter your team name  ");
        teamName();

    }
}
