// 7/1/2018
#include <iostream>
using namespace std;

int factorial(int n) {
    if (n < 0) {
        return -1;
    } else if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}


int main() {
    int n = 6;
    int result = factorial(n);

    cout << "factorial(" << n << ")=" << result << "\n";

    return 0;
}
