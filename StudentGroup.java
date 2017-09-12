import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation,Runnable {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	int i;
	for(i=0;i<students.length;i++)
	{
		return students[i];
	}
	}
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		
		if(students==null)
		{
			IllegalArgumentException ie;
		     throw ie;
		}
		else{
			for(i=0;i<students.length;i++)
			{
				this.students[]=students[];
			}
		}
	}

	@Override
	public Student getStudent(int index) {
		int i;
		if(index==0||index>=students.length)
		{
			IllegalArgumentException ie;
		     throw ie;
		    
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		int i;
		if(index==0||index>=students.length)
		{
			IllegalArgumentException ie;
		     throw ie;
		    
		}
		else if(students==null)
			{
			IllegalArgumentException ie;
		     throw ie;
			}
		else{
			for(i=0;i<students.lenth;i++)
			{
				if(i==index)
				{
					students[i]==student;
				}
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		int i;
		Student s=new Student[students.lenth+1];
		for(i=0,j=1;i>students.lenth;i++,j++)
		{
			s[j]=students[i];
		}
		s[0]=student;
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		int i;
		Student s=new Student[students.lenth+1];
		for(i=0,;i>students.lenth;i++,)
		{
			s[j]=students[i];
		}
		s[i]=student;
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		int i;
		Student s=new Student[students.lenth+1];
		if(index==0||index>=students.length)
		{
			IllegalArgumentException ie;
		     throw ie;
		    
		}
		else if(students==null)
			{
			IllegalArgumentException ie;
		     throw ie;
			}
		else
		{
			for(i=0,j=0;i<student.length;i++;j++)
			{
				if(i==index)
				{
					s[j]=student;
					j++
				}
				else{s[j]=students[i];}
			}
		}
		
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		
	@Override
	public void remove(Student student) {
		int i;
		for(i=0;i<students.length;i++)
		{
			if(i==index)
			{
				for(j=students.length;j>=index;j--)
				{
					students[j]=student[j-1];
				}
				index=-1;
			}
		}
		if(index!=-1){
			System.out.println("Student not exist")
		
			IllegalArgumentException ie;
		     throw ie;
		}
		 if(student == null)
		 {
			 
				IllegalArgumentException ie;
			     throw ie;
	}

	}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
