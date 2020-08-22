// Simple Linked List
 
#include <iostream>
using namespace std;

 struct Nodo{
     int Numero;
     Nodo *sig;
 }   *Cabeza;
 
int main()
{
   Nodo *Uno = new Nodo;
   Nodo *Dos = new Nodo;
   Nodo *Tres=new Nodo;
   Cabeza = uno;
   Uno->sig=Dos;
   Dos->sig=Tres;
   Tres->sig=NULL;
   
   Uno->Numero=1;
   Dos->Numero=2;
   Tres->Numero=3;
   
   cout<< Cabeza -> Uno<< cabeza->sig-> Dos<< cabeza->sig->sig->Tres<<endl;
}