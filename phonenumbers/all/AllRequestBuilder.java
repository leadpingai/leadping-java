package ai.leadping.openapi.phonenumbers.all;

import ai.leadping.openapi.phonenumbers.all.organization.OrganizationRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /phone-numbers/all
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllRequestBuilder extends BaseRequestBuilder {
    /**
     * The organization property
     * @return a {@link OrganizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AllRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AllRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/all", pathParameters);
    }
    /**
     * Instantiates a new {@link AllRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AllRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/all", rawUrl);
    }
}
