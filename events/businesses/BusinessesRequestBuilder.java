package ai.leadping.openapi.events.businesses;

import ai.leadping.openapi.events.businesses.item.WithBusinessItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/businesses
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.events.businesses.item collection
     * @param businessId The business identifier.
     * @return a {@link WithBusinessItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithBusinessItemRequestBuilder byBusinessId(@jakarta.annotation.Nonnull final String businessId) {
        Objects.requireNonNull(businessId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("businessId", businessId);
        return new WithBusinessItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link BusinessesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BusinessesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/businesses", pathParameters);
    }
    /**
     * Instantiates a new {@link BusinessesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BusinessesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/businesses", rawUrl);
    }
}
