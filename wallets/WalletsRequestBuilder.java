package ai.leadping.openapi.wallets;

import ai.leadping.openapi.wallets.item.WalletsItemRequestBuilder;
import ai.leadping.openapi.wallets.me.MeRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /wallets
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WalletsRequestBuilder extends BaseRequestBuilder {
    /**
     * The me property
     * @return a {@link MeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.wallets.item collection
     * @param id The ID of the wallet to retrieve.
     * @return a {@link WalletsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WalletsItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new WalletsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link WalletsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WalletsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/wallets", pathParameters);
    }
    /**
     * Instantiates a new {@link WalletsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WalletsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/wallets", rawUrl);
    }
}
