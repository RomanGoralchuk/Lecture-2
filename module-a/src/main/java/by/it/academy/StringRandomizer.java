package by.it.academy;

import java.util.UUID;

public class StringRandomizer {
    public String randomString() {
        return UUID.randomUUID().toString();
    }
}
