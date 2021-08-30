package com.example.linkpreviewer.Service;

import com.example.linkpreviewer.Entity.Link;
import org.jsoup.nodes.Document;

import java.io.IOException;

public interface LinkService {

    void addLink(Link link);

    Link extractData(String url) throws IOException;
    String getMetaDataFromUrl(Document document,String query);
}