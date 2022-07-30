package UE06.Exercise3;

import java.util.Collection;
import java.util.HashMap;

public class StarkEnterprises implements Company{
    HashMap<Integer, String> employeeDatabase = new HashMap<>();
    HashMap<Integer, String> projectDatabase = new HashMap<>();
    HashMap<Integer, String> employeeWorkingOnProject = new HashMap<>();

    @Override
    public void addEmployee(int id, String name) throws DuplicateIdException {
    if(this.employeeDatabase.get(id) == null){
        this.employeeDatabase.put(id, name);
    } else {throw new DuplicateIdException();}
    }

    @Override
    public String getEmployeeName(int id) throws InvalidIdException{
        if(this.employeeDatabase.get(id) == null){
            throw new InvalidIdException();
        }
        return this.employeeDatabase.get(id);
    }

    @Override
    public void addProject(int id, String name) throws DuplicateIdException {
        if(this.projectDatabase.get(id) == null){
            this.projectDatabase.put(id, name);
        } else {throw new DuplicateIdException();}
    }


    @Override
    public String getProjectName(int id) {
        if(this.projectDatabase.get(id) == null){

        }
        return this.projectDatabase.get(id);
    }

    @Override
    public void assignEmployeeToProject(int employeeId, int projectId) throws UnknownIdException {

    }

    @Override
    public void removeEmployeeFromProject(int employeeId, int projectId) throws UnknownIdException {

    }

    @Override
    public Collection<Integer> getEmployees() {
        return null;
    }

    @Override
    public Collection<Integer> getProjectsForEmployee(int employeeId) throws UnknownIdException {
        return null;
    }
}
