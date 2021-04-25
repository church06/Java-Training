package application;

import javafx.beans.property.SimpleStringProperty;

public class Info {

    private final SimpleStringProperty city;
    private final SimpleStringProperty area;
    private final SimpleStringProperty street;

    public Info(String city, String area, String street) {
        this.city = new SimpleStringProperty(city);
        this.area = new SimpleStringProperty(area);
        this.street = new SimpleStringProperty(street);
    }

    public String getCity() {
        return city.get();
    }

    public SimpleStringProperty cityProperty() {
        return city;
    }

    public String getArea() {
        return area.get();
    }

    public SimpleStringProperty areaProperty() {
        return area;
    }

    public String getStreet() {
        return street.get();
    }

    public SimpleStringProperty streetProperty() {
        return street;
    }
}
