//Trevor Doyle C00170053

#include "pch.h"
#include <iostream>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int main() {
	int count;
	int i;
	int j;
	vector<int> v;

	for (int i = 1; i <= 10; i++)
		v.push_back(i);

	vector<int>freq(10);

	for (i = 0; i <10 ; i++)
	{
		freq[i] = -1;
	}

	for (i = 0; i < 10; i++)
	{
		count = 1;
		for (j = i + 1; j < 10; j++)
		{
			/* duplicate element is found */
			if (v[i] == freq[j])
			{
				count++;

				/* Back to zero so doesnt count twice */
				freq[j] = 0;
			}
		}

		/* If freq of current not counted */
		if (freq[i] != 0)
		{
			freq[i] = count;
		}
	}

	for (i = 0; i < 10; i++)
	{
		if (freq[i] != 0)
		{
			cout << v[i] << " occurs " << freq[i] << " Times  ";

		}
	}



	std::cout << "\n Original Vector elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		std::cout << *it << " ";


	








	return 0;


}


