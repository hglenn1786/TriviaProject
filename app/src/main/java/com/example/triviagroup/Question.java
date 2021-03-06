package com.example.triviagroup;

public class Question {

    private String question;
    private String[] answer;
    private String correct;
    private String image;
    public Question(String[] questionA){
        question = questionA[0];
        answer = new String[questionA.length-2];
        correct = questionA[2];
        image = questionA[1];
        String[] temp = new String[questionA.length-2];

        for(int i = 0; i < answer.length; i++ ){
            temp[i] = questionA[i+2];
        }
        int[] used = new int[questionA.length-1];
        for(int i = 0; i < answer.length; i++){
           // temp[i] = questionA[i+1];
            boolean found = true;
            while(found){
                int rand = (int)(Math.random()* answer.length);
                found = false;
                for(int v = 0; v < i; v++){
                    if(used[v]==rand){
                        found = true;
                    }

                }
                if(!found){
                    used[i] = rand;
                    answer[i] = temp[rand];
                }
            }
        }
    }
    public String getCorrectAnswer(){return correct;}

    public String getQuestion(){
        return question;
    }
    public String[] getAnswer(){
        return answer;
    }
    public String getImage(){
        return image;
    }
    }


