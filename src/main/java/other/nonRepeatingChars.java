package other;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class nonRepeatingChars {

        public static void main(String[] args) {
            String input = "programming";
            String str = "programming";
            // Find non-repeating characters
            List<Character> nonRepeatingChars = input.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)   // Filter out the characters that appear more than once
                    .map(Map.Entry::getKey)                   // Get the non-repeating characters
                    .toList();            // Collect them in a list

            System.out.println("Non-repeating characters: " + nonRepeatingChars);

            Set<Character> s = new HashSet<>();
            Set<Character> s1 = new HashSet<>();
            //Set<Character> set = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
            //System.out.println(set);
            for (char c : str.toCharArray()) {
                if(s.contains(c)) {
                    System.out.println(c);
                } else {
                    s.add(c);
                }

            }

            Set<Character> nonRepeatSet = new HashSet<>();
            Set<Character> repeatSet = new HashSet<>();
            s1 = str.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> {
                                if (nonRepeatSet.contains(c)) {
                                    repeatSet.add(c);
                                    nonRepeatSet.remove(c);
                                    return false;
                                } else {
                                    nonRepeatSet.add(c);
                                    return true;
                                }
                            })
                    .collect(Collectors.toSet());

            System.out.println("repeating characters from string: "+repeatSet);
            System.out.println("Non - repeating characters from string: "+nonRepeatSet);
            
            String string = "hello";
            
            Set<Character> set = new HashSet<>();
            
            for(char c : string.toCharArray()) {
                if ( set.contains(c) ) {
                    set.remove(c);
                } else {
                    set.add(c);
                }
            }
            
            Set<Map.Entry<Character, Long>> se = string.chars()
                            .mapToObj(c -> (char) c)
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                            .entrySet().stream()
                                                    .filter(entry -> entry.getValue() == 1)
                    .collect(Collectors.toSet());// Filter out the characters that appear more than once
                    
            
            System.out.println("================================"+se);
        }
    }