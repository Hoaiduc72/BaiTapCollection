public class Student{
    private String id;
    private String name;
    private int age;
    private float grade;

    public Student(String id,String name,int age,float grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public float getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return "ID: "+id+" - Tên: "+name+" - Tuổi: "+age+" - Điểm: "+grade;
    }
}