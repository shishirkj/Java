public class Main {
    public static void main(String[] args){

        System.out.println("Start");
        printNum(1,5);
        System.out.println("Finish");

    }               // Debugging with breakpoints , step into , step onto , step out , etc concepts abt Debug
                    // Debugging helps fix runtime errors that are difficult to find
    public static void printNum(int start , int finish){
        for(int i = start; i<=finish;i++){
            System.out.println(i);
        }
    }
}

// Types of error - Compile time error and Run time error