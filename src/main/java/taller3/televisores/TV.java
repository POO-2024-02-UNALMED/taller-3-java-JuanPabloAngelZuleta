package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	Control control;
	int numTV=0;
	
	
	public TV (Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		if (this.estado = true) {
			if (canal>=1 && 120>=canal) {
				this.canal=canal;
			}	
		}
	}
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if (this.estado = true) {
			if (volumen>0 && 7>volumen) {
				this.volumen=volumen;
			}
		}
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	public Control getControl() {
		return control;
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
		return estado;
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
