//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.30 at 12:29:52 PM EEST 
//


package com.mg.mgclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SWWSMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SWWSMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HelloWorld"/&gt;
 *     &lt;enumeration value="GetTransfer"/&gt;
 *     &lt;enumeration value="GetTransferState"/&gt;
 *     &lt;enumeration value="CalcComission"/&gt;
 *     &lt;enumeration value="SendRequest"/&gt;
 *     &lt;enumeration value="SendConfirm"/&gt;
 *     &lt;enumeration value="SendCancel"/&gt;
 *     &lt;enumeration value="SendEdit"/&gt;
 *     &lt;enumeration value="SendEditCancel"/&gt;
 *     &lt;enumeration value="SendEditConfirm"/&gt;
 *     &lt;enumeration value="CancelRequest"/&gt;
 *     &lt;enumeration value="CancelReject"/&gt;
 *     &lt;enumeration value="CancelConfirm"/&gt;
 *     &lt;enumeration value="ReturnRequest"/&gt;
 *     &lt;enumeration value="ReturnConfirm"/&gt;
 *     &lt;enumeration value="ReturnCancel"/&gt;
 *     &lt;enumeration value="PayoutRequest"/&gt;
 *     &lt;enumeration value="PayoutConfirm"/&gt;
 *     &lt;enumeration value="PayoutCancel"/&gt;
 *     &lt;enumeration value="GetCityByCountry"/&gt;
 *     &lt;enumeration value="GetCurrencies"/&gt;
 *     &lt;enumeration value="GetDocumentTypeList"/&gt;
 *     &lt;enumeration value="GetCountries"/&gt;
 *     &lt;enumeration value="GetDeliveryOptions"/&gt;
 *     &lt;enumeration value="GetFeatures"/&gt;
 *     &lt;enumeration value="GetDirections"/&gt;
 *     &lt;enumeration value="GetStates"/&gt;
 *     &lt;enumeration value="GetPoints"/&gt;
 *     &lt;enumeration value="GetPointTree"/&gt;
 *     &lt;enumeration value="GetUsersOfPoint"/&gt;
 *     &lt;enumeration value="AddUser"/&gt;
 *     &lt;enumeration value="UpdateUser"/&gt;
 *     &lt;enumeration value="ChangePassword"/&gt;
 *     &lt;enumeration value="GetOfflineTaskList"/&gt;
 *     &lt;enumeration value="GetOfflineReport"/&gt;
 *     &lt;enumeration value="CancelOfflineReport"/&gt;
 *     &lt;enumeration value="TransactionDetailReport"/&gt;
 *     &lt;enumeration value="ExecOperation"/&gt;
 *     &lt;enumeration value="DirectSaveRegistration"/&gt;
 *     &lt;enumeration value="GetReceiverRegistrationInfo"/&gt;
 *     &lt;enumeration value="GetCRNByNames"/&gt;
 *     &lt;enumeration value="GetClientTransfers"/&gt;
 *     &lt;enumeration value="BlackListCancel"/&gt;
 *     &lt;enumeration value="BlackListConfirm"/&gt;
 *     &lt;enumeration value="Block"/&gt;
 *     &lt;enumeration value="Unblock"/&gt;
 *     &lt;enumeration value="ReturnBlocked"/&gt;
 *     &lt;enumeration value="ReturnWithFeeRequest"/&gt;
 *     &lt;enumeration value="CheckCash2Card"/&gt;
 *     &lt;enumeration value="ForcePayout"/&gt;
 *     &lt;enumeration value="GetUserLoyaltyInfo"/&gt;
 *     &lt;enumeration value="LoyaltyLoginUser"/&gt;
 *     &lt;enumeration value="LoyaltyGetActionCondition"/&gt;
 *     &lt;enumeration value="LoyaltyGetLoyaOperation"/&gt;
 *     &lt;enumeration value="LoyaltyGetLoyaOutOperation"/&gt;
 *     &lt;enumeration value="LoyaltyGetLoyaTemplate"/&gt;
 *     &lt;enumeration value="LoyaltyCreateLoyaOutOperation"/&gt;
 *     &lt;enumeration value="LoyaltyRegisterUser"/&gt;
 *     &lt;enumeration value="LoyaltyUpdateUser"/&gt;
 *     &lt;enumeration value="LoyaltyChangePassword"/&gt;
 *     &lt;enumeration value="LoyaltyJoinUser"/&gt;
 *     &lt;enumeration value="LoyaltyLostPassword"/&gt;
 *     &lt;enumeration value="GetPanEligibilityForm"/&gt;
 *     &lt;enumeration value="GetCardInfo"/&gt;
 *     &lt;enumeration value="RegisterDeviceRequest"/&gt;
 *     &lt;enumeration value="RegisterDeviceConfirm"/&gt;
 *     &lt;enumeration value="AuthenticateRequest"/&gt;
 *     &lt;enumeration value="SendNotice"/&gt;
 *     &lt;enumeration value="GetNotices"/&gt;
 *     &lt;enumeration value="GetPointsForBankDeposit"/&gt;
 *     &lt;enumeration value="AddPoint"/&gt;
 *     &lt;enumeration value="DecryptTicketFromUrl"/&gt;
 *     &lt;enumeration value="GetPayoutCurrencies"/&gt;
 *     &lt;enumeration value="GetPurposes"/&gt;
 *     &lt;enumeration value="TransactionABSDetailReport"/&gt;
 *     &lt;enumeration value="TransferAutoCancel"/&gt;
 *     &lt;enumeration value="CheckAndRegister4Limit"/&gt;
 *     &lt;enumeration value="UndoRegistration4Limit"/&gt;
 *     &lt;enumeration value="GetExternalSystems"/&gt;
 *     &lt;enumeration value="GetExternalPoints"/&gt;
 *     &lt;enumeration value="GetRestOfLimit"/&gt;
 *     &lt;enumeration value="CheckClientForBlackList"/&gt;
 *     &lt;enumeration value="ProfixReport"/&gt;
 *     &lt;enumeration value="Login"/&gt;
 *     &lt;enumeration value="FindClient"/&gt;
 *     &lt;enumeration value="ClearingReport"/&gt;
 *     &lt;enumeration value="GetRates"/&gt;
 *     &lt;enumeration value="ConfirmOperation"/&gt;
 *     &lt;enumeration value="OWExecOperation"/&gt;
 *     &lt;enumeration value="E9XReport"/&gt;
 *     &lt;enumeration value="RejectTransfer"/&gt;
 *     &lt;enumeration value="F1XReport"/&gt;
 *     &lt;enumeration value="AddPointSW"/&gt;
 *     &lt;enumeration value="GetPointTreeSW"/&gt;
 *     &lt;enumeration value="GetUsersOfPointSW"/&gt;
 *     &lt;enumeration value="GetUserById"/&gt;
 *     &lt;enumeration value="UnlinkUser"/&gt;
 *     &lt;enumeration value="GetPhoneCodes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SWWSMethod")
@XmlEnum
public enum SWWSMethod {

    @XmlEnumValue("HelloWorld")
    HELLO_WORLD("HelloWorld"),
    @XmlEnumValue("GetTransfer")
    GET_TRANSFER("GetTransfer"),
    @XmlEnumValue("GetTransferState")
    GET_TRANSFER_STATE("GetTransferState"),
    @XmlEnumValue("CalcComission")
    CALC_COMISSION("CalcComission"),
    @XmlEnumValue("SendRequest")
    SEND_REQUEST("SendRequest"),
    @XmlEnumValue("SendConfirm")
    SEND_CONFIRM("SendConfirm"),
    @XmlEnumValue("SendCancel")
    SEND_CANCEL("SendCancel"),
    @XmlEnumValue("SendEdit")
    SEND_EDIT("SendEdit"),
    @XmlEnumValue("SendEditCancel")
    SEND_EDIT_CANCEL("SendEditCancel"),
    @XmlEnumValue("SendEditConfirm")
    SEND_EDIT_CONFIRM("SendEditConfirm"),
    @XmlEnumValue("CancelRequest")
    CANCEL_REQUEST("CancelRequest"),
    @XmlEnumValue("CancelReject")
    CANCEL_REJECT("CancelReject"),
    @XmlEnumValue("CancelConfirm")
    CANCEL_CONFIRM("CancelConfirm"),
    @XmlEnumValue("ReturnRequest")
    RETURN_REQUEST("ReturnRequest"),
    @XmlEnumValue("ReturnConfirm")
    RETURN_CONFIRM("ReturnConfirm"),
    @XmlEnumValue("ReturnCancel")
    RETURN_CANCEL("ReturnCancel"),
    @XmlEnumValue("PayoutRequest")
    PAYOUT_REQUEST("PayoutRequest"),
    @XmlEnumValue("PayoutConfirm")
    PAYOUT_CONFIRM("PayoutConfirm"),
    @XmlEnumValue("PayoutCancel")
    PAYOUT_CANCEL("PayoutCancel"),
    @XmlEnumValue("GetCityByCountry")
    GET_CITY_BY_COUNTRY("GetCityByCountry"),
    @XmlEnumValue("GetCurrencies")
    GET_CURRENCIES("GetCurrencies"),
    @XmlEnumValue("GetDocumentTypeList")
    GET_DOCUMENT_TYPE_LIST("GetDocumentTypeList"),
    @XmlEnumValue("GetCountries")
    GET_COUNTRIES("GetCountries"),
    @XmlEnumValue("GetDeliveryOptions")
    GET_DELIVERY_OPTIONS("GetDeliveryOptions"),
    @XmlEnumValue("GetFeatures")
    GET_FEATURES("GetFeatures"),
    @XmlEnumValue("GetDirections")
    GET_DIRECTIONS("GetDirections"),
    @XmlEnumValue("GetStates")
    GET_STATES("GetStates"),
    @XmlEnumValue("GetPoints")
    GET_POINTS("GetPoints"),
    @XmlEnumValue("GetPointTree")
    GET_POINT_TREE("GetPointTree"),
    @XmlEnumValue("GetUsersOfPoint")
    GET_USERS_OF_POINT("GetUsersOfPoint"),
    @XmlEnumValue("AddUser")
    ADD_USER("AddUser"),
    @XmlEnumValue("UpdateUser")
    UPDATE_USER("UpdateUser"),
    @XmlEnumValue("ChangePassword")
    CHANGE_PASSWORD("ChangePassword"),
    @XmlEnumValue("GetOfflineTaskList")
    GET_OFFLINE_TASK_LIST("GetOfflineTaskList"),
    @XmlEnumValue("GetOfflineReport")
    GET_OFFLINE_REPORT("GetOfflineReport"),
    @XmlEnumValue("CancelOfflineReport")
    CANCEL_OFFLINE_REPORT("CancelOfflineReport"),
    @XmlEnumValue("TransactionDetailReport")
    TRANSACTION_DETAIL_REPORT("TransactionDetailReport"),
    @XmlEnumValue("ExecOperation")
    EXEC_OPERATION("ExecOperation"),
    @XmlEnumValue("DirectSaveRegistration")
    DIRECT_SAVE_REGISTRATION("DirectSaveRegistration"),
    @XmlEnumValue("GetReceiverRegistrationInfo")
    GET_RECEIVER_REGISTRATION_INFO("GetReceiverRegistrationInfo"),
    @XmlEnumValue("GetCRNByNames")
    GET_CRN_BY_NAMES("GetCRNByNames"),
    @XmlEnumValue("GetClientTransfers")
    GET_CLIENT_TRANSFERS("GetClientTransfers"),
    @XmlEnumValue("BlackListCancel")
    BLACK_LIST_CANCEL("BlackListCancel"),
    @XmlEnumValue("BlackListConfirm")
    BLACK_LIST_CONFIRM("BlackListConfirm"),
    @XmlEnumValue("Block")
    BLOCK("Block"),
    @XmlEnumValue("Unblock")
    UNBLOCK("Unblock"),
    @XmlEnumValue("ReturnBlocked")
    RETURN_BLOCKED("ReturnBlocked"),
    @XmlEnumValue("ReturnWithFeeRequest")
    RETURN_WITH_FEE_REQUEST("ReturnWithFeeRequest"),
    @XmlEnumValue("CheckCash2Card")
    CHECK_CASH_2_CARD("CheckCash2Card"),
    @XmlEnumValue("ForcePayout")
    FORCE_PAYOUT("ForcePayout"),
    @XmlEnumValue("GetUserLoyaltyInfo")
    GET_USER_LOYALTY_INFO("GetUserLoyaltyInfo"),
    @XmlEnumValue("LoyaltyLoginUser")
    LOYALTY_LOGIN_USER("LoyaltyLoginUser"),
    @XmlEnumValue("LoyaltyGetActionCondition")
    LOYALTY_GET_ACTION_CONDITION("LoyaltyGetActionCondition"),
    @XmlEnumValue("LoyaltyGetLoyaOperation")
    LOYALTY_GET_LOYA_OPERATION("LoyaltyGetLoyaOperation"),
    @XmlEnumValue("LoyaltyGetLoyaOutOperation")
    LOYALTY_GET_LOYA_OUT_OPERATION("LoyaltyGetLoyaOutOperation"),
    @XmlEnumValue("LoyaltyGetLoyaTemplate")
    LOYALTY_GET_LOYA_TEMPLATE("LoyaltyGetLoyaTemplate"),
    @XmlEnumValue("LoyaltyCreateLoyaOutOperation")
    LOYALTY_CREATE_LOYA_OUT_OPERATION("LoyaltyCreateLoyaOutOperation"),
    @XmlEnumValue("LoyaltyRegisterUser")
    LOYALTY_REGISTER_USER("LoyaltyRegisterUser"),
    @XmlEnumValue("LoyaltyUpdateUser")
    LOYALTY_UPDATE_USER("LoyaltyUpdateUser"),
    @XmlEnumValue("LoyaltyChangePassword")
    LOYALTY_CHANGE_PASSWORD("LoyaltyChangePassword"),
    @XmlEnumValue("LoyaltyJoinUser")
    LOYALTY_JOIN_USER("LoyaltyJoinUser"),
    @XmlEnumValue("LoyaltyLostPassword")
    LOYALTY_LOST_PASSWORD("LoyaltyLostPassword"),
    @XmlEnumValue("GetPanEligibilityForm")
    GET_PAN_ELIGIBILITY_FORM("GetPanEligibilityForm"),
    @XmlEnumValue("GetCardInfo")
    GET_CARD_INFO("GetCardInfo"),
    @XmlEnumValue("RegisterDeviceRequest")
    REGISTER_DEVICE_REQUEST("RegisterDeviceRequest"),
    @XmlEnumValue("RegisterDeviceConfirm")
    REGISTER_DEVICE_CONFIRM("RegisterDeviceConfirm"),
    @XmlEnumValue("AuthenticateRequest")
    AUTHENTICATE_REQUEST("AuthenticateRequest"),
    @XmlEnumValue("SendNotice")
    SEND_NOTICE("SendNotice"),
    @XmlEnumValue("GetNotices")
    GET_NOTICES("GetNotices"),
    @XmlEnumValue("GetPointsForBankDeposit")
    GET_POINTS_FOR_BANK_DEPOSIT("GetPointsForBankDeposit"),
    @XmlEnumValue("AddPoint")
    ADD_POINT("AddPoint"),
    @XmlEnumValue("DecryptTicketFromUrl")
    DECRYPT_TICKET_FROM_URL("DecryptTicketFromUrl"),
    @XmlEnumValue("GetPayoutCurrencies")
    GET_PAYOUT_CURRENCIES("GetPayoutCurrencies"),
    @XmlEnumValue("GetPurposes")
    GET_PURPOSES("GetPurposes"),
    @XmlEnumValue("TransactionABSDetailReport")
    TRANSACTION_ABS_DETAIL_REPORT("TransactionABSDetailReport"),
    @XmlEnumValue("TransferAutoCancel")
    TRANSFER_AUTO_CANCEL("TransferAutoCancel"),
    @XmlEnumValue("CheckAndRegister4Limit")
    CHECK_AND_REGISTER_4_LIMIT("CheckAndRegister4Limit"),
    @XmlEnumValue("UndoRegistration4Limit")
    UNDO_REGISTRATION_4_LIMIT("UndoRegistration4Limit"),
    @XmlEnumValue("GetExternalSystems")
    GET_EXTERNAL_SYSTEMS("GetExternalSystems"),
    @XmlEnumValue("GetExternalPoints")
    GET_EXTERNAL_POINTS("GetExternalPoints"),
    @XmlEnumValue("GetRestOfLimit")
    GET_REST_OF_LIMIT("GetRestOfLimit"),
    @XmlEnumValue("CheckClientForBlackList")
    CHECK_CLIENT_FOR_BLACK_LIST("CheckClientForBlackList"),
    @XmlEnumValue("ProfixReport")
    PROFIX_REPORT("ProfixReport"),
    @XmlEnumValue("Login")
    LOGIN("Login"),
    @XmlEnumValue("FindClient")
    FIND_CLIENT("FindClient"),
    @XmlEnumValue("ClearingReport")
    CLEARING_REPORT("ClearingReport"),
    @XmlEnumValue("GetRates")
    GET_RATES("GetRates"),
    @XmlEnumValue("ConfirmOperation")
    CONFIRM_OPERATION("ConfirmOperation"),
    @XmlEnumValue("OWExecOperation")
    OW_EXEC_OPERATION("OWExecOperation"),
    @XmlEnumValue("E9XReport")
    E_9_X_REPORT("E9XReport"),
    @XmlEnumValue("RejectTransfer")
    REJECT_TRANSFER("RejectTransfer"),
    @XmlEnumValue("F1XReport")
    F_1_X_REPORT("F1XReport"),
    @XmlEnumValue("AddPointSW")
    ADD_POINT_SW("AddPointSW"),
    @XmlEnumValue("GetPointTreeSW")
    GET_POINT_TREE_SW("GetPointTreeSW"),
    @XmlEnumValue("GetUsersOfPointSW")
    GET_USERS_OF_POINT_SW("GetUsersOfPointSW"),
    @XmlEnumValue("GetUserById")
    GET_USER_BY_ID("GetUserById"),
    @XmlEnumValue("UnlinkUser")
    UNLINK_USER("UnlinkUser"),
    @XmlEnumValue("GetPhoneCodes")
    GET_PHONE_CODES("GetPhoneCodes");
    private final String value;

    SWWSMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SWWSMethod fromValue(String v) {
        for (SWWSMethod c: SWWSMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}