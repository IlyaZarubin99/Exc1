import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            meth1(4);
            //throw new MyExc1();
            throw new FileNotFoundException("Generated");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of bounds!");
            meth1(5);
        }
        /*catch (MyExc1 e){
            e.message1();
        }*/
        catch (FileNotFoundException eee){
            System.out.println(eee.getLocalizedMessage());
        }
        catch (Exception e){
            System.out.println(2222222);
        }
    }

    public static void meth1(int arg1) throws ArrayIndexOutOfBoundsException{
        int [] iMas1 = {1,2,3,4,5,6};
        System.out.println(iMas1[arg1]);
    }
}