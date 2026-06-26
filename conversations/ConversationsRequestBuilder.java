package ai.leadping.openapi.conversations;

import ai.leadping.openapi.conversations.lead.LeadRequestBuilder;
import ai.leadping.openapi.conversations.my.MyRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /conversations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The lead property
     * @return a {@link LeadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadRequestBuilder lead() {
        return new LeadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The my property
     * @return a {@link MyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MyRequestBuilder my() {
        return new MyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ConversationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversations", pathParameters);
    }
    /**
     * Instantiates a new {@link ConversationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConversationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/conversations", rawUrl);
    }
}
