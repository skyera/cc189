// 7/1/2018
#include <iostream>
using namespace std;

bool is_prime(int n) {
    for (int x = 2; x * x <= n; x++) {
        if ( n % x == 0) {
            return false;
        }
    }

    return true;
}

int main() {
    int n = 33;
    bool prime = is_prime(n);
    cout << "is_prime(" << n << ")" << prime << "\n";

    return 0;
}
