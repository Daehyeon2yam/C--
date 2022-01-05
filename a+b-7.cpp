#include <iostream>

using namespace std;

int main(){

    int size;
    cin>>size;
    int a,b;
    int* array= new int [size];

    for(int i = 0; i<size; i++){
        cin>>a;
        cin>>b;
        array[i]=a+b;
        
    }
    for(int c = 0; c< size; c ++){
        cout<<"Case #"<<c+1<<": "<<array[c]<<endl;
    }
    delete [] array;
    return 0;
}