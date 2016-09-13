
public class Lab extends Course{

private int num_students;
Timeslot timeslot;
	Lab(){
		
		  super();
		  this.num_students=0;
		  this.timeslot = new Timeslot();
	}
		 
	Lab(int num_students, Timeslot timeslot){
		 super();
		  this.num_students = num_students;
		  this.timeslot = timeslot;
		 }
		 Lab(int num_students, Timeslot timeslot,int code, int duration, int start_time, int end_time, int room_type, String day, String compo_type)
		 {
			 
		  super( code,  duration, start_time,  end_time, room_type,day, compo_type);
		 this.num_students = num_students;
		  this.timeslot = timeslot;
		 }
	
	Lab(Lab obj){
		num_students=obj.num_students;
		timeslot=obj.timeslot;
	}
	
	public void  setAwoe(Timeslot timeslot)
	{
		this.timeslot = timeslot;
	}
	Timeslot  getLab()
	{
		return timeslot;
	}

	
	public void setNumStu(int num_students){
		this.num_students= num_students;
	}
	public int getNum_stud() {
		return num_students;
	}
}


