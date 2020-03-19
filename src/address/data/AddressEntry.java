package address.data;

public class AddressEntry
{
    Name name;
    Address address;
    String email;
    String phone;
    int id;

    /**
     * Sets name
     * @param name name of a person in the address book
     */
    public void setName(Name name)
    {
        this.name = name;
    }

    /**
     * Gets First name
     * @return to first name after getting first name
     */
    public Name getName()
    {
        return name;
    }

    /**
     * Sets address
     * @param address address of a person in the address book
     */
    public void setAddress(Address address)
    {
        this.address = address;
    }

    /**
     * Gets city address
     * @return to City address after getting city address
     */
    public Address getAddress()
    {
        return address;
    }

    /**
     * Sets email address
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Gets emaill address
     * @return to email address after getting email address
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Sets phone number
     * @param phone
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /**
     * Gets phone number
     * @return to phone number after getting phone number
     */
    public String getPhone()
    {
        return phone;
    }


    /**
     * Sets key for each address
     * @param id keys pointing addresses out
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Gets zip code
     * @return to the zip code after getting zip code
     */
    public int getID()
    {
        return id;
    }
}
