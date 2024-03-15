package redoPrograms;

import java.time.Instant;

public class SberBank {

    public class Hello {
        public void print1() {
            System.out.println("print statement1");
        }
    }

    public class Hello1 extends Hello {
        public void print2() {
            System.out.println("print statement2");
        }
    }

    public class Hello2 extends Hello {
        public void print3() {
            System.out.println("print statement3");
        }
    }

    public static void main(String[] args) {
    	
    	int sum =0;
    	//0+3+6+9=18
    	for(int i=0; i<10; i+=3) {
    		sum+=i;
    	}
    	System.out.println(sum);
    	
    	
        SberBank sber = new SberBank();

        Hello hello = sber.new Hello();
        Hello hello1 = sber.new Hello1();
        Hello hello2 = sber.new Hello2();

        // Usage examples
        hello.print1();
        hello1.print2();
        hello2.print3();
    }
}
	


