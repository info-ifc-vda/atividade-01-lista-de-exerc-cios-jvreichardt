import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int i = num;
        if(num==0)
        {
            System.out.println("1");
        }
        else
        {
            while(i>1)
            {
                num*=(i-1);
                i-=1;
            }
            System.out.println(num);
        }
    }
}
