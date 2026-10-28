package ai.leadping.openapi.outbound;

import ai.leadping.openapi.outbound.item.WithPhoneNumberItemRequestBuilder;
import ai.leadping.openapi.outbound.overview.OverviewRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /outbound
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutboundRequestBuilder extends BaseRequestBuilder {
    /**
     * The overview property
     * @return a {@link OverviewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OverviewRequestBuilder overview() {
        return new OverviewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.outbound.item collection
     * @param phoneNumberId The ID of the phone number whose outbound capacity should be retrieved.
     * @return a {@link WithPhoneNumberItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPhoneNumberItemRequestBuilder byPhoneNumberId(@jakarta.annotation.Nonnull final String phoneNumberId) {
        Objects.requireNonNull(phoneNumberId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("phoneNumberId", phoneNumberId);
        return new WithPhoneNumberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OutboundRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutboundRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/outbound", pathParameters);
    }
    /**
     * Instantiates a new {@link OutboundRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OutboundRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/outbound", rawUrl);
    }
}
