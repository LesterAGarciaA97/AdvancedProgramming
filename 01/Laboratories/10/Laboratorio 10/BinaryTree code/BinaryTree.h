#pragma once
#include "TNode.h"
class BinaryTree
{
public:
	BinaryTree();
	~BinaryTree();
public:
	void add(int number);
	void leftVisitRight();

private:
	TNode *root;
	void add(TNode * n, int number);
	void killNodesFor(TNode * n);
	void leftVisitRight(TNode * n);
	
};

