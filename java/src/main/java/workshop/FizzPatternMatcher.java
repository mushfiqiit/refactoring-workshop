public class FizzPatternMatcher implements PatternMatcher{
    public boolean matches(int number)
    {
        return (number%3==0);
    }

    public String getResponse()
    {
        return "Fizz";
    }
}
