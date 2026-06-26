package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API automation configuration request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Automation actions configured or returned for this workflow.
     */
    private java.util.List<AutomationAction> actions;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Admin override that can enable or disable this record independently of normal status checks.
     */
    private AutomationRequestAdminEnablementOverride adminEnablementOverride;
    /**
     * Business ID that owns this automation configuration.
     */
    private String businessId;
    /**
     * Grouped automation conditions used to decide whether this workflow should run.
     */
    private java.util.List<AutomationConditionGroup> conditionGroups;
    /**
     * User ID of the person who created this automation configuration request.
     */
    private String createdByUserId;
    /**
     * Human-readable description that explains this automation configuration request to API users.
     */
    private String description;
    /**
     * Indicates whether this automation configuration request is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * The unique identifier for the entity, when updating an existing entity.
     */
    private String id;
    /**
     * Indicates whether Leadping manages this automation configuration request automatically instead of a user.
     */
    private Boolean isSystemManaged;
    /**
     * Management level that controls whether Leadping or the business owns this automation setting.
     */
    private String managementLevel;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * Scope that limits where this automation configuration request applies in Leadping.
     */
    private String scope;
    /**
     * Automation triggers that can start this workflow.
     */
    private java.util.List<AutomationTrigger> triggers;
    /**
     * Version number for this automation configuration request schema or saved configuration.
     */
    private Integer version;
    /**
     * Visibility level that controls who can see this automation configuration request.
     */
    private String visibility;
    /**
     * Instantiates a new {@link AutomationRequest} and sets the default values.
     */
    public AutomationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationRequest}
     */
    @jakarta.annotation.Nonnull
    public static AutomationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationRequest();
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
     * Gets the adminEnablementOverride property value. Admin override that can enable or disable this record independently of normal status checks.
     * @return a {@link AutomationRequestAdminEnablementOverride}
     */
    @jakarta.annotation.Nullable
    public AutomationRequestAdminEnablementOverride getAdminEnablementOverride() {
        return this.adminEnablementOverride;
    }
    /**
     * Gets the businessId property value. Business ID that owns this automation configuration.
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
     * Gets the createdByUserId property value. User ID of the person who created this automation configuration request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the description property value. Human-readable description that explains this automation configuration request to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the enabled property value. Indicates whether this automation configuration request is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AutomationAction::createFromDiscriminatorValue)); });
        deserializerMap.put("adminEnablementOverride", (n) -> { this.setAdminEnablementOverride(n.getObjectValue(AutomationRequestAdminEnablementOverride::createFromDiscriminatorValue)); });
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
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isSystemManaged property value. Indicates whether Leadping manages this automation configuration request automatically instead of a user.
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
     * Gets the name property value. The display name for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the scope property value. Scope that limits where this automation configuration request applies in Leadping.
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
     * Gets the version property value. Version number for this automation configuration request schema or saved configuration.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Gets the visibility property value. Visibility level that controls who can see this automation configuration request.
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
        writer.writeObjectValue("adminEnablementOverride", this.getAdminEnablementOverride());
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
        writer.writeIntegerValue("version", this.getVersion());
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
     * Sets the adminEnablementOverride property value. Admin override that can enable or disable this record independently of normal status checks.
     * @param value Value to set for the adminEnablementOverride property.
     */
    public void setAdminEnablementOverride(@jakarta.annotation.Nullable final AutomationRequestAdminEnablementOverride value) {
        this.adminEnablementOverride = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this automation configuration.
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
     * Sets the createdByUserId property value. User ID of the person who created this automation configuration request.
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this automation configuration request to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this automation configuration request is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isSystemManaged property value. Indicates whether Leadping manages this automation configuration request automatically instead of a user.
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
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the scope property value. Scope that limits where this automation configuration request applies in Leadping.
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
     * Sets the version property value. Version number for this automation configuration request schema or saved configuration.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
    /**
     * Sets the visibility property value. Visibility level that controls who can see this automation configuration request.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.visibility = value;
    }
}
