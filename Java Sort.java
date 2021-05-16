import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class stsort implements Comparator<Student>{
    public int compare(Student a,Student b){
        return (a.getCgpa()!=b.getCgpa())?(int)(b.getCgpa()*1000-a.getCgpa()*1000):(a.getFname().equals(b.getFname())!=true)?a.getFname().compareTo(b.getFname()):(a.getId()-b.getId());
    }
}
//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        //Comparator cmp =Comparator.comparingDouble(Student::getCgpa,Comparator.reverseOrder()).thenComparing(Student::getFname).thenComparing(Student::getId);
        Collections.sort(studentList,new stsort());
        //Arrays.sort(studentList,cmp);
      	for(Student st: studentList){
			System.out.println(st.getFname());//+st.getId()
		}
	}
}

