
## JobFull 

> Jobfull is a website where the users can create an account and sign in as a company or a canditate to either add a new job and find new applicants for his company or find jobs and apply to a variety of jobs posted by the companies. The project is developed with Spring Boot (Controller, Repository, Service, Model) and secured with Spring Security using a JWT Token for accessing authentification requests.The frontend is developed with React. 



![jobfull](https://github.com/smyrmnsr/JobFull/blob/applicants-page/jobfull.gif)

## Steps to Setup the Spring Boot Back end app (jobfull-backend)

1. **Clone the application**

   ```bash
   git clone https://github.com/smyrmnsr/jobfull-backend
   cd jobfull-backend
   ```
   
2. **Database is stored on Heroku. If you want to create your own with PostgreSQL:**

   ```bash
   create database jobfull
   ```
   
3. **Change PostgreSQL username and password as per your PostgreSQL installation**

   - open `src/main/resources/application.properties` file.

   - change `spring.datasource.username` and `spring.datasource.password` properties as per your postgresql installation

4. **Run the app**

   You can run backend app in your IDE (all the dependencies are in the pom.xml) 

   The server will start on port 5000.
   
   
## Steps to Setup the React Front end app (jobfull)

1. **Clone the application**

   ```bash
   git clone https://github.com/smyrmnsr/jobfull
   cd jobfull
   ```

2. **Then type the following command to install the dependencies and start the application** - 
   
   ```bash
    npm install && npm start
   ```
   
   The front-end server will start on port `3000`.


## Technologies Used

FRONTEND

![REACT](https://img.shields.io/badge/REACT-black?style=flat&logo=react&logoColor=cyan)
![JAVASCRIPT](https://img.shields.io/badge/-JAVASCRIPT-black?style=flat&logo=javascript)
![CSS3](https://img.shields.io/badge/-CSS3-black?style=flat&logo=css3)
![HTML5](https://img.shields.io/badge/-HTML5-black?style=flat&logo=html5&logoColor=red)
![TAILWINDCSS](https://img.shields.io/badge/TAILWIND_CSS-black?style=flat&logo=tailwind-css&logoColor=cyan)

BACKEND

![NODE.JS](https://img.shields.io/badge/NODE.JS-black?style=flat&logo=node-dot-js&logoColor=green)
![POSTGRESQL](https://img.shields.io/badge/POSTGRESQL-black?style=flat&logo=postgresql&logoColor=blue)
![JAVA](https://img.shields.io/badge/JAVA-black?style=flat&logo=java&logoColor=orange)
![HIBERNATE](https://img.shields.io/badge/HIBERNATE-black?style=flat&logo=Symfony&logoColor=brown)
![SPRING](https://img.shields.io/badge/SPRING-black?style=flat&logo=Symfony&logoColor=green)

The project focused on creating client side and server side. This project also used express for building the server API and postresql database to store the collections and documents containing the data from the users.
The backend part consist in Spring Boot, Spring Security with JWT Token and Hibernate.
The frontend was made with React and stylized with Tailwind CSS framework.
## Author

👤 **Samir Mansour**

- Github: [@smyrmnsr](https://github.com/smyrmnsr)



