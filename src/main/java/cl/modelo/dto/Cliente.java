package cl.modelo.dto;

public class Cliente extends Usuario {

	private int id;
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String afp;
	private String sistema_salud;
	private String direccion;
	private String comuna;
	private int edad;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cliente(int id, String rut, String nombre, String apellido, String correo, String telefono, String afp,
			String sistema_salud, String direccion, String comuna, int edad) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.afp = afp;
		this.sistema_salud = sistema_salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistema_salud() {
		return sistema_salud;
	}

	public void setSistema_salud(String sistema_salud) {
		this.sistema_salud = sistema_salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
				+ correo + ", telefono=" + telefono + ", afp=" + afp + ", sistema_salud=" + sistema_salud
				+ ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}

}
