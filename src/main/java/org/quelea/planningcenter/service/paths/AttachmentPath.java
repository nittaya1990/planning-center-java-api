package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.AttachmentService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class AttachmentPath {

    private final Retrofit retrofit;

    public AttachmentService api() {
        return retrofit.create(AttachmentService.class);
    }
}
