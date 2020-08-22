// Win32Project1.cpp: define el punto de entrada de la aplicación de consola.
//

#include "stdafx.h"
#include "iostream"

const int MAX_ARRAY_SIZE = 100;

int FillArray(int List[], int Size)
{
	int i = 0;
	while (i++<Size)
	{
		List[i] = std::rand() % 10;
	}

	return 0;
}

void PrintArray(int List[], int Size)
{
	for (int i = 0; i < Size; i++)
	{
		std::cout << List[i];
	}
	
	//Imprimir valores de arreglo en pantalla
}

int _tmain(int argc, _TCHAR* argv[])
{
	int List[MAX_ARRAY_SIZE];
	int Size = 10;
	int Option = 0;

	std::cout << "Ingrese un valor\n";


	FillArray(List, Size);
	PrintArray(List, Size);

	std::cin >> Option; //Equivalente al ReadKey

	return 0;
}

