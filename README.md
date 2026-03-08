# Java Array Program CI/CD using Jenkins
![Java](https://img.shields.io/badge/Language-Java-orange)
![Jenkins](https://img.shields.io/badge/CI-CD-Jenkins-red)
![DevOps](https://img.shields.io/badge/Project-DevOps-blue)

## Project Overview
This project demonstrates how a simple **Java program** can be integrated with **Jenkins** to automate the build and execution process using a **CI/CD pipeline**.

The Java programs perform basic array operations such as:
- Identifying vowels in an array
- Reversing elements in an array

Jenkins automatically builds and executes the program whenever changes are pushed to GitHub.

---

## Technologies Used

- Java
- Jenkins
- Git
- GitHub
- CI/CD Pipeline

---

## Project Structure

java-array-project
│
├── arvowel.java
├── reversearr.java
├── arvowel.class
├── jenkins-dashboard-build-success.png
└── README.md

---

## CI/CD Pipeline using Jenkins

Steps performed by Jenkins:

1. Pulls code from GitHub repository
2. Compiles the Java program
3. Executes the program
4. Displays build status in Jenkins Dashboard

---

## Jenkins Build Success

!jenkins_dashboard-build-sucess.png
---

## How to Run Locally

Clone the repository

```
git clone https://github.com/your-username/java-array-project.git
```

Navigate to project folder

```
cd java-array-project
```

Compile the Java program

```
javac arvowel.java
javac reversearr.java
```

Run the program
```
java arvowel
java reversearr
```
---
## Program Output 
The execution output of the java programs is avaliable in :
output.txt

## Future Improvements

- Add Jenkinsfile for pipeline automation
- Add unit testing
- Docker integration
- Automated deployment

---

## Author

Madhu  
DevOps Enthusiast
