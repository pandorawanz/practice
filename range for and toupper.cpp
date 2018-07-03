#include<iostream>  
#include<string>  
#include<cctype>             // toupper
using namespace std;    
int main()  
{  
    string str("some string");  
    // range for
    for(auto &c : str)  
    {  
        c = toupper(c);  
    }  
    cout << str << endl;  
    return 0;  
}