public class Person {

     //Declaring all variables as private for this class only.
     private String firstName;
     private String lastName;
     private String emailAddress;
     private String SSN;
     private String accountName;
 
     public Person(String firstName, String lastName, String emailAddress, String SSN, String accountName ) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.emailAddress = emailAddress;
         this.SSN = SSN;
         this.accountName = accountName;
     }
 
     //Setting all getters and setters.
     public void setFirstName(String firstName) {
        this.firstName = firstName;
     }
 
     public String getFirstName() {
         return firstName;
     }
 
     public void setLastName(String lastName) {
        this.lastName = lastName;
     }
 
     public String getLastName() {
         return lastName;
     }
 
     public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
     }
 
     public String getEmailAddress() {
         return emailAddress;
     }
 
     public void setSSN(String SSN) {
        this.SSN = SSN;
    }
     
     public String getSSN() {
         return SSN;
     }
     
     public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }
    
 
     //Returning variables when called as a string.
     public String toString() {
         return "(" + accountName +") : " + firstName+ " : "+ lastName+ " : " + SSN;
     }

    

}