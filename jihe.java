package text_5_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jihe {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        //末位添加
        list.add("我爱你");
        //指定位置添加
        list.add(1,"我喜欢你");
        //list.add(11,"我喜欢你");//IndexOutOfBoundsException
        //删除索引处的元素
        System.out.println(list.remove(0));
        //修改索引处的元素，返回被修改的元素
        System.out.println(list.set(0,"我不喜欢你"));
        //返回索引处的元素
        System.out.println(list.get(0));
        System.out.println(list);

    }
}
