    import java.io.FileInputStream;
    import java.io.ObjectInputStream;
    import java.io.Serializable;

    public class DeserializeDemo {
        public static void main(String[] args) {
            try { //IMPORTANT: place serialization and deserialization inside try-catch block as there are checked exceptions.
                FileInputStream fis = new FileInputStream("SeriablizeDemo.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Student s;
                s =(Student)ois.readObject(); //IMPORTANT: Type cast.
                ois.close();
                fis.close();
                System.out.println("Successfully deserialized byte stream to object.");
                s.getInfo();
            } catch (Exception e) {
                System.out.println("Exception occured: "+e);
            }

        }
    }
