package abstraction;

public interface Bicycle {

	abstract void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
	
}
