// Lab0210-garcia aquino-1003115.cpp: define el punto de entrada de la aplicación de consola.
//

#include "stdafx.h"
#include <iostream>
#include <time.h>
#include "BinaryTree.h"

using namespace std;

BinaryTree * createRandomBinaryTree(int elementCount)
{

	int randomNumber = 0;
	BinaryTree *tree = new BinaryTree();
	for (int i = 0; i < elementCount; i++)
	{
		randomNumber = rand() % 100;
		tree->add(randomNumber);
	}
	return tree;
}


int main(int argc, char *argv[])
{
	srand(time(nullptr));
	BinaryTree *b = createRandomBinaryTree(15);

	b->leftVisitRight();

	delete b;
	return 0;
}


