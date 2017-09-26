package dataStore;

/**
 * @author Seungho Han A20360115
 *
 * DataStore_01 inherits methods from DataStore to implement
 * appropriate methods of types.
 *  
 * In this code, A indicates both of initial Balance and
 * the Balance during the execution of program. 
 */

public class DataStore_01 extends DataStore {

	Object p;			
	Object temp_p;		
	
	Object y;			
	String temp_y;		
	
	Object a;			
	Object temp_a;		
	
	Object d;			
	Object temp_d;		
	
	Object w;			
	Object temp_w;		
	
	Object x;			
	
	@Override
	public Object getP() {
		return p;
	}

	@Override
	public void setP(Object p) {
		this.p = (String)p;
	}

	@Override
	public Object getTemp_p() {
		return temp_p;
	}

	@Override
	public void setTemp_p(Object temp_p) {
		this.temp_p = (String)temp_p;
	}

	@Override
	public Object getY() {
		return y.toString();
	}

	@Override
	public void setY(Object y) {
		this.y = (String)y;
	}

	@Override
	public Object getTemp_y() {
		return temp_y;
	}

	@Override
	public void setTemp_y(Object temp_y) {
		this.temp_y = (String)temp_y;
	}

	@Override
	public Object getA() {
		return a;
	}

	@Override
	public void setA(Object a) {
		this.a = (float)a;
	}
	
	@Override
	public Object getTemp_a() {
		return temp_a;
	}

	@Override
	public void setTemp_a(Object temp_a) {
		this.temp_a = (float)temp_a;
	}

	@Override
	public Object getD() {
		return d;
	}

	@Override
	public void setD(Object d) {
		this.d = (float)d;
	}

	@Override
	public Object getTemp_d() {
		return temp_d;
	}

	@Override
	public void setTemp_d(Object temp_d) {
		this.temp_d = (float)temp_d;
	}

	@Override
	public Object getW() {
		return w;
	}

	@Override
	public void setW(Object w) {
		this.w = (float)w;
	}

	@Override
	public Object getTemp_w() {
		return temp_w;
	}

	@Override
	public void setTemp_w(Object temp_w) {
		this.temp_w = (float)temp_w;
	}

	@Override
	public Object getX() {
		return x;
	}

	@Override
	public void setX(String x) {
		this.x = (String)x;
	}
}
