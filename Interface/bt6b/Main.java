package Interface.bt6b;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IStatus> statusList = new ArrayList<>();

        System.out.println("Nhap 2 quay ban ve: ");
        for (int i = 0; i < 3; i++) {
            TicketCounter ticketCounter = new TicketCounter();
            ticketCounter.input();

            statusList.add(ticketCounter);
        }

        System.out.println("Nhap 2 quay ban do an: ");
        for (int i = 0; i < 2; i++) {
            Food food = new Food();
            food.input();

            statusList.add(food);
        }

        System.out.println("Nhap 2 bai do xe: ");
        for (int i = 0; i < 2; i++) {
            Parking parking = new Parking();
            parking.input();

            statusList.add(parking);
        }

        System.out.println("Nhap 5 phong chieu phim: ");
        for (int i = 0; i < 5; i++) {
            Room room = new Room();
            room.input();

            statusList.add(room);
        }

        //test dc roi.
        System.out.println("Hien thi thong tin trang thai: ");
        followStatus(statusList);
    }

    static void followStatus(List<IStatus> statusList) {
        for (IStatus iStatus : statusList) {
            iStatus.onStatus();
        }
    }
}

