package ai.leadping.openapi.notifications;

import ai.leadping.openapi.notifications.announcements.AnnouncementsRequestBuilder;
import ai.leadping.openapi.notifications.item.NotificationsItemRequestBuilder;
import ai.leadping.openapi.notifications.markallread.MarkAllReadRequestBuilder;
import ai.leadping.openapi.notifications.me.MeRequestBuilder;
import ai.leadping.openapi.notifications.unreadcount.UnreadCountRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /notifications
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationsRequestBuilder extends BaseRequestBuilder {
    /**
     * The announcements property
     * @return a {@link AnnouncementsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnnouncementsRequestBuilder announcements() {
        return new AnnouncementsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The markAllRead property
     * @return a {@link MarkAllReadRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkAllReadRequestBuilder markAllRead() {
        return new MarkAllReadRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The me property
     * @return a {@link MeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The unreadCount property
     * @return a {@link UnreadCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnreadCountRequestBuilder unreadCount() {
        return new UnreadCountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the ai.leadping.openapi.notifications.item collection
     * @param id The ID of the notification to mark as read.
     * @return a {@link NotificationsItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotificationsItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new NotificationsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link NotificationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/notifications", pathParameters);
    }
    /**
     * Instantiates a new {@link NotificationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NotificationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/notifications", rawUrl);
    }
}
