#include <iostream>
using namespace std;

void swap(int& x, int& y);

int main() {
    int a = 100;
    int b = 200;
    cout << "Before swap a: " << a << endl;
    cout << "Before swap b: " << b << endl;
    swap(a,b);
    cout << "After swap a: " << a << endl;
    cout << "After swap b: " << b << endl;
    return 0;
}

void swap(int& x, int& y) {
    int temp = x;
    x = y;
    y = temp;
    return;
}