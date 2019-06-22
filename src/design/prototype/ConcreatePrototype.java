package design.prototype;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConcreatePrototype implements Cloneable,Serializable {
	
	private static final long serialVersionUID = 6876683499786354581L;
	
	private int age = 18;
	private String name = "lq";
	private Date currdate = new Date();
	private List<String> list = new ArrayList<>();
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			ConcreatePrototype result = (ConcreatePrototype)ois.readObject();
			result.setCurrdate(new Date());
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCurrdate() {
		return currdate;
	}
	public void setCurrdate(Date currdate) {
		this.currdate = currdate;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
}
