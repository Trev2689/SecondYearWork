// Trevor Doyle C00170053

#include "pch.h"
#include <iostream>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int main() {
	vector<int> v;

	for (int i = 1; i <= 10; i++)
		v.push_back(i);
	//for (int i = 0; i < 11; ++i)
		//v[i] = i;



	std::cout << "\n Original Vector elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		std::cout << *it << " ";

	//int nNum = 22; Standard deletion 
	/*int delPos = 5;
	int count = 10;
	for (int i = delPos; i < count - 1; i++)
	{
		v[i] = v[i + 1];
	}
	count++;*/
	v.erase(v.begin() + 5); 

	std::cout << "\n New Vector  elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		std::cout << *it << " ";

	return 0;

}
