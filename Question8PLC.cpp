// Question8PLC.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>

int main()
{
	int j = -3; 
	int a = 0;
	int i = 0;
	loop:(i; i < 3; i++) {

		if (j + 2 = 3) {
			goto:loop

		}
		else if (j + 2 = 2) {
			j--;
			goto:loop
		}
		else if (j + 2 = 0) {
			j += 2;
			goto:loop
		}
	}
	j = 0;
 
 if (j > 0);
 j = 3 - i;


// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
