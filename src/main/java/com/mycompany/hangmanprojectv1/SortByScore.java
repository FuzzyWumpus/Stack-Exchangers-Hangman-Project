package com.mycompany.hangmanprojectv1;

import java.util.*;
import java.io.*;

class SortByScore implements Comparator<HighScores> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(HighScores a, HighScores b)
    {
 
        return a.score - b.score;
    }
}
