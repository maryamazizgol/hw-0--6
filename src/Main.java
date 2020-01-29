public class Main {

    public static void main(String[] args) {

        int m= 5;
        String day;
        switch (m) {
            case 1:
                day = "shanbe";
                break;
            case 2:
                day = "1shanbe";
                break;
            case 3:
                day = "2shanbe";
                break;
            case 4:
                day = "3shanbe";
                break;
            case 5:
                day = "4shanbe";
                break;
            case 6:
                day= "5shanbe";
                break;
            case 7:
                day = "jome";
                break;
            default:
                day = "!";
                break;
        }
        System.out.println(day);
    }
    }
}
