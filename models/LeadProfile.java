package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for lead demographic profile data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadProfile implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Lead birth date used for demographic matching and insurance intake workflows.
     */
    private LocalDate birthDate;
    /**
     * Lead credit score range or score supplied by the intake source.
     */
    private UntypedNode creditScore;
    /**
     * Defines the supported Employment Type values.
     */
    private LeadProfileEmploymentType employmentType;
    /**
     * Represents a gender classification used for demographic or identification purposes.
     */
    private LeadProfileGender gender;
    /**
     * Indicates whether the lead reported bankruptcy history.
     */
    private Boolean hasBankruptcy;
    /**
     * Indicates whether the lead reported a medical condition relevant to qualification.
     */
    private Boolean hasMedicalCondition;
    /**
     * Lead height provided for qualification workflows that require demographic details.
     */
    private UntypedNode height;
    /**
     * Lead income amount or range supplied for qualification workflows.
     */
    private UntypedNode income;
    /**
     * Indicates whether the lead owns their home.
     */
    private Boolean isHomeowner;
    /**
     * Defines the supported Marital Status Type values.
     */
    private LeadProfileMaritalStatus maritalStatus;
    /**
     * Number of months the lead has lived at the current residence.
     */
    private UntypedNode monthsAtResidence;
    /**
     * Number of dependents reported by the lead.
     */
    private UntypedNode numberOfDependents;
    /**
     * Relative weighting used to rank or score this lead demographic profile.
     */
    private UntypedNode weight;
    /**
     * Instantiates a new {@link LeadProfile} and sets the default values.
     */
    public LeadProfile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadProfile}
     */
    @jakarta.annotation.Nonnull
    public static LeadProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadProfile();
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
     * Gets the birthDate property value. Lead birth date used for demographic matching and insurance intake workflows.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getBirthDate() {
        return this.birthDate;
    }
    /**
     * Gets the creditScore property value. Lead credit score range or score supplied by the intake source.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCreditScore() {
        return this.creditScore;
    }
    /**
     * Gets the employmentType property value. Defines the supported Employment Type values.
     * @return a {@link LeadProfileEmploymentType}
     */
    @jakarta.annotation.Nullable
    public LeadProfileEmploymentType getEmploymentType() {
        return this.employmentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("birthDate", (n) -> { this.setBirthDate(n.getLocalDateValue()); });
        deserializerMap.put("creditScore", (n) -> { this.setCreditScore(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("employmentType", (n) -> { this.setEmploymentType(n.getEnumValue(LeadProfileEmploymentType::forValue)); });
        deserializerMap.put("gender", (n) -> { this.setGender(n.getEnumValue(LeadProfileGender::forValue)); });
        deserializerMap.put("hasBankruptcy", (n) -> { this.setHasBankruptcy(n.getBooleanValue()); });
        deserializerMap.put("hasMedicalCondition", (n) -> { this.setHasMedicalCondition(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("income", (n) -> { this.setIncome(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("isHomeowner", (n) -> { this.setIsHomeowner(n.getBooleanValue()); });
        deserializerMap.put("maritalStatus", (n) -> { this.setMaritalStatus(n.getEnumValue(LeadProfileMaritalStatus::forValue)); });
        deserializerMap.put("monthsAtResidence", (n) -> { this.setMonthsAtResidence(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("numberOfDependents", (n) -> { this.setNumberOfDependents(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gender property value. Represents a gender classification used for demographic or identification purposes.
     * @return a {@link LeadProfileGender}
     */
    @jakarta.annotation.Nullable
    public LeadProfileGender getGender() {
        return this.gender;
    }
    /**
     * Gets the hasBankruptcy property value. Indicates whether the lead reported bankruptcy history.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasBankruptcy() {
        return this.hasBankruptcy;
    }
    /**
     * Gets the hasMedicalCondition property value. Indicates whether the lead reported a medical condition relevant to qualification.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMedicalCondition() {
        return this.hasMedicalCondition;
    }
    /**
     * Gets the height property value. Lead height provided for qualification workflows that require demographic details.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getHeight() {
        return this.height;
    }
    /**
     * Gets the income property value. Lead income amount or range supplied for qualification workflows.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getIncome() {
        return this.income;
    }
    /**
     * Gets the isHomeowner property value. Indicates whether the lead owns their home.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHomeowner() {
        return this.isHomeowner;
    }
    /**
     * Gets the maritalStatus property value. Defines the supported Marital Status Type values.
     * @return a {@link LeadProfileMaritalStatus}
     */
    @jakarta.annotation.Nullable
    public LeadProfileMaritalStatus getMaritalStatus() {
        return this.maritalStatus;
    }
    /**
     * Gets the monthsAtResidence property value. Number of months the lead has lived at the current residence.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMonthsAtResidence() {
        return this.monthsAtResidence;
    }
    /**
     * Gets the numberOfDependents property value. Number of dependents reported by the lead.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getNumberOfDependents() {
        return this.numberOfDependents;
    }
    /**
     * Gets the weight property value. Relative weighting used to rank or score this lead demographic profile.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeObjectValue("creditScore", this.getCreditScore());
        writer.writeEnumValue("employmentType", this.getEmploymentType());
        writer.writeEnumValue("gender", this.getGender());
        writer.writeBooleanValue("hasBankruptcy", this.getHasBankruptcy());
        writer.writeBooleanValue("hasMedicalCondition", this.getHasMedicalCondition());
        writer.writeObjectValue("height", this.getHeight());
        writer.writeObjectValue("income", this.getIncome());
        writer.writeBooleanValue("isHomeowner", this.getIsHomeowner());
        writer.writeEnumValue("maritalStatus", this.getMaritalStatus());
        writer.writeObjectValue("monthsAtResidence", this.getMonthsAtResidence());
        writer.writeObjectValue("numberOfDependents", this.getNumberOfDependents());
        writer.writeObjectValue("weight", this.getWeight());
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
     * Sets the birthDate property value. Lead birth date used for demographic matching and insurance intake workflows.
     * @param value Value to set for the birthDate property.
     */
    public void setBirthDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.birthDate = value;
    }
    /**
     * Sets the creditScore property value. Lead credit score range or score supplied by the intake source.
     * @param value Value to set for the creditScore property.
     */
    public void setCreditScore(@jakarta.annotation.Nullable final UntypedNode value) {
        this.creditScore = value;
    }
    /**
     * Sets the employmentType property value. Defines the supported Employment Type values.
     * @param value Value to set for the employmentType property.
     */
    public void setEmploymentType(@jakarta.annotation.Nullable final LeadProfileEmploymentType value) {
        this.employmentType = value;
    }
    /**
     * Sets the gender property value. Represents a gender classification used for demographic or identification purposes.
     * @param value Value to set for the gender property.
     */
    public void setGender(@jakarta.annotation.Nullable final LeadProfileGender value) {
        this.gender = value;
    }
    /**
     * Sets the hasBankruptcy property value. Indicates whether the lead reported bankruptcy history.
     * @param value Value to set for the hasBankruptcy property.
     */
    public void setHasBankruptcy(@jakarta.annotation.Nullable final Boolean value) {
        this.hasBankruptcy = value;
    }
    /**
     * Sets the hasMedicalCondition property value. Indicates whether the lead reported a medical condition relevant to qualification.
     * @param value Value to set for the hasMedicalCondition property.
     */
    public void setHasMedicalCondition(@jakarta.annotation.Nullable final Boolean value) {
        this.hasMedicalCondition = value;
    }
    /**
     * Sets the height property value. Lead height provided for qualification workflows that require demographic details.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final UntypedNode value) {
        this.height = value;
    }
    /**
     * Sets the income property value. Lead income amount or range supplied for qualification workflows.
     * @param value Value to set for the income property.
     */
    public void setIncome(@jakarta.annotation.Nullable final UntypedNode value) {
        this.income = value;
    }
    /**
     * Sets the isHomeowner property value. Indicates whether the lead owns their home.
     * @param value Value to set for the isHomeowner property.
     */
    public void setIsHomeowner(@jakarta.annotation.Nullable final Boolean value) {
        this.isHomeowner = value;
    }
    /**
     * Sets the maritalStatus property value. Defines the supported Marital Status Type values.
     * @param value Value to set for the maritalStatus property.
     */
    public void setMaritalStatus(@jakarta.annotation.Nullable final LeadProfileMaritalStatus value) {
        this.maritalStatus = value;
    }
    /**
     * Sets the monthsAtResidence property value. Number of months the lead has lived at the current residence.
     * @param value Value to set for the monthsAtResidence property.
     */
    public void setMonthsAtResidence(@jakarta.annotation.Nullable final UntypedNode value) {
        this.monthsAtResidence = value;
    }
    /**
     * Sets the numberOfDependents property value. Number of dependents reported by the lead.
     * @param value Value to set for the numberOfDependents property.
     */
    public void setNumberOfDependents(@jakarta.annotation.Nullable final UntypedNode value) {
        this.numberOfDependents = value;
    }
    /**
     * Sets the weight property value. Relative weighting used to rank or score this lead demographic profile.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final UntypedNode value) {
        this.weight = value;
    }
}
