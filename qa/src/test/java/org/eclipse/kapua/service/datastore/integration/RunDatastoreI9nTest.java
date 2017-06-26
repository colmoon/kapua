/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.datastore.integration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/datastore",
        glue = {"org.eclipse.kapua.qa.steps",
                "org.eclipse.kapua.service.datastore.steps",
                "org.eclipse.kapua.service.user.steps",
        },
        plugin = { "pretty",
                "html:target/cucumber/DatastoreI9n",
                "json:target/DatastoreI9n_cucumber.json" },
        monochrome = true)
public class RunDatastoreI9nTest {
}