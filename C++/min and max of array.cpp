#include<iostream>
using namespace std;
int main()
{
	int n, *a, i, min,max;
	cout << "Number of elements:";
	cin >> n;
	a = new int[n];
	cout << "Input in order:";
	for (i = 0;i < n;i++)
	{
		cin >> a[i];
	}
	min = max = a[0];
	for (int*p = a+1;p < a + n;p++)
	{
		if (min > *p) min = *p;
		if (max < *p) max = *p;
	}
	cout << "minimum:" << min << '\n'
		 << "maximum:" << max << '\n';
	delete[]a;
	system("pause");
}