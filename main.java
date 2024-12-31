class hillstation{
    void location(){
        System.out.println("location is ");
    }
    void famousfor(){
        System.out.println("famous for ");
    }
}
class manali extends hillstation{
    void location(){
        System.out.println("manali is in himachal pradesh ");
    }
    void famousfor(){
        System.out.println("famous for hadimba temple ");
    }
}
class masori extends hillstation {
    void location() {
        System.out.println("masori is in uttrakhand ");
    }

    void famousfor() {
        System.out.println("famous for education insitiution ");
    }
}
class main{
    public static void main(String [] args){
        hillstation a=new hillstation();
        hillstation m=new manali();
        hillstation mu=new masori();
        a.location();
        a.famousfor();
        m.location();
        m.famousfor();
        mu.location();
        mu.famousfor();
    }
}
