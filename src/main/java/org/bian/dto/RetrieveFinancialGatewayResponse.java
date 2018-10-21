package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveFinancialGatewayResponse
 */
public class RetrieveFinancialGatewayResponse   {
  private String gatewayOperatingSessionReference = null;

  private String gatewayServiceReference = null;

  private Object gatewayServiceSchedule = null;

  private String gatewayServiceConfigurationParameterType = null;

  private String gatewayServiceConfigurationParameter = null;

  private String gatewayServiceSecurityMechanismType = null;

  private String gatewayServiceSecurityMechanismReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: refers to active EBranch service session 
   * @return gatewayOperatingSessionReference
  **/

  public String getGatewayOperatingSessionReference() {
    return gatewayOperatingSessionReference;
  }

  public void setGatewayOperatingSessionReference(String gatewayOperatingSessionReference) {
    this.gatewayOperatingSessionReference = gatewayOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: refers to the service, e.g., S.W.I.F.T., Telex 
   * @return gatewayServiceReference
  **/

  public String getGatewayServiceReference() {
    return gatewayServiceReference;
  }

  public void setGatewayServiceReference(String gatewayServiceReference) {
    this.gatewayServiceReference = gatewayServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: describes service availability 
   * @return gatewayServiceSchedule
  **/

  public Object getGatewayServiceSchedule() {
    return gatewayServiceSchedule;
  }

  public void setGatewayServiceSchedule(Object gatewayServiceSchedule) {
    this.gatewayServiceSchedule = gatewayServiceSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return gatewayServiceConfigurationParameterType
  **/

  public String getGatewayServiceConfigurationParameterType() {
    return gatewayServiceConfigurationParameterType;
  }

  public void setGatewayServiceConfigurationParameterType(String gatewayServiceConfigurationParameterType) {
    this.gatewayServiceConfigurationParameterType = gatewayServiceConfigurationParameterType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: the setting/value for a service parameter 
   * @return gatewayServiceConfigurationParameter
  **/

  public String getGatewayServiceConfigurationParameter() {
    return gatewayServiceConfigurationParameter;
  }

  public void setGatewayServiceConfigurationParameter(String gatewayServiceConfigurationParameter) {
    this.gatewayServiceConfigurationParameter = gatewayServiceConfigurationParameter;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return gatewayServiceSecurityMechanismType
  **/

  public String getGatewayServiceSecurityMechanismType() {
    return gatewayServiceSecurityMechanismType;
  }

  public void setGatewayServiceSecurityMechanismType(String gatewayServiceSecurityMechanismType) {
    this.gatewayServiceSecurityMechanismType = gatewayServiceSecurityMechanismType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return gatewayServiceSecurityMechanismReference
  **/

  public String getGatewayServiceSecurityMechanismReference() {
    return gatewayServiceSecurityMechanismReference;
  }

  public void setGatewayServiceSecurityMechanismReference(String gatewayServiceSecurityMechanismReference) {
    this.gatewayServiceSecurityMechanismReference = gatewayServiceSecurityMechanismReference;
  }


}

