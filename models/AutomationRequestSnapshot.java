package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for automation request snapshot data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationRequestSnapshot implements AdditionalDataHolder, Parsable {
    /**
     * Automation actions configured or returned for this workflow.
     */
    private java.util.List<AutomationAction> actions;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Business ID captured when the automation request snapshot was created.
     */
    private String businessId;
    /**
     * Grouped automation conditions used to decide whether this workflow should run.
     */
    private java.util.List<AutomationConditionGroup> conditionGroups;
    /**
     * User ID of the person who created this automation request snapshot.
     */
    private String createdByUserId;
    /**
     * Human-readable description that explains this automation request snapshot to API users.
     */
    private String description;
    /**
     * Indicates whether this automation request snapshot is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Unique Leadping identifier for this automation request snapshot.
     */
    private String id;
    /**
     * Indicates whether Leadping manages this automation request snapshot automatically instead of a user.
     */
    private Boolean isSystemManaged;
    /**
     * Management level that controls whether Leadping or the business owns this automation setting.
     */
    private String managementLevel;
    /**
     * Display name for this automation request snapshot in the Leadping API.
     */
    private String name;
    /**
     * Scope that limits where this automation request snapshot applies in Leadping.
     */
    private String scope;
    /**
     * Automation triggers that can start this workflow.
     */
    private java.util.List<AutomationTrigger> triggers;
    /**
     * Visibility level that controls who can see this automation request snapshot.
     */
    private String visibility;
    /**
     * Instantiates a new {@link AutomationRequestSnapshot} and sets the default values.
     */
    public AutomationRequestSnapshot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationRequestSnapshot}
     */
    @jakarta.annotation.Nonnull
    public static AutomationRequestSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationRequestSnapshot();
    }
    /**
     * Gets the actions property value. Automation actions configured or returned for this workflow.
     * @return a {@link java.util.List<AutomationAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationAction> getActions() {
        return this.actions;
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
     * Gets the businessId property value. Business ID captured when the automation request snapshot was created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the conditionGroups property value. Grouped automation conditions used to decide whether this workflow should run.
     * @return a {@link java.util.List<AutomationConditionGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationConditionGroup> getConditionGroups() {
        return this.conditionGroups;
    }
    /**
     * Gets the createdByUserId property value. User ID of the person who created this automation request snapshot.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the description property value. Human-readable description that explains this automation request snapshot to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the enabled property value. Indicates whether this automation request snapshot is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AutomationAction::createFromDiscriminatorValue)); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("conditionGroups", (n) -> { this.setConditionGroups(n.getCollectionOfObjectValues(AutomationConditionGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isSystemManaged", (n) -> { this.setIsSystemManaged(n.getBooleanValue()); });
        deserializerMap.put("managementLevel", (n) -> { this.setManagementLevel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("triggers", (n) -> { this.setTriggers(n.getCollectionOfObjectValues(AutomationTrigger::createFromDiscriminatorValue)); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this automation request snapshot.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isSystemManaged property value. Indicates whether Leadping manages this automation request snapshot automatically instead of a user.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemManaged() {
        return this.isSystemManaged;
    }
    /**
     * Gets the managementLevel property value. Management level that controls whether Leadping or the business owns this automation setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagementLevel() {
        return this.managementLevel;
    }
    /**
     * Gets the name property value. Display name for this automation request snapshot in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the scope property value. Scope that limits where this automation request snapshot applies in Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.scope;
    }
    /**
     * Gets the triggers property value. Automation triggers that can start this workflow.
     * @return a {@link java.util.List<AutomationTrigger>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationTrigger> getTriggers() {
        return this.triggers;
    }
    /**
     * Gets the visibility property value. Visibility level that controls who can see this automation request snapshot.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVisibility() {
        return this.visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeCollectionOfObjectValues("conditionGroups", this.getConditionGroups());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isSystemManaged", this.getIsSystemManaged());
        writer.writeStringValue("managementLevel", this.getManagementLevel());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("scope", this.getScope());
        writer.writeCollectionOfObjectValues("triggers", this.getTriggers());
        writer.writeStringValue("visibility", this.getVisibility());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. Automation actions configured or returned for this workflow.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AutomationAction> value) {
        this.actions = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the businessId property value. Business ID captured when the automation request snapshot was created.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the conditionGroups property value. Grouped automation conditions used to decide whether this workflow should run.
     * @param value Value to set for the conditionGroups property.
     */
    public void setConditionGroups(@jakarta.annotation.Nullable final java.util.List<AutomationConditionGroup> value) {
        this.conditionGroups = value;
    }
    /**
     * Sets the createdByUserId property value. User ID of the person who created this automation request snapshot.
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this automation request snapshot to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this automation request snapshot is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this automation request snapshot.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isSystemManaged property value. Indicates whether Leadping manages this automation request snapshot automatically instead of a user.
     * @param value Value to set for the isSystemManaged property.
     */
    public void setIsSystemManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.isSystemManaged = value;
    }
    /**
     * Sets the managementLevel property value. Management level that controls whether Leadping or the business owns this automation setting.
     * @param value Value to set for the managementLevel property.
     */
    public void setManagementLevel(@jakarta.annotation.Nullable final String value) {
        this.managementLevel = value;
    }
    /**
     * Sets the name property value. Display name for this automation request snapshot in the Leadping API.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the scope property value. Scope that limits where this automation request snapshot applies in Leadping.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.scope = value;
    }
    /**
     * Sets the triggers property value. Automation triggers that can start this workflow.
     * @param value Value to set for the triggers property.
     */
    public void setTriggers(@jakarta.annotation.Nullable final java.util.List<AutomationTrigger> value) {
        this.triggers = value;
    }
    /**
     * Sets the visibility property value. Visibility level that controls who can see this automation request snapshot.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.visibility = value;
    }
}
