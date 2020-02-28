/*******************************************************************************
 * Copyright (c) 2019 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kapua.integration.service.device;

import cucumber.api.CucumberOptions;
import org.eclipse.kapua.qa.common.cucumber.CucumberProperty;
import org.eclipse.kapua.qa.common.cucumber.CucumberWithProperties;
import org.junit.runner.RunWith;

@RunWith(CucumberWithProperties.class)
@CucumberOptions(
        features = {"classpath:features/broker/acl/BrokerACLI9n.feature"
        },
        glue = {"org.eclipse.kapua.qa.common",
                "org.eclipse.kapua.service.account.steps",
                "org.eclipse.kapua.service.user.steps",
                "org.eclipse.kapua.service.tag.steps",
                "org.eclipse.kapua.service.device.registry.steps"
        },
        plugin = {"pretty",
                "html:target/cucumber/BrokerACLI9n",
                "json:target/BrokerACLI9n_cucumber.json"
        },
        strict = true,
        monochrome = true )
@CucumberProperty(key="kapua.config.url", value="")
@CucumberProperty(key="DOCKER_HOST", value= "")
@CucumberProperty(key="DOCKER_CERT_PATH", value= "")
@CucumberProperty(key="commons.db.schema.update", value= "")
@CucumberProperty(key="commons.db.connection.host", value= "")
@CucumberProperty(key="commons.db.connection.port", value= "")
@CucumberProperty(key="datastore.elasticsearch.nodes", value= "")
@CucumberProperty(key="datastore.elasticsearch.port", value= "")
@CucumberProperty(key="datastore.client.class", value= "")
@CucumberProperty(key="commons.eventbus.url", value= "")
@CucumberProperty(key="certificate.jwt.private.key", value= "")
@CucumberProperty(key="certificate.jwt.certificate", value= "")
@CucumberProperty(key="org.eclipse.kapua.qa.broker.extraStartupDelay", value="3")
@CucumberProperty(key="broker.ip", value="192.168.33.10")
public class RunBrokerACLI9nTest {
}
