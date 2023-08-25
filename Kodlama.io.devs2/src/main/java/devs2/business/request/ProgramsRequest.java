package devs2.business.request;

public class ProgramsRequest {
    private String name;
    private String subTech;

    public ProgramsRequest() {
    }

    public ProgramsRequest(String name, String subTech) {
        this.name = name;
        this.subTech = subTech;
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
