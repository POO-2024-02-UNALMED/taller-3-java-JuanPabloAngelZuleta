package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	
	private static int numTV=0;
	
	
	public TV (Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
		numTV++;
	}
	
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setCanal(int canal) {
		if (this.estado = true) {
			if (canal>=1 && 120>=canal) {
				this.canal=canal;
			}	
		}
	}
	public int getCanal() {
		return this.canal;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	
	public void setVolumen(int volumen) {
		if (this.estado = true) {
			if (volumen>0 && 7>volumen) {
				this.volumen=volumen;
			}
		}
	}
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	public Control getControl() {
		return this.control;
	}
	
	public void setNumTV(int numTV) {
		this.numTV=numTV;
	}
	public int getNumTV() {
		return numTV;
	}

	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {

		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.estado = true) {
			if (this.canal>=1 && 120>this.canal) {
				this.canal++;
			}
		}	
	}
	public void canalDown(){
		if (this.estado = true){
			if (this.canal>1 && 120>=this.canal){
				this.canal--;
			}

		}
	}
	
	public void volumenUp() {
		if (this.estado = true) {
			if (this.volumen>=0 && 7>this.volumen) {
				this.volumen++;
			}
		}	
	}
	public void volumenDown(){
		if (this.estado = true){
			if (this.volumen>0 && 7>=this.volumen){
				this.volumen--;
			}

		}
	}
	
	
}
