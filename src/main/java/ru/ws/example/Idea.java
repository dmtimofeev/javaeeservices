package ru.ws.example;

import ru.ws.example.bean.IdeaItem;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface Idea {

    @WebMethod
    IdeaItem getIdea(int id) throws Exception;

    @WebMethod
    List<IdeaItem> getListIdea();

    @WebMethod
    void setIdea(IdeaItem item);
}
