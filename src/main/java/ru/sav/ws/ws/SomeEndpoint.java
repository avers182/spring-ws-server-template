package ru.sav.ws.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeader;
import ru.sav.ws.service.OlatResourceService;

@Endpoint
public class SomeEndpoint {
    @Autowired
    private OlatResourceService olatResourceService;

    @PayloadRoot(localPart = "getOlatResourceRequest", namespace = "http://ws.sav.ru/anamespace")
    @ResponsePayload
    public GetOlatResourceResponse getOlatResource(@RequestPayload GetOlatResourceRequest request, SoapHeader soapHeader) {
        GetOlatResourceResponse response = new GetOlatResourceResponse();
        response.setOlatResource(olatResourceService.getOlatResource(request.getId()));
        return response;
    }

}