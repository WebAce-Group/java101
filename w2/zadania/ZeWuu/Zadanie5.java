import java.net.Inet6Address;
import java.util.Scanner;
public class Zadanie5 {
    public static void main (String[] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj n:");
        n=scanner.nextInt();

        for(int i=1;i<=n;i++) System.out.println(i);
        System.out.println();
        for(int i=n;i>=1;i--) System.out.println(i);
        System.out.println();
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0) System.out.println(i);
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            if((i%3==0 && i%5!=0)||(i%3!=0 && i%5==0)) System.out.println(i);
        }

    }
}