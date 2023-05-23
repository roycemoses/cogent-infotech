package wrapper_classes;

public class ConversionOfAllPrimitivesAndWrappers {

	boolean boolPrimitive = true;
	Boolean BoolObject = Boolean.valueOf(boolPrimitive);
	boolean boolPrimitive2 = BoolObject.booleanValue();
	
	byte bytePrimitive = 20;
	Byte ByteObject = Byte.valueOf(bytePrimitive);
	byte bt2 = ByteObject.byteValue();
	
	char charPrimitive = 128;
	Character CharacterObject = Character.valueOf(charPrimitive);
	char charPrimitive2 = CharacterObject.charValue();
	
	short shortPrimitive = 4096;
	Short ShortObject = Short.valueOf(shortPrimitive);
	short shortPrimitive2 = ShortObject.shortValue();
	
	int intPrimitive = 2147483647;
	Integer IntegerObject = Integer.valueOf(intPrimitive);
	int intPrimitive2 = IntegerObject.intValue();
	
	long longPrimitive = Long.MAX_VALUE;
	Long LongObject = Long.valueOf(longPrimitive);
	long longPrimitive2 = LongObject.longValue();
	
	float floatPrimitive = 7.77f;
	Float FloatObject = Float.valueOf(floatPrimitive);
	float floatPrimitive2 = FloatObject.floatValue();
	
	double doublePrimitive = 777.777;
	Double DoubleObject = Double.valueOf(doublePrimitive);
	double doublePrimitive2 = DoubleObject.doubleValue();
		
	
}
