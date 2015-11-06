package base.domain.basenum;

/**
 * Created by base on 2015-07-23.
 */
public enum DayEnum {
    Monday(1,"星期一"),
    Tuesday(2,"星期二"),
    Wendesday(3,"星期三"),
    Thrusday(4,"星期四"),
    Friday(5,"星期五"),
    Saturday(6,"星期六"),
    Sunday(7,"星期日");
    private int value;
    private String name;

    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    DayEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
