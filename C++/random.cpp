#include<iostream>
#include<ctime>
#include<cstdlib>
using namespace std;
int main()
{
    int number[10],i;
    cout<<"before srand:";
    for(i=0;i<10;i++)
    {
        number[i]=rand();
        cout<<number[i]<<" ";
    }
    cout<<endl
    <<"after srand:";
    srand((int)time(NULL));      //set seed
    for(i=0;i<10;i++)
    {
        number[i]=rand();
        cout<<number[i]<<" ";
    }
    cout<<"\n";
    system("pause");
    return 0;
}
/*Five times output:
before srand:41 18467 6334 26500 19169 15724 11478 29358 26962 24464
after srand:3446 23641 23467 1141 5578 32484 27577 28284 1374 12906
before srand:41 18467 6334 26500 19169 15724 11478 29358 26962 24464
after srand:3462 11847 14484 23153 24382 19350 10371 13648 18396 14934
before srand:41 18467 6334 26500 19169 15724 11478 29358 26962 24464
after srand:3534 18936 14279 28258 21927 7434 13309 14783 21203 10749
before srand:41 18467 6334 26500 19169 15724 11478 29358 26962 24464
after srand:4413 26673 2846 13226 11268 15148 31359 13779 6372 28086
before srand:41 18467 6334 26500 19169 15724 11478 29358 26962 24464
after srand:4393 27719 26733 32686 14916 24356 12684 31342 5607 32207
*/