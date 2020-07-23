#include <iostream>

using namespace std;

int main(void){

    int n;
    cin>>n;
    double max =0;
    double array[n];
    double sum = 0;
    for(int i =0;i<n;i++){
        cin>>array[i];
    }//배열에 값 입력
    for(int i=0;i<n;i++){
        if(array[i]>max)
            max=array[i];
    }
    for(int i=0;i<n;i++){
        array[i]=array[i]/max*100;

    }
    for(int i=0;i<n;i++){
        sum=sum+array[i];
    }
    cout<<sum/n<<endl;
    return 0;
}