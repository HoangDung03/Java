package model;

public class MyNotepad {
    private String fileName;
    private String content;

    public MyNotepad() {
        this.fileName = "";
        this.content = "";
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
