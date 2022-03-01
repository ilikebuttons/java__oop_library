package com.teksystems;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kid = new KidUser();
        System.out.println("____Kid______________");
        kid.registerAccount(18);
        kid.registerAccount(10);
        kid.requestBook("Fiction");
        kid.requestBook("Kids");
        System.out.println();
        System.out.println(kid);
        System.out.println();

        System.out.println("____Adult____________");
        AdultUser adult = new AdultUser();
        adult.registerAccount(5);
        adult.registerAccount(23);
        adult.requestBook("Kids");
        adult.requestBook("Fiction");
        System.out.println();
        System.out.println(adult);
        System.out.println();
    }
}
