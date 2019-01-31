//Trevor Doyle C00170053
#include <iostream>
#include <array>
using namespace std;


int main()
{

	const int arraySize = 12;
	int count;
	int i;
	int j;
	int intArray[arraySize] = { 1,1,2,2,2,3,4,4,4,4,4,7 };
	int frequency[arraySize];

	for (i = 0; i < arraySize; i++)
	{
		frequency[i] = -1;
	}

	for (i = 0; i < arraySize; i++)
	{
		count = 1;
		for (j = i + 1; j < arraySize; j++)
		{
			/* duplicate element is found */
			if (intArray[i] == intArray[j])
			{
				count++;

				/* Back to zero so doesnt count twice */
				frequency[j] = 0;
			}
		}

		/* If freq of current not counted */
		if (frequency[i] != 0)
		{
			frequency[i] = count;
		}
	}

	for (i = 0; i < arraySize; i++)
	{
		if (frequency[i] != 0)
		{
			cout << intArray[i] << " occurs " << frequency[i] << " Times  ";
			
		}
	}

	






	return 0;



}
