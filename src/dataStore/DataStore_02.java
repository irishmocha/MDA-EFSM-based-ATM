package dataStore;
/**
 * @author Seungho Han A20360115
 *
 * DataStore_02 inherits methods from DataStore to implement
 * appropriate methods of types.
 *  
 * In this code, A indicates both of initial Balance and
 * the Balance during the execution of program. 
 */
public class DataStore_02 extends DataStore {
	
	Object p;		

	Object temp_p;	

	Object y;
	Object temp_y;

	Object a;
	Object temp_a;

	Object x;

	Object d;
	Object temp_d;

	Object w;
	Object temp_w;

	@Override
	public Object getP() {
		return p;
	}

	public void setP(Object p) {
		this.p = (int)p;
	}

	public Object getTemp_p() {
		return temp_p;
	}

	public void setTemp_p(Object temp_p) {
		this.temp_p = (int)temp_p;
	}

	public Object getY() {
		return y;
	}

	public void setY(Object y) {
		this.y = (int)y;
	}

	public Object getTemp_y() {
		return temp_y;
	}

	public void setTemp_y(Object temp_y) {
		this.temp_y = (int)temp_y;
	}

	public Object getA() {
		return (int)a;
	}

	public void setA(Object a) {
		this.a = (int)a;
	}

	public Object getTemp_a() {
		return temp_a;
	}

	public void setTemp_a(Object temp_a) {
		this.temp_a = (int)temp_a;
	}

	public Object getX() {
		return x;
	}

	public void setX(Object x) {
		this.x = (int)x;
	}

	public Object getD() {
		return d;
	}

	public void setD(Object d) {
		this.d = (int)d;
	}

	public Object getTemp_d() {
		return temp_d;
	}

	public void setTemp_d(Object temp_d) {
		this.temp_d = (int)temp_d;
	}

	public Object getW() {
		return w;
	}

	public void setW(Object w) {
		this.w = (int)w;
	}

	public Object getTemp_w() {
		return temp_w;
	}

	public void setTemp_w(Object temp_w) {
		this.temp_w = (int)temp_w;
	}

}
