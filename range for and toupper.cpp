#include<iostream>  
#include<string>  
#include<cctype>             // toupper
using namespace std;    
int main()  
{  
    string str("abC def");  
    // range for
    for(auto &c : str)  
    {  
        c = toupper(c);  
    }  
    cout << str << endl;  
    return 0;  
}
