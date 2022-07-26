package java_sample_oned_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//given a collection of intervals, merge all overlaping intervals
public class Interval {
    int start;
     int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }
public class MergeOverlappingIntervals {
    //sort based on inc order of starting index
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2){
                return (i1.start-i2.start); //if start index of 1st <start index of 2nd, then i1-i2 will be -ve.
                //if it returns -1, then it will not change which is what we want
            }

        });

        int index=0; //initialize 1st one with 0

        for (int i=1; i<intervals.size(); i++) { //start from 2nd one to compare
            if (intervals.get(i).start<=intervals.get(index).end) { //if start of 2nd <=end of 1st, that means it ovelaps
                intervals.get(index).end=Math.max(intervals.get(index).end, intervals.get(i).end);
                //the end of 1st will be =max of end of 1st and max of end of 2nd


            }
            else { //if not overlapping
                index++; //move to 1st index to 2nd and so forth
                intervals.set(index, intervals.get(i));

            }

        }
        ArrayList<Interval>ans=new ArrayList<>();
        for (int i=0; i<=index; i++) {
            ans.add(intervals.get(i));
        }
        return ans;

    }
}
