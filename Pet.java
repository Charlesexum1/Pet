public class Pet {
	
	private String name;
	private int age;
	private double weight;
	
	private static int totalPets = 0;
	private static int totalAge;
	private static double totalWeight;	
	private static double biggest = 1;
	private static double smallest = 1000;
	private static String nameBiggest;
	private static String nameSmallest;
	
	
	public Pet(String newName, int newAge, double newWeight) {
		
		name = newName;
		age = newAge;
		weight = newWeight;
		
		totalPets++;
		totalWeight += newWeight;
		totalAge += newAge;
		
		if (weight > biggest) {
			
			biggest = weight;
			nameBiggest = this.name;
			
			}
		if (weight < smallest) {
			
			smallest = weight;
			nameSmallest = this.name;
			
			}	
		
		}
	
	public void updateInformation(String newName, int newAge, double newWeight) {
		
		name = newName;
		age = newAge;
		weight = newWeight;
		
		}
		
	public static int getAverageAge() {
		return totalAge / totalPets;
		}		
		
	public static double getAverageWeight() {
		return totalWeight / totalPets;
		}
		
	public static String getBiggest() {
		return nameBiggest;
		}
	public static String getSmallest() {
		return nameSmallest;
		}	
				
	
	public static void main(String[] args) {
		
		Pet demo = new Pet("Rocko the Howler", 3, 88.89);
		Pet demo2 = new Pet("Claus", 6, 44.38);
		Pet demo3 = new Pet ("Johan", 4, 20.00);
		System.out.println(getAverageAge());
		System.out.println(getAverageWeight());
		System.out.println(getBiggest());
		System.out.println(getSmallest());  
		
		}
	
	}
