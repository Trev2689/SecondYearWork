// Program to convert chars 0-9 to int
//Trevor Doyle C00170053

#include <iostream>
using namespace std;

int main()
{
	char charOne;
	cout << "Enter character to find its ASCII value: ";
	cin >> charOne;
	int convertOut;

	switch (charOne)
	{
	case '0':
		convertOut = charOne - '0';
		cout << convertOut;
		break;

	case '1':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '2':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '3':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '4':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '5':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '6':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '7':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '8':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
	case '9':
		convertOut = charOne - '0';
		cout << convertOut;
		break;
		
	default:
		cout << "Only Accepting chars 0-9";
	}



	


	
}
