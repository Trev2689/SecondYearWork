//Trevor Doyle C00170053

#include "pch.h"
#include <iostream>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int main() {
	vector<int> v(12);

	
	for (int i = 0; i < 11; ++i)
			v[i] = i;

	

	std::cout << "\n Original Vector elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		std::cout << *it << " ";

	int newNum = 22;
	int pos = 5;
	int count = 10;

	for (int i = count; i >= pos; i--)
	{
		v[i+1]=v[i];
		//v[pos] = newNum;
	}
	v[pos] = newNum;
	count++;

	std::cout << "\n New Vector  elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		std::cout << *it << " ";

	return 0;

}
