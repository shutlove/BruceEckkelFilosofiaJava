/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 18.02.14
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 * operators/PassObject java
 * Передача объектов методам может работать и так
 */

//import static net.mindview.util.Print.*;
//import java.lang.String;
//import


class Letter {
    char c;
}

public class PassObject
{
    static void f(Letter y)
    {
        y.c = "z";
    }
    public static void main(String[] args)
    {
        Letter x = new Letter();
        x.c = "a";
        System.out.println("1: x.c" + x.c);
        f(x);
        System.out.println("2: x.c" + x.c);
    }
}

// ошибка в коде
