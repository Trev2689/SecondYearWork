// Program to check whether number is prime or not
//Trevor Doyle C00170053

#include <iostream>
using namespace std;


int main()
{
	int origNum;
	int index;
	bool primeCheck = true;
	
	cout << "Enter number to be checked: ";
	cin >> origNum;

	for (index = 2; index <= origNum / 2; index++)
	{
		if (origNum % index == 0)
		{
			primeCheck = false;
			break;
		}
	}
	if (primeCheck)
	{
		cout << origNum << " is a prime number ";
	}
	else
	{
		cout << origNum << " is not a prime number ";
	}

	
	



	return 0;
}
