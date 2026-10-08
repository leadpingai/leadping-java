package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the states an organization member can work; this is not verification of professional licensing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationMemberStateEligibility implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Allowed state abbreviations when all states is false. An empty list permits no states.
     */
    private java.util.List<String> allowedStates;
    /**
     * Whether all states are eligible, subject to organization and source restrictions.
     */
    private Boolean allStates;
    /**
     * Instantiates a new {@link OrganizationMemberStateEligibility} and sets the default values.
     */
    public OrganizationMemberStateEligibility() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationMemberStateEligibility}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationMemberStateEligibility createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationMemberStateEligibility();
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
     * Gets the allowedStates property value. Allowed state abbreviations when all states is false. An empty list permits no states.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedStates() {
        return this.allowedStates;
    }
    /**
     * Gets the allStates property value. Whether all states are eligible, subject to organization and source restrictions.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllStates() {
        return this.allStates;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("allowedStates", (n) -> { this.setAllowedStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allStates", (n) -> { this.setAllStates(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedStates", this.getAllowedStates());
        writer.writeBooleanValue("allStates", this.getAllStates());
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
     * Sets the allowedStates property value. Allowed state abbreviations when all states is false. An empty list permits no states.
     * @param value Value to set for the allowedStates property.
     */
    public void setAllowedStates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedStates = value;
    }
    /**
     * Sets the allStates property value. Whether all states are eligible, subject to organization and source restrictions.
     * @param value Value to set for the allStates property.
     */
    public void setAllStates(@jakarta.annotation.Nullable final Boolean value) {
        this.allStates = value;
    }
}
