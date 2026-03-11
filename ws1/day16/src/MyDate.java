/**
 * @author:Fcs
 * @className:MyDate
 * @description:
 * @date:2021/8/2 19:26
 * @version:0.1
 * @since:1.8
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    //
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }
}
