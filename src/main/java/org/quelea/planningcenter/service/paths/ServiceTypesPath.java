package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.ServiceTypesService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class ServiceTypesPath {

    private final Retrofit retrofit;

    public ServiceTypesService api() {
        return retrofit.create(ServiceTypesService.class);
    }

}
