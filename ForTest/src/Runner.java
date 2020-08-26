public class Runner {
    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.sum(12, 11));

        Test test1 = new Test();
        System.out.println(test.sum(Integer.MAX_VALUE, 1));

    }


}
