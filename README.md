# Leadping Java SDK

Type-safe Java client for the Leadping API.

## Install

With Maven:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/leadpingai/leadping-java</url>
  </repository>
</repositories>

<dependency>
  <groupId>ai.leadping</groupId>
  <artifactId>leadping</artifactId>
  <version>VERSION</version>
</dependency>
```

With Gradle:

```gradle
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/leadpingai/leadping-java")
    }
}

implementation "ai.leadping:leadping:VERSION"
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

- [API reference](https://leadping.ai/docs/api-reference)
- [License](LICENSE)
