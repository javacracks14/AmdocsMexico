public class OperatorsDemo
{
    public static void main(String[] args)
    {
        int number=1;
        System.out.println("Value of Number is: "+number);
        System.out.println("Increment Operation: "+(number++)); // Post Increment
        System.out.println("Value of Number After Increment is: "+number);
        System.out.println();
        System.out.println("Value of Number is: "+number);
        System.out.println("Increment Operation: "+(++number)); // Pre Increment
        System.out.println("Value of Number After Increment is: "+number);
        System.out.println();
        System.out.println("Value of Number is: "+number);
        System.out.println("Decrement Operation: "+(number--)); // Post Decrement
        System.out.println("Value of Number After Decrement is: "+number);
        System.out.println();
        System.out.println("Value of Number is: "+number);
        System.out.println("Decrement Operation: "+(--number)); // Pre Decrement
        System.out.println("Value of Number is: "+number);


        int number1=10, number2=8, number3=8;
        System.out.println("Logical And Operator Value is: "+(number1>number2 && number1==number3));
        System.out.println("Logical OR Operator Value is: "+(number1<number2 || number1==number3));
        System.out.println("Logical Not Operator Value is: "+(number1>number2 && number1!=number3));

        System.out.println("Comparison for Greater Than: "+(number1>number2));
        System.out.println("Comparison for Greater Than Equal To: "+(number1>=number2));
        System.out.println("Comparison for Less Than: "+(number1<number2));
        System.out.println("Comparison for Less Than Equal To: "+(number1<=number2));
        System.out.println("Comparison for Equal Than: "+(number1==number2));
        System.out.println("Comparison for Not Equal Than: "+(number1!=number2));

    }
}
