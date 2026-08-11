package ai.leadping.openapi.notifications.push.installations;

import ai.leadping.openapi.notifications.push.installations.current.CurrentRequestBuilder;
import ai.leadping.openapi.notifications.push.installations.item.WithInstallationItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /notifications/push/installations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstallationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The current property
     * @return a {@link CurrentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CurrentRequestBuilder current() {
        return new CurrentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.notifications.push.installations.item collection
     * @param installationId The stable mobile installation identifier to unregister.
     * @return a {@link WithInstallationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInstallationItemRequestBuilder byInstallationId(@jakarta.annotation.Nonnull final String installationId) {
        Objects.requireNonNull(installationId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("installationId", installationId);
        return new WithInstallationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InstallationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstallationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/notifications/push/installations", pathParameters);
    }
    /**
     * Instantiates a new {@link InstallationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstallationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/notifications/push/installations", rawUrl);
    }
}
