#include <iostream>
using namespace std;

int main(void){
    cout<<fixed;
    cout.precision(3);//소수점3자리로 고정시키겠다.
    int test;
    cin>>test;
    int *array =new int[test]; // array 배열 할당
    for(int i=0;i<test;i++){
        cin>>array[i]; //array[i]의 값입력
        int *score = new int[array[i]]; //
        double sum=0;
        double avg=0;
        double count=0;
        for(int j=0;j<array[i];j++){ //array[i]의 개수까지 점수입력
            cin>>score[j];
            sum=sum+score[j];

            //평균 값을 count해야함, count/array[i]*100이 %
            avg=sum/array[i];
            
        }
        for(int j=0;j<array[i];j++){
                if(score[j]>avg){
                    count++;
                }
            }
    
        cout<<(count/array[i])*100<<"%"<<endl;
        delete[] score;
        
    }
    delete[] array;
    return 0;
}