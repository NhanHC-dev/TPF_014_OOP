package Interface.bt6b;

import java.util.Scanner;
public class Room extends Area{
    //tong so ghe cua phong chieu
    int total;
    //so ghe dang ngoi
    int num;

    public Room() {
        super("Phong xem phim");
    }

    public Room(int total, int num) {
        super("Phong xem phim");
        this.total = total;
        this.num = num;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tong so ghe: ");
        total = input.nextInt();

        System.out.println("Nhap so ghe da ngoi: ");
        num = input.nextInt();

        setupStatus();
    }

    public void setupStatus() {
        if(num == 0) {
            status = Area.STATUS.EMPTY;
        } else {
            int percent = (num * 100)/total;//se tu dong lam tron so nguyen
            //percent < 25% => LESS
            //percent >= 25% && < 70% => NORMAL
            //perent >= 70 % => FULL
            if(percent >= 70) {
                status = Area.STATUS.FULL;
            } else if(percent >= 25) {
                status = Area.STATUS.NORMAL;
            } else {
                status = Area.STATUS.LESS;
            }
        }
        autoCurrentTime();
    }
}

