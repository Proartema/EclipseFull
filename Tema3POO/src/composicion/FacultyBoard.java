package composicion;

class Professor {
	String name;
	String subject;

	public Professor() {
	}
}

class Student {
	String name;
	String course;

	public Student() {
	}
}

class Staff {
	String name;
	String course;

	public Staff() {
	}
}

public class FacultyBoard {
	private Professor professor, associate, dean;
	private Student student;
	private Staff admin;

	public FacultyBoard(Professor professor, Professor associate, Professor dean, Student student, Staff admin) {
		this.professor = professor;
		this.associate = associate;
		this.dean = dean;
		this.student = student;
		this.admin = admin;
	}
}