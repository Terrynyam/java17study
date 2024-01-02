package org.example;

/**
 * @author Terrance Nyamfukudza
 * 26/12/2023
 */
public class InitializerExpression {
    private int noOfRooms = 12;
    private int maxNoOfGuests = initMaxGuests();
    private int occupancyPerRoom = 2;
    public int initMaxGuests() {
        System.out.println("occupancyPerRoom: " + occupancyPerRoom);
        //occupancyPerRoom variable is initialized to as it being called before being initialized
        System.out.println("maxNoOfGuests: " + noOfRooms * occupancyPerRoom);
        return noOfRooms * occupancyPerRoom;
    }
    public int getMaxGuests() { return maxNoOfGuests; }
    public int getOccupancy() { return occupancyPerRoom; }
}
class TestOrder {
    public static void main(String[] args) {
        InitializerExpression hotel = new InitializerExpression();
        System.out.println("AFTER OBJECT CREATION");
        System.out.println("occupancyPerRoom: " + hotel.getOccupancy());
        System.out.println("maxNoOfGuests: " + hotel.getMaxGuests());
    }

}
