
package abstraction;

abstract class Animal{
    abstract void run();
}
class dog extends Animal{
    void run(){
        System.out.println("dog run");
    }
}
public class Abstraction {

    
    public static void main(String[] args) {
        dog d=new dog();
        d.run();
        Animal a=new Animal();//compile erro because abstract class can't create object
    }
    
}
