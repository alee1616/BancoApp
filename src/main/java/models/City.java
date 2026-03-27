package models;

public class City {

    private String name;
    private String description;
    private String code;

    //constructor con select none
    public City() {
    }

    public City(String description, String code, String name) {
        this.description = description;
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Datos de la ciudad \n"
                + "Nombre:" + this.getName()
                + "\nDescripcion:" + this.getDescription()
                + "\nCodigo:" + this.getCode()
                + "\n ================================================\n";
    }
}
