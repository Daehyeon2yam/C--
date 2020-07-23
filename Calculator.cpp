#include <iostream>
using namespace std;

class Calculator{
    
private:
    int numOfAdd;
    int numOfMin;
    int numOfMul;
    int numofDiv;

public:
    void Init();    
    double Add(double a, double b);
    double Div(double a, double b);
    double Min(double a, double b);
    double Mul(double a, double b);
    void ShowOpCount();
};

void Calculator::Init(){
    numofDiv=0;
    numOfAdd=0;
    numOfMin=0;
    numOfMul=0;
}
double Calculator::Add(double a, double b){
    numOfAdd++;
    return a+b;
}
double Calculator::Min(double a, double b){
    numOfMin++;
    return a-b;
}
double Calculator::Mul(double a, double b){
    numOfMul++;
    return a*b;

}
double Calculator::Div(double a, double b){
    numofDiv++;
    return a/b;
}
void Calculator::ShowOpCount(){
    cout<<"덧셈은"<<numOfAdd<<endl;
    cout<<"뺼셈은"<<numOfMin<<endl;
    cout<<"곱셈은"<<numOfMul<<endl;
    cout<<"나눗셈은"<<numofDiv<<endl;
}
int main(void){

    Calculator cal;
    cal.Init();
    cout<<"3.2 + 2.4 ="<<cal.Add(3.2,2.4)<<endl;
    cout<<"3.5 / 1.7 ="<<cal.Div(3.5,1.7)<<endl;
    cout<<"2.2 - 1.5 ="<<cal.Min(2.2,1.5)<<endl;
    cout<<"4.9 / 1.2 ="<<cal.Div(4.9,1.2)<<endl;
    cal.ShowOpCount();
    return 0;

}