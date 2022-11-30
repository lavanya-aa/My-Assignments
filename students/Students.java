package students;

public class Students {
	
	
	public int getStudentsInfo(int id) {
		// TODO Auto-generated method stub
return id;
	}
	
	public void getStudentsInfo(int id, String name) {
		System.out.println("id= " +id   + "Name="     +name);
		
	}
	
	public void getStudentsInfo(String email, long phonenumber)
	{
		System.out.println("email:" +email    + "phonenumber="   +phonenumber);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stud = new Students();
		int studentsInfo = stud.getStudentsInfo(123);
		System.out.println(studentsInfo);
		stud.getStudentsInfo(123, "lavanya");
		stud.getStudentsInfo("lavdgenie3101@gmail.com", 9884038832l);

	}

}
