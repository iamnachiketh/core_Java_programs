package mapexample;

public class Cricket {
	String playerName,role,team;
	int age;
	
	public Cricket(String playerName,String role,String team,int age) {
		this.age = age;
		this.playerName = playerName;
		this.role = role;
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Player Name "+this.playerName+" Role: "+this.role+" Team: "+this.team+
				" Age: "+this.age;
				
	}
	
}
