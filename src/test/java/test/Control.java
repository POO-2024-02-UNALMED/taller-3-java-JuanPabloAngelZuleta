package test;

public class Control {
	TV tv;
	
	
	public void enlazar (TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	
    public void setTv(TV tv) {
        this.tv = tv;
        tv.setControl(this);
    }
    public TV getTv() {
        return tv;
    }
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff(){
        tv.turnOff();
    }
	
	public void canalUp(){
        tv.canalUp();
    }
	public void canalDown(){
        tv.canalDown();
    }
	public void setCanal(int canal){
        tv.setCanal(canal);
    }
	
	public void volumenUp(){
        tv.volumenUp();
    }    
	public void volumenDown(){
        tv.volumenDown();
    }    
	public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }    
	    
	

}
