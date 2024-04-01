
public class Empleado extends Personas {
	private String Departamento;
	private float salario;
	private String fechaContratacion;
	
	public Empleado(String nombre, String direccion, String telefono, String imail, String departamento, float salario,
		String fechaContratacion) {
		super(nombre, direccion, telefono, imail);
		Departamento = departamento;
		this.salario = salario;
		this.fechaContratacion = fechaContratacion;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	@Override
	public String toString() {
		return "Empleado [Departamento=" + Departamento + ", salario=" + salario + ", fechaContratacion="
				+ fechaContratacion + "]";
	}

}
