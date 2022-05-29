package extra_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//given an array of string representing students name and score. eg harsh95 means harsh has 95 marks
//return another array of string containing names and thr scores by sorting scores based on largest to
//smallest score. If 2 students have the same marks, sort them based on their index.
//eg harsh83 puja95 shivam95
//ans=puja95 shivam95 harsh83
public class CustomSortOfStudents {
    class Student implements Comparable<Student> {
        int marks;
        String name;
        int index;
        public Student(int i, String n, int m) {
            marks=m;
            index=i;
            name=n;

        }

        @Override
        public int compareTo(Student a) {
            if (this.marks<a.marks) {
                return 1;
            }
            else if (this.marks==a.marks) {
                if (this.index<a.index) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return -1;
            }
        }
    }
    public ArrayList<String> solve(ArrayList<String>input) {
        ArrayList<Student>output=new ArrayList<Student>();
        for (int i=0; i<input.size(); i++) {
            String S=input.get(i);
            Student student=new Student(i,getName(S),getMarks(S));
            output.add(student);

        }
        Collections.sort(output);
        ArrayList<String>res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<output.size(); i++) {
            Student S=output.get(i);
            sb.append(S.name);
            sb.append(S.marks);
            res.add(sb.toString());
            sb.setLength(0);

        }
        return res;



    }
    public String getName(String A) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        while (i<A.length()) {
            if ((A.charAt(i)>='a' && A.charAt(i)<='z') || (A.charAt(i)>='A' && A.charAt(i)<='Z')) {
                sb.append(A.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public int getMarks(String A) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        while (i<A.length()) {
            if (A.charAt(i)>='0' && A.charAt(i)<='9') {
                sb.append(A.charAt(i));
            }
            i++;
        }
        String S=sb.toString();
        return Integer.parseInt(S);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<String>S=new ArrayList<String>();
        for (int i=0; i<N; i++) {
            S.add(sc.next());
        }

        CustomSortOfStudents res=new CustomSortOfStudents();
        ArrayList<String>output=res.solve(S);
        for (int i=0; i<output.size(); i++) {
            System.out.print(output.get(i)+" ");
        }


    }

}
