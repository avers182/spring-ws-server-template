package ru.sav.ws.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getOlatResourceRequest")
public class GetOlatResourceRequest {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
