//Trevor Doyle C00170053
//List implementation of Pointers

#include "pch.h"
#include <iostream>
using namespace std;

class Item
{
public:
	int data;
	Item *nextItemPointer;

};
class List
{
public:
	Item * frontPointer;
	List() :frontPointer(NULL) {};
	~List()
	{

	}
	void pushFront(int d)
	{
		Item *newItemPointer = new Item();
		newItemPointer->data = d;
		newItemPointer->nextItemPointer = frontPointer;
		frontPointer = newItemPointer;
	}
	void Display()
	{
		if (frontPointer == NULL) {
			cout << endl << "Empty List";
			return;
		}
		for (Item *curItem = frontPointer; curItem != NULL; curItem = curItem->nextItemPointer)
		{
			cout << curItem->data << endl;
		}


	}

	Item* Search(int d)
	{
		for (Item* curItem = frontPointer; curItem != NULL; curItem = curItem->nextItemPointer)
		{
			if (curItem->data == d) { return curItem; }
		}
		return NULL;
	}

	void Erase(Item *loc)
	{
		if (loc == NULL) {
			return;
		}

		for (Item* curItem = frontPointer; curItem != NULL; curItem = curItem->nextItemPointer)
		{
			if (curItem->nextItemPointer == loc) {
				curItem->nextItemPointer = loc->nextItemPointer;
				delete loc;
			}
		}
	}

	void InsertBefore(Item *loc, int d)
	{
		if (loc == NULL) {
			return;
		}

		Item* prevItem = frontPointer;
		Item* toInsert = new Item();
		toInsert->data = d;

		for (Item* curItem = frontPointer->nextItemPointer; curItem != NULL; curItem = curItem->nextItemPointer) {

			if (curItem == loc) {
				prevItem->nextItemPointer = toInsert;
				toInsert->nextItemPointer = curItem;
				break;
			}
			prevItem = prevItem->nextItemPointer;
		}
	}

	void InsertAfter(Item *loc, int d)
	{
		if (loc == NULL) {
			return;
		}

		Item* toInsert = new Item();
		toInsert->data = d;

		for (Item* curItem = frontPointer; curItem != NULL; curItem = curItem->nextItemPointer) {

			if (curItem == loc) {
				toInsert->nextItemPointer = curItem->nextItemPointer;
				curItem->nextItemPointer = toInsert;
				break;
			}
		}
	}

	void PushBack(int d) {
		Item* backPointer = new Item();

		for (Item* curItem = frontPointer; curItem != NULL; curItem = curItem->nextItemPointer)
		{
			backPointer = curItem;
		}

		Item *newItemPointer = new Item();
		backPointer->nextItemPointer = newItemPointer;
		newItemPointer->data = d;
	}

	bool PopBack(int &d)
	{
		Item* backPointer = new Item();
		backPointer = NULL;

		for (Item* curItem = frontPointer; curItem != NULL; curItem = curItem->nextItemPointer)
		{
			backPointer = curItem;
		}

		d = backPointer->data;

		if (backPointer != NULL)
		{
			Erase(backPointer);
			return true;
		}
		else { return false; }
	}

	bool PopFront(int &d) {
		d = frontPointer->data;

		if (frontPointer != NULL) {
			frontPointer = frontPointer->nextItemPointer;
			return true;
		}
		else {
			return false;
		}
	}

	void DeleteFront() {
		if (frontPointer != NULL) {
			frontPointer = frontPointer->nextItemPointer;
		}
		else {
			cout << endl << "The List is Empty";
		}
	}

	void DeleteAll() {
		struct Item *tempItem = new Item();
		Item* curItem = frontPointer;
		if (frontPointer != NULL) {

			while (curItem != NULL) {
				tempItem = curItem;
				curItem = curItem->nextItemPointer;

				free(tempItem);
			}
			frontPointer = NULL;
		}

		else {
			cout << endl << "The List is Empty";
		}

	}
};

int main()
{
	List myList;
	myList.pushFront(1);
	myList.pushFront(2);
	myList.pushFront(3);
	myList.pushFront(4);
	myList.pushFront(5);
	myList.pushFront(6);
	myList.pushFront(7);

	//Test Data

	cout << "Original List : " << endl;
	myList.Display();
	cout << endl;

	cout << "Test 1" << endl;
	cout << "Inserting 100 before 4, and 505 after 4" << endl;
	myList.InsertBefore(myList.Search(4), 100);
	myList.InsertAfter(myList.Search(4), 505);
	myList.Display();

	cout << "Test 2" << endl;
	cout << "Pop Front test and display popped val" << endl;
	Item* popFrontVal = new Item();
	myList.PopFront(popFrontVal->data);
	myList.Display();
	cout << endl << endl << popFrontVal->data << endl;

	cout << "Test 3" << endl;
	cout << "Pop Back test and display popped value" << endl;
	Item* popBackVal = new Item();
	myList.PopBack(popBackVal->data);
	myList.Display();
	cout << endl << endl << popBackVal->data << endl;

	cout << "Test 4" << endl;
	cout << "Delate/Erase 505 from the List" << endl;
	myList.Erase(myList.Search(505));
	myList.Display();

	cout << "Test 5" << endl;
	cout << "Push Back value of 245 to end of list" << endl;
	myList.PushBack(245);
	myList.Display();
	cout << endl;

	return 0;
}