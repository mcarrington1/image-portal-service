package com.image.portal.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-24T09:41:07.734618300-05:00[America/Chicago]")
@Controller
@RequestMapping("${openapi.portal.base-path:/mcarrington1/portal/1.0.0}")
public class AlbumsApiController implements AlbumsApi {

    private final AlbumsApiDelegate delegate;

    public AlbumsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AlbumsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AlbumsApiDelegate() {});
    }

    @Override
    public AlbumsApiDelegate getDelegate() {
        return delegate;
    }

}
