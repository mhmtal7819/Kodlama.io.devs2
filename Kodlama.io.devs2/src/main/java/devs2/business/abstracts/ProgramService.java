package devs2.business.abstracts;

import devs2.business.request.ProgramsRequest;
import devs2.business.response.ProgramsResponse;

import java.util.List;

public interface ProgramService {
    List<ProgramsResponse> getAll();
    public void add(ProgramsRequest programsRequest);
    public void delete(ProgramsResponse programsResponse) throws Exception;
    public void update(ProgramsRequest programsRequest) throws Exception;
}
