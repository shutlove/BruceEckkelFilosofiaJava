/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 09.01.14
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */

//: control/WhileTest java
// Пример использования цикла while

public class WhileTest

{
        static boolean condition()
        {
            boolean result = Math.random() < 0.99;
            System.out.print(result + ". ");
            return result;
        }
        public static void main(String[] args)
        {
            while(condition())
                System.out.println("Inside 'while'");
                        System.out.println("Exited 'while'");
        }
} /* (Выполните, чтобы просмотреть результат) *///~