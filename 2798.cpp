#include <iostream>

using namespace std;


int main(void){

    int n,m; 
    cin>>n>>m;
    int a[100];
    int result=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=i+2;k<n;k++){
                int sum= a[i]+a[j]+a[k];
               if((sum<=m)&&(m-sum)<m-result){
                   result=sum;
               }
            }
        }
    }
    //어떻게 하나하나 다 저장할까?
    cout<<result<<endl;
    return 0;
}