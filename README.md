Google Ads API Java Client Library
==================================

This project hosts the Java client library for the various SOAP-Based Ads APIs
(AdWords and DFP) at Google.

## Features

  * Distributed via [Maven](https://maven.apache.org/).
  * Uses the [SLF4J](http://www.slf4j.org/) logging facade to log requests and
    SOAP messages, allowing you to plug in a concrete logging framework of your
    choice.
  * Automatic handling of SOAP headers.
  * Easy management of credentials, authentication, and session information.
  * [JavaDoc](http://googleads.github.io/googleads-java-lib)

## Requirements

  * Java 1.6+
  * Maven 3.0+ not required, but recommended

## Announcements and updates

For API and client library updates and news, please follow our
[Google+ Ads Developers page](https://plus.google.com/+GoogleAdsDevelopers/posts)
and our [Google Ads Developers blog](http://googleadsdeveloper.blogspot.com/).

### Support forum

If you have questions about the client library or the APIs, you can ask them on
our forums:

  * [AdWords API Forum](https://groups.google.com/group/adwords-api)
  * [DoubleClick for Publishers API Forum]
    (https://groups.google.com/forum/#!forum/google-doubleclick-for-publishers-api)

## Maven artifacts

### AdWords
```
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>ads-lib</artifactId>
      <version>RELEASE</version>
    </dependency>
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>adwords-axis</artifactId>
      <version>RELEASE</version>
    </dependency>
```

### DFP
```
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>ads-lib</artifactId>
      <version>RELEASE</version>
    </dependency>
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>dfp-axis</artifactId>
      <version>RELEASE</version>
    </dependency>
```

**Note:** The following explanation is for AdWords and Axis, but the general
idea applies to all products and frameworks.

The `ads-lib` artifact contains all of the library and utility classes for
accessing the Ads API, but does not support any specific SOAP framework. All
client library classes and utilities are in the package or sub-packages of
`com.google.api.ads.common.lib`. To add support for the AdWords API using the
Apache Axis framework, the `adwords-axis` plugin artifact is also necessary.
This artifact also includes autogenerated classes from the AdWords API. They
are in the package `com.google.api.ads.adwords.{version}`.

## Getting started

1.  Configure your project. You have multiple options for this step.
    While we suggest using Maven, we understand that not all build environments
    can handle this.

    *   **If using Maven with Eclipse**

        In the [releases section]
        (https://github.com/googleads/googleads-java-lib/releases)
        download a file like ``adwords-axis-maven-and-examples-v.vv.vv.tar.gz``
        and extract its contents to a directory.

        Import the eclipse project by going to File > Import, then General >
        Existing projects into workspace and selecting the extracted folder.

    *   **If using Maven from the command line**

        In the [releases section]
        (https://github.com/googleads/googleads-java-lib/releases)
        download a file like ``adwords-axis-maven-and-examples-v.vv.vv.tar.gz``
        and extract its contents to a directory.

    *   **If using jars**

        In the [releases section]
        (https://github.com/googleads/googleads-java-lib/releases)
        download a file like ``adwords-axis-jars-and-examples-v.vv.vv.tar.gz`` and
        extract its contents to a directory.

2.  Copy the sample `ads.properties` file to your home directory and fill out
    the required properties. You can skip the properties ending with `clientId`,
    `clientSecret`, and `refreshToken` for now. You'll set those in the next
    step.

    *   [AdWords ads.properties]
        (https://github.com/googleads/googleads-java-lib/blob/master/examples/adwords_axis/src/main/resources/ads.properties)
    *   [DFP ads.properties]
        (https://github.com/googleads/googleads-java-lib/blob/master/examples/dfp_axis/src/main/resources/ads.properties)

3.  Setup your OAuth2 credentials.

    The AdWords and DoubleClick for Publishers APIs use
    [OAuth2](http://oauth.net/2/) as the authentication mechanism. Follow the
    appropriate guide below based on your use case.

    **If you're accessing an API using your own credentials...**

    *   [Using AdWords]
        (https://github.com/googleads/googleads-java-lib/wiki/API-access-using-own-credentials-(installed-application-flow))
    *   [Using DFP]
        (https://github.com/googleads/googleads-java-lib/wiki/API-access-using-own-credentials-(server-to-server-flow))

    **If you're accessing an API on behalf of clients...**

    *   [Developing a web application (AdWords or DFP)]
        (https://github.com/googleads/googleads-java-lib/wiki/API-access-on-behalf-of-your-clients-(web-flow))

4.  Run an example.

    *   **If using Maven with Eclipse**

        Navigate in your project to any example (e.g.,
        `src/main/java/adwords/axis/v201607/basicoperations/GetCampaigns.java`)
        and run the example.

    *   **If using Maven from the command line**

        This command runs the ``GetCampaigns`` example, but you can update the
        ``-Dexec.mainClass`` argument with the example of your choice.

        ```
        $ mvn -X exec:java -Dexec.mainClass="adwords.axis.v201607.basicoperations.GetCampaigns"
        ```

    *   **If using jars**

        Navigate in your project to any example (e.g.,
        `src/adwords/axis/v201607/basicoperations/GetCampaigns.java`)
        and run the example.

## Basic usage

The following example is for AdWords and Axis, but the general code applies
to all products and frameworks.

```java
// Contains the data classes and service classes.
import com.google.api.ads.adwords.axis.v201607.*;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.axis.factory.AdWordsServices;

public static void main(String[] args) throws Exception {
  /**
   * Create an AdWordsSession instance, loading credentials from the
   * properties file:
   */

  // Get an OAuth2 credential.
  Credential credential = new OfflineCredentials.Builder()
      .forApi(OfflineCredentials.Api.AdWords)
      .fromFile()
      .build()
      .generateCredential();

  // Construct an AdWordsSession.
  AdWordsSession session = new AdWordsSession.Builder()
      .fromFile()
      .withOAuth2Credential(credential)
      .build();

  /**
   * Alternatively, you can specify your credentials in the constructor:
   */

  // Get an OAuth2 credential.
  credential = new OfflineCredentials.Builder()
      .forApi(OfflineCredentials.Api.AdWords)
      .withClientSecrets(clientId, clientSecret)
      .withRefreshToken(refreshToken)
      .build()
      .generateCredential();

  // Construct an AdWordsSession.
  session = new AdWordsSession.Builder()
      .withDeveloperToken(developerToken)
      // ...
      .withOAuth2Credential(credential)
      .build();

  /**
   * Instantiate the desired service class using the AdWordsServices utility and
   * a Class object representing your service.
   */

  // Get the CampaignService.
  CampaignServiceInterface campaignService =
      new AdWordsServices().get(session, CampaignServiceInterface.class);

  /**
   * Create data objects and invoke methods on the service class instance. The
   * data objects and methods map directly to the data objects and requests for
   * the corresponding web service.
   */

  // Create selector.
  Selector selector = new Selector();
  selector.setFields(new String[] {"Id", "Name"});

  // Get all campaigns.
  CampaignPage page = campaignService.get(selector);
}
```

## How do I enable logging?

The client library uses [SLF4J](http://www.slf4j.org/) for all logging. Check
out our [logging guide on github]
(https://github.com/googleads/googleads-java-lib/wiki/Logging) for more details.

## How do I enable compression?

First, add an entry to your `ads.properties` file for each API you plan to use.

    # AdWords
    api.adwords.useCompression=true
    # DFP
    api.dfp.useCompression=true

If using JaxWs, then no further steps are required.

If using Axis, then no further steps are required unless you are setting the
`axis.ClientConfigFile` system property. If you are setting
`axis.ClientConfigFile` to your own custom WSDD file and you want to use
compression, please ensure that the `http` transport defined in your WSDD
supports compression.

## Using a proxy

It is recommended that the user set JVM arguments to configure this application
for their proxy.

    https.proxyHost      Hostname of proxy server                      web-proxy
    https.proxyPort      Port on server of proxy                       8080
    https.proxyUser      Optional username for proxy authentication    someone
    https.proxyPassword  Optional proxy server password                secret

These properties can be set with java args in your eclipse run configuration:

    -Dhttps.proxyHost=web-proxy -Dhttps.proxyPort=8080 -Dhttps.proxyUser=someone
    -Dhttps.proxyPassword=secret ...

If necessary, set this up in code by doing the following:

    System.setProperty("https.proxyHost", "web-proxy");
    System.setProperty("https.proxyPort", "8080");
    System.setProperty("https.proxyUser", "someone");
    System.setProperty("https.proxyPassword", "secret");


## Where do I submit bug reports, feature requests and patches?

All of these items can be submitted at
(https://github.com/googleads/googleads-java-lib/issues)
