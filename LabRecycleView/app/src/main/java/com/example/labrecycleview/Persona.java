package com.example.labrecycleview;

import java.util.ArrayList;
import java.util.List;

class Persona {
     String name;
     String age;
     int photoId;

     public Persona(String name, String age, int photoId) {
         this.name = name;
         this.age = age;
         this.photoId = photoId;
     }



     private List<Persona> persons;
     private void initializeData(){
         persons = new ArrayList<>();
         persons.add(new Persona("Emma Wilson", "23 years old", R.drawable.emaa));
         persons.add(new Persona("Lavery Maiss", "25 years old", R.drawable.lavery));
         persons.add(new Persona("Lillie Watts", "35 years old", R.drawable.lillie)); }


 }
