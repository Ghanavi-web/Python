class Student {
    String name;
    String dept;
    double CGPA;

    Student(String name, String dept, double CGPA) {
        this.name = name;
        this.dept = dept;
        this.CGPA = CGPA;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + CGPA);
    }
}

class MTech extends Student {
    String specialization;

    MTech(String name, String dept, double CGPA, String specialization) {
        super(name, dept, CGPA);
        this.specialization = specialization;
    }

    void show() {
        super.show();
        System.out.println("Specialization: " + specialization);
    }
}

class BTech extends Student {
    String placement;

    BTech(String name, String dept, double CGPA, String placement) {
        super(name, dept, CGPA);
        this.placement = placement;
    }

    void show() {
        super.show();
        System.out.println("Placement: " + placement);
    }
}

public class StudentInheritance {
    public static void main(String[] args) {
        MTech m1 = new MTech("Ananya", "CSE", 8.9, "AI");
        BTech b1 = new BTech("Karan", "ECE", 8.3, "Infosys");
        m1.show();
        b1.show();
    }
}