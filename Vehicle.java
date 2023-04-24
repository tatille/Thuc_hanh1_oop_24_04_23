import java.util.Scanner;

public class Vehicle {
    private String model;
    private int price;
    private int engineCapacity;
    private String tenChuXe;
    
    public Vehicle(String tenChuXe,String model,int price, int engineCapacity) {
        this.tenChuXe= tenChuXe;
        this.model = model;
        this.price = price;
        this.engineCapacity = engineCapacity;
       
    }
    
    public double calculateTax() {
        double tax = 0;
        if (engineCapacity < 100) {
            tax = price * 0.01;
        } else if (engineCapacity >= 100 && engineCapacity < 200) {
            tax = price * 0.03;
        } else {
            tax = price * 0.05;
        }
        return tax;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Vui lòng chọn (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    for (int i = 0; i < vehicles.length; i++) {
                        System.out.println("Xe " + (i+1));
                        System.out.print("Nhập tên chủ xe: ");
                        String tenChuXe = scanner.nextLine();
                        System.out.print("Nhập model: ");
                        String model = scanner.nextLine();
                        System.out.print("Nhập giá tiền: ");
                        int price = scanner.nextInt();
                        System.out.print("Nhập dung tích động cơ: ");
                        int engineCapacity = scanner.nextInt();
                        scanner.nextLine();
                        vehicles[i] = new Vehicle(tenChuXe,model, price, engineCapacity);
                    }
                    System.out.println("Đã tạo các đối tượng xe thành công!");
                    break;
                    
                case 2:
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","tenChuXe", "Model","Dung tích động cơ", "Giá tiền",  "Thuế trước bạ");
                    for (Vehicle vehicle : vehicles) {
                        double tax = vehicle.calculateTax();
                        System.out.printf("%-20s %-20s %-20d %-20d %-20.2f\n",vehicle.tenChuXe, vehicle.model,vehicle.engineCapacity, vehicle.price,  tax);
                    }
                    break;
                    
                case 3:
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Vui lòng nhập lựa chọn hợp lệ (1/2/3)!");
                    break;
            }
        }
    }
}
