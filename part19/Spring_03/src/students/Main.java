package students;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import students.facade.ProfessionFacade;
import students.view.ProfessionView;

public class Main {

    public static void main(String[] args) {

        FileSystemXmlApplicationContext context =
                new FileSystemXmlApplicationContext(
                new String[]{"src/StudentExample.xml", "src/StudentDatabase.xml"});
        
        ProfessionFacade pf = (ProfessionFacade)context.getBean("professionFacade");
        ProfessionView pv = new ProfessionView();
        pv.setProfessionName("Java Developer");
        Long id = pf.addProfession(pv);
        pv.setProfessionId(id);
        pf.updateProfession(pv);
        pf.deleteProfession(pv);
        pf.findProfession();
    }
}
