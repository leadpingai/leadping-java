package ai.leadping.openapi.organizations.me.members.item;

import ai.leadping.openapi.models.OrganizationMemberRequest;
import ai.leadping.openapi.models.OrganizationMemberResponse;
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
 * Builds and executes requests for operations under /organizations/me/members/{userId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithUserItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/me/members/{userId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithUserItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/me/members/{userId}", rawUrl);
    }
    /**
     * Removes a user from the current organization, revoking their access to its leads, settings, billing, and communication data.
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Removes a user from the current organization, revoking their access to its leads, settings, billing, and communication data.
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
     * Changes a user&apos;s role in the current organization, updating access to lead, automation, billing, and admin workflows.
     * @param body Defines the fields clients can send when working with organization user.
     * @return a {@link OrganizationMemberResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberResponse put(@jakarta.annotation.Nonnull final OrganizationMemberRequest body) {
        return put(body, null);
    }
    /**
     * Changes a user&apos;s role in the current organization, updating access to lead, automation, billing, and admin workflows.
     * @param body Defines the fields clients can send when working with organization user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationMemberResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberResponse put(@jakarta.annotation.Nonnull final OrganizationMemberRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationMemberResponse::createFromDiscriminatorValue);
    }
    /**
     * Removes a user from the current organization, revoking their access to its leads, settings, billing, and communication data.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Removes a user from the current organization, revoking their access to its leads, settings, billing, and communication data.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json, application/problem+json, text/plain;q=0.9");
        return requestInfo;
    }
    /**
     * Changes a user&apos;s role in the current organization, updating access to lead, automation, billing, and admin workflows.
     * @param body Defines the fields clients can send when working with organization user.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final OrganizationMemberRequest body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Changes a user&apos;s role in the current organization, updating access to lead, automation, billing, and admin workflows.
     * @param body Defines the fields clients can send when working with organization user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final OrganizationMemberRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithUserItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithUserItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithUserItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
