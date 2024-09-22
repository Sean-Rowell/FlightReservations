public class Flight {

    //Create variables
    private String flightId;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;


    //Constructors
    public Flight(){

    }

    public Flight(String origin, String destination){
        this.origin = origin;
        this.destination = destination;
    }

    public Flight(String origin, String destination, String departureTime, String arrivalTime){
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    //Setters
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    //Getters
    public String getFlightId() {
        return flightId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    //Get flight details
    public void getFlightDetails(Flight flight){
        System.out.printf("Flight Details: Origin: %s, Destination: %s, Departure Time: %s, Arrival Time: %s",
                flight.origin, flight.destination, flight.departureTime, flight.arrivalTime);
    }
}
