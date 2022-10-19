package objektOriented.aufg1.aufg3;

public class StreamingDienst {
    private String username;
    private String password;
    private String email;
    private String creditCard;
    private String creditCardExperation;
    private String creditCardSecurityNumber;
    private boolean subscription;
    private String subscriptionType;

    public StreamingDienst(String username, String password, String email, String creditCard, String creditCardExperation, String creditCardSecurityNumber, boolean subscription, String subscriptionType) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.creditCard = creditCard;
        this.creditCardExperation = creditCardExperation;
        this.creditCardSecurityNumber = creditCardSecurityNumber;
        this.subscription = subscription;
        this.subscriptionType = subscriptionType;
    }

    public StreamingDienst(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCardExperation() {
        return creditCardExperation;
    }

    public void setCreditCardExperation(String creditCardExperation) {
        this.creditCardExperation = creditCardExperation;
    }

    public String getCreditCardSecurityNumber() {
        return creditCardSecurityNumber;
    }

    public void setCreditCardSecurityNumber(String creditCardSecurityNumber) {
        this.creditCardSecurityNumber = creditCardSecurityNumber;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    public String getCreditCard(int i) {
        return this.creditCard;
    }
}
