package test;

public class SE extends Employee{
	private String hot;
	SE(String id,String name,String gender,int salary,String hot){
		setId(id);
		setName(name);
		setGender(gender);
		setSalary(salary);
		setHot(hot);
	}
	public void show(){
		System.out.println("Ա����ţ�" + id + ";������" + name + ";�Ա�" + gender + ";���ʣ�" + salary + ";��ע�ȣ�" + hot);
	}
	public String getHot() {
		return hot;
	}
	public void setHot(String hot) {
		this.hot = hot;
	}
	

}
