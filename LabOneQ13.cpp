// Program to check whether number is palindrome or not
//Trevor Doyle C00170053

#include <iostream>
using namespace std;

int main()
{
	int origNum;
	int remNum;
	int reverse = 0;
	int conditionInt;
	cout << "Enter number to be checked: ";
	cin >> origNum;

	conditionInt = origNum;

	while (origNum != 0)
	{
		remNum = origNum % 10;
		reverse = reverse * 10 + remNum;
		origNum = origNum / 10;
	}

	if (conditionInt == reverse)
	{
		cout << "The number is palindrome: ";
	}
	else {
		cout << " number is not palindrome";
	}
		
		


	return 0;
}