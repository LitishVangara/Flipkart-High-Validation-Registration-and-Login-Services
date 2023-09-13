package flipkartProject;

import flipkartProject.FlipkartMainMethod;

public class PasswordValidation 
{
	public static void isValid(String password)
	        throws InvalidPasswordException
	    {
	        if (!((password.length() >= 8) && (password.length() <= 15))) 
	        {
	            throw new InvalidPasswordException(1);
	        }
	        if (password.contains(" ")) 
	        {
	            throw new InvalidPasswordException(2);
	        }
	        if (true) 
	        {
	            int count = 0;
	            for (int i = 0; i <= 9; i++) 
	            {
	                String str1 = Integer.toString(i);
	                if (password.contains(str1)) 
	                {
	                    count = 1;
	                }
	            }
	            if (count == 0) 
	            {
	                throw new InvalidPasswordException(3);
	            }
	        }
	        if (!(password.contains("@") || password.contains("#")
	           || password.contains("!") || password.contains("~")
	           || password.contains("$") || password.contains("%")
	           || password.contains("^") || password.contains("&")
	           || password.contains("*") || password.contains("(")
               || password.contains(")") || password.contains("-")
	           || password.contains("+") || password.contains("/")
	           || password.contains(":") || password.contains(".")
	           || password.contains(", ") || password.contains("<")
	           || password.contains(">") || password.contains("?")
	           || password.contains("|"))) 
	        {
	            throw new InvalidPasswordException(4);
	        }
	        if (true) 
	        {
	            int count = 0;
	            for (int i = 65; i <= 90; i++) 
	            {
	                char c = (char)i;
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) 
	                {
	                    count = 1;
	                }
	            }
	            if (count == 0) 
	            {
	                throw new InvalidPasswordException(5);
	            }
	        }
	        if (true) 
	        {
	            int count = 0;
	            for (int i = 90; i <= 122; i++) 
	            {
	                char c = (char)i;
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) 
	                {
	                    count = 1;
	                }
	            }
	            if (count == 0) 
	            {
	                throw new InvalidPasswordException(6);
	            }
	        }
	    }
		public static int Validator = 0;
	    public static int passValidator(int valid)
	    {
	    	Validator = valid;
	    	String passwordValidator = flipkartProject.FlipkartMainMethod.cpassword;
	        try 
	        {
	            isValid(passwordValidator);
	            Validator = 1;
	        }
	        catch (InvalidPasswordException e) 
	        {
	        	System.out.println("Invalid Password.");
	            System.out.println(e.printMessage());
	            e.printStackTrace();
	        }
	        return Validator;
	    }
}
