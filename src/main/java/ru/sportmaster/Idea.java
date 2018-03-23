package ru.sportmaster;

import ru.sportmaster.bean.IdeaItem;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface Idea {

    @WebMethod
    IdeaItem getIdea(Integer id) throws Exception;

    @WebMethod
    List<IdeaItem> getListIdea();

    @WebMethod
    void setIdea(IdeaItem item);
}
