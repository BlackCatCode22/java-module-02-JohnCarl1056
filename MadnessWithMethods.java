//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MadnessWithMethods {
    public static void main(String[] args) {
        String name = "John";
        int age = 20;

        hello(name,age);
    }
    static void hello(String name,int age){
        System.out.println("Hello "+name+" "+age);
    }
}