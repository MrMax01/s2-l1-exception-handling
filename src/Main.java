import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index=-1;
        boolean flag= true;
        int numChoise;
        int[] randomArr = new int[5];
        int randomNumber;
        for (int i = 0; i < randomArr.length; i++) {
            randomNumber= (int)(Math.random()*10+1);
            randomArr[i]=randomNumber;
        }

        while(flag) {
             numChoise= askNumber(in);
            if(numChoise==0) break;
            System.out.println("in che posizione vuoi inserire il numero? posizioni da  1 a" + randomArr.length);
            while(true){
                try {

                    index = Integer.parseInt(in.nextLine());
                    if (index == 0) {
                        flag=false;
                        break;
                    } else {
                        index--;
                        randomArr[index] = numChoise;
                        stampaArrInt(randomArr);
                        break;
                    }

                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("sei uscito dall'array inseire una posizione da 1 a " + randomArr.length);

                } catch (Exception ex) {
                    System.out.println("Non sono accettate stringhe, inserire un numero intero da 1 a" + randomArr.length);
                }
            }


        }
    }

    public static int askNumber(Scanner in){
        int num;

            System.out.println("Inserire un numero intero....");
            try{
                num = Integer.parseInt(in.nextLine());
                return num;
            }catch(Exception ex){
                System.out.println("il numero inserito non è un intero");
                return askNumber(in);
            }

    }

    public static void stampaArrInt(int [] a){
        for (int numb: a) {
            System.out.printf(numb+",");
        }
        System.out.println("");
    }
}




