package TriviaGameClasses;

public class PopQuestion extends Question {

    public PopQuestion()
    {
        super();
    }

    public String createQuestion(int index)
    {
        return "Pop Question " + index;
    }
}
