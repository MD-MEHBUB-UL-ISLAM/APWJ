# Student Marks Card

This project is a basic SpringBoot Application that displays Grade of the student on taking Physics, Chemistry and Maths marks as the input.
It is coded in **Java** and **HTML** and is build using **Maven**.


### Important
Make sure to save the file **[pom.xml](pom.xml)** in order to download **Maven Dependencies**. You can read more about [Maven](http://maven.apache.org/what-is-maven.html) and [pom](http://maven.apache.org/pom.html).

### How It Works

1. It takes input of marks of three subjects- Physics, Chemistry and Maths. *(Yes it can accept decimal inputs too in the intervals of 0.25)*
2. Calculates the total of those three inputs and then calculates the average of the three marks from the total.
3. Using Conditional Statements, it grades the student based on the average calulated.
4. Finally it displays the individual subject marks, total marks and grade obtained in a tabular format.

### How to Run this project
1. You'll have to run the **[StudentMarksApplication.java](StudentMarksApplication.java)** which will activate a localhost server and will give a 4 digit number **80xx** in the console.
2. For viewing the HTML,
   1. Go to your browser and type `localhost:80xx/student-marks-card-html` in the address bar. This should open the first page of the app where you'll have to give the input.
   2. Once you press submit, you'll be shown the marks and grade in tabular format. 
3. For viewing the JSON,
   1. Make sure you have the **[JSON Viewer](https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh)** extension added to your browser.
   2. After that, type `localhost:80xx/student-marks-card-json` in the address bar.
   3. You'll be able to see the program in JSON Format. 

### Credits

This project was done by the three of us- [@Atharva Utekar](https://github.com/AtharvaUtekar), [@Anant Shukla](https://github.com/Anant981) and myself [@Tejas Tawde](https://github.com/curiousTejas)

**THANKS! HAVE A GREAT TIME!**
