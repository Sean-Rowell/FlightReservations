public class Plane {

    // variables
    private int totalSeats;
    private int seatsAvailable;
    private int seatCost;
    private String model;
    private String planeId;


    // Constructors
    public Plane(){

    };

    public Plane(int totalSeats, int seatsAvailable, int seatCost, String model, String planeId) {
        this.totalSeats = totalSeats;
        this.seatsAvailable = seatsAvailable;
        this.seatCost = seatCost;
        this.model = model;
        this.planeId = planeId;
    }

    // Setters

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public void setSeatCost(int seatCost) {
        this.seatCost = seatCost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    // Getters

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public int getSeatCost() {
        return seatCost;
    }

    public int getModel() {
        return model;
    }

    public int getPlaneId() {
        return planeId;
    }


}