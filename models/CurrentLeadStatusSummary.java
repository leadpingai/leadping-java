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
 * Summary schema for Leadping API current lead status change summary data used in dashboards and reports.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CurrentLeadStatusSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Controlled lead status change categories used for reporting, automation, and analytics.
     */
    private CurrentLeadStatusSummaryCategory category;
    /**
     * UTC timestamp when the lead status change last changed.
     */
    private OffsetDateTime changedAt;
    /**
     * Automation ID that last changed the lead status change.
     */
    private String changedByAutomationId;
    /**
     * User ID of the person who last changed the lead status change.
     */
    private String changedByUserId;
    /**
     * Human-readable display name shown for this current lead status change summary.
     */
    private String displayName;
    /**
     * Unique Leadping identifier for this current lead status change summary.
     */
    private String id;
    /**
     * Current lead status change outcome assigned to the lead.
     */
    private String outcome;
    /**
     * Known sources that can change a lead&apos;s current lead status change.
     */
    private CurrentLeadStatusSummarySource source;
    /**
     * Instantiates a new {@link CurrentLeadStatusSummary} and sets the default values.
     */
    public CurrentLeadStatusSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CurrentLeadStatusSummary}
     */
    @jakarta.annotation.Nonnull
    public static CurrentLeadStatusSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CurrentLeadStatusSummary();
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
     * Gets the category property value. Controlled lead status change categories used for reporting, automation, and analytics.
     * @return a {@link CurrentLeadStatusSummaryCategory}
     */
    @jakarta.annotation.Nullable
    public CurrentLeadStatusSummaryCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the changedAt property value. UTC timestamp when the lead status change last changed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getChangedAt() {
        return this.changedAt;
    }
    /**
     * Gets the changedByAutomationId property value. Automation ID that last changed the lead status change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByAutomationId() {
        return this.changedByAutomationId;
    }
    /**
     * Gets the changedByUserId property value. User ID of the person who last changed the lead status change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByUserId() {
        return this.changedByUserId;
    }
    /**
     * Gets the displayName property value. Human-readable display name shown for this current lead status change summary.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(CurrentLeadStatusSummaryCategory::forValue)); });
        deserializerMap.put("changedAt", (n) -> { this.setChangedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changedByAutomationId", (n) -> { this.setChangedByAutomationId(n.getStringValue()); });
        deserializerMap.put("changedByUserId", (n) -> { this.setChangedByUserId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("outcome", (n) -> { this.setOutcome(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(CurrentLeadStatusSummarySource::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this current lead status change summary.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the outcome property value. Current lead status change outcome assigned to the lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutcome() {
        return this.outcome;
    }
    /**
     * Gets the source property value. Known sources that can change a lead&apos;s current lead status change.
     * @return a {@link CurrentLeadStatusSummarySource}
     */
    @jakarta.annotation.Nullable
    public CurrentLeadStatusSummarySource getSource() {
        return this.source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("changedAt", this.getChangedAt());
        writer.writeStringValue("changedByAutomationId", this.getChangedByAutomationId());
        writer.writeStringValue("changedByUserId", this.getChangedByUserId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("outcome", this.getOutcome());
        writer.writeEnumValue("source", this.getSource());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the category property value. Controlled lead status change categories used for reporting, automation, and analytics.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final CurrentLeadStatusSummaryCategory value) {
        this.category = value;
    }
    /**
     * Sets the changedAt property value. UTC timestamp when the lead status change last changed.
     * @param value Value to set for the changedAt property.
     */
    public void setChangedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.changedAt = value;
    }
    /**
     * Sets the changedByAutomationId property value. Automation ID that last changed the lead status change.
     * @param value Value to set for the changedByAutomationId property.
     */
    public void setChangedByAutomationId(@jakarta.annotation.Nullable final String value) {
        this.changedByAutomationId = value;
    }
    /**
     * Sets the changedByUserId property value. User ID of the person who last changed the lead status change.
     * @param value Value to set for the changedByUserId property.
     */
    public void setChangedByUserId(@jakarta.annotation.Nullable final String value) {
        this.changedByUserId = value;
    }
    /**
     * Sets the displayName property value. Human-readable display name shown for this current lead status change summary.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this current lead status change summary.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the outcome property value. Current lead status change outcome assigned to the lead.
     * @param value Value to set for the outcome property.
     */
    public void setOutcome(@jakarta.annotation.Nullable final String value) {
        this.outcome = value;
    }
    /**
     * Sets the source property value. Known sources that can change a lead&apos;s current lead status change.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final CurrentLeadStatusSummarySource value) {
        this.source = value;
    }
}
