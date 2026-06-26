package ai.leadping.openapi.businesses.me.invitations;

import ai.leadping.openapi.businesses.me.invitations.item.WithInvitationItemRequestBuilder;
import ai.leadping.openapi.models.BusinessInvitationRequest;
import ai.leadping.openapi.models.BusinessInvitationResponse;
import ai.leadping.openapi.models.BusinessInvitationTableRow;
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
 * Builds and executes requests for operations under /businesses/me/invitations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.businesses.me.invitations.item collection
     * @param invitationId The ID of the current-business invitation to revoke.
     * @return a {@link WithInvitationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInvitationItemRequestBuilder byInvitationId(@jakarta.annotation.Nonnull final String invitationId) {
        Objects.requireNonNull(invitationId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invitationId", invitationId);
        return new WithInvitationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InvitationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/me/invitations", pathParameters);
    }
    /**
     * Instantiates a new {@link InvitationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/me/invitations", rawUrl);
    }
    /**
     * Lists pending and historical invitations for the current business, including recipient, role, status, and expiration.
     * @return a {@link java.util.List<BusinessInvitationTableRow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessInvitationTableRow> get() {
        return get(null);
    }
    /**
     * Lists pending and historical invitations for the current business, including recipient, role, status, and expiration.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<BusinessInvitationTableRow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessInvitationTableRow> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, BusinessInvitationTableRow::createFromDiscriminatorValue);
    }
    /**
     * Creates an invitation for the current business so another user can join with the requested role and account access.
     * @param body Request payload for business invitation.
     * @return a {@link BusinessInvitationResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public BusinessInvitationResponse post(@jakarta.annotation.Nonnull final BusinessInvitationRequest body) {
        return post(body, null);
    }
    /**
     * Creates an invitation for the current business so another user can join with the requested role and account access.
     * @param body Request payload for business invitation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BusinessInvitationResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public BusinessInvitationResponse post(@jakarta.annotation.Nonnull final BusinessInvitationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BusinessInvitationResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists pending and historical invitations for the current business, including recipient, role, status, and expiration.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists pending and historical invitations for the current business, including recipient, role, status, and expiration.
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
     * Creates an invitation for the current business so another user can join with the requested role and account access.
     * @param body Request payload for business invitation.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BusinessInvitationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates an invitation for the current business so another user can join with the requested role and account access.
     * @param body Request payload for business invitation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BusinessInvitationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link InvitationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InvitationsRequestBuilder(rawUrl, requestAdapter);
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
