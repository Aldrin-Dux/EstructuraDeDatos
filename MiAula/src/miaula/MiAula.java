package miaula;
public class MiAula {
    public static void main(String[] args) {
        Metodos obj=new Metodos(10);
        int opc;
        do{
            opc=obj.menu();
            switch(opc){
                case 1->obj.insertar();
            }
        }while(opc!=0);
    }
    
}
