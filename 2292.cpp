#include <iostream>

using namespace std;

int main(void){

    long n;
    cin>>n;
    int count=1;
    long m =0;
    //1,2,8,20,38 ...등등으로 가는중
    //계차수열의 일반항 3n^2-3n+1

    while(n>1){ 

        m=m+6; //m이 6만큼증가 왜? 6 12 18 의 등차수열로 증가하니까
        n=n-m; //그만큼을 n에 빼준다.
        count++;

    }
    cout<<count<<endl;
    return 0;
}