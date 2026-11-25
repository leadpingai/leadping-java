package ai.leadping.openapi.suppressions.admin.leads.item;

import ai.leadping.openapi.suppressions.admin.leads.item.item.WithChannelItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /suppressions/admin/leads/{leadId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithLeadItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.suppressions.admin.leads.item.item collection
     * @param channel Unique identifier of the item
     * @return a {@link WithChannelItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithChannelItemRequestBuilder byChannel(@jakarta.annotation.Nonnull final String channel) {
        Objects.requireNonNull(channel);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("channel", channel);
        return new WithChannelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithLeadItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLeadItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/admin/leads/{leadId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithLeadItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLeadItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/admin/leads/{leadId}", rawUrl);
    }
}
