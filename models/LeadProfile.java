package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
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
     * Classifies a lead&apos;s self-reported gender when required by a qualification, demographic, or integration workflow.
     */
    private LeadProfileGender gender;
    /**
     * Optional consumer qualification details for workflows that need them.
     */
    private LeadProfileQualification qualification;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("birthDate", (n) -> { this.setBirthDate(n.getLocalDateValue()); });
        deserializerMap.put("gender", (n) -> { this.setGender(n.getEnumValue(LeadProfileGender::forValue)); });
        deserializerMap.put("qualification", (n) -> { this.setQualification(n.getObjectValue(LeadProfileQualification::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gender property value. Classifies a lead&apos;s self-reported gender when required by a qualification, demographic, or integration workflow.
     * @return a {@link LeadProfileGender}
     */
    @jakarta.annotation.Nullable
    public LeadProfileGender getGender() {
        return this.gender;
    }
    /**
     * Gets the qualification property value. Optional consumer qualification details for workflows that need them.
     * @return a {@link LeadProfileQualification}
     */
    @jakarta.annotation.Nullable
    public LeadProfileQualification getQualification() {
        return this.qualification;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeEnumValue("gender", this.getGender());
        writer.writeObjectValue("qualification", this.getQualification());
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
     * Sets the gender property value. Classifies a lead&apos;s self-reported gender when required by a qualification, demographic, or integration workflow.
     * @param value Value to set for the gender property.
     */
    public void setGender(@jakarta.annotation.Nullable final LeadProfileGender value) {
        this.gender = value;
    }
    /**
     * Sets the qualification property value. Optional consumer qualification details for workflows that need them.
     * @param value Value to set for the qualification property.
     */
    public void setQualification(@jakarta.annotation.Nullable final LeadProfileQualification value) {
        this.qualification = value;
    }
}
