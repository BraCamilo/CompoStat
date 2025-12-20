package clases;

public class Usuario {
    private int idNum;
    private int userWeight;
    private int userAge;
    private String userName;
    private double Usersex;
    private double userHeight;
    private double userWaist;
    private double userHip;



    //Getters
    public int getIdNum() {
        return idNum;
    }
    public int getUserWeight(){
        return userWeight;
    }
    public int getUserAge(){
        return userAge;
    }
    public String getUserName(){
        return userName;
    }
    public double getUserSex(){
        return Usersex;
    }
    public double getUserHeight(){
        return userHeight;
    }
    public double getUserWaist(){
        return userWaist;
    }
    public double getUserHip(){
        return userHip;
    }


    //Setters
    //Por el momento no sea hacer ya que dentro del constructor se estan aisgnando los valores y aun no estamos haciendo calculos.


    //Metodos
        //Constructor
    public Usuario(int idNum, String userName, double sex, int userAge, int userWeight, double userHeight, double userWaist, double userHip){
        this.idNum = idNum;
        this.userName = userName;
        this.userAge = userAge;
        this.Usersex = sex;
        this.userHip = userHip;
        this.userWaist = userWaist;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
    }

    public String info(){
        return "\nEl nombre del usuario es: " + getUserName() + "\nSu edad es: " + getUserAge() + "\nSu sexo es: " + getUserSex() + "\nEl peso del usuario es: " + getUserWeight() + "kg" + "\nLa altura del usuario es: " + getUserHeight() + "\nEl diametro de la cintura es: " + getUserWaist() + "cm" + "\nY el diametro de la cadera es: " + getUserHip() + "cm";
    }
}
