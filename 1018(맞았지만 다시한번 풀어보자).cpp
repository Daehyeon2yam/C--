#include <iostream>
#include <algorithm>
#include <string>
using namespace std;
const int MAX=50;
int N,M;
string chess[MAX];
string whitefirst[8]={
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"}
};
string blackfirst[8]={
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"},
    {"BWBWBWBW"},
    {"WBWBWBWB"}
};
int blackchange(int x,int y){

    for(int i=x;x)
}


int main(void){

    cin>>N>>M; //N,M을 입력받는다.

    int cnt=0;//바꿔야할 값 
    for(int i=0; i<N; i++){
        cin>>chess[i];
    }//chess값 입력






    return 0;
}
