import java.util.Scanner;

public class PreWorkAssignment {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        int Number = Num.nextInt();
        switch (Number) {
            case 0:
                System.out.println("Enter the number to check for palindrome bruh");
                int n = Num.nextInt();
                int Enterednumber = n;
                int reverse = 0;
                while (n > 0) {
                    int r = n % 10;
                    reverse = reverse * 10 + r;
                    n = n / 10;
                }
                if (reverse == Enterednumber) {
                    System.out.println("The entered number is a Palindrome");
                } else
                    System.out.println("The entered number is not a Palindrome");
                break;
            case 1:
                System.out.println("Enter the number to check if it is a prime number or not");
                int myPrimenumber = Num.nextInt();
                int Hi = 0;
                if (myPrimenumber == 0 || myPrimenumber == 1) {
                    System.out.println("The number entered is not a prime number");
                } else {
                    for (int i = 2; i < myPrimenumber; i++) {
                        if (myPrimenumber % i == 0) {
                            System.out.println("The number entered is not a prime number");
                            Hi=1;
                            break;
                        }
                    }
                    if(Hi==0){
                        System.out.println("The number entered is a prime number");
                    }
                }
            case 2:
                System.out.println("Pattern of stars");
                int p = Num.nextInt();
                for(int i=p;i>0;i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3: {
                System.out.println("Printing Fibonacci Series");
                int Fibonaccicount=Num.nextInt();
                int n1,n2,n3;
                n1 = 0;n2 = 1;
                System.out.print(n1+",");
                System.out.print(n2);
                for(int i=0;i<Fibonaccicount-2;i++){
                    n3 = n1 + n2;
                    System.out.print(","+n3);
                    n1 = n2;
                    n2 = n3;
                }
                break;
            }
            default:
                System.out.println("Invalid choice. Enter a valid no.\n");
        }
    }
}
