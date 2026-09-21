package ai.leadping.openapi.sources.item.credentials;

import ai.leadping.openapi.sources.item.credentials.rotate.RotateRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sources/{id}/credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialsRequestBuilder extends BaseRequestBuilder {
    /**
     * The rotate property
     * @return a {@link RotateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RotateRequestBuilder rotate() {
        return new RotateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CredentialsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sources/{id}/credentials", pathParameters);
    }
    /**
     * Instantiates a new {@link CredentialsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sources/{id}/credentials", rawUrl);
    }
}
