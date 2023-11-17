package ankitpersonal;

public class NonStaticMethod {
    void myMethod(){
        System.out.println("My Project");
    }

    public static void main(String[] args) {
        NonStaticMethod obj = new NonStaticMethod();
        obj. myMethod();

    }
}
