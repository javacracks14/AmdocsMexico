public class BranchingDemo {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if (i==5){
                break; // terminate your loop
            }
            if (i==5){
                continue; // skip the current iteration
            }
            System.out.println("Hello Java Developers");
        }
    }
}
