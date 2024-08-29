package Week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab238 {
    public static void main(String[] args) {
//Comparable
        // Student - name, id
        Student s1 = new Student(4, "Supriya");
        Student s2 = new Student(2, "Thaku Amit Singh");
        Student s3 = new Student(3, "Muthu");
        Student s4 = new Student(1, "Darshan");

        // creating a arraylist

        List<Student> arraylist= new ArrayList<>();
// adding elements
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        arraylist.add(s4);

        System.out.println(arraylist);

        // sort

          Collections.sort(arraylist);//gives the list how its added -->Comparable

        //Collections.sort();



    }
}
class Student implements Comparable<Student>{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id,o.id);
    }
}
