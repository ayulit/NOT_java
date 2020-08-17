public class ArrSumOfTwoElems {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = new int[7];
        System.out.print("Массив => ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (max < arr[i]) {
                max = arr[i];
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Элемент с индексом: " + i + " равен: " + arr[i]);
        }

        System.out.println("Максимальное значение равно: " + max
                + " и его при сложении дают элементы: ");

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] + arr[k] == max && i != k) {
                    System.out.println("с индексом " + i + " и индексом " + k);
                }
            }
        }
    }
}
