package CustomersMetier;

import java.security.*;

/**
 * The type Customers.
 */
public class Customers
{
    private int id;
    private String fullname, password, email, country;

    /**
     * Gets id.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return name
     */
    public String getName() {
        return fullname;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.fullname = name;
    }

    /**
     * Gets password.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

//    private String md5(String password) {
//        byte[] byteChaine = password.getBytes(UTF-8);
//        MessageDigest md = MessageDigest.getInstance(MD5);
//        byte[] hash = md.digest(byteChaine);
//        return hash;
//    }

    /**
     * Gets email.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        if ((email != null)) {
            this.email = email;
        }
    }

    /**
     * Gets country.
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        if ((country != null)) {
            this.country = country;
        }
    }
}