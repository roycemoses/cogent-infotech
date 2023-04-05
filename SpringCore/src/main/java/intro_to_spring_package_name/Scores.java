package intro_to_spring_package_name;

public class Scores {

	private Double mathScore;
	private Double physicsScore;
	private Double chemistryScore;
	
	public Double getMathScore() { return mathScore; }
	public void setMathScore(Double mathScore) { this.mathScore = mathScore; }
	public Double getPhysicsScore() { return physicsScore; }
	public void setPhysicsScore(Double physicsScore) { this.physicsScore = physicsScore; }
	public Double getChemistryScore() { return chemistryScore; }
	public void setChemistryScore(Double chemistryScore) { this.chemistryScore = chemistryScore; }
	
	@Override
	public String toString() {
		return "Scores[math="+this.mathScore+", physics="+this.physicsScore+", chemistry="+this.chemistryScore+"]";
	}
	
	
	
}
