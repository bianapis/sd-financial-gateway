package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OutboundBaseWithIdAndRoot
 */
public class OutboundBaseWithIdAndRoot   {
  private String gatewayServiceReference = null;

  private String gatewayOperatingSessionReference = null;

  private String gatewayOutboundMessageReference = null;

  private String gatewayOutboundMessageType = null;

  private Object gatewayOutboundMessageRecord = null;

  private String gatewayOutboundMessageSender = null;

  private String gatewayOutboundMessageReceiver = null;

  private String gatewayOutboundMessageStatus = null;

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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: outbound connection reference id 
   * @return gatewayOutboundMessageReference
  **/

  public String getGatewayOutboundMessageReference() {
    return gatewayOutboundMessageReference;
  }

  public void setGatewayOutboundMessageReference(String gatewayOutboundMessageReference) {
    this.gatewayOutboundMessageReference = gatewayOutboundMessageReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: message type 
   * @return gatewayOutboundMessageType
  **/

  public String getGatewayOutboundMessageType() {
    return gatewayOutboundMessageType;
  }

  public void setGatewayOutboundMessageType(String gatewayOutboundMessageType) {
    this.gatewayOutboundMessageType = gatewayOutboundMessageType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: message content 
   * @return gatewayOutboundMessageRecord
  **/

  public Object getGatewayOutboundMessageRecord() {
    return gatewayOutboundMessageRecord;
  }

  public void setGatewayOutboundMessageRecord(Object gatewayOutboundMessageRecord) {
    this.gatewayOutboundMessageRecord = gatewayOutboundMessageRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: employee/business unit sending the message 
   * @return gatewayOutboundMessageSender
  **/

  public String getGatewayOutboundMessageSender() {
    return gatewayOutboundMessageSender;
  }

  public void setGatewayOutboundMessageSender(String gatewayOutboundMessageSender) {
    this.gatewayOutboundMessageSender = gatewayOutboundMessageSender;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: Message addressee 
   * @return gatewayOutboundMessageReceiver
  **/

  public String getGatewayOutboundMessageReceiver() {
    return gatewayOutboundMessageReceiver;
  }

  public void setGatewayOutboundMessageReceiver(String gatewayOutboundMessageReceiver) {
    this.gatewayOutboundMessageReceiver = gatewayOutboundMessageReceiver;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: e.g., pending, delivered, possible duplicate, error 
   * @return gatewayOutboundMessageStatus
  **/

  public String getGatewayOutboundMessageStatus() {
    return gatewayOutboundMessageStatus;
  }

  public void setGatewayOutboundMessageStatus(String gatewayOutboundMessageStatus) {
    this.gatewayOutboundMessageStatus = gatewayOutboundMessageStatus;
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

