//Trevor Doyle C00170053
#include <iostream>
using namespace std;


int main()
{
	int largest=0;
	int second=0;
	const int arraySize = 10;
	int intArray[arraySize] = { 1,2,3,4,5,6,7,8,9,10 };

	int min = intArray[0];
	int max = intArray[0];
	for (int i = 0; i < 2; i++)
	{
		if (intArray[0] < intArray[1])
		{
			second = intArray[0];
		}
		else
		{
			largest = intArray[0];
			second = intArray[1];
		}
	}
	for (int j = 2; j < arraySize; j++)
	{
		if (intArray[j] > largest)
		{
			second = largest;
			largest = intArray[j];
		}
		else if (intArray[j] > second && intArray[j] != largest)
		{
			second = intArray[j];
		}
			
	}

		

	cout << "Second largest number is: " << second;
	

	return 0;



}
