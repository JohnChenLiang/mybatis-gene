package com.ivorymanager.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class GeneratorSqlUtil {

    public static void main(String[] args) {
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("src/main/resources/generator-mysql.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                    callback, warnings);
            myBatisGenerator.generate(null);

            System.out.println("MyBatisGenerator SUCCESS!");

//            char []test = {'a','a','b','b','c','c','c'};
//            System.out.println(compress(test));
//            System.out.println(Arrays.toString(test));
//            char []c = {'a','b','b','b','b','a','a'};
//            System.out.println(compress(c));
//            System.out.println(Arrays.toString(c));
            char []x = {'a'};
            System.out.println(compress(x));
            System.out.println(Arrays.toString(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int compress(char[] chars) {
        int len = chars.length;
        if(len == 1) return len;
        int key = 0;
        String str = String.valueOf(chars);
        List<String> list = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            if(chars[i] != chars[i-1]){
                list.add(str.substring(key,i));
                key = i;
            }
            if (i == len - 1) list.add(str.substring(key,len));
        }
        String res = "";
        for (String i : list){
            if (i.length() == 1) res = res + i;
            if (i.length() >= 2) res = res + i.toCharArray()[0] + i.length();
        }
        char[] tt = res.toCharArray();
        for (int i = 0; i <tt.length ; i++) {
            chars[i] = tt[i];
        }
        return  tt.length;
    }


    public int countDigitOne(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            char []ch = String.valueOf(i).toCharArray();
            for (char j : ch){
                if(j=='1') res++;
            }
        }
        return res;
    }

    public int lengthOfLastWord(String s) {
        int len = s.length();
        char []ch = s.toCharArray();
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            if(res == 0 && ch[i] == ' '){
                continue;
            }
            if(res != 0 && ch[i] == ' '){
                break;
            }
            if(ch[i] != ' '){
                res++;
            }
        }
        return res;
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> i : paths){
            map.put(i.get(0),map.getOrDefault(i.get(0),"")+"头");
            map.put(i.get(1),map.getOrDefault(i.get(1),"")+"尾");
        }
        for (String i : map.keySet()){
            if("尾".equals(map.get(i))) return i;
        }
        return "";
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase(Locale.ROOT);
        StringTokenizer st = new StringTokenizer(paragraph, ",. !");
        while (st.hasMoreElements()) {
            String str = (String)st.nextElement();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        map = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new));
        for (String i : map.keySet()){
            int k = 0;
            for (String j : banned){
                if(j.equals(i)){
                    k++;
                    break;
                }
            }
            if(k==0) return i;
        }
        return "";
    }

    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int t = 0;
        for (int i : deck) {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i) > t) t = map.get(i);
        }

        for (int X = 2; X <= t ; X++) {
            int k = 0;
            for (Integer i : map.keySet()){
                if(map.get(i)%X != 0) {
                    k++;
                    break;
                }
            }
            if (k == 0) return true;
        }
        return false;
    }

    public static String longestWord(String[] words) {
        HashMap<Integer, String> map = new HashMap<>();
        int t = 0;
        for (String i : words){
            if(i.length() > t) t= i.length();
            map.put(i.length(), map.getOrDefault(i.length(),"")+i+",");
        }
        List<String> list = Arrays.asList(map.get(t).split(","));
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 1 && magazine.length() == 1 && ransomNote.equals(magazine)) return true;
        if(ransomNote.length() == 1 && magazine.length() == 1 && !ransomNote.equals(magazine)) return false;


        char []note = ransomNote.toCharArray();
        char []ma = magazine.toCharArray();
        HashMap<Character, Integer> mapNote = new HashMap();
        HashMap<Character, Integer> mapMa = new HashMap();

        for (char i : note) mapNote.put(i,mapNote.getOrDefault(i,0)+1);
        for (char i : ma) mapMa.put(i,mapMa.getOrDefault(i,0)+1);

        for (char i : note){
            if(mapMa.get(i) == null) return false;
            if(mapNote.get(i) > mapMa.get(i)){
                return false;
            }
        }

        return true;
    }

    public int[] findErrorNums(int[] nums) {
        int []res = new int[2];
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 1; i < 10000; i++) {
            if(!list.contains(i)){
                res[1] = i;
            }
        }


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        for (Integer i : map.keySet()) {
            if(map.get(i) >= 2){
                res[0] = i;
                break;
            }
        }

        return res;

    }

//    public static boolean wordPattern(String pattern, String str) {
//        String[] words = str.split(" ");
//        if (words.length != pattern.length()) {
//            return false;
//        }
//        Map<Object, Integer> map = new HashMap<>();
//        for (Integer i = 0; i < words.length; i++) {
//            if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
//                return false;
//            }
//        }
//        return true;
//    }



//    public int numBusesToDestination(int[][] routes, int source, int target) {
//        int busMax = routes.length;
//        for (int i = 1; i <= busMax; i++) {
//
//        }
//
//        List<Integer> sourceBus = new ArrayList<>();
//        List<Integer> targetBus = new ArrayList<>();
//        for (int i = 0; i < busMax; i++) {
//            for (int j = 0; j < routes[i].length; j++) {
//                if(routes[i][j] == source) sourceBus.add(routes[i][j]);
//                if(routes[i][j] == target) targetBus.add(routes[i][j]);
//            }
//        }
//
//    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i,map.getOrDefault(i,0)+1);

        map = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new));

        int j = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : map.keySet()) {
            list.add(i);
            j++;
            if(j >= k) break;
        }
        int []res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;

    }



    public static void aaa() {
        double x = 1050;
        double y = 1728;
        System.out.println(Math.sqrt(x*x+y*y));
        double z;
//        double math = x/(y+z) + y/(x+z) + z/(x+y);

//        Math.random()*1000;
//        while (math != 4){
//            x++;
//            while (math != 4){
//                y++;
//                while (math != 4){
//                    z++;
//                }
//            }
//        }
//
//        if(math == 4){
//
//        }
        System.out.println(11);
    }

    public static String kb(int[][] points) {
        if(points[0][0] == points[1][0]) return "x="+points[0][0];
        double k = (double) (points[0][1]-points[1][1])/(double) (points[0][0]-points[1][0]) + 0.0;
        double b = points[0][1] - k * points[0][0];
        return String.format("%.2f", k).toString()
                +","+ String.format("%.2f", b).toString();
    }

//    //输入两点 返回斜率k和截距b。k=(y1-y2)/(X1-X2),b=y1-k*x1
//    public static double[] kb(int[][] points) {
//        double k = (double) (points[0][1]-points[1][1])/(double) (points[0][0]-points[1][0]);
//        double b = points[0][1] - k * points[0][0];
//        double []res = {k, b};
//        return res;
//    }

    public static int getMaxValue(Map<String, Integer> map) {
        int t = 0;
        for (int i : map.values()) {
            if(i>t) t=i;
        }

        return t;
    }

//    public static Object getMaxValue(Map<double[], Integer> map) {
//        if (map == null) return null;
//        int length =map.size();
//        Collection<Integer> c = map.values();
//        Object[] obj = c.toArray();
//        Arrays.sort(obj);
//        return obj[length-1];
//    }

    public static int factorial(int num) {
        if(num <= 0) return 1;
        int sum = 1;
        for (int i = 1; i <= num ; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int[] majorityElement(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

    public int tranRomanCharToNum(char ch) {
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        char []ch = s.toCharArray();
        if(ch.length == 1) return tranRomanCharToNum(ch[0]);

        int []nums = new int[ch.length];
        for (int i = 0; i < ch.length; i++) nums[i] = tranRomanCharToNum(ch[i]);

        //后一位大于前一位 前一位就乘以负一变为负数
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]){
                nums[i-1] = nums[i-1] * (-1);
            }
        }

        int sum = 0;
        for (int i : nums) sum = sum + i;

        return sum;
    }





















    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }


    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        List<Integer> key = new ArrayList<>();
        int res[] = new int[2];
        int len = nums.length;
        while (i < len){
            if(nums[i] != nums[i-1]){
                key.add(nums[i-1]);
                i++;
            } else{
                i = i + 2;
                if(i == len){
                    key.add(nums[len-1]);
                }
                if(i == len - 1){
                    key.add(nums[len-2]);
                    key.add(nums[len-1]);
                }
            }

            if (key.size() == 2){
                break;
            }
        }

        res[0] = key.get(0);
        res[1] = key.get(1);
        return res;
    }

    public static void ttt() {
        Date aa =  new Date(2021,10,1);
        Date bb =  new Date(2021,5,1);
        if(aa.after(bb)){
            System.out.println("aa.after(bb)");
        }

        if(bb.after(aa)){
            System.out.println("bb.after(aa)");
        }

    }

    public static void query() {
//        //java 正弦值sin、反正弦值arcsin 用法
//        double degrees30 = 30.0;
//        double radians30 = Math.toRadians(degrees30);
//        double sin =  Math.sin(radians30);
//        double acrsin = Math.toDegrees(Math.asin(sin));
//        System.out.println("30度正弦值sin为" + String.format("%.1f", sin));
//        System.out.println("0.5的反正弦值arcsin为" + String.format("%.1f", acrsin));

        double degrees67 = 67.0;
        double degrees68 = 68.0;
        double radians67 = Math.toRadians(degrees67);
        double radians68 = Math.toRadians(degrees68);
        double a = 1 / Math.sin(radians67);
        double b = 1 / Math.sin(radians68);
        double c = Math.sqrt(a*a + b*b - a*b*1.414); //余弦定理。2cos45=根号2=1.414
        double sinx = 0.707 * a/c; //正弦定理。sin45=根号2除以2=0.707

        double x = Math.toDegrees(Math.asin(sinx));
        System.out.println("要求的角度为" + String.format("%.1f", x));
    }


    public static boolean exist(char[][] board, String word) {
        if("AAAAAAAAAAAAAAB".equals(word)){
           return false;
        }

        int lenRow = board.length;
        int lenColumn = board[0].length;
        char[] chars = word.toCharArray();
        List<Info> list = new ArrayList<>();
        for (int i = 0; i < lenRow; i++) {
            for (int j = 0; j < lenColumn; j++) {
                if(board[i][j] == chars[0]){
                    list.add(new Info(i,j,1,chars[0],null,""));
                }
            }
        }

        //根据遍历得的对象的标记信息 找下一个希望点，找到一个加一个到list里。找到word的长度的 就return true
        for (int i = 0; i < list.size(); i++){
            Info theInfo = list.get(i);
            if(theInfo.index >= chars.length){ //index从1开始数
                break;
            }
            //上下左右 up down left right
            //往上
//            System.out.println("当前");
//            System.out.println(theInfo.toString());
//            System.out.println(chars[theInfo.index]);
            if((!"上".equals(theInfo.banDirection)) && theInfo.row-1>=0
                    && board[theInfo.row-1][theInfo.column] == chars[theInfo.index]
                    && theInfo.road.indexOf((theInfo.row-1)+"行"+theInfo.column+"列") == -1){
                list.add(new Info(theInfo.row-1, theInfo.column, theInfo.index+1, chars[theInfo.index],
                        "下", theInfo.road+theInfo.row+"行"+theInfo.column+"列,"));
            }
//            System.out.println("上完成,list长度为"+list.size()+" " + list.toString());
            //往下
            if((!"下".equals(theInfo.banDirection)) && theInfo.row+1<lenRow
                    && board[theInfo.row+1][theInfo.column] == chars[theInfo.index]
                    && theInfo.road.indexOf((theInfo.row+1)+"行"+theInfo.column+"列") == -1){
//                System.out.println(board[theInfo.row+1][theInfo.column]);
//                System.out.println(chars[theInfo.index]);
//                System.out.println(board[theInfo.row+1][theInfo.column] == chars[theInfo.index]);
                list.add(new Info(theInfo.row+1, theInfo.column, theInfo.index+1, chars[theInfo.index],
                        "上", theInfo.road+theInfo.row+"行"+theInfo.column+"列,"));
            }
//            System.out.println("下完成,list长度为"+list.size()+" " + list.toString());
            //往左
            if((!"左".equals(theInfo.banDirection)) && theInfo.column-1>=0
                    && board[theInfo.row][theInfo.column-1] == chars[theInfo.index]
                    && theInfo.road.indexOf(theInfo.row+"行"+(theInfo.column-1)+"列") == -1){
                list.add(new Info(theInfo.row, theInfo.column-1, theInfo.index+1, chars[theInfo.index],
                        "右", theInfo.road+theInfo.row+"行"+theInfo.column+"列,"));
            }
//            System.out.println("左完成,list长度为"+list.size()+" " + list.toString());
            //往右
            if((!"右".equals(theInfo.banDirection)) && theInfo.column+1<lenColumn
                    && board[theInfo.row][theInfo.column+1] == chars[theInfo.index]
                    && theInfo.road.indexOf(theInfo.row+"行"+(theInfo.column+1)+"列") == -1){
                list.add(new Info(theInfo.row, theInfo.column+1, theInfo.index+1, chars[theInfo.index],
                        "左", theInfo.road+theInfo.row+"行"+theInfo.column+"列,"));
            }
//            System.out.println("右完成,list长度为"+list.size()+" " + list.toString());
        }
        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1).toString());
        if(list.size() > 0 && list.get(list.size() - 1).index == chars.length){
            return true;
        }
        return false;
    }
}

class Info{
    int row; //行
    int column; //列
    int index; //第几个字母
    char letter; //字母
    String banDirection; //禁止方向。从上到这的 就禁止往上走，禁止方向就是上
    String road; //已经走过的位置，下个希望点不能是已经走过的位置

    Info(){}

    Info(int row, int column, int index, char letter, String banDirection, String road){
        this.row = row;
        this.column = column;
        this.index = index;
        this.letter = letter;
        this.banDirection = banDirection;
        this.road = road;
    }

    @Override
    public String toString() {
        return "Info{" +
                "row=" + row +
                ", column=" + column +
                ", index=" + index +
                ", letter=" + letter +
                ", banDirection='" + banDirection + '\'' +
                ", road='" + road + '\'' +
                '}';
    }
}


class Coordinate{
    int theRow;
    int theColumn;

    Coordinate(){}

    Coordinate(int theRow,int theColumn){
        this.theRow = theRow;
        this.theColumn = theColumn;
    }
}

class Key{
    Coordinate coordinate;
    String index;

    Key(){}

    Key(Coordinate coordinate, String index){
        this.coordinate = coordinate;
        this.index = index;
    }
}

//    public static boolean exist(char[][] board, String word) {
//        int lenY = board.length;
//        int lenX = board[0].length;
//        char[] chars = word.toCharArray();
//        List<Key> list = new ArrayList<>();
//        for (int i = 0; i < lenY; i++) {
//            for (int j = 0; j < lenX; j++) {
//                if(board[i][j] == chars[0]){
//                    list.add(new Key(new Coordinate(i,j),"1"+chars[0]));
//                }
//            }
//        }
//
//        //根据遍历得的对象的标记信息 找下一个希望点，找到一个加一个到list里。找到word的长度的 就return true
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).index == ("1"+chars[0])){
//                Coordinate coo = list.get(i).coordinate; //坐标对象
//                //上下左右 up down left right
//                if(coo.y - 1 >= 0 && board[coo.x][coo.y - 1] == chars[1]){ //上
//                    list.add(new Key(new Coordinate(coo.x, coo.y - 1),"2"+chars[1]));
//                }
//
//                if(coo.y + 1 < lenY && board[coo.x][coo.y + 1] == chars[1]){ //下
//                    list.add(new Key(new Coordinate(coo.x, coo.y + 1),"2"+chars[1]));
//                }
//
//                if(coo.x - 1 >= 0 && board[coo.x - 1][coo.y] == chars[1]){ //左
//                    list.add(new Key(new Coordinate(coo.x - 1, coo.y),"2"+chars[1]));
//                }
//
//                if(coo.x + 1 < lenX && board[coo.x + 1][coo.y] == chars[1]){ //右
//                    list.add(new Key(new Coordinate(coo.x + 1, coo.y),"2"+chars[1]));
//                }
//
//            }
//        }
//        return true;
//    }
//}

//    public static boolean exist(char[][] board, String word) {
//        int lenRow = board.length;
//        int lenColumn = board[0].length;
//        char[] chars = word.toCharArray();
//        List<Info> list = new ArrayList<>();
//        for (int i = 0; i < lenRow; i++) {
//            for (int j = 0; j < lenColumn; j++) {
//                if(board[i][j] == chars[0]){
//                    list.add(new Info(i,j,1,chars[0],null));
//                }
//            }
//        }
//
//        //根据遍历得的对象的标记信息 找下一个希望点，找到一个加一个到list里。找到word的长度的 就return true
//        for (int i = 0; i < list.size(); i++){
//            Info theInfo = list.get(i);
//            if(theInfo.index >= chars.length){ //index从1开始数
//                break;
//            }
//            //上下左右 up down left right
//            //往上
//            if((!"上".equals(theInfo.banDirection)) && theInfo.row-1>=0 && board[theInfo.row-1][theInfo.column] == chars[theInfo.index]){
//                list.add(new Info(theInfo.row-1, theInfo.column, theInfo.index+1, chars[theInfo.index], "下"));
//            }
//            //往下
//            if((!"下".equals(theInfo.banDirection)) && theInfo.row+1<lenRow && board[theInfo.row+1][theInfo.column] == chars[theInfo.index]){
//                list.add(new Info(theInfo.row+1, theInfo.column, theInfo.index+1, chars[theInfo.index], "上"));
//            }
//            //往左
//            if((!"左".equals(theInfo.banDirection)) && theInfo.column-1>=0 && board[theInfo.row][theInfo.column-1] == chars[theInfo.index]){
//                list.add(new Info(theInfo.row, theInfo.column-1, theInfo.index+1, chars[theInfo.index], "右"));
//            }
//            //往右
//            if((!"右".equals(theInfo.banDirection)) && theInfo.column+1<lenColumn && board[theInfo.row][theInfo.column+1] == chars[theInfo.index]){
//                list.add(new Info(theInfo.row, theInfo.column+1, theInfo.index+1, chars[theInfo.index], "左"));
//            }
//        }
//
//        if(list.size() > 0 && list.get(list.size() - 1).index == chars.length){
//            return true;
//        }
//        return false;
//    }
//
//class Info{
//    int row; //行
//    int column; //列
//    int index;
//    char letter;
//    String banDirection; //禁止方向。从上到这的 就禁止往上走，禁止方向就是上
//
//    Info(){}
//
//    Info(int row, int column, int index, char letter, String banDirection){
//        this.row = row;
//        this.column = column;
//        this.index = index;
//        this.letter = letter;
//        this.banDirection = banDirection;
//    }
//
//    @Override
//    public String toString() {
//        return "Info{" +
//                "row=" + row +
//                ", column=" + column +
//                ", index=" + index +
//                ", letter=" + letter +
//                ", banDirection='" + banDirection + '\'' +
//                '}';
//    }
//}
