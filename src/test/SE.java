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
		System.out.println("员工编号：" + id + ";姓名：" + name + ";性别：" + gender + ";工资：" + salary + ";关注度：" + hot);
	}
	public String getHot() {
		return hot;
	}
	public void setHot(String hot) {
		this.hot = hot;
	}
	

}
