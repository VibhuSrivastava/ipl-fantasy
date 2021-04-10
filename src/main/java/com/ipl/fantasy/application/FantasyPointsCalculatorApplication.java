package com.ipl.fantasy.application;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * An application configuration class. Provides information about packages
 * and applies dependency injection bindings
 */
public class FantasyPointsCalculatorApplication extends ResourceConfig {

    public FantasyPointsCalculatorApplication() {
        register(new PointsBinder());
        packages(true, "com.ipl.fantasy");
    }

}
