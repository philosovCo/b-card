package ru.itpark.businesscards.enums;

import lombok.Getter;

@Getter
public enum SocialNetworkTypeEnum {
    VK("vk.com", "vk.svg"),
    INSTAGRAM("instagram.com", "instagram.svq"),
    FACEBOOK("facebook.com", "facebook.svq");

    private String url;
    private String icon;

    SocialNetworkTypeEnum(String url, String icon) {
        this.url = url;
        this.icon = icon;
    }
}
