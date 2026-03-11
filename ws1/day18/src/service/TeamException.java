package service;

/**
 * @author:Fcs
 * @className:TeamException
 * @description:
 * @date:2021/8/10 13:49
 * @version:0.1
 * @since:1.8
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -33875169124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
