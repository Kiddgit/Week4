import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employeenames {

	public static void main(String[] args) {
		//String[] employeeNames = {"Billy", "Joe", "Josh", "Piper", "Alia" };
		
		//List<>
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Billy");
		employeeNames.add("Joe");
		employeeNames.add("Josh");
		employeeNames.add("Piper");
		employeeNames.add("Alia");
	
	
	
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(0);
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
	
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		for (Integer id : ids) {
			String name = employeeNames.get(i++);
			employeeMap.put(id, name);
			}
		
		
		for (Integer id : employeeMap.keySet()) {
			System.out.println(id + "-" + employeeNames.get(id));
			}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (Integer id : ids) {
		idsBuilder.append(id).append("-");	
		}  
		
	System.out.println(idsBuilder.toString());
	
	
	
	StringBuilder namesBuilder = new StringBuilder();
		
	for (String name : employeeNames) {
		namesBuilder.append(name).append(" ");
		}
	
	System.out.println(namesBuilder);
	}
}
