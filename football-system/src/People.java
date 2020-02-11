package People;

public class People {
    // private sets the Encapsulation. Encapsulation prevents the class from being summoned.
    // Setter allows another class to (only) summon the encapsulated attribute.
    // Getter allows another class to set value to the summoned encapsulated attribute.
    private String name;
    private int age;
    private int height;
    private int weight;
    private String nationality;
    private int experience; // tao vẫn chưa hình dung được cái này dùng làm gì

    public People(String name, int age, int height, int weight, String nationality, int experience) {
        this.name = name;
        
        //this.age = age;       // phải kiểm soát, lỡ ai đấy input data vô age = 10000 là tiêu, phải đặt điều kiện (16 -> 80), bằng hàm Setter
        this.age = this.setAge(age);
        
        this.height = height; // tương tự, cần có 1 range
        this.weight = weight;   // tương tự, cần có 1 range
        this.nationality = nationality;
        this.experience = experience;
    }
    //sắp tới bắt đầu tạo method Setter để kiểm soát input data
    

    public String getName() {
        return name;
    }
    public void setAge(int age){
     if(age<80&&age>18) {
            this.age = age;
        }
        
    }
    

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }

    public int getExperience() {
        return experience;
    }
}
