


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = (GregorianCalendar)  GregorianCalendar.getInstance();
        c.set(year,month-1,day);
        String s =new SimpleDateFormat("EEEE").format(c.getTime());
        return s.toUpperCase();
        //return LocalDate.of(year, month, day).getDayOfWeek().name();

    }

}

