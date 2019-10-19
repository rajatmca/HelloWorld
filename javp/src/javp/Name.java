package javp;

import java.util.*; 
public class Name { 
    private final String first, last; 
    public Name(String first, String last1) 
    { 
        this.first = first; 
        this.last = last1; 
    } 
    public boolean equals(Object o) 
    { 
        if (!(o instanceof Name)) 
            return false; 
        Name n = (Name)o; 
        return n.first.equals(first) && n.last.equals(last); 
    } 
    public static void main(String[] args) 
    { 
        Set<Name> s = new HashSet<Name>(); 
        s.add(new Name("Shubham", "Juneja")); 
        System.out.println( 
            s.contains(new Name("Shubham", "Juneja"))); 
    } 
} 