package com.rpuzon.machtyper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String username;
    private String content;

    public Message(String content) {
        this.content = content;
    }
}
