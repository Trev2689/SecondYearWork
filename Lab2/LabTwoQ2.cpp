//Trevor Doyle C00170053
#include <iostream>
using namespace std;


int main()
{
	const int arraySize = 10;
	int intArray[arraySize] = { -1,2,3,4,-5,6,7,8,9,10 };
	
	
	for (int i = 0; i < arraySize; i++)
		if (intArray[i] < 0)
		{
			cout << "Negative number found " << intArray[i];
		}
		
	return 0;



}
