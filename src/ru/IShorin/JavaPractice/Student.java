package ru.IShorin.JavaPractice;

///////////////////////////////////////////////////////////////
//повторение 1го задания(почти) используется и для 2го и для 3го задания
public class Student {
    private String name;
    private int age;
    private int IDnum;
    private String dateofbirth;
    private double gpa;//только добавляем в класс средний балл

    public Student(String name, int age, int IDnum, double gpa) {
        this.name = name;
        this.age = age;
        this.IDnum = IDnum;
        this.gpa = gpa;

    }
    public Student(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public boolean compareTo(Student student) {
        if (student.getIDnum() < IDnum) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + IDnum +
                ", gpa=" + gpa +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                IDnum == student.IDnum &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
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

    public int getIDnum() {
        return IDnum;
    }

    public void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString(String str) {
        String[] words = dateofbirth.split(" ");
        char[] tmp = words[2].toCharArray();
        if (str.compareTo("Short")==0){
            return words[0] + "." + words[1] + "." + tmp[2] + tmp[3];
        }
        if (str.compareTo("Middle")==0){
            return words[0] + "." + words[1] + "." + words[2];
        }
        if (str.compareTo("Full")==0){
            switch (words[1]){
                case "01" : return words[0] + " January " + words[2];
                case "02" : return words[0] + " February " + words[2];
                case "03" : return words[0] + " March " + words[2];
                case "04" : return words[0] + " April " + words[2];
                case "05" : return words[0] + " May " + words[2];
                case "06" : return words[0] + " June " + words[2];
                case "07" : return words[0] + " July " + words[2];
                case "08" : return words[0] + " August " + words[2];
                case "09" : return words[0] + " September " + words[2];
                case "10" : return words[0] + " October " + words[2];
                case "11" : return words[0] + " November " + words[2];
                case "12" : return words[0] + " December " + words[2];
            }
        }
        return null;
    }
}
