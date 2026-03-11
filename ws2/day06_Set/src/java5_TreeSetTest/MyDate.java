package java5_TreeSetTest;

/**
 * @author Fcs
 * @description
 * @date 2024-10-24 8:34
 */
public class MyDate implements Comparable{
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
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate m = (MyDate)o;
            if(this.getYear() != m.getYear()){
                return this.getYear() - m.getYear();
            }
            if(this.getMonth() != m.getMonth()){
                return this.getMonth() - m.getMonth();
            }
            return this.getDay() - m.getDay();
        }
        return 0;
    }
}
