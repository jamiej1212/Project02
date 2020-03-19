package address.data;

public class Address
{
    String street;
    String city;
    String state;
    int zip;

    /**
     * Sets street address
     * @param street street address
     */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /**
     * Gets street address
     * @return street address
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * Sets city address
     * @param city city address
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * Gets city address
     * @return city address
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets state
     * @param state state
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * Gets state
     * @return state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets zip code
     * @param zip zip code
     */
    public void setZip(int zip)
    {
        this.zip = zip;
    }

    /**
     * Gets zip code
     * @return zip code
     */
    public int getZip()
    {
        return zip;
    }
}
