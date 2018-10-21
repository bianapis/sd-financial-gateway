/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FinancialGatewayApiService {

	InboundBaseWithIdAndRoot executePostInbounds(String crReferenceId, InboundBase request);
	
	InboundBaseWithIdAndRoot executePutInbounds(String crReferenceId, String bqReferenceId, InboundBase request);
	
	OutboundBaseWithIdAndRoot executePostOutbounds(String crReferenceId, OutboundBase request);
	
	OutboundBaseWithIdAndRoot executePutOutbounds(String crReferenceId, String bqReferenceId, OutboundBase request);
	
	FinancialGatewayRecordResponse record(String crReferenceId, FinancialGatewayRecordRequest request);
	
	RetrieveFinancialGatewayResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	InboundBaseWithIdAndRoot retrieveInbounds(String crReferenceId, String bqReferenceId);
	
	IssueBaseWithIdAndRoot retrieveIssues(String crReferenceId, String bqReferenceId);
	
	OutboundBaseWithIdAndRoot retrieveOutbounds(String crReferenceId, String bqReferenceId);
	
	ReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
}
