#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int n, i, j, **a;
	cout << "Input rows of Yang Hui triangle:";
	cin >> n;
	a=new int*[n];
	for(i=0;i<n;i++)
	a[i]=new int[i+1];
	a[0][0] = 1;
	for (i = 1;i < n;i++)
	{
		a[i][0] = 1;
		a[i][i] = 1;
		for (j = 1;j < i;j++)
			a[i][j] = a[i-1][j - 1] + a[i - 1][j];
	}
	for (i = 0; i < n;i++)
	{
		for (j = 0;j < n-i-1;j++)
		{
			cout << setw(2) << ' ';
		}
		for (j = 0;j <= i;j++)
			cout << setw(2) << a[i][j]<<setw(2)<<' ';
		cout << '\n';
	}
	for(i=0;i<n;i++)
	delete []a[i];
	delete []a;
	system("pause");
}
