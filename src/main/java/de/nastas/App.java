package de.nastas;

import com.google.gson.Gson;

public class App {
    public static void main( String[] args ) {

        Person person = new Person("Vlad", 23, "developer");
        System.out.println(person);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("Output info in json format: " + json);
    }

}