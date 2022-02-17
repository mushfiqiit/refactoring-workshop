package TriviaGameClasses;

import java.util.LinkedList;

public abstract class Question {
    LinkedList questionLinkedList;
    public Question()
    {
        questionLinkedList=new LinkedList<>();
        for(int i=0;i<50;i++)
        {
            questionLinkedList.add(createQuestion(i));
        }
    }

    public String createQuestion(int index)
    {
        return "";
    }

    public removeFirst()
    {
        questionLinkedList.removeFirst();
    }

}
