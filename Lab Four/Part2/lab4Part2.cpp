// Trevor Doyle C00170053
//Lab4Part2Q1

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

	int elementToFind = 4;

	std::vector<int>::iterator itr = std::find(v.begin(), v.end(), elementToFind);

	if (itr != v.end()) {
		std::cout << "Element found at index " << endl;
		cout<<	std::distance(v.begin(), itr);
	}
	else {
		std::cout << "-1 Element not found"<<endl;
	}

	return 0;

	


}


