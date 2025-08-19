import java.util.Scanner;

public class NestedIf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the Number: ");
        number = sc.nextInt();
        if(number>0) // Outer If
        {
            if(number==0) // Inner If or Nested If
            {
                System.out.println("Number is neither positive nor negative");
            }
            else
            {
                System.out.println("Positive Number");
            }
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}
