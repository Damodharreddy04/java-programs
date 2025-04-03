public class studentlist {
    int id;
    String name;
    public void set(int n,String nm){
       id=n;
       name=nm;

    }
    public  void get(){
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
    public static void main(String[] args) {
        studentlist s=new studentlist();
        s.set(1,"abc");
        s.get();

        s.set(2,"reg");
        s.get();


    }

    
}
