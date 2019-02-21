package JavaNull;

import java.util.Scanner;

public class Friendly {
    public static void main(String[] args)   {
        System.out.println(dividers(144));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start point of diapason :");
        int first = scanner.nextInt();

        System.out.println("Enter finish of diapason :");
        int last = scanner.nextInt();

        if(first > last){
            System.out.println("Incorrect input");
        }else {
            System.out.println("Friendly pairs:");
            int memory = 0;
            while (first < last){
                int sum1 = dividers(first);
                int sum2 = dividers(sum1);
                if (sum2 == first & first != sum1 & memory != sum2) {
                        System.out.println(first + " " + sum1);
                        memory = sum1;
                }
                first++;
            }
        }
    }

    private static int dividers(int n){
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (n / i != i) {
                    sum += n / i;
               }
            }
        }
        return sum;
    }

}
