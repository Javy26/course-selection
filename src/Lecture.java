
public class Lecture extends Course{

	private int num_students;
	Timeslot timeslot;
	
	
	Lecture(){
		super();
		num_students=0;
		timeslot = new Timeslot();
	
	}

	Lecture(int num_students, Timeslot timeslot){
		super();
		this.num_students = num_students;
		this.timeslot = timeslot;
	}
	Lecture(int num_students, Timeslot timeslot,int code, int duration, int start_time, int end_time, int room_type, String day, String compo_type)
	 {
		 
	  super( code,  duration, start_time,  end_time, room_type,day, compo_type);
		this.num_students = num_students;
		this.timeslot = timeslot;
	}
	
	Lecture(Lecture obj){
		num_students=obj.num_students;
		timeslot=obj.timeslot;
	}
	
	
	public void  setLol(Timeslot timeslot)
	{
		this.timeslot = timeslot;
	}
	
	Timeslot  getLecture()
	{
		return timeslot;
	}

	
	public void setNumStu(int num_stud){
		this.num_students= num_stud;
	}
	public int getNum_stud() {
		return num_students;
	}
}

