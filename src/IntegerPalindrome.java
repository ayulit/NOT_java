import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        ArrayInt arint = new ArrayInt();
        while (true) {
            System.out.println("Число палиндром? - " + arint.isPalindrome(ArrayInt.arrFilled()));
        }
    }
}

class ArrayInt {

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int number = scanner.nextInt();

        return number;
    }

    public static int[] array(int input) {
        int count = 0;
        while (input > 0) {
            input = input / 10;
            count++;
        }
        return new int[count];
    }

    public static int[] arrFilled() {
        int i;
        int tmp = getInt();
        int[] arrayTmp = array(tmp);
        for (i = 0; i < arrayTmp.length; i++) {
            arrayTmp[i] = tmp % 10;
            tmp /= 10;
        }

        return arrayTmp;
    }

    public boolean isPalindrome(int[] arr) {
        boolean ispal = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                ispal = false;
                break;
            }
        }
        return ispal;
    }
}
class Scratch {
    public static void main(String[] args)  {
        try {
            throw new NotFoundTomatException("Хрень");

        } catch (NotFoundTomatException e){
            System.out.println("Caught " + e.getMessage());

        }
    }
}
class NotFoundTomatException extends Exception{

    public NotFoundTomatException(String aaa) {
        super(aaa);
    }
}
