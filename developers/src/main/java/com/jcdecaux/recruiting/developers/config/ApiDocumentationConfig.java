package com.jcdecaux.recruiting.developers.config;

import io.swagger.annotations.SwaggerDefinition;

/**
 * Created By SAIF on 02/07/2018
 */

@SwaggerDefinition(
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS}
)
public interface ApiDocumentationConfig {

}