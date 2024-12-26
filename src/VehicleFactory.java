public class VehicleFactory {
    static Vehicle getVehicleObject(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
