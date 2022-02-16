public class BuzzPatternMatcher implements PatternMatcher {
    public boolean matches(int number)
    {
        return (number%5==0);
    }

    public String getResponse()
    {
        return "Buzz";
    }
}
