#include<iostream>
using namespace std;
int main()
{
	int i,j,n,sum=0;
	cout << "dimension of matrix:";
	cin >> n;
	cout << "input numbers of each line:" << '\n';
	int **a = new int*[n];
	for(i=0;i<n;i++)
	a[i]=new int[n];
	for (i = 0;i<n;i++)
	{
		for (j = 0;j < n;j++)
			cin >> a[i][j];
	}
	for (i = 0;i < n;i++)
	{
		sum += a[i][i];
		sum += a[i][n-i-1];
	}
	if (n % 2 == 1)
		sum -= a[(n - 1) / 2][(n - 1) / 2];
	cout << "the sum of numbers of diagonal:"<<sum << endl;
	for(i=0;i<n;i++)
	delete []a[i];
	delete []a;
	system("pause");
}