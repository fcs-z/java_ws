/**
 * @author:Fcs
 * @className:MyDate
 * @description:
 * @date:2021/7/29 9:59
 * @version:0.1
 * @since:1.8
 */
public class MyDate {
    int day;
    int month;
    int year;

    //构造器
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //equals() 重写

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof MyDate){
                MyDate myDate = (MyDate)obj;
                return this.day == myDate.day && this.month == myDate.month
                        && this.year == myDate.year;
        }
        return false;
    }
}
