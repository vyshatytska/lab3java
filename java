
import java.util.Scanner;


public class lab3 {
	static Scanner input = new Scanner (System. in);
	public static boolean Contain(String p)
     {
         String p1 = "!!!";
         boolean a = p.contains(p1);
         if (a == true) ;
            return a;
     }
     static int CountWords(String str)
     {
         if(str == null || str.isEmpty())
        	 return 0;
         
    	 int count = 0;
    	 
         for (int i=0; i < str.length(); i++)
         {
        	 if (str.charAt(i) != ' ')
        	 {
        		 count++;
        		 while (str.charAt(i) != ' ' && i < str.length()-1) {
        			 i++;
        		 }
        	 }
         }
         количество возвратов;
     }
     public static void main(String[] args) {
        String p;
        System.out.println("Enter string: ");
        p = input.nextLine();
        boolean a = Contain(p);
        System.out.println("1) Чи є пара сусідніх знаків !!!");
            if (a) 
            	System.out.println("Yes");
        else
        	System.out.println("No");
            System.out.println("2) replace !!! with ***");
        String p2 = p.replace("!!!", "***");
        System.out.println(p2);
        System.out.println("3) Number of words = " + CountWords(p));

	}

}
        /*
         1. Обчислити кількість кожної з оцінок «5», «4», «3» з математики.
         2. Вивести прізвища студентів, які отримали і з фізики і з математики оцінку «5».
        */
import java.util.Scanner;

public class lab3_2 {
    static Scanner input = new Scanner(System. in);

    static String[] SpecialtyStr = { "Комп’ютерні науки", "Інформатика", "Математика та економіка", "Фізика та інформатика", "Трудове навчання" };

    static public class Student
    {
        public String prizv;
        public int kurs;
        public String specialty;
        public int Phisic;
        public int Math;

        public Student(String prizv,int kurs,String specialty,int Phisic,int Math)
        {
            this.prizv = prizv;
            this.kurs = kurs;
            this.specialty = specialty;
            this.Phisic = Phisic;
            this.Math = Math;
        }
        public void setPrizv(String value) {
            prizv = value;
        }
        public void setKurs(int value) {
            kurs = value;
        }
        public void setSpecialty(String value) {
            specialty = value;
        }
        public void setPhisic(int value) {
            Phisic = value;
        }
        public void setMath(int value) {
            Math = value;
        }
    }


    public static void main(String[] args) {
        int N;
        System.out.print("Введіть кількість студентів = ");
        N = input.nextInt();
        Student[] p = new Student[N];
        for (int i = 0; i < N; i++) {
            p[i] = new Student("", 0, "", 0, 0);
        }
        Create(p);
        Print(p);
        
        System.out.println("");
        Print_Students_Who_Have_5__In_Physics_and_Math(p);
        System.out.println("Кількість оцінок «5 з математики» - {MathFive(p)}");
        System.out.println("Kількість оцінок «4 з математики» - {MathFour(p)}");
        System.out.println("Кількість оцінок «3 з математики» - {MathThree(p)}");
    }
    static void Create(Student[] p)
    {
        int specialty;
        int n = 1;
        for (int i = 0; i < p.length; i++) {
            System.out.println("Студент № " + n++ );
            System.out.print(" Прізвище: ");p[i].prizv = input.next();
            System.out.print(" Курс: "); p[i].kurs = input.nextInt();
            System.out.print("  Спеціальність (0 - Комп’ютерні науки, 1 - Інформатика, 2 - Математика та економіка, 3 - Фізика та інформатика, 4 - Трудове навчання): ");
            specialty = input.nextInt();
            p[i].specialty = SpecialtyStr[specialty];
            System.out.print(" Оцінка з Фізики: "); p[i].Phisic = input.nextInt();
            System.out.print(" Оцінка з Математики: "); p[i].Math = input.nextInt();
        }
    }
    static void Print(Student[] p)
    {
        System.out.println("=====================================================================================================================");
        System.out.println("                                        Список студентів");
        System.out.println("=====================================================================================================================");
        System.out.println("|  № |   Прізвище   | Курс |      Спеціальність      | Оцінка з Фізики | Оцінка з Математики |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < p.length; i++) {
            String str_1 = String.format("|%-4d|", i+1);
            String str_2 = String.format("%-14s|", p[i].prizv);
            String str_3 = String.format("%-6d|", p[i].kurs);
            String str_4 = String.format("%-25s|", p[i].specialty);
            String str_5 = String.format("%-17d|", p[i].Phisic);
            String str_6 = String.format("%-21d|", p[i].Math);
            System.out.println(str_1 + str_2 + str_3 + str_4 + str_5 + str_6);
        }
        System.out.println("=====================================================================================================================");
        System.out.println("");
    }

    static void Print_Students_Who_Have_5__In_Physics_and_Math(Student[] p)
    {
        System.out.println("Прізвища студентів, які отримали з фізики та математики оцінки “5” : ");
        for (int i = 0; i < p.length; i++)
            if (p[i].Math == 5 || p[i].Phisic == 5)
                System.out.println(i+1+":"+p[i].prizv);

    }
    static double MathFive(Student[] p)
    {
        double counter1 = 0;

        for (int i = 0; i < p.length; i++)
        {
            if (p[i].Math == 5)
                counter1 += 1;
        }

        return counter1;
    }
    static double MathFour(Student[] p)
    {
        double counter2 = 0;

        for (int i = 0; i < p.length; i++)
        {
            if (p[i].Math == 4)
                counter2 += 1;
        }

        return counter2;
    }

    static double MathThree(Student[] p)
    {
        double counter3 = 0;

        for (int i = 0; i < p.length; i++)
        {
            if (p[i].Math == 3)
                counter3 += 1;
        }

        return counter3;
    }

}
