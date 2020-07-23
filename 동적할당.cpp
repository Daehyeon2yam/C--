#include <iostream>

using namespace std;

int main(void){

    int *point = new int;

    *point = 100;

    cout << *point<<"\n";
    
    delete point;

    return 0;
}