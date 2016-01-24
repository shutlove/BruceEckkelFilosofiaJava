/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 18.02.14
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 // operators/MathOps.java
 // Демонстрация математических операций
 */
import java.util.*;

public class MathOps {
    public static void main (String[] args)
    {
        // создание и раскрутка генератора случайных чисел
        Random rand = new Random(47);
        int i, j, k;
        // выбор значения от 1 до 100
        j = rand.nextInt(100)+1;
        System.out.println("j : " + j);
        k = rand.nextInt(100)+1;
        System.out.println("k : " + k);
        i = j+k;
        System.out.println("j+k : " + i);
        i = j-k;
        System.out.println("j-k : " + i);
        System.out.println("j-k : " + i);
        System.out.println("j-k : " + i);
        i = j/k;
        System.out.println("j/k : " + i);
        i = j*k;
        System.out.println("j*k : " + i);
        i = j%k;
        System.out.println("j%k : " + i);


        //nicht fertig


    }
}
