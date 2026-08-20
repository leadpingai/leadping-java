package ai.leadping.openapi.leadstatuschanges;

import ai.leadping.openapi.leadstatuschanges.all.AllRequestBuilder;
import ai.leadping.openapi.leadstatuschanges.item.LeadStatusChangesItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /lead-status-changes
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadStatusChangesRequestBuilder extends BaseRequestBuilder {
    /**
     * The all property
     * @return a {@link AllRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllRequestBuilder all() {
        return new AllRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.leadStatusChanges.item collection
     * @param id Unique identifier of the item
     * @return a {@link LeadStatusChangesItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadStatusChangesItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new LeadStatusChangesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LeadStatusChangesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadStatusChangesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/lead-status-changes", pathParameters);
    }
    /**
     * Instantiates a new {@link LeadStatusChangesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadStatusChangesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/lead-status-changes", rawUrl);
    }
}
