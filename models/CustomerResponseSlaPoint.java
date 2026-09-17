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
 * Five-minute human-response SLA for a lead creation cohort.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerResponseSlaPoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Timely leads divided by all eligible leads.
     */
    private Double coveragePercent;
    /**
     * Mature leads in this bucket.
     */
    private Integer eligibleLeads;
    /**
     * End of cohort bucket.
     */
    private OffsetDateTime endAt;
    /**
     * Bucket label.
     */
    private String label;
    /**
     * Leads still within their first five minutes.
     */
    private Integer pendingLeads;
    /**
     * Inclusive cohort bucket start.
     */
    private OffsetDateTime startAt;
    /**
     * Eligible leads answered in five minutes.
     */
    private Integer timelyLeads;
    /**
     * Eligible leads unanswered by observation cutoff.
     */
    private Integer unrespondedLeads;
    /**
     * Instantiates a new {@link CustomerResponseSlaPoint} and sets the default values.
     */
    public CustomerResponseSlaPoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerResponseSlaPoint}
     */
    @jakarta.annotation.Nonnull
    public static CustomerResponseSlaPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerResponseSlaPoint();
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
     * Gets the coveragePercent property value. Timely leads divided by all eligible leads.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCoveragePercent() {
        return this.coveragePercent;
    }
    /**
     * Gets the eligibleLeads property value. Mature leads in this bucket.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEligibleLeads() {
        return this.eligibleLeads;
    }
    /**
     * Gets the endAt property value. End of cohort bucket.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndAt() {
        return this.endAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("coveragePercent", (n) -> { this.setCoveragePercent(n.getDoubleValue()); });
        deserializerMap.put("eligibleLeads", (n) -> { this.setEligibleLeads(n.getIntegerValue()); });
        deserializerMap.put("endAt", (n) -> { this.setEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("pendingLeads", (n) -> { this.setPendingLeads(n.getIntegerValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timelyLeads", (n) -> { this.setTimelyLeads(n.getIntegerValue()); });
        deserializerMap.put("unrespondedLeads", (n) -> { this.setUnrespondedLeads(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Bucket label.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the pendingLeads property value. Leads still within their first five minutes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingLeads() {
        return this.pendingLeads;
    }
    /**
     * Gets the startAt property value. Inclusive cohort bucket start.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Gets the timelyLeads property value. Eligible leads answered in five minutes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimelyLeads() {
        return this.timelyLeads;
    }
    /**
     * Gets the unrespondedLeads property value. Eligible leads unanswered by observation cutoff.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnrespondedLeads() {
        return this.unrespondedLeads;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("coveragePercent", this.getCoveragePercent());
        writer.writeIntegerValue("eligibleLeads", this.getEligibleLeads());
        writer.writeOffsetDateTimeValue("endAt", this.getEndAt());
        writer.writeStringValue("label", this.getLabel());
        writer.writeIntegerValue("pendingLeads", this.getPendingLeads());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
        writer.writeIntegerValue("timelyLeads", this.getTimelyLeads());
        writer.writeIntegerValue("unrespondedLeads", this.getUnrespondedLeads());
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
     * Sets the coveragePercent property value. Timely leads divided by all eligible leads.
     * @param value Value to set for the coveragePercent property.
     */
    public void setCoveragePercent(@jakarta.annotation.Nullable final Double value) {
        this.coveragePercent = value;
    }
    /**
     * Sets the eligibleLeads property value. Mature leads in this bucket.
     * @param value Value to set for the eligibleLeads property.
     */
    public void setEligibleLeads(@jakarta.annotation.Nullable final Integer value) {
        this.eligibleLeads = value;
    }
    /**
     * Sets the endAt property value. End of cohort bucket.
     * @param value Value to set for the endAt property.
     */
    public void setEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endAt = value;
    }
    /**
     * Sets the label property value. Bucket label.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the pendingLeads property value. Leads still within their first five minutes.
     * @param value Value to set for the pendingLeads property.
     */
    public void setPendingLeads(@jakarta.annotation.Nullable final Integer value) {
        this.pendingLeads = value;
    }
    /**
     * Sets the startAt property value. Inclusive cohort bucket start.
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
    /**
     * Sets the timelyLeads property value. Eligible leads answered in five minutes.
     * @param value Value to set for the timelyLeads property.
     */
    public void setTimelyLeads(@jakarta.annotation.Nullable final Integer value) {
        this.timelyLeads = value;
    }
    /**
     * Sets the unrespondedLeads property value. Eligible leads unanswered by observation cutoff.
     * @param value Value to set for the unrespondedLeads property.
     */
    public void setUnrespondedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.unrespondedLeads = value;
    }
}
