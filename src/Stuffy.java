
public class Stuffy {
	
	private int id;
	private String name;
	private String type;
	private String color;
	
	//constructor
	public Stuffy(String inName, String inType, String inColor) {
		id = 0;
		name = inName;
		type = inType;
		color = inColor;
	}
	
	public int getId(int inID) {
		return id;
		
	}
	
	public void setID(int inId) {
		id = inId;
	}
	
	public String getName(String inName) {
		return name;
		
	}
	
	public void setName(String inName) {
		name = inName;
	}
	
	
	public String getType(String inType) {
		return inType;
		
	}
	
	public void setType(String inType) {
		type = inType;
	}
	//
	public String getColor() {
		return color;
		
	}
	
	public void setColor(String inColor) {
		color = inColor;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + "]";
	}

	
}
