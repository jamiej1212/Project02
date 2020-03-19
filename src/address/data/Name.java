package address.data;

public class Name
{
    String firstName;
    String lastName;

    public Name(String firstName, String lastName)
    {
        firstName = firstName;
        lastName = lastName;
    }
    /**
     * Sets first name
     * @param firstName first name of a person to be added to address book
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Gets first name
     * @return first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets last name
     * @param LastName last name of a person to be added to address book
     */
    public void setLastName(String LastName)
    {
        this.lastName = lastName;
    }

    /**
     * Gets last name
     * @return last name
     */
    public String getLastName()
    {
        return lastName;
    }
}
