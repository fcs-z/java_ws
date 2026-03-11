/**
 * @author:Fcs
 * @className:StudentTest
 * @description:
 * @date:2021/7/10 17:43
 * @version:0.1
 * @since:1.8
 */
public class StudentTest {
    public  static  void main (String[] args){
        Student[] stus = new Student[20];
        for(int i = 0;i < stus.length;i++){
            stus[i] = new Student();
            stus[i].num = (i+1);
            stus[i].grate = (int)(Math.random()*6+1);
            stus[i].scores = (int)(Math.random()*101+1);
        }

        StudentTest test = new StudentTest();
        //遍历
        test.print(stus);
        /*for(int i = 0;i<stus.length;i++) {
            System.out.println(stus[i].info());
            //System.out.println("学号：" + stus[i].num +" 年级："
            //      + stus[i].grate + " 分数：" + stus[i].scores);
        }*/

        //冒泡，对分数从小到大排序
        test.sort(stus);
       /* for(int i = 0;i < stus.length - 1;i++){
            for(int j = 0;j < stus.length - 1 - i;j++){
                if(stus[j].scores > stus[j+1].scores){
                    Student temp = stus[j];   //交换的是数组元素，而不是分数
                    stus[j] = stus[j+1];
                    stus[j+1] = temp ;
                }
            }
        }*/
       System.out.println("***************************");
        //遍历---分数从小到大的排序结果
        test.print(stus);
        /*for(int i = 0;i<stus.length;i++) {
            System.out.println(stus[i].info());
        }*/
    }


    //************************************************
    //遍历---方法
    public void print(Student[] stus){
        for(int i = 0;i<stus.length;i++) {
            System.out.println(stus[i].info());
        }
    }

    //冒泡，对分数从小到大排序---方法
    public void sort(Student[] stus){
        for(int i = 0;i < stus.length - 1;i++){
            for(int j = 0;j < stus.length - 1 - i;j++){
                if(stus[j].scores > stus[j+1].scores){
                    Student temp = stus[j];   //交换的是数组元素，而不是分数
                    stus[j] = stus[j+1];
                    stus[j+1] = temp ;
                }
            }
        }
    }
}



class Student {
    int num;
    int grate;
    int scores;

    public  String info (){
        return "学号："+num + " 年级：" + grate + " 分数：" + scores;
    }
}

