package ai.leadping.openapi.events.calls;

import ai.leadping.openapi.events.calls.all.AllRequestBuilder;
import ai.leadping.openapi.events.calls.item.WithCallEventItemRequestBuilder;
import ai.leadping.openapi.events.calls.lead.LeadRequestBuilder;
import ai.leadping.openapi.events.calls.phone.PhoneRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/calls
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallsRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The lead property
     * @return a {@link LeadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadRequestBuilder lead() {
        return new LeadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The phone property
     * @return a {@link PhoneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhoneRequestBuilder phone() {
        return new PhoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.events.calls.item collection
     * @param callEventId The ID of the call event to retrieve.
     * @return a {@link WithCallEventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCallEventItemRequestBuilder byCallEventId(@jakarta.annotation.Nonnull final String callEventId) {
        Objects.requireNonNull(callEventId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("callEventId", callEventId);
        return new WithCallEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CallsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/calls", pathParameters);
    }
    /**
     * Instantiates a new {@link CallsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/calls", rawUrl);
    }
}
