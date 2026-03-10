package com.example.techcorp;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("TechCorp", 50000);

        Employee anna = new Employee("Anna", 8, 7000);
        Employee piotr = new Employee("Piotr", 6, 6500);

        company.hire(anna);
        company.hire(piotr);

        Project mobileApp = new Project("Mobile App", 30);
        mobileApp.addEmployee(anna);
        mobileApp.addEmployee(piotr);
        company.startProject(mobileApp);

        Project websiteProject = new Project("Website Revamp", 50);
        websiteProject.addEmployee(anna);
        websiteProject.addEmployee(piotr);
        company.startProject(websiteProject);

        int turns = 0;
        while (!mobileApp.isCompleted()) {
            mobileApp.workOneTurn();
            turns++;
        }

        System.out.println(mobileApp.getName() + "amount of turns : " + turns);
        System.out.println("final : " + mobileApp.getProgress() + "/" + 30);
    }
}