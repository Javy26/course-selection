
public class Timeslot {
	private int course_code;
	private int duration;
	private int start_time;
	private int end_time;
	private int room_num;
	private String day;
	private String component_type;

	
	Timeslot(){
		course_code = 0;
		duration =0;
		start_time=0;
		end_time=0;
	    room_num=0;
		day="";
		component_type="";
	}
	Timeslot(int cc, int dr, int st, int et, int rn, String d, String ct){
		course_code = cc;
		duration =dr;
		start_time=st;
		end_time=et;
	    room_num=rn;
		day=d;
		component_type=ct;
	}
	Timeslot(Timeslot obj){
		course_code = obj.course_code;
		duration =obj.duration;
		start_time=obj.start_time;
		end_time=obj.end_time;
	    room_num=obj.room_num;
		day=obj.day;
		component_type=obj.component_type;
	
}
	
public void setCoursecode(int course_code){
	this.course_code =course_code;
	
}
public void setDuration(int duration){
	this.duration = duration;
}

public void setStartTime(int start_time){
	
	this.start_time=start_time;

}

public void setEndTime(int end_time){
	this.end_time=end_time;
}

public void setRoomNum(int room_num){
	
	this.room_num=room_num;
}

public void setDay(String day){
	this.day=day;
}
public void setComponentType(String component_type){
	this.component_type=component_type;
}

public int getCourse_code() {
	return course_code;
}

public int getDuration() {
	return duration;
}

public int getStart_time() {
	return start_time;
}

public int getEnd_time() {
	return end_time;
}

public int getRoom_num() {
	return room_num;
}

public String getDay() {
	return day;
}

public String getCompo_type() {
	return component_type;
}

}


