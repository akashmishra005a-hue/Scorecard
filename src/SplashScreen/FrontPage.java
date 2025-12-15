package SplashScreen;
import java. util.Scanner;
class CricketTeam
{
    String tname1;
    String tname2;

    public void tossWinnerName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of toss winner name ");
        String str = sc.nextLine();
        if(str.equalsIgnoreCase(tname1)||str.equalsIgnoreCase(tname2)){
            System.out.println("congartulation " +str + " win ");
            tossWinnerName();
        }
          else {
            System.out.println("something went wrong ");
            tossWinnerName();

        }

    }

    public  void teamName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first team name ");
        tname1 = sc.nextLine();
        System.out.println("Enter your secoand team name ");
        tname2 = sc.nextLine();
        System.out.println("first team is "+tname1);
        System.out.println("Secaond  team is "+tname2);
    }
}
public class FrontPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Scoring area");
        System.out.println("enter your team name  ");
        CricketTeam ct = new CricketTeam();
        ct.teamName();
      ct.tossWinnerName();

    }
}
