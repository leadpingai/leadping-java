package ai.leadping.openapi;

import ai.leadping.openapi.analytics.AnalyticsRequestBuilder;
import ai.leadping.openapi.automations.AutomationsRequestBuilder;
import ai.leadping.openapi.businesses.BusinessesRequestBuilder;
import ai.leadping.openapi.contact.ContactRequestBuilder;
import ai.leadping.openapi.conversations.ConversationsRequestBuilder;
import ai.leadping.openapi.dispositions.DispositionsRequestBuilder;
import ai.leadping.openapi.events.EventsRequestBuilder;
import ai.leadping.openapi.feedback.FeedbackRequestBuilder;
import ai.leadping.openapi.leads.LeadsRequestBuilder;
import ai.leadping.openapi.notifications.NotificationsRequestBuilder;
import ai.leadping.openapi.outbound.OutboundRequestBuilder;
import ai.leadping.openapi.paymentmethods.PaymentMethodsRequestBuilder;
import ai.leadping.openapi.phonenumbers.PhoneNumbersRequestBuilder;
import ai.leadping.openapi.reports.ReportsRequestBuilder;
import ai.leadping.openapi.sms.SmsRequestBuilder;
import ai.leadping.openapi.sources.SourcesRequestBuilder;
import ai.leadping.openapi.tags.TagsRequestBuilder;
import ai.leadping.openapi.transactions.TransactionsRequestBuilder;
import ai.leadping.openapi.usage.UsageRequestBuilder;
import ai.leadping.openapi.users.UsersRequestBuilder;
import ai.leadping.openapi.wallets.WalletsRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadpingOpenApiClient extends BaseRequestBuilder {
    /**
     * The analytics property
     * @return a {@link AnalyticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The automations property
     * @return a {@link AutomationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AutomationsRequestBuilder automations() {
        return new AutomationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The businesses property
     * @return a {@link BusinessesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BusinessesRequestBuilder businesses() {
        return new BusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The contact property
     * @return a {@link ContactRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactRequestBuilder contact() {
        return new ContactRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The conversations property
     * @return a {@link ConversationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationsRequestBuilder conversations() {
        return new ConversationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dispositions property
     * @return a {@link DispositionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DispositionsRequestBuilder dispositions() {
        return new DispositionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     * @return a {@link EventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The feedback property
     * @return a {@link FeedbackRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FeedbackRequestBuilder feedback() {
        return new FeedbackRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The leads property
     * @return a {@link LeadsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LeadsRequestBuilder leads() {
        return new LeadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The notifications property
     * @return a {@link NotificationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotificationsRequestBuilder notifications() {
        return new NotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The outbound property
     * @return a {@link OutboundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutboundRequestBuilder outbound() {
        return new OutboundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The paymentMethods property
     * @return a {@link PaymentMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentMethodsRequestBuilder paymentMethods() {
        return new PaymentMethodsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The phoneNumbers property
     * @return a {@link PhoneNumbersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhoneNumbersRequestBuilder phoneNumbers() {
        return new PhoneNumbersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reports property
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sms property
     * @return a {@link SmsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SmsRequestBuilder sms() {
        return new SmsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sources property
     * @return a {@link SourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SourcesRequestBuilder sources() {
        return new SourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tags property
     * @return a {@link TagsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transactions property
     * @return a {@link TransactionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransactionsRequestBuilder transactions() {
        return new TransactionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The usage property
     * @return a {@link UsageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsageRequestBuilder usage() {
        return new UsageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The users property
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The wallets property
     * @return a {@link WalletsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WalletsRequestBuilder wallets() {
        return new WalletsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link LeadpingOpenApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LeadpingOpenApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.leadping.ai");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
