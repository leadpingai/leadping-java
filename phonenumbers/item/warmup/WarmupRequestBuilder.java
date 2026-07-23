package ai.leadping.openapi.phonenumbers.item.warmup;

import ai.leadping.openapi.models.PhoneNumberStatusResponse;
import ai.leadping.openapi.models.ProblemDetails;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /phone-numbers/{phoneNumber-id}/warmup
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WarmupRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WarmupRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WarmupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/{phoneNumber%2Did}/warmup{?endDate*,startDate*,windowDays*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WarmupRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WarmupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/{phoneNumber%2Did}/warmup{?endDate*,startDate*,windowDays*}", rawUrl);
    }
    /**
     * Returns warmup status for a phone number, including limits and recent events used for delivery pacing.
     * @return a {@link PhoneNumberStatusResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public PhoneNumberStatusResponse get() {
        return get(null);
    }
    /**
     * Returns warmup status for a phone number, including limits and recent events used for delivery pacing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PhoneNumberStatusResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public PhoneNumberStatusResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PhoneNumberStatusResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns warmup status for a phone number, including limits and recent events used for delivery pacing.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns warmup status for a phone number, including limits and recent events used for delivery pacing.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WarmupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WarmupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WarmupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns warmup status for a phone number, including limits and recent events used for delivery pacing.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The end date.
         */
        @jakarta.annotation.Nullable
        public LocalDate endDate;
        /**
         * The start date.
         */
        @jakarta.annotation.Nullable
        public LocalDate startDate;
        /**
         * The window days.
         */
        @jakarta.annotation.Nullable
        public Integer windowDays;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("endDate", endDate);
            allQueryParams.put("startDate", startDate);
            allQueryParams.put("windowDays", windowDays);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
