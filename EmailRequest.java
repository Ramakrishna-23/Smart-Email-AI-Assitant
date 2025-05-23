package com.email.writer;

import lombok.Data;

// this class requests email in a praticular fashion.
@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

    public String getTone(){
       return this.tone;
    }

    public String getEmailContent(){
        return this.emailContent;
    }

}
