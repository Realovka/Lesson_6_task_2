package com.company;

public class Computer {
    private String cpu;
    private int ram;
    private String hdd;
    private int resource;

    public Computer(String cpu, int ram, String hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public Computer(){

    }

    public int getRam() {
        return ram;
    }

    public void getAllInfo(){
        System.out.println("Максимальная оперативка у компьютера со след. парематрами cpu: "+cpu+", ram:"+ram+", hdd:"+hdd+", кол-во ж-ц "+resource);
    }
}
