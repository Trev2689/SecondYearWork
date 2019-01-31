//Program to convert binary to decimal/decimal to binary
//Trevor Doyle C00170053
#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int option = 0;
	cout << "Would you like to : \n 1) Convert binary to decimal \n 2) Convert decimal to binary \n Enter number of option ";
	cin >> option;
	if (option == 1)
	{
		int binaryNumber;
		int decimalNumber = 0;
		int mult = 1;
		int remainder;
	
		cout << " Enter a binary number to be converted to decimal: ";
		cin >> binaryNumber;
		while (binaryNumber != 0)
		{
			remainder = binaryNumber % 10;
			decimalNumber = decimalNumber + remainder * mult;
			mult = mult * 2;
			binaryNumber = binaryNumber / 10;
		}
		cout << " The decimal number is: " << decimalNumber << "\n";
	}
	else if (option == 2)
	{
		int origNum;
		int tempNum = 0;
		int remNum;
		int binaryNum = 0;
		cout << "Enter a Decimal to be converted to Binary: ";
		cin >> origNum;
		tempNum = origNum;

		while (tempNum !=0)
		{
			remNum = origNum % 2;
			binaryNum = remNum + binaryNum * 10;
			origNum /= 2;
			tempNum = origNum;
		}
		int remNumTwo;
		int reverse=0;
		while (binaryNum != 0)
		{
			remNumTwo = binaryNum % 10;
			reverse = reverse * 10 + remNumTwo;
			binaryNum= binaryNum / 10;
		}
		cout << reverse;
	}
	else {
		cout << "Please enter valid option ";
	}

}
