package devs2.business.concretes;

import devs2.business.abstracts.ProgramService;
import devs2.business.request.ProgramsRequest;
import devs2.business.response.ProgramsResponse;
import devs2.dataAccess.abstracts.ProgramRepository;
import devs2.entities.Programming;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProgramManager implements ProgramService {
    private final ProgramRepository programRepository;

    public ProgramManager(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public List<ProgramsResponse> getAll() {
        List<Programming> program=programRepository.findAll();
        List<ProgramsResponse> responses=new ArrayList<ProgramsResponse>();
        for(Programming programs:program){
            ProgramsResponse programsResponse=new ProgramsResponse();
            programsResponse.setId(programs.getId());
            programsResponse.setName(programs.getName());
            programsResponse.setSubTech(programs.getSubTech());
            responses.add(programsResponse);
        }
        return responses;
    }

    @Override
    public void add(ProgramsRequest programsRequest) {
        Programming programming=new Programming();
        programming.setName(programsRequest.getName());
        programming.setSubTech(programsRequest.getSubTech());
        this.programRepository.save(programming);
    }

    @Override
    public void delete(ProgramsResponse programsResponse) throws Exception {
        List<Programming> programmings=programRepository.findAll();
        for(Programming programming:programmings){
            if(programming.getName()==programsResponse.getName()){
                this.programRepository.delete(programming);
            }
            else{
                throw new Exception("Geçersiz programlama ismi");
            }
        }

    }

    @Override
    public void update(ProgramsRequest programsRequest) throws Exception {
        List<Programming> programmings=programRepository.findAll();
        for(Programming programming=programmings){
            if(programming.getName()==programsRequest.getName()){
                programming.setSubTech(programsRequest.getSubTech()); //sadece alt teknolojileri güncelleyebilir
            }
            else {
                throw new Exception("Geçersiz programlama ismi");
            }
        }

    }
}
