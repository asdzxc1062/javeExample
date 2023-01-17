package homework2;

public class EmpDept extends Employee{
	
	// 필드
	private String department;
	
	// 생성자
	public EmpDept(String name, int pay, String department) {
		super(name, pay);
		this.department = department;
		getInformation();
		print();
	}
	
	//메소드
	public String getDepartment() {
		return this.department;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getPay() + " 부서:" + this.department);
	}
	
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}

}
