package pe.edu.upeu.sysventas.model.Sysventas;

public enum TipoProducto {
    PRODUCTO("Producto"),
    PREPARADO("Preparado"),
    SERVICIO("Servicio");
    
    String descripcion;

    TipoProducto(String descripcion){
        this.descripcion=descripcion;
    }
}
