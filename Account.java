public class Account {
    
    private String FirstName;
    private String LastName;
    private String EmailAddress;
    private String SocialSecurityNumber;


    public OpenAccount(String FirstName, String LastName, String EmailAddress, String SocialSecurityNumber ) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public String toString() {
        return FirstName+ " : "+ LastName+ " : " +EmailAddress+ " : " +SocialSecurityNumber;
    }

    


    

    

    
}
