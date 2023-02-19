public  class Company1 {

 public   String address;
   public int java;
    public    int  android;
    public int go;
   public String ownerName;


    public Company1(String address, int java, int android, int go, String ownerName) {
        this.address = address;
        this.java = java;
        this.android = android;
        this.go = go;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "address='" + address + '\'' +
                ", java=" + java +
                ", android=" + android +
                ", go=" + go +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
