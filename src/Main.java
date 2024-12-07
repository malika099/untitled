import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       /* int[] array = {2,8,3,3,4,4,9,19};
        System.out.print("Минимальный элемент: ");
        System.out.println(min(array));
        System.out.print("Максимальный элемент: ");
        System.out.println(max(array));
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

         }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;*/

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



