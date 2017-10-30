// If a string gas all unique characters
// CCI 1.1 (90)
#include <iostream>
#include <string>
#include <cassert>

using namespace std;

bool isunqiue(const string &str) {
    if (str.size() > 128) return false;

    bool flag[128] = {false};
    for (int i = 0; i < str.size(); i++) {
        if (flag[str[i]]) return false;
        flag[str[i]] = true;
    }
    return true;
}

void test(const string &str, bool unique) {
    bool result = isunqiue(str);

    cout << str << ":" << result << endl;
    assert(result == unique);
}


int main()
{
    test("", true);
    test("a", true);
    test("ab", true);
    test("abc", true);
    test("aa", false);
    test("aaa", false);
    test("aba", false);
    test("abcdef", true);
    test("abcdaxf", false);
    return 0;
}
