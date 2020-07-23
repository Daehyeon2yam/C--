#include <iostream>

using namespace std;

int main(void){

    int array[9];
    int max=0;
    int count=0;
    for(int i =0; i<9; i++){
        cin>>array[i];
        if(array[i]>max){
            max=array[i];
            count=i+1;
        }
    }
    cout<<max<<endl;
    cout<<count<<endl;

    return 0;
}