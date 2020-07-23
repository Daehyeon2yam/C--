#include <iostream>

using namespace std;

int main(void){

    int N;
    cin>>N;
    int array[N][2];
    for(int i=0;i<N;i++){
        for(int j=0;j<2;j++){
            cin>>array[i][j];
        }
    }
    int rank[N];
    for(int i=0;i<N;i++){
        rank[i]=1;
    }
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(i==j){
                continue;
            }
            else if((array[i][0]<array[j][0])&&(array[i][1]<array[j][1])){
                rank[i]++;
        }
    }
}
    for(int i=0; i<N;i++){
        cout<<rank[i]<<" ";
    }
    return 0;
}