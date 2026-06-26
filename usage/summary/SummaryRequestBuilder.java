package ai.leadping.openapi.usage.summary;

import ai.leadping.openapi.usage.summary.my.MyRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /usage/summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * The my property
     * @return a {@link MyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MyRequestBuilder my() {
        return new MyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/usage/summary", pathParameters);
    }
    /**
     * Instantiates a new {@link SummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/usage/summary", rawUrl);
    }
}
