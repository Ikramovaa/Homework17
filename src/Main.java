public class Main {
    public static void main(String[] args) {
        Company1 company1=new Company1("Bishkek,Umetaliva 109/3",5,3,2,"Google corporate");
        Company1 company2=new Company1("Bishkek,Kievskaia 118",2,1,1,"Facebook");

        Java java1=new Java("Bakai",24,'M',"bakai.sherimbekov@gmail.com");
        Java java2=new Java("Aidar",32,'M',"aidar.mambetaliev@gmail.com");
        Java java3=new Java("Ainura",27,'F',"ainura.aitalieva@gmail.com");
        Java java4=new Java("Melis",20,'M',"melis.ch@gmail.com");
        Java java5=new Java("Saikal",28,'F',"saikal.akmatalieva@gmail.com");
        Android android1=new Android("Maksat",25,'M',"maksat.jumagulov@gmail.com");
        Android android2=new Android("Aktan",24,'M',"aktan.jumaliev@gmail.com");
        Android android3=new Android("Dastan",27,'M',"dastan.dzhumagulov@gmail.com");
        Go go1=new Go("Kalys",25,'F',"kalys.bekbolotova@gmail.com");
        Go go2=new Go("Ainaz",28,'F',"ainaz.abdibolotova@gmail.com");
        System.out.println(company1.toString()+"\n Java "+java1+java2+
                java3+java4+java5+
                "\n Android "+android1+android2+android3+
                "\nGo "+go1+go2);




       Java javaC1=new Java("Mirlan",24,'M',"mirlan.kerimbekov@gmail.com");
       Java javaC2=new Java("Uluk",32,'M',"Uluk.mamataliev@gmail.com");

       Android androidC1=new Android("Astra",29,'F',"astra.rahmatalieva@gmail.com");

       Go goC1=new Go("Akjol",26,'F',"akjol.ryskeldiev@gmail.com");
        System.out.println(company2.toString()+"\n Java "+javaC1+javaC2+"\n Android"+androidC1+"\n Go "+goC1);









    }
}