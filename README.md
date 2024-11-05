# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As a movie director, <br> 
> I want to know the information, especially the genre, of the highest grossing movies, <br> 
> so that I can create a successful movie of my own. 

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Example: 

Dataset: https://www.kaggle.com/datasets/sanjeetsinghnaik/top-1000-highest-grossing-movies 
- **Title** (String) - name of the movie 
- **Year** (int) - Year it was released 
- **Domestic Opening (in $)** (int) - Money grossed on opening 
- **World Wide Sales (in $)** (double) - Money grossed world wide in billions
- **Genre** (String) - Genres of each movie

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML diagram](<Copy of (Unit 3) UML Diagram.png>) 

## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

My User Story gets information about specific movies that have grossed the most money, genres that have grossed the most money, and how much money certain genres have made. The user can get all the information on a random movie by inputting a random number(1-1000) into the scanner which then uses a toString method to print all the information on the movie. The user can get genres that made the most money by having a method that traverses the genres looking for the first genre that is listed. It then counts the amount of times a certain genre was listed first and prints it out. The user can see how much money a specific genre made by inputting a number that corresponds to a genre. This starts a method that will get the first genre again, and add all of the money a genre has made world wide. This is all made possible using a Scanner that depends on user input which are numbers that correspond to certain actions. This will address my user's goals because it will provide all the information that they need to make a sucessful movie on their own.