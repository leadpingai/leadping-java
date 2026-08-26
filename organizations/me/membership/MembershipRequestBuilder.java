package ai.leadping.openapi.organizations.me.membership;

import ai.leadping.openapi.models.ProblemDetails;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/me/membership
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembershipRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link MembershipRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/me/membership", pathParameters);
    }
    /**
     * Instantiates a new {@link MembershipRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembershipRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/me/membership", rawUrl);
    }
    /**
     * Removes the authenticated user&apos;s membership from the current organization while preserving the organization and its billing state.
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Removes the authenticated user&apos;s membership from the current organization while preserving the organization and its billing state.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Removes the authenticated user&apos;s membership from the current organization while preserving the organization and its billing state.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Removes the authenticated user&apos;s membership from the current organization while preserving the organization and its billing state.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/problem+json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MembershipRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembershipRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MembershipRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
}
