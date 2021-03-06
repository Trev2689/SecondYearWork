//Trevor Doyle C00170053

#include "pch.h"
#include <iostream>
#include <vector>
#include <algorithm>
#include <iostream>

//using namespace std;

int main() {
	std::vector<int> vec1{ 1,2,3,4,5,6,7,8,9 };

	// Print orig vector 
	std::cout << "Original vector :";
	for (int i = 0; i < vec1.size(); i++)
		std::cout << " " << vec1[i];
	std::cout << "\n";
	// Rotate vector left once. 
	int rotL = 1;

	// std::rotate function 
	std::rotate(vec1.begin(), vec1.begin() + rotL, vec1.end());

	// Print new vector 
	std::cout << "New vector after  rotation :";
	for (int i = 0; i < vec1.size(); i++)
		std::cout << " " << vec1[i];
	std::cout << "\n\n";

}