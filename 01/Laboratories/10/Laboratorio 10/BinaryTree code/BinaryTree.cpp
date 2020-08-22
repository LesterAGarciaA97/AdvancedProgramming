#include "stdafx.h"
#include <iostream>
#include "BinaryTree.h"


BinaryTree::BinaryTree()
{
	this->root = nullptr;
}

BinaryTree::~BinaryTree()
{
	this->killNodesFor(this->root);
}



void BinaryTree::add(int number)
{

}
void BinaryTree::add(TNode *n, int number)
{
}



void BinaryTree::killNodesFor(TNode * n)
{
}


void BinaryTree::leftVisitRight()
{
}
void BinaryTree::leftVisitRight(TNode * n)
{
}