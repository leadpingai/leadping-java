package ai.leadping.openapi.paymentmethods.invoices.item;

import ai.leadping.openapi.paymentmethods.invoices.item.pdfaccess.PdfAccessRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /payment-methods/invoices/{invoiceId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithInvoiceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The pdfAccess property
     * @return a {@link PdfAccessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PdfAccessRequestBuilder pdfAccess() {
        return new PdfAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithInvoiceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvoiceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment-methods/invoices/{invoiceId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithInvoiceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithInvoiceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment-methods/invoices/{invoiceId}", rawUrl);
    }
}
