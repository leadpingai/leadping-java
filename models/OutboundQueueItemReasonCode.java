package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Structured reason codes for outbound pacing and blocking decisions.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutboundQueueItemReasonCode implements ValuedEnum {
    Allowed("allowed"),
    No_eligible_phone_number("no_eligible_phone_number"),
    Ten_dlc_not_approved("ten_dlc_not_approved"),
    Phone_number_daily_limit_reached("phone_number_daily_limit_reached"),
    Phone_number_hourly_limit_reached("phone_number_hourly_limit_reached"),
    Phone_number_minute_limit_reached("phone_number_minute_limit_reached"),
    Business_daily_limit_reached("business_daily_limit_reached"),
    Business_hourly_limit_reached("business_hourly_limit_reached"),
    Business_minute_limit_reached("business_minute_limit_reached"),
    Lead_daily_limit_reached("lead_daily_limit_reached"),
    Lead_hourly_limit_reached("lead_hourly_limit_reached"),
    Lead_recently_contacted("lead_recently_contacted"),
    Lead_archived("lead_archived"),
    Quiet_hours("quiet_hours"),
    Wallet_insufficient("wallet_insufficient"),
    Contact_opted_out("contact_opted_out"),
    Imported_lead_requires_consent("imported_lead_requires_consent"),
    Automation_bulk_import_disabled("automation_bulk_import_disabled"),
    Number_cooling_down("number_cooling_down"),
    Number_health_blocked("number_health_blocked"),
    Provider_failure_backoff("provider_failure_backoff"),
    Campaign_daily_limit_reached("campaign_daily_limit_reached"),
    Reservation_unavailable("reservation_unavailable");
    public final String value;
    OutboundQueueItemReasonCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutboundQueueItemReasonCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowed": return Allowed;
            case "no_eligible_phone_number": return No_eligible_phone_number;
            case "ten_dlc_not_approved": return Ten_dlc_not_approved;
            case "phone_number_daily_limit_reached": return Phone_number_daily_limit_reached;
            case "phone_number_hourly_limit_reached": return Phone_number_hourly_limit_reached;
            case "phone_number_minute_limit_reached": return Phone_number_minute_limit_reached;
            case "business_daily_limit_reached": return Business_daily_limit_reached;
            case "business_hourly_limit_reached": return Business_hourly_limit_reached;
            case "business_minute_limit_reached": return Business_minute_limit_reached;
            case "lead_daily_limit_reached": return Lead_daily_limit_reached;
            case "lead_hourly_limit_reached": return Lead_hourly_limit_reached;
            case "lead_recently_contacted": return Lead_recently_contacted;
            case "lead_archived": return Lead_archived;
            case "quiet_hours": return Quiet_hours;
            case "wallet_insufficient": return Wallet_insufficient;
            case "contact_opted_out": return Contact_opted_out;
            case "imported_lead_requires_consent": return Imported_lead_requires_consent;
            case "automation_bulk_import_disabled": return Automation_bulk_import_disabled;
            case "number_cooling_down": return Number_cooling_down;
            case "number_health_blocked": return Number_health_blocked;
            case "provider_failure_backoff": return Provider_failure_backoff;
            case "campaign_daily_limit_reached": return Campaign_daily_limit_reached;
            case "reservation_unavailable": return Reservation_unavailable;
            default: return null;
        }
    }
}
