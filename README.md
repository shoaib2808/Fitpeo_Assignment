## Understanding the code flow

 The assignment consist of automating a web page 

In this project i have used MAVEN as a build tool and utilised cucumber and selenium for automation , i have used edgedriver for automating the web page but this project can be used with other web derivers also.

All the testing code is present under the folder "src/test/java"
![image](https://github.com/user-attachments/assets/f6252ea7-b50a-4ac6-b630-ea7d6bf38a0d)

#FEATURE FILE
The code is written using cucumber framework , the test.feature , eaturefile consist all the steps of the test
![image](https://github.com/user-attachments/assets/c586ef21-3fb4-4cfa-ae1e-2b9b75ff310e)

There is a stepdefinition file and a page file associated with the feature file , i have developed a separate page file , following the standard page object model design pattern.

## HOW TO RUN THE TEST CASE
# PREREQUSITE
1. JAVA
2. EDGEDRIVER
# STEPS
1.Clone the project into your local system.

2.you will get a maven project with all required dependencies and a edge driver needed to automate it.

3.build the project using maven build command

4.install cucumber plugin from eclipse market place(specifically for eclipse) and then convert the project to a cucumber project as shown below
![image](https://github.com/user-attachments/assets/c38a7ab0-ed4e-4a25-bbd3-e5e54afac1c8)

5. Right click on feature file and run the file as a cucumber test


# Testcase flow
1. Navigate to homepage and clicked Revenu caluclator page
2. scroll down till the slider and adjust the slider to value of 870 , then set the value to 560 using the text input box provided.
3. scroll down further and select checkboxes based on condition given in the assignment
4. when all done fetch the value of total revenue collected from the header section
5. Assert the value with the expected value
6. Close the browser.





