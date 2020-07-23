#include <iostream>

using namespace std;


int main(void){

    int A,B,C;
    cin>>A>>B>>C;
    int D = C-B;
    int result;
    if(D<=0)
        result=-1;
    else if(D>0)
        result = (A/D)+1;
    
    cout<<result<<endl;
    return 0;
}