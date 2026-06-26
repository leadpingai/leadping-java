package ai.leadping.openapi.businesses.invitations.accept;

import ai.leadping.openapi.models.AcceptBusinessInvitationRequest;
import ai.leadping.openapi.models.BusinessInvitationResponse;
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
 * Builds and executes requests for operations under /businesses/invitations/accept
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AcceptRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AcceptRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/invitations/accept", pathParameters);
    }
    /**
     * Instantiates a new {@link AcceptRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/invitations/accept", rawUrl);
    }
    /**
     * Accepts a business invitation for the signed-in user, creating membership and setting business access context.
     * @param body Request payload for accept business invitation.
     * @return a {@link BusinessInvitationResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public BusinessInvitationResponse post(@jakarta.annotation.Nonnull final AcceptBusinessInvitationRequest body) {
        return post(body, null);
    }
    /**
     * Accepts a business invitation for the signed-in user, creating membership and setting business access context.
     * @param body Request payload for accept business invitation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BusinessInvitationResponse}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public BusinessInvitationResponse post(@jakarta.annotation.Nonnull final AcceptBusinessInvitationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BusinessInvitationResponse::createFromDiscriminatorValue);
    }
    /**
     * Accepts a business invitation for the signed-in user, creating membership and setting business access context.
     * @param body Request payload for accept business invitation.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AcceptBusinessInvitationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Accepts a business invitation for the signed-in user, creating membership and setting business access context.
     * @param body Request payload for accept business invitation.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AcceptBusinessInvitationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AcceptRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
