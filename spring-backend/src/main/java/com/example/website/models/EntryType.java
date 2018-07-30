package com.example.website.models;

public enum EntryType {
    COMMENT("COMMENT"),
    POST("POST"),
    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    MEME("MEME");

    private final String name;

    EntryType(final String name){
        this.name = name;
    }
}
