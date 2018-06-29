#include<iostream>
using namespace std;
int main()
{
	long int a[30] = {1,1},i;
	for (i = 2;i < 30;i++)
	{
		a[i] = a[i - 1] + a[i - 2];
	}
	cout << "The front 30 elements of Fibonacci Array:" << "\n";
	for (i = 0;i < 30;i++)
	{
		cout << a[i] << ' ';
		if (i % 5 - 4 == 0)
			cout << '\n';
	}
	system("pause");
}
