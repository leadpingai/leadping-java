package ai.leadping.openapi.usage;

import ai.leadping.openapi.usage.all.AllRequestBuilder;
import ai.leadping.openapi.usage.summary.SummaryRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /usage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The summary property
     * @return a {@link SummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SummaryRequestBuilder summary() {
        return new SummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link UsageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/usage", pathParameters);
    }
    /**
     * Instantiates a new {@link UsageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/usage", rawUrl);
    }
}
