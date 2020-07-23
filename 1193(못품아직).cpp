#include <iostream>

using namespace std;

int main(void){

    long n;
    cin>>n;
    long m=1;
    int count=1;
    int parent=1;
    int child=1;
    int sum=1;
    while(n>1){
        m=m+1;
        n=n-m;
        count++;
    }  //대각선끼리의 합 
    //홀수면 위로 짝수면 아래로 
    sum=sum+count;
    if(sum%2)
        child=sum-1;
    else
        parent=sum-1;
    

    while(1){
        //어떻게할지 고민
    }
    if(count%2!=0){
        for(int i=1;i<count;i++){
            cout<<i<<"/"<<count<<endl;
        }

    }
    else if(count%2==0){
        for(int i=0;i<count;i++){
            cout<<count<<"/"<<i+1<<endl;
        }
    }
    return 0;
}