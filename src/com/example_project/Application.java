package com.example_project;




public class Application {
	public static void main(String[] args) {
		System.out.println("Git project");
		System.out.println("Login feature");
	}
}

class LoginApplication extends Application {

    public void displayMessage() {
        System.out.println("This is from LoginApplication subclass");
    }

    public static void main(String[] args) {
        Application.main(args);

        LoginApplication obj = new LoginApplication();
        obj.displayMessage();
    }
}