import java.io.Console;

public class Circle {
    private double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void print() {
        System.out.println("radius = " + radius);
        System.out.println("area = " + area());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Console console = System.console();

        if (console == null) {
            System.err.println("คอนโซลไม่สามารถใช้งานได้ในระบบนี้");
            System.exit(1);
        }

        int choice;
        do {
            System.out.println("เลือกเมนู:");
            System.out.println("1 : หาเส้นรอบวง");
            System.out.println("2 : หาพื้นที่");
            System.out.println("3 : หาปริมาตร");
            System.out.println("0 : ออกจากโปรแกรม");

            choice = Integer.parseInt(console.readLine());

            switch (choice) {
                case 1:
                    System.out.print("รัศมี: ");
                    c1.radius = Double.parseDouble(console.readLine());
                    System.out.println("เส้นรอบวง = " + c1.circumference());
                    break;
                case 2:
                    System.out.print("รัศมี: ");
                    c1.radius = Double.parseDouble(console.readLine());
                    System.out.println("พื้นที่ = " + c1.area());
                    break;
                case 3:
                    System.out.print("รัศมี: ");
                    c1.radius = Double.parseDouble(console.readLine());
                    System.out.println("ปริมาตร = " + c1.volume());
                    break;
                case 0:
                    System.out.println("ออกจากโปรแกรม");
                    break;
                default:
                    System.out.println("Error");
            }
        } while (choice != 0);
    }
}
