//Trevor Doyle C00170053
#include <iostream>
using namespace std;


int main()
{
	
	int index = -1;
	int key;
	const int arraySize = 10;
	int intArray[arraySize] = { -1,2,3,4,-5,6,7,8,9,10 };

	cout << "Enter int to be searched for ";
	cin >> key;




	for (int i = 0; i < arraySize; i++)
		if (intArray[i] == key)
		{
			index = i;
			
			
		}
	cout << index;

	return 0;



}
