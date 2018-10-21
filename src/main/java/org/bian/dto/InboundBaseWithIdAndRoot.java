package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * InboundBaseWithIdAndRoot
 */
public class InboundBaseWithIdAndRoot   {
  private String gatewayServiceReference = null;

  private String gatewayOperatingSessionReference = null;

  private String gatewayInboundMessageReference = null;

  private String gatewayInboundMessageType = null;

  private Object gatewayInboundMessageRecord = null;

  private String gatewayInboundMessageReceiver = null;

  private String gatewayInboundMessageStatus = null;

  private Object gatewayServiceSessionStatistics = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: inbound connection reference id 
   * @return gatewayInboundMessageReference
  **/

  public String getGatewayInboundMessageReference() {
    return gatewayInboundMessageReference;
  }

  public void setGatewayInboundMessageReference(String gatewayInboundMessageReference) {
    this.gatewayInboundMessageReference = gatewayInboundMessageReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: message type 
   * @return gatewayInboundMessageType
  **/

  public String getGatewayInboundMessageType() {
    return gatewayInboundMessageType;
  }

  public void setGatewayInboundMessageType(String gatewayInboundMessageType) {
    this.gatewayInboundMessageType = gatewayInboundMessageType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: message content 
   * @return gatewayInboundMessageRecord
  **/

  public Object getGatewayInboundMessageRecord() {
    return gatewayInboundMessageRecord;
  }

  public void setGatewayInboundMessageRecord(Object gatewayInboundMessageRecord) {
    this.gatewayInboundMessageRecord = gatewayInboundMessageRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: employee/business unit addressed by the message 
   * @return gatewayInboundMessageReceiver
  **/

  public String getGatewayInboundMessageReceiver() {
    return gatewayInboundMessageReceiver;
  }

  public void setGatewayInboundMessageReceiver(String gatewayInboundMessageReceiver) {
    this.gatewayInboundMessageReceiver = gatewayInboundMessageReceiver;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: e.g., pending, delivered, possible duplicate, error 
   * @return gatewayInboundMessageStatus
  **/

  public String getGatewayInboundMessageStatus() {
    return gatewayInboundMessageStatus;
  }

  public void setGatewayInboundMessageStatus(String gatewayInboundMessageStatus) {
    this.gatewayInboundMessageStatus = gatewayInboundMessageStatus;
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


}

