package design.singleton;

import java.lang.reflect.Constructor;

public enum EnumSingleton {
	INSTANCE;
	private Object data;
	
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	public Object getInstance() {
		return data;
	}
	
	public static void main(String[] args) throws Exception {
		Class<EnumSingleton> enumClazz = EnumSingleton.class;
		Constructor<EnumSingleton> cons = enumClazz.getDeclaredConstructor(String.class, int.class);
		cons.setAccessible(true);
		cons.newInstance("lq", 666);
	}
	
}
