class Marks {
    double s1;
    double s2;
    double s3;
    double s4;
    double s5;
}

class Student {
    public static void main(String[] args)
    {
        Marks a = new Marks();
        a.s1=90;
        a.s2=92;
        a.s3=94;
        a.s4=96;
        a.s5=98;

        double avg = (a.s1+a.s2+a.s3+a.s4+a.s5)/5;
       
        System.out.println("Average marks of student is "+ avg);
    }
}