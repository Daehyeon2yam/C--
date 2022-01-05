#include <iostream>

using namespace std;

int main(void){

    int N;
    cin>>N; //N개의 경우 입력
    int array[N];
    for(int i=0;i<N;i++){
        cin>>array[i];

    }
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(array[i]<array[j]){
                int temp=0;
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
        }
    }
}
    for(int i=0;i<N;i++){
        cout<<array[i]<<endl;
    }
    return 0;
}