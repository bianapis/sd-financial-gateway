/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FinancialGatewayApiServiceImpl implements FinancialGatewayApiService {

	public InboundBaseWithIdAndRoot executePostInbounds(String crReferenceId, InboundBase request){
		return JsonReader.read("executePost-InboundBaseWithIdAndRoot.json",new TypeReference<InboundBaseWithIdAndRoot>(){});
	}
	
	public InboundBaseWithIdAndRoot executePutInbounds(String crReferenceId, String bqReferenceId, InboundBase request){
		return JsonReader.read("executePut-InboundBaseWithIdAndRoot.json",new TypeReference<InboundBaseWithIdAndRoot>(){});
	}
	
	public OutboundBaseWithIdAndRoot executePostOutbounds(String crReferenceId, OutboundBase request){
		return JsonReader.read("executePost-OutboundBaseWithIdAndRoot.json",new TypeReference<OutboundBaseWithIdAndRoot>(){});
	}
	
	public OutboundBaseWithIdAndRoot executePutOutbounds(String crReferenceId, String bqReferenceId, OutboundBase request){
		return JsonReader.read("executePut-OutboundBaseWithIdAndRoot.json",new TypeReference<OutboundBaseWithIdAndRoot>(){});
	}
	
	public FinancialGatewayRecordResponse record(String crReferenceId, FinancialGatewayRecordRequest request){
		return JsonReader.read("record-FinancialGatewayRecordResponse.json",new TypeReference<FinancialGatewayRecordResponse>(){});
	}
	
	public RetrieveFinancialGatewayResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveFinancialGatewayResponse.json",new TypeReference<RetrieveFinancialGatewayResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public InboundBaseWithIdAndRoot retrieveInbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-InboundBaseWithIdAndRoot.json",new TypeReference<InboundBaseWithIdAndRoot>(){});
	}
	
	public IssueBaseWithIdAndRoot retrieveIssues(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IssueBaseWithIdAndRoot.json",new TypeReference<IssueBaseWithIdAndRoot>(){});
	}
	
	public OutboundBaseWithIdAndRoot retrieveOutbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OutboundBaseWithIdAndRoot.json",new TypeReference<OutboundBaseWithIdAndRoot>(){});
	}
	
	public ReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingBaseWithIdAndRoot.json",new TypeReference<ReportingBaseWithIdAndRoot>(){});
	}
	
}
