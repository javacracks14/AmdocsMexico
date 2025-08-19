import java.util.Scanner;

public class DecisionControlDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int time;
        System.out.print("Enter the Time: ");
        time = sc.nextInt();
        if(time>=9 && time<11 || time>11 && time<13 || time>=14 && time<16 || time>16 && time<18)
        {
            System.out.println("Welcome to Java Amdocs Session");
        }
        else if(time==11 || time==16)
        {
            System.out.println("15 Minutes Tea Break");
        }
        else if(time==13)
        {
            System.out.println("Lunch Break");
        }
        else if(time>=18 && time<24)
        {
            System.out.println("Session is Ended. We will start it next day");
        }
        else if(time>0 && time<9)
        {
            System.out.println("Yet to Start the Session. Please wait till 9:00AM");
        }
        else
        {
            System.out.println("Invalid Time...");
        }

    }
}
