//Trevor Doyle C00170053

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

	vector<int>v2;

	std::cout << "\n Original Vector elements are: ";
	for (auto it = v.begin(); it != v.end(); it++)
		std::cout << *it << " ";

	
	for (int i = 0; i < v.size(); i++)
		v2.push_back(v[i]);

	std::cout << "\n New Vector 2 elements are: ";
	for (auto it = v2.begin(); it != v2.end(); it++)
		std::cout << *it << " ";
	
	return 0;

}
