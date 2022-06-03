package com.company;



public class Main {

    public static void main(String[] args) {

        Products prod = new Products ("MilkProducts", 100, 9);
        client1 petr  = new client1("Maasdam", 450, 3, "Petr", "123");
        petr.buy1();
         client2 inna = new client2("kamenkskoe",60,5,"Inna","345");
        inna.buy2();
        client3 viktor=new client3("Alenushka",75,1,"Viktor","567");
        viktor.buy3();
    }
}
interface tovar{
    void tovarName();
    void price();
    void raiting();

}

class Products implements tovar{
    String Gollandskiy;
    int cena;
    int rait;
    Products(String Gollandskiy, int cena, int rait){
        this.Gollandskiy=Gollandskiy;
        this.cena=cena;
        this.rait=rait;
    }

    public void tovarName(){
        System.out.println(Gollandskiy);
    }

    public void price(){
        System.out.println(cena);
    }


    public void raiting(){
        System.out.println(rait);
    }
}
class moloko implements tovar{
    String kamenksoe ;
    int cena1;
    int rait1;
    moloko( String kamenksoe,int cena1,int rait1){
        this.kamenksoe=kamenksoe;
        this.cena1=cena1;
        this.rait1=rait1;
    }
    public void tovarName(){
        System.out.println(kamenksoe);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(rait1);
    }
}
class smetana implements tovar{
    String lugovaya;
    int cena2;
    int rait2;
    smetana(String lugovaya,int cena2,int rait2){
        this.lugovaya=lugovaya;
        this.cena2=cena2;
        this.rait2=rait2;
    }
    public void tovarName(){
        System.out.println(lugovaya);
    }

    public void price(){
        System.out.println(cena2);
    }


    public void raiting(){
        System.out.println(rait2);
    }
}
interface users{
    void login();
    void password();
}

class client1 implements users, tovar{
    String cheese;
    int cena1;
    int rait1;
    String login;
    String password;

    client1(String cheese , int cena1, int rait1, String login, String password){
        this.cheese=cheese;
        this.cena1=cena1;
        this.rait1=rait1;
        this.login=login;
        this.password=password;
    }

    public void tovarName(){
        System.out.println(cheese);
    }
    public void raiting(){
        System.out.println(rait1);
    }
    public void price(){
        System.out.println(cena1);
    }

    public void login(){
        System.out.println(login);
    }
    public void password(){
        System.out.println(password);
    }
    public void buy1(){
        System.out.println("User name: "+login + " pokupaet " + cheese);
    }
}
  class client2 implements users,tovar{
      private final int rait1;
      String moloko ;
    int cena1;
    int raiti1;
    String logg;
    String pass;
    client2(String moloko,int cena1,int rait1,String logg,String pass){
        this.moloko=moloko;
        this.cena1=cena1;
        this.rait1=rait1;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(moloko);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
    public void login(){
        System.out.println(logg);
    }
    public void password(){
        System.out.println(pass);
    }
    public void buy2(){
        System.out.println("User name: "+logg + " pokupaet " + moloko);
    }
}
class client3 implements users,tovar{
    private final int rait2;
    String smetana;
    int cena2;
    int raiti2;
    String logg;
    String pass;
    client3(String smetana, int cena2,int rait2,String logg,String pass){
        this.smetana=smetana;
        this.cena2=cena2;
        this.rait2=rait2;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(smetana);
    }

    public void price(){
        System.out.println(cena2);
    }
    public void raiting(){
        System.out.println(raiti2);
    }
    public void login(){
        System.out.println(logg);
    }
    public void password(){
        System.out.println(pass);
    }
    public void buy3(){
        System.out.println("User name: "+logg + " pokupaet " + smetana);
    }
}
