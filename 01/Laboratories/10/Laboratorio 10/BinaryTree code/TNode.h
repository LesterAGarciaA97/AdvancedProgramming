#pragma once
class TNode
{
public:
	TNode();
	TNode(int number);
	~TNode();
private:
	TNode *left;
	int value;
public:
	TNode *right;
	TNode * getLeft();
	void setLeft(TNode * node);
	int getValue();
	void setValue(int number);
	TNode * getRight();
	void setRight(TNode * node);
	
};

