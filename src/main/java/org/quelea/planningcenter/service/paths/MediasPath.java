package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.MediasService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class MediasPath {

    private final Retrofit retrofit;

    public MediasService api() {
        return retrofit.create(MediasService.class);
    }
}
