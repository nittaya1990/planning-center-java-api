package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.CustomSlidesService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class CustomSlidesPath {

    private final Retrofit retrofit;

    public CustomSlidesService api() {
        return retrofit.create(CustomSlidesService.class);
    }
}
