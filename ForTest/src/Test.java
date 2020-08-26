public class Test {
    final static int A = Integer.MAX_VALUE;

    public int sum(int a, int b) {
        return a + b;
    }

    public int sumNew(int a, int b) {
        a = Integer.MAX_VALUE;
        b = 1;
        return a + b;
    }

}
