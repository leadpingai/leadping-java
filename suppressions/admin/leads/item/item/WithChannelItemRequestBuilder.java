package ai.leadping.openapi.suppressions.admin.leads.item.item;

import ai.leadping.openapi.suppressions.admin.leads.item.item.item.WithOptedInItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /suppressions/admin/leads/{leadId}/{channel}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithChannelItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.suppressions.admin.leads.item.item.item collection
     * @param optedIn Unique identifier of the item
     * @return a {@link WithOptedInItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOptedInItemRequestBuilder byOptedIn(@jakarta.annotation.Nonnull final Boolean optedIn) {
        Objects.requireNonNull(optedIn);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("optedIn", optedIn);
        return new WithOptedInItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithChannelItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithChannelItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/admin/leads/{leadId}/{channel}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithChannelItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithChannelItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/admin/leads/{leadId}/{channel}", rawUrl);
    }
}
