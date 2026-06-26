package ai.leadping.openapi.notifications.item;

import ai.leadping.openapi.notifications.item.markread.MarkReadRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /notifications/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationsItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The markRead property
     * @return a {@link MarkReadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkReadRequestBuilder markRead() {
        return new MarkReadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link NotificationsItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationsItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/notifications/{id}", pathParameters);
    }
    /**
     * Instantiates a new {@link NotificationsItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationsItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/notifications/{id}", rawUrl);
    }
}
