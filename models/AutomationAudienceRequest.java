package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Runs an automation for a server-resolved audience, omitting leads the user unchecked.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationAudienceRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Active leads in the current organization, optionally limited to one assignee, as of the selection time.
     */
    private AutomationLeadAudience audience;
    /**
     * The excludedLeadIds property
     */
    private java.util.List<String> excludedLeadIds;
    /**
     * The requestId property
     */
    private UUID requestId;
    /**
     * Instantiates a new {@link AutomationAudienceRequest} and sets the default values.
     */
    public AutomationAudienceRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationAudienceRequest}
     */
    @jakarta.annotation.Nonnull
    public static AutomationAudienceRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationAudienceRequest();
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
     * Gets the audience property value. Active leads in the current organization, optionally limited to one assignee, as of the selection time.
     * @return a {@link AutomationLeadAudience}
     */
    @jakarta.annotation.Nullable
    public AutomationLeadAudience getAudience() {
        return this.audience;
    }
    /**
     * Gets the excludedLeadIds property value. The excludedLeadIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedLeadIds() {
        return this.excludedLeadIds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getObjectValue(AutomationLeadAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("excludedLeadIds", (n) -> { this.setExcludedLeadIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("requestId", (n) -> { this.setRequestId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the requestId property value. The requestId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getRequestId() {
        return this.requestId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("audience", this.getAudience());
        writer.writeCollectionOfPrimitiveValues("excludedLeadIds", this.getExcludedLeadIds());
        writer.writeUUIDValue("requestId", this.getRequestId());
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
     * Sets the audience property value. Active leads in the current organization, optionally limited to one assignee, as of the selection time.
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final AutomationLeadAudience value) {
        this.audience = value;
    }
    /**
     * Sets the excludedLeadIds property value. The excludedLeadIds property
     * @param value Value to set for the excludedLeadIds property.
     */
    public void setExcludedLeadIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludedLeadIds = value;
    }
    /**
     * Sets the requestId property value. The requestId property
     * @param value Value to set for the requestId property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final UUID value) {
        this.requestId = value;
    }
}
