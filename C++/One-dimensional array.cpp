#include<iostream>
using namespace std;
int main()
{
	int *a, n,i;
	cout << "The number of elements:";
	cin >> n;
	a = new int[n];
	cout << "Input in order:";
	for (i = 0; i < n;i++)
	{
		cin >> a[i];
	}
	cout << "Output in order:";
	for (i = 0;i < n;i++)
	{
		cout << a[i] << ' ';
	}
	delete[] a;
	system("pause");
}