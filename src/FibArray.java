public class FibArray {
    private int[] fibArray;

    private int fib_(int n) {
        if (n<=1) return n;
        if (fibArray[n]==0) {
            fibArray[n]=fib_(n-1)+fib_(n-2);

        }
        return fibArray[n];

    }
}
