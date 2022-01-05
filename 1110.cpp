#include <iostream>

using namespace std;

int main(void){

    int N;
    int count =0;
    int temp= 0;
    int num1,num2,num3;
    cin>>N;
    temp = N;
    while(true){
        num1=temp/10;
        num2=temp%10;
        num3=num1+num2;
        if(num3>=10){
            num3=num3%10;
        }
        temp= num2 * 10 + num3;
        ++count;

        if(N==temp){
            break;
        }
    }
    cout<<count<<endl;
    return 0;
}