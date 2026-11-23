package ai.leadping.openapi.automations.item.leads.item;

import ai.leadping.openapi.automations.item.leads.item.run.RunRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /automations/{id}/leads/{leadId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithLeadItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The run property
     * @return a {@link RunRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RunRequestBuilder run() {
        return new RunRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithLeadItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLeadItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/automations/{id}/leads/{leadId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithLeadItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithLeadItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/automations/{id}/leads/{leadId}", rawUrl);
    }
}
