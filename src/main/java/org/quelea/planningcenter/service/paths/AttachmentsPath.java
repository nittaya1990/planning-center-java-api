package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.AttachmentsService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class AttachmentsPath {

    private final Retrofit retrofit;

    public AttachmentsService api() {
        return retrofit.create(AttachmentsService.class);
    }
}
