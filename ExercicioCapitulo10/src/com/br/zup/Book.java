package com.br.zup;

abstract class Book {

    String title;
    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }

}