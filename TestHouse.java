package FA068;

public class TestHouse {
    public static void main(String[] args) throws CloneNotSupportedException {
        House h1=new House();
//        House h2=new House();
        h1.readData();
        House h2=((House)h1.clone());
        System.out.println(h1.toString());
        System.out.println(h2.toString());


//        h1.readData();
//        h2.readData();
//        h1.toString();
//        int e=h1.compareTo(h2);
//        if(e==0){
//            System.out.println("both houses are equal");
//        }
//        if(e>0){
//            System.out.println(h1.getHouse_id()+"is greater than"+ h2.getHouse_id());
//        }
//        if(e<0){
//            System.out.println(h2.getHouse_id()+"is greater than"+ h1.getHouse_id());
//
//
//        }
    }
}
