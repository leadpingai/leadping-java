package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing business compliance policy data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessCompliancePolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allowed products included with this business compliance policy.
     */
    private java.util.List<String> allowedProducts;
    /**
     * The allowed states included with this business compliance policy.
     */
    private java.util.List<String> allowedStates;
    /**
     * Whether this business compliance policy is enabled.
     */
    private Boolean enabled;
    /**
     * Whether this business compliance policy requires agent license state.
     */
    private Boolean requireAgentLicenseState;
    /**
     * Whether this business compliance policy requires lead state.
     */
    private Boolean requireLeadState;
    /**
     * Whether this business compliance policy requires product.
     */
    private Boolean requireProduct;
    /**
     * Whether this business compliance policy requires source compliance approval.
     */
    private Boolean requireSourceComplianceApproval;
    /**
     * Whether this business compliance policy requires TrustedForm for automations.
     */
    private Boolean requireTrustedFormForAutomations;
    /**
     * Instantiates a new {@link BusinessCompliancePolicy} and sets the default values.
     */
    public BusinessCompliancePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessCompliancePolicy}
     */
    @jakarta.annotation.Nonnull
    public static BusinessCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessCompliancePolicy();
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
     * Gets the allowedProducts property value. The allowed products included with this business compliance policy.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedProducts() {
        return this.allowedProducts;
    }
    /**
     * Gets the allowedStates property value. The allowed states included with this business compliance policy.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedStates() {
        return this.allowedStates;
    }
    /**
     * Gets the enabled property value. Whether this business compliance policy is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("allowedProducts", (n) -> { this.setAllowedProducts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedStates", (n) -> { this.setAllowedStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("requireAgentLicenseState", (n) -> { this.setRequireAgentLicenseState(n.getBooleanValue()); });
        deserializerMap.put("requireLeadState", (n) -> { this.setRequireLeadState(n.getBooleanValue()); });
        deserializerMap.put("requireProduct", (n) -> { this.setRequireProduct(n.getBooleanValue()); });
        deserializerMap.put("requireSourceComplianceApproval", (n) -> { this.setRequireSourceComplianceApproval(n.getBooleanValue()); });
        deserializerMap.put("requireTrustedFormForAutomations", (n) -> { this.setRequireTrustedFormForAutomations(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the requireAgentLicenseState property value. Whether this business compliance policy requires agent license state.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireAgentLicenseState() {
        return this.requireAgentLicenseState;
    }
    /**
     * Gets the requireLeadState property value. Whether this business compliance policy requires lead state.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireLeadState() {
        return this.requireLeadState;
    }
    /**
     * Gets the requireProduct property value. Whether this business compliance policy requires product.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireProduct() {
        return this.requireProduct;
    }
    /**
     * Gets the requireSourceComplianceApproval property value. Whether this business compliance policy requires source compliance approval.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSourceComplianceApproval() {
        return this.requireSourceComplianceApproval;
    }
    /**
     * Gets the requireTrustedFormForAutomations property value. Whether this business compliance policy requires TrustedForm for automations.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireTrustedFormForAutomations() {
        return this.requireTrustedFormForAutomations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedProducts", this.getAllowedProducts());
        writer.writeCollectionOfPrimitiveValues("allowedStates", this.getAllowedStates());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeBooleanValue("requireAgentLicenseState", this.getRequireAgentLicenseState());
        writer.writeBooleanValue("requireLeadState", this.getRequireLeadState());
        writer.writeBooleanValue("requireProduct", this.getRequireProduct());
        writer.writeBooleanValue("requireSourceComplianceApproval", this.getRequireSourceComplianceApproval());
        writer.writeBooleanValue("requireTrustedFormForAutomations", this.getRequireTrustedFormForAutomations());
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
     * Sets the allowedProducts property value. The allowed products included with this business compliance policy.
     * @param value Value to set for the allowedProducts property.
     */
    public void setAllowedProducts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedProducts = value;
    }
    /**
     * Sets the allowedStates property value. The allowed states included with this business compliance policy.
     * @param value Value to set for the allowedStates property.
     */
    public void setAllowedStates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedStates = value;
    }
    /**
     * Sets the enabled property value. Whether this business compliance policy is enabled.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the requireAgentLicenseState property value. Whether this business compliance policy requires agent license state.
     * @param value Value to set for the requireAgentLicenseState property.
     */
    public void setRequireAgentLicenseState(@jakarta.annotation.Nullable final Boolean value) {
        this.requireAgentLicenseState = value;
    }
    /**
     * Sets the requireLeadState property value. Whether this business compliance policy requires lead state.
     * @param value Value to set for the requireLeadState property.
     */
    public void setRequireLeadState(@jakarta.annotation.Nullable final Boolean value) {
        this.requireLeadState = value;
    }
    /**
     * Sets the requireProduct property value. Whether this business compliance policy requires product.
     * @param value Value to set for the requireProduct property.
     */
    public void setRequireProduct(@jakarta.annotation.Nullable final Boolean value) {
        this.requireProduct = value;
    }
    /**
     * Sets the requireSourceComplianceApproval property value. Whether this business compliance policy requires source compliance approval.
     * @param value Value to set for the requireSourceComplianceApproval property.
     */
    public void setRequireSourceComplianceApproval(@jakarta.annotation.Nullable final Boolean value) {
        this.requireSourceComplianceApproval = value;
    }
    /**
     * Sets the requireTrustedFormForAutomations property value. Whether this business compliance policy requires TrustedForm for automations.
     * @param value Value to set for the requireTrustedFormForAutomations property.
     */
    public void setRequireTrustedFormForAutomations(@jakarta.annotation.Nullable final Boolean value) {
        this.requireTrustedFormForAutomations = value;
    }
}
