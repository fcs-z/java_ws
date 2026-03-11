package java7_CountingCharacters;

import org.junit.Test;

import java.awt.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Fcs
 * @description
 * @date 2024-11-01 9:32
 */
public class count {
    @Test
    public void test() throws IOException {
        File countFile = new File("C:\\Users\\19065\\Desktop\\备忘录.txt");

        FileReader fr = new FileReader(countFile);
        BufferedReader br = new BufferedReader(fr);

        // 计算每个字符个数
        HashMap<Character, Integer> map = new HashMap<>();
        int c = 0;
        while ((c = br.read()) != -1) {
            char ch = (char) c;
            if(map.get(ch) == null) {
                map.put(ch, 1);
            }else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        br.close();

        // 写入
        File resultFile = new File("countResult.txt");

        FileWriter fw = new FileWriter(resultFile);
        BufferedWriter bw = new BufferedWriter(fw);

        // 遍历map
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet) {
            switch (entry.getKey()) {
                case ' ':
                    bw.write("空格：" + entry.getValue());
                    break;
                case '\t':
                    bw.write("tab键：" + entry.getValue());
                    break;
                case '\r':
                    bw.write("回车：" + entry.getValue());
                    break;
                case '\n':
                    bw.write("换行：" + entry.getValue());
                    break;
                default:
                    bw.write(entry.getKey() + " = " + entry.getValue());
                    break;
            }
            bw.newLine();
        }
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        File countFile = new File("C:\\Users\\19065\\Desktop\\备忘录.txt");

        FileReader fr = new FileReader(countFile);
        BufferedReader br = new BufferedReader(fr);

        // 计算每个字符个数
        HashMap<Character, Integer> map = new HashMap<>();
        int c = 0;
        while ((c = br.read()) != -1) {
            char ch = (char) c;
            if(map.get(ch) == null) {
                map.put(ch, 1);
            }else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        // 写入
        File resultFile = new File("countResult.txt");

        FileWriter fw = new FileWriter(resultFile);
        BufferedWriter bw = new BufferedWriter(fw);

        // 遍历map
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet) {
            switch (entry.getKey()) {
                case ' ':
                    bw.write("空格：" + entry.getValue());
                    break;
                case '\t':
                    bw.write("tab键：" + entry.getValue());
                    break;
                case '\r':
                    bw.write("回车：" + entry.getValue());
                    break;
                case '\n':
                    bw.write("换行：" + entry.getValue());
                    break;
                default:
                    bw.write(entry.getKey() + " = " + entry.getValue());
                    break;
            }
            bw.newLine();
        }
    }
}
