package ai.leadping.openapi.organizations.me.members;

import ai.leadping.openapi.models.OrganizationMemberRequest;
import ai.leadping.openapi.models.OrganizationMemberResponse;
import ai.leadping.openapi.models.OrganizationMemberTableRow;
import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.organizations.me.members.item.WithUserItemRequestBuilder;
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
 * Builds and executes requests for operations under /organizations/me/members
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MembersRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.organizations.me.members.item collection
     * @param userId The ID of the user whose current-organization role is changing.
     * @return a {@link WithUserItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithUserItemRequestBuilder byUserId(@jakarta.annotation.Nonnull final String userId) {
        Objects.requireNonNull(userId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userId", userId);
        return new WithUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MembersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/me/members", pathParameters);
    }
    /**
     * Instantiates a new {@link MembersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MembersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/me/members", rawUrl);
    }
    /**
     * Lists users assigned to the current organization, including roles and membership details for access management.
     * @return a {@link java.util.List<OrganizationMemberTableRow>}
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationMemberTableRow> get() {
        return get(null);
    }
    /**
     * Lists users assigned to the current organization, including roles and membership details for access management.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<OrganizationMemberTableRow>}
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrganizationMemberTableRow> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, OrganizationMemberTableRow::createFromDiscriminatorValue);
    }
    /**
     * Adds an existing user to the current organization with the requested role for shared lead communication and account access.
     * @param body Request schema for the Leadping API organization user request, including the fields clients can send.
     * @return a {@link OrganizationMemberResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberResponse post(@jakarta.annotation.Nonnull final OrganizationMemberRequest body) {
        return post(body, null);
    }
    /**
     * Adds an existing user to the current organization with the requested role for shared lead communication and account access.
     * @param body Request schema for the Leadping API organization user request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OrganizationMemberResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 403 status code
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberResponse post(@jakarta.annotation.Nonnull final OrganizationMemberRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("403", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationMemberResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists users assigned to the current organization, including roles and membership details for access management.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists users assigned to the current organization, including roles and membership details for access management.
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
     * Adds an existing user to the current organization with the requested role for shared lead communication and account access.
     * @param body Request schema for the Leadping API organization user request, including the fields clients can send.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationMemberRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Adds an existing user to the current organization with the requested role for shared lead communication and account access.
     * @param body Request schema for the Leadping API organization user request, including the fields clients can send.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final OrganizationMemberRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MembersRequestBuilder(rawUrl, requestAdapter);
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
