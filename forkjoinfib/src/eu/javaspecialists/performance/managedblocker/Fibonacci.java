package eu.javaspecialists.performance.managedblocker;

import java.math.*;
import java.util.*;
import java.util.concurrent.*;

public class Fibonacci {
    public BigInteger f(int n) {

        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        int half = (n + 1) / 2;

        BigInteger f0 = f(half - 1);
        return f(n-1).add(f(n-2));
    }
}
