#include <iostream>

using namespace std;

int main(void){

    int A,B,V;
    cin>>A>>B>>V;
    int day=0;
    day=(V-B-1)/(A-B)+1;
    cout<<day<<endl;
    return 0;
}