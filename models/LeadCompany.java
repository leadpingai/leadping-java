package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Business represented by a lead contact.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadCompany implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of employees, when known.
     */
    private Integer employeeCount;
    /**
     * Industry of the business, independent of the requested service.
     */
    private String industry;
    /**
     * Contact role at the business.
     */
    private String jobTitle;
    /**
     * Business name.
     */
    private String name;
    /**
     * Business website URL.
     */
    private String website;
    /**
     * Instantiates a new {@link LeadCompany} and sets the default values.
     */
    public LeadCompany() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadCompany}
     */
    @jakarta.annotation.Nonnull
    public static LeadCompany createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadCompany();
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
     * Gets the employeeCount property value. Number of employees, when known.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEmployeeCount() {
        return this.employeeCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("employeeCount", (n) -> { this.setEmployeeCount(n.getIntegerValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industry property value. Industry of the business, independent of the requested service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the jobTitle property value. Contact role at the business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the name property value. Business name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the website property value. Business website URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("employeeCount", this.getEmployeeCount());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("website", this.getWebsite());
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
     * Sets the employeeCount property value. Number of employees, when known.
     * @param value Value to set for the employeeCount property.
     */
    public void setEmployeeCount(@jakarta.annotation.Nullable final Integer value) {
        this.employeeCount = value;
    }
    /**
     * Sets the industry property value. Industry of the business, independent of the requested service.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the jobTitle property value. Contact role at the business.
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the name property value. Business name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the website property value. Business website URL.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
}
