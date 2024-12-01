package Student;

public class Student {
    /*String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
    }

    @Override

    public String toString() {
        return "Tələbənin adı: " + name + ", Tələbənin yaşı : " + age + ",Tələbənin orta qiyməti: " + gpa;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass () != obj.getClass()) return false;

        Student student = (Student) obj;

        return this.name.equals(student.name) && this.age == student.age;
    }
}
