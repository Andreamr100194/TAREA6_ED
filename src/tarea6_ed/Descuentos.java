
package tarea6_ed;


public class Descuentos {
     public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=DESCUENTO_PRECIO_PRODUCTO;
            if (numProductos!=0){
            Total = precioProducto*0.8;
            mostrarPorConsola(Total);
        }else {
            Total = precioProducto*0.95;
            mostrarPorConsola(Total);
        }   

    }
    public static final int DESCUENTO_PRECIO_PRODUCTO = 5;

    public void mostrarPorConsola(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}
