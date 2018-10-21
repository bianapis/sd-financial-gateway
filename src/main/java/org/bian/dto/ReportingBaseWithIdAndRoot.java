package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReportingBaseWithIdAndRoot
 */
public class ReportingBaseWithIdAndRoot   {
  private String gatewayOperatingSessionReference = null;

  private String gatewayServiceSessionReportReference = null;

  private String gatewayServiceSessionReportType = null;

  private Object gatewayServiceSessionStatistics = null;

  private String gatewayServiceConfigurationParameter = null;

  private Object gatewayServiceSessionReport = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: reference id of the report 
   * @return gatewayServiceSessionReportReference
  **/

  public String getGatewayServiceSessionReportReference() {
    return gatewayServiceSessionReportReference;
  }

  public void setGatewayServiceSessionReportReference(String gatewayServiceSessionReportReference) {
    this.gatewayServiceSessionReportReference = gatewayServiceSessionReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: e.g., realtime status, session statistics 
   * @return gatewayServiceSessionReportType
  **/

  public String getGatewayServiceSessionReportType() {
    return gatewayServiceSessionReportType;
  }

  public void setGatewayServiceSessionReportType(String gatewayServiceSessionReportType) {
    this.gatewayServiceSessionReportType = gatewayServiceSessionReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: maintained service activity statistics 
   * @return gatewayServiceSessionStatistics
  **/

  public Object getGatewayServiceSessionStatistics() {
    return gatewayServiceSessionStatistics;
  }

  public void setGatewayServiceSessionStatistics(Object gatewayServiceSessionStatistics) {
    this.gatewayServiceSessionStatistics = gatewayServiceSessionStatistics;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: the session activity report 
   * @return gatewayServiceSessionReport
  **/

  public Object getGatewayServiceSessionReport() {
    return gatewayServiceSessionReport;
  }

  public void setGatewayServiceSessionReport(Object gatewayServiceSessionReport) {
    this.gatewayServiceSessionReport = gatewayServiceSessionReport;
  }


}

