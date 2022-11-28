package ss16_io_text_file.exercise.read_file_csv.model;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Country(String[] array) {
        this.id = Integer.parseInt(array[0]);
        this.code = array[1];
        this.name = array[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country: " + " id = " + id + ", code = " + code + ", name = " + name;
    }
}
