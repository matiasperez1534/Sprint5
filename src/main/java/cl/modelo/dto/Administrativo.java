package cl.modelo.dto;

public class Administrativo extends Usuario{

	private int id;
	private String run;
	private String nombre;
	private String apellido;
	private String correo;
	private String area;
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Administrativo(int id, String run, String nombre, String apellido, String correo, String area) {
		super();
		this.id = id;
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.area = area;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Adminisitrativo [id=" + id + ", run=" + run + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correo=" + correo + ", area=" + area + "]";
	}

}
