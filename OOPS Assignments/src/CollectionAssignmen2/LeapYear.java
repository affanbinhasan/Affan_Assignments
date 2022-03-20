package CollectionAssignmen2;

import java.util.*;

public class LeapYear {
    int date,month,year;
    
    public LeapYear(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<LeapYear> dob = new LinkedList<>();
        

        dob.add(new LeapYear(07,12,2000));
        dob.add(new LeapYear(10,03,1999));
        dob.add(new LeapYear(22,04,1998));
        dob.add(new LeapYear(06,07,2008));
        dob.add(new LeapYear(12,10,2011));
        dob.add(new LeapYear(19,05,2012));
        dob.add(new LeapYear(21,01,1992));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : You are not Special.");
            }
            
        }
    }
    
}
