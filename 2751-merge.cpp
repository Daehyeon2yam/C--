#include <iostream>

using namespace std;
int *stored;
int N,arr[1000001];
void merge_sort(int left,int right){
    int mid=(left+right)/2; //mid값을 준다.
    int i=left;
    int j=mid+1;
    int k=left;
    while(i<=mid && j<=right){
        
        if(arr[i] <= arr[j]){
            stored[k++]=arr[i++];
        }
        else
            stored[k++]=arr[j++];
    }
    int tmp= i>mid ? j : i; //참이면 j 거짓이면 i를 반환한다.
    while(k<=right){

        stored[k++]=arr[tmp++];
    }
    for(int i=left;i<=right;i++){
        arr[i]=stored[i];
    }
}
void partion(int left, int right){
    int mid;
    if(left<right){
        mid=(left+right)/2;
        partion(left,mid); 
        partion(mid+1,right);
        merge_sort(left,right);
    }
}
int main(void){
    scanf("%d",&N);
    stored= new int[N];
    for(int i=0;i<N;i++){
        scanf("%d",&arr[i]);
    }
    partion(0,N-1); //각각 일일히 분할
    for(int i=0;i<N;i++){
        printf("%d\n",arr[i]);
    }//정렬된 배열 출력
    return 0;
}