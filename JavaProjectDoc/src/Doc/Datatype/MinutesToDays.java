package Doc.Datatype;

public class MinutesToDays {

	public static void main(String[] args) {
        int minutes = 3456789;
        int minPerDay = 1440;
        int Days = 3456789/1440;
        int DayPerYear = 365;
        int year = Days/DayPerYear;
        
        int remaingDays =Days%DayPerYear;
            System.out.println(year+ " years" + "+"  + remaingDays +  "days");
	}

}
