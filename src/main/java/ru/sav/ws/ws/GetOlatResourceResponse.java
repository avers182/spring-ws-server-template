package ru.sav.ws.ws;

import ru.sav.ws.model.OlatResource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getOlatResourceResponse")
public class GetOlatResourceResponse {
    private OlatResource olatResource;

    public OlatResource getOlatResource() {
        return olatResource;
    }

    public void setOlatResource(OlatResource olatResource) {
        this.olatResource = olatResource;
    }
}
