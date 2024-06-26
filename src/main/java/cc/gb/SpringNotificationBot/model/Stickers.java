package cc.gb.SpringNotificationBot.model;

import lombok.Getter;

/**
 * Enum который отвечает за поддержку стикеров в боте
 */

@Getter
public enum Stickers {
    Hi("CAACAgIAAxkBAAEE4elmJSYBO8zdAAE573SZf6DPa3aELgYAAsc2AAKOXMhLpzv24JJHuho0BA");
    private String key;

    Stickers(String key) {
        this.key = key;
    }
}
