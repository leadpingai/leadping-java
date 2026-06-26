[![](https://img.shields.io/maven-central/v/ai.leadping/leadping.svg?style=for-the-badge)](https://central.sonatype.com/artifact/ai.leadping/leadping)
[![](https://img.shields.io/github/actions/workflow/status/leadpingai/leadping-java/release.yml?style=for-the-badge)](https://github.com/leadpingai/leadping-java/actions/workflows/release.yml)
[![](https://img.shields.io/github/downloads/leadpingai/leadping-java/total?style=for-the-badge)](https://github.com/leadpingai/leadping-java/releases)
[![](https://img.shields.io/github/actions/workflow/status/leadpingai/leadping-java/codeql.yml?label=CodeQL&style=for-the-badge)](https://github.com/leadpingai/leadping-java/actions/workflows/codeql.yml)

# ![Leadping](https://leadping.ai/favicon.ico) Leadping Java SDK

Type-safe Java client for the Leadping API.

## Install

With Maven:

```xml
<dependency>
  <groupId>ai.leadping</groupId>
  <artifactId>leadping</artifactId>
  <version>VERSION</version>
</dependency>
```

With Gradle:

```gradle
implementation "ai.leadping:leadping:VERSION"
```

For GitHub Packages, add the GitHub Maven repository and authenticate with a token that can read packages:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/leadpingai/leadping-java</url>
  </repository>
</repositories>
```

The generated client uses a Kiota request adapter. Install the Kiota bundle in the application that will call Leadping:

```gradle
implementation "com.microsoft.kiota:microsoft-kiota-bundle:1.9.3"
```

## Use

```java
import ai.leadping.openapi.LeadpingOpenApiClient;
import com.microsoft.kiota.RequestAdapter;

public class App {
    public static void main(String[] args) {
        RequestAdapter adapter = createLeadpingRequestAdapter();
        LeadpingOpenApiClient client = new LeadpingOpenApiClient(adapter);

        var me = client.users().me().get();
    }
}
```

`createLeadpingRequestAdapter` is application code. Configure it to send one of:

- `Authorization: Bearer <token>`
- `X-Leadping-Api-Key: <key>`

The client defaults to `https://api.leadping.ai` when the adapter does not already have a base URL.

## Links

- [Documentation](https://leadping.ai/docs)
- [API reference](https://leadping.ai/docs/api-reference)
- [License](LICENSE)
