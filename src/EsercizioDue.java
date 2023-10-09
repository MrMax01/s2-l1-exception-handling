import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double km;
        double l;
        km = askKm(in);
        l= askL(in);

        System.out.println(km/l);
    }

    public static double askKm(Scanner in){
        int num;

        System.out.println("Inserire Km percorsi....");
        try{
            num = Integer.parseInt(in.nextLine());
            return num;
        }catch(Exception ex){
            System.out.println("Non hai inserito un numero");
            return askKm(in);
        }

    }
    public static double askL(Scanner in){
        double num;
        double test=1;

        System.out.println("Inserire litri consumati....");
        try{
            num = Integer.parseInt(in.nextLine());
            test= test/num;
            return num;
        }catch(ArithmeticException ex){
            System.out.println("Non puoi dividere per 0");
            return askL(in);

        }
        catch(Exception ex){
            System.out.println("Non hai inserito un numero");
            return askL(in);
        }

    }

}
