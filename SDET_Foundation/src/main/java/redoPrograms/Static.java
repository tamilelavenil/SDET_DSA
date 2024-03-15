package redoPrograms;

public class Static {
	  // Static variable
	int staticVariable=42;

    // Static block
    public  static void one(){
    	Static abc = new Static();
        
        System.out.println("This is a static variable"+abc.staticVariable);
        
        
        // Perform one-time initialization tasks
  
    }
    


    public static void main(String[] args) {
       // staticVariable = 52;
    	Static abc = new Static();
    	abc.one();
       // System.out.println("Static Variable: " + staticVariable);

        // You can perform other operations in the main method
        // ...
    }

}
