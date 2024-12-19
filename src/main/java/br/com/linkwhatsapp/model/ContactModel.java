package br.com.linkwhatsapp.model;

public class ContactModel {
    private String number;
    private String text;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ContactModel() {}
    public ContactModel(String text, String number) {
        this.text = text;
        this.number = number;
    }
}
