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
 * Dunning state recorded after a failed recurring payment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserDunningInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The finalCancellationAt property
     */
    private OffsetDateTime finalCancellationAt;
    /**
     * The gracePeriodEndsAt property
     */
    private OffsetDateTime gracePeriodEndsAt;
    /**
     * The lastFailedInvoiceId property
     */
    private String lastFailedInvoiceId;
    /**
     * The lastFailedInvoiceStatus property
     */
    private String lastFailedInvoiceStatus;
    /**
     * The lastUpdatedAt property
     */
    private OffsetDateTime lastUpdatedAt;
    /**
     * The nextRetryAt property
     */
    private OffsetDateTime nextRetryAt;
    /**
     * The outboundRestrictedAt property
     */
    private OffsetDateTime outboundRestrictedAt;
    /**
     * The outboundSuspendedAt property
     */
    private OffsetDateTime outboundSuspendedAt;
    /**
     * The paymentFailedAt property
     */
    private OffsetDateTime paymentFailedAt;
    /**
     * The retryAttemptCount property
     */
    private Integer retryAttemptCount;
    /**
     * The stage property
     */
    private String stage;
    /**
     * Instantiates a new {@link UserDunningInfo} and sets the default values.
     */
    public UserDunningInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserDunningInfo}
     */
    @jakarta.annotation.Nonnull
    public static UserDunningInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserDunningInfo();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("finalCancellationAt", (n) -> { this.setFinalCancellationAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("gracePeriodEndsAt", (n) -> { this.setGracePeriodEndsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastFailedInvoiceId", (n) -> { this.setLastFailedInvoiceId(n.getStringValue()); });
        deserializerMap.put("lastFailedInvoiceStatus", (n) -> { this.setLastFailedInvoiceStatus(n.getStringValue()); });
        deserializerMap.put("lastUpdatedAt", (n) -> { this.setLastUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextRetryAt", (n) -> { this.setNextRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("outboundRestrictedAt", (n) -> { this.setOutboundRestrictedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("outboundSuspendedAt", (n) -> { this.setOutboundSuspendedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("paymentFailedAt", (n) -> { this.setPaymentFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("retryAttemptCount", (n) -> { this.setRetryAttemptCount(n.getIntegerValue()); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the finalCancellationAt property value. The finalCancellationAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFinalCancellationAt() {
        return this.finalCancellationAt;
    }
    /**
     * Gets the gracePeriodEndsAt property value. The gracePeriodEndsAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGracePeriodEndsAt() {
        return this.gracePeriodEndsAt;
    }
    /**
     * Gets the lastFailedInvoiceId property value. The lastFailedInvoiceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastFailedInvoiceId() {
        return this.lastFailedInvoiceId;
    }
    /**
     * Gets the lastFailedInvoiceStatus property value. The lastFailedInvoiceStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastFailedInvoiceStatus() {
        return this.lastFailedInvoiceStatus;
    }
    /**
     * Gets the lastUpdatedAt property value. The lastUpdatedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * Gets the nextRetryAt property value. The nextRetryAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRetryAt() {
        return this.nextRetryAt;
    }
    /**
     * Gets the outboundRestrictedAt property value. The outboundRestrictedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOutboundRestrictedAt() {
        return this.outboundRestrictedAt;
    }
    /**
     * Gets the outboundSuspendedAt property value. The outboundSuspendedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOutboundSuspendedAt() {
        return this.outboundSuspendedAt;
    }
    /**
     * Gets the paymentFailedAt property value. The paymentFailedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPaymentFailedAt() {
        return this.paymentFailedAt;
    }
    /**
     * Gets the retryAttemptCount property value. The retryAttemptCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRetryAttemptCount() {
        return this.retryAttemptCount;
    }
    /**
     * Gets the stage property value. The stage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStage() {
        return this.stage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("finalCancellationAt", this.getFinalCancellationAt());
        writer.writeOffsetDateTimeValue("gracePeriodEndsAt", this.getGracePeriodEndsAt());
        writer.writeStringValue("lastFailedInvoiceId", this.getLastFailedInvoiceId());
        writer.writeStringValue("lastFailedInvoiceStatus", this.getLastFailedInvoiceStatus());
        writer.writeOffsetDateTimeValue("lastUpdatedAt", this.getLastUpdatedAt());
        writer.writeOffsetDateTimeValue("nextRetryAt", this.getNextRetryAt());
        writer.writeOffsetDateTimeValue("outboundRestrictedAt", this.getOutboundRestrictedAt());
        writer.writeOffsetDateTimeValue("outboundSuspendedAt", this.getOutboundSuspendedAt());
        writer.writeOffsetDateTimeValue("paymentFailedAt", this.getPaymentFailedAt());
        writer.writeIntegerValue("retryAttemptCount", this.getRetryAttemptCount());
        writer.writeStringValue("stage", this.getStage());
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
     * Sets the finalCancellationAt property value. The finalCancellationAt property
     * @param value Value to set for the finalCancellationAt property.
     */
    public void setFinalCancellationAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.finalCancellationAt = value;
    }
    /**
     * Sets the gracePeriodEndsAt property value. The gracePeriodEndsAt property
     * @param value Value to set for the gracePeriodEndsAt property.
     */
    public void setGracePeriodEndsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.gracePeriodEndsAt = value;
    }
    /**
     * Sets the lastFailedInvoiceId property value. The lastFailedInvoiceId property
     * @param value Value to set for the lastFailedInvoiceId property.
     */
    public void setLastFailedInvoiceId(@jakarta.annotation.Nullable final String value) {
        this.lastFailedInvoiceId = value;
    }
    /**
     * Sets the lastFailedInvoiceStatus property value. The lastFailedInvoiceStatus property
     * @param value Value to set for the lastFailedInvoiceStatus property.
     */
    public void setLastFailedInvoiceStatus(@jakarta.annotation.Nullable final String value) {
        this.lastFailedInvoiceStatus = value;
    }
    /**
     * Sets the lastUpdatedAt property value. The lastUpdatedAt property
     * @param value Value to set for the lastUpdatedAt property.
     */
    public void setLastUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedAt = value;
    }
    /**
     * Sets the nextRetryAt property value. The nextRetryAt property
     * @param value Value to set for the nextRetryAt property.
     */
    public void setNextRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRetryAt = value;
    }
    /**
     * Sets the outboundRestrictedAt property value. The outboundRestrictedAt property
     * @param value Value to set for the outboundRestrictedAt property.
     */
    public void setOutboundRestrictedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.outboundRestrictedAt = value;
    }
    /**
     * Sets the outboundSuspendedAt property value. The outboundSuspendedAt property
     * @param value Value to set for the outboundSuspendedAt property.
     */
    public void setOutboundSuspendedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.outboundSuspendedAt = value;
    }
    /**
     * Sets the paymentFailedAt property value. The paymentFailedAt property
     * @param value Value to set for the paymentFailedAt property.
     */
    public void setPaymentFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.paymentFailedAt = value;
    }
    /**
     * Sets the retryAttemptCount property value. The retryAttemptCount property
     * @param value Value to set for the retryAttemptCount property.
     */
    public void setRetryAttemptCount(@jakarta.annotation.Nullable final Integer value) {
        this.retryAttemptCount = value;
    }
    /**
     * Sets the stage property value. The stage property
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final String value) {
        this.stage = value;
    }
}
