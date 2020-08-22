
// Simple Hello World
 
#include <iostream>
 
 double sumar(double a, double b){
     return a+b;
     
 }
 
 int restar(int a, int b){
     return a-b;
 }
 
 int multiplicar(int a, int b){
     return a*b;
 }
 
 int dividir(int a, int b){
     return a/b;
 }
 
 void sumapunteros(int a, int b, int*);
 void restapunteros(int a, int b, int*);
 void multiplicacionpunteros(int a, int b, int*);
 void divisionpunteros(int a, int b, int*);
 
int main()
{
  int Resultado1 = sumar(5,7); 
  int Resultado2 = restar (7,5);
  int Resultado3 = multiplicar(5,7);
  int Resultado4 = dividir(12,6);
  
  int resultado1 = -1;
  sumapunteros(8,5,&resultado1);
  int resultado2 = -1;
  restapunteros(8,5,&resultado2);
  int resultado3 = -1;
  multiplicacionpunteros(8,5,&resultado3);
  int resultado4 = -1;
  divisionpunteros(8,4,&resultado4);
  
  std::cout << "¡Primer laboratorio con C++!" << std::endl;
  std::cout << "El resultado de la suma 5 + 7 es " << Resultado1 << std::endl;
  std::cout << "El resultado de la resta 7 - 5 es " << Resultado2 << std::endl;
  std::cout << "El resultado de la multiplicación 5 * 7 es " << Resultado3 << std::endl;
  std::cout << "El resultado de la división 12 / 2 es " << Resultado4 << std::endl;
  
  std::cout << "El resultado de la suma de punteros 8 + 5 es " << resultado1 << std::endl;
  std::cout << "El resultado de la resta de punteros 8 - 5 es " << resultado2 << std::endl;
  std::cout << "El resultado de la multiplicación de punteros 8 * 5 es " << resultado3 << std::endl;
  std::cout << "El resultado de la división de punteros 8 / 4 es " << resultado4 << std::endl;
  return 0;
}

void sumapunteros(int a, int b, int* resultado1){
    *resultado1 = a+b;
}

void restapunteros(int a, int b, int* resultado2){
    *resultado2 = a-b;
}

void multiplicacionpunteros(int a, int b, int* resultado3){
    *resultado3 = a*b;
}

void divisionpunteros(int a, int b, int* resultado4){
    *resultado4 = a/b;
}