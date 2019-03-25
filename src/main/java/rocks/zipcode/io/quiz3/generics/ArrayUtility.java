package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType thing : array){
            if(getNumberOfOccurrences(thing)%2 !=0){
                return thing;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType thing : array){
            if(getNumberOfOccurrences(thing)%2 ==0){
                return thing;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for(SomeType thing: array){
            if(valueToEvaluate.equals(thing)){
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> newList = new ArrayList<>();
        for(SomeType thing : array){
            if(predicate.apply(thing)){
                newList.add(thing);
            }
        }

        if (array[0] instanceof String) {
            String[] strings = newList.toArray(new String[newList.size()]);
            return (SomeType[]) strings;
        } else {
            Integer[] ints = newList.toArray(new Integer[newList.size()]);
            return (SomeType[]) ints;
        }
    }
}
