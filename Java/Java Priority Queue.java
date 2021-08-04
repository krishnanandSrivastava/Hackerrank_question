import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
class Student{
    private int id;
    private String name;
    private float cgpa;
    Student(int id,String name,float cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getCGPA(){
        return cgpa;
    }
}
class StudentSort implements Comparator<Student>{
    public int compare(Student a,Student b){
        return (a.getCGPA()!=b.getCGPA())?(int)(b.getCGPA()*1000-a.getCGPA()*1000):(a.getName().equals(b.getName())==false)?a.getName().compareTo(b.getName()):a.getId()-b.getId();
    }
}
class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pq =new PriorityQueue(events.size(),new StudentSort());
        if(events.isEmpty()==false){
            for(String s:events){
                if(s.equals("SERVED")==false){
                    String details[]=s.split(" ");
                    pq.add(new Student(Integer.parseInt(details[3]),details[1],Float.parseFloat(details[2])));
                }
                else if(!pq.isEmpty()){
                    pq.poll();
                   
                }
            }
        }
        List<Student> finalList =new ArrayList();
        while(!pq.isEmpty())
        finalList.add(pq.poll());
        return finalList;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
