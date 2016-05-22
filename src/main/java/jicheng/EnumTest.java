package jicheng;

import java.util.Scanner;

/**
 * @author heidou.f
 *         2016/5/19.
 *         !      枚举类
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size :(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();

        SizeEnum sizeEnum = SizeEnum.valueOfAbbreviation(input);
        if(sizeEnum!=null) {
            System.out.println("size = " + sizeEnum.getSize());
            System.out.println("abbreviation=" + sizeEnum.getAbbreviation());
            System.out.println("sex=" + sizeEnum.getSex());
        }

        SizeEnum sizeEnum1 = SizeEnum.valueOfSize(input);
        if(sizeEnum1!=null) {
            System.out.println("size = " + sizeEnum1.getSize());
            System.out.println("abbreviation=" + sizeEnum1.getAbbreviation());
            System.out.println("sex=" + sizeEnum1.getSex());
        }
        if (sizeEnum == sizeEnum.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the_.");
    }
}

enum SizeEnum {
    SMALL("S", "160-165","女"),
    MEDIUM("M", "165-170","男"),
    LARGE("L", "170-175","男"),
    EXTRA_LARGE("XL", "175-180","男");                  //四个实例，尽量不要构造新对象  所以比较两个枚举类型值永远不要调用equals 直接“==”

    private String abbreviation;

    private String size;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private SizeEnum(String abbreviation, String size,String sex) {
        this.abbreviation = abbreviation;
        this.size = size;
        this.sex = sex;
    }

    public static SizeEnum valueOfAbbreviation(String abbreviation) {
        for (SizeEnum tmp : SizeEnum.values()) {
            if (tmp.getAbbreviation().equals(abbreviation)) {
                return tmp;
            }
        }
        return null;
    }

    public static SizeEnum valueOfSize(String size) {
        for (SizeEnum tmp : SizeEnum.values()) {
            if (isInclude(size,tmp.getSize())) {
                return tmp;
            }
        }
        return null;
    }

    public static boolean isInclude(String size,String range){
        String[] strs = range.split("-");
        int v1 = Integer.parseInt(size);
        boolean isInclude = false;
        if(v1>=Integer.parseInt(strs[0])&&v1<Integer.parseInt(strs[1])){
            isInclude = true;
        }
        return isInclude;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
