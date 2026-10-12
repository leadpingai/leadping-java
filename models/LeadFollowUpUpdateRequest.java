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
 * Completes or reschedules exactly the follow-up version the operator viewed.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadFollowUpUpdateRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The new time, or null to complete the follow-up.
     */
    private OffsetDateTime dueAt;
    /**
     * The expectedRevision property
     */
    private Long expectedRevision;
    /**
     * The expectedStatusId property
     */
    private String expectedStatusId;
    /**
     * Instantiates a new {@link LeadFollowUpUpdateRequest} and sets the default values.
     */
    public LeadFollowUpUpdateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadFollowUpUpdateRequest}
     */
    @jakarta.annotation.Nonnull
    public static LeadFollowUpUpdateRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadFollowUpUpdateRequest();
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
     * Gets the dueAt property value. The new time, or null to complete the follow-up.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueAt() {
        return this.dueAt;
    }
    /**
     * Gets the expectedRevision property value. The expectedRevision property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }
    /**
     * Gets the expectedStatusId property value. The expectedStatusId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpectedStatusId() {
        return this.expectedStatusId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dueAt", (n) -> { this.setDueAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expectedRevision", (n) -> { this.setExpectedRevision(n.getLongValue()); });
        deserializerMap.put("expectedStatusId", (n) -> { this.setExpectedStatusId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("dueAt", this.getDueAt());
        writer.writeLongValue("expectedRevision", this.getExpectedRevision());
        writer.writeStringValue("expectedStatusId", this.getExpectedStatusId());
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
     * Sets the dueAt property value. The new time, or null to complete the follow-up.
     * @param value Value to set for the dueAt property.
     */
    public void setDueAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dueAt = value;
    }
    /**
     * Sets the expectedRevision property value. The expectedRevision property
     * @param value Value to set for the expectedRevision property.
     */
    public void setExpectedRevision(@jakarta.annotation.Nullable final Long value) {
        this.expectedRevision = value;
    }
    /**
     * Sets the expectedStatusId property value. The expectedStatusId property
     * @param value Value to set for the expectedStatusId property.
     */
    public void setExpectedStatusId(@jakarta.annotation.Nullable final String value) {
        this.expectedStatusId = value;
    }
}
