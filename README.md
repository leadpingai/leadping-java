[![](https://img.shields.io/maven-central/v/ai.leadping/leadping.svg?style=for-the-badge)](https://central.sonatype.com/artifact/ai.leadping/leadping)
[![](https://img.shields.io/github/actions/workflow/status/leadpingai/leadping-java/release.yml?style=for-the-badge)](https://github.com/leadpingai/leadping-java/actions/workflows/release.yml)
[![](https://img.shields.io/github/downloads/leadpingai/leadping-java/total?style=for-the-badge)](https://github.com/leadpingai/leadping-java/releases)
[![](https://img.shields.io/github/actions/workflow/status/leadpingai/leadping-java/codeql.yml?label=CodeQL&style=for-the-badge)](https://github.com/leadpingai/leadping-java/actions/workflows/codeql.yml)

# ![Leadping](https://leadping.ai/favicon.ico) Leadping Java SDK

The official, type-safe Java SDK for the Leadping API. Use it to integrate lead management, conversations, SMS and calling, automations, reporting, billing, and business settings into Java applications.

The package is generated from the [Leadping OpenAPI specification](https://leadping.ai/docs/openapi.json) with Microsoft Kiota. It contains request builders and models; your application supplies the HTTP request adapter, credentials, retry policy, and credential storage.

## Installation

With Maven:

```xml
<dependencies>
  <dependency>
    <groupId>ai.leadping</groupId>
    <artifactId>leadping</artifactId>
    <version>VERSION</version>
  </dependency>
  <dependency>
    <groupId>com.microsoft.kiota</groupId>
    <artifactId>microsoft-kiota-bundle</artifactId>
    <version>1.9.3</version>
  </dependency>
</dependencies>
```

With Gradle:

```gradle
implementation "ai.leadping:leadping:VERSION"
implementation "com.microsoft.kiota:microsoft-kiota-bundle:1.9.3"
```

Replace `VERSION` with the current version shown by the Maven Central badge above.

## Authentication

Set `LEADPING_API_KEY` to a WorkOS organization API key (`sk_...`). The SDK sends it as `Authorization: Bearer <credential>`. User access tokens are also supported when acting for a signed-in user; `lp_src_...` keys are only for lead-ingestion endpoints. See [API authentication](https://leadping.ai/docs/api-authentication).

## Create a client

Kiota's API-key authentication provider can place the complete Bearer value in the `Authorization` header:

```java
import ai.leadping.openapi.LeadpingOpenApiClient;
import com.microsoft.kiota.authentication.ApiKeyAuthenticationProvider;
import com.microsoft.kiota.authentication.ApiKeyLocation;
import com.microsoft.kiota.http.OkHttpRequestAdapter;

public final class App {
    public static void main(String[] args) {
        String credential = System.getenv("LEADPING_API_KEY");
        if (credential == null || credential.isBlank()) {
            throw new IllegalStateException("LEADPING_API_KEY is not set.");
        }

        var authProvider = new ApiKeyAuthenticationProvider(
                "Bearer " + credential,
                "Authorization",
                ApiKeyLocation.HEADER,
                "api.leadping.ai");

        var adapter = new OkHttpRequestAdapter(authProvider);
        var client = new LeadpingOpenApiClient(adapter);

        var lead = client.leads().byId("lead-id").get();
        System.out.println(lead.getId());
    }
}
```

The client defaults to `https://api.leadping.ai`.

## Common operations

Request builders mirror the API path. Methods such as `byId` select a resource; terminal methods send the request.

```java
// Requires a user access token.
var currentUser = client.users().me().get();

// Retrieve organization resources by ID.
var source = client.sources().byId("source-id").get();
var lead = client.leads().byId("lead-id").get();
```

Create and update operations accept generated request classes from `ai.leadping.openapi.models`.

## Resources

- [Leadping introduction](https://leadping.ai/docs/introduction)
- [API authentication](https://leadping.ai/docs/api-authentication)
- [API reference](https://leadping.ai/docs/api-reference)
- [OpenAPI specification](https://leadping.ai/docs/openapi.json)
- [Maven Central package](https://central.sonatype.com/artifact/ai.leadping/leadping)
- [License](LICENSE)
