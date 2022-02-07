package com.trial.pdfReader.controller;

/**
 * I created this object, so that we can use it to safely specify the path where the file resides
 *
 * @author chriseteka
 */
public class AppRequestObject {

    //Please specify the full file pathName, i.e "C:/Users/Adey Babs/Downloads/sample.pdf"
    private String filePath;

    public AppRequestObject() {
    }

    public AppRequestObject(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
