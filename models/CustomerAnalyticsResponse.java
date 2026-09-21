package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Aggregates an organization&apos;s lead performance, response speed, communication usage, automation health, and activation insights.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerAnalyticsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Summarizes an organization&apos;s progress and blockers across onboarding, billing, telephony, compliance, and launch readiness.
     */
    private CustomerActivationHealth activationHealth;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Summarizes automation coverage, execution success, failures, and workflows requiring organization attention.
     */
    private CustomerAutomationHealth automationHealth;
    /**
     * Aggregates an organization&apos;s SMS, MMS, and calling activity, delivery outcomes, and billable usage over time.
     */
    private CustomerCommunicationUsage communicationUsage;
    /**
     * Date and time when this Leadping customer analytics was generated.
     */
    private OffsetDateTime generatedAt;
    /**
     * Collection of lead sources included with this Leadping customer analytics.
     */
    private java.util.List<CustomerLeadSourceBreakdown> leadSources;
    /**
     * Measures lead creation, qualification, and conversion activity within one reporting time bucket.
     */
    private CustomerLeadTrend leadTrend;
    /**
     * Date and time when this Leadping customer analytics was needs attention.
     */
    private java.util.List<CustomerNeedsAttentionItem> needsAttention;
    /**
     * Defines the inclusive reporting window and comparison window used to calculate Leadping analytics.
     */
    private AnalyticsDateRange range;
    /**
     * Measures how quickly and consistently an organization responds to leads across supported communication channels.
     */
    private CustomerResponseMetrics responseMetrics;
    /**
     * Summarizes an organization&apos;s primary lead, response, communication, and conversion KPIs for the selected period.
     */
    private CustomerAnalyticsSummary summary;
    /**
     * Instantiates a new {@link CustomerAnalyticsResponse} and sets the default values.
     */
    public CustomerAnalyticsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerAnalyticsResponse}
     */
    @jakarta.annotation.Nonnull
    public static CustomerAnalyticsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerAnalyticsResponse();
    }
    /**
     * Gets the activationHealth property value. Summarizes an organization&apos;s progress and blockers across onboarding, billing, telephony, compliance, and launch readiness.
     * @return a {@link CustomerActivationHealth}
     */
    @jakarta.annotation.Nullable
    public CustomerActivationHealth getActivationHealth() {
        return this.activationHealth;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the automationHealth property value. Summarizes automation coverage, execution success, failures, and workflows requiring organization attention.
     * @return a {@link CustomerAutomationHealth}
     */
    @jakarta.annotation.Nullable
    public CustomerAutomationHealth getAutomationHealth() {
        return this.automationHealth;
    }
    /**
     * Gets the communicationUsage property value. Aggregates an organization&apos;s SMS, MMS, and calling activity, delivery outcomes, and billable usage over time.
     * @return a {@link CustomerCommunicationUsage}
     */
    @jakarta.annotation.Nullable
    public CustomerCommunicationUsage getCommunicationUsage() {
        return this.communicationUsage;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("activationHealth", (n) -> { this.setActivationHealth(n.getObjectValue(CustomerActivationHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("automationHealth", (n) -> { this.setAutomationHealth(n.getObjectValue(CustomerAutomationHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("communicationUsage", (n) -> { this.setCommunicationUsage(n.getObjectValue(CustomerCommunicationUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("generatedAt", (n) -> { this.setGeneratedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("leadSources", (n) -> { this.setLeadSources(n.getCollectionOfObjectValues(CustomerLeadSourceBreakdown::createFromDiscriminatorValue)); });
        deserializerMap.put("leadTrend", (n) -> { this.setLeadTrend(n.getObjectValue(CustomerLeadTrend::createFromDiscriminatorValue)); });
        deserializerMap.put("needsAttention", (n) -> { this.setNeedsAttention(n.getCollectionOfObjectValues(CustomerNeedsAttentionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("range", (n) -> { this.setRange(n.getObjectValue(AnalyticsDateRange::createFromDiscriminatorValue)); });
        deserializerMap.put("responseMetrics", (n) -> { this.setResponseMetrics(n.getObjectValue(CustomerResponseMetrics::createFromDiscriminatorValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getObjectValue(CustomerAnalyticsSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the generatedAt property value. Date and time when this Leadping customer analytics was generated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGeneratedAt() {
        return this.generatedAt;
    }
    /**
     * Gets the leadSources property value. Collection of lead sources included with this Leadping customer analytics.
     * @return a {@link java.util.List<CustomerLeadSourceBreakdown>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerLeadSourceBreakdown> getLeadSources() {
        return this.leadSources;
    }
    /**
     * Gets the leadTrend property value. Measures lead creation, qualification, and conversion activity within one reporting time bucket.
     * @return a {@link CustomerLeadTrend}
     */
    @jakarta.annotation.Nullable
    public CustomerLeadTrend getLeadTrend() {
        return this.leadTrend;
    }
    /**
     * Gets the needsAttention property value. Date and time when this Leadping customer analytics was needs attention.
     * @return a {@link java.util.List<CustomerNeedsAttentionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerNeedsAttentionItem> getNeedsAttention() {
        return this.needsAttention;
    }
    /**
     * Gets the range property value. Defines the inclusive reporting window and comparison window used to calculate Leadping analytics.
     * @return a {@link AnalyticsDateRange}
     */
    @jakarta.annotation.Nullable
    public AnalyticsDateRange getRange() {
        return this.range;
    }
    /**
     * Gets the responseMetrics property value. Measures how quickly and consistently an organization responds to leads across supported communication channels.
     * @return a {@link CustomerResponseMetrics}
     */
    @jakarta.annotation.Nullable
    public CustomerResponseMetrics getResponseMetrics() {
        return this.responseMetrics;
    }
    /**
     * Gets the summary property value. Summarizes an organization&apos;s primary lead, response, communication, and conversion KPIs for the selected period.
     * @return a {@link CustomerAnalyticsSummary}
     */
    @jakarta.annotation.Nullable
    public CustomerAnalyticsSummary getSummary() {
        return this.summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("activationHealth", this.getActivationHealth());
        writer.writeObjectValue("automationHealth", this.getAutomationHealth());
        writer.writeObjectValue("communicationUsage", this.getCommunicationUsage());
        writer.writeOffsetDateTimeValue("generatedAt", this.getGeneratedAt());
        writer.writeCollectionOfObjectValues("leadSources", this.getLeadSources());
        writer.writeObjectValue("leadTrend", this.getLeadTrend());
        writer.writeCollectionOfObjectValues("needsAttention", this.getNeedsAttention());
        writer.writeObjectValue("range", this.getRange());
        writer.writeObjectValue("responseMetrics", this.getResponseMetrics());
        writer.writeObjectValue("summary", this.getSummary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activationHealth property value. Summarizes an organization&apos;s progress and blockers across onboarding, billing, telephony, compliance, and launch readiness.
     * @param value Value to set for the activationHealth property.
     */
    public void setActivationHealth(@jakarta.annotation.Nullable final CustomerActivationHealth value) {
        this.activationHealth = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the automationHealth property value. Summarizes automation coverage, execution success, failures, and workflows requiring organization attention.
     * @param value Value to set for the automationHealth property.
     */
    public void setAutomationHealth(@jakarta.annotation.Nullable final CustomerAutomationHealth value) {
        this.automationHealth = value;
    }
    /**
     * Sets the communicationUsage property value. Aggregates an organization&apos;s SMS, MMS, and calling activity, delivery outcomes, and billable usage over time.
     * @param value Value to set for the communicationUsage property.
     */
    public void setCommunicationUsage(@jakarta.annotation.Nullable final CustomerCommunicationUsage value) {
        this.communicationUsage = value;
    }
    /**
     * Sets the generatedAt property value. Date and time when this Leadping customer analytics was generated.
     * @param value Value to set for the generatedAt property.
     */
    public void setGeneratedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.generatedAt = value;
    }
    /**
     * Sets the leadSources property value. Collection of lead sources included with this Leadping customer analytics.
     * @param value Value to set for the leadSources property.
     */
    public void setLeadSources(@jakarta.annotation.Nullable final java.util.List<CustomerLeadSourceBreakdown> value) {
        this.leadSources = value;
    }
    /**
     * Sets the leadTrend property value. Measures lead creation, qualification, and conversion activity within one reporting time bucket.
     * @param value Value to set for the leadTrend property.
     */
    public void setLeadTrend(@jakarta.annotation.Nullable final CustomerLeadTrend value) {
        this.leadTrend = value;
    }
    /**
     * Sets the needsAttention property value. Date and time when this Leadping customer analytics was needs attention.
     * @param value Value to set for the needsAttention property.
     */
    public void setNeedsAttention(@jakarta.annotation.Nullable final java.util.List<CustomerNeedsAttentionItem> value) {
        this.needsAttention = value;
    }
    /**
     * Sets the range property value. Defines the inclusive reporting window and comparison window used to calculate Leadping analytics.
     * @param value Value to set for the range property.
     */
    public void setRange(@jakarta.annotation.Nullable final AnalyticsDateRange value) {
        this.range = value;
    }
    /**
     * Sets the responseMetrics property value. Measures how quickly and consistently an organization responds to leads across supported communication channels.
     * @param value Value to set for the responseMetrics property.
     */
    public void setResponseMetrics(@jakarta.annotation.Nullable final CustomerResponseMetrics value) {
        this.responseMetrics = value;
    }
    /**
     * Sets the summary property value. Summarizes an organization&apos;s primary lead, response, communication, and conversion KPIs for the selected period.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final CustomerAnalyticsSummary value) {
        this.summary = value;
    }
}
