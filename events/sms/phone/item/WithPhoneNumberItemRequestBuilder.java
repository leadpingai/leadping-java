package ai.leadping.openapi.events.sms.phone.item;

import ai.leadping.openapi.models.PagedResultOfSmsEventTableRow;
import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.RequestDataOptions;
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
 * Builds and executes requests for operations under /events/sms/phone/{phoneNumber}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPhoneNumberItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithPhoneNumberItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPhoneNumberItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/sms/phone/{phoneNumber}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPhoneNumberItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPhoneNumberItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/events/sms/phone/{phoneNumber}", rawUrl);
    }
    /**
     * Lists SMS events for one phone number with paging, helping users review volume, delivery outcomes, and communication history.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @return a {@link PagedResultOfSmsEventTableRow}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public PagedResultOfSmsEventTableRow post(@jakarta.annotation.Nonnull final RequestDataOptions body) {
        return post(body, null);
    }
    /**
     * Lists SMS events for one phone number with paging, helping users review volume, delivery outcomes, and communication history.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PagedResultOfSmsEventTableRow}
     * @throws ProblemDetails When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public PagedResultOfSmsEventTableRow post(@jakarta.annotation.Nonnull final RequestDataOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PagedResultOfSmsEventTableRow::createFromDiscriminatorValue);
    }
    /**
     * Lists SMS events for one phone number with paging, helping users review volume, delivery outcomes, and communication history.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RequestDataOptions body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Lists SMS events for one phone number with paging, helping users review volume, delivery outcomes, and communication history.
     * @param body Options for flexible, efficient, and explicit querying in Cosmos DB or similar repositories.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RequestDataOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithPhoneNumberItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPhoneNumberItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPhoneNumberItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
