package com.teksystems;

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public String getBookType() {
        return bookType;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void registerAccount(int age) {
        if (age > 12) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        } else {
            this.age = age;
            System.out.println("You have successfully registered under a Kid Account");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType.equals("Kids")) {
            this.bookType = bookType;
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }

    @Override
    public String toString() {
        return "Age: " + age + "\nBookType: " + bookType;
    }
}
