#include <iostream>

using namespace std;

int main(void){

    int N;
    int a=0;
    int i,j,k;//왼쪽수,오른쪽수
    int count=0;
    cin>>N;
    a=N;
    while(true){
    
        i=a/10;
        j=a%10;
        k=i+j;
        if(k>=10){
            k=k%10;
        }
        a=j*10+k;
        ++count;
        if(N==a){
            break;
        }
    }
    cout<<count<<endl;
    return 0;
}