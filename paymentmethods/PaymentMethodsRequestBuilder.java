package ai.leadping.openapi.paymentmethods;

import ai.leadping.openapi.models.ProblemDetails;
import ai.leadping.openapi.models.StripePaymentMethodResponse;
import ai.leadping.openapi.paymentmethods.item.PaymentMethodsItemRequestBuilder;
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
 * Builds and executes requests for operations under /payment-methods
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.paymentMethods.item collection
     * @param id The ID of the payment method to retrieve.
     * @return a {@link PaymentMethodsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new PaymentMethodsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PaymentMethodsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment-methods", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentMethodsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment-methods", rawUrl);
    }
    /**
     * Gets all cards attached to the current business billing customer.
     * @return a {@link java.util.List<StripePaymentMethodResponse>}
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<StripePaymentMethodResponse> get() {
        return get(null);
    }
    /**
     * Gets all cards attached to the current business billing customer.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<StripePaymentMethodResponse>}
     * @throws ProblemDetails When receiving a 401 status code
     */
    @jakarta.annotation.Nullable
    public java.util.List<StripePaymentMethodResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ProblemDetails::createFromDiscriminatorValue);
        return this.requestAdapter.sendCollection(requestInfo, errorMapping, StripePaymentMethodResponse::createFromDiscriminatorValue);
    }
    /**
     * Gets all cards attached to the current business billing customer.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Gets all cards attached to the current business billing customer.
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
     * @return a {@link PaymentMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PaymentMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
