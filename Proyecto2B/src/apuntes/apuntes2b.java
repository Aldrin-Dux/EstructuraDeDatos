/*
18/06/2024
#include <iostream>
#include <conio.h>
#include <stdlib.h>

using namespace std;

struct Nodo{
       int valor;
       struct Nodo *izq;
       struct Nodo *izq;
};

struct Nodo *raiz=Null;

Nodo* crearNodo(int _valor){
      Nodo* actual = new Nodo;
      actual->valor=_valor;
      actual->izq=Null;
      actual->der=Null;
      return actual;
}

void innsertar(int _valor, Nodo** actual){
     if(*actual==Null){
      *actual=crearNodo(_valor);
     else
     if(_valor>(*actual)->valor)
     insertar(_valor, &((*actual)->der));
     else
     insertar(_valor, &((*actual)->izq));
     }
}

void preOrden(Nodo *actual){
     if(actual != Null){
               cout<<actual->valor<<" ";
               preOrden(actual>izq);
               preOrden(actual>der);
     }
}

void inOrden(Nodo *actual){
     if(actual != Null){
               inOrden(actual>izq);
               cout<<actual->valor<<" ";
               inOrden(actual>der);
     }
}

void posOrden(Nodo *actual){
     if(actual != Null)
               posOrden(actual>der);
               posOrden(actual>der);
               cout<<actual->valor<<" ";
     }
}
int main(){
    int opc, dato;
    do{
        cout<<"[1] Insetar dato "<<endl
        <<"[2] Recorrer arbol "<<endl
        <<"[0] Salir "<<endl
        cin>>opc;
        switch(opc){
                    case 1: cout<<"Elemento a insertar: ";
                            cin>>_dato;
                            insertar(_dato, &raiz);
                            break;
                    case 2: preOrden(raiz);
                            cout<<endl;
                            inOrden(raiz);
                            cout<<endl;
                            posOrden(raiz);
                            cout<<endl;
        }
    }while(opc !=0);
    return 0;
}
pasar a java y practicar en c++, descargar

*/