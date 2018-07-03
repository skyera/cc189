#include <iostream>
using namespace std;

int fib(int n) {
    if (n <= 0) return 0;
    else if (n == 1) return 1;
    return fib(n - 1) + fib(n - 2);
}

int fib2(int n, int memo[]) {
    if (n <= 0) return 0;
    else if (n == 1) return 1;
    else if (memo[n] > 0) return memo[n];

    memo[n] = fib2(n - 1, memo) + fib2(n - 2, memo);
    return memo[n];
}

int main() {
    int n = 10;
    int result = fib(n);
    cout << "fib(" << n << ")=" << result << "\n";

    return 0;
}
