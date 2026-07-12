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
 * Captured subscription cancellation feedback for retention and churn analysis.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessSubscriptionCancellationInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether the cancellation was scheduled for period end.
     */
    private Boolean cancelAtPeriodEnd;
    /**
     * The competitor named by the user, when applicable.
     */
    private String competitor;
    /**
     * The missing feature named by the user, when applicable.
     */
    private String missingFeature;
    /**
     * Additional cancellation notes supplied by the user.
     */
    private String notes;
    /**
     * The human-readable cancellation reason selected by the user.
     */
    private String reason;
    /**
     * The normalized cancellation reason code selected by the user.
     */
    private String reasonCode;
    /**
     * The date and time when cancellation was requested.
     */
    private OffsetDateTime requestedAt;
    /**
     * The user who requested cancellation.
     */
    private String requestedByUserId;
    /**
     * The technical issue details supplied by the user, when applicable.
     */
    private String technicalIssues;
    /**
     * Instantiates a new {@link BusinessSubscriptionCancellationInfo} and sets the default values.
     */
    public BusinessSubscriptionCancellationInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessSubscriptionCancellationInfo}
     */
    @jakarta.annotation.Nonnull
    public static BusinessSubscriptionCancellationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessSubscriptionCancellationInfo();
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
     * Gets the cancelAtPeriodEnd property value. Whether the cancellation was scheduled for period end.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCancelAtPeriodEnd() {
        return this.cancelAtPeriodEnd;
    }
    /**
     * Gets the competitor property value. The competitor named by the user, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompetitor() {
        return this.competitor;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("cancelAtPeriodEnd", (n) -> { this.setCancelAtPeriodEnd(n.getBooleanValue()); });
        deserializerMap.put("competitor", (n) -> { this.setCompetitor(n.getStringValue()); });
        deserializerMap.put("missingFeature", (n) -> { this.setMissingFeature(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("reasonCode", (n) -> { this.setReasonCode(n.getStringValue()); });
        deserializerMap.put("requestedAt", (n) -> { this.setRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestedByUserId", (n) -> { this.setRequestedByUserId(n.getStringValue()); });
        deserializerMap.put("technicalIssues", (n) -> { this.setTechnicalIssues(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the missingFeature property value. The missing feature named by the user, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMissingFeature() {
        return this.missingFeature;
    }
    /**
     * Gets the notes property value. Additional cancellation notes supplied by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the reason property value. The human-readable cancellation reason selected by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the reasonCode property value. The normalized cancellation reason code selected by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonCode() {
        return this.reasonCode;
    }
    /**
     * Gets the requestedAt property value. The date and time when cancellation was requested.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedAt() {
        return this.requestedAt;
    }
    /**
     * Gets the requestedByUserId property value. The user who requested cancellation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestedByUserId() {
        return this.requestedByUserId;
    }
    /**
     * Gets the technicalIssues property value. The technical issue details supplied by the user, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTechnicalIssues() {
        return this.technicalIssues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cancelAtPeriodEnd", this.getCancelAtPeriodEnd());
        writer.writeStringValue("competitor", this.getCompetitor());
        writer.writeStringValue("missingFeature", this.getMissingFeature());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("reasonCode", this.getReasonCode());
        writer.writeOffsetDateTimeValue("requestedAt", this.getRequestedAt());
        writer.writeStringValue("requestedByUserId", this.getRequestedByUserId());
        writer.writeStringValue("technicalIssues", this.getTechnicalIssues());
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
     * Sets the cancelAtPeriodEnd property value. Whether the cancellation was scheduled for period end.
     * @param value Value to set for the cancelAtPeriodEnd property.
     */
    public void setCancelAtPeriodEnd(@jakarta.annotation.Nullable final Boolean value) {
        this.cancelAtPeriodEnd = value;
    }
    /**
     * Sets the competitor property value. The competitor named by the user, when applicable.
     * @param value Value to set for the competitor property.
     */
    public void setCompetitor(@jakarta.annotation.Nullable final String value) {
        this.competitor = value;
    }
    /**
     * Sets the missingFeature property value. The missing feature named by the user, when applicable.
     * @param value Value to set for the missingFeature property.
     */
    public void setMissingFeature(@jakarta.annotation.Nullable final String value) {
        this.missingFeature = value;
    }
    /**
     * Sets the notes property value. Additional cancellation notes supplied by the user.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the reason property value. The human-readable cancellation reason selected by the user.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the reasonCode property value. The normalized cancellation reason code selected by the user.
     * @param value Value to set for the reasonCode property.
     */
    public void setReasonCode(@jakarta.annotation.Nullable final String value) {
        this.reasonCode = value;
    }
    /**
     * Sets the requestedAt property value. The date and time when cancellation was requested.
     * @param value Value to set for the requestedAt property.
     */
    public void setRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.requestedAt = value;
    }
    /**
     * Sets the requestedByUserId property value. The user who requested cancellation.
     * @param value Value to set for the requestedByUserId property.
     */
    public void setRequestedByUserId(@jakarta.annotation.Nullable final String value) {
        this.requestedByUserId = value;
    }
    /**
     * Sets the technicalIssues property value. The technical issue details supplied by the user, when applicable.
     * @param value Value to set for the technicalIssues property.
     */
    public void setTechnicalIssues(@jakarta.annotation.Nullable final String value) {
        this.technicalIssues = value;
    }
}
