
public class Estudiante extends Personas {
	private int estado;

	

	public Estudiante(String nombre, String direccion, String telefono, String imail, int estado) {
		super(nombre, direccion, telefono, imail);
		this.estado = estado;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Estudiante [estado=" + estado + ", getEstado()=" + getEstado() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", getImail()="
				+ getImail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}



}
