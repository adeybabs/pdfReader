# <h1>pdfReader</h1>
The aim of this project is to read a pdf file, extract text from the table and convert to json
The ReadingText.java class contains the code for parsing the pdf

* Edit
    * I deleted the said file (ReadingText.java)
    * Start the application, it will run on `localhost:8080`
    * Send a `POST` request to the URL `localhost:8080\pdf\read`
      * Body of the post request will be:
          ```
        {
        "filePath": "C:/Users/Adey Babs/Downloads/sample.pdf"
        }
        ```
