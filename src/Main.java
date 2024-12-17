import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sumnum = num+num2+num3;
        int sumbun2 = num*num2*num3;
        int sumnum3 = (num+num2+num3)/3;
        System.out.println(num+"+"+num2+"+"+num3+"="+sumnum);
        System.out.println(num+"*"+num2+"*"+num3+"="+sumbun2);
        System.out.println("("+num+"+"+num2+"+"+num3+")"+"/"+3+"="+sumnum3);
    }

    }



