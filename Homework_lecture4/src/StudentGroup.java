
public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String groupSubject){
		this();
		this.groupSubject = groupSubject;
	}
	
	 void addStudent(Student s) {
		 if (s.subject == this.groupSubject && this.freePlaces >= 1) {
			 for (int i = 0; i < this.students.length; i++) {
				if (this.students[i] == null){
					this.students[i] = s;
					this.freePlaces -= 1;
					break;
				}
			}
		 }
		 else {
			System.out.println("There are no more places in this group.");
		 }
	 } 
	 
	 void emptyGroup() {
		 for (int i = 0; i < this.students.length; i++) {
				this.students[i] = null;
		 }
		 this.freePlaces = 5;
	 }
	 
	 void theBestStudent() {
		double maxGrade = 0;
		Student bestStudent = null;
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].grade > maxGrade) {
				maxGrade = this.students[i].grade;
				bestStudent = this.students[i];
			}
		}
		System.out.println(bestStudent.name);
	 } 
	 
	 void printStudentsInGroup() {
		 for (int i = 0;  i < students.length; i++) {
			System.out.println(this.students[i].name);
			System.out.println(this.students[i].age);
			System.out.println(this.students[i].grade);
			System.out.println(this.students[i].money);
			System.out.println(this.students[i].subject);
			System.out.println(this.students[i].isDegree);
		}
		 
	 }
}
