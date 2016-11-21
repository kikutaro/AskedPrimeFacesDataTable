package kikutaro.sample.primefaces.datatable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import kikutaro.sample.primefaces.model.Member;

/**
 *
 * @author kikuta
 */
@Named(value = "dataTableBean")
@ViewScoped
public class DataTableBean implements Serializable {
    
    private List<Member> listMember;

    public List<Member> getListMember() {
        return listMember;
    }

    public void setListMember(List<Member> listMember) {
        this.listMember = listMember;
    }

    @PostConstruct
    public void init() {
        listMember = Arrays.asList(
                new Member("西野七瀬", 22), new Member("白石麻衣", 24),
                new Member("生田絵梨花", 19), new Member("齋藤飛鳥", 18),
                new Member("生駒里奈", 20), new Member("高山一実", 22),
                new Member("桜井玲香", 22), new Member("若月佑美", 22),
                new Member("中元日芽香", 20), new Member("星野みなみ",18)
        );
    }
}
