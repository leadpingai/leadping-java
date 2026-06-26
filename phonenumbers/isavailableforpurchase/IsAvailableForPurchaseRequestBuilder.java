package ai.leadping.openapi.phonenumbers.isavailableforpurchase;

import ai.leadping.openapi.models.PhoneNumberAvailabilityRequest;
import ai.leadping.openapi.models.PhoneNumberAvailabilityResponse;
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
 * Builds and executes requests for operations under /phone-numbers/is-available-for-purchase
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IsAvailableForPurchaseRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link IsAvailableForPurchaseRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IsAvailableForPurchaseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/is-available-for-purchase", pathParameters);
    }
    /**
     * Instantiates a new {@link IsAvailableForPurchaseRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IsAvailableForPurchaseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/phone-numbers/is-available-for-purchase", rawUrl);
    }
    /**
     * Checks whether a phone number can be purchased for the current business before creating or assigning it.
     * @param body Request schema for checking phone number availability before purchase or assignment.
     * @return a {@link PhoneNumberAvailabilityResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PhoneNumberAvailabilityResponse post(@jakarta.annotation.Nonnull final PhoneNumberAvailabilityRequest body) {
        return post(body, null);
    }
    /**
     * Checks whether a phone number can be purchased for the current business before creating or assigning it.
     * @param body Request schema for checking phone number availability before purchase or assignment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PhoneNumberAvailabilityResponse}
     * @throws ProblemDetails When receiving a 400 status code
     * @throws ProblemDetails When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PhoneNumberAvailabilityResponse post(@jakarta.annotation.Nonnull final PhoneNumberAvailabilityRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ProblemDetails::createFromDiscriminatorValue);
        errorMapping.put("500", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PhoneNumberAvailabilityResponse::createFromDiscriminatorValue);
    }
    /**
     * Checks whether a phone number can be purchased for the current business before creating or assigning it.
     * @param body Request schema for checking phone number availability before purchase or assignment.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PhoneNumberAvailabilityRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Checks whether a phone number can be purchased for the current business before creating or assigning it.
     * @param body Request schema for checking phone number availability before purchase or assignment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PhoneNumberAvailabilityRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IsAvailableForPurchaseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsAvailableForPurchaseRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IsAvailableForPurchaseRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
