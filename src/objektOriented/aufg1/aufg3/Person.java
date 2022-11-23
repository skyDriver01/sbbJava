package objektOriented.aufg1.aufg3;

public class Person {
    final String username;
    final String password;
    final String email;
    private String creditCard;
    final String creditCardExperation;
    final String creditCardSecurityNumber;
    final boolean subscription;
    final SubscriptionType subscriptionType;

    public enum SubscriptionType {MONTHLY, YEARLY}

    public Movies watchedMovies;

    public Person(String username, String password, String email, String creditCardExperation, String creditCardSecurityNumber,
                  boolean subscription, SubscriptionType subscriptionType, Movies watchedMovies) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.creditCardExperation = creditCardExperation;
        this.creditCardSecurityNumber = creditCardSecurityNumber;
        this.subscription = subscription;
        this.subscriptionType = subscriptionType;
        this.watchedMovies = watchedMovies;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }


    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }


    public boolean isSubscription() {
        return subscription;
    }

    public String getPassword() {
        return password;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public Movies getWatchedMovies() {
        return watchedMovies;
    }

    public void setWatchedMovies(Movies watchedMovies) {
        this.watchedMovies = watchedMovies;
    }
}
