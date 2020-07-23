#include <iostream>

using namespace std;

int main(void){

    int N;
    cin>>N; //분해합
    int result=1000000;
    for(int i=0;i<N;i++){
        int m=0;
        int j=i;
        while(j!=0){  
            m=m+j%10;
            j=j/10;       
        }
        m=m+i;// 요놈자식의 문제 N ->10 ,m -> 11
        if(m==N){
           if(result>m){
               result=i;
               cout<<i<<endl;
               break;
           }
       }
       if(i==N-1){
           cout<<0<<endl;
       }
       
       
    }
    return 0;
}