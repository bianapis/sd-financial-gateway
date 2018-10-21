/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class FinancialGatewayApiController {

	@Autowired
	FinancialGatewayApiService service;
	
	@BQ("inbounds")
	@Operate.ExecutePost
	public BianResponse<InboundBaseWithIdAndRoot> executePostInbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<InboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostInbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Operate.ExecutePut
	public BianResponse<InboundBaseWithIdAndRoot> executePutInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<InboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutInbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePost
	public BianResponse<OutboundBaseWithIdAndRoot> executePostOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OutboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePut
	public BianResponse<OutboundBaseWithIdAndRoot> executePutOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<OutboundBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<FinancialGatewayRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FinancialGatewayRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<RetrieveFinancialGatewayResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("inbounds")
	@Operate.Retrieve
	public BianResponse<InboundBaseWithIdAndRoot> retrieveInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("issues")
	@Operate.Retrieve
	public BianResponse<IssueBaseWithIdAndRoot> retrieveIssues(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssues(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbounds")
	@Operate.Retrieve
	public BianResponse<OutboundBaseWithIdAndRoot> retrieveOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Operate.Retrieve
	public BianResponse<ReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
}
