
public class College {

	public static void main(String[] args) {
		Student Ivan = new Student("Ivan", "Math", 18);
		Student Penko = new Student("Penko", "Math", 18);
		Student Silvi = new Student("Silvi", "Math", 18);
		Student Slavena = new Student("Slavena", "Math", 18);
		Student Vanq = new Student("Vanq", "Math", 18);
		Student Kiro = new Student("Kiro", "Math", 18);
		
		StudentGroup sg1 = new StudentGroup("Math");
		
		Silvi.receiveScholarship(4, 200);
		Vanq.upYear();
		Slavena.grade = 6;
		
		sg1.addStudent(Ivan);
		sg1.addStudent(Penko);
		sg1.addStudent(Slavena);
		sg1.addStudent(Vanq);
		sg1.addStudent(Kiro);
		sg1.addStudent(Silvi);
		
		sg1.theBestStudent();
		
		System.out.println("DONE");
		
		
		
	}

}
