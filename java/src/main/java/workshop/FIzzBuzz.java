//package workshop.fizzBuzz;

import java.util.*;

/**
 * Requirements:
 * For factor of three print Fizz instead of the number
 * For factor of five print Buzz instead of the number
 * For numbers which are factors of both three and five print fizzBuzz instead of the number
 */
public class FizzBuzz {
    private final List<PatternMatcher> patternMatchers;

    public FizzBuzz()
    {
        patternMatchers = new ArrayList<>();
        
        PatternMatcher fizzPatternMatcher = new FizzPatternMatcher();
        PatternMatcher buzzPatternMatcher = new BuzzPatternMatcher();
        patternMatchers.add(fizzPatternMatcher);
        patternMatchers.add(buzzPatternMatcher);
    }

    public String say(int number) 
    {
        String stringToReturn ="";

        for (PatternMatcher patternMatcher: patternMatchers) 
        {
            if (patternMatcher.matches(number)) 
            {
                stringToReturn += patternMatcher.getResponse();
            }
        }

    
        if(returnString.isEmpty()) return String.valueOf(number);
        else return returnString;
    }
}