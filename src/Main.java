import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static HashMap<Integer, Long> cache = new HashMap<Integer, Long>();

    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }else {
            long fib = fibonacci(n - 1) + fibonacci(n - 2);
            cache.put(n, fib);
            return fib;
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            long fib = fibonacci(i);
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Fib i = " + i + "=" + fib) ;




        }
    }
}