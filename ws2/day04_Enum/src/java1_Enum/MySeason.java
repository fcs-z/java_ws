package java1_Enum;

/**
 * @author Fcs
 * @description
 * @date 2024-10-22 8:11
 */
public enum MySeason implements Info{
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"){
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER("冬天");

    MySeason(String 春天) {
    }

    @Override
    public void show() {
        System.out.println("季节");
    }
}

