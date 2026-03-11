/**
 * @author:Fcs
 * @className:Worker
 * @description:
 * @date:2021/8/1 13:00
 * @version:0.1
 * @since:1.8
 */
class Worker extends Person{

    @Override
    public void eat() {
        System.out.println("Worker eat");
    }

    public void breath(){
        System.out.println("Worker breath");
    }
}