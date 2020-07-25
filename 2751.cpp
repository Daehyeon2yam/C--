#include <iostream> //병합 정렬 , 힙 정렬 사용 추천 
#include <algorithm> //내장함수를 사용하려고 함.
using namespace std;

void mergesort(){


}

int main(void){

    int N;
    cin>>N;
    int array[N];
    for(int i=0;i<N;i++){
        cin>>array[i];
    } // 배열에 대한 입력



    for(int i=0;i<N;i++){
        cout<<array[i]<<endl;
    }
    return 0;
}