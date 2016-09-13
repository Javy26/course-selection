
public class Rooms {

	
	private int roomtype_num;
	private int room_num;
	private String location;
	private int seat_capacity;
	private String content;

public Rooms(){
	roomtype_num = 0;
	room_num = 0;
	location = "";
	seat_capacity = 0;
	content = "";
}

public Rooms(int roomtype_num, int room_num, String location, int seat_capacity, String content){
	this.roomtype_num=roomtype_num;
	this.room_num= room_num;
	this.location = location;
	this.seat_capacity = seat_capacity;
	this.content = content;	
}

public Rooms (Rooms obj){
	
	roomtype_num=obj.roomtype_num;
	room_num = obj.room_num;
	location = obj.location;
	seat_capacity = obj.seat_capacity;
	content = obj.content;
}

public void setRoomType(int room_type){
	this.roomtype_num = room_type;
}

public void setRoomNum(int room_num){
	this.room_num = room_num;
}

public void setLocation(String location){
	this.location=location;

}

public void setSeatCapacity(int seat_capacity){
	this.seat_capacity=seat_capacity;
}
public void setContent(String content){
	this.content = content;
}
public int getRoomtype_num() {
	return roomtype_num;
}

public int getRoom_num() {
	return room_num;
}

public String getLocation() {
	return location;
}

public String getContent() {
	return content;
}

public int getSeat_capacity() {
	return seat_capacity;
}
}


