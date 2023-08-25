package devs2.webApi;

import devs2.business.abstracts.ProgramService;
import devs2.business.request.ProgramsRequest;
import devs2.business.response.ProgramsResponse;
import devs2.entities.Programming;

import java.util.List;

@RestController
@RequestMapping("/api/programs")

public class ProgramsController {
    private final ProgramService programService;

    public ProgramsController(ProgramService programService) {
        this.programService = programService;
    }
    List<ProgramsResponse> getAll(){
        return programService.getAll();
    }
    public void add(ProgramsRequest programsRequest){
        programService.add(programsRequest);
    }
    public void update(ProgramsRequest programsRequest) throws Exception {
        programService.update(programsRequest);
    }
    public void delete(ProgramsResponse programsResponse) throws Exception {
        programService.delete(programsResponse);
    }
}
