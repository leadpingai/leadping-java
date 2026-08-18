package ai.leadping.openapi.events.detail;

import ai.leadping.openapi.events.detail.item.WithEventItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/detail
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetailRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.events.detail.item collection
     * @param eventId The ID of the event.
     * @return a {@link WithEventItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEventItemRequestBuilder byEventId(@jakarta.annotation.Nonnull final String eventId) {
        Objects.requireNonNull(eventId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("eventId", eventId);
        return new WithEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DetailRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DetailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/detail", pathParameters);
    }
    /**
     * Instantiates a new {@link DetailRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DetailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/detail", rawUrl);
    }
}
