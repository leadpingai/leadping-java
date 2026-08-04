package ai.leadping.openapi.events.organizations;

import ai.leadping.openapi.events.organizations.item.WithOrganizationItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /events/organizations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.events.organizations.item collection
     * @param organizationId The organization identifier.
     * @return a {@link WithOrganizationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithOrganizationItemRequestBuilder byOrganizationId(@jakarta.annotation.Nonnull final String organizationId) {
        Objects.requireNonNull(organizationId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organizationId", organizationId);
        return new WithOrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link OrganizationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/organizations", pathParameters);
    }
    /**
     * Instantiates a new {@link OrganizationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OrganizationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/organizations", rawUrl);
    }
}
