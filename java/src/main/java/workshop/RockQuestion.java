package TriviaGameClasses;

public class RockQuestion extends Question {

    public RockQuestion()
    {
        super();
    }

    public String createQuestion(int index)
    {
        return "Rock Question " + index;
    }
}
