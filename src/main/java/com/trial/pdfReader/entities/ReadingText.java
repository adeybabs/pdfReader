package com.trial.pdfReader.entities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingText {


        public static void main(String args[]) throws IOException {

            FileOutputStream out;
            PrintStream p;

            //Loading an existing document
            File file = new File("C:/Users/Adey Babs/Downloads/sample.pdf");
            PDDocument document = PDDocument.load(file);

            //Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Create a new file output stream
            // connected to "myfile.txt"
            out = new FileOutputStream("myfile.txt", true);

            // Connect print stream to the output stream
            p = new PrintStream( out );

            //Retrieving text from PDF document
            String text = pdfStripper.getText(document);
            System.out.println(text);

            p.append (text);

            p.close();

            //Closing the document
            document.close();

        }
}
