package Projects.HotelBookingSite;

public class Rooms {
    private String no_of_beds;
    private String room_size;
    private String[] facilities;
    private String suggested_for;

    public void setRoom_size(String room_size) {
        this.room_size = room_size;
    }

    public String getRoom_size() {
        return room_size;
    }

    public String getSuggested_for() {
        return suggested_for;
    }

    public void setSuggested_for(String suggested_for) {
        this.suggested_for = suggested_for;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }

    public void setNo_of_beds(String no_of_beds){
        this.no_of_beds = no_of_beds;
    }

    public String getNo_of_beds(){
        return no_of_beds;
    }
}
