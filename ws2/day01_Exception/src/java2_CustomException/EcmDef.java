package java2_CustomException;

/**
 * @author:Fcs
 * @className:EcmDef
 * @description:
 * @date:2021/8/7 19:16
 * @version:0.1
 * @since:1.8
 */
public class EcmDef {
    public static void main(String[] args)  {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i,j);
            System.out.println(result);
        } catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e){
            System.out.println("除0");
        }catch(EcDef ecDef) {
            System.out.println(ecDef.getMessage());
        }
    }

    public static int ecm(int i,int j) throws  EcDef{
        if (i < 0 || j < 0){
            throw new EcDef("分子或者分母为负数");
        }
        return i/j;
    }
}
