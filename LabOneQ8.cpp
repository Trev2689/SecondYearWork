// Program to check if leap year
//Trevor Doyle C00170053

#include <iostream>
#include <cstdlib>
using namespace std;


int main()
{
	int year;

	cout << "Please enter year to be checked ";
	cin >> year;

	if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0))
	{
		cout << year << " is a leap year";
	}
	else {
		cout << year << " is not a leap year ";
	}
}

