public class Person {
    
    //Declaring all variables as private.
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String socialSecurityNumber;

    public Person(String firstName, String lastName, String emailAddress, String socialSecurityNumber ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Setting all getters and setters.
    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmailAddress(String emailAddress) {
        emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //Returning variables when called.
    public String toString() {
        return " : " + firstName+ " : "+ lastName+ " : " +socialSecurityNumber;
    }
    
}