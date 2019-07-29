package ru.itpark.businesscards.enums;


import lombok.Getter;

public enum ContactTypeEnum {
    MOBILE("smartphone-call.svg"),
    EMAIL("email.svg");
    @Getter
    private String icon;

    ContactTypeEnum(String icon) {
        this.icon = icon;
    }

}
