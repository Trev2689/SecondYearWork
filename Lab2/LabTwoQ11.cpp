//Trevor Doyle C00170053
#include <iostream>
using namespace std;


int main()
{
	const int arraySize = 9;
	int count=0;
	int i;
	int j;
	int intArray[arraySize] = { 1,1,2,2,3,3,4,7};
	

	for (i = 0; i < arraySize; i++)
	{
		for (j = i + 1; j < arraySize; j++)
		{
			
			if (intArray[i] == intArray[j])
			{
				count++;
				break;
			}
		}
	}

	cout << count << " duplicates found ";


}
