package Assignment_6_part2;

class Result extends Student implements InterfaceExam {
    public Result(String name, int rollNo, double mark1, double mark2) {
        super(name, rollNo, mark1, mark2);
    }

    @Override
    public double Percent_cal(double mark1, double mark2) {
        return (mark1 + mark2) / 2.0;
    }

    @Override
    public void displayExamDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Percentage: " + Percent_cal(mark1, mark2) + "%");
    }
}