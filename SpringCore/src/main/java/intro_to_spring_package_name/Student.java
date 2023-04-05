package intro_to_spring_package_name;

public class Student {

	private String name;
	private Scores scores;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public Scores getScores() { return scores; }
	public void setScores(Scores scores) { this.scores = scores; }
	
	@Override
	public String toString() {
		return "Student["+scores+"]";
	}
	
	
	
}
