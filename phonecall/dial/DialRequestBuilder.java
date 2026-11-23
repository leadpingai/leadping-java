package ai.leadping.openapi.phonecall.dial;

import ai.leadping.openapi.phonecall.dial.item.WithRequestItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /phone-call/dial
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DialRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.phoneCall.dial.item collection
     * @param requestId Unique identifier of the item
     * @return a {@link WithRequestItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithRequestItemRequestBuilder byRequestId(@jakarta.annotation.Nonnull final UUID requestId) {
        Objects.requireNonNull(requestId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("requestId", requestId);
        return new WithRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DialRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DialRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-call/dial", pathParameters);
    }
    /**
     * Instantiates a new {@link DialRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DialRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-call/dial", rawUrl);
    }
}
