package ankitpersonal;

public class MethodOverloading {
    static int myMethod(int a, int b){
        return a+b;

    }
    static boolean myMethod(boolean a, boolean b){
        return a;
    }

    public static void main(String[] args) {
        myMethod(10,20);
        myMethod(true, false);
        System.out.println(myMethod(10,20));
        System.out.println(myMethod(true,false));
    }


}
