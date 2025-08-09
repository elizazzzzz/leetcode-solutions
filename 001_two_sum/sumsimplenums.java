
public class sumsimplenums {//创建的java类的声明，类名为class后的内容，类的命名通常首字母大写

    public static/*关键字，属于类本身，不用创建对象*/ int[] sumsimlenums/*此为方法名，可以随意取（不能以数字开头，不能有空格，习惯为首字母小写）*/(int [] nums, int target) {
        //int[] nums（此为自己命名） 表示方法需要应该整数数组，int target（此为自己命名） 表示方法需要一个整数目标值
        for (int i = 0/*从数组的第一个元素开始，下标为0*/; i < nums.length/*当i小于数组长度时继续循环*/; i++/*每次循环结束后让i加1，去检查下一个位置*/) {//外层循环，负责第一个数
            for (int j = i + 1; j < nums.length; j++) {//内层循环，从i+1开始，避免自己相加
                if (nums[i] + nums[j] == target) {//两数相加为目标值，i\j代表的是下标，nums[i\j]才是数组；里的数
                    return new int[]{i, j};//int[]表示这是一个整数数组，{i,j}这个数组的内容是i和j
                    //new int[]{..}——创建这样一个新数组
                    //return 把这个新数组作为方法的返回值
                    //new的含义：new是创建一个新的对象或者数组的关键字
                    //当new 类名（）——创建类的对象
                    //当new 数据类型[长度]——创建一个空数组
                    //当new 数组类型[]{值1，值2...}——创建一个带初始值的数组
                }

            }
        }
    return new int[]{0};

    }

public static void main(String[] args){//这是主方法，程序的入口
    int[] nums = {5,2,1,8};//给数组赋值
    int target = 6;//给目标值赋值

    int[] result = sumsimlenums(nums,target);//调用写的方法（sumsimplenums）
    //把nums（数字数组）和target（目标值）传进去，方法会运行并接收返回结果，一个整数数组
    //int[] result=... 声明一个变量result，类型是int[]（整数数组），用方法返回的结果来给它赋值
   //eg 函数为  汉堡[] 点外卖(菜单 menu, int 预算) {ps：这个函数应该为1里的内容}
    // 调用为 汉堡[] 我的午餐 = 点外卖(菜单, 30);
    if (result !=null/*是防止程序报错的安全检查，result是方法返回的数组，如果找到了会返回new int[]{i,j},如果没找到可能会返回null（表示没有指向任何对象）*/) {
       //上面的代码是在判断返回值是不是空的
        System.out.println("找到的两个数的下标是：" + result[0] /*指（方法/函数）中返回的下标为0的数组*/+ "和" + result[1]);
    } else {
        System.out.println("没有找到符合条件的两个数");//System.out.println（""）这个语句是输出语句，会在控制台输出一括号中双引号中的内容
    //常见关键词（被赋予特定含义的单词）:public,static,void,class
    }

    }
}