//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MadnessWithMethods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        String name = "John";
        helloThere(name);


    }
    static void helloThere(String name) {
        System.out.println("Hello there" + name);
    }
}