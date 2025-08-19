public class IterativeDemo {
    public static void main(String[] args) {
        // For Loop
        for(int i=1; i<=10; i++) {
            System.out.println("Hello Java Developers");
        }
        
        // While Loop
        int j=1;
        while(j<=7) {
            System.out.println("Hello Java Developers");
            j++;
        }

        // Do-While Loop
        int k=1;
        do {
            System.out.println("Hello Java Developers");
        } while(k<=7);

        for(int row=1; row<=5; row++){
            for(int col=1; col<=5; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
