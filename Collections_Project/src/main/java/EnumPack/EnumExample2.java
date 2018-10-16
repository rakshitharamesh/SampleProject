package EnumPack;

public class EnumExample2 {

        enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
        public static void main(String[] Text){
            Day day=Day.MONDAY;

            switch(day){
                case SUNDAY:
                    System.out.println("sunday");
                    break;
                case MONDAY:
                    System.out.println("monday");
                    break;
                default:
                    System.out.println("other day");
            }
        }
//    public enum SomeEnum
//    {
//        ENUM_VALUE1("Some value1"),
//        ENUM_VALUE2("Some value2"),
//        ENUM_VALUE3("Some value3");
//    }
}
