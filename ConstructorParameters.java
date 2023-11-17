package ankitpersonal;

import javax.naming.Name;
import java.time.Year;

public class ConstructorParameters {
    int ModelYear;
    String ModelName;
    ConstructorParameters(int ModelYear, String Name){
        ModelYear= 2020;
        ModelName=Name;

    }

    public static void main(String[] args) {
        ConstructorParameters obj = new ConstructorParameters(2020,"Golf");
        System.out.println(obj.ModelYear+" "+obj.ModelName);
    }

}
