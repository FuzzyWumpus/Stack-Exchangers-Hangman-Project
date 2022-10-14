package com.mycompany.hangmanprojectv1;
public class HighScores {
    public String name;
    public Integer score;

    public HighScores(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name; 
    }
    public Integer getScore(){
        return score; 
    }
    @Override
    public String toString()
    {
      return this.getName() + " " + this.getScore();   
    }
 }
