package Basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class student implements Comparable<student>{
	
	private int chem ;
	private int phy;
	private int maths;
	
	public student(int chem,int phy,int maths) {
		this.chem = chem;
		this.phy = phy;
		this.maths = maths;
	}
	
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return this.maths -o.maths;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		student s1 = new student(10,40,60);
//		student s2 = new student(30,50,50);
//		student arr[] = new student[2];
//		arr[0] = s1;
//		arr[1] = s2;
//		
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].maths);
//		}
		List<Employee> listOfEmp = createEmployeeList();
		Optional<Employee> emp = getEmployee(listOfEmp,"Martin");
		if(emp.isPresent()) {
			System.out.println(emp.get().getName());
		}else {
			System.out.println("not found with this name!");
		}
		

	}
	
	public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();
 
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",22);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
 
        return employeeList;
 
    }
	
	public static Optional<Employee> getEmployee(List<Employee> employeeList,String name){
		for(Employee e:employeeList)
        {
            if(e.getName().equalsIgnoreCase(name))
            {
                return Optional.of(e);
            }
        }
        return Optional.empty();
	}
}

 class Employee {
    private String name;
    private int age;
 
    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}