package java11_copyOf_NewMethodToOnlyRead;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fcs
 * @description
 * @date 2024-11-16 15:38
 */
// 集合中新增的copyOf()，用于创建一个只读的集合
public class copyOf_Test {
    // copyOf(Xxx coll):如果参数coll本身就是一个只读集合，则copyOf()返回值即为当前的coll
    // 如果参数coll不是一个只读集合，则copyOf()返回一个新的集合，这个集合是只读的。

    @Test
    public void test() {
        var list1 = List.of("Tom", "Jerry");  // 只读集合
        var copyList1 = List.copyOf(list1);
        System.out.println(list1 == copyList1);  // true

        var list2 = new ArrayList<>();   // 不是只读集合
        list2.add("Tom");
        var copyList2 = List.copyOf(list2);
//        copyList2.add("Jerry");     // 不能添加
        System.out.println(list2 == copyList2);  // false
    }
}
