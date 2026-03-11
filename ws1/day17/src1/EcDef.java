/**
 * @author:Fcs
 * @className:EcDef
 * @description:
 * @date:2021/8/7 19:19
 * @version:0.1
 * @since:1.8
 */
public class EcDef extends Exception {
    static final long serialVersionUID = -3387516993124629948L;

    //构造器
    public EcDef(){

    }
    public EcDef(String msg){
        super(msg);
    }
}
