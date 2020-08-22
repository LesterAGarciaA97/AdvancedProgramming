#include "stdafx.h"
#include "TNode.h"


TNode::TNode()
{
	this->left = nullptr;
	value = 0;
	this->right = nullptr;
}


TNode::TNode(int number)
{
	this->left = nullptr;
	value = number;
	this->right = nullptr;
}


TNode::~TNode()
{
}


TNode * TNode::getLeft()
{
	return this->left;
}


void TNode::setLeft(TNode * node)
{
	this->left = node;
}


int TNode::getValue()
{
	return this->value;
}


void TNode::setValue(int number)
{
	this->value = number;
}


TNode * TNode::getRight()
{
	return this->right;
}


void TNode::setRight(TNode * node)
{
	this->right = node;
}


