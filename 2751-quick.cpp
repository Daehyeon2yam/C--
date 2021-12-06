#include <iostream>
using namespace std;

//퀵 정렬, 피벗을정해 기준 피벗보다 작은수는 왼쪽 , 큰수는 오른쪽으로 몰아 넣는다, 그다음 새로 피벗정해서 다시 정렬의 반복

// 피벗을 맨 오른쪽으로 두고 i는 0, j는 피벗 바로 전까지
int arr[1000001];
void quick_sort(int first, int end){
    int i=first;
    int j=end-1;
    int p=end;
    while(i<j){ //비교를하고 i,j가 같아질떄 피벗과 스왑하고, 그다음에 퀵소트를 또부른다. 만일 피벗보다 작거나 크거나하면 그때 i,j는 그대로 유지한다.
        if(arr[i]<p&&arr[j]>p){
            i++;
            j--;
        }
        if(arr[i]<p){
            i++;
        }
        if(arr[j]>p){
            j--;
        }
        if(arr[i]>p&&arr[j]<p){
            int tmp;
            tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++,j--;
        }
        if(i==j){
            arr[i]=arr[p];
            int tmp;
            tmp=i;
            j=p;
            p=tmp;

        }
    }
    quick_sort(0,i);//반으로 나눈거 왼쪽부분
    quick_sort(j,p);//반으로 나눈거 오른쪽부분
    
}

int main(){
    int N;
    cin>>N;
    for(int i=0;i<N;i++){
        cin>>arr[i];
    }
    quick_sort(0,N-1);
    for(int i=0;i<N;i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}