package ai.leadping.openapi.reports.exports;

import ai.leadping.openapi.reports.exports.item.WithExportItemRequestBuilder;
import ai.leadping.openapi.reports.exports.my.MyRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /reports/exports
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportsRequestBuilder extends BaseRequestBuilder {
    /**
     * The my property
     * @return a {@link MyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MyRequestBuilder my() {
        return new MyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.reports.exports.item collection
     * @param exportId Unique identifier of the item
     * @return a {@link WithExportItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithExportItemRequestBuilder byExportId(@jakarta.annotation.Nonnull final String exportId) {
        Objects.requireNonNull(exportId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("exportId", exportId);
        return new WithExportItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ExportsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/exports", pathParameters);
    }
    /**
     * Instantiates a new {@link ExportsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/exports", rawUrl);
    }
}
