package UE06.Exercise3;

public class StarkTest {

    public static void main(String[] args) {
        Company stark = new StarkEnterprises();
        try {
            stark.addEmployee(0, "Tony");
            stark.addEmployee(1, "Pepper");
            stark.addEmployee(2, "Jarvis");
            stark.addProject(0, "Suit");
            stark.addProject(1, "Jarvis");
            stark.addProject(2, "Jarvis");
            stark.addProject(3, "Finances");
            System.out.println(stark.getEmployeeName(0));
            stark.assignEmployeeToProject(0, 0);            // not completely implemented
            stark.assignEmployeeToProject(0, 1);
            stark.assignEmployeeToProject(1, 3);
            stark.assignEmployeeToProject(2, 0);
            stark.assignEmployeeToProject(2, 2);
            System.out.println(stark);
        }
        catch (InvalidIdException e) {
            System.out.println("Invalid ID: " + e.getId());
        } catch (DuplicateIdException e) {
            System.out.println("DuplicateIdException!");
        } catch (UnknownIdException e) {
            throw new RuntimeException(e);
        }
    }

}

