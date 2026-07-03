package ai.leadping.openapi.telephony;

import ai.leadping.openapi.telephony.login.LoginRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /telephony
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TelephonyRequestBuilder extends BaseRequestBuilder {
    /**
     * The login property
     * @return a {@link LoginRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LoginRequestBuilder login() {
        return new LoginRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TelephonyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TelephonyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/telephony", pathParameters);
    }
    /**
     * Instantiates a new {@link TelephonyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TelephonyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/telephony", rawUrl);
    }
}
