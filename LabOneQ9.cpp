// Program to generate multiplication table
//Trevor Doyle C00170053

#include <iostream>
using namespace std;

int main()
{
	int multiplier;

	cout << "Enter number for multiplication table: ";
	cin >> multiplier;

	for (int i = 1; i <= 12; ++i) {
		cout <<  "\n" << multiplier << " * " << i << " = " << multiplier*i << "\n ";
	}

	return 0;
}
