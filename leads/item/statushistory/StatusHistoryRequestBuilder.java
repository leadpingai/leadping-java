package ai.leadping.openapi.leads.item.statushistory;

import ai.leadping.openapi.leads.item.statushistory.export.ExportRequestBuilder;
import ai.leadping.openapi.models.LeadStatusChangeResponse;
import ai.leadping.openapi.models.ProblemDetails;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /leads/{-id}/status-history
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StatusHistoryRequestBuilder extends BaseRequestBuilder {
    /**
     * The export property
     * @return a {@link ExportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExportRequestBuilder export() {
        return new ExportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link StatusHistoryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StatusHistoryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/leads/{%2Did}/status-history", pathParameters);
    }
    /**
     * Instantiates a new {@link StatusHistoryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StatusHistoryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/leads/{%2Did}/status-history", rawUrl);
    }
    /**
     * Lists lead status change outcome history for one lead, including prior outcomes, notes, follow-up context, timestamps, and actor details used for audit review.
     * @return a {@link java.util.List<LeadStatusChangeResponse>}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<LeadStatusChangeResponse> get() {
        return get(null);
    }
    /**
     * Lists lead status change outcome history for one lead, including prior outcomes, notes, follow-up context, timestamps, and actor details used for audit review.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<LeadStatusChangeResponse>}
     * @throws ProblemDetails When receiving a 401 status code
     * @throws ProblemDetails When receiving a 404 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<LeadStatusChangeResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("404", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, LeadStatusChangeResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists lead status change outcome history for one lead, including prior outcomes, notes, follow-up context, timestamps, and actor details used for audit review.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists lead status change outcome history for one lead, including prior outcomes, notes, follow-up context, timestamps, and actor details used for audit review.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link StatusHistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StatusHistoryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StatusHistoryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
