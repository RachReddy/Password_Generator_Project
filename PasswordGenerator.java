//This code generates a random password of a specified length, combining uppercase letters, lowercase letters, numbers, and special characters.

public class PasswordGenerator {
	
	private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC_CHARACTERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'<>,.?/";
    
    private static final String ALL_CHARACTERS = UPPERCASE_CHARACTERS + LOWERCASE_CHARACTERS + NUMERIC_CHARACTERS + SPECIAL_CHARACTERS;

    //Main Method
	public static void main(String[] args) 
	{		
		int passwordLength = 12; // You can read this to your desired password length
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("The newly generated Password is : " + generatedPassword);       
    }
	
	private static String generatePassword(int length)
	{		 
		 StringBuilder password = new StringBuilder();
		 
		// Ensure at least one character from each character set
	      password.append(getRandomChar(UPPERCASE_CHARACTERS));
	      password.append(getRandomChar(LOWERCASE_CHARACTERS));
	      password.append(getRandomChar(NUMERIC_CHARACTERS));
	      password.append(getRandomChar(SPECIAL_CHARACTERS));
     
	   // Generate remaining characters randomly
          for (int i = 4; i < length; i++) 
          {
            int randomIndex = (int) (Math.random() * ALL_CHARACTERS.length());
            char randomChar = ALL_CHARACTERS.charAt(randomIndex);
            password.append(randomChar);
          }

        return password.toString();
	 }
	
	private static char getRandomChar(String characterSet)
	{
		//Random Index Generation: It generates a random index within the range of the ALL_CHARACTERS string.
        int randomIndex = (int) (Math.random() * characterSet.length());  // Math.random() generates a random double value between 0 (inclusive) and 1 (exclusive) and is multiplied by the length of passed characterSet, and then casts it to an integer to get a valid index.       
        char randomChar = characterSet.charAt(randomIndex);       
        return randomChar;
    }
	
}

//SAMPLE OUTPUTS:
//The newly generated Password is : Pi2<XnMrl^+*
//The newly generated Password is : Vf2=(%b%h^)K
//The newly generated Password is : Cx7>W&.X(l|F
