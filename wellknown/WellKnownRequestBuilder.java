package ai.leadping.openapi.wellknown;

import ai.leadping.openapi.wellknown.agentcardjson.AgentCardJsonRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /.well-known
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WellKnownRequestBuilder extends BaseRequestBuilder {
    /**
     * The agentCardJson property
     * @return a {@link AgentCardJsonRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgentCardJsonRequestBuilder agentCardJson() {
        return new AgentCardJsonRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WellKnownRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WellKnownRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/.well-known", pathParameters);
    }
    /**
     * Instantiates a new {@link WellKnownRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WellKnownRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/.well-known", rawUrl);
    }
}
