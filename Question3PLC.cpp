// Question3PLC.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>

int main()
{
	static int sample[10] = { 10,2,125,5,19,72,0,47,34,91 };
	int j = 0;
	int i = 0;
	for (i; i < 10; i++) {
		for (j; j < 100000; j++) {
			std::cout << sample[i];
		}
	}
	Box();
	Box2();
}

int Box() {
	int example[10] = { 10,3,30,5,19,72,0,47,34,91 };
	int j = 0;
	int i = 0;
	for (i; i < 10; i++) {
		for (j; j < 100000; j++) {
			std::cout << example[i];
		}
	}
	



}

int Box2(){

	int var1;
	int var[] = { 61,2,30,5,19,72,37,47,324,91 };
	int j = 0;
	int i = 0;
	for (i; i < 10; i++) {
		for (j; j < 100000; j++) {
			std::cout << var[i];
		}
	}

}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
