import java.util.HashMap;
import java.util.Map;

class Cage<T> implements Cloneable{
	
	private int height;
	private int length;
	private int width;
	
	
	
	public Cage(int height, int length, int width) {
		this.setHeight(height); 
		this.setLength(length);
		this.setWidth(width);
	}

	@Override
	public Object clone() {
		
		Object cage = new Object();
		try {
			cage =  super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cage;
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
class LionCage extends Cage<LionCage> {
	
	public LionCage(int height , int length , int width) {
		super(height, length, width);
		
	}

	@Override
	public String toString() {
		return "LionCage [getHeight()=" + getHeight() + ", getLength()=" + getLength() + ", getWidth()=" + getWidth()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
class ElephantCage extends Cage<ElephantCage>{
	
	public ElephantCage(int height , int length , int width) {
		super(height, length, width);
	}

	@Override
	public String toString() {
		return "AnimalCage [getHeight()=" + getHeight() + ", getLength()=" + getLength() + ", getWidth()=" + getWidth()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

	
}


class CageStore {

	private static Map<String , Cage<?>> cages = new HashMap<String, Cage<?>>();
	
	static {
		cages.put("Elephant", new ElephantCage(10, 10, 8));
		cages.put("Lion", new LionCage(5, 5, 3));
	}
	
	public static Cage<?> getCage(String animal) {
		return (Cage<?>)cages.get(animal).clone();
	}
	
}
public class CreateCage {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Cage<ElephantCage> elephantCage = (Cage<ElephantCage>) CageStore.getCage("Elephant");
		Cage<LionCage> lionCage = (Cage<LionCage>) CageStore.getCage("Lion");
		System.out.println(elephantCage);
		System.out.println(lionCage);

	}

}
