//Program to check if char is vowel oor consennant
//Trevor Doyle C00170053
#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
	char charOne;
	
	cout << " Enter char to check ";
	cin >> charOne;

	if (charOne == 'a' || charOne == 'A' || charOne == 'e' || charOne == 'E' || charOne == 'i' || charOne == 'I' || charOne == 'o' || charOne == 'O'
		|| charOne == 'u' || charOne == 'U')
	{
		cout << charOne << " is a vowel";

	}
	else
		cout << charOne << " is a consenant";
	



	return 0;


}
