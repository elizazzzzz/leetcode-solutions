public class Palindromenumber {
    public static boolean isPalindrome(int x) {
        /*public访问修饰符，表示这个方法可以对外可见*/
        /*static boolean返回类型，布尔值（true or false）*/
        if (x < 0) return false;
        char[] array = String.valueOf(x).toCharArray();
        /*char是基本类型，代表一个UTF-16编码单元（eg，英文字母数字常用符号常用汉字都能被单个char表示）*/
        /*char[] array 这个array是由自己取名的，这一行内容表示声明由char[]组成的一堆数组*/
        /*把整数x转化为字符串，这是String的静态方法*/
        /*toCharArray把字符串转成字符数组，eg12321——‘1’‘2’...依次展开*/

        int left = 0, right = array.length - 1;
        //左指针从最左下标为0开始，右指针从最右侧开始，往中间靠拢
        while (left < right) {//如果左指针和右指针还没交叉或相遇就继续循环
            if (array[left] != array[right]) return false;//比较两边字符是否不相等，！=表不相等
            left++;//左指针向后
            right--;//右指针向前
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 78378;
        boolean result = isPalindrome(x); // 调用方法
        if (result) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
