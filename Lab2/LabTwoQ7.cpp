//Trevor Doyle C00170053
#include <iostream>
using namespace std;


int main()
{
	
	const int arrayASize = 20;
	const int arrayBSize = 20;



	int ArrayA[arrayASize] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
	int ArrayB[arrayASize];

	for (int i = 0; i < arrayASize; i++)
	{
		ArrayB[i] = ArrayA[i];
	}
	for (int j = 0; j < arrayASize; j++)
	{
		cout << ArrayB[j];
	}



	


	return 0;



}
