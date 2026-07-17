package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents customer automation health data exposed by Leadping analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerAutomationHealth implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total number of automation records represented by this Leadping customer automation health.
     */
    private Integer automationCount;
    /**
     * Total number of enabled records represented by this Leadping customer automation health.
     */
    private Integer enabledCount;
    /**
     * Number of executions represented by this Leadping customer automation health.
     */
    private Integer executions;
    /**
     * Collection of failing automations included with this Leadping customer automation health.
     */
    private java.util.List<CustomerFailingAutomation> failingAutomations;
    /**
     * Total number of failure records represented by this Leadping customer automation health.
     */
    private Integer failureCount;
    /**
     * Last failure associated with this Leadping customer automation health.
     */
    private CustomerAutomationHealthLastFailure lastFailure;
    /**
     * Total number of success records represented by this Leadping customer automation health.
     */
    private Integer successCount;
    /**
     * Instantiates a new {@link CustomerAutomationHealth} and sets the default values.
     */
    public CustomerAutomationHealth() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerAutomationHealth}
     */
    @jakarta.annotation.Nonnull
    public static CustomerAutomationHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerAutomationHealth();
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
     * Gets the automationCount property value. Total number of automation records represented by this Leadping customer automation health.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAutomationCount() {
        return this.automationCount;
    }
    /**
     * Gets the enabledCount property value. Total number of enabled records represented by this Leadping customer automation health.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEnabledCount() {
        return this.enabledCount;
    }
    /**
     * Gets the executions property value. Number of executions represented by this Leadping customer automation health.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExecutions() {
        return this.executions;
    }
    /**
     * Gets the failingAutomations property value. Collection of failing automations included with this Leadping customer automation health.
     * @return a {@link java.util.List<CustomerFailingAutomation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerFailingAutomation> getFailingAutomations() {
        return this.failingAutomations;
    }
    /**
     * Gets the failureCount property value. Total number of failure records represented by this Leadping customer automation health.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailureCount() {
        return this.failureCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("automationCount", (n) -> { this.setAutomationCount(n.getIntegerValue()); });
        deserializerMap.put("enabledCount", (n) -> { this.setEnabledCount(n.getIntegerValue()); });
        deserializerMap.put("executions", (n) -> { this.setExecutions(n.getIntegerValue()); });
        deserializerMap.put("failingAutomations", (n) -> { this.setFailingAutomations(n.getCollectionOfObjectValues(CustomerFailingAutomation::createFromDiscriminatorValue)); });
        deserializerMap.put("failureCount", (n) -> { this.setFailureCount(n.getIntegerValue()); });
        deserializerMap.put("lastFailure", (n) -> { this.setLastFailure(n.getObjectValue(CustomerAutomationHealthLastFailure::createFromDiscriminatorValue)); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastFailure property value. Last failure associated with this Leadping customer automation health.
     * @return a {@link CustomerAutomationHealthLastFailure}
     */
    @jakarta.annotation.Nullable
    public CustomerAutomationHealthLastFailure getLastFailure() {
        return this.lastFailure;
    }
    /**
     * Gets the successCount property value. Total number of success records represented by this Leadping customer automation health.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessCount() {
        return this.successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("automationCount", this.getAutomationCount());
        writer.writeIntegerValue("enabledCount", this.getEnabledCount());
        writer.writeIntegerValue("executions", this.getExecutions());
        writer.writeCollectionOfObjectValues("failingAutomations", this.getFailingAutomations());
        writer.writeIntegerValue("failureCount", this.getFailureCount());
        writer.writeObjectValue("lastFailure", this.getLastFailure());
        writer.writeIntegerValue("successCount", this.getSuccessCount());
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
     * Sets the automationCount property value. Total number of automation records represented by this Leadping customer automation health.
     * @param value Value to set for the automationCount property.
     */
    public void setAutomationCount(@jakarta.annotation.Nullable final Integer value) {
        this.automationCount = value;
    }
    /**
     * Sets the enabledCount property value. Total number of enabled records represented by this Leadping customer automation health.
     * @param value Value to set for the enabledCount property.
     */
    public void setEnabledCount(@jakarta.annotation.Nullable final Integer value) {
        this.enabledCount = value;
    }
    /**
     * Sets the executions property value. Number of executions represented by this Leadping customer automation health.
     * @param value Value to set for the executions property.
     */
    public void setExecutions(@jakarta.annotation.Nullable final Integer value) {
        this.executions = value;
    }
    /**
     * Sets the failingAutomations property value. Collection of failing automations included with this Leadping customer automation health.
     * @param value Value to set for the failingAutomations property.
     */
    public void setFailingAutomations(@jakarta.annotation.Nullable final java.util.List<CustomerFailingAutomation> value) {
        this.failingAutomations = value;
    }
    /**
     * Sets the failureCount property value. Total number of failure records represented by this Leadping customer automation health.
     * @param value Value to set for the failureCount property.
     */
    public void setFailureCount(@jakarta.annotation.Nullable final Integer value) {
        this.failureCount = value;
    }
    /**
     * Sets the lastFailure property value. Last failure associated with this Leadping customer automation health.
     * @param value Value to set for the lastFailure property.
     */
    public void setLastFailure(@jakarta.annotation.Nullable final CustomerAutomationHealthLastFailure value) {
        this.lastFailure = value;
    }
    /**
     * Sets the successCount property value. Total number of success records represented by this Leadping customer automation health.
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.successCount = value;
    }
}
