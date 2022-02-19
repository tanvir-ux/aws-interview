#include <iostream>
using namespace std;

int main() {
    int var;
    int *ptr;
    int val;
    var = 3000;
    ptr = &var;
    val = *ptr;
    cout << "memory address of var: " << &var << endl;
    cout << "value of pointer ptr: " << ptr << endl;
    cout << "Value of pointer at *ptr :" << *ptr << endl;
    cout << "Value of variable 'val' : " << val <<endl; 
}