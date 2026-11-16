package homework10.abstractfactory;

public class Owl extends Enchanted {

    public static int nextOwlNum = 1; 
	
    public Owl( String forWhichSchool ) {
        super( forWhichSchool, "Owl" );
        idNum = nextOwlNum++;
    }
}