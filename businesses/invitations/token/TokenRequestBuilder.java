package ai.leadping.openapi.businesses.invitations.token;

import ai.leadping.openapi.businesses.invitations.token.item.WithTokenItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /businesses/invitations/token
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TokenRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.businesses.invitations.token.item collection
     * @param token The invitation acceptance token.
     * @return a {@link WithTokenItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithTokenItemRequestBuilder byToken(@jakarta.annotation.Nonnull final String token) {
        Objects.requireNonNull(token);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("token", token);
        return new WithTokenItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link TokenRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/invitations/token", pathParameters);
    }
    /**
     * Instantiates a new {@link TokenRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TokenRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/invitations/token", rawUrl);
    }
}
