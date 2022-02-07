package com.trial.pdfReader.controller;

import com.trial.pdfReader.entities.SampleModel;
import com.trial.pdfReader.utils.FileReader;
import org.springframework.web.bind.annotation.*;

/**
 * Well, since this is a spring boot application we might as well create endpoints to help us send in the file and expect an output
 *
 * @author chriseteka
 */
@RestController
@RequestMapping("/pdf")
public class AppController {

    private final FileReader fileReader;

    //Since you don't have lombok, I have injected the file reader class as it should be
    public AppController(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    @PostMapping(value = "/read", produces = "application/json", consumes = "application/json")
    public SampleModel readFileAndGiveResults(@RequestBody AppRequestObject appRequestObject) {
        return fileReader.read(appRequestObject.getFilePath());
    }
}
