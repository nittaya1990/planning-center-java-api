package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.PlansService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class PlansPath {

    private final Retrofit retrofit;

    public PlansService api() {
        return retrofit.create(PlansService.class);
    }
}
