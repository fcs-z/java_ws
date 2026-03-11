package java2_TreeSet_GenericTest;

/**
 * @author Fcs
 * @description
 * @date 2024-10-24 8:34
 */
public class MyDate implements Comparable<MyDate>{
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    // 方式二
    @Override
    public int compareTo(MyDate o) {
        if(this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }
        if(this.getMonth() != o.getMonth()){
            return this.getMonth() - o.getMonth();
        }
        return this.getDay() - o.getDay();
    }
}
