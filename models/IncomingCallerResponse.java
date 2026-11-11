package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Lead identity matched to an incoming caller within the current organization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IncomingCallerResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The lead associated with the caller in the current organization.
     */
    private String leadId;
    /**
     * The associated lead&apos;s name, when available.
     */
    private String leadName;
    /**
     * Instantiates a new {@link IncomingCallerResponse} and sets the default values.
     */
    public IncomingCallerResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IncomingCallerResponse}
     */
    @jakarta.annotation.Nonnull
    public static IncomingCallerResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncomingCallerResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leadId property value. The lead associated with the caller in the current organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadName property value. The associated lead&apos;s name, when available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadName", this.getLeadName());
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
     * Sets the leadId property value. The lead associated with the caller in the current organization.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadName property value. The associated lead&apos;s name, when available.
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
}
