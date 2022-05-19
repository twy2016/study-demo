package day002;

/**
 * @author gongpeng
 * @date 2022/5/18 17:20
 */
public class SwitchDemo {

    public static void main(String[] args) {
        int day = 8;
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            //如果case没有匹配的值，那么肯定是星期日
            default:
                dayString = "Sunday";
                break;
        }
        System.out.println(dayString);
    }
}
