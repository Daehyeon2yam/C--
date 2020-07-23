#include <iostream>

using namespace std;

int main(void){

    int a;
    int i,j=0;
    int *c=0;
    cin >>a;

    i= a%10;
    j= a/10;
    c=&((i*10)+((i+j)%10));
    cout<<i<<endl;
    cout<<j<<endl;
    cout<<c<<endl;
    i=a%10;
    j=a/10;
    cout<<i<<endl;
    cout<<j<<endl;
    return 0;
}
