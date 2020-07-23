#include <iostream>
using namespace std;
//백준 10871번
int main(void){
    
    int size;
    int x;
    cin>>size;
    cin>>x;
    int* array = new int [size];
    for (int i = 0; i < size; i++){
        cin>>array[i];
    }
    for(int b =0; b< size; b++){
        if(array[b]<x)
            cout<<array[b]<<" ";
    

    
    delete[] array;
    
    
    return 0;
}