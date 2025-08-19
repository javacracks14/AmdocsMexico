public class firstClass {
    public static void main(String[] args)
    {
        int number1=10, number2=8, output;
        output = number1 + number2;
        System.out.println("Addition Output is: "+output);
        output = number1 - number2;
        System.out.println("Subtraction Output is: "+output);
        output = number1 * number2;
        System.out.println("Multiplication Output is: "+output);
        output = number1 / number2;
        System.out.println("Division Output is: "+output);
        output = number1 % number2;
        System.out.println("Modulus Output is: "+output);
        
        number1++; // post increment, the next name its called it will be changed
        ++number2; // pre increment, the change will appear before calling again
        System.out.println(number1>number2?"number1 is greater":"number2 is greater");

        
        int number3=10, number4=8;
        System.out.println("number3 Value is: "+number3+"\tnumber4 Value is: "+number4);
        number3=number4;
        number3-=number4;
        number3*=number4;
        number4/=number3;
        // number3=number3+number4
        System.out.println("number3 Value is: "+number3+"\tnumber4 Value is: "+number4);
    }
}
