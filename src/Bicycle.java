/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama : Firman Ardhiansyah
 *         Kelas : IF-2 (PB02)
 *         NIM : 10117056
 * Deskripsi Program : Program untuk mengetahui informasi tentang kendaraan 
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        this.myGearCount = 0;
        setMyBrand("Trek Bike");
        setMyModel("7.4FX");
        setMyGearCount(23);

        System.out.println("Bicycle");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Jumlah Gear : "+getMyGearCount());
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
