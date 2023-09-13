package flipkartProject;

public class InvalidPasswordException extends RuntimeException
{
	int passwordConditionViolated = 0;
    public InvalidPasswordException(int conditionViolated)
    {
        passwordConditionViolated = conditionViolated;
    }
    public String printMessage()
    {
        switch (passwordConditionViolated) 
        {
        case 1:
            return ("Password length should be between 8 to 15 characters");
        case 2:
            return ("Password should not contain any space");
        case 3:
            return ("Password should contain at least one digit(0-9)");
        case 4:
            return ("Password should contain at least one special character");
        case 5:
            return ("Password should contain at least one uppercase letter(A-Z)");
        case 6:
            return ("Password should contain at least one lowercase letter(a-z)");
        }
        return ("");
    }
}
