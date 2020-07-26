#include <iostream> //병합 정렬 , 힙 정렬 사용 추천 
#include <algorithm> //내장함수를 사용하려고 함.
using namespace std;

void heapify(int A[],int n,int k){ //Top-Down,Bottom-up 방식중 하나를 선택한다. 
//정렬이 아직 제대로 이루어지지 않음 다시 .
    while(2*k+1<n){
        int L=2*k+1;
        int R=2*k+2;
        int m=k;
        if(A[m]>A[L]){
            m=L;
        }
        if(R<n&&A[m]>A[R]){
            m=R;
        }
        if(k!=m){
            swap(A[k],A[m]);
        }
        else 
            break;
    } //정수 나눗셈,소수점이하는 0처리된다.
}
void swap(int a,int b){ //a와 b의 깂 교환
    int temp=a;
    a=b;
    b=temp;
}
void make_heap(int A[],int n){
    for(int k=n-1;k>=0;k--){
        heapify(A,n,k);
    }
}

int main(void){

    int N;
    cin>>N;
    int array[N];
    for(int i=0;i<N;i++){
        cin>>array[i];
    } // 배열에 대한 입력

    for(int i=0;i<N;i++){
        make_heap(array,i);
        heapify(array,i,N);
    }


    for(int i=0;i<N;i++){ //정렬이 완료된 이후 값 출력
        cout<<array[i]<<endl;
    }
    return 0;
}