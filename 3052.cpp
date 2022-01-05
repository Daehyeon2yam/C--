#include <iostream>

using namespace std;

int main(void){
   int num;
   int count=0;
   int array[42]={0,};
   for(int i=0;i<10;i++){
       cin>>num;
       array[num%42]++;//42로나눈 나머지의 값을 배열에 저장
       if(array[num%42]==1){ //1이면 그건다른거니까 그떄 1씩 카운트
           count++;
       }
   }
    cout<<count<<endl;
    return 0;
}