package java1_Enum;

/**
 * @author Fcs
 * @description
 * @date 2024-10-22 8:08
 */
public class Main {
    public static void main(String[] args) {
        MySeason season = MySeason.SUMMER;
        System.out.println(season);
        System.out.println(season.toString());
        season.show();
        System.out.println("----------------------------");
        MySeason season2 = MySeason.AUTUMN;
        System.out.println(season2);
        season2.show();
    }
}