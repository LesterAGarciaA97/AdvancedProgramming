//
#include "stdafx.h"
#include <iostream>
#include <sstream>
#include <time.h>
#include <ctime>

using namespace std;
int arraySize = 10;


void printArray(int a[], int length)
{
	cout << "\n";
	for (int i = 0; i < length; i++)
	{
		cout << a[i] << ", ";
	}
	cout << "\n";

}

void quickSort(int a[], int start, int end)
{

}

void bubbleSort(int a[], int start, int end)
{

}

void fillArrayWithRandom(int a[], int length)
{
	for (int i = 0; i < length; i++)
	{
		a[i] = rand() % 100;
	}
}



int main(int argc, char *argv[])
{
	srand(time(NULL)); // initialize random with a seed
					   //int a[] = {41,2,5,7,2,3,5,82,7,3,67,41,5,9,3,35,1};

	int *a = new int[arraySize]; //array with variable size

	clock_t start = clock(); //clock ticks
	clock_t end = start;


	fillArrayWithRandom(a, arraySize);

	printArray(a, arraySize);

	quickSort(a, 0, arraySize - 1);

	printArray(a, arraySize);


	end = clock();

	cout << "\n time:" << ((double)(end - start)) / CLOCKS_PER_SEC; // calculates seconds 

	delete a;

	int b = 0;
	cin >> b;
	return 0;
}

