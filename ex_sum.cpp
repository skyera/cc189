// 7/2/2018
#include <iostream>

using namespace std;


int sum(int n) {
    cout << "sum(" << n << ")\n";
    if (n <= 0) {
        return 0;
    }
    return n + sum(n-1);
}

int main()
{
    int result = sum(4);
    cout << "result:" << result << "\n";
    return 0;
}

