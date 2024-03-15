package redoPrograms;

import java.io.IOException;

class Animal {
    public void eat() throws InterruptedException,IOException {
        System.out.println("Animal is eating");
        Thread.sleep(1000);
    }
    public Animal() {
    	
    }
}


