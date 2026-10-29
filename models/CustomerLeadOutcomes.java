package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Current outcomes for non-deleted, non-demo leads created in the selected period.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerLeadOutcomes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Distinct leads with a prospect reply or answered call since creation, through generation time.
     */
    private Integer contactedLeads;
    /**
     * Leads whose current status category is Converted.
     */
    private Integer convertedLeads;
    /**
     * Median time to the first manual SMS send attempt or placed outbound call, among attempted leads only.
     */
    private Double medianFirstAttemptMinutes;
    /**
     * Enabled, unarchived open or qualified leads with an overdue incomplete follow-up, or neither a manual attempt nor contact.
     */
    private Integer needsFollowUpLeads;
    /**
     * Number of non-deleted, non-demo leads created in the selected period.
     */
    private Integer totalLeads;
    /**
     * Instantiates a new {@link CustomerLeadOutcomes} and sets the default values.
     */
    public CustomerLeadOutcomes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerLeadOutcomes}
     */
    @jakarta.annotation.Nonnull
    public static CustomerLeadOutcomes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerLeadOutcomes();
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
     * Gets the contactedLeads property value. Distinct leads with a prospect reply or answered call since creation, through generation time.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getContactedLeads() {
        return this.contactedLeads;
    }
    /**
     * Gets the convertedLeads property value. Leads whose current status category is Converted.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConvertedLeads() {
        return this.convertedLeads;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contactedLeads", (n) -> { this.setContactedLeads(n.getIntegerValue()); });
        deserializerMap.put("convertedLeads", (n) -> { this.setConvertedLeads(n.getIntegerValue()); });
        deserializerMap.put("medianFirstAttemptMinutes", (n) -> { this.setMedianFirstAttemptMinutes(n.getDoubleValue()); });
        deserializerMap.put("needsFollowUpLeads", (n) -> { this.setNeedsFollowUpLeads(n.getIntegerValue()); });
        deserializerMap.put("totalLeads", (n) -> { this.setTotalLeads(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the medianFirstAttemptMinutes property value. Median time to the first manual SMS send attempt or placed outbound call, among attempted leads only.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMedianFirstAttemptMinutes() {
        return this.medianFirstAttemptMinutes;
    }
    /**
     * Gets the needsFollowUpLeads property value. Enabled, unarchived open or qualified leads with an overdue incomplete follow-up, or neither a manual attempt nor contact.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNeedsFollowUpLeads() {
        return this.needsFollowUpLeads;
    }
    /**
     * Gets the totalLeads property value. Number of non-deleted, non-demo leads created in the selected period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLeads() {
        return this.totalLeads;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("contactedLeads", this.getContactedLeads());
        writer.writeIntegerValue("convertedLeads", this.getConvertedLeads());
        writer.writeDoubleValue("medianFirstAttemptMinutes", this.getMedianFirstAttemptMinutes());
        writer.writeIntegerValue("needsFollowUpLeads", this.getNeedsFollowUpLeads());
        writer.writeIntegerValue("totalLeads", this.getTotalLeads());
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
     * Sets the contactedLeads property value. Distinct leads with a prospect reply or answered call since creation, through generation time.
     * @param value Value to set for the contactedLeads property.
     */
    public void setContactedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.contactedLeads = value;
    }
    /**
     * Sets the convertedLeads property value. Leads whose current status category is Converted.
     * @param value Value to set for the convertedLeads property.
     */
    public void setConvertedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.convertedLeads = value;
    }
    /**
     * Sets the medianFirstAttemptMinutes property value. Median time to the first manual SMS send attempt or placed outbound call, among attempted leads only.
     * @param value Value to set for the medianFirstAttemptMinutes property.
     */
    public void setMedianFirstAttemptMinutes(@jakarta.annotation.Nullable final Double value) {
        this.medianFirstAttemptMinutes = value;
    }
    /**
     * Sets the needsFollowUpLeads property value. Enabled, unarchived open or qualified leads with an overdue incomplete follow-up, or neither a manual attempt nor contact.
     * @param value Value to set for the needsFollowUpLeads property.
     */
    public void setNeedsFollowUpLeads(@jakarta.annotation.Nullable final Integer value) {
        this.needsFollowUpLeads = value;
    }
    /**
     * Sets the totalLeads property value. Number of non-deleted, non-demo leads created in the selected period.
     * @param value Value to set for the totalLeads property.
     */
    public void setTotalLeads(@jakarta.annotation.Nullable final Integer value) {
        this.totalLeads = value;
    }
}
