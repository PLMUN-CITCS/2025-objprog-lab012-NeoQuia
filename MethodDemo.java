public class MethodDemo {
    public static void main(String[] args) {
         greet(); // Calling the greet method
         printMessage("This is my Message!");
        
    }

    //Greet Method
    public static void greet() {
            System.out.println("Hello from the greet method!"); 
     }

    //print Message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}