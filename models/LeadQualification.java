package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Optional consumer qualification details for workflows that need them.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadQualification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Exact credit score supplied by the intake source; not a range.
     */
    private Integer creditScore;
    /**
     * Classifies a lead&apos;s reported employment arrangement for qualification and demographic workflows.
     */
    private LeadQualificationEmploymentType employmentType;
    /**
     * Indicates whether the lead reported bankruptcy history.
     */
    private Boolean hasBankruptcy;
    /**
     * Indicates whether the lead reported a medical condition relevant to qualification.
     */
    private Boolean hasMedicalCondition;
    /**
     * Height in inches.
     */
    private Integer height;
    /**
     * Annual income amount in the specified IncomeCurrency.
     */
    private Integer income;
    /**
     * ISO 4217 currency code for annual income.
     */
    private String incomeCurrency;
    /**
     * Indicates whether the lead owns their home.
     */
    private Boolean isHomeowner;
    /**
     * Classifies a lead&apos;s reported marital status when required by a qualification or integration workflow.
     */
    private LeadQualificationMaritalStatus maritalStatus;
    /**
     * Number of months the lead has lived at the current residence.
     */
    private Integer monthsAtResidence;
    /**
     * Number of dependents reported by the lead.
     */
    private Integer numberOfDependents;
    /**
     * Body weight in pounds.
     */
    private Integer weight;
    /**
     * Instantiates a new {@link LeadQualification} and sets the default values.
     */
    public LeadQualification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadQualification}
     */
    @jakarta.annotation.Nonnull
    public static LeadQualification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadQualification();
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
     * Gets the creditScore property value. Exact credit score supplied by the intake source; not a range.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCreditScore() {
        return this.creditScore;
    }
    /**
     * Gets the employmentType property value. Classifies a lead&apos;s reported employment arrangement for qualification and demographic workflows.
     * @return a {@link LeadQualificationEmploymentType}
     */
    @jakarta.annotation.Nullable
    public LeadQualificationEmploymentType getEmploymentType() {
        return this.employmentType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("creditScore", (n) -> { this.setCreditScore(n.getIntegerValue()); });
        deserializerMap.put("employmentType", (n) -> { this.setEmploymentType(n.getEnumValue(LeadQualificationEmploymentType::forValue)); });
        deserializerMap.put("hasBankruptcy", (n) -> { this.setHasBankruptcy(n.getBooleanValue()); });
        deserializerMap.put("hasMedicalCondition", (n) -> { this.setHasMedicalCondition(n.getBooleanValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("income", (n) -> { this.setIncome(n.getIntegerValue()); });
        deserializerMap.put("incomeCurrency", (n) -> { this.setIncomeCurrency(n.getStringValue()); });
        deserializerMap.put("isHomeowner", (n) -> { this.setIsHomeowner(n.getBooleanValue()); });
        deserializerMap.put("maritalStatus", (n) -> { this.setMaritalStatus(n.getEnumValue(LeadQualificationMaritalStatus::forValue)); });
        deserializerMap.put("monthsAtResidence", (n) -> { this.setMonthsAtResidence(n.getIntegerValue()); });
        deserializerMap.put("numberOfDependents", (n) -> { this.setNumberOfDependents(n.getIntegerValue()); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the height property value. Height in inches.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the income property value. Annual income amount in the specified IncomeCurrency.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIncome() {
        return this.income;
    }
    /**
     * Gets the incomeCurrency property value. ISO 4217 currency code for annual income.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIncomeCurrency() {
        return this.incomeCurrency;
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
     * Gets the maritalStatus property value. Classifies a lead&apos;s reported marital status when required by a qualification or integration workflow.
     * @return a {@link LeadQualificationMaritalStatus}
     */
    @jakarta.annotation.Nullable
    public LeadQualificationMaritalStatus getMaritalStatus() {
        return this.maritalStatus;
    }
    /**
     * Gets the monthsAtResidence property value. Number of months the lead has lived at the current residence.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMonthsAtResidence() {
        return this.monthsAtResidence;
    }
    /**
     * Gets the numberOfDependents property value. Number of dependents reported by the lead.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfDependents() {
        return this.numberOfDependents;
    }
    /**
     * Gets the weight property value. Body weight in pounds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("creditScore", this.getCreditScore());
        writer.writeEnumValue("employmentType", this.getEmploymentType());
        writer.writeBooleanValue("hasBankruptcy", this.getHasBankruptcy());
        writer.writeBooleanValue("hasMedicalCondition", this.getHasMedicalCondition());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeIntegerValue("income", this.getIncome());
        writer.writeStringValue("incomeCurrency", this.getIncomeCurrency());
        writer.writeBooleanValue("isHomeowner", this.getIsHomeowner());
        writer.writeEnumValue("maritalStatus", this.getMaritalStatus());
        writer.writeIntegerValue("monthsAtResidence", this.getMonthsAtResidence());
        writer.writeIntegerValue("numberOfDependents", this.getNumberOfDependents());
        writer.writeIntegerValue("weight", this.getWeight());
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
     * Sets the creditScore property value. Exact credit score supplied by the intake source; not a range.
     * @param value Value to set for the creditScore property.
     */
    public void setCreditScore(@jakarta.annotation.Nullable final Integer value) {
        this.creditScore = value;
    }
    /**
     * Sets the employmentType property value. Classifies a lead&apos;s reported employment arrangement for qualification and demographic workflows.
     * @param value Value to set for the employmentType property.
     */
    public void setEmploymentType(@jakarta.annotation.Nullable final LeadQualificationEmploymentType value) {
        this.employmentType = value;
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
     * Sets the height property value. Height in inches.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the income property value. Annual income amount in the specified IncomeCurrency.
     * @param value Value to set for the income property.
     */
    public void setIncome(@jakarta.annotation.Nullable final Integer value) {
        this.income = value;
    }
    /**
     * Sets the incomeCurrency property value. ISO 4217 currency code for annual income.
     * @param value Value to set for the incomeCurrency property.
     */
    public void setIncomeCurrency(@jakarta.annotation.Nullable final String value) {
        this.incomeCurrency = value;
    }
    /**
     * Sets the isHomeowner property value. Indicates whether the lead owns their home.
     * @param value Value to set for the isHomeowner property.
     */
    public void setIsHomeowner(@jakarta.annotation.Nullable final Boolean value) {
        this.isHomeowner = value;
    }
    /**
     * Sets the maritalStatus property value. Classifies a lead&apos;s reported marital status when required by a qualification or integration workflow.
     * @param value Value to set for the maritalStatus property.
     */
    public void setMaritalStatus(@jakarta.annotation.Nullable final LeadQualificationMaritalStatus value) {
        this.maritalStatus = value;
    }
    /**
     * Sets the monthsAtResidence property value. Number of months the lead has lived at the current residence.
     * @param value Value to set for the monthsAtResidence property.
     */
    public void setMonthsAtResidence(@jakarta.annotation.Nullable final Integer value) {
        this.monthsAtResidence = value;
    }
    /**
     * Sets the numberOfDependents property value. Number of dependents reported by the lead.
     * @param value Value to set for the numberOfDependents property.
     */
    public void setNumberOfDependents(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfDependents = value;
    }
    /**
     * Sets the weight property value. Body weight in pounds.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Integer value) {
        this.weight = value;
    }
}
