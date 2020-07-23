#include <iostream>
using namespace std;

struct Point{
    int xpos;
    int ypos;

    void MovePos(int x, int y){
        xpos+=x;
        ypos+=y;
        return;
    }
    void AddPoint(const Point &pos){

        xpos+=pos.xpos;
        ypos+=pos.ypos;
        return;

    }
    void ShowPosition(){
        cout<<"x의좌표"<<xpos<<endl;
        cout<<"y의좌표"<<ypos<<endl;

    }
};

int main(void){

    Point pos1 = {12,4};
    Point pos2 = {20,30};

    pos1.MovePos(-7,10);
    pos1.ShowPosition(); //[5,14]출력

    pos1.AddPoint(pos2); //[25,44]출력
    pos1.ShowPosition();
    return 0;
}