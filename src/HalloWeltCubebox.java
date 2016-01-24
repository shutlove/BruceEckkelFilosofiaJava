/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 21.02.14
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class HalloWeltCubebox {

    public static void main(String[] args){

        System.out.println("Hallo. Wie heißt du?");
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.printf("Hallo %s. Wie alt bist du?%n", name);
        int age = new java.util.Scanner(System.in).nextInt();

        System.out.println("%s? Hast du auch eine Lieblingskommazahl?"/*,age*/);
        double value =  new java.util.Scanner(System.in).nextDouble();
        System.out.printf("%s? Meine ist %s.", value, Math.random()*10000);


        // fertig?
    }
}
