package ru.sportmaster;

import ru.sportmaster.bean.IdeaItem;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class IdeaImpl implements Idea {

    private List<IdeaItem> ideaList = new ArrayList<IdeaItem>();

    @WebMethod
    public IdeaItem getIdea(Integer id) {
        return ideaList.get(id);
    }

    @WebMethod
    public List<IdeaItem> getListIdea() {
        return ideaList;
    }

    @WebMethod
    public void setIdea(IdeaItem item) {
        this.ideaList.add(item);
    }
}
