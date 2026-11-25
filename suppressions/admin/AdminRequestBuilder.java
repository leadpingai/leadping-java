package ai.leadping.openapi.suppressions.admin;

import ai.leadping.openapi.suppressions.admin.leads.LeadsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /suppressions/admin
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminRequestBuilder extends BaseRequestBuilder {
    /**
     * The leads property
     * @return a {@link LeadsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadsRequestBuilder leads() {
        return new LeadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AdminRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/admin", pathParameters);
    }
    /**
     * Instantiates a new {@link AdminRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AdminRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/suppressions/admin", rawUrl);
    }
}
