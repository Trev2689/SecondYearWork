//Trevor Doyle C0017053

#include "pch.h"
#include <iostream>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int main() {
	vector<int> v;		// declare an int vector

	for (int i = 1; i <= 10; i++)
		v.push_back(i);


	/*cout << "Size : " << v.size();
	cout << "\nCapacity : " << v.capacity();
	cout << "\nMax_Size : " << v.max_size();*/

	cout << "\nVector elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		cout << *it << " ";
	

	int smallestElement = v[0]; //let, first element is the smallest one
	int largestElement = v[0]; //also let, first element is the biggest one
	for (int i = 1; i < v.size(); i++)  //start iterating from the second element
	{
		if (v[i] < smallestElement)
		{
			smallestElement = v[i];
		}
		if (v[i] > largestElement)
		{
			largestElement = v[i];
		}
	}
	cout << "\nLargest element is " << largestElement;
	cout << "\nSmallest element is " << smallestElement;


	return 0;




}


