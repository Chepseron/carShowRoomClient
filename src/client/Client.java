/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Anonymous
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client cl = new Client();
        System.out.println(cl.carColors());
        System.out.println(cl.insert("Roles Royce", "yellow", "KCF822H", 2017, "Hunchback", "1"));
        System.out.println(cl.getBlueAndAvailable());

        System.out.println();
    }

    private static java.util.List<java.lang.Object> carColors() {
        ws.ShowRoom_Service service = new ws.ShowRoom_Service();
        ws.ShowRoom port = service.getShowRoomPort();
        return port.carColors();
    }

    private static String insert(java.lang.String carMake, java.lang.String color, java.lang.String registrationNumber, int yearOfManufacturing, java.lang.String type, java.lang.String availability) {
        ws.ShowRoom_Service service = new ws.ShowRoom_Service();
        ws.ShowRoom port = service.getShowRoomPort();
        return port.insert(carMake, color, registrationNumber, yearOfManufacturing, type, availability);
    }

    private static String getBlueAndAvailable() {
        ws.ShowRoom_Service service = new ws.ShowRoom_Service();
        ws.ShowRoom port = service.getShowRoomPort();
        return port.getBlueAndAvailable();
    }
}
