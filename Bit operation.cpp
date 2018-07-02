#include <iostream>
using namespace std;
int main()
{
   unsigned short int a = 60;      // 60 = 0011 1100  
   unsigned short int b = 13;      // 13 = 0000 1101
   int c = 0;           
   c = a & b;             // 12 = 0000 1100
   cout << "&:" << c << endl;
   c = a | b;             // 61 = 0011 1101
   cout << "|:" << c << endl;
   c = a ^ b;             // 49 = 0011 0001
   cout << "^:" << c << endl;
   c = ~a;                // -61 = 1100 0011
   cout << "~:" << c << endl;
   c = a << 2;            // 240 = 1111 0000
   cout << "<<2:" << c << endl;
   c = a << 3;            // 480 = 0001 1110 0000
   cout << "<<3:" << c << endl;
   c = a << 4;            // 960 = 0011 1100 0000
   cout << "<<4:" << c << endl;
   c = a << 5;            // 1920 = 0111 1000 0000
   cout << "<<5:" << c << endl;
   c = a << 6;            // 3840 = 1111 0000 0000
   cout << "<<6:" << c << endl;
   c = a << 7;            // 7680 = 0001 1110 0000 0000
   cout << "<<7:" << c << endl;
   c = a << 8;            // 15360= 0011 1100 0000 0000
   cout << "<<8:" << c << endl;
   c = a << 9;            // 30720 = 0111 1000 0000 0000
   cout << "<<9:" << c << endl;
   c = a << 10;            // 61440 = 1111 0000 0000 0000
   cout << "<<10:" << c << endl;
   c = a << 11;            // 122880 = 0001 1110 0000 0000 0000
   cout << "<<11:" << c << endl;
   c = a >> 2;            // 15 = 0000 1111
   cout << ">>2: " << c << endl ;
   return 0;
}