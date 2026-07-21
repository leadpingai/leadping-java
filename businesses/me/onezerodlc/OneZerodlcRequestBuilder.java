package ai.leadping.openapi.businesses.me.onezerodlc;

import ai.leadping.openapi.businesses.me.onezerodlc.notes.NotesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /businesses/me/10dlc
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OneZerodlcRequestBuilder extends BaseRequestBuilder {
    /**
     * The notes property
     * @return a {@link NotesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotesRequestBuilder notes() {
        return new NotesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link OneZerodlcRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OneZerodlcRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/me/10dlc", pathParameters);
    }
    /**
     * Instantiates a new {@link OneZerodlcRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OneZerodlcRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/businesses/me/10dlc", rawUrl);
    }
}
