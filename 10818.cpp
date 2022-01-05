#include <iostream>

using namespace std;

int main(void){

    int size;

    cin>>size;

    int max,min=0;
    int * array = new int[size];

    for(int i =0 ; i<size; i++){
        cin>>array[i];   
    }
    max=array[0];
    min=array[0];
    for(int c=0;c<size;c++){
        if(array[c]>max)
            max=array[c];
        if(array[c]<min)
            min=array[c];
    }
    cout<<min<<endl;
    cout<<max<<endl;
    delete[] array; 
    return 0;
}