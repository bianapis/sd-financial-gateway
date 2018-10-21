package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FinancialGatewayConfigureResponse
 */
public class FinancialGatewayConfigureResponse   {
  private String gatewayServiceReference = null;

  private String gatewayOperatingSessionReference = null;

  private Object gatewaySchedule = null;

  private String gatewayServiceConfigurationParameterType = null;

  private String gatewayServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: service reference id 
   * @return gatewayServiceReference
  **/

  public String getGatewayServiceReference() {
    return gatewayServiceReference;
  }

  public void setGatewayServiceReference(String gatewayServiceReference) {
    this.gatewayServiceReference = gatewayServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: active service session reference id 
   * @return gatewayOperatingSessionReference
  **/

  public String getGatewayOperatingSessionReference() {
    return gatewayOperatingSessionReference;
  }

  public void setGatewayOperatingSessionReference(String gatewayOperatingSessionReference) {
    this.gatewayOperatingSessionReference = gatewayOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: describes service availability 
   * @return gatewaySchedule
  **/

  public Object getGatewaySchedule() {
    return gatewaySchedule;
  }

  public void setGatewaySchedule(Object gatewaySchedule) {
    this.gatewaySchedule = gatewaySchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: e.g., security setting, menu options 
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


}

