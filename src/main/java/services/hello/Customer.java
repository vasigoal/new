package services.hello;

import org.springframework.data.annotation.Id;

/**
 * Created by anva on 17/10/2015.
 */
public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return(String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName));
    }

}
