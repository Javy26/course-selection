
public class Student {
	
private int studentid;
private int dob;
private int level;
private String firstName;
private String lastName;



public Student(){
	studentid =0;
	dob=0;
	level=0;
	firstName="";
	lastName="";
	
}
public Student(int sid, int d, int l, String f, String ln){
	
	studentid=sid;
	dob=d;
	level=l;
	firstName=f;
	lastName=ln;
}
public Student(Student obj){
	studentid=obj.studentid;
	dob=obj.dob;
	level=obj.level;
	firstName=obj.firstName;
	lastName=obj.lastName;
}


public void setStudentid(int k){
	
	studentid = k;
}

public void setDob(int d){
	dob=d;
}

public void setLevel(int le){
	level=le;
}

public void setFirstName(String fn1){
	firstName = fn1;
}
public void setLastName(String ln){
	lastName = ln;
}

public int getStudentid() {
	return studentid;
}

public int getDob() {
	return dob;
}
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public int getLevel() {
	return level;
}

}
