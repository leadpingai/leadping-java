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
 * List item schema for Leadping API automation table row results shown in searchable tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Human-readable summary of the automation action outcome.
     */
    private String actionSummary;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Admin override that can enable or disable this record independently of normal status checks.
     */
    private AutomationTableRowAdminEnablementOverride adminEnablementOverride;
    /**
     * Business summary connected to this automation table row.
     */
    private AutomationTableRowBusiness business;
    /**
     * Business ID that owns this automation.
     */
    private String businessId;
    /**
     * Human-readable summary of the automation condition evaluation.
     */
    private String conditionSummary;
    /**
     * User ID of the person who created this automation table row.
     */
    private String createdByUserId;
    /**
     * Human-readable description that explains this automation table row to API users.
     */
    private String description;
    /**
     * Indicates whether this automation table row is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Human-readable health summary for this automation table row.
     */
    private String healthSummary;
    /**
     * Unique Leadping identifier for this automation table row.
     */
    private String id;
    /**
     * Indicates whether Leadping manages this automation table row automatically instead of a user.
     */
    private Boolean isSystemManaged;
    /**
     * UTC timestamp when this automation last ran.
     */
    private OffsetDateTime lastRunAt;
    /**
     * Most recent automation run error message, if the last run failed.
     */
    private String lastRunError;
    /**
     * Status from the most recent automation run.
     */
    private String lastRunStatus;
    /**
     * Management level that controls whether Leadping or the business owns this automation setting.
     */
    private String managementLevel;
    /**
     * UTC timestamp when this automation table row was last modified.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Display name for this automation table row in the Leadping API.
     */
    private String name;
    /**
     * Human-readable explanation of the automation rule being evaluated.
     */
    private String ruleSentence;
    /**
     * Scope that limits where this automation table row applies in Leadping.
     */
    private String scope;
    /**
     * Human-readable summary of the automation trigger that started the workflow.
     */
    private String triggerSummary;
    /**
     * Automation trigger type that starts the workflow.
     */
    private String triggerType;
    /**
     * User summary connected to this automation table row.
     */
    private AutomationTableRowUser user;
    /**
     * Visibility level that controls who can see this automation table row.
     */
    private String visibility;
    /**
     * Instantiates a new {@link AutomationTableRow} and sets the default values.
     */
    public AutomationTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationTableRow}
     */
    @jakarta.annotation.Nonnull
    public static AutomationTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationTableRow();
    }
    /**
     * Gets the actionSummary property value. Human-readable summary of the automation action outcome.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionSummary() {
        return this.actionSummary;
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
     * @return a {@link AutomationTableRowAdminEnablementOverride}
     */
    @jakarta.annotation.Nullable
    public AutomationTableRowAdminEnablementOverride getAdminEnablementOverride() {
        return this.adminEnablementOverride;
    }
    /**
     * Gets the business property value. Business summary connected to this automation table row.
     * @return a {@link AutomationTableRowBusiness}
     */
    @jakarta.annotation.Nullable
    public AutomationTableRowBusiness getBusiness() {
        return this.business;
    }
    /**
     * Gets the businessId property value. Business ID that owns this automation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the conditionSummary property value. Human-readable summary of the automation condition evaluation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionSummary() {
        return this.conditionSummary;
    }
    /**
     * Gets the createdByUserId property value. User ID of the person who created this automation table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * Gets the description property value. Human-readable description that explains this automation table row to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the enabled property value. Indicates whether this automation table row is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("actionSummary", (n) -> { this.setActionSummary(n.getStringValue()); });
        deserializerMap.put("adminEnablementOverride", (n) -> { this.setAdminEnablementOverride(n.getObjectValue(AutomationTableRowAdminEnablementOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(AutomationTableRowBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("conditionSummary", (n) -> { this.setConditionSummary(n.getStringValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("healthSummary", (n) -> { this.setHealthSummary(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isSystemManaged", (n) -> { this.setIsSystemManaged(n.getBooleanValue()); });
        deserializerMap.put("lastRunAt", (n) -> { this.setLastRunAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRunError", (n) -> { this.setLastRunError(n.getStringValue()); });
        deserializerMap.put("lastRunStatus", (n) -> { this.setLastRunStatus(n.getStringValue()); });
        deserializerMap.put("managementLevel", (n) -> { this.setManagementLevel(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("ruleSentence", (n) -> { this.setRuleSentence(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("triggerSummary", (n) -> { this.setTriggerSummary(n.getStringValue()); });
        deserializerMap.put("triggerType", (n) -> { this.setTriggerType(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(AutomationTableRowUser::createFromDiscriminatorValue)); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthSummary property value. Human-readable health summary for this automation table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHealthSummary() {
        return this.healthSummary;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this automation table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isSystemManaged property value. Indicates whether Leadping manages this automation table row automatically instead of a user.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemManaged() {
        return this.isSystemManaged;
    }
    /**
     * Gets the lastRunAt property value. UTC timestamp when this automation last ran.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunAt() {
        return this.lastRunAt;
    }
    /**
     * Gets the lastRunError property value. Most recent automation run error message, if the last run failed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastRunError() {
        return this.lastRunError;
    }
    /**
     * Gets the lastRunStatus property value. Status from the most recent automation run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastRunStatus() {
        return this.lastRunStatus;
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
     * Gets the modifiedAt property value. UTC timestamp when this automation table row was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. Display name for this automation table row in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the ruleSentence property value. Human-readable explanation of the automation rule being evaluated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRuleSentence() {
        return this.ruleSentence;
    }
    /**
     * Gets the scope property value. Scope that limits where this automation table row applies in Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.scope;
    }
    /**
     * Gets the triggerSummary property value. Human-readable summary of the automation trigger that started the workflow.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTriggerSummary() {
        return this.triggerSummary;
    }
    /**
     * Gets the triggerType property value. Automation trigger type that starts the workflow.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTriggerType() {
        return this.triggerType;
    }
    /**
     * Gets the user property value. User summary connected to this automation table row.
     * @return a {@link AutomationTableRowUser}
     */
    @jakarta.annotation.Nullable
    public AutomationTableRowUser getUser() {
        return this.user;
    }
    /**
     * Gets the visibility property value. Visibility level that controls who can see this automation table row.
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
        writer.writeStringValue("actionSummary", this.getActionSummary());
        writer.writeObjectValue("adminEnablementOverride", this.getAdminEnablementOverride());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("conditionSummary", this.getConditionSummary());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("healthSummary", this.getHealthSummary());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isSystemManaged", this.getIsSystemManaged());
        writer.writeOffsetDateTimeValue("lastRunAt", this.getLastRunAt());
        writer.writeStringValue("lastRunError", this.getLastRunError());
        writer.writeStringValue("lastRunStatus", this.getLastRunStatus());
        writer.writeStringValue("managementLevel", this.getManagementLevel());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("ruleSentence", this.getRuleSentence());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("triggerSummary", this.getTriggerSummary());
        writer.writeStringValue("triggerType", this.getTriggerType());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("visibility", this.getVisibility());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionSummary property value. Human-readable summary of the automation action outcome.
     * @param value Value to set for the actionSummary property.
     */
    public void setActionSummary(@jakarta.annotation.Nullable final String value) {
        this.actionSummary = value;
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
    public void setAdminEnablementOverride(@jakarta.annotation.Nullable final AutomationTableRowAdminEnablementOverride value) {
        this.adminEnablementOverride = value;
    }
    /**
     * Sets the business property value. Business summary connected to this automation table row.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final AutomationTableRowBusiness value) {
        this.business = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this automation.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the conditionSummary property value. Human-readable summary of the automation condition evaluation.
     * @param value Value to set for the conditionSummary property.
     */
    public void setConditionSummary(@jakarta.annotation.Nullable final String value) {
        this.conditionSummary = value;
    }
    /**
     * Sets the createdByUserId property value. User ID of the person who created this automation table row.
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this automation table row to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this automation table row is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the healthSummary property value. Human-readable health summary for this automation table row.
     * @param value Value to set for the healthSummary property.
     */
    public void setHealthSummary(@jakarta.annotation.Nullable final String value) {
        this.healthSummary = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this automation table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isSystemManaged property value. Indicates whether Leadping manages this automation table row automatically instead of a user.
     * @param value Value to set for the isSystemManaged property.
     */
    public void setIsSystemManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.isSystemManaged = value;
    }
    /**
     * Sets the lastRunAt property value. UTC timestamp when this automation last ran.
     * @param value Value to set for the lastRunAt property.
     */
    public void setLastRunAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRunAt = value;
    }
    /**
     * Sets the lastRunError property value. Most recent automation run error message, if the last run failed.
     * @param value Value to set for the lastRunError property.
     */
    public void setLastRunError(@jakarta.annotation.Nullable final String value) {
        this.lastRunError = value;
    }
    /**
     * Sets the lastRunStatus property value. Status from the most recent automation run.
     * @param value Value to set for the lastRunStatus property.
     */
    public void setLastRunStatus(@jakarta.annotation.Nullable final String value) {
        this.lastRunStatus = value;
    }
    /**
     * Sets the managementLevel property value. Management level that controls whether Leadping or the business owns this automation setting.
     * @param value Value to set for the managementLevel property.
     */
    public void setManagementLevel(@jakarta.annotation.Nullable final String value) {
        this.managementLevel = value;
    }
    /**
     * Sets the modifiedAt property value. UTC timestamp when this automation table row was last modified.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. Display name for this automation table row in the Leadping API.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the ruleSentence property value. Human-readable explanation of the automation rule being evaluated.
     * @param value Value to set for the ruleSentence property.
     */
    public void setRuleSentence(@jakarta.annotation.Nullable final String value) {
        this.ruleSentence = value;
    }
    /**
     * Sets the scope property value. Scope that limits where this automation table row applies in Leadping.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.scope = value;
    }
    /**
     * Sets the triggerSummary property value. Human-readable summary of the automation trigger that started the workflow.
     * @param value Value to set for the triggerSummary property.
     */
    public void setTriggerSummary(@jakarta.annotation.Nullable final String value) {
        this.triggerSummary = value;
    }
    /**
     * Sets the triggerType property value. Automation trigger type that starts the workflow.
     * @param value Value to set for the triggerType property.
     */
    public void setTriggerType(@jakarta.annotation.Nullable final String value) {
        this.triggerType = value;
    }
    /**
     * Sets the user property value. User summary connected to this automation table row.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final AutomationTableRowUser value) {
        this.user = value;
    }
    /**
     * Sets the visibility property value. Visibility level that controls who can see this automation table row.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.visibility = value;
    }
}
