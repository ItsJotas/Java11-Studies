package session1;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
public class TestImportStatic {

    public static void main(String[] args){
        Integer radius = 2;

        Double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        Double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}
