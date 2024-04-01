
public class Personas {
	
private String nombre;
private String direccion;
private String telefono;
private String imail;

public Personas(String nombre, String direccion, String telefono, String imail) {
	this.nombre = nombre;
	this.direccion = direccion;
	this.telefono = telefono;
	this.imail = imail;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getImail() {
	return imail;
}
public void setImail(String imail) {
	this.imail = imail;
}
@Override
public String toString() {
	return "Personas [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", imail=" + imail
			+ "]";
}


}
