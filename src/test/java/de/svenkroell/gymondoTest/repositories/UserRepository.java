package de.svenkroell.gymondoTest.repositories;

import de.svenkroell.gymondoTest.Constants;
import de.svenkroell.gymondoTest.model.User;

public class UserRepository {
    public User getStandardUser() {
        return new User(Constants.EXISTING_USER_EMAIL, Constants.EXISTING_USER_PASSWORD);
    }

}
