
public class Course {

	private int code;
	private int duration;
	private int start_time;
	private int end_time;
	private int room_type;
	private String day;
	private String component_type;

	
	public Course(){
		code =0;
		duration = 0;
		start_time = 0;
		end_time=0;
		room_type=0;
		day = "";
		component_type="";
	}
	public Course(int code, int duration, int start_time, int end_time, int room_type, String day, String combo_type){
		  this.code =code;
		  this.duration = duration;
		  this.start_time = start_time;
		  this.end_time=end_time;
		  this.room_type=room_type;
		  this.day = day;
		  this.component_type=combo_type;
		 }
		
	
	public Course(Course obj){
		
		code =obj.code;
		duration = obj.duration;
		start_time = obj.start_time;
		end_time=obj.end_time;
		room_type=obj.room_type;
		day = obj.day;
		component_type= obj.component_type;		
	}
	
	
public void setCode(int code) {
	this.code = code;
}

public void setDuration(int duration){
	
	this.duration = duration;
	
}

public void setStart_time(int start_time){
	this. start_time=start_time;
}

public void setEnd_time(int end_time){
	this. end_time=end_time;
}

public void setRoomtype(int room_type){
	this.room_type=room_type;
}

public void setDay(String day){
	this.day=day;
}

public void setCombo_type(String component_type) {
	this.component_type = component_type;
}

public int getCode() {
	return code;
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

public int getRoom_type() {
	return room_type;
}

public String getDay() {
	return day;
}

public String getCombo_type() {
	return component_type;
}
}
