import java.util.Scanner;

public class Tasks {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void multiplyTable() {
        int multliplySum = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                multliplySum = j * i;
                if (multliplySum < 10) {
                    System.out.print("0" + j * i + " | ");
                } else {
                    System.out.print(j * i + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void bank() {
        System.out.print("Enter the sum: ");
        float deposit = in.nextFloat();
        System.out.print("Enter the quantity of month: ");
        int month = in.nextInt();
        for (int i = 0; i < month; i++) {
            deposit += deposit * 0.07;
        }
        System.out.printf("The sum of deposit after %d month = %f", month, deposit);
    }

    public static void sequenceFibonacci() {
        int[] sequence = new int[10];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i < sequence.length; i++) {
            for (int j = i - 2; j < i; j++) {
                sequence[i] += sequence[j];
            }
            System.out.print(sequence[i] + " ");
        }
    }

    public static void sqrt() {
        for (int i = 10; i <= 20; i++) {
            System.out.printf("%d^2 = " + i * i + "\n", i);
        }
    }

    public static void negativeSequence() {
        for (int i = 0; i > -50; i -= 5) {
            System.out.print(i + " ");
        }
    }

    public static void sequenceSeven() {
        int i = 7;
        while (i < 100) {
            System.out.print(i + " ");
            i += 7;
        }
    }

    public static void sum() {
        System.out.print("Enter the bound = ");
        int bound = in.nextInt();
        int result = 0;
        for (int i = 1; i <= bound; i++) {
            result += i;
        }
        System.out.printf("The sum from 1 to %d = %d ", bound, result);
        in.close();
    }

    public static void countReverse() {
        System.out.print("Enter the start number = ");
        int start = in.nextInt();
        System.out.print("Reverse count: ");
        for (int i = start; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }

    public static void oddNumbers() {
        System.out.print("Enter the bound = ");
        int bound = in.nextInt();
        System.out.print("Odd numbers: ");
        for (int i = 0; i <= bound; i++) {
            System.out.print(i % 2 != 0 ? i + ", " : "");
        }
    }

    public static void rainbow() {
        System.out.print("Enter the number of rainbow line = ");
        int number = in.nextInt();
        switch (number) {
            case 1: {
                System.out.println("Red");
                break;
            }
            case 2: {
                System.out.println("Orange");
                break;
            }
            case 3: {
                System.out.println("Yellow");
                break;
            }
            case 4: {
                System.out.println("Green");
                break;
            }
            case 5: {
                System.out.println("Sky blue");
                break;
            }
            case 6: {
                System.out.println("Blue");
                break;
            }
            case 7: {
                System.out.println("Purple");
                break;
            }
            default: {
                System.out.println("Not a color");
                break;
            }
        }
    }

    public static void temp() {
        System.out.print("Enter the temperature = ");
        int temp = in.nextInt();
        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("Normal");
        } else if (temp <= -20) {
            System.out.println("Cold");
        }
    }

    public static void evenOdd() {
        System.out.print("Enter the number = ");
        int number = in.nextInt();
        System.out.println(number % 2 == 0 ? number + " - even" : number + " - odd");
    }

    public static void seasonsIfElse() {
        System.out.print("Enter the month = ");
        int month = in.nextInt();
        if (month > 0 && month < 3 || month == 12) {
            System.out.println("Winter");
        } else if (month > 2 && month < 6) {
            System.out.println("Spring");
        } else if (month > 5 && month < 9) {
            System.out.println("Summer");
        } else if (month > 8 && month < 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Not a month");
        }
    }

    public static void seasonsSwitch() {
        System.out.print("Enter the month = ");
        int month = in.nextInt();
        switch (month) {
            case 1, 2, 12: {
                System.out.println("Winter");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Spring");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Summer");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Autumn");
                break;
            }
            default: {
                System.out.println("Not a month");
                break;
            }
        }
    }
}
