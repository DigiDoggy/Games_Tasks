package QuizGame;

public class Question {

    private String text;
    private String[] answers;
    private String rightAnswer;

    //Getters and Setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    //Contractors

    public Question(String text,String... answers){
        this.text=text;
        this.answers=answers;
        this.rightAnswer=answers[0];

        //Resort string answers ( because first is rightAnswer ).

        for(int i = 0; i < answers.length; i++){
            int random = (int)(Math.random()*answers.length);
            String str = answers[i];
            answers[i] = answers[random];
            answers[random] = str;
        }
    }



}
