package jicheng;

/**
 * @author mengka
 * @description
 * @data 2016/05/10.
 */
public enum EventEnum {

    GROUPBY("groupBy","groupBy"),
    SUM("sum","求和"),
    AVG("avg","求平均值ֵ"),
    MAX("max","求最大值"),
    MIN("min","求最小值"),
    CHAIN_INDEX("chain","环比");//以均值来计算与上一个相邻周期的比率

    private String name;

    private String value;

    private EventEnum(String name,String value){
        this.name = name;
        this.value = value;
    }

    public static EventEnum valueOfName(String name) {
        for (EventEnum tmp : values()) {
            if (tmp.name.equals(name)) {
                return tmp;
            }
        }
        throw null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
