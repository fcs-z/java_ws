package java7_GenericPractice;

import java.util.*;

/**
 * @author Fcs
 * @description 这里 T 指的是User类
 * @date 2024-10-30 16:43
 */
public class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    // 保存T类型对象搭配Map成员变量中
    public void save(String id, T entiry){
        map.put(id,entiry);
    }

    // 从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }

    // 替换map中key为id的内容，改为entity对象
    public void update(String id, T entiry){
        if(map.containsKey(id)){
            map.put(id,entiry);
        }
    }

    // 返回map中存放的所有T对象
    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for(T value : values){
            list.add(value);
        }
        return list;
    }

    // 删除指定id对象
    public void delete(String id){
        map.remove(id);
    }
}
