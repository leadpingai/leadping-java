package ai.leadping.openapi.paymentmethods.invoices;

import ai.leadping.openapi.models.StripeInvoiceResponse;
import ai.leadping.openapi.paymentmethods.invoices.item.WithInvoiceItemRequestBuilder;
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
 * Builds and executes requests for operations under /payment-methods/invoices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvoicesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the ai.leadping.openapi.paymentMethods.invoices.item collection
     * @param invoiceId Unique identifier of the item
     * @return a {@link WithInvoiceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInvoiceItemRequestBuilder byInvoiceId(@jakarta.annotation.Nonnull final String invoiceId) {
        Objects.requireNonNull(invoiceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invoiceId", invoiceId);
        return new WithInvoiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InvoicesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvoicesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment-methods/invoices", pathParameters);
    }
    /**
     * Instantiates a new {@link InvoicesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InvoicesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment-methods/invoices", rawUrl);
    }
    /**
     * Returns the current business&apos;s Stripe invoices with their amounts, payment status, billing period, and hosted invoice details.
     * @return a {@link java.util.List<StripeInvoiceResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StripeInvoiceResponse> get() {
        return get(null);
    }
    /**
     * Returns the current business&apos;s Stripe invoices with their amounts, payment status, billing period, and hosted invoice details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link java.util.List<StripeInvoiceResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StripeInvoiceResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, StripeInvoiceResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns the current business&apos;s Stripe invoices with their amounts, payment status, billing period, and hosted invoice details.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns the current business&apos;s Stripe invoices with their amounts, payment status, billing period, and hosted invoice details.
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
     * @return a {@link InvoicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvoicesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InvoicesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
