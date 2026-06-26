package ai.leadping.openapi.dispositions.lead;

import ai.leadping.openapi.dispositions.lead.item.WithLeadItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dispositions/lead
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.dispositions.lead.item collection
     * @param leadId The ID of the lead to get dispositions for.
     * @return a {@link WithLeadItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithLeadItemRequestBuilder byLeadId(@jakarta.annotation.Nonnull final String leadId) {
        Objects.requireNonNull(leadId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("leadId", leadId);
        return new WithLeadItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link LeadRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dispositions/lead", pathParameters);
    }
    /**
     * Instantiates a new {@link LeadRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dispositions/lead", rawUrl);
    }
}
