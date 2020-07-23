#include <iostream>
#include <math.h>
using namespace std;

int main(void){

    int A,B,C = 0;
    int result = 0;
    cin >> A;
    cin >> B;
    cin >> C;
    int array[10]={0,};//배열을 모두 0으로 초기화
    result = A * B * C;

    for(int i=0; result>0;i++){
        //배열의 번호를 숫자로 남은 나머지 숫자로해서 그 값을 1씩증가
        result=result/10;
        array[result%10]++;
    } //배열에 숫자 하나하나 넣었음
    
    for(int i=0; i<10; i++){
        cout<<array[i]<<endl;
    }//값출력
    return 0;  
}