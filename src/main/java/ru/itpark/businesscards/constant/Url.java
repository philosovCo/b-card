package ru.itpark.businesscards.constant;

public interface Url {

    char SLASH = '/';
    String API = "api";
    String ROOT = SLASH + API + SLASH + Api.VERSION;

    interface Id {
        String PART = SLASH + "{id}";
    }

    interface Cutaway {
        String PART = "card";
        String FULL = ROOT + SLASH + PART;
    }

    interface Person {
        String PART = "person";
        String FULL = ROOT + SLASH + PART;
    }

}
