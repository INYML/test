package test;

public class PM extends Employee{
	private String exp;
	private int bonus;
	public void show(){
		System.out.println("Ա����ţ�" + id + ";������" + name + ";�Ա�" + gender + ";���ʣ�" + salary + ";��Ŀ���飺" + exp + ";��Ŀ�ֺ죺" + bonus);
	}
	PM(String id,String name,String gender,int salary,String exp,int bonus){
		setId(id);
		setName(name);
		setGender(gender);
		setSalary(salary);
		setExp(exp);
		setBonus(bonus);
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
