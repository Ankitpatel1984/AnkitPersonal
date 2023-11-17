package ankitpersonal;

public class TwoMethod {
   static void myMethod1() {
       System.out.println("My First Car");
       System.out.println("My Family");
   }
       void myMethod2(){
           System.out.println("My Second  Car");
           System.out.println("My Home");

       }
       public static void main(String[] args) {
       myMethod1();
       TwoMethod obj = new TwoMethod();
       obj.myMethod2();

    }

}

