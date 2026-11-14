package ai.leadping.openapi.invitations.item;

import ai.leadping.openapi.invitations.item.accept.AcceptRequestBuilder;
import ai.leadping.openapi.invitations.item.decline.DeclineRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /invitations/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The accept property
     * @return a {@link AcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder accept() {
        return new AcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The decline property
     * @return a {@link DeclineRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeclineRequestBuilder decline() {
        return new DeclineRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link InvitationsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/invitations/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link InvitationsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvitationsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/invitations/{id}", rawUrl);
    }
}
