package java4_CustomGenericMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Fcs
 * @description
 * @date 2024-10-28 8:27
 */
public class Order<T> {
    String name;
    T orderT;

    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<E>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }

    public Order() {
    }

    public Order(String name, T orderT) {
        this.name = name;
        this.orderT = orderT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }
}
