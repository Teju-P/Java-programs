import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{ //IMPORTANT
    //private static final long serialVersionUID = 1L; //used to verify on Deserialization side.
    int usn;
    transient String name;
    static int marks = 97;
    Student(int usn, String name){
        this.usn = usn;
        this.name = name;
    }
    public void getInfo(){
        System.out.println("USN: "+usn+"\nName: "+name+"\nMarks: "+marks);
    }
}

class SerializeDemo{
    public static void main(String[] args) {
        try { //IMPORTANT: place serialization and deserialization inside try-catch block as there are checked exceptions.
            Student s = new Student(176, "Teju");
            FileOutputStream fos = new FileOutputStream("SeriablizeDemo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush(); //clears previous ObjectOutputStream
            fos.close();
            System.out.println("Successflly serialized the object");
        }
        catch (Exception e) {
            System.out.println("Exception occured: "+e);
        }
    }
}