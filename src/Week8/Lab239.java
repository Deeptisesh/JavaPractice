package Week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab239 {
    public static void main(String[] args) {
//Comparator
        // Student - name, id
        Student1 s1 = new Student1(4, "Supriya");
        Student1 s2 = new Student1(2, "Thaku Amit Singh");
        Student1 s3 = new Student1(3, "Muthu");
        Student1 s4 = new Student1(1, "Darshan");

        // creating a arraylist

        List<Student1> arraylist= new ArrayList<>();
// adding elements
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        arraylist.add(s4);

        System.out.println(arraylist);

        // sort
;



    }
}

class sortByName implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        System.out.println(o1.getName().compareTo(o2.getName()));
        return 0;
    }

    @Override
    public Comparator<Student1> reversed() {
        return Comparator.super.reversed();
    }
}



class Student1 {
    private Integer id;
    private String name;

    public Student1(Integer id, String name) {
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


}