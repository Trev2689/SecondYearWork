//Trevor Doyle C00170053
#include <iostream>
using namespace std;


int main()
{
	const int arraySize = 5;
	int intArray[arraySize] = { 1,2,3,4,5 };
	int i, firstEl;

	
	firstEl = intArray[0];

	for (i = 0; i < arraySize - 1; i++)
	{
		
		intArray[i] = intArray[i + 1];
	}

	
	intArray[arraySize - 1] = firstEl;

	for(i = 0; i <arraySize; i++)
	{
		cout << intArray[i];
	}




}
