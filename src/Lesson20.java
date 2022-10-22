public class Lesson20 {
    public static void main(String[] args) {
        System.out.println(citiWeather("Лондон"));
        System.out.println("---------");
        System.out.println(citiWeatherAdvanced("Москва", "Четверг"));
    }

    public static int citiWeather(String town) {
        int outputTemp = 0;
        int sundayDay = 6;
        int tempInLondonOnMon = 17;
        int tempInLissabonOnMon = 25;
        int tempInParisOnMon = 23;
        int tempInMoscowOnMon = 19;
        int tempInMinskOnMon = 18;
        int tempInSaratovOnMon = 15;
        switch (town) {
            case "Лондон":
                outputTemp = tempInLondonOnMon + sundayDay;
                break;
            case "Лиссабон":
                outputTemp = tempInLissabonOnMon + sundayDay;
                break;
            case "Париж":
                outputTemp = tempInParisOnMon + sundayDay;
                break;
            case "Москва":
                outputTemp = tempInMoscowOnMon + sundayDay;
                break;
            case "Минск":
                outputTemp = tempInMinskOnMon + sundayDay;
                break;
            case "Саратов":
                outputTemp = tempInSaratovOnMon + sundayDay;
                break;
            default:
                System.out.println("error, try again");
        }
        return outputTemp;
    }

    public static int citiWeatherAdvanced(String town, String weekDay) {
        int outputTemp = 0;
        int tempInLondonOnMon = 17;
        int tempInLissabonOnMon = 25;
        int tempInParisOnMon = 23;
        int tempInMoscowOnMon = 19;
        int tempInMinskOnMon = 18;
        int tempInSaratovOnMon = 15;
        for (int i = 0; i < 7; i++) {
            int weekDayNumber = 0;
            if (weekDay == "Понедельник") {
                weekDayNumber = 0;
            } else if (weekDay == "Вторник") {
                weekDayNumber = 1;
            } else if (weekDay == "Среда") {
                weekDayNumber = 2;
            } else if (weekDay == "Четверг") {
                weekDayNumber = 3;
            } else if (weekDay == "Пятница") {
                weekDayNumber = 4;
            } else if (weekDay == "Суббота") {
                weekDayNumber = 5;
            } else if (weekDay == "Воскресение") {
                weekDayNumber = 6;
            }
            if (weekDayNumber == i && town == "Лондон") {
                outputTemp = tempInLondonOnMon + i;
            } else if (weekDayNumber == i && town == "Лиссабон") {
                outputTemp = tempInLissabonOnMon + i;
            } else if (weekDayNumber == i && town == "Париж") {
                outputTemp = tempInParisOnMon + i;
            } else if (weekDayNumber == i && town == "Москва") {
                outputTemp = tempInMoscowOnMon + i;
            } else if (weekDayNumber == i && town == "Минск") {
                outputTemp = tempInMinskOnMon + i;
            } else if (weekDayNumber == i && town == "Саратов") {
                outputTemp = tempInSaratovOnMon + i;
            }
        }
        return outputTemp;
    }
}

