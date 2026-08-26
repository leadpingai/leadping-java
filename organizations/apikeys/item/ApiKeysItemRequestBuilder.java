package ai.leadping.openapi.organizations.apikeys.item;

import ai.leadping.openapi.models.OrganizationApiKeyIssueResponse;
import ai.leadping.openapi.models.OrganizationApiKeyPreviewResponse;
import ai.leadping.openapi.models.OrganizationApiKeyRequest;
import ai.leadping.openapi.models.OrganizationApiKeyRevokeResponse;
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
 * Builds and executes requests for operations under /organizations/api-keys/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiKeysItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ApiKeysItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiKeysItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/api-keys/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link ApiKeysItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiKeysItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/api-keys/{id}", rawUrl);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @return a {@link OrganizationApiKeyRevokeResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyRevokeResponse delete() {
        return delete(null);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationApiKeyRevokeResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyRevokeResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationApiKeyRevokeResponse::createFromDiscriminatorValue);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @return a {@link OrganizationApiKeyPreviewResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyPreviewResponse get() {
        return get(null);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationApiKeyPreviewResponse}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 404 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyPreviewResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationApiKeyPreviewResponse::createFromDiscriminatorValue);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param body Defines the display name and access configuration for a new Leadping organization API key.
     * @return a {@link OrganizationApiKeyIssueResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyIssueResponse post(@jakarta.annotation.Nonnull final OrganizationApiKeyRequest body) {
        return post(body, null);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param body Defines the display name and access configuration for a new Leadping organization API key.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationApiKeyIssueResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     * @throws ProblemDetails When receiving a 429 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyIssueResponse post(@jakarta.annotation.Nonnull final OrganizationApiKeyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("429", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationApiKeyIssueResponse::createFromDiscriminatorValue);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param body Defines the display name and access configuration for a new Leadping organization API key.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationApiKeyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * The operation enforces organization ownership or platform-admin authorization and returns state suitable for membership, billing, and support workflows.
     * @param body Defines the display name and access configuration for a new Leadping organization API key.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationApiKeyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ApiKeysItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApiKeysItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApiKeysItemRequestBuilder(rawUrl, requestAdapter);
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
