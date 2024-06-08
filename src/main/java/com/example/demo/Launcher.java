package com.example.demo;

public class Launcher{
    public static void main(String[] args) {
//load the Spring XML configuration
        ApplicationContext context = new
                ClassPathXmlApplicationContext("exam.xml");
// retrieve the Student bean from the context
        StudentRepo studentrep = context.getBean("studentrepo",
                StudentRepo.class);
// use the student object
        studentrep.setid(id:1);
        studentrep.setname(name:ababe);
        studentrep.setemail(email:abebe);

    }
}