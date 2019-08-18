package Demo01;
/*
开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
处理:
1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；(文件所在的目录不同，文件名和行号相同也要合并)
2.超过16个字符的文件名称，只记录文件的最后有效16个字符；(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
3.输入的文件可能带路径，记录文件名称不能带路径
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        String path;
        String fileName;
        int lineNum;
        String key;
        while(sc.hasNext())
        {
            path=sc.next();
            int id=path.lastIndexOf('\\');
            fileName=id<0?path:path.substring(id+1);
            lineNum=sc.nextInt();
            key=fileName+" "+lineNum;
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else
                map.put(key, 1);
        }
        sc.close();

        //记录错误信息
        List<Map.Entry<String,Integer>> lists=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(lists,new Comparator<Map.Entry<String,Integer>>()
        {
            public int compare(Entry<String, Integer> arg1,Entry<String, Integer> arg2)
            {
                return (arg2.getValue()-arg1.getValue())==0?(arg1.getValue()-arg2.getValue()):(arg2.getValue()-arg1.getValue());
            }
        });

        int count=0;
        for(Map.Entry<String, Integer> list:lists)
        {
            if(count<8)
            {
                String[] str=list.getKey().split(" ");
                String k=str[0].length()>16?str[0].substring(str[0].length()-16):str[0];
                String n=str[1];
                System.out.println(k+" "+n+" "+list.getValue());
            }
            else
                break;
            count++;
        }
    }
}
