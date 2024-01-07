import java.security.*;

public class GenerateRandomNumberType1 {

	public static void main(String[] args) {
		
		// Create a SecureRandom instance
        SecureRandom sr = new SecureRandom();
        
        // Generate a random integer
        int randomValue = sr.nextInt();
        
        System.out.println("The generated random value is " + randomValue);
  
	}

}

//SAMPLE OUTPUTS:
//The generated random value is 1178464571
//The generated random value is -311150625
//The generated random value is 237849704
