package devs2.business.response;

public class ProgramsResponse {
    private int id;
    private String name;
    private String subTech;

    public ProgramsResponse() {
    }

    public ProgramsResponse(int id, String name, String subTech) {
        this.id = id;
        this.name = name;
        this.subTech = subTech;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTech() {
        return subTech;
    }

    public void setSubTech(String subTech) {
        this.subTech = subTech;
    }
}
