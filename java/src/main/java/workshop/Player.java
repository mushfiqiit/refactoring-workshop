package TriviaGameClasses;

public class Player {
    private String Name;
    private int place;
    private int purse;
    private boolean inPenaltyBox;
    public Player()
    {

    }
    public setName(String Name)
    {
        this.Name=Name;
    }

    public String getName()
    {
        return this.Name;
    }

    public setPlace(int place)
    {
        this.place=place;
    }

    public addToPlace(int number)
    {
        this.place+number;
    }

    public modPlace(int number)
    {
        this.place%=number;
    }

    public int getPlace()
    {
        return place;
    }

    public void setPurse(int purse)
    {
        this.purse=purse;
    }

    public Integer getPurse()
    {
        return this.purse;
    }

    public void setInPenaltyBox(boolean inPenaltyBox)
    {
        this.inPenaltyBox=inPenaltyBox;
    }

    public boolean getInPenaltyBox()
    {
        return this.inPenaltyBox;
    }

    public void increasePurseByOne()
    {
        this.purse++;
    }
}
