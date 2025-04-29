package com.cloudframe.app.ar640010.dto;

/**
*  The class ResponseParms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResponseParms1000 extends ResponseParms1000Serialized {
   

						private char[] functionResponse1000 = new char[4];

								private int requestNbr1000;

						private char[] responseDsn1000 = new char[44];

								private int bulkFilesAvail1000;

						private char[] allocUnitType1000 = new char[1];

								private int allocUnitsUsed1000;

						private char[] recfm1000 = new char[3];

								private int lrecl1000;

								private int blksz1000;

								private int recordCopyCnt1000;

								private int broadcastEndpts1000;

								private int broadcastErrors1000;

						private char[] responseMessage1000 = new char[50];
				private ResponseMessage1000Redefined responseMessage1000Redefined = new ResponseMessage1000Redefined();

						private char[] applProcDate1000 = new char[10];

						private char[] applProcDateJul1000 = new char[3];

						private char[] responseBusPrtnrId1000 = new char[6];

						private char[] responseIca1000 = Field.fillLowValue(6);

						private char[] responseTknname1000 = new char[128];

						private char[] responseGftDsnFail1000 = new char[44];
	
	/**
	* Constructor for ResponseParms1000
	**/
    public ResponseParms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			responseMessage1000Redefined.setParent(this,getStartOffset() + 85);
	   	/*  end of offset */
								setFunctionResponse1000(("0000").toCharArray());
								setRequestNbr1000(0);
								setResponseDsn1000(fillSpace(44));
								setBulkFilesAvail1000(0);
								setAllocUnitType1000(fillSpace(1));
								setAllocUnitsUsed1000(0);
								setRecfm1000(fillSpace(3));
								setLrecl1000(0);
								setBlksz1000(0);
								setRecordCopyCnt1000(0);
								setBroadcastEndpts1000(0);
								setBroadcastErrors1000(0);
								setResponseMessage1000(fillSpace(50));
								setApplProcDate1000(fillSpace(10));
								setApplProcDateJul1000(fillSpace(3));
								setResponseBusPrtnrId1000(fillSpace(6));
								setResponseTknname1000(pad(128," ".toCharArray(),' ',RIGHT_PAD));
								setResponseGftDsnFail1000(fillSpace(44));
    }


 

	/**
	 *	Returns the value of functionResponse1000
	 *	@return functionResponse1000
	 */
   public char[] getFunctionResponse1000() throws CFException{
     if (isFunctionResponse1000Modified()) { 
        functionResponse1000 = refreshFunctionResponse1000();
     }
   		return functionResponse1000;
   }

  
	/**
	*  set variable functionResponse1000
	*  Corresponding COBOL Variable is 1000-FUNCTION-RESPONSE
	*  @param value
	**/
   public void setFunctionResponse1000(char[] value) {
      functionResponse1000 = checkFunctionResponse1000Constraints(value);
      serializeFunctionResponse1000(functionResponse1000);
   } 

     /**
	 * 	Update FunctionResponse1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionResponse1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionResponse1000,functionResponse1000.length);
   	
   }
   
   public void setFunctionResponse1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionResponse1000,functionResponse1000.length);
   	
   }
   
     /**
	 * 	Update FunctionResponse1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionResponse1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionResponse1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionResponse1000 with another Field
	 *	@param value
	 */
   public void setFunctionResponse1000(Field source) {
       replace(source,0,source.length(),beginFunctionResponse1000,FUNCTION_RESPONSE_1000_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionResponse1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionResponse1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionResponse1000,FUNCTION_RESPONSE_1000_LEN);
   	
   }
   
     /**
	 * 	Update FunctionResponse1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionResponse1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionResponse1000+targetIndex,targetLen);
    
   }
	char[] requestSuccessful88100088Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isRequestSuccessful881000()
	 *	@return  Returns true if isRequestSuccessful881000() is "0000"
	 */
   public boolean isRequestSuccessful881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , requestSuccessful88100088Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setRequestSuccessful881000True() {  			
    	setFunctionResponse1000( requestSuccessful88100088Value);
   	}
	
	/**
	 *	Test condition "0001" THRU "0099" for isRequestWarning881000()
	 *	@return  Returns true if isRequestWarning881000() is "0001" THRU "0099"
	 */
   public boolean isRequestWarning881000() throws CFException {
      return (  isGreaterOrEqual(getFunctionResponse1000(), "0001" ) &&  isLessOrEqual(getFunctionResponse1000(),"99" )  );
   }


	/**
	*  set values "0001" THRU "0099"
	*/
   	public void setRequestWarning881000True() {  			
    	setFunctionResponse1000( "0001".toCharArray());
   	}
	char[] ftssEndpointRepeat88100088Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isFtssEndpointRepeat881000()
	 *	@return  Returns true if isFtssEndpointRepeat881000() is "0001"
	 */
   public boolean isFtssEndpointRepeat881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , ftssEndpointRepeat88100088Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setFtssEndpointRepeat881000True() {  			
    	setFunctionResponse1000( ftssEndpointRepeat88100088Value);
   	}
	char[] bulkEndpointNone88100088Value = "0020".toCharArray();
	/**
	 *	Test condition "0020" for isBulkEndpointNone881000()
	 *	@return  Returns true if isBulkEndpointNone881000() is "0020"
	 */
   public boolean isBulkEndpointNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkEndpointNone88100088Value)  == 0  );
   }


	/**
	*  set values "0020"
	*/
   	public void setBulkEndpointNone881000True() {  			
    	setFunctionResponse1000( bulkEndpointNone88100088Value);
   	}
	char[] bulkEndpointSome88100088Value = "0021".toCharArray();
	/**
	 *	Test condition "0021" for isBulkEndpointSome881000()
	 *	@return  Returns true if isBulkEndpointSome881000() is "0021"
	 */
   public boolean isBulkEndpointSome881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkEndpointSome88100088Value)  == 0  );
   }


	/**
	*  set values "0021"
	*/
   	public void setBulkEndpointSome881000True() {  			
    	setFunctionResponse1000( bulkEndpointSome88100088Value);
   	}
	char[] bulkEndpointDupe88100088Value = "0022".toCharArray();
	/**
	 *	Test condition "0022" for isBulkEndpointDupe881000()
	 *	@return  Returns true if isBulkEndpointDupe881000() is "0022"
	 */
   public boolean isBulkEndpointDupe881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkEndpointDupe88100088Value)  == 0  );
   }


	/**
	*  set values "0022"
	*/
   	public void setBulkEndpointDupe881000True() {  			
    	setFunctionResponse1000( bulkEndpointDupe88100088Value);
   	}
	char[] bulkEndpointEmpty88100088Value = "0023".toCharArray();
	/**
	 *	Test condition "0023" for isBulkEndpointEmpty881000()
	 *	@return  Returns true if isBulkEndpointEmpty881000() is "0023"
	 */
   public boolean isBulkEndpointEmpty881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkEndpointEmpty88100088Value)  == 0  );
   }


	/**
	*  set values "0023"
	*/
   	public void setBulkEndpointEmpty881000True() {  			
    	setFunctionResponse1000( bulkEndpointEmpty88100088Value);
   	}
	char[] listEndpointNone88100088Value = "0040".toCharArray();
	/**
	 *	Test condition "0040" for isListEndpointNone881000()
	 *	@return  Returns true if isListEndpointNone881000() is "0040"
	 */
   public boolean isListEndpointNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listEndpointNone88100088Value)  == 0  );
   }


	/**
	*  set values "0040"
	*/
   	public void setListEndpointNone881000True() {  			
    	setFunctionResponse1000( listEndpointNone88100088Value);
   	}
	char[] listEndpointSome88100088Value = "0041".toCharArray();
	/**
	 *	Test condition "0041" for isListEndpointSome881000()
	 *	@return  Returns true if isListEndpointSome881000() is "0041"
	 */
   public boolean isListEndpointSome881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listEndpointSome88100088Value)  == 0  );
   }


	/**
	*  set values "0041"
	*/
   	public void setListEndpointSome881000True() {  			
    	setFunctionResponse1000( listEndpointSome88100088Value);
   	}
	char[] listEndpointDupe88100088Value = "0042".toCharArray();
	/**
	 *	Test condition "0042" for isListEndpointDupe881000()
	 *	@return  Returns true if isListEndpointDupe881000() is "0042"
	 */
   public boolean isListEndpointDupe881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listEndpointDupe88100088Value)  == 0  );
   }


	/**
	*  set values "0042"
	*/
   	public void setListEndpointDupe881000True() {  			
    	setFunctionResponse1000( listEndpointDupe88100088Value);
   	}
	char[] listEndpointEmpty88100088Value = "0043".toCharArray();
	/**
	 *	Test condition "0043" for isListEndpointEmpty881000()
	 *	@return  Returns true if isListEndpointEmpty881000() is "0043"
	 */
   public boolean isListEndpointEmpty881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listEndpointEmpty88100088Value)  == 0  );
   }


	/**
	*  set values "0043"
	*/
   	public void setListEndpointEmpty881000True() {  			
    	setFunctionResponse1000( listEndpointEmpty88100088Value);
   	}
	char[] retrieveNoInbound88100088Value = "0050".toCharArray();
	/**
	 *	Test condition "0050" for isRetrieveNoInbound881000()
	 *	@return  Returns true if isRetrieveNoInbound881000() is "0050"
	 */
   public boolean isRetrieveNoInbound881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrieveNoInbound88100088Value)  == 0  );
   }


	/**
	*  set values "0050"
	*/
   	public void setRetrieveNoInbound881000True() {  			
    	setFunctionResponse1000( retrieveNoInbound88100088Value);
   	}
	char[] resetNotRequired88100088Value = "0070".toCharArray();
	/**
	 *	Test condition "0070" for isResetNotRequired881000()
	 *	@return  Returns true if isResetNotRequired881000() is "0070"
	 */
   public boolean isResetNotRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , resetNotRequired88100088Value)  == 0  );
   }


	/**
	*  set values "0070"
	*/
   	public void setResetNotRequired881000True() {  			
    	setFunctionResponse1000( resetNotRequired88100088Value);
   	}
	
	/**
	 *	Test condition "0100" THRU "9999" for isRequestFailed881000()
	 *	@return  Returns true if isRequestFailed881000() is "0100" THRU "9999"
	 */
   public boolean isRequestFailed881000() throws CFException {
      return (  isGreaterOrEqual(getFunctionResponse1000(), "0100" ) &&  isLessOrEqual(getFunctionResponse1000(),"9999" )  );
   }


	/**
	*  set values "0100" THRU "9999"
	*/
   	public void setRequestFailed881000True() {  			
    	setFunctionResponse1000( "0100".toCharArray());
   	}
	char[] addCopyApplAlloc88100088Value = "0100".toCharArray();
	/**
	 *	Test condition "0100" for isAddCopyApplAlloc881000()
	 *	@return  Returns true if isAddCopyApplAlloc881000() is "0100"
	 */
   public boolean isAddCopyApplAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0100"
	*/
   	public void setAddCopyApplAlloc881000True() {  			
    	setFunctionResponse1000( addCopyApplAlloc88100088Value);
   	}
	char[] addCopyApplOpen88100088Value = "0101".toCharArray();
	/**
	 *	Test condition "0101" for isAddCopyApplOpen881000()
	 *	@return  Returns true if isAddCopyApplOpen881000() is "0101"
	 */
   public boolean isAddCopyApplOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0101"
	*/
   	public void setAddCopyApplOpen881000True() {  			
    	setFunctionResponse1000( addCopyApplOpen88100088Value);
   	}
	char[] addCopyApplRead88100088Value = "0102".toCharArray();
	/**
	 *	Test condition "0102" for isAddCopyApplRead881000()
	 *	@return  Returns true if isAddCopyApplRead881000() is "0102"
	 */
   public boolean isAddCopyApplRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplRead88100088Value)  == 0  );
   }


	/**
	*  set values "0102"
	*/
   	public void setAddCopyApplRead881000True() {  			
    	setFunctionResponse1000( addCopyApplRead88100088Value);
   	}
	char[] addCopyApplClose88100088Value = "0103".toCharArray();
	/**
	 *	Test condition "0103" for isAddCopyApplClose881000()
	 *	@return  Returns true if isAddCopyApplClose881000() is "0103"
	 */
   public boolean isAddCopyApplClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplClose88100088Value)  == 0  );
   }


	/**
	*  set values "0103"
	*/
   	public void setAddCopyApplClose881000True() {  			
    	setFunctionResponse1000( addCopyApplClose88100088Value);
   	}
	char[] addCopyApplUnall88100088Value = "0104".toCharArray();
	/**
	 *	Test condition "0104" for isAddCopyApplUnall881000()
	 *	@return  Returns true if isAddCopyApplUnall881000() is "0104"
	 */
   public boolean isAddCopyApplUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0104"
	*/
   	public void setAddCopyApplUnall881000True() {  			
    	setFunctionResponse1000( addCopyApplUnall88100088Value);
   	}
	char[] addCopyApplDltalc88100088Value = "0105".toCharArray();
	/**
	 *	Test condition "0105" for isAddCopyApplDltalc881000()
	 *	@return  Returns true if isAddCopyApplDltalc881000() is "0105"
	 */
   public boolean isAddCopyApplDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0105"
	*/
   	public void setAddCopyApplDltalc881000True() {  			
    	setFunctionResponse1000( addCopyApplDltalc88100088Value);
   	}
	char[] addCopyApplDltopn88100088Value = "0106".toCharArray();
	/**
	 *	Test condition "0106" for isAddCopyApplDltopn881000()
	 *	@return  Returns true if isAddCopyApplDltopn881000() is "0106"
	 */
   public boolean isAddCopyApplDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0106"
	*/
   	public void setAddCopyApplDltopn881000True() {  			
    	setFunctionResponse1000( addCopyApplDltopn88100088Value);
   	}
	char[] addCopyApplDltcls88100088Value = "0107".toCharArray();
	/**
	 *	Test condition "0107" for isAddCopyApplDltcls881000()
	 *	@return  Returns true if isAddCopyApplDltcls881000() is "0107"
	 */
   public boolean isAddCopyApplDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0107"
	*/
   	public void setAddCopyApplDltcls881000True() {  			
    	setFunctionResponse1000( addCopyApplDltcls88100088Value);
   	}
	char[] addCopyApplInUse88100088Value = "0108".toCharArray();
	/**
	 *	Test condition "0108" for isAddCopyApplInUse881000()
	 *	@return  Returns true if isAddCopyApplInUse881000() is "0108"
	 */
   public boolean isAddCopyApplInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0108"
	*/
   	public void setAddCopyApplInUse881000True() {  			
    	setFunctionResponse1000( addCopyApplInUse88100088Value);
   	}
	char[] addCopyApplCounts88100088Value = "0109".toCharArray();
	/**
	 *	Test condition "0109" for isAddCopyApplCounts881000()
	 *	@return  Returns true if isAddCopyApplCounts881000() is "0109"
	 */
   public boolean isAddCopyApplCounts881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyApplCounts88100088Value)  == 0  );
   }


	/**
	*  set values "0109"
	*/
   	public void setAddCopyApplCounts881000True() {  			
    	setFunctionResponse1000( addCopyApplCounts88100088Value);
   	}
	char[] addCopyGftAlloc88100088Value = "0110".toCharArray();
	/**
	 *	Test condition "0110" for isAddCopyGftAlloc881000()
	 *	@return  Returns true if isAddCopyGftAlloc881000() is "0110"
	 */
   public boolean isAddCopyGftAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0110"
	*/
   	public void setAddCopyGftAlloc881000True() {  			
    	setFunctionResponse1000( addCopyGftAlloc88100088Value);
   	}
	char[] addCopyGftOpen88100088Value = "0111".toCharArray();
	/**
	 *	Test condition "0111" for isAddCopyGftOpen881000()
	 *	@return  Returns true if isAddCopyGftOpen881000() is "0111"
	 */
   public boolean isAddCopyGftOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0111"
	*/
   	public void setAddCopyGftOpen881000True() {  			
    	setFunctionResponse1000( addCopyGftOpen88100088Value);
   	}
	char[] addCopyGftWrite88100088Value = "0112".toCharArray();
	/**
	 *	Test condition "0112" for isAddCopyGftWrite881000()
	 *	@return  Returns true if isAddCopyGftWrite881000() is "0112"
	 */
   public boolean isAddCopyGftWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0112"
	*/
   	public void setAddCopyGftWrite881000True() {  			
    	setFunctionResponse1000( addCopyGftWrite88100088Value);
   	}
	char[] addCopyGftClose88100088Value = "0113".toCharArray();
	/**
	 *	Test condition "0113" for isAddCopyGftClose881000()
	 *	@return  Returns true if isAddCopyGftClose881000() is "0113"
	 */
   public boolean isAddCopyGftClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftClose88100088Value)  == 0  );
   }


	/**
	*  set values "0113"
	*/
   	public void setAddCopyGftClose881000True() {  			
    	setFunctionResponse1000( addCopyGftClose88100088Value);
   	}
	char[] addCopyGftUnall88100088Value = "0114".toCharArray();
	/**
	 *	Test condition "0114" for isAddCopyGftUnall881000()
	 *	@return  Returns true if isAddCopyGftUnall881000() is "0114"
	 */
   public boolean isAddCopyGftUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0114"
	*/
   	public void setAddCopyGftUnall881000True() {  			
    	setFunctionResponse1000( addCopyGftUnall88100088Value);
   	}
	char[] addCopyGftDltalc88100088Value = "0115".toCharArray();
	/**
	 *	Test condition "0115" for isAddCopyGftDltalc881000()
	 *	@return  Returns true if isAddCopyGftDltalc881000() is "0115"
	 */
   public boolean isAddCopyGftDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0115"
	*/
   	public void setAddCopyGftDltalc881000True() {  			
    	setFunctionResponse1000( addCopyGftDltalc88100088Value);
   	}
	char[] addCopyGftDltopn88100088Value = "0116".toCharArray();
	/**
	 *	Test condition "0116" for isAddCopyGftDltopn881000()
	 *	@return  Returns true if isAddCopyGftDltopn881000() is "0116"
	 */
   public boolean isAddCopyGftDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0116"
	*/
   	public void setAddCopyGftDltopn881000True() {  			
    	setFunctionResponse1000( addCopyGftDltopn88100088Value);
   	}
	char[] addCopyGftDltcls88100088Value = "0117".toCharArray();
	/**
	 *	Test condition "0117" for isAddCopyGftDltcls881000()
	 *	@return  Returns true if isAddCopyGftDltcls881000() is "0117"
	 */
   public boolean isAddCopyGftDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0117"
	*/
   	public void setAddCopyGftDltcls881000True() {  			
    	setFunctionResponse1000( addCopyGftDltcls88100088Value);
   	}
	char[] addCopyGftInUse88100088Value = "0118".toCharArray();
	/**
	 *	Test condition "0118" for isAddCopyGftInUse881000()
	 *	@return  Returns true if isAddCopyGftInUse881000() is "0118"
	 */
   public boolean isAddCopyGftInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0118"
	*/
   	public void setAddCopyGftInUse881000True() {  			
    	setFunctionResponse1000( addCopyGftInUse88100088Value);
   	}
	char[] addCopyGftNone88100088Value = "0119".toCharArray();
	/**
	 *	Test condition "0119" for isAddCopyGftNone881000()
	 *	@return  Returns true if isAddCopyGftNone881000() is "0119"
	 */
   public boolean isAddCopyGftNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addCopyGftNone88100088Value)  == 0  );
   }


	/**
	*  set values "0119"
	*/
   	public void setAddCopyGftNone881000True() {  			
    	setFunctionResponse1000( addCopyGftNone88100088Value);
   	}
	char[] addPrcsXferInsert88100088Value = "0120".toCharArray();
	/**
	 *	Test condition "0120" for isAddPrcsXferInsert881000()
	 *	@return  Returns true if isAddPrcsXferInsert881000() is "0120"
	 */
   public boolean isAddPrcsXferInsert881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addPrcsXferInsert88100088Value)  == 0  );
   }


	/**
	*  set values "0120"
	*/
   	public void setAddPrcsXferInsert881000True() {  			
    	setFunctionResponse1000( addPrcsXferInsert88100088Value);
   	}
	char[] addPrcsEfpoNotfnd88100088Value = "0121".toCharArray();
	/**
	 *	Test condition "0121" for isAddPrcsEfpoNotfnd881000()
	 *	@return  Returns true if isAddPrcsEfpoNotfnd881000() is "0121"
	 */
   public boolean isAddPrcsEfpoNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addPrcsEfpoNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0121"
	*/
   	public void setAddPrcsEfpoNotfnd881000True() {  			
    	setFunctionResponse1000( addPrcsEfpoNotfnd88100088Value);
   	}
	char[] addPrcsEfpoSelect88100088Value = "0122".toCharArray();
	/**
	 *	Test condition "0122" for isAddPrcsEfpoSelect881000()
	 *	@return  Returns true if isAddPrcsEfpoSelect881000() is "0122"
	 */
   public boolean isAddPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , addPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0122"
	*/
   	public void setAddPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( addPrcsEfpoSelect88100088Value);
   	}
	char[] bulkCopyApplAlloc88100088Value = "0200".toCharArray();
	/**
	 *	Test condition "0200" for isBulkCopyApplAlloc881000()
	 *	@return  Returns true if isBulkCopyApplAlloc881000() is "0200"
	 */
   public boolean isBulkCopyApplAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0200"
	*/
   	public void setBulkCopyApplAlloc881000True() {  			
    	setFunctionResponse1000( bulkCopyApplAlloc88100088Value);
   	}
	char[] bulkCopyApplOpen88100088Value = "0201".toCharArray();
	/**
	 *	Test condition "0201" for isBulkCopyApplOpen881000()
	 *	@return  Returns true if isBulkCopyApplOpen881000() is "0201"
	 */
   public boolean isBulkCopyApplOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0201"
	*/
   	public void setBulkCopyApplOpen881000True() {  			
    	setFunctionResponse1000( bulkCopyApplOpen88100088Value);
   	}
	char[] bulkCopyApplRead88100088Value = "0202".toCharArray();
	/**
	 *	Test condition "0202" for isBulkCopyApplRead881000()
	 *	@return  Returns true if isBulkCopyApplRead881000() is "0202"
	 */
   public boolean isBulkCopyApplRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplRead88100088Value)  == 0  );
   }


	/**
	*  set values "0202"
	*/
   	public void setBulkCopyApplRead881000True() {  			
    	setFunctionResponse1000( bulkCopyApplRead88100088Value);
   	}
	char[] bulkCopyApplClose88100088Value = "0203".toCharArray();
	/**
	 *	Test condition "0203" for isBulkCopyApplClose881000()
	 *	@return  Returns true if isBulkCopyApplClose881000() is "0203"
	 */
   public boolean isBulkCopyApplClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplClose88100088Value)  == 0  );
   }


	/**
	*  set values "0203"
	*/
   	public void setBulkCopyApplClose881000True() {  			
    	setFunctionResponse1000( bulkCopyApplClose88100088Value);
   	}
	char[] bulkCopyApplUnall88100088Value = "0204".toCharArray();
	/**
	 *	Test condition "0204" for isBulkCopyApplUnall881000()
	 *	@return  Returns true if isBulkCopyApplUnall881000() is "0204"
	 */
   public boolean isBulkCopyApplUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0204"
	*/
   	public void setBulkCopyApplUnall881000True() {  			
    	setFunctionResponse1000( bulkCopyApplUnall88100088Value);
   	}
	char[] bulkCopyApplDltalc88100088Value = "0205".toCharArray();
	/**
	 *	Test condition "0205" for isBulkCopyApplDltalc881000()
	 *	@return  Returns true if isBulkCopyApplDltalc881000() is "0205"
	 */
   public boolean isBulkCopyApplDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0205"
	*/
   	public void setBulkCopyApplDltalc881000True() {  			
    	setFunctionResponse1000( bulkCopyApplDltalc88100088Value);
   	}
	char[] bulkCopyApplDltopn88100088Value = "0206".toCharArray();
	/**
	 *	Test condition "0206" for isBulkCopyApplDltopn881000()
	 *	@return  Returns true if isBulkCopyApplDltopn881000() is "0206"
	 */
   public boolean isBulkCopyApplDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0206"
	*/
   	public void setBulkCopyApplDltopn881000True() {  			
    	setFunctionResponse1000( bulkCopyApplDltopn88100088Value);
   	}
	char[] bulkCopyApplDltcls88100088Value = "0207".toCharArray();
	/**
	 *	Test condition "0207" for isBulkCopyApplDltcls881000()
	 *	@return  Returns true if isBulkCopyApplDltcls881000() is "0207"
	 */
   public boolean isBulkCopyApplDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0207"
	*/
   	public void setBulkCopyApplDltcls881000True() {  			
    	setFunctionResponse1000( bulkCopyApplDltcls88100088Value);
   	}
	char[] bulkCopyApplInUse88100088Value = "0208".toCharArray();
	/**
	 *	Test condition "0208" for isBulkCopyApplInUse881000()
	 *	@return  Returns true if isBulkCopyApplInUse881000() is "0208"
	 */
   public boolean isBulkCopyApplInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0208"
	*/
   	public void setBulkCopyApplInUse881000True() {  			
    	setFunctionResponse1000( bulkCopyApplInUse88100088Value);
   	}
	char[] bulkCopyApplCounts88100088Value = "0209".toCharArray();
	/**
	 *	Test condition "0209" for isBulkCopyApplCounts881000()
	 *	@return  Returns true if isBulkCopyApplCounts881000() is "0209"
	 */
   public boolean isBulkCopyApplCounts881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyApplCounts88100088Value)  == 0  );
   }


	/**
	*  set values "0209"
	*/
   	public void setBulkCopyApplCounts881000True() {  			
    	setFunctionResponse1000( bulkCopyApplCounts88100088Value);
   	}
	char[] bulkCopyGftAlloc88100088Value = "0210".toCharArray();
	/**
	 *	Test condition "0210" for isBulkCopyGftAlloc881000()
	 *	@return  Returns true if isBulkCopyGftAlloc881000() is "0210"
	 */
   public boolean isBulkCopyGftAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0210"
	*/
   	public void setBulkCopyGftAlloc881000True() {  			
    	setFunctionResponse1000( bulkCopyGftAlloc88100088Value);
   	}
	char[] bulkCopyGftOpen88100088Value = "0211".toCharArray();
	/**
	 *	Test condition "0211" for isBulkCopyGftOpen881000()
	 *	@return  Returns true if isBulkCopyGftOpen881000() is "0211"
	 */
   public boolean isBulkCopyGftOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0211"
	*/
   	public void setBulkCopyGftOpen881000True() {  			
    	setFunctionResponse1000( bulkCopyGftOpen88100088Value);
   	}
	char[] bulkCopyGftWrite88100088Value = "0212".toCharArray();
	/**
	 *	Test condition "0212" for isBulkCopyGftWrite881000()
	 *	@return  Returns true if isBulkCopyGftWrite881000() is "0212"
	 */
   public boolean isBulkCopyGftWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0212"
	*/
   	public void setBulkCopyGftWrite881000True() {  			
    	setFunctionResponse1000( bulkCopyGftWrite88100088Value);
   	}
	char[] bulkCopyGftClose88100088Value = "0213".toCharArray();
	/**
	 *	Test condition "0213" for isBulkCopyGftClose881000()
	 *	@return  Returns true if isBulkCopyGftClose881000() is "0213"
	 */
   public boolean isBulkCopyGftClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftClose88100088Value)  == 0  );
   }


	/**
	*  set values "0213"
	*/
   	public void setBulkCopyGftClose881000True() {  			
    	setFunctionResponse1000( bulkCopyGftClose88100088Value);
   	}
	char[] bulkCopyGftUnall88100088Value = "0214".toCharArray();
	/**
	 *	Test condition "0214" for isBulkCopyGftUnall881000()
	 *	@return  Returns true if isBulkCopyGftUnall881000() is "0214"
	 */
   public boolean isBulkCopyGftUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0214"
	*/
   	public void setBulkCopyGftUnall881000True() {  			
    	setFunctionResponse1000( bulkCopyGftUnall88100088Value);
   	}
	char[] bulkCopyGftDltalc88100088Value = "0215".toCharArray();
	/**
	 *	Test condition "0215" for isBulkCopyGftDltalc881000()
	 *	@return  Returns true if isBulkCopyGftDltalc881000() is "0215"
	 */
   public boolean isBulkCopyGftDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0215"
	*/
   	public void setBulkCopyGftDltalc881000True() {  			
    	setFunctionResponse1000( bulkCopyGftDltalc88100088Value);
   	}
	char[] bulkCopyGftDltopn88100088Value = "0216".toCharArray();
	/**
	 *	Test condition "0216" for isBulkCopyGftDltopn881000()
	 *	@return  Returns true if isBulkCopyGftDltopn881000() is "0216"
	 */
   public boolean isBulkCopyGftDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0216"
	*/
   	public void setBulkCopyGftDltopn881000True() {  			
    	setFunctionResponse1000( bulkCopyGftDltopn88100088Value);
   	}
	char[] bulkCopyGftDltcls88100088Value = "0217".toCharArray();
	/**
	 *	Test condition "0217" for isBulkCopyGftDltcls881000()
	 *	@return  Returns true if isBulkCopyGftDltcls881000() is "0217"
	 */
   public boolean isBulkCopyGftDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0217"
	*/
   	public void setBulkCopyGftDltcls881000True() {  			
    	setFunctionResponse1000( bulkCopyGftDltcls88100088Value);
   	}
	char[] bulkCopyGftInUse88100088Value = "0218".toCharArray();
	/**
	 *	Test condition "0218" for isBulkCopyGftInUse881000()
	 *	@return  Returns true if isBulkCopyGftInUse881000() is "0218"
	 */
   public boolean isBulkCopyGftInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0218"
	*/
   	public void setBulkCopyGftInUse881000True() {  			
    	setFunctionResponse1000( bulkCopyGftInUse88100088Value);
   	}
	char[] bulkCopyGftNone88100088Value = "0219".toCharArray();
	/**
	 *	Test condition "0219" for isBulkCopyGftNone881000()
	 *	@return  Returns true if isBulkCopyGftNone881000() is "0219"
	 */
   public boolean isBulkCopyGftNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkCopyGftNone88100088Value)  == 0  );
   }


	/**
	*  set values "0219"
	*/
   	public void setBulkCopyGftNone881000True() {  			
    	setFunctionResponse1000( bulkCopyGftNone88100088Value);
   	}
	char[] bulkPrcsXferInsert88100088Value = "0220".toCharArray();
	/**
	 *	Test condition "0220" for isBulkPrcsXferInsert881000()
	 *	@return  Returns true if isBulkPrcsXferInsert881000() is "0220"
	 */
   public boolean isBulkPrcsXferInsert881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsXferInsert88100088Value)  == 0  );
   }


	/**
	*  set values "0220"
	*/
   	public void setBulkPrcsXferInsert881000True() {  			
    	setFunctionResponse1000( bulkPrcsXferInsert88100088Value);
   	}
	char[] bulkPrcsEfpoOpen88100088Value = "0221".toCharArray();
	/**
	 *	Test condition "0221" for isBulkPrcsEfpoOpen881000()
	 *	@return  Returns true if isBulkPrcsEfpoOpen881000() is "0221"
	 */
   public boolean isBulkPrcsEfpoOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEfpoOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0221"
	*/
   	public void setBulkPrcsEfpoOpen881000True() {  			
    	setFunctionResponse1000( bulkPrcsEfpoOpen88100088Value);
   	}
	char[] bulkPrcsEfpoFetch88100088Value = "0222".toCharArray();
	/**
	 *	Test condition "0222" for isBulkPrcsEfpoFetch881000()
	 *	@return  Returns true if isBulkPrcsEfpoFetch881000() is "0222"
	 */
   public boolean isBulkPrcsEfpoFetch881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEfpoFetch88100088Value)  == 0  );
   }


	/**
	*  set values "0222"
	*/
   	public void setBulkPrcsEfpoFetch881000True() {  			
    	setFunctionResponse1000( bulkPrcsEfpoFetch88100088Value);
   	}
	char[] bulkPrcsEfpoClose88100088Value = "0223".toCharArray();
	/**
	 *	Test condition "0223" for isBulkPrcsEfpoClose881000()
	 *	@return  Returns true if isBulkPrcsEfpoClose881000() is "0223"
	 */
   public boolean isBulkPrcsEfpoClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEfpoClose88100088Value)  == 0  );
   }


	/**
	*  set values "0223"
	*/
   	public void setBulkPrcsEfpoClose881000True() {  			
    	setFunctionResponse1000( bulkPrcsEfpoClose88100088Value);
   	}
	char[] bulkPrcsEfpoSelect88100088Value = "0224".toCharArray();
	/**
	 *	Test condition "0224" for isBulkPrcsEfpoSelect881000()
	 *	@return  Returns true if isBulkPrcsEfpoSelect881000() is "0224"
	 */
   public boolean isBulkPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0224"
	*/
   	public void setBulkPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( bulkPrcsEfpoSelect88100088Value);
   	}
	char[] bulkPrcsEptoSelect88100088Value = "0225".toCharArray();
	/**
	 *	Test condition "0225" for isBulkPrcsEptoSelect881000()
	 *	@return  Returns true if isBulkPrcsEptoSelect881000() is "0225"
	 */
   public boolean isBulkPrcsEptoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEptoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0225"
	*/
   	public void setBulkPrcsEptoSelect881000True() {  			
    	setFunctionResponse1000( bulkPrcsEptoSelect88100088Value);
   	}
	char[] bulkPrcsEfpbSelect88100088Value = "0226".toCharArray();
	/**
	 *	Test condition "0226" for isBulkPrcsEfpbSelect881000()
	 *	@return  Returns true if isBulkPrcsEfpbSelect881000() is "0226"
	 */
   public boolean isBulkPrcsEfpbSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEfpbSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0226"
	*/
   	public void setBulkPrcsEfpbSelect881000True() {  			
    	setFunctionResponse1000( bulkPrcsEfpbSelect88100088Value);
   	}
	char[] bulkPrcsEptbSelect88100088Value = "0227".toCharArray();
	/**
	 *	Test condition "0227" for isBulkPrcsEptbSelect881000()
	 *	@return  Returns true if isBulkPrcsEptbSelect881000() is "0227"
	 */
   public boolean isBulkPrcsEptbSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsEptbSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0227"
	*/
   	public void setBulkPrcsEptbSelect881000True() {  			
    	setFunctionResponse1000( bulkPrcsEptbSelect88100088Value);
   	}
	char[] bulkPrcsRsltOpen88100088Value = "0228".toCharArray();
	/**
	 *	Test condition "0228" for isBulkPrcsRsltOpen881000()
	 *	@return  Returns true if isBulkPrcsRsltOpen881000() is "0228"
	 */
   public boolean isBulkPrcsRsltOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsRsltOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0228"
	*/
   	public void setBulkPrcsRsltOpen881000True() {  			
    	setFunctionResponse1000( bulkPrcsRsltOpen88100088Value);
   	}
	char[] bulkPrcsRsltWrite88100088Value = "0229".toCharArray();
	/**
	 *	Test condition "0229" for isBulkPrcsRsltWrite881000()
	 *	@return  Returns true if isBulkPrcsRsltWrite881000() is "0229"
	 */
   public boolean isBulkPrcsRsltWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsRsltWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0229"
	*/
   	public void setBulkPrcsRsltWrite881000True() {  			
    	setFunctionResponse1000( bulkPrcsRsltWrite88100088Value);
   	}
	char[] bulkPrcsRsltClose88100088Value = "0230".toCharArray();
	/**
	 *	Test condition "0230" for isBulkPrcsRsltClose881000()
	 *	@return  Returns true if isBulkPrcsRsltClose881000() is "0230"
	 */
   public boolean isBulkPrcsRsltClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsRsltClose88100088Value)  == 0  );
   }


	/**
	*  set values "0230"
	*/
   	public void setBulkPrcsRsltClose881000True() {  			
    	setFunctionResponse1000( bulkPrcsRsltClose88100088Value);
   	}
	char[] bulkPrcsFxsSelect88100088Value = "0231".toCharArray();
	/**
	 *	Test condition "0231" for isBulkPrcsFxsSelect881000()
	 *	@return  Returns true if isBulkPrcsFxsSelect881000() is "0231"
	 */
   public boolean isBulkPrcsFxsSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , bulkPrcsFxsSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0231"
	*/
   	public void setBulkPrcsFxsSelect881000True() {  			
    	setFunctionResponse1000( bulkPrcsFxsSelect88100088Value);
   	}
	char[] cntPrcsBulkSelect88100088Value = "0301".toCharArray();
	/**
	 *	Test condition "0301" for isCntPrcsBulkSelect881000()
	 *	@return  Returns true if isCntPrcsBulkSelect881000() is "0301"
	 */
   public boolean isCntPrcsBulkSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , cntPrcsBulkSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0301"
	*/
   	public void setCntPrcsBulkSelect881000True() {  			
    	setFunctionResponse1000( cntPrcsBulkSelect88100088Value);
   	}
	char[] cntPrcsBulkOutbnd88100088Value = "0302".toCharArray();
	/**
	 *	Test condition "0302" for isCntPrcsBulkOutbnd881000()
	 *	@return  Returns true if isCntPrcsBulkOutbnd881000() is "0302"
	 */
   public boolean isCntPrcsBulkOutbnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , cntPrcsBulkOutbnd88100088Value)  == 0  );
   }


	/**
	*  set values "0302"
	*/
   	public void setCntPrcsBulkOutbnd881000True() {  			
    	setFunctionResponse1000( cntPrcsBulkOutbnd88100088Value);
   	}
	char[] listCopyApplAlloc88100088Value = "0400".toCharArray();
	/**
	 *	Test condition "0400" for isListCopyApplAlloc881000()
	 *	@return  Returns true if isListCopyApplAlloc881000() is "0400"
	 */
   public boolean isListCopyApplAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0400"
	*/
   	public void setListCopyApplAlloc881000True() {  			
    	setFunctionResponse1000( listCopyApplAlloc88100088Value);
   	}
	char[] listCopyApplOpen88100088Value = "0401".toCharArray();
	/**
	 *	Test condition "0401" for isListCopyApplOpen881000()
	 *	@return  Returns true if isListCopyApplOpen881000() is "0401"
	 */
   public boolean isListCopyApplOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0401"
	*/
   	public void setListCopyApplOpen881000True() {  			
    	setFunctionResponse1000( listCopyApplOpen88100088Value);
   	}
	char[] listCopyApplRead88100088Value = "0402".toCharArray();
	/**
	 *	Test condition "0402" for isListCopyApplRead881000()
	 *	@return  Returns true if isListCopyApplRead881000() is "0402"
	 */
   public boolean isListCopyApplRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplRead88100088Value)  == 0  );
   }


	/**
	*  set values "0402"
	*/
   	public void setListCopyApplRead881000True() {  			
    	setFunctionResponse1000( listCopyApplRead88100088Value);
   	}
	char[] listCopyApplClose88100088Value = "0403".toCharArray();
	/**
	 *	Test condition "0403" for isListCopyApplClose881000()
	 *	@return  Returns true if isListCopyApplClose881000() is "0403"
	 */
   public boolean isListCopyApplClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplClose88100088Value)  == 0  );
   }


	/**
	*  set values "0403"
	*/
   	public void setListCopyApplClose881000True() {  			
    	setFunctionResponse1000( listCopyApplClose88100088Value);
   	}
	char[] listCopyApplUnall88100088Value = "0404".toCharArray();
	/**
	 *	Test condition "0404" for isListCopyApplUnall881000()
	 *	@return  Returns true if isListCopyApplUnall881000() is "0404"
	 */
   public boolean isListCopyApplUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0404"
	*/
   	public void setListCopyApplUnall881000True() {  			
    	setFunctionResponse1000( listCopyApplUnall88100088Value);
   	}
	char[] listCopyApplDltalc88100088Value = "0405".toCharArray();
	/**
	 *	Test condition "0405" for isListCopyApplDltalc881000()
	 *	@return  Returns true if isListCopyApplDltalc881000() is "0405"
	 */
   public boolean isListCopyApplDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0405"
	*/
   	public void setListCopyApplDltalc881000True() {  			
    	setFunctionResponse1000( listCopyApplDltalc88100088Value);
   	}
	char[] listCopyApplDltopn88100088Value = "0406".toCharArray();
	/**
	 *	Test condition "0406" for isListCopyApplDltopn881000()
	 *	@return  Returns true if isListCopyApplDltopn881000() is "0406"
	 */
   public boolean isListCopyApplDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0406"
	*/
   	public void setListCopyApplDltopn881000True() {  			
    	setFunctionResponse1000( listCopyApplDltopn88100088Value);
   	}
	char[] listCopyApplDltcls88100088Value = "0407".toCharArray();
	/**
	 *	Test condition "0407" for isListCopyApplDltcls881000()
	 *	@return  Returns true if isListCopyApplDltcls881000() is "0407"
	 */
   public boolean isListCopyApplDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0407"
	*/
   	public void setListCopyApplDltcls881000True() {  			
    	setFunctionResponse1000( listCopyApplDltcls88100088Value);
   	}
	char[] listCopyApplInUse88100088Value = "0408".toCharArray();
	/**
	 *	Test condition "0408" for isListCopyApplInUse881000()
	 *	@return  Returns true if isListCopyApplInUse881000() is "0408"
	 */
   public boolean isListCopyApplInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0408"
	*/
   	public void setListCopyApplInUse881000True() {  			
    	setFunctionResponse1000( listCopyApplInUse88100088Value);
   	}
	char[] listCopyApplCounts88100088Value = "0409".toCharArray();
	/**
	 *	Test condition "0409" for isListCopyApplCounts881000()
	 *	@return  Returns true if isListCopyApplCounts881000() is "0409"
	 */
   public boolean isListCopyApplCounts881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyApplCounts88100088Value)  == 0  );
   }


	/**
	*  set values "0409"
	*/
   	public void setListCopyApplCounts881000True() {  			
    	setFunctionResponse1000( listCopyApplCounts88100088Value);
   	}
	char[] listCopyGftAlloc88100088Value = "0410".toCharArray();
	/**
	 *	Test condition "0410" for isListCopyGftAlloc881000()
	 *	@return  Returns true if isListCopyGftAlloc881000() is "0410"
	 */
   public boolean isListCopyGftAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0410"
	*/
   	public void setListCopyGftAlloc881000True() {  			
    	setFunctionResponse1000( listCopyGftAlloc88100088Value);
   	}
	char[] listCopyGftOpen88100088Value = "0411".toCharArray();
	/**
	 *	Test condition "0411" for isListCopyGftOpen881000()
	 *	@return  Returns true if isListCopyGftOpen881000() is "0411"
	 */
   public boolean isListCopyGftOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0411"
	*/
   	public void setListCopyGftOpen881000True() {  			
    	setFunctionResponse1000( listCopyGftOpen88100088Value);
   	}
	char[] listCopyGftWrite88100088Value = "0412".toCharArray();
	/**
	 *	Test condition "0412" for isListCopyGftWrite881000()
	 *	@return  Returns true if isListCopyGftWrite881000() is "0412"
	 */
   public boolean isListCopyGftWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0412"
	*/
   	public void setListCopyGftWrite881000True() {  			
    	setFunctionResponse1000( listCopyGftWrite88100088Value);
   	}
	char[] listCopyGftClose88100088Value = "0413".toCharArray();
	/**
	 *	Test condition "0413" for isListCopyGftClose881000()
	 *	@return  Returns true if isListCopyGftClose881000() is "0413"
	 */
   public boolean isListCopyGftClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftClose88100088Value)  == 0  );
   }


	/**
	*  set values "0413"
	*/
   	public void setListCopyGftClose881000True() {  			
    	setFunctionResponse1000( listCopyGftClose88100088Value);
   	}
	char[] listCopyGftUnall88100088Value = "0414".toCharArray();
	/**
	 *	Test condition "0414" for isListCopyGftUnall881000()
	 *	@return  Returns true if isListCopyGftUnall881000() is "0414"
	 */
   public boolean isListCopyGftUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0414"
	*/
   	public void setListCopyGftUnall881000True() {  			
    	setFunctionResponse1000( listCopyGftUnall88100088Value);
   	}
	char[] listCopyGftDltalc88100088Value = "0415".toCharArray();
	/**
	 *	Test condition "0415" for isListCopyGftDltalc881000()
	 *	@return  Returns true if isListCopyGftDltalc881000() is "0415"
	 */
   public boolean isListCopyGftDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0415"
	*/
   	public void setListCopyGftDltalc881000True() {  			
    	setFunctionResponse1000( listCopyGftDltalc88100088Value);
   	}
	char[] listCopyGftDltopn88100088Value = "0416".toCharArray();
	/**
	 *	Test condition "0416" for isListCopyGftDltopn881000()
	 *	@return  Returns true if isListCopyGftDltopn881000() is "0416"
	 */
   public boolean isListCopyGftDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0416"
	*/
   	public void setListCopyGftDltopn881000True() {  			
    	setFunctionResponse1000( listCopyGftDltopn88100088Value);
   	}
	char[] listCopyGftDltcls88100088Value = "0417".toCharArray();
	/**
	 *	Test condition "0417" for isListCopyGftDltcls881000()
	 *	@return  Returns true if isListCopyGftDltcls881000() is "0417"
	 */
   public boolean isListCopyGftDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0417"
	*/
   	public void setListCopyGftDltcls881000True() {  			
    	setFunctionResponse1000( listCopyGftDltcls88100088Value);
   	}
	char[] listCopyGftInUse88100088Value = "0418".toCharArray();
	/**
	 *	Test condition "0418" for isListCopyGftInUse881000()
	 *	@return  Returns true if isListCopyGftInUse881000() is "0418"
	 */
   public boolean isListCopyGftInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0418"
	*/
   	public void setListCopyGftInUse881000True() {  			
    	setFunctionResponse1000( listCopyGftInUse88100088Value);
   	}
	char[] listCopyGftNone88100088Value = "0419".toCharArray();
	/**
	 *	Test condition "0419" for isListCopyGftNone881000()
	 *	@return  Returns true if isListCopyGftNone881000() is "0419"
	 */
   public boolean isListCopyGftNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listCopyGftNone88100088Value)  == 0  );
   }


	/**
	*  set values "0419"
	*/
   	public void setListCopyGftNone881000True() {  			
    	setFunctionResponse1000( listCopyGftNone88100088Value);
   	}
	char[] listPrcsXferInsert88100088Value = "0420".toCharArray();
	/**
	 *	Test condition "0420" for isListPrcsXferInsert881000()
	 *	@return  Returns true if isListPrcsXferInsert881000() is "0420"
	 */
   public boolean isListPrcsXferInsert881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsXferInsert88100088Value)  == 0  );
   }


	/**
	*  set values "0420"
	*/
   	public void setListPrcsXferInsert881000True() {  			
    	setFunctionResponse1000( listPrcsXferInsert88100088Value);
   	}
	char[] listPrcsEfpoSelect88100088Value = "0421".toCharArray();
	/**
	 *	Test condition "0421" for isListPrcsEfpoSelect881000()
	 *	@return  Returns true if isListPrcsEfpoSelect881000() is "0421"
	 */
   public boolean isListPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0421"
	*/
   	public void setListPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( listPrcsEfpoSelect88100088Value);
   	}
	char[] listPrcsEptoSelect88100088Value = "0422".toCharArray();
	/**
	 *	Test condition "0422" for isListPrcsEptoSelect881000()
	 *	@return  Returns true if isListPrcsEptoSelect881000() is "0422"
	 */
   public boolean isListPrcsEptoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsEptoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0422"
	*/
   	public void setListPrcsEptoSelect881000True() {  			
    	setFunctionResponse1000( listPrcsEptoSelect88100088Value);
   	}
	char[] listPrcsEfpbSelect88100088Value = "0423".toCharArray();
	/**
	 *	Test condition "0423" for isListPrcsEfpbSelect881000()
	 *	@return  Returns true if isListPrcsEfpbSelect881000() is "0423"
	 */
   public boolean isListPrcsEfpbSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsEfpbSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0423"
	*/
   	public void setListPrcsEfpbSelect881000True() {  			
    	setFunctionResponse1000( listPrcsEfpbSelect88100088Value);
   	}
	char[] listPrcsEptbSelect88100088Value = "0424".toCharArray();
	/**
	 *	Test condition "0424" for isListPrcsEptbSelect881000()
	 *	@return  Returns true if isListPrcsEptbSelect881000() is "0424"
	 */
   public boolean isListPrcsEptbSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsEptbSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0424"
	*/
   	public void setListPrcsEptbSelect881000True() {  			
    	setFunctionResponse1000( listPrcsEptbSelect88100088Value);
   	}
	char[] listPrcsFileOpen88100088Value = "0425".toCharArray();
	/**
	 *	Test condition "0425" for isListPrcsFileOpen881000()
	 *	@return  Returns true if isListPrcsFileOpen881000() is "0425"
	 */
   public boolean isListPrcsFileOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsFileOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0425"
	*/
   	public void setListPrcsFileOpen881000True() {  			
    	setFunctionResponse1000( listPrcsFileOpen88100088Value);
   	}
	char[] listPrcsFileRead88100088Value = "0426".toCharArray();
	/**
	 *	Test condition "0426" for isListPrcsFileRead881000()
	 *	@return  Returns true if isListPrcsFileRead881000() is "0426"
	 */
   public boolean isListPrcsFileRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsFileRead88100088Value)  == 0  );
   }


	/**
	*  set values "0426"
	*/
   	public void setListPrcsFileRead881000True() {  			
    	setFunctionResponse1000( listPrcsFileRead88100088Value);
   	}
	char[] listPrcsFileClose88100088Value = "0427".toCharArray();
	/**
	 *	Test condition "0427" for isListPrcsFileClose881000()
	 *	@return  Returns true if isListPrcsFileClose881000() is "0427"
	 */
   public boolean isListPrcsFileClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsFileClose88100088Value)  == 0  );
   }


	/**
	*  set values "0427"
	*/
   	public void setListPrcsFileClose881000True() {  			
    	setFunctionResponse1000( listPrcsFileClose88100088Value);
   	}
	char[] listPrcsRsltOpen88100088Value = "0428".toCharArray();
	/**
	 *	Test condition "0428" for isListPrcsRsltOpen881000()
	 *	@return  Returns true if isListPrcsRsltOpen881000() is "0428"
	 */
   public boolean isListPrcsRsltOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsRsltOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0428"
	*/
   	public void setListPrcsRsltOpen881000True() {  			
    	setFunctionResponse1000( listPrcsRsltOpen88100088Value);
   	}
	char[] listPrcsRsltWrite88100088Value = "0429".toCharArray();
	/**
	 *	Test condition "0429" for isListPrcsRsltWrite881000()
	 *	@return  Returns true if isListPrcsRsltWrite881000() is "0429"
	 */
   public boolean isListPrcsRsltWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsRsltWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0429"
	*/
   	public void setListPrcsRsltWrite881000True() {  			
    	setFunctionResponse1000( listPrcsRsltWrite88100088Value);
   	}
	char[] listPrcsRsltClose88100088Value = "0430".toCharArray();
	/**
	 *	Test condition "0430" for isListPrcsRsltClose881000()
	 *	@return  Returns true if isListPrcsRsltClose881000() is "0430"
	 */
   public boolean isListPrcsRsltClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsRsltClose88100088Value)  == 0  );
   }


	/**
	*  set values "0430"
	*/
   	public void setListPrcsRsltClose881000True() {  			
    	setFunctionResponse1000( listPrcsRsltClose88100088Value);
   	}
	char[] listPrcsFxsSelect88100088Value = "0431".toCharArray();
	/**
	 *	Test condition "0431" for isListPrcsFxsSelect881000()
	 *	@return  Returns true if isListPrcsFxsSelect881000() is "0431"
	 */
   public boolean isListPrcsFxsSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , listPrcsFxsSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0431"
	*/
   	public void setListPrcsFxsSelect881000True() {  			
    	setFunctionResponse1000( listPrcsFxsSelect88100088Value);
   	}
	char[] retrCopyApplAlloc88100088Value = "0500".toCharArray();
	/**
	 *	Test condition "0500" for isRetrCopyApplAlloc881000()
	 *	@return  Returns true if isRetrCopyApplAlloc881000() is "0500"
	 */
   public boolean isRetrCopyApplAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0500"
	*/
   	public void setRetrCopyApplAlloc881000True() {  			
    	setFunctionResponse1000( retrCopyApplAlloc88100088Value);
   	}
	char[] retrCopyApplOpen88100088Value = "0501".toCharArray();
	/**
	 *	Test condition "0501" for isRetrCopyApplOpen881000()
	 *	@return  Returns true if isRetrCopyApplOpen881000() is "0501"
	 */
   public boolean isRetrCopyApplOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0501"
	*/
   	public void setRetrCopyApplOpen881000True() {  			
    	setFunctionResponse1000( retrCopyApplOpen88100088Value);
   	}
	char[] retrCopyApplWrite88100088Value = "0502".toCharArray();
	/**
	 *	Test condition "0502" for isRetrCopyApplWrite881000()
	 *	@return  Returns true if isRetrCopyApplWrite881000() is "0502"
	 */
   public boolean isRetrCopyApplWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0502"
	*/
   	public void setRetrCopyApplWrite881000True() {  			
    	setFunctionResponse1000( retrCopyApplWrite88100088Value);
   	}
	char[] retrCopyApplClose88100088Value = "0503".toCharArray();
	/**
	 *	Test condition "0503" for isRetrCopyApplClose881000()
	 *	@return  Returns true if isRetrCopyApplClose881000() is "0503"
	 */
   public boolean isRetrCopyApplClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplClose88100088Value)  == 0  );
   }


	/**
	*  set values "0503"
	*/
   	public void setRetrCopyApplClose881000True() {  			
    	setFunctionResponse1000( retrCopyApplClose88100088Value);
   	}
	char[] retrCopyApplUnall88100088Value = "0504".toCharArray();
	/**
	 *	Test condition "0504" for isRetrCopyApplUnall881000()
	 *	@return  Returns true if isRetrCopyApplUnall881000() is "0504"
	 */
   public boolean isRetrCopyApplUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0504"
	*/
   	public void setRetrCopyApplUnall881000True() {  			
    	setFunctionResponse1000( retrCopyApplUnall88100088Value);
   	}
	char[] retrCopyApplDltalc88100088Value = "0505".toCharArray();
	/**
	 *	Test condition "0505" for isRetrCopyApplDltalc881000()
	 *	@return  Returns true if isRetrCopyApplDltalc881000() is "0505"
	 */
   public boolean isRetrCopyApplDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0505"
	*/
   	public void setRetrCopyApplDltalc881000True() {  			
    	setFunctionResponse1000( retrCopyApplDltalc88100088Value);
   	}
	char[] retrCopyApplDltopn88100088Value = "0506".toCharArray();
	/**
	 *	Test condition "0506" for isRetrCopyApplDltopn881000()
	 *	@return  Returns true if isRetrCopyApplDltopn881000() is "0506"
	 */
   public boolean isRetrCopyApplDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0506"
	*/
   	public void setRetrCopyApplDltopn881000True() {  			
    	setFunctionResponse1000( retrCopyApplDltopn88100088Value);
   	}
	char[] retrCopyApplDltcls88100088Value = "0507".toCharArray();
	/**
	 *	Test condition "0507" for isRetrCopyApplDltcls881000()
	 *	@return  Returns true if isRetrCopyApplDltcls881000() is "0507"
	 */
   public boolean isRetrCopyApplDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0507"
	*/
   	public void setRetrCopyApplDltcls881000True() {  			
    	setFunctionResponse1000( retrCopyApplDltcls88100088Value);
   	}
	char[] retrCopyApplInUse88100088Value = "0508".toCharArray();
	/**
	 *	Test condition "0508" for isRetrCopyApplInUse881000()
	 *	@return  Returns true if isRetrCopyApplInUse881000() is "0508"
	 */
   public boolean isRetrCopyApplInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0508"
	*/
   	public void setRetrCopyApplInUse881000True() {  			
    	setFunctionResponse1000( retrCopyApplInUse88100088Value);
   	}
	char[] retrCopyApplDupe88100088Value = "0509".toCharArray();
	/**
	 *	Test condition "0509" for isRetrCopyApplDupe881000()
	 *	@return  Returns true if isRetrCopyApplDupe881000() is "0509"
	 */
   public boolean isRetrCopyApplDupe881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyApplDupe88100088Value)  == 0  );
   }


	/**
	*  set values "0509"
	*/
   	public void setRetrCopyApplDupe881000True() {  			
    	setFunctionResponse1000( retrCopyApplDupe88100088Value);
   	}
	char[] retrCopyGftAlloc88100088Value = "0510".toCharArray();
	/**
	 *	Test condition "0510" for isRetrCopyGftAlloc881000()
	 *	@return  Returns true if isRetrCopyGftAlloc881000() is "0510"
	 */
   public boolean isRetrCopyGftAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0510"
	*/
   	public void setRetrCopyGftAlloc881000True() {  			
    	setFunctionResponse1000( retrCopyGftAlloc88100088Value);
   	}
	char[] retrCopyGftOpen88100088Value = "0511".toCharArray();
	/**
	 *	Test condition "0511" for isRetrCopyGftOpen881000()
	 *	@return  Returns true if isRetrCopyGftOpen881000() is "0511"
	 */
   public boolean isRetrCopyGftOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0511"
	*/
   	public void setRetrCopyGftOpen881000True() {  			
    	setFunctionResponse1000( retrCopyGftOpen88100088Value);
   	}
	char[] retrCopyGftRead88100088Value = "0512".toCharArray();
	/**
	 *	Test condition "0512" for isRetrCopyGftRead881000()
	 *	@return  Returns true if isRetrCopyGftRead881000() is "0512"
	 */
   public boolean isRetrCopyGftRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftRead88100088Value)  == 0  );
   }


	/**
	*  set values "0512"
	*/
   	public void setRetrCopyGftRead881000True() {  			
    	setFunctionResponse1000( retrCopyGftRead88100088Value);
   	}
	char[] retrCopyGftClose88100088Value = "0513".toCharArray();
	/**
	 *	Test condition "0513" for isRetrCopyGftClose881000()
	 *	@return  Returns true if isRetrCopyGftClose881000() is "0513"
	 */
   public boolean isRetrCopyGftClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftClose88100088Value)  == 0  );
   }


	/**
	*  set values "0513"
	*/
   	public void setRetrCopyGftClose881000True() {  			
    	setFunctionResponse1000( retrCopyGftClose88100088Value);
   	}
	char[] retrCopyGftUnall88100088Value = "0514".toCharArray();
	/**
	 *	Test condition "0514" for isRetrCopyGftUnall881000()
	 *	@return  Returns true if isRetrCopyGftUnall881000() is "0514"
	 */
   public boolean isRetrCopyGftUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0514"
	*/
   	public void setRetrCopyGftUnall881000True() {  			
    	setFunctionResponse1000( retrCopyGftUnall88100088Value);
   	}
	char[] retrCopyGftInUse88100088Value = "0518".toCharArray();
	/**
	 *	Test condition "0518" for isRetrCopyGftInUse881000()
	 *	@return  Returns true if isRetrCopyGftInUse881000() is "0518"
	 */
   public boolean isRetrCopyGftInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0518"
	*/
   	public void setRetrCopyGftInUse881000True() {  			
    	setFunctionResponse1000( retrCopyGftInUse88100088Value);
   	}
	char[] retrCopyGftCounts88100088Value = "0519".toCharArray();
	/**
	 *	Test condition "0519" for isRetrCopyGftCounts881000()
	 *	@return  Returns true if isRetrCopyGftCounts881000() is "0519"
	 */
   public boolean isRetrCopyGftCounts881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCopyGftCounts88100088Value)  == 0  );
   }


	/**
	*  set values "0519"
	*/
   	public void setRetrCopyGftCounts881000True() {  			
    	setFunctionResponse1000( retrCopyGftCounts88100088Value);
   	}
	char[] retrPrcsXferNotrdy88100088Value = "0520".toCharArray();
	/**
	 *	Test condition "0520" for isRetrPrcsXferNotrdy881000()
	 *	@return  Returns true if isRetrPrcsXferNotrdy881000() is "0520"
	 */
   public boolean isRetrPrcsXferNotrdy881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsXferNotrdy88100088Value)  == 0  );
   }


	/**
	*  set values "0520"
	*/
   	public void setRetrPrcsXferNotrdy881000True() {  			
    	setFunctionResponse1000( retrPrcsXferNotrdy88100088Value);
   	}
	char[] retrPrcsXferNotfnd88100088Value = "0521".toCharArray();
	/**
	 *	Test condition "0521" for isRetrPrcsXferNotfnd881000()
	 *	@return  Returns true if isRetrPrcsXferNotfnd881000() is "0521"
	 */
   public boolean isRetrPrcsXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0521"
	*/
   	public void setRetrPrcsXferNotfnd881000True() {  			
    	setFunctionResponse1000( retrPrcsXferNotfnd88100088Value);
   	}
	char[] retrPrcsXferOpen88100088Value = "0522".toCharArray();
	/**
	 *	Test condition "0522" for isRetrPrcsXferOpen881000()
	 *	@return  Returns true if isRetrPrcsXferOpen881000() is "0522"
	 */
   public boolean isRetrPrcsXferOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsXferOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0522"
	*/
   	public void setRetrPrcsXferOpen881000True() {  			
    	setFunctionResponse1000( retrPrcsXferOpen88100088Value);
   	}
	char[] retrPrcsXferFetch88100088Value = "0523".toCharArray();
	/**
	 *	Test condition "0523" for isRetrPrcsXferFetch881000()
	 *	@return  Returns true if isRetrPrcsXferFetch881000() is "0523"
	 */
   public boolean isRetrPrcsXferFetch881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsXferFetch88100088Value)  == 0  );
   }


	/**
	*  set values "0523"
	*/
   	public void setRetrPrcsXferFetch881000True() {  			
    	setFunctionResponse1000( retrPrcsXferFetch88100088Value);
   	}
	char[] retrPrcsXferClose88100088Value = "0524".toCharArray();
	/**
	 *	Test condition "0524" for isRetrPrcsXferClose881000()
	 *	@return  Returns true if isRetrPrcsXferClose881000() is "0524"
	 */
   public boolean isRetrPrcsXferClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsXferClose88100088Value)  == 0  );
   }


	/**
	*  set values "0524"
	*/
   	public void setRetrPrcsXferClose881000True() {  			
    	setFunctionResponse1000( retrPrcsXferClose88100088Value);
   	}
	char[] retrPrcsXferSelect88100088Value = "0525".toCharArray();
	/**
	 *	Test condition "0525" for isRetrPrcsXferSelect881000()
	 *	@return  Returns true if isRetrPrcsXferSelect881000() is "0525"
	 */
   public boolean isRetrPrcsXferSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsXferSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0525"
	*/
   	public void setRetrPrcsXferSelect881000True() {  			
    	setFunctionResponse1000( retrPrcsXferSelect88100088Value);
   	}
	char[] retrPrcsEfpoNotfnd88100088Value = "0526".toCharArray();
	/**
	 *	Test condition "0526" for isRetrPrcsEfpoNotfnd881000()
	 *	@return  Returns true if isRetrPrcsEfpoNotfnd881000() is "0526"
	 */
   public boolean isRetrPrcsEfpoNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsEfpoNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0526"
	*/
   	public void setRetrPrcsEfpoNotfnd881000True() {  			
    	setFunctionResponse1000( retrPrcsEfpoNotfnd88100088Value);
   	}
	char[] retrPrcsEfpoSelect88100088Value = "0527".toCharArray();
	/**
	 *	Test condition "0527" for isRetrPrcsEfpoSelect881000()
	 *	@return  Returns true if isRetrPrcsEfpoSelect881000() is "0527"
	 */
   public boolean isRetrPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0527"
	*/
   	public void setRetrPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( retrPrcsEfpoSelect88100088Value);
   	}
	char[] retrPrcsEptoNotfnd88100088Value = "0528".toCharArray();
	/**
	 *	Test condition "0528" for isRetrPrcsEptoNotfnd881000()
	 *	@return  Returns true if isRetrPrcsEptoNotfnd881000() is "0528"
	 */
   public boolean isRetrPrcsEptoNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsEptoNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0528"
	*/
   	public void setRetrPrcsEptoNotfnd881000True() {  			
    	setFunctionResponse1000( retrPrcsEptoNotfnd88100088Value);
   	}
	char[] retrPrcsEptoSelect88100088Value = "0529".toCharArray();
	/**
	 *	Test condition "0529" for isRetrPrcsEptoSelect881000()
	 *	@return  Returns true if isRetrPrcsEptoSelect881000() is "0529"
	 */
   public boolean isRetrPrcsEptoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPrcsEptoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0529"
	*/
   	public void setRetrPrcsEptoSelect881000True() {  			
    	setFunctionResponse1000( retrPrcsEptoSelect88100088Value);
   	}
	char[] retrUpldXferNotfnd88100088Value = "0530".toCharArray();
	/**
	 *	Test condition "0530" for isRetrUpldXferNotfnd881000()
	 *	@return  Returns true if isRetrUpldXferNotfnd881000() is "0530"
	 */
   public boolean isRetrUpldXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrUpldXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0530"
	*/
   	public void setRetrUpldXferNotfnd881000True() {  			
    	setFunctionResponse1000( retrUpldXferNotfnd88100088Value);
   	}
	char[] retrUpldXferUpdate88100088Value = "0531".toCharArray();
	/**
	 *	Test condition "0531" for isRetrUpldXferUpdate881000()
	 *	@return  Returns true if isRetrUpldXferUpdate881000() is "0531"
	 */
   public boolean isRetrUpldXferUpdate881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrUpldXferUpdate88100088Value)  == 0  );
   }


	/**
	*  set values "0531"
	*/
   	public void setRetrUpldXferUpdate881000True() {  			
    	setFunctionResponse1000( retrUpldXferUpdate88100088Value);
   	}
	char[] retrUpldXferCommit88100088Value = "0532".toCharArray();
	/**
	 *	Test condition "0532" for isRetrUpldXferCommit881000()
	 *	@return  Returns true if isRetrUpldXferCommit881000() is "0532"
	 */
   public boolean isRetrUpldXferCommit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrUpldXferCommit88100088Value)  == 0  );
   }


	/**
	*  set values "0532"
	*/
   	public void setRetrUpldXferCommit881000True() {  			
    	setFunctionResponse1000( retrUpldXferCommit88100088Value);
   	}
	char[] retrCmptXferNotfnd88100088Value = "0533".toCharArray();
	/**
	 *	Test condition "0533" for isRetrCmptXferNotfnd881000()
	 *	@return  Returns true if isRetrCmptXferNotfnd881000() is "0533"
	 */
   public boolean isRetrCmptXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCmptXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0533"
	*/
   	public void setRetrCmptXferNotfnd881000True() {  			
    	setFunctionResponse1000( retrCmptXferNotfnd88100088Value);
   	}
	char[] retrCmptXferUpdate88100088Value = "0534".toCharArray();
	/**
	 *	Test condition "0534" for isRetrCmptXferUpdate881000()
	 *	@return  Returns true if isRetrCmptXferUpdate881000() is "0534"
	 */
   public boolean isRetrCmptXferUpdate881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCmptXferUpdate88100088Value)  == 0  );
   }


	/**
	*  set values "0534"
	*/
   	public void setRetrCmptXferUpdate881000True() {  			
    	setFunctionResponse1000( retrCmptXferUpdate88100088Value);
   	}
	char[] retrCmptXferCommit88100088Value = "0535".toCharArray();
	/**
	 *	Test condition "0535" for isRetrCmptXferCommit881000()
	 *	@return  Returns true if isRetrCmptXferCommit881000() is "0535"
	 */
   public boolean isRetrCmptXferCommit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrCmptXferCommit88100088Value)  == 0  );
   }


	/**
	*  set values "0535"
	*/
   	public void setRetrCmptXferCommit881000True() {  			
    	setFunctionResponse1000( retrCmptXferCommit88100088Value);
   	}
	char[] retrPendXferNotfnd88100088Value = "0536".toCharArray();
	/**
	 *	Test condition "0536" for isRetrPendXferNotfnd881000()
	 *	@return  Returns true if isRetrPendXferNotfnd881000() is "0536"
	 */
   public boolean isRetrPendXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPendXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0536"
	*/
   	public void setRetrPendXferNotfnd881000True() {  			
    	setFunctionResponse1000( retrPendXferNotfnd88100088Value);
   	}
	char[] retrPendXferUpdate88100088Value = "0537".toCharArray();
	/**
	 *	Test condition "0537" for isRetrPendXferUpdate881000()
	 *	@return  Returns true if isRetrPendXferUpdate881000() is "0537"
	 */
   public boolean isRetrPendXferUpdate881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPendXferUpdate88100088Value)  == 0  );
   }


	/**
	*  set values "0537"
	*/
   	public void setRetrPendXferUpdate881000True() {  			
    	setFunctionResponse1000( retrPendXferUpdate88100088Value);
   	}
	char[] retrPendXferCommit88100088Value = "0538".toCharArray();
	/**
	 *	Test condition "0538" for isRetrPendXferCommit881000()
	 *	@return  Returns true if isRetrPendXferCommit881000() is "0538"
	 */
   public boolean isRetrPendXferCommit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , retrPendXferCommit88100088Value)  == 0  );
   }


	/**
	*  set values "0538"
	*/
   	public void setRetrPendXferCommit881000True() {  			
    	setFunctionResponse1000( retrPendXferCommit88100088Value);
   	}
	char[] sendCopyApplAlloc88100088Value = "0600".toCharArray();
	/**
	 *	Test condition "0600" for isSendCopyApplAlloc881000()
	 *	@return  Returns true if isSendCopyApplAlloc881000() is "0600"
	 */
   public boolean isSendCopyApplAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0600"
	*/
   	public void setSendCopyApplAlloc881000True() {  			
    	setFunctionResponse1000( sendCopyApplAlloc88100088Value);
   	}
	char[] sendCopyApplOpen88100088Value = "0601".toCharArray();
	/**
	 *	Test condition "0601" for isSendCopyApplOpen881000()
	 *	@return  Returns true if isSendCopyApplOpen881000() is "0601"
	 */
   public boolean isSendCopyApplOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0601"
	*/
   	public void setSendCopyApplOpen881000True() {  			
    	setFunctionResponse1000( sendCopyApplOpen88100088Value);
   	}
	char[] sendCopyApplRead88100088Value = "0602".toCharArray();
	/**
	 *	Test condition "0602" for isSendCopyApplRead881000()
	 *	@return  Returns true if isSendCopyApplRead881000() is "0602"
	 */
   public boolean isSendCopyApplRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplRead88100088Value)  == 0  );
   }


	/**
	*  set values "0602"
	*/
   	public void setSendCopyApplRead881000True() {  			
    	setFunctionResponse1000( sendCopyApplRead88100088Value);
   	}
	char[] sendCopyApplClose88100088Value = "0603".toCharArray();
	/**
	 *	Test condition "0603" for isSendCopyApplClose881000()
	 *	@return  Returns true if isSendCopyApplClose881000() is "0603"
	 */
   public boolean isSendCopyApplClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplClose88100088Value)  == 0  );
   }


	/**
	*  set values "0603"
	*/
   	public void setSendCopyApplClose881000True() {  			
    	setFunctionResponse1000( sendCopyApplClose88100088Value);
   	}
	char[] sendCopyApplUnall88100088Value = "0604".toCharArray();
	/**
	 *	Test condition "0604" for isSendCopyApplUnall881000()
	 *	@return  Returns true if isSendCopyApplUnall881000() is "0604"
	 */
   public boolean isSendCopyApplUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0604"
	*/
   	public void setSendCopyApplUnall881000True() {  			
    	setFunctionResponse1000( sendCopyApplUnall88100088Value);
   	}
	char[] sendCopyApplDltalc88100088Value = "0605".toCharArray();
	/**
	 *	Test condition "0605" for isSendCopyApplDltalc881000()
	 *	@return  Returns true if isSendCopyApplDltalc881000() is "0605"
	 */
   public boolean isSendCopyApplDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0605"
	*/
   	public void setSendCopyApplDltalc881000True() {  			
    	setFunctionResponse1000( sendCopyApplDltalc88100088Value);
   	}
	char[] sendCopyApplDltopn88100088Value = "0606".toCharArray();
	/**
	 *	Test condition "0606" for isSendCopyApplDltopn881000()
	 *	@return  Returns true if isSendCopyApplDltopn881000() is "0606"
	 */
   public boolean isSendCopyApplDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0606"
	*/
   	public void setSendCopyApplDltopn881000True() {  			
    	setFunctionResponse1000( sendCopyApplDltopn88100088Value);
   	}
	char[] sendCopyApplDltcls88100088Value = "0607".toCharArray();
	/**
	 *	Test condition "0607" for isSendCopyApplDltcls881000()
	 *	@return  Returns true if isSendCopyApplDltcls881000() is "0607"
	 */
   public boolean isSendCopyApplDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0607"
	*/
   	public void setSendCopyApplDltcls881000True() {  			
    	setFunctionResponse1000( sendCopyApplDltcls88100088Value);
   	}
	char[] sendCopyApplInUse88100088Value = "0608".toCharArray();
	/**
	 *	Test condition "0608" for isSendCopyApplInUse881000()
	 *	@return  Returns true if isSendCopyApplInUse881000() is "0608"
	 */
   public boolean isSendCopyApplInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0608"
	*/
   	public void setSendCopyApplInUse881000True() {  			
    	setFunctionResponse1000( sendCopyApplInUse88100088Value);
   	}
	char[] sendCopyApplCounts88100088Value = "0609".toCharArray();
	/**
	 *	Test condition "0609" for isSendCopyApplCounts881000()
	 *	@return  Returns true if isSendCopyApplCounts881000() is "0609"
	 */
   public boolean isSendCopyApplCounts881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyApplCounts88100088Value)  == 0  );
   }


	/**
	*  set values "0609"
	*/
   	public void setSendCopyApplCounts881000True() {  			
    	setFunctionResponse1000( sendCopyApplCounts88100088Value);
   	}
	char[] sendCopyGftAlloc88100088Value = "0610".toCharArray();
	/**
	 *	Test condition "0610" for isSendCopyGftAlloc881000()
	 *	@return  Returns true if isSendCopyGftAlloc881000() is "0610"
	 */
   public boolean isSendCopyGftAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0610"
	*/
   	public void setSendCopyGftAlloc881000True() {  			
    	setFunctionResponse1000( sendCopyGftAlloc88100088Value);
   	}
	char[] sendCopyGftOpen88100088Value = "0611".toCharArray();
	/**
	 *	Test condition "0611" for isSendCopyGftOpen881000()
	 *	@return  Returns true if isSendCopyGftOpen881000() is "0611"
	 */
   public boolean isSendCopyGftOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0611"
	*/
   	public void setSendCopyGftOpen881000True() {  			
    	setFunctionResponse1000( sendCopyGftOpen88100088Value);
   	}
	char[] sendCopyGftWrite88100088Value = "0612".toCharArray();
	/**
	 *	Test condition "0612" for isSendCopyGftWrite881000()
	 *	@return  Returns true if isSendCopyGftWrite881000() is "0612"
	 */
   public boolean isSendCopyGftWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0612"
	*/
   	public void setSendCopyGftWrite881000True() {  			
    	setFunctionResponse1000( sendCopyGftWrite88100088Value);
   	}
	char[] sendCopyGftClose88100088Value = "0613".toCharArray();
	/**
	 *	Test condition "0613" for isSendCopyGftClose881000()
	 *	@return  Returns true if isSendCopyGftClose881000() is "0613"
	 */
   public boolean isSendCopyGftClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftClose88100088Value)  == 0  );
   }


	/**
	*  set values "0613"
	*/
   	public void setSendCopyGftClose881000True() {  			
    	setFunctionResponse1000( sendCopyGftClose88100088Value);
   	}
	char[] sendCopyGftUnall88100088Value = "0614".toCharArray();
	/**
	 *	Test condition "0614" for isSendCopyGftUnall881000()
	 *	@return  Returns true if isSendCopyGftUnall881000() is "0614"
	 */
   public boolean isSendCopyGftUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0614"
	*/
   	public void setSendCopyGftUnall881000True() {  			
    	setFunctionResponse1000( sendCopyGftUnall88100088Value);
   	}
	char[] sendCopyGftDltalc88100088Value = "0615".toCharArray();
	/**
	 *	Test condition "0615" for isSendCopyGftDltalc881000()
	 *	@return  Returns true if isSendCopyGftDltalc881000() is "0615"
	 */
   public boolean isSendCopyGftDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0615"
	*/
   	public void setSendCopyGftDltalc881000True() {  			
    	setFunctionResponse1000( sendCopyGftDltalc88100088Value);
   	}
	char[] sendCopyGftDltopn88100088Value = "0616".toCharArray();
	/**
	 *	Test condition "0616" for isSendCopyGftDltopn881000()
	 *	@return  Returns true if isSendCopyGftDltopn881000() is "0616"
	 */
   public boolean isSendCopyGftDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0616"
	*/
   	public void setSendCopyGftDltopn881000True() {  			
    	setFunctionResponse1000( sendCopyGftDltopn88100088Value);
   	}
	char[] sendCopyGftDltcls88100088Value = "0617".toCharArray();
	/**
	 *	Test condition "0617" for isSendCopyGftDltcls881000()
	 *	@return  Returns true if isSendCopyGftDltcls881000() is "0617"
	 */
   public boolean isSendCopyGftDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0617"
	*/
   	public void setSendCopyGftDltcls881000True() {  			
    	setFunctionResponse1000( sendCopyGftDltcls88100088Value);
   	}
	char[] sendCopyGftInUse88100088Value = "0618".toCharArray();
	/**
	 *	Test condition "0618" for isSendCopyGftInUse881000()
	 *	@return  Returns true if isSendCopyGftInUse881000() is "0618"
	 */
   public boolean isSendCopyGftInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0618"
	*/
   	public void setSendCopyGftInUse881000True() {  			
    	setFunctionResponse1000( sendCopyGftInUse88100088Value);
   	}
	char[] sendCopyGftNone88100088Value = "0619".toCharArray();
	/**
	 *	Test condition "0619" for isSendCopyGftNone881000()
	 *	@return  Returns true if isSendCopyGftNone881000() is "0619"
	 */
   public boolean isSendCopyGftNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendCopyGftNone88100088Value)  == 0  );
   }


	/**
	*  set values "0619"
	*/
   	public void setSendCopyGftNone881000True() {  			
    	setFunctionResponse1000( sendCopyGftNone88100088Value);
   	}
	char[] sendPrcsXferInsert88100088Value = "0620".toCharArray();
	/**
	 *	Test condition "0620" for isSendPrcsXferInsert881000()
	 *	@return  Returns true if isSendPrcsXferInsert881000() is "0620"
	 */
   public boolean isSendPrcsXferInsert881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsXferInsert88100088Value)  == 0  );
   }


	/**
	*  set values "0620"
	*/
   	public void setSendPrcsXferInsert881000True() {  			
    	setFunctionResponse1000( sendPrcsXferInsert88100088Value);
   	}
	char[] sendPrcsEfpoSelect88100088Value = "0621".toCharArray();
	/**
	 *	Test condition "0621" for isSendPrcsEfpoSelect881000()
	 *	@return  Returns true if isSendPrcsEfpoSelect881000() is "0621"
	 */
   public boolean isSendPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0621"
	*/
   	public void setSendPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( sendPrcsEfpoSelect88100088Value);
   	}
	char[] sendPrcsEptoSelect88100088Value = "0622".toCharArray();
	/**
	 *	Test condition "0622" for isSendPrcsEptoSelect881000()
	 *	@return  Returns true if isSendPrcsEptoSelect881000() is "0622"
	 */
   public boolean isSendPrcsEptoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsEptoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0622"
	*/
   	public void setSendPrcsEptoSelect881000True() {  			
    	setFunctionResponse1000( sendPrcsEptoSelect88100088Value);
   	}
	char[] sendPrcsEfpbSelect88100088Value = "0623".toCharArray();
	/**
	 *	Test condition "0623" for isSendPrcsEfpbSelect881000()
	 *	@return  Returns true if isSendPrcsEfpbSelect881000() is "0623"
	 */
   public boolean isSendPrcsEfpbSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsEfpbSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0623"
	*/
   	public void setSendPrcsEfpbSelect881000True() {  			
    	setFunctionResponse1000( sendPrcsEfpbSelect88100088Value);
   	}
	char[] sendPrcsEptbSelect88100088Value = "0624".toCharArray();
	/**
	 *	Test condition "0624" for isSendPrcsEptbSelect881000()
	 *	@return  Returns true if isSendPrcsEptbSelect881000() is "0624"
	 */
   public boolean isSendPrcsEptbSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsEptbSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0624"
	*/
   	public void setSendPrcsEptbSelect881000True() {  			
    	setFunctionResponse1000( sendPrcsEptbSelect88100088Value);
   	}
	char[] sendPrcsEptbBroken88100088Value = "0625".toCharArray();
	/**
	 *	Test condition "0625" for isSendPrcsEptbBroken881000()
	 *	@return  Returns true if isSendPrcsEptbBroken881000() is "0625"
	 */
   public boolean isSendPrcsEptbBroken881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsEptbBroken88100088Value)  == 0  );
   }


	/**
	*  set values "0625"
	*/
   	public void setSendPrcsEptbBroken881000True() {  			
    	setFunctionResponse1000( sendPrcsEptbBroken88100088Value);
   	}
	char[] sendPrcsEptbLoops88100088Value = "0626".toCharArray();
	/**
	 *	Test condition "0626" for isSendPrcsEptbLoops881000()
	 *	@return  Returns true if isSendPrcsEptbLoops881000() is "0626"
	 */
   public boolean isSendPrcsEptbLoops881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , sendPrcsEptbLoops88100088Value)  == 0  );
   }


	/**
	*  set values "0626"
	*/
   	public void setSendPrcsEptbLoops881000True() {  			
    	setFunctionResponse1000( sendPrcsEptbLoops88100088Value);
   	}
	char[] restPrcsXferNotfnd88100088Value = "0701".toCharArray();
	/**
	 *	Test condition "0701" for isRestPrcsXferNotfnd881000()
	 *	@return  Returns true if isRestPrcsXferNotfnd881000() is "0701"
	 */
   public boolean isRestPrcsXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0701"
	*/
   	public void setRestPrcsXferNotfnd881000True() {  			
    	setFunctionResponse1000( restPrcsXferNotfnd88100088Value);
   	}
	char[] restPrcsXferOpen88100088Value = "0702".toCharArray();
	/**
	 *	Test condition "0702" for isRestPrcsXferOpen881000()
	 *	@return  Returns true if isRestPrcsXferOpen881000() is "0702"
	 */
   public boolean isRestPrcsXferOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0702"
	*/
   	public void setRestPrcsXferOpen881000True() {  			
    	setFunctionResponse1000( restPrcsXferOpen88100088Value);
   	}
	char[] restPrcsXferFetch88100088Value = "0703".toCharArray();
	/**
	 *	Test condition "0703" for isRestPrcsXferFetch881000()
	 *	@return  Returns true if isRestPrcsXferFetch881000() is "0703"
	 */
   public boolean isRestPrcsXferFetch881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferFetch88100088Value)  == 0  );
   }


	/**
	*  set values "0703"
	*/
   	public void setRestPrcsXferFetch881000True() {  			
    	setFunctionResponse1000( restPrcsXferFetch88100088Value);
   	}
	char[] restPrcsXferClose88100088Value = "0704".toCharArray();
	/**
	 *	Test condition "0704" for isRestPrcsXferClose881000()
	 *	@return  Returns true if isRestPrcsXferClose881000() is "0704"
	 */
   public boolean isRestPrcsXferClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferClose88100088Value)  == 0  );
   }


	/**
	*  set values "0704"
	*/
   	public void setRestPrcsXferClose881000True() {  			
    	setFunctionResponse1000( restPrcsXferClose88100088Value);
   	}
	char[] restPrcsXferSelect88100088Value = "0705".toCharArray();
	/**
	 *	Test condition "0705" for isRestPrcsXferSelect881000()
	 *	@return  Returns true if isRestPrcsXferSelect881000() is "0705"
	 */
   public boolean isRestPrcsXferSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0705"
	*/
   	public void setRestPrcsXferSelect881000True() {  			
    	setFunctionResponse1000( restPrcsXferSelect88100088Value);
   	}
	char[] restPrcsXferExitna88100088Value = "0706".toCharArray();
	/**
	 *	Test condition "0706" for isRestPrcsXferExitna881000()
	 *	@return  Returns true if isRestPrcsXferExitna881000() is "0706"
	 */
   public boolean isRestPrcsXferExitna881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferExitna88100088Value)  == 0  );
   }


	/**
	*  set values "0706"
	*/
   	public void setRestPrcsXferExitna881000True() {  			
    	setFunctionResponse1000( restPrcsXferExitna88100088Value);
   	}
	char[] restPrcsXferInsert88100088Value = "0707".toCharArray();
	/**
	 *	Test condition "0707" for isRestPrcsXferInsert881000()
	 *	@return  Returns true if isRestPrcsXferInsert881000() is "0707"
	 */
   public boolean isRestPrcsXferInsert881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsXferInsert88100088Value)  == 0  );
   }


	/**
	*  set values "0707"
	*/
   	public void setRestPrcsXferInsert881000True() {  			
    	setFunctionResponse1000( restPrcsXferInsert88100088Value);
   	}
	char[] restPrcsEfpoNotfnd88100088Value = "0708".toCharArray();
	/**
	 *	Test condition "0708" for isRestPrcsEfpoNotfnd881000()
	 *	@return  Returns true if isRestPrcsEfpoNotfnd881000() is "0708"
	 */
   public boolean isRestPrcsEfpoNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsEfpoNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0708"
	*/
   	public void setRestPrcsEfpoNotfnd881000True() {  			
    	setFunctionResponse1000( restPrcsEfpoNotfnd88100088Value);
   	}
	char[] restPrcsEfpoSelect88100088Value = "0709".toCharArray();
	/**
	 *	Test condition "0709" for isRestPrcsEfpoSelect881000()
	 *	@return  Returns true if isRestPrcsEfpoSelect881000() is "0709"
	 */
   public boolean isRestPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0709"
	*/
   	public void setRestPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( restPrcsEfpoSelect88100088Value);
   	}
	char[] restUpdtXferNotfnd88100088Value = "0710".toCharArray();
	/**
	 *	Test condition "0710" for isRestUpdtXferNotfnd881000()
	 *	@return  Returns true if isRestUpdtXferNotfnd881000() is "0710"
	 */
   public boolean isRestUpdtXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restUpdtXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0710"
	*/
   	public void setRestUpdtXferNotfnd881000True() {  			
    	setFunctionResponse1000( restUpdtXferNotfnd88100088Value);
   	}
	char[] restUpdtXferUpdate88100088Value = "0711".toCharArray();
	/**
	 *	Test condition "0711" for isRestUpdtXferUpdate881000()
	 *	@return  Returns true if isRestUpdtXferUpdate881000() is "0711"
	 */
   public boolean isRestUpdtXferUpdate881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restUpdtXferUpdate88100088Value)  == 0  );
   }


	/**
	*  set values "0711"
	*/
   	public void setRestUpdtXferUpdate881000True() {  			
    	setFunctionResponse1000( restUpdtXferUpdate88100088Value);
   	}
	char[] restUpdtXferCommit88100088Value = "0712".toCharArray();
	/**
	 *	Test condition "0712" for isRestUpdtXferCommit881000()
	 *	@return  Returns true if isRestUpdtXferCommit881000() is "0712"
	 */
   public boolean isRestUpdtXferCommit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , restUpdtXferCommit88100088Value)  == 0  );
   }


	/**
	*  set values "0712"
	*/
   	public void setRestUpdtXferCommit881000True() {  			
    	setFunctionResponse1000( restUpdtXferCommit88100088Value);
   	}
	char[] instCopyApplAlloc88100088Value = "0800".toCharArray();
	/**
	 *	Test condition "0800" for isInstCopyApplAlloc881000()
	 *	@return  Returns true if isInstCopyApplAlloc881000() is "0800"
	 */
   public boolean isInstCopyApplAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0800"
	*/
   	public void setInstCopyApplAlloc881000True() {  			
    	setFunctionResponse1000( instCopyApplAlloc88100088Value);
   	}
	char[] instCopyApplOpen88100088Value = "0801".toCharArray();
	/**
	 *	Test condition "0801" for isInstCopyApplOpen881000()
	 *	@return  Returns true if isInstCopyApplOpen881000() is "0801"
	 */
   public boolean isInstCopyApplOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0801"
	*/
   	public void setInstCopyApplOpen881000True() {  			
    	setFunctionResponse1000( instCopyApplOpen88100088Value);
   	}
	char[] instCopyApplRead88100088Value = "0802".toCharArray();
	/**
	 *	Test condition "0802" for isInstCopyApplRead881000()
	 *	@return  Returns true if isInstCopyApplRead881000() is "0802"
	 */
   public boolean isInstCopyApplRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplRead88100088Value)  == 0  );
   }


	/**
	*  set values "0802"
	*/
   	public void setInstCopyApplRead881000True() {  			
    	setFunctionResponse1000( instCopyApplRead88100088Value);
   	}
	char[] instCopyApplClose88100088Value = "0803".toCharArray();
	/**
	 *	Test condition "0803" for isInstCopyApplClose881000()
	 *	@return  Returns true if isInstCopyApplClose881000() is "0803"
	 */
   public boolean isInstCopyApplClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplClose88100088Value)  == 0  );
   }


	/**
	*  set values "0803"
	*/
   	public void setInstCopyApplClose881000True() {  			
    	setFunctionResponse1000( instCopyApplClose88100088Value);
   	}
	char[] instCopyApplUnall88100088Value = "0804".toCharArray();
	/**
	 *	Test condition "0804" for isInstCopyApplUnall881000()
	 *	@return  Returns true if isInstCopyApplUnall881000() is "0804"
	 */
   public boolean isInstCopyApplUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0804"
	*/
   	public void setInstCopyApplUnall881000True() {  			
    	setFunctionResponse1000( instCopyApplUnall88100088Value);
   	}
	char[] instCopyApplDltalc88100088Value = "0805".toCharArray();
	/**
	 *	Test condition "0805" for isInstCopyApplDltalc881000()
	 *	@return  Returns true if isInstCopyApplDltalc881000() is "0805"
	 */
   public boolean isInstCopyApplDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0805"
	*/
   	public void setInstCopyApplDltalc881000True() {  			
    	setFunctionResponse1000( instCopyApplDltalc88100088Value);
   	}
	char[] instCopyApplDltopn88100088Value = "0806".toCharArray();
	/**
	 *	Test condition "0806" for isInstCopyApplDltopn881000()
	 *	@return  Returns true if isInstCopyApplDltopn881000() is "0806"
	 */
   public boolean isInstCopyApplDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0806"
	*/
   	public void setInstCopyApplDltopn881000True() {  			
    	setFunctionResponse1000( instCopyApplDltopn88100088Value);
   	}
	char[] instCopyApplDltcls88100088Value = "0807".toCharArray();
	/**
	 *	Test condition "0807" for isInstCopyApplDltcls881000()
	 *	@return  Returns true if isInstCopyApplDltcls881000() is "0807"
	 */
   public boolean isInstCopyApplDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0807"
	*/
   	public void setInstCopyApplDltcls881000True() {  			
    	setFunctionResponse1000( instCopyApplDltcls88100088Value);
   	}
	char[] instCopyApplInUse88100088Value = "0808".toCharArray();
	/**
	 *	Test condition "0808" for isInstCopyApplInUse881000()
	 *	@return  Returns true if isInstCopyApplInUse881000() is "0808"
	 */
   public boolean isInstCopyApplInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0808"
	*/
   	public void setInstCopyApplInUse881000True() {  			
    	setFunctionResponse1000( instCopyApplInUse88100088Value);
   	}
	char[] instCopyApplCounts88100088Value = "0809".toCharArray();
	/**
	 *	Test condition "0809" for isInstCopyApplCounts881000()
	 *	@return  Returns true if isInstCopyApplCounts881000() is "0809"
	 */
   public boolean isInstCopyApplCounts881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyApplCounts88100088Value)  == 0  );
   }


	/**
	*  set values "0809"
	*/
   	public void setInstCopyApplCounts881000True() {  			
    	setFunctionResponse1000( instCopyApplCounts88100088Value);
   	}
	char[] instCopyGftAlloc88100088Value = "0810".toCharArray();
	/**
	 *	Test condition "0810" for isInstCopyGftAlloc881000()
	 *	@return  Returns true if isInstCopyGftAlloc881000() is "0810"
	 */
   public boolean isInstCopyGftAlloc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftAlloc88100088Value)  == 0  );
   }


	/**
	*  set values "0810"
	*/
   	public void setInstCopyGftAlloc881000True() {  			
    	setFunctionResponse1000( instCopyGftAlloc88100088Value);
   	}
	char[] instCopyGftOpen88100088Value = "0811".toCharArray();
	/**
	 *	Test condition "0811" for isInstCopyGftOpen881000()
	 *	@return  Returns true if isInstCopyGftOpen881000() is "0811"
	 */
   public boolean isInstCopyGftOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0811"
	*/
   	public void setInstCopyGftOpen881000True() {  			
    	setFunctionResponse1000( instCopyGftOpen88100088Value);
   	}
	char[] instCopyGftWrite88100088Value = "0812".toCharArray();
	/**
	 *	Test condition "0812" for isInstCopyGftWrite881000()
	 *	@return  Returns true if isInstCopyGftWrite881000() is "0812"
	 */
   public boolean isInstCopyGftWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0812"
	*/
   	public void setInstCopyGftWrite881000True() {  			
    	setFunctionResponse1000( instCopyGftWrite88100088Value);
   	}
	char[] instCopyGftClose88100088Value = "0813".toCharArray();
	/**
	 *	Test condition "0813" for isInstCopyGftClose881000()
	 *	@return  Returns true if isInstCopyGftClose881000() is "0813"
	 */
   public boolean isInstCopyGftClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftClose88100088Value)  == 0  );
   }


	/**
	*  set values "0813"
	*/
   	public void setInstCopyGftClose881000True() {  			
    	setFunctionResponse1000( instCopyGftClose88100088Value);
   	}
	char[] instCopyGftUnall88100088Value = "0814".toCharArray();
	/**
	 *	Test condition "0814" for isInstCopyGftUnall881000()
	 *	@return  Returns true if isInstCopyGftUnall881000() is "0814"
	 */
   public boolean isInstCopyGftUnall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftUnall88100088Value)  == 0  );
   }


	/**
	*  set values "0814"
	*/
   	public void setInstCopyGftUnall881000True() {  			
    	setFunctionResponse1000( instCopyGftUnall88100088Value);
   	}
	char[] instCopyGftDltalc88100088Value = "0815".toCharArray();
	/**
	 *	Test condition "0815" for isInstCopyGftDltalc881000()
	 *	@return  Returns true if isInstCopyGftDltalc881000() is "0815"
	 */
   public boolean isInstCopyGftDltalc881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftDltalc88100088Value)  == 0  );
   }


	/**
	*  set values "0815"
	*/
   	public void setInstCopyGftDltalc881000True() {  			
    	setFunctionResponse1000( instCopyGftDltalc88100088Value);
   	}
	char[] instCopyGftDltopn88100088Value = "0816".toCharArray();
	/**
	 *	Test condition "0816" for isInstCopyGftDltopn881000()
	 *	@return  Returns true if isInstCopyGftDltopn881000() is "0816"
	 */
   public boolean isInstCopyGftDltopn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftDltopn88100088Value)  == 0  );
   }


	/**
	*  set values "0816"
	*/
   	public void setInstCopyGftDltopn881000True() {  			
    	setFunctionResponse1000( instCopyGftDltopn88100088Value);
   	}
	char[] instCopyGftDltcls88100088Value = "0817".toCharArray();
	/**
	 *	Test condition "0817" for isInstCopyGftDltcls881000()
	 *	@return  Returns true if isInstCopyGftDltcls881000() is "0817"
	 */
   public boolean isInstCopyGftDltcls881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftDltcls88100088Value)  == 0  );
   }


	/**
	*  set values "0817"
	*/
   	public void setInstCopyGftDltcls881000True() {  			
    	setFunctionResponse1000( instCopyGftDltcls88100088Value);
   	}
	char[] instCopyGftInUse88100088Value = "0818".toCharArray();
	/**
	 *	Test condition "0818" for isInstCopyGftInUse881000()
	 *	@return  Returns true if isInstCopyGftInUse881000() is "0818"
	 */
   public boolean isInstCopyGftInUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftInUse88100088Value)  == 0  );
   }


	/**
	*  set values "0818"
	*/
   	public void setInstCopyGftInUse881000True() {  			
    	setFunctionResponse1000( instCopyGftInUse88100088Value);
   	}
	char[] instCopyGftExists88100088Value = "0819".toCharArray();
	/**
	 *	Test condition "0819" for isInstCopyGftExists881000()
	 *	@return  Returns true if isInstCopyGftExists881000() is "0819"
	 */
   public boolean isInstCopyGftExists881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCopyGftExists88100088Value)  == 0  );
   }


	/**
	*  set values "0819"
	*/
   	public void setInstCopyGftExists881000True() {  			
    	setFunctionResponse1000( instCopyGftExists88100088Value);
   	}
	char[] instPrcsXferInsert88100088Value = "0820".toCharArray();
	/**
	 *	Test condition "0820" for isInstPrcsXferInsert881000()
	 *	@return  Returns true if isInstPrcsXferInsert881000() is "0820"
	 */
   public boolean isInstPrcsXferInsert881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferInsert88100088Value)  == 0  );
   }


	/**
	*  set values "0820"
	*/
   	public void setInstPrcsXferInsert881000True() {  			
    	setFunctionResponse1000( instPrcsXferInsert88100088Value);
   	}
	char[] instPrcsXferOpen88100088Value = "0821".toCharArray();
	/**
	 *	Test condition "0821" for isInstPrcsXferOpen881000()
	 *	@return  Returns true if isInstPrcsXferOpen881000() is "0821"
	 */
   public boolean isInstPrcsXferOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0821"
	*/
   	public void setInstPrcsXferOpen881000True() {  			
    	setFunctionResponse1000( instPrcsXferOpen88100088Value);
   	}
	char[] instPrcsXferFetch88100088Value = "0822".toCharArray();
	/**
	 *	Test condition "0822" for isInstPrcsXferFetch881000()
	 *	@return  Returns true if isInstPrcsXferFetch881000() is "0822"
	 */
   public boolean isInstPrcsXferFetch881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferFetch88100088Value)  == 0  );
   }


	/**
	*  set values "0822"
	*/
   	public void setInstPrcsXferFetch881000True() {  			
    	setFunctionResponse1000( instPrcsXferFetch88100088Value);
   	}
	char[] instPrcsXferClose88100088Value = "0823".toCharArray();
	/**
	 *	Test condition "0823" for isInstPrcsXferClose881000()
	 *	@return  Returns true if isInstPrcsXferClose881000() is "0823"
	 */
   public boolean isInstPrcsXferClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferClose88100088Value)  == 0  );
   }


	/**
	*  set values "0823"
	*/
   	public void setInstPrcsXferClose881000True() {  			
    	setFunctionResponse1000( instPrcsXferClose88100088Value);
   	}
	char[] instPrcsXferNotfnd88100088Value = "0824".toCharArray();
	/**
	 *	Test condition "0824" for isInstPrcsXferNotfnd881000()
	 *	@return  Returns true if isInstPrcsXferNotfnd881000() is "0824"
	 */
   public boolean isInstPrcsXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0824"
	*/
   	public void setInstPrcsXferNotfnd881000True() {  			
    	setFunctionResponse1000( instPrcsXferNotfnd88100088Value);
   	}
	char[] instPrcsXferSelect88100088Value = "0825".toCharArray();
	/**
	 *	Test condition "0825" for isInstPrcsXferSelect881000()
	 *	@return  Returns true if isInstPrcsXferSelect881000() is "0825"
	 */
   public boolean isInstPrcsXferSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0825"
	*/
   	public void setInstPrcsXferSelect881000True() {  			
    	setFunctionResponse1000( instPrcsXferSelect88100088Value);
   	}
	char[] instPrcsEptoSelect88100088Value = "0826".toCharArray();
	/**
	 *	Test condition "0826" for isInstPrcsEptoSelect881000()
	 *	@return  Returns true if isInstPrcsEptoSelect881000() is "0826"
	 */
   public boolean isInstPrcsEptoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsEptoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0826"
	*/
   	public void setInstPrcsEptoSelect881000True() {  			
    	setFunctionResponse1000( instPrcsEptoSelect88100088Value);
   	}
	char[] instCmptXferNotfnd88100088Value = "0827".toCharArray();
	/**
	 *	Test condition "0827" for isInstCmptXferNotfnd881000()
	 *	@return  Returns true if isInstCmptXferNotfnd881000() is "0827"
	 */
   public boolean isInstCmptXferNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCmptXferNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0827"
	*/
   	public void setInstCmptXferNotfnd881000True() {  			
    	setFunctionResponse1000( instCmptXferNotfnd88100088Value);
   	}
	char[] instCmptXferUpdate88100088Value = "0828".toCharArray();
	/**
	 *	Test condition "0828" for isInstCmptXferUpdate881000()
	 *	@return  Returns true if isInstCmptXferUpdate881000() is "0828"
	 */
   public boolean isInstCmptXferUpdate881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instCmptXferUpdate88100088Value)  == 0  );
   }


	/**
	*  set values "0828"
	*/
   	public void setInstCmptXferUpdate881000True() {  			
    	setFunctionResponse1000( instCmptXferUpdate88100088Value);
   	}
	char[] instExitXferEmpty88100088Value = "0829".toCharArray();
	/**
	 *	Test condition "0829" for isInstExitXferEmpty881000()
	 *	@return  Returns true if isInstExitXferEmpty881000() is "0829"
	 */
   public boolean isInstExitXferEmpty881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instExitXferEmpty88100088Value)  == 0  );
   }


	/**
	*  set values "0829"
	*/
   	public void setInstExitXferEmpty881000True() {  			
    	setFunctionResponse1000( instExitXferEmpty88100088Value);
   	}
	char[] instExitXferNoexit88100088Value = "0830".toCharArray();
	/**
	 *	Test condition "0830" for isInstExitXferNoexit881000()
	 *	@return  Returns true if isInstExitXferNoexit881000() is "0830"
	 */
   public boolean isInstExitXferNoexit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instExitXferNoexit88100088Value)  == 0  );
   }


	/**
	*  set values "0830"
	*/
   	public void setInstExitXferNoexit881000True() {  			
    	setFunctionResponse1000( instExitXferNoexit88100088Value);
   	}
	char[] instExitXferStatus88100088Value = "0831".toCharArray();
	/**
	 *	Test condition "0831" for isInstExitXferStatus881000()
	 *	@return  Returns true if isInstExitXferStatus881000() is "0831"
	 */
   public boolean isInstExitXferStatus881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instExitXferStatus88100088Value)  == 0  );
   }


	/**
	*  set values "0831"
	*/
   	public void setInstExitXferStatus881000True() {  			
    	setFunctionResponse1000( instExitXferStatus88100088Value);
   	}
	char[] instPrcsRsltOpen88100088Value = "0832".toCharArray();
	/**
	 *	Test condition "0832" for isInstPrcsRsltOpen881000()
	 *	@return  Returns true if isInstPrcsRsltOpen881000() is "0832"
	 */
   public boolean isInstPrcsRsltOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsRsltOpen88100088Value)  == 0  );
   }


	/**
	*  set values "0832"
	*/
   	public void setInstPrcsRsltOpen881000True() {  			
    	setFunctionResponse1000( instPrcsRsltOpen88100088Value);
   	}
	char[] instPrcsRsltWrite88100088Value = "0833".toCharArray();
	/**
	 *	Test condition "0833" for isInstPrcsRsltWrite881000()
	 *	@return  Returns true if isInstPrcsRsltWrite881000() is "0833"
	 */
   public boolean isInstPrcsRsltWrite881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsRsltWrite88100088Value)  == 0  );
   }


	/**
	*  set values "0833"
	*/
   	public void setInstPrcsRsltWrite881000True() {  			
    	setFunctionResponse1000( instPrcsRsltWrite88100088Value);
   	}
	char[] instPrcsRsltClose88100088Value = "0834".toCharArray();
	/**
	 *	Test condition "0834" for isInstPrcsRsltClose881000()
	 *	@return  Returns true if isInstPrcsRsltClose881000() is "0834"
	 */
   public boolean isInstPrcsRsltClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsRsltClose88100088Value)  == 0  );
   }


	/**
	*  set values "0834"
	*/
   	public void setInstPrcsRsltClose881000True() {  			
    	setFunctionResponse1000( instPrcsRsltClose88100088Value);
   	}
	char[] instPrcsEfpoNotfnd88100088Value = "0835".toCharArray();
	/**
	 *	Test condition "0835" for isInstPrcsEfpoNotfnd881000()
	 *	@return  Returns true if isInstPrcsEfpoNotfnd881000() is "0835"
	 */
   public boolean isInstPrcsEfpoNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsEfpoNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0835"
	*/
   	public void setInstPrcsEfpoNotfnd881000True() {  			
    	setFunctionResponse1000( instPrcsEfpoNotfnd88100088Value);
   	}
	char[] instPrcsEfpoSelect88100088Value = "0836".toCharArray();
	/**
	 *	Test condition "0836" for isInstPrcsEfpoSelect881000()
	 *	@return  Returns true if isInstPrcsEfpoSelect881000() is "0836"
	 */
   public boolean isInstPrcsEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0836"
	*/
   	public void setInstPrcsEfpoSelect881000True() {  			
    	setFunctionResponse1000( instPrcsEfpoSelect88100088Value);
   	}
	char[] instStndEfpoNotfnd88100088Value = "0837".toCharArray();
	/**
	 *	Test condition "0837" for isInstStndEfpoNotfnd881000()
	 *	@return  Returns true if isInstStndEfpoNotfnd881000() is "0837"
	 */
   public boolean isInstStndEfpoNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instStndEfpoNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "0837"
	*/
   	public void setInstStndEfpoNotfnd881000True() {  			
    	setFunctionResponse1000( instStndEfpoNotfnd88100088Value);
   	}
	char[] instStndEfpoSelect88100088Value = "0838".toCharArray();
	/**
	 *	Test condition "0838" for isInstStndEfpoSelect881000()
	 *	@return  Returns true if isInstStndEfpoSelect881000() is "0838"
	 */
   public boolean isInstStndEfpoSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instStndEfpoSelect88100088Value)  == 0  );
   }


	/**
	*  set values "0838"
	*/
   	public void setInstStndEfpoSelect881000True() {  			
    	setFunctionResponse1000( instStndEfpoSelect88100088Value);
   	}
	char[] instPrcsXferCheck88100088Value = "0839".toCharArray();
	/**
	 *	Test condition "0839" for isInstPrcsXferCheck881000()
	 *	@return  Returns true if isInstPrcsXferCheck881000() is "0839"
	 */
   public boolean isInstPrcsXferCheck881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , instPrcsXferCheck88100088Value)  == 0  );
   }


	/**
	*  set values "0839"
	*/
   	public void setInstPrcsXferCheck881000True() {  			
    	setFunctionResponse1000( instPrcsXferCheck88100088Value);
   	}
	char[] functionInvalid88100088Value = "9000".toCharArray();
	/**
	 *	Test condition "9000" for isFunctionInvalid881000()
	 *	@return  Returns true if isFunctionInvalid881000() is "9000"
	 */
   public boolean isFunctionInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , functionInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9000"
	*/
   	public void setFunctionInvalid881000True() {  			
    	setFunctionResponse1000( functionInvalid88100088Value);
   	}
	char[] setupPrflRecfm88100088Value = "9011".toCharArray();
	/**
	 *	Test condition "9011" for isSetupPrflRecfm881000()
	 *	@return  Returns true if isSetupPrflRecfm881000() is "9011"
	 */
   public boolean isSetupPrflRecfm881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupPrflRecfm88100088Value)  == 0  );
   }


	/**
	*  set values "9011"
	*/
   	public void setSetupPrflRecfm881000True() {  			
    	setFunctionResponse1000( setupPrflRecfm88100088Value);
   	}
	char[] setupPrflLrecl88100088Value = "9012".toCharArray();
	/**
	 *	Test condition "9012" for isSetupPrflLrecl881000()
	 *	@return  Returns true if isSetupPrflLrecl881000() is "9012"
	 */
   public boolean isSetupPrflLrecl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupPrflLrecl88100088Value)  == 0  );
   }


	/**
	*  set values "9012"
	*/
   	public void setSetupPrflLrecl881000True() {  			
    	setFunctionResponse1000( setupPrflLrecl88100088Value);
   	}
	char[] setupPrflBlksz88100088Value = "9013".toCharArray();
	/**
	 *	Test condition "9013" for isSetupPrflBlksz881000()
	 *	@return  Returns true if isSetupPrflBlksz881000() is "9013"
	 */
   public boolean isSetupPrflBlksz881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupPrflBlksz88100088Value)  == 0  );
   }


	/**
	*  set values "9013"
	*/
   	public void setSetupPrflBlksz881000True() {  			
    	setFunctionResponse1000( setupPrflBlksz88100088Value);
   	}
	char[] setupPrflSystemId88100088Value = "9014".toCharArray();
	/**
	 *	Test condition "9014" for isSetupPrflSystemId881000()
	 *	@return  Returns true if isSetupPrflSystemId881000() is "9014"
	 */
   public boolean isSetupPrflSystemId881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupPrflSystemId88100088Value)  == 0  );
   }


	/**
	*  set values "9014"
	*/
   	public void setSetupPrflSystemId881000True() {  			
    	setFunctionResponse1000( setupPrflSystemId88100088Value);
   	}
	char[] setupApplRecfm88100088Value = "9021".toCharArray();
	/**
	 *	Test condition "9021" for isSetupApplRecfm881000()
	 *	@return  Returns true if isSetupApplRecfm881000() is "9021"
	 */
   public boolean isSetupApplRecfm881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupApplRecfm88100088Value)  == 0  );
   }


	/**
	*  set values "9021"
	*/
   	public void setSetupApplRecfm881000True() {  			
    	setFunctionResponse1000( setupApplRecfm88100088Value);
   	}
	char[] setupApplLrecl88100088Value = "9022".toCharArray();
	/**
	 *	Test condition "9022" for isSetupApplLrecl881000()
	 *	@return  Returns true if isSetupApplLrecl881000() is "9022"
	 */
   public boolean isSetupApplLrecl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupApplLrecl88100088Value)  == 0  );
   }


	/**
	*  set values "9022"
	*/
   	public void setSetupApplLrecl881000True() {  			
    	setFunctionResponse1000( setupApplLrecl88100088Value);
   	}
	char[] setupApplBlksz88100088Value = "9023".toCharArray();
	/**
	 *	Test condition "9023" for isSetupApplBlksz881000()
	 *	@return  Returns true if isSetupApplBlksz881000() is "9023"
	 */
   public boolean isSetupApplBlksz881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupApplBlksz88100088Value)  == 0  );
   }


	/**
	*  set values "9023"
	*/
   	public void setSetupApplBlksz881000True() {  			
    	setFunctionResponse1000( setupApplBlksz88100088Value);
   	}
	char[] setupApplAtype88100088Value = "9024".toCharArray();
	/**
	 *	Test condition "9024" for isSetupApplAtype881000()
	 *	@return  Returns true if isSetupApplAtype881000() is "9024"
	 */
   public boolean isSetupApplAtype881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupApplAtype88100088Value)  == 0  );
   }


	/**
	*  set values "9024"
	*/
   	public void setSetupApplAtype881000True() {  			
    	setFunctionResponse1000( setupApplAtype88100088Value);
   	}
	char[] setupGftRecfm88100088Value = "9031".toCharArray();
	/**
	 *	Test condition "9031" for isSetupGftRecfm881000()
	 *	@return  Returns true if isSetupGftRecfm881000() is "9031"
	 */
   public boolean isSetupGftRecfm881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupGftRecfm88100088Value)  == 0  );
   }


	/**
	*  set values "9031"
	*/
   	public void setSetupGftRecfm881000True() {  			
    	setFunctionResponse1000( setupGftRecfm88100088Value);
   	}
	char[] setupGftLrecl88100088Value = "9032".toCharArray();
	/**
	 *	Test condition "9032" for isSetupGftLrecl881000()
	 *	@return  Returns true if isSetupGftLrecl881000() is "9032"
	 */
   public boolean isSetupGftLrecl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupGftLrecl88100088Value)  == 0  );
   }


	/**
	*  set values "9032"
	*/
   	public void setSetupGftLrecl881000True() {  			
    	setFunctionResponse1000( setupGftLrecl88100088Value);
   	}
	char[] setupGftBlksz88100088Value = "9033".toCharArray();
	/**
	 *	Test condition "9033" for isSetupGftBlksz881000()
	 *	@return  Returns true if isSetupGftBlksz881000() is "9033"
	 */
   public boolean isSetupGftBlksz881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupGftBlksz88100088Value)  == 0  );
   }


	/**
	*  set values "9033"
	*/
   	public void setSetupGftBlksz881000True() {  			
    	setFunctionResponse1000( setupGftBlksz88100088Value);
   	}
	char[] setupGftAtype88100088Value = "9034".toCharArray();
	/**
	 *	Test condition "9034" for isSetupGftAtype881000()
	 *	@return  Returns true if isSetupGftAtype881000() is "9034"
	 */
   public boolean isSetupGftAtype881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupGftAtype88100088Value)  == 0  );
   }


	/**
	*  set values "9034"
	*/
   	public void setSetupGftAtype881000True() {  			
    	setFunctionResponse1000( setupGftAtype88100088Value);
   	}
	char[] setupExitFormat88100088Value = "9045".toCharArray();
	/**
	 *	Test condition "9045" for isSetupExitFormat881000()
	 *	@return  Returns true if isSetupExitFormat881000() is "9045"
	 */
   public boolean isSetupExitFormat881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , setupExitFormat88100088Value)  == 0  );
   }


	/**
	*  set values "9045"
	*/
   	public void setSetupExitFormat881000True() {  			
    	setFunctionResponse1000( setupExitFormat88100088Value);
   	}
	char[] parmCtrlDbid88100088Value = "9101".toCharArray();
	/**
	 *	Test condition "9101" for isParmCtrlDbid881000()
	 *	@return  Returns true if isParmCtrlDbid881000() is "9101"
	 */
   public boolean isParmCtrlDbid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCtrlDbid88100088Value)  == 0  );
   }


	/**
	*  set values "9101"
	*/
   	public void setParmCtrlDbid881000True() {  			
    	setFunctionResponse1000( parmCtrlDbid88100088Value);
   	}
	char[] parmCtrlDbpkg88100088Value = "9102".toCharArray();
	/**
	 *	Test condition "9102" for isParmCtrlDbpkg881000()
	 *	@return  Returns true if isParmCtrlDbpkg881000() is "9102"
	 */
   public boolean isParmCtrlDbpkg881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCtrlDbpkg88100088Value)  == 0  );
   }


	/**
	*  set values "9102"
	*/
   	public void setParmCtrlDbpkg881000True() {  			
    	setFunctionResponse1000( parmCtrlDbpkg88100088Value);
   	}
	char[] parmCtrlHlqid88100088Value = "9103".toCharArray();
	/**
	 *	Test condition "9103" for isParmCtrlHlqid881000()
	 *	@return  Returns true if isParmCtrlHlqid881000() is "9103"
	 */
   public boolean isParmCtrlHlqid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCtrlHlqid88100088Value)  == 0  );
   }


	/**
	*  set values "9103"
	*/
   	public void setParmCtrlHlqid881000True() {  			
    	setFunctionResponse1000( parmCtrlHlqid88100088Value);
   	}
	char[] connUserdbSetup88100088Value = "9200".toCharArray();
	/**
	 *	Test condition "9200" for isConnUserdbSetup881000()
	 *	@return  Returns true if isConnUserdbSetup881000() is "9200"
	 */
   public boolean isConnUserdbSetup881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connUserdbSetup88100088Value)  == 0  );
   }


	/**
	*  set values "9200"
	*/
   	public void setConnUserdbSetup881000True() {  			
    	setFunctionResponse1000( connUserdbSetup88100088Value);
   	}
	char[] connUserpkgSetup88100088Value = "9201".toCharArray();
	/**
	 *	Test condition "9201" for isConnUserpkgSetup881000()
	 *	@return  Returns true if isConnUserpkgSetup881000() is "9201"
	 */
   public boolean isConnUserpkgSetup881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connUserpkgSetup88100088Value)  == 0  );
   }


	/**
	*  set values "9201"
	*/
   	public void setConnUserpkgSetup881000True() {  			
    	setFunctionResponse1000( connUserpkgSetup88100088Value);
   	}
	char[] connUserpkgSet88100088Value = "9202".toCharArray();
	/**
	 *	Test condition "9202" for isConnUserpkgSet881000()
	 *	@return  Returns true if isConnUserpkgSet881000() is "9202"
	 */
   public boolean isConnUserpkgSet881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connUserpkgSet88100088Value)  == 0  );
   }


	/**
	*  set values "9202"
	*/
   	public void setConnUserpkgSet881000True() {  			
    	setFunctionResponse1000( connUserpkgSet88100088Value);
   	}
	char[] connUserdbConnect88100088Value = "9203".toCharArray();
	/**
	 *	Test condition "9203" for isConnUserdbConnect881000()
	 *	@return  Returns true if isConnUserdbConnect881000() is "9203"
	 */
   public boolean isConnUserdbConnect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connUserdbConnect88100088Value)  == 0  );
   }


	/**
	*  set values "9203"
	*/
   	public void setConnUserdbConnect881000True() {  			
    	setFunctionResponse1000( connUserdbConnect88100088Value);
   	}
	char[] connGftpkgSet88100088Value = "9212".toCharArray();
	/**
	 *	Test condition "9212" for isConnGftpkgSet881000()
	 *	@return  Returns true if isConnGftpkgSet881000() is "9212"
	 */
   public boolean isConnGftpkgSet881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connGftpkgSet88100088Value)  == 0  );
   }


	/**
	*  set values "9212"
	*/
   	public void setConnGftpkgSet881000True() {  			
    	setFunctionResponse1000( connGftpkgSet88100088Value);
   	}
	char[] connGftdbConnect88100088Value = "9213".toCharArray();
	/**
	 *	Test condition "9213" for isConnGftdbConnect881000()
	 *	@return  Returns true if isConnGftdbConnect881000() is "9213"
	 */
   public boolean isConnGftdbConnect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connGftdbConnect88100088Value)  == 0  );
   }


	/**
	*  set values "9213"
	*/
   	public void setConnGftdbConnect881000True() {  			
    	setFunctionResponse1000( connGftdbConnect88100088Value);
   	}
	char[] connGftdbRelease88100088Value = "9214".toCharArray();
	/**
	 *	Test condition "9214" for isConnGftdbRelease881000()
	 *	@return  Returns true if isConnGftdbRelease881000() is "9214"
	 */
   public boolean isConnGftdbRelease881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connGftdbRelease88100088Value)  == 0  );
   }


	/**
	*  set values "9214"
	*/
   	public void setConnGftdbRelease881000True() {  			
    	setFunctionResponse1000( connGftdbRelease88100088Value);
   	}
	char[] connGftdbRollback88100088Value = "9218".toCharArray();
	/**
	 *	Test condition "9218" for isConnGftdbRollback881000()
	 *	@return  Returns true if isConnGftdbRollback881000() is "9218"
	 */
   public boolean isConnGftdbRollback881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connGftdbRollback88100088Value)  == 0  );
   }


	/**
	*  set values "9218"
	*/
   	public void setConnGftdbRollback881000True() {  			
    	setFunctionResponse1000( connGftdbRollback88100088Value);
   	}
	char[] connGftdbCommit88100088Value = "9219".toCharArray();
	/**
	 *	Test condition "9219" for isConnGftdbCommit881000()
	 *	@return  Returns true if isConnGftdbCommit881000() is "9219"
	 */
   public boolean isConnGftdbCommit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , connGftdbCommit88100088Value)  == 0  );
   }


	/**
	*  set values "9219"
	*/
   	public void setConnGftdbCommit881000True() {  			
    	setFunctionResponse1000( connGftdbCommit88100088Value);
   	}
	char[] spgmDynamInit88100088Value = "9300".toCharArray();
	/**
	 *	Test condition "9300" for isSpgmDynamInit881000()
	 *	@return  Returns true if isSpgmDynamInit881000() is "9300"
	 */
   public boolean isSpgmDynamInit881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmDynamInit88100088Value)  == 0  );
   }


	/**
	*  set values "9300"
	*/
   	public void setSpgmDynamInit881000True() {  			
    	setFunctionResponse1000( spgmDynamInit88100088Value);
   	}
	char[] spgmDynamEnd88100088Value = "9309".toCharArray();
	/**
	 *	Test condition "9309" for isSpgmDynamEnd881000()
	 *	@return  Returns true if isSpgmDynamEnd881000() is "9309"
	 */
   public boolean isSpgmDynamEnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmDynamEnd88100088Value)  == 0  );
   }


	/**
	*  set values "9309"
	*/
   	public void setSpgmDynamEnd881000True() {  			
    	setFunctionResponse1000( spgmDynamEnd88100088Value);
   	}
	char[] spgmListdsiLinkage88100088Value = "9310".toCharArray();
	/**
	 *	Test condition "9310" for isSpgmListdsiLinkage881000()
	 *	@return  Returns true if isSpgmListdsiLinkage881000() is "9310"
	 */
   public boolean isSpgmListdsiLinkage881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiLinkage88100088Value)  == 0  );
   }


	/**
	*  set values "9310"
	*/
   	public void setSpgmListdsiLinkage881000True() {  			
    	setFunctionResponse1000( spgmListdsiLinkage88100088Value);
   	}
	char[] spgmListdsiTsoe88100088Value = "9311".toCharArray();
	/**
	 *	Test condition "9311" for isSpgmListdsiTsoe881000()
	 *	@return  Returns true if isSpgmListdsiTsoe881000() is "9311"
	 */
   public boolean isSpgmListdsiTsoe881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiTsoe88100088Value)  == 0  );
   }


	/**
	*  set values "9311"
	*/
   	public void setSpgmListdsiTsoe881000True() {  			
    	setFunctionResponse1000( spgmListdsiTsoe88100088Value);
   	}
	char[] spgmListdsiCall88100088Value = "9312".toCharArray();
	/**
	 *	Test condition "9312" for isSpgmListdsiCall881000()
	 *	@return  Returns true if isSpgmListdsiCall881000() is "9312"
	 */
   public boolean isSpgmListdsiCall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiCall88100088Value)  == 0  );
   }


	/**
	*  set values "9312"
	*/
   	public void setSpgmListdsiCall881000True() {  			
    	setFunctionResponse1000( spgmListdsiCall88100088Value);
   	}
	char[] spgmListdsiFunction88100088Value = "9313".toCharArray();
	/**
	 *	Test condition "9313" for isSpgmListdsiFunction881000()
	 *	@return  Returns true if isSpgmListdsiFunction881000() is "9313"
	 */
   public boolean isSpgmListdsiFunction881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiFunction88100088Value)  == 0  );
   }


	/**
	*  set values "9313"
	*/
   	public void setSpgmListdsiFunction881000True() {  			
    	setFunctionResponse1000( spgmListdsiFunction88100088Value);
   	}
	char[] spgmListdsiParam88100088Value = "9314".toCharArray();
	/**
	 *	Test condition "9314" for isSpgmListdsiParam881000()
	 *	@return  Returns true if isSpgmListdsiParam881000() is "9314"
	 */
   public boolean isSpgmListdsiParam881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiParam88100088Value)  == 0  );
   }


	/**
	*  set values "9314"
	*/
   	public void setSpgmListdsiParam881000True() {  			
    	setFunctionResponse1000( spgmListdsiParam88100088Value);
   	}
	char[] spgmListdsiNogdg88100088Value = "9315".toCharArray();
	/**
	 *	Test condition "9315" for isSpgmListdsiNogdg881000()
	 *	@return  Returns true if isSpgmListdsiNogdg881000() is "9315"
	 */
   public boolean isSpgmListdsiNogdg881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiNogdg88100088Value)  == 0  );
   }


	/**
	*  set values "9315"
	*/
   	public void setSpgmListdsiNogdg881000True() {  			
    	setFunctionResponse1000( spgmListdsiNogdg88100088Value);
   	}
	char[] spgmListdsiNombr88100088Value = "9316".toCharArray();
	/**
	 *	Test condition "9316" for isSpgmListdsiNombr881000()
	 *	@return  Returns true if isSpgmListdsiNombr881000() is "9316"
	 */
   public boolean isSpgmListdsiNombr881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiNombr88100088Value)  == 0  );
   }


	/**
	*  set values "9316"
	*/
   	public void setSpgmListdsiNombr881000True() {  			
    	setFunctionResponse1000( spgmListdsiNombr88100088Value);
   	}
	char[] spgmListdsiProt88100088Value = "9317".toCharArray();
	/**
	 *	Test condition "9317" for isSpgmListdsiProt881000()
	 *	@return  Returns true if isSpgmListdsiProt881000() is "9317"
	 */
   public boolean isSpgmListdsiProt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiProt88100088Value)  == 0  );
   }


	/**
	*  set values "9317"
	*/
   	public void setSpgmListdsiProt881000True() {  			
    	setFunctionResponse1000( spgmListdsiProt88100088Value);
   	}
	char[] spgmListdsiPdsna88100088Value = "9318".toCharArray();
	/**
	 *	Test condition "9318" for isSpgmListdsiPdsna881000()
	 *	@return  Returns true if isSpgmListdsiPdsna881000() is "9318"
	 */
   public boolean isSpgmListdsiPdsna881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiPdsna88100088Value)  == 0  );
   }


	/**
	*  set values "9318"
	*/
   	public void setSpgmListdsiPdsna881000True() {  			
    	setFunctionResponse1000( spgmListdsiPdsna88100088Value);
   	}
	char[] spgmListdsiUnknown88100088Value = "9319".toCharArray();
	/**
	 *	Test condition "9319" for isSpgmListdsiUnknown881000()
	 *	@return  Returns true if isSpgmListdsiUnknown881000() is "9319"
	 */
   public boolean isSpgmListdsiUnknown881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmListdsiUnknown88100088Value)  == 0  );
   }


	/**
	*  set values "9319"
	*/
   	public void setSpgmListdsiUnknown881000True() {  			
    	setFunctionResponse1000( spgmListdsiUnknown88100088Value);
   	}
	char[] spgmReportError88100088Value = "9320".toCharArray();
	/**
	 *	Test condition "9320" for isSpgmReportError881000()
	 *	@return  Returns true if isSpgmReportError881000() is "9320"
	 */
   public boolean isSpgmReportError881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmReportError88100088Value)  == 0  );
   }


	/**
	*  set values "9320"
	*/
   	public void setSpgmReportError881000True() {  			
    	setFunctionResponse1000( spgmReportError88100088Value);
   	}
	char[] spgmReportOrder88100088Value = "9321".toCharArray();
	/**
	 *	Test condition "9321" for isSpgmReportOrder881000()
	 *	@return  Returns true if isSpgmReportOrder881000() is "9321"
	 */
   public boolean isSpgmReportOrder881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmReportOrder88100088Value)  == 0  );
   }


	/**
	*  set values "9321"
	*/
   	public void setSpgmReportOrder881000True() {  			
    	setFunctionResponse1000( spgmReportOrder88100088Value);
   	}
	char[] spgmReportSyslst88100088Value = "9322".toCharArray();
	/**
	 *	Test condition "9322" for isSpgmReportSyslst881000()
	 *	@return  Returns true if isSpgmReportSyslst881000() is "9322"
	 */
   public boolean isSpgmReportSyslst881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmReportSyslst88100088Value)  == 0  );
   }


	/**
	*  set values "9322"
	*/
   	public void setSpgmReportSyslst881000True() {  			
    	setFunctionResponse1000( spgmReportSyslst88100088Value);
   	}
	char[] spgmReportEntry88100088Value = "9323".toCharArray();
	/**
	 *	Test condition "9323" for isSpgmReportEntry881000()
	 *	@return  Returns true if isSpgmReportEntry881000() is "9323"
	 */
   public boolean isSpgmReportEntry881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmReportEntry88100088Value)  == 0  );
   }


	/**
	*  set values "9323"
	*/
   	public void setSpgmReportEntry881000True() {  			
    	setFunctionResponse1000( spgmReportEntry88100088Value);
   	}
	char[] spgmReportUnknown88100088Value = "9329".toCharArray();
	/**
	 *	Test condition "9329" for isSpgmReportUnknown881000()
	 *	@return  Returns true if isSpgmReportUnknown881000() is "9329"
	 */
   public boolean isSpgmReportUnknown881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmReportUnknown88100088Value)  == 0  );
   }


	/**
	*  set values "9329"
	*/
   	public void setSpgmReportUnknown881000True() {  			
    	setFunctionResponse1000( spgmReportUnknown88100088Value);
   	}
	char[] spgmRenameTsoe88100088Value = "9331".toCharArray();
	/**
	 *	Test condition "9331" for isSpgmRenameTsoe881000()
	 *	@return  Returns true if isSpgmRenameTsoe881000() is "9331"
	 */
   public boolean isSpgmRenameTsoe881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameTsoe88100088Value)  == 0  );
   }


	/**
	*  set values "9331"
	*/
   	public void setSpgmRenameTsoe881000True() {  			
    	setFunctionResponse1000( spgmRenameTsoe88100088Value);
   	}
	char[] spgmRenameCall88100088Value = "9332".toCharArray();
	/**
	 *	Test condition "9332" for isSpgmRenameCall881000()
	 *	@return  Returns true if isSpgmRenameCall881000() is "9332"
	 */
   public boolean isSpgmRenameCall881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameCall88100088Value)  == 0  );
   }


	/**
	*  set values "9332"
	*/
   	public void setSpgmRenameCall881000True() {  			
    	setFunctionResponse1000( spgmRenameCall88100088Value);
   	}
	char[] spgmRenameFunction88100088Value = "9333".toCharArray();
	/**
	 *	Test condition "9333" for isSpgmRenameFunction881000()
	 *	@return  Returns true if isSpgmRenameFunction881000() is "9333"
	 */
   public boolean isSpgmRenameFunction881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameFunction88100088Value)  == 0  );
   }


	/**
	*  set values "9333"
	*/
   	public void setSpgmRenameFunction881000True() {  			
    	setFunctionResponse1000( spgmRenameFunction88100088Value);
   	}
	char[] spgmRenameGftCatal88100088Value = "9334".toCharArray();
	/**
	 *	Test condition "9334" for isSpgmRenameGftCatal881000()
	 *	@return  Returns true if isSpgmRenameGftCatal881000() is "9334"
	 */
   public boolean isSpgmRenameGftCatal881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameGftCatal88100088Value)  == 0  );
   }


	/**
	*  set values "9334"
	*/
   	public void setSpgmRenameGftCatal881000True() {  			
    	setFunctionResponse1000( spgmRenameGftCatal88100088Value);
   	}
	char[] spgmRenameApplUse88100088Value = "9335".toCharArray();
	/**
	 *	Test condition "9335" for isSpgmRenameApplUse881000()
	 *	@return  Returns true if isSpgmRenameApplUse881000() is "9335"
	 */
   public boolean isSpgmRenameApplUse881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameApplUse88100088Value)  == 0  );
   }


	/**
	*  set values "9335"
	*/
   	public void setSpgmRenameApplUse881000True() {  			
    	setFunctionResponse1000( spgmRenameApplUse88100088Value);
   	}
	char[] spgmRenameApplNone88100088Value = "9336".toCharArray();
	/**
	 *	Test condition "9336" for isSpgmRenameApplNone881000()
	 *	@return  Returns true if isSpgmRenameApplNone881000() is "9336"
	 */
   public boolean isSpgmRenameApplNone881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameApplNone88100088Value)  == 0  );
   }


	/**
	*  set values "9336"
	*/
   	public void setSpgmRenameApplNone881000True() {  			
    	setFunctionResponse1000( spgmRenameApplNone88100088Value);
   	}
	char[] spgmRenameApplDsn88100088Value = "9337".toCharArray();
	/**
	 *	Test condition "9337" for isSpgmRenameApplDsn881000()
	 *	@return  Returns true if isSpgmRenameApplDsn881000() is "9337"
	 */
   public boolean isSpgmRenameApplDsn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameApplDsn88100088Value)  == 0  );
   }


	/**
	*  set values "9337"
	*/
   	public void setSpgmRenameApplDsn881000True() {  			
    	setFunctionResponse1000( spgmRenameApplDsn88100088Value);
   	}
	char[] spgmRenameGftDsn88100088Value = "9338".toCharArray();
	/**
	 *	Test condition "9338" for isSpgmRenameGftDsn881000()
	 *	@return  Returns true if isSpgmRenameGftDsn881000() is "9338"
	 */
   public boolean isSpgmRenameGftDsn881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameGftDsn88100088Value)  == 0  );
   }


	/**
	*  set values "9338"
	*/
   	public void setSpgmRenameGftDsn881000True() {  			
    	setFunctionResponse1000( spgmRenameGftDsn88100088Value);
   	}
	char[] spgmRenameUnknown88100088Value = "9339".toCharArray();
	/**
	 *	Test condition "9339" for isSpgmRenameUnknown881000()
	 *	@return  Returns true if isSpgmRenameUnknown881000() is "9339"
	 */
   public boolean isSpgmRenameUnknown881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmRenameUnknown88100088Value)  == 0  );
   }


	/**
	*  set values "9339"
	*/
   	public void setSpgmRenameUnknown881000True() {  			
    	setFunctionResponse1000( spgmRenameUnknown88100088Value);
   	}
	char[] spgmConfigError88100088Value = "9340".toCharArray();
	/**
	 *	Test condition "9340" for isSpgmConfigError881000()
	 *	@return  Returns true if isSpgmConfigError881000() is "9340"
	 */
   public boolean isSpgmConfigError881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmConfigError88100088Value)  == 0  );
   }


	/**
	*  set values "9340"
	*/
   	public void setSpgmConfigError881000True() {  			
    	setFunctionResponse1000( spgmConfigError88100088Value);
   	}
	char[] spgmMcinfoError88100088Value = "9341".toCharArray();
	/**
	 *	Test condition "9341" for isSpgmMcinfoError881000()
	 *	@return  Returns true if isSpgmMcinfoError881000() is "9341"
	 */
   public boolean isSpgmMcinfoError881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , spgmMcinfoError88100088Value)  == 0  );
   }


	/**
	*  set values "9341"
	*/
   	public void setSpgmMcinfoError881000True() {  			
    	setFunctionResponse1000( spgmMcinfoError88100088Value);
   	}
	char[] parmCopybookPgmid88100088Value = "9400".toCharArray();
	/**
	 *	Test condition "9400" for isParmCopybookPgmid881000()
	 *	@return  Returns true if isParmCopybookPgmid881000() is "9400"
	 */
   public boolean isParmCopybookPgmid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCopybookPgmid88100088Value)  == 0  );
   }


	/**
	*  set values "9400"
	*/
   	public void setParmCopybookPgmid881000True() {  			
    	setFunctionResponse1000( parmCopybookPgmid88100088Value);
   	}
	char[] parmCopybookDate88100088Value = "9401".toCharArray();
	/**
	 *	Test condition "9401" for isParmCopybookDate881000()
	 *	@return  Returns true if isParmCopybookDate881000() is "9401"
	 */
   public boolean isParmCopybookDate881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCopybookDate88100088Value)  == 0  );
   }


	/**
	*  set values "9401"
	*/
   	public void setParmCopybookDate881000True() {  			
    	setFunctionResponse1000( parmCopybookDate88100088Value);
   	}
	char[] parmCopybookMod88100088Value = "9402".toCharArray();
	/**
	 *	Test condition "9402" for isParmCopybookMod881000()
	 *	@return  Returns true if isParmCopybookMod881000() is "9402"
	 */
   public boolean isParmCopybookMod881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCopybookMod88100088Value)  == 0  );
   }


	/**
	*  set values "9402"
	*/
   	public void setParmCopybookMod881000True() {  			
    	setFunctionResponse1000( parmCopybookMod88100088Value);
   	}
	char[] parmBulkidNotfnd88100088Value = "9410".toCharArray();
	/**
	 *	Test condition "9410" for isParmBulkidNotfnd881000()
	 *	@return  Returns true if isParmBulkidNotfnd881000() is "9410"
	 */
   public boolean isParmBulkidNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmBulkidNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "9410"
	*/
   	public void setParmBulkidNotfnd881000True() {  			
    	setFunctionResponse1000( parmBulkidNotfnd88100088Value);
   	}
	char[] parmBulkidSelect88100088Value = "9411".toCharArray();
	/**
	 *	Test condition "9411" for isParmBulkidSelect881000()
	 *	@return  Returns true if isParmBulkidSelect881000() is "9411"
	 */
   public boolean isParmBulkidSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmBulkidSelect88100088Value)  == 0  );
   }


	/**
	*  set values "9411"
	*/
   	public void setParmBulkidSelect881000True() {  			
    	setFunctionResponse1000( parmBulkidSelect88100088Value);
   	}
	char[] parmBulkidDirect88100088Value = "9412".toCharArray();
	/**
	 *	Test condition "9412" for isParmBulkidDirect881000()
	 *	@return  Returns true if isParmBulkidDirect881000() is "9412"
	 */
   public boolean isParmBulkidDirect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmBulkidDirect88100088Value)  == 0  );
   }


	/**
	*  set values "9412"
	*/
   	public void setParmBulkidDirect881000True() {  			
    	setFunctionResponse1000( parmBulkidDirect88100088Value);
   	}
	char[] parmBulkidRequired88100088Value = "9419".toCharArray();
	/**
	 *	Test condition "9419" for isParmBulkidRequired881000()
	 *	@return  Returns true if isParmBulkidRequired881000() is "9419"
	 */
   public boolean isParmBulkidRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmBulkidRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9419"
	*/
   	public void setParmBulkidRequired881000True() {  			
    	setFunctionResponse1000( parmBulkidRequired88100088Value);
   	}
	char[] parmEndptidNotfnd88100088Value = "9420".toCharArray();
	/**
	 *	Test condition "9420" for isParmEndptidNotfnd881000()
	 *	@return  Returns true if isParmEndptidNotfnd881000() is "9420"
	 */
   public boolean isParmEndptidNotfnd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmEndptidNotfnd88100088Value)  == 0  );
   }


	/**
	*  set values "9420"
	*/
   	public void setParmEndptidNotfnd881000True() {  			
    	setFunctionResponse1000( parmEndptidNotfnd88100088Value);
   	}
	char[] parmEndptidSelect88100088Value = "9421".toCharArray();
	/**
	 *	Test condition "9421" for isParmEndptidSelect881000()
	 *	@return  Returns true if isParmEndptidSelect881000() is "9421"
	 */
   public boolean isParmEndptidSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmEndptidSelect88100088Value)  == 0  );
   }


	/**
	*  set values "9421"
	*/
   	public void setParmEndptidSelect881000True() {  			
    	setFunctionResponse1000( parmEndptidSelect88100088Value);
   	}
	char[] parmEndptidRequired88100088Value = "9429".toCharArray();
	/**
	 *	Test condition "9429" for isParmEndptidRequired881000()
	 *	@return  Returns true if isParmEndptidRequired881000() is "9429"
	 */
   public boolean isParmEndptidRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmEndptidRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9429"
	*/
   	public void setParmEndptidRequired881000True() {  			
    	setFunctionResponse1000( parmEndptidRequired88100088Value);
   	}
	char[] parmDeleteInvalid88100088Value = "9430".toCharArray();
	/**
	 *	Test condition "9430" for isParmDeleteInvalid881000()
	 *	@return  Returns true if isParmDeleteInvalid881000() is "9430"
	 */
   public boolean isParmDeleteInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmDeleteInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9430"
	*/
   	public void setParmDeleteInvalid881000True() {  			
    	setFunctionResponse1000( parmDeleteInvalid88100088Value);
   	}
	char[] parmDeleteRequired88100088Value = "9439".toCharArray();
	/**
	 *	Test condition "9439" for isParmDeleteRequired881000()
	 *	@return  Returns true if isParmDeleteRequired881000() is "9439"
	 */
   public boolean isParmDeleteRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmDeleteRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9439"
	*/
   	public void setParmDeleteRequired881000True() {  			
    	setFunctionResponse1000( parmDeleteRequired88100088Value);
   	}
	char[] parmCyclnumInvalid88100088Value = "9440".toCharArray();
	/**
	 *	Test condition "9440" for isParmCyclnumInvalid881000()
	 *	@return  Returns true if isParmCyclnumInvalid881000() is "9440"
	 */
   public boolean isParmCyclnumInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCyclnumInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9440"
	*/
   	public void setParmCyclnumInvalid881000True() {  			
    	setFunctionResponse1000( parmCyclnumInvalid88100088Value);
   	}
	char[] parmSeqNbrInvalid88100088Value = "9441".toCharArray();
	/**
	 *	Test condition "9441" for isParmSeqNbrInvalid881000()
	 *	@return  Returns true if isParmSeqNbrInvalid881000() is "9441"
	 */
   public boolean isParmSeqNbrInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmSeqNbrInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9441"
	*/
   	public void setParmSeqNbrInvalid881000True() {  			
    	setFunctionResponse1000( parmSeqNbrInvalid88100088Value);
   	}
	char[] parmCyclnumRequired88100088Value = "9449".toCharArray();
	/**
	 *	Test condition "9449" for isParmCyclnumRequired881000()
	 *	@return  Returns true if isParmCyclnumRequired881000() is "9449"
	 */
   public boolean isParmCyclnumRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmCyclnumRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9449"
	*/
   	public void setParmCyclnumRequired881000True() {  			
    	setFunctionResponse1000( parmCyclnumRequired88100088Value);
   	}
	char[] parmListddInvalid88100088Value = "9450".toCharArray();
	/**
	 *	Test condition "9450" for isParmListddInvalid881000()
	 *	@return  Returns true if isParmListddInvalid881000() is "9450"
	 */
   public boolean isParmListddInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9450"
	*/
   	public void setParmListddInvalid881000True() {  			
    	setFunctionResponse1000( parmListddInvalid88100088Value);
   	}
	char[] parmListddNotcatal88100088Value = "9451".toCharArray();
	/**
	 *	Test condition "9451" for isParmListddNotcatal881000()
	 *	@return  Returns true if isParmListddNotcatal881000() is "9451"
	 */
   public boolean isParmListddNotcatal881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddNotcatal88100088Value)  == 0  );
   }


	/**
	*  set values "9451"
	*/
   	public void setParmListddNotcatal881000True() {  			
    	setFunctionResponse1000( parmListddNotcatal88100088Value);
   	}
	char[] parmListddNojcldd88100088Value = "9452".toCharArray();
	/**
	 *	Test condition "9452" for isParmListddNojcldd881000()
	 *	@return  Returns true if isParmListddNojcldd881000() is "9452"
	 */
   public boolean isParmListddNojcldd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddNojcldd88100088Value)  == 0  );
   }


	/**
	*  set values "9452"
	*/
   	public void setParmListddNojcldd881000True() {  			
    	setFunctionResponse1000( parmListddNojcldd88100088Value);
   	}
	char[] parmListddVsam88100088Value = "9453".toCharArray();
	/**
	 *	Test condition "9453" for isParmListddVsam881000()
	 *	@return  Returns true if isParmListddVsam881000() is "9453"
	 */
   public boolean isParmListddVsam881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddVsam88100088Value)  == 0  );
   }


	/**
	*  set values "9453"
	*/
   	public void setParmListddVsam881000True() {  			
    	setFunctionResponse1000( parmListddVsam88100088Value);
   	}
	char[] parmListddType88100088Value = "9454".toCharArray();
	/**
	 *	Test condition "9454" for isParmListddType881000()
	 *	@return  Returns true if isParmListddType881000() is "9454"
	 */
   public boolean isParmListddType881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddType88100088Value)  == 0  );
   }


	/**
	*  set values "9454"
	*/
   	public void setParmListddType881000True() {  			
    	setFunctionResponse1000( parmListddType88100088Value);
   	}
	char[] parmListddDdname88100088Value = "9455".toCharArray();
	/**
	 *	Test condition "9455" for isParmListddDdname881000()
	 *	@return  Returns true if isParmListddDdname881000() is "9455"
	 */
   public boolean isParmListddDdname881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddDdname88100088Value)  == 0  );
   }


	/**
	*  set values "9455"
	*/
   	public void setParmListddDdname881000True() {  			
    	setFunctionResponse1000( parmListddDdname88100088Value);
   	}
	char[] parmListddNombr88100088Value = "9456".toCharArray();
	/**
	 *	Test condition "9456" for isParmListddNombr881000()
	 *	@return  Returns true if isParmListddNombr881000() is "9456"
	 */
   public boolean isParmListddNombr881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddNombr88100088Value)  == 0  );
   }


	/**
	*  set values "9456"
	*/
   	public void setParmListddNombr881000True() {  			
    	setFunctionResponse1000( parmListddNombr88100088Value);
   	}
	char[] parmListddRequired88100088Value = "9459".toCharArray();
	/**
	 *	Test condition "9459" for isParmListddRequired881000()
	 *	@return  Returns true if isParmListddRequired881000() is "9459"
	 */
   public boolean isParmListddRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmListddRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9459"
	*/
   	public void setParmListddRequired881000True() {  			
    	setFunctionResponse1000( parmListddRequired88100088Value);
   	}
	char[] parmApplInvalid88100088Value = "9460".toCharArray();
	/**
	 *	Test condition "9460" for isParmApplInvalid881000()
	 *	@return  Returns true if isParmApplInvalid881000() is "9460"
	 */
   public boolean isParmApplInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9460"
	*/
   	public void setParmApplInvalid881000True() {  			
    	setFunctionResponse1000( parmApplInvalid88100088Value);
   	}
	char[] parmApplNotcatal88100088Value = "9461".toCharArray();
	/**
	 *	Test condition "9461" for isParmApplNotcatal881000()
	 *	@return  Returns true if isParmApplNotcatal881000() is "9461"
	 */
   public boolean isParmApplNotcatal881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplNotcatal88100088Value)  == 0  );
   }


	/**
	*  set values "9461"
	*/
   	public void setParmApplNotcatal881000True() {  			
    	setFunctionResponse1000( parmApplNotcatal88100088Value);
   	}
	char[] parmApplNojcldd88100088Value = "9462".toCharArray();
	/**
	 *	Test condition "9462" for isParmApplNojcldd881000()
	 *	@return  Returns true if isParmApplNojcldd881000() is "9462"
	 */
   public boolean isParmApplNojcldd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplNojcldd88100088Value)  == 0  );
   }


	/**
	*  set values "9462"
	*/
   	public void setParmApplNojcldd881000True() {  			
    	setFunctionResponse1000( parmApplNojcldd88100088Value);
   	}
	char[] parmApplVsam88100088Value = "9463".toCharArray();
	/**
	 *	Test condition "9463" for isParmApplVsam881000()
	 *	@return  Returns true if isParmApplVsam881000() is "9463"
	 */
   public boolean isParmApplVsam881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplVsam88100088Value)  == 0  );
   }


	/**
	*  set values "9463"
	*/
   	public void setParmApplVsam881000True() {  			
    	setFunctionResponse1000( parmApplVsam88100088Value);
   	}
	char[] parmApplType88100088Value = "9464".toCharArray();
	/**
	 *	Test condition "9464" for isParmApplType881000()
	 *	@return  Returns true if isParmApplType881000() is "9464"
	 */
   public boolean isParmApplType881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplType88100088Value)  == 0  );
   }


	/**
	*  set values "9464"
	*/
   	public void setParmApplType881000True() {  			
    	setFunctionResponse1000( parmApplType88100088Value);
   	}
	char[] parmApplDdname88100088Value = "9465".toCharArray();
	/**
	 *	Test condition "9465" for isParmApplDdname881000()
	 *	@return  Returns true if isParmApplDdname881000() is "9465"
	 */
   public boolean isParmApplDdname881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplDdname88100088Value)  == 0  );
   }


	/**
	*  set values "9465"
	*/
   	public void setParmApplDdname881000True() {  			
    	setFunctionResponse1000( parmApplDdname88100088Value);
   	}
	char[] parmApplNombr88100088Value = "9466".toCharArray();
	/**
	 *	Test condition "9466" for isParmApplNombr881000()
	 *	@return  Returns true if isParmApplNombr881000() is "9466"
	 */
   public boolean isParmApplNombr881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplNombr88100088Value)  == 0  );
   }


	/**
	*  set values "9466"
	*/
   	public void setParmApplNombr881000True() {  			
    	setFunctionResponse1000( parmApplNombr88100088Value);
   	}
	char[] parmApplNogdg88100088Value = "9467".toCharArray();
	/**
	 *	Test condition "9467" for isParmApplNogdg881000()
	 *	@return  Returns true if isParmApplNogdg881000() is "9467"
	 */
   public boolean isParmApplNogdg881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplNogdg88100088Value)  == 0  );
   }


	/**
	*  set values "9467"
	*/
   	public void setParmApplNogdg881000True() {  			
    	setFunctionResponse1000( parmApplNogdg88100088Value);
   	}
	char[] parmApplRequired88100088Value = "9469".toCharArray();
	/**
	 *	Test condition "9469" for isParmApplRequired881000()
	 *	@return  Returns true if isParmApplRequired881000() is "9469"
	 */
   public boolean isParmApplRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmApplRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9469"
	*/
   	public void setParmApplRequired881000True() {  			
    	setFunctionResponse1000( parmApplRequired88100088Value);
   	}
	char[] parmGftInvalid88100088Value = "9470".toCharArray();
	/**
	 *	Test condition "9470" for isParmGftInvalid881000()
	 *	@return  Returns true if isParmGftInvalid881000() is "9470"
	 */
   public boolean isParmGftInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9470"
	*/
   	public void setParmGftInvalid881000True() {  			
    	setFunctionResponse1000( parmGftInvalid88100088Value);
   	}
	char[] parmGftNotcatal88100088Value = "9471".toCharArray();
	/**
	 *	Test condition "9471" for isParmGftNotcatal881000()
	 *	@return  Returns true if isParmGftNotcatal881000() is "9471"
	 */
   public boolean isParmGftNotcatal881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftNotcatal88100088Value)  == 0  );
   }


	/**
	*  set values "9471"
	*/
   	public void setParmGftNotcatal881000True() {  			
    	setFunctionResponse1000( parmGftNotcatal88100088Value);
   	}
	char[] parmGftNojcldd88100088Value = "9472".toCharArray();
	/**
	 *	Test condition "9472" for isParmGftNojcldd881000()
	 *	@return  Returns true if isParmGftNojcldd881000() is "9472"
	 */
   public boolean isParmGftNojcldd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftNojcldd88100088Value)  == 0  );
   }


	/**
	*  set values "9472"
	*/
   	public void setParmGftNojcldd881000True() {  			
    	setFunctionResponse1000( parmGftNojcldd88100088Value);
   	}
	char[] parmGftVsam88100088Value = "9473".toCharArray();
	/**
	 *	Test condition "9473" for isParmGftVsam881000()
	 *	@return  Returns true if isParmGftVsam881000() is "9473"
	 */
   public boolean isParmGftVsam881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftVsam88100088Value)  == 0  );
   }


	/**
	*  set values "9473"
	*/
   	public void setParmGftVsam881000True() {  			
    	setFunctionResponse1000( parmGftVsam88100088Value);
   	}
	char[] parmGftType88100088Value = "9474".toCharArray();
	/**
	 *	Test condition "9474" for isParmGftType881000()
	 *	@return  Returns true if isParmGftType881000() is "9474"
	 */
   public boolean isParmGftType881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftType88100088Value)  == 0  );
   }


	/**
	*  set values "9474"
	*/
   	public void setParmGftType881000True() {  			
    	setFunctionResponse1000( parmGftType88100088Value);
   	}
	char[] parmGftDdname88100088Value = "9475".toCharArray();
	/**
	 *	Test condition "9475" for isParmGftDdname881000()
	 *	@return  Returns true if isParmGftDdname881000() is "9475"
	 */
   public boolean isParmGftDdname881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftDdname88100088Value)  == 0  );
   }


	/**
	*  set values "9475"
	*/
   	public void setParmGftDdname881000True() {  			
    	setFunctionResponse1000( parmGftDdname88100088Value);
   	}
	char[] parmGftRequired88100088Value = "9479".toCharArray();
	/**
	 *	Test condition "9479" for isParmGftRequired881000()
	 *	@return  Returns true if isParmGftRequired881000() is "9479"
	 */
   public boolean isParmGftRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmGftRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9479"
	*/
   	public void setParmGftRequired881000True() {  			
    	setFunctionResponse1000( parmGftRequired88100088Value);
   	}
	char[] parmResultInvalid88100088Value = "9480".toCharArray();
	/**
	 *	Test condition "9480" for isParmResultInvalid881000()
	 *	@return  Returns true if isParmResultInvalid881000() is "9480"
	 */
   public boolean isParmResultInvalid881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultInvalid88100088Value)  == 0  );
   }


	/**
	*  set values "9480"
	*/
   	public void setParmResultInvalid881000True() {  			
    	setFunctionResponse1000( parmResultInvalid88100088Value);
   	}
	char[] parmResultNotcatal88100088Value = "9481".toCharArray();
	/**
	 *	Test condition "9481" for isParmResultNotcatal881000()
	 *	@return  Returns true if isParmResultNotcatal881000() is "9481"
	 */
   public boolean isParmResultNotcatal881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultNotcatal88100088Value)  == 0  );
   }


	/**
	*  set values "9481"
	*/
   	public void setParmResultNotcatal881000True() {  			
    	setFunctionResponse1000( parmResultNotcatal88100088Value);
   	}
	char[] parmResultNojcldd88100088Value = "9482".toCharArray();
	/**
	 *	Test condition "9482" for isParmResultNojcldd881000()
	 *	@return  Returns true if isParmResultNojcldd881000() is "9482"
	 */
   public boolean isParmResultNojcldd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultNojcldd88100088Value)  == 0  );
   }


	/**
	*  set values "9482"
	*/
   	public void setParmResultNojcldd881000True() {  			
    	setFunctionResponse1000( parmResultNojcldd88100088Value);
   	}
	char[] parmResultVsam88100088Value = "9483".toCharArray();
	/**
	 *	Test condition "9483" for isParmResultVsam881000()
	 *	@return  Returns true if isParmResultVsam881000() is "9483"
	 */
   public boolean isParmResultVsam881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultVsam88100088Value)  == 0  );
   }


	/**
	*  set values "9483"
	*/
   	public void setParmResultVsam881000True() {  			
    	setFunctionResponse1000( parmResultVsam88100088Value);
   	}
	char[] parmResultType88100088Value = "9484".toCharArray();
	/**
	 *	Test condition "9484" for isParmResultType881000()
	 *	@return  Returns true if isParmResultType881000() is "9484"
	 */
   public boolean isParmResultType881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultType88100088Value)  == 0  );
   }


	/**
	*  set values "9484"
	*/
   	public void setParmResultType881000True() {  			
    	setFunctionResponse1000( parmResultType88100088Value);
   	}
	char[] parmResultDdname88100088Value = "9485".toCharArray();
	/**
	 *	Test condition "9485" for isParmResultDdname881000()
	 *	@return  Returns true if isParmResultDdname881000() is "9485"
	 */
   public boolean isParmResultDdname881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultDdname88100088Value)  == 0  );
   }


	/**
	*  set values "9485"
	*/
   	public void setParmResultDdname881000True() {  			
    	setFunctionResponse1000( parmResultDdname88100088Value);
   	}
	char[] parmResultOption88100088Value = "9486".toCharArray();
	/**
	 *	Test condition "9486" for isParmResultOption881000()
	 *	@return  Returns true if isParmResultOption881000() is "9486"
	 */
   public boolean isParmResultOption881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultOption88100088Value)  == 0  );
   }


	/**
	*  set values "9486"
	*/
   	public void setParmResultOption881000True() {  			
    	setFunctionResponse1000( parmResultOption88100088Value);
   	}
	char[] parmResultRequired88100088Value = "9489".toCharArray();
	/**
	 *	Test condition "9489" for isParmResultRequired881000()
	 *	@return  Returns true if isParmResultRequired881000() is "9489"
	 */
   public boolean isParmResultRequired881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmResultRequired88100088Value)  == 0  );
   }


	/**
	*  set values "9489"
	*/
   	public void setParmResultRequired881000True() {  			
    	setFunctionResponse1000( parmResultRequired88100088Value);
   	}
	char[] parmProcdateFormat88100088Value = "9490".toCharArray();
	/**
	 *	Test condition "9490" for isParmProcdateFormat881000()
	 *	@return  Returns true if isParmProcdateFormat881000() is "9490"
	 */
   public boolean isParmProcdateFormat881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmProcdateFormat88100088Value)  == 0  );
   }


	/**
	*  set values "9490"
	*/
   	public void setParmProcdateFormat881000True() {  			
    	setFunctionResponse1000( parmProcdateFormat88100088Value);
   	}
	char[] parmProcdateYear88100088Value = "9491".toCharArray();
	/**
	 *	Test condition "9491" for isParmProcdateYear881000()
	 *	@return  Returns true if isParmProcdateYear881000() is "9491"
	 */
   public boolean isParmProcdateYear881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmProcdateYear88100088Value)  == 0  );
   }


	/**
	*  set values "9491"
	*/
   	public void setParmProcdateYear881000True() {  			
    	setFunctionResponse1000( parmProcdateYear88100088Value);
   	}
	char[] parmProcdateMonth88100088Value = "9492".toCharArray();
	/**
	 *	Test condition "9492" for isParmProcdateMonth881000()
	 *	@return  Returns true if isParmProcdateMonth881000() is "9492"
	 */
   public boolean isParmProcdateMonth881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmProcdateMonth88100088Value)  == 0  );
   }


	/**
	*  set values "9492"
	*/
   	public void setParmProcdateMonth881000True() {  			
    	setFunctionResponse1000( parmProcdateMonth88100088Value);
   	}
	char[] parmProcdateDay88100088Value = "9493".toCharArray();
	/**
	 *	Test condition "9493" for isParmProcdateDay881000()
	 *	@return  Returns true if isParmProcdateDay881000() is "9493"
	 */
   public boolean isParmProcdateDay881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmProcdateDay88100088Value)  == 0  );
   }


	/**
	*  set values "9493"
	*/
   	public void setParmProcdateDay881000True() {  			
    	setFunctionResponse1000( parmProcdateDay88100088Value);
   	}
	char[] parmProcdateDom88100088Value = "9494".toCharArray();
	/**
	 *	Test condition "9494" for isParmProcdateDom881000()
	 *	@return  Returns true if isParmProcdateDom881000() is "9494"
	 */
   public boolean isParmProcdateDom881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , parmProcdateDom88100088Value)  == 0  );
   }


	/**
	*  set values "9494"
	*/
   	public void setParmProcdateDom881000True() {  			
    	setFunctionResponse1000( parmProcdateDom88100088Value);
   	}
	char[] confDdCtrlAppl88100088Value = "9512".toCharArray();
	/**
	 *	Test condition "9512" for isConfDdCtrlAppl881000()
	 *	@return  Returns true if isConfDdCtrlAppl881000() is "9512"
	 */
   public boolean isConfDdCtrlAppl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdCtrlAppl88100088Value)  == 0  );
   }


	/**
	*  set values "9512"
	*/
   	public void setConfDdCtrlAppl881000True() {  			
    	setFunctionResponse1000( confDdCtrlAppl88100088Value);
   	}
	char[] confDdCtrlGft88100088Value = "9513".toCharArray();
	/**
	 *	Test condition "9513" for isConfDdCtrlGft881000()
	 *	@return  Returns true if isConfDdCtrlGft881000() is "9513"
	 */
   public boolean isConfDdCtrlGft881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdCtrlGft88100088Value)  == 0  );
   }


	/**
	*  set values "9513"
	*/
   	public void setConfDdCtrlGft881000True() {  			
    	setFunctionResponse1000( confDdCtrlGft88100088Value);
   	}
	char[] confDdCtrlList88100088Value = "9514".toCharArray();
	/**
	 *	Test condition "9514" for isConfDdCtrlList881000()
	 *	@return  Returns true if isConfDdCtrlList881000() is "9514"
	 */
   public boolean isConfDdCtrlList881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdCtrlList88100088Value)  == 0  );
   }


	/**
	*  set values "9514"
	*/
   	public void setConfDdCtrlList881000True() {  			
    	setFunctionResponse1000( confDdCtrlList88100088Value);
   	}
	char[] confDdCtrlRslt88100088Value = "9515".toCharArray();
	/**
	 *	Test condition "9515" for isConfDdCtrlRslt881000()
	 *	@return  Returns true if isConfDdCtrlRslt881000() is "9515"
	 */
   public boolean isConfDdCtrlRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdCtrlRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9515"
	*/
   	public void setConfDdCtrlRslt881000True() {  			
    	setFunctionResponse1000( confDdCtrlRslt88100088Value);
   	}
	char[] confDdApplGft88100088Value = "9523".toCharArray();
	/**
	 *	Test condition "9523" for isConfDdApplGft881000()
	 *	@return  Returns true if isConfDdApplGft881000() is "9523"
	 */
   public boolean isConfDdApplGft881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdApplGft88100088Value)  == 0  );
   }


	/**
	*  set values "9523"
	*/
   	public void setConfDdApplGft881000True() {  			
    	setFunctionResponse1000( confDdApplGft88100088Value);
   	}
	char[] confDdApplList88100088Value = "9524".toCharArray();
	/**
	 *	Test condition "9524" for isConfDdApplList881000()
	 *	@return  Returns true if isConfDdApplList881000() is "9524"
	 */
   public boolean isConfDdApplList881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdApplList88100088Value)  == 0  );
   }


	/**
	*  set values "9524"
	*/
   	public void setConfDdApplList881000True() {  			
    	setFunctionResponse1000( confDdApplList88100088Value);
   	}
	char[] confDdApplRslt88100088Value = "9525".toCharArray();
	/**
	 *	Test condition "9525" for isConfDdApplRslt881000()
	 *	@return  Returns true if isConfDdApplRslt881000() is "9525"
	 */
   public boolean isConfDdApplRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdApplRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9525"
	*/
   	public void setConfDdApplRslt881000True() {  			
    	setFunctionResponse1000( confDdApplRslt88100088Value);
   	}
	char[] confDdGftList88100088Value = "9534".toCharArray();
	/**
	 *	Test condition "9534" for isConfDdGftList881000()
	 *	@return  Returns true if isConfDdGftList881000() is "9534"
	 */
   public boolean isConfDdGftList881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdGftList88100088Value)  == 0  );
   }


	/**
	*  set values "9534"
	*/
   	public void setConfDdGftList881000True() {  			
    	setFunctionResponse1000( confDdGftList88100088Value);
   	}
	char[] confDdGftRslt88100088Value = "9535".toCharArray();
	/**
	 *	Test condition "9535" for isConfDdGftRslt881000()
	 *	@return  Returns true if isConfDdGftRslt881000() is "9535"
	 */
   public boolean isConfDdGftRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdGftRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9535"
	*/
   	public void setConfDdGftRslt881000True() {  			
    	setFunctionResponse1000( confDdGftRslt88100088Value);
   	}
	char[] confDdListRslt88100088Value = "9545".toCharArray();
	/**
	 *	Test condition "9545" for isConfDdListRslt881000()
	 *	@return  Returns true if isConfDdListRslt881000() is "9545"
	 */
   public boolean isConfDdListRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDdListRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9545"
	*/
   	public void setConfDdListRslt881000True() {  			
    	setFunctionResponse1000( confDdListRslt88100088Value);
   	}
	char[] confDsnCtrlAppl88100088Value = "9612".toCharArray();
	/**
	 *	Test condition "9612" for isConfDsnCtrlAppl881000()
	 *	@return  Returns true if isConfDsnCtrlAppl881000() is "9612"
	 */
   public boolean isConfDsnCtrlAppl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnCtrlAppl88100088Value)  == 0  );
   }


	/**
	*  set values "9612"
	*/
   	public void setConfDsnCtrlAppl881000True() {  			
    	setFunctionResponse1000( confDsnCtrlAppl88100088Value);
   	}
	char[] confDsnCtrlGft88100088Value = "9613".toCharArray();
	/**
	 *	Test condition "9613" for isConfDsnCtrlGft881000()
	 *	@return  Returns true if isConfDsnCtrlGft881000() is "9613"
	 */
   public boolean isConfDsnCtrlGft881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnCtrlGft88100088Value)  == 0  );
   }


	/**
	*  set values "9613"
	*/
   	public void setConfDsnCtrlGft881000True() {  			
    	setFunctionResponse1000( confDsnCtrlGft88100088Value);
   	}
	char[] confDsnCtrlList88100088Value = "9614".toCharArray();
	/**
	 *	Test condition "9614" for isConfDsnCtrlList881000()
	 *	@return  Returns true if isConfDsnCtrlList881000() is "9614"
	 */
   public boolean isConfDsnCtrlList881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnCtrlList88100088Value)  == 0  );
   }


	/**
	*  set values "9614"
	*/
   	public void setConfDsnCtrlList881000True() {  			
    	setFunctionResponse1000( confDsnCtrlList88100088Value);
   	}
	char[] confDsnCtrlRslt88100088Value = "9615".toCharArray();
	/**
	 *	Test condition "9615" for isConfDsnCtrlRslt881000()
	 *	@return  Returns true if isConfDsnCtrlRslt881000() is "9615"
	 */
   public boolean isConfDsnCtrlRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnCtrlRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9615"
	*/
   	public void setConfDsnCtrlRslt881000True() {  			
    	setFunctionResponse1000( confDsnCtrlRslt88100088Value);
   	}
	char[] confDsnApplGft88100088Value = "9623".toCharArray();
	/**
	 *	Test condition "9623" for isConfDsnApplGft881000()
	 *	@return  Returns true if isConfDsnApplGft881000() is "9623"
	 */
   public boolean isConfDsnApplGft881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnApplGft88100088Value)  == 0  );
   }


	/**
	*  set values "9623"
	*/
   	public void setConfDsnApplGft881000True() {  			
    	setFunctionResponse1000( confDsnApplGft88100088Value);
   	}
	char[] confDsnApplList88100088Value = "9624".toCharArray();
	/**
	 *	Test condition "9624" for isConfDsnApplList881000()
	 *	@return  Returns true if isConfDsnApplList881000() is "9624"
	 */
   public boolean isConfDsnApplList881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnApplList88100088Value)  == 0  );
   }


	/**
	*  set values "9624"
	*/
   	public void setConfDsnApplList881000True() {  			
    	setFunctionResponse1000( confDsnApplList88100088Value);
   	}
	char[] confDsnApplRslt88100088Value = "9625".toCharArray();
	/**
	 *	Test condition "9625" for isConfDsnApplRslt881000()
	 *	@return  Returns true if isConfDsnApplRslt881000() is "9625"
	 */
   public boolean isConfDsnApplRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnApplRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9625"
	*/
   	public void setConfDsnApplRslt881000True() {  			
    	setFunctionResponse1000( confDsnApplRslt88100088Value);
   	}
	char[] confDsnGftList88100088Value = "9634".toCharArray();
	/**
	 *	Test condition "9634" for isConfDsnGftList881000()
	 *	@return  Returns true if isConfDsnGftList881000() is "9634"
	 */
   public boolean isConfDsnGftList881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnGftList88100088Value)  == 0  );
   }


	/**
	*  set values "9634"
	*/
   	public void setConfDsnGftList881000True() {  			
    	setFunctionResponse1000( confDsnGftList88100088Value);
   	}
	char[] confDsnGftRslt88100088Value = "9635".toCharArray();
	/**
	 *	Test condition "9635" for isConfDsnGftRslt881000()
	 *	@return  Returns true if isConfDsnGftRslt881000() is "9635"
	 */
   public boolean isConfDsnGftRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnGftRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9635"
	*/
   	public void setConfDsnGftRslt881000True() {  			
    	setFunctionResponse1000( confDsnGftRslt88100088Value);
   	}
	char[] confDsnListRslt88100088Value = "9645".toCharArray();
	/**
	 *	Test condition "9645" for isConfDsnListRslt881000()
	 *	@return  Returns true if isConfDsnListRslt881000() is "9645"
	 */
   public boolean isConfDsnListRslt881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , confDsnListRslt88100088Value)  == 0  );
   }


	/**
	*  set values "9645"
	*/
   	public void setConfDsnListRslt881000True() {  			
    	setFunctionResponse1000( confDsnListRslt88100088Value);
   	}
	char[] datasetCtrlOpen88100088Value = "9900".toCharArray();
	/**
	 *	Test condition "9900" for isDatasetCtrlOpen881000()
	 *	@return  Returns true if isDatasetCtrlOpen881000() is "9900"
	 */
   public boolean isDatasetCtrlOpen881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlOpen88100088Value)  == 0  );
   }


	/**
	*  set values "9900"
	*/
   	public void setDatasetCtrlOpen881000True() {  			
    	setFunctionResponse1000( datasetCtrlOpen88100088Value);
   	}
	char[] datasetCtrlRead88100088Value = "9901".toCharArray();
	/**
	 *	Test condition "9901" for isDatasetCtrlRead881000()
	 *	@return  Returns true if isDatasetCtrlRead881000() is "9901"
	 */
   public boolean isDatasetCtrlRead881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlRead88100088Value)  == 0  );
   }


	/**
	*  set values "9901"
	*/
   	public void setDatasetCtrlRead881000True() {  			
    	setFunctionResponse1000( datasetCtrlRead88100088Value);
   	}
	char[] datasetCtrlClose88100088Value = "9902".toCharArray();
	/**
	 *	Test condition "9902" for isDatasetCtrlClose881000()
	 *	@return  Returns true if isDatasetCtrlClose881000() is "9902"
	 */
   public boolean isDatasetCtrlClose881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlClose88100088Value)  == 0  );
   }


	/**
	*  set values "9902"
	*/
   	public void setDatasetCtrlClose881000True() {  			
    	setFunctionResponse1000( datasetCtrlClose88100088Value);
   	}
	char[] datasetCtrlNojcldd88100088Value = "9903".toCharArray();
	/**
	 *	Test condition "9903" for isDatasetCtrlNojcldd881000()
	 *	@return  Returns true if isDatasetCtrlNojcldd881000() is "9903"
	 */
   public boolean isDatasetCtrlNojcldd881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlNojcldd88100088Value)  == 0  );
   }


	/**
	*  set values "9903"
	*/
   	public void setDatasetCtrlNojcldd881000True() {  			
    	setFunctionResponse1000( datasetCtrlNojcldd88100088Value);
   	}
	char[] datasetCtrlType88100088Value = "9904".toCharArray();
	/**
	 *	Test condition "9904" for isDatasetCtrlType881000()
	 *	@return  Returns true if isDatasetCtrlType881000() is "9904"
	 */
   public boolean isDatasetCtrlType881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlType88100088Value)  == 0  );
   }


	/**
	*  set values "9904"
	*/
   	public void setDatasetCtrlType881000True() {  			
    	setFunctionResponse1000( datasetCtrlType88100088Value);
   	}
	char[] datasetCtrlLrecl88100088Value = "9905".toCharArray();
	/**
	 *	Test condition "9905" for isDatasetCtrlLrecl881000()
	 *	@return  Returns true if isDatasetCtrlLrecl881000() is "9905"
	 */
   public boolean isDatasetCtrlLrecl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlLrecl88100088Value)  == 0  );
   }


	/**
	*  set values "9905"
	*/
   	public void setDatasetCtrlLrecl881000True() {  			
    	setFunctionResponse1000( datasetCtrlLrecl88100088Value);
   	}
	char[] datasetCtrlEmpty88100088Value = "9906".toCharArray();
	/**
	 *	Test condition "9906" for isDatasetCtrlEmpty881000()
	 *	@return  Returns true if isDatasetCtrlEmpty881000() is "9906"
	 */
   public boolean isDatasetCtrlEmpty881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetCtrlEmpty88100088Value)  == 0  );
   }


	/**
	*  set values "9906"
	*/
   	public void setDatasetCtrlEmpty881000True() {  			
    	setFunctionResponse1000( datasetCtrlEmpty88100088Value);
   	}
	char[] datasetListddLrecl88100088Value = "9915".toCharArray();
	/**
	 *	Test condition "9915" for isDatasetListddLrecl881000()
	 *	@return  Returns true if isDatasetListddLrecl881000() is "9915"
	 */
   public boolean isDatasetListddLrecl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetListddLrecl88100088Value)  == 0  );
   }


	/**
	*  set values "9915"
	*/
   	public void setDatasetListddLrecl881000True() {  			
    	setFunctionResponse1000( datasetListddLrecl88100088Value);
   	}
	char[] datasetResultLrecl88100088Value = "9925".toCharArray();
	/**
	 *	Test condition "9925" for isDatasetResultLrecl881000()
	 *	@return  Returns true if isDatasetResultLrecl881000() is "9925"
	 */
   public boolean isDatasetResultLrecl881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetResultLrecl88100088Value)  == 0  );
   }


	/**
	*  set values "9925"
	*/
   	public void setDatasetResultLrecl881000True() {  			
    	setFunctionResponse1000( datasetResultLrecl88100088Value);
   	}
	char[] datasetResultRecfm88100088Value = "9927".toCharArray();
	/**
	 *	Test condition "9927" for isDatasetResultRecfm881000()
	 *	@return  Returns true if isDatasetResultRecfm881000() is "9927"
	 */
   public boolean isDatasetResultRecfm881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , datasetResultRecfm88100088Value)  == 0  );
   }


	/**
	*  set values "9927"
	*/
   	public void setDatasetResultRecfm881000True() {  			
    	setFunctionResponse1000( datasetResultRecfm88100088Value);
   	}
	char[] appEndptEptxSelect88100088Value = "9930".toCharArray();
	/**
	 *	Test condition "9930" for isAppEndptEptxSelect881000()
	 *	@return  Returns true if isAppEndptEptxSelect881000() is "9930"
	 */
   public boolean isAppEndptEptxSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , appEndptEptxSelect88100088Value)  == 0  );
   }


	/**
	*  set values "9930"
	*/
   	public void setAppEndptEptxSelect881000True() {  			
    	setFunctionResponse1000( appEndptEptxSelect88100088Value);
   	}
	char[] appTarastsSelect88100088Value = "9940".toCharArray();
	/**
	 *	Test condition "9940" for isAppTarastsSelect881000()
	 *	@return  Returns true if isAppTarastsSelect881000() is "9940"
	 */
   public boolean isAppTarastsSelect881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , appTarastsSelect88100088Value)  == 0  );
   }


	/**
	*  set values "9940"
	*/
   	public void setAppTarastsSelect881000True() {  			
    	setFunctionResponse1000( appTarastsSelect88100088Value);
   	}
	char[] logicAssignError88100088Value = "9990".toCharArray();
	/**
	 *	Test condition "9990" for isLogicAssignError881000()
	 *	@return  Returns true if isLogicAssignError881000() is "9990"
	 */
   public boolean isLogicAssignError881000() throws CFException {
      return (  compareChars( getFunctionResponse1000() , logicAssignError88100088Value)  == 0  );
   }


	/**
	*  set values "9990"
	*/
   	public void setLogicAssignError881000True() {  			
    	setFunctionResponse1000( logicAssignError88100088Value);
   	}
	public int getRequestNbr1000() throws CFException {
        if (isRequestNbr1000Modified()) { 
           requestNbr1000 = refreshRequestNbr1000();
        }
   		return requestNbr1000;
	}
	
	/**
	 * 	Update RequestNbr1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-REQUEST-NBR
	 *	@param number
	 */
	public void setRequestNbr1000(int number) {
			requestNbr1000 = checkRequestNbr1000MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRequestNbr1000(requestNbr1000);
	}


	public void setRequestNbr1000(long number) {
	    number = checkRequestNbr1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRequestNbr1000((int)number);
	}
	
	/**
	 *	Returns the value of responseDsn1000
	 *	@return responseDsn1000
	 */
   public char[] getResponseDsn1000() throws CFException{
     if (isResponseDsn1000Modified()) { 
        responseDsn1000 = refreshResponseDsn1000();
     }
   		return responseDsn1000;
   }

  
	/**
	*  set variable responseDsn1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-DSN
	*  @param value
	**/
   public void setResponseDsn1000(char[] value) {
      responseDsn1000 = checkResponseDsn1000Constraints(value);
      serializeResponseDsn1000(responseDsn1000);
   } 

     /**
	 * 	Update ResponseDsn1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseDsn1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseDsn1000,responseDsn1000.length);
   	
   }
   
   public void setResponseDsn1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseDsn1000,responseDsn1000.length);
   	
   }
   
     /**
	 * 	Update ResponseDsn1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseDsn1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseDsn1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseDsn1000 with another Field
	 *	@param value
	 */
   public void setResponseDsn1000(Field source) {
       replace(source,0,source.length(),beginResponseDsn1000,RESPONSE_DSN_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseDsn1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseDsn1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseDsn1000,RESPONSE_DSN_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseDsn1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseDsn1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseDsn1000+targetIndex,targetLen);
    
   }
	char[] responseDsnNull88100088Value = "                                            ".toCharArray();
	/**
	 *	Test condition " " for isResponseDsnNull881000()
	 *	@return  Returns true if isResponseDsnNull881000() is " "
	 */
   public boolean isResponseDsnNull881000() throws CFException {
      return (  compareChars( getResponseDsn1000() , responseDsnNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setResponseDsnNull881000True() {  			
    	setResponseDsn1000( responseDsnNull88100088Value);
   	}
	/**
	 *	Returns the value of bulkFilesAvail1000
	 *	@return bulkFilesAvail1000
	 */
	public int getBulkFilesAvail1000() throws CFException {
        if (isBulkFilesAvail1000Modified()) { 
           bulkFilesAvail1000 = refreshBulkFilesAvail1000();
        }
   		return bulkFilesAvail1000;
	}
	
	/**
	 * 	Update BulkFilesAvail1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-BULK-FILES-AVAIL
	 *	@param number
	 */
	public void setBulkFilesAvail1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    bulkFilesAvail1000 = checkBulkFilesAvail1000MaxLimit(number); 
		serializeBulkFilesAvail1000(bulkFilesAvail1000);
	}


	public void setBulkFilesAvail1000(long number) {
	    number = checkBulkFilesAvail1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBulkFilesAvail1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isNoBulkFilesAvail881000()
	 *	@return  Returns true if isNoBulkFilesAvail881000() is 0
	 */
   public boolean isNoBulkFilesAvail881000() throws CFException {
      return (  getBulkFilesAvail1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setNoBulkFilesAvail881000True() {  			
    	setBulkFilesAvail1000( 0);
   	}
	/**
	 *	Returns the value of allocUnitType1000
	 *	@return allocUnitType1000
	 */
   public char[] getAllocUnitType1000() throws CFException{
     if (isAllocUnitType1000Modified()) { 
        allocUnitType1000 = refreshAllocUnitType1000();
     }
   		return allocUnitType1000;
   }

  
	/**
	*  set variable allocUnitType1000
	*  Corresponding COBOL Variable is 1000-ALLOC-UNIT-TYPE
	*  @param value
	**/
   public void setAllocUnitType1000(char[] value) {
      allocUnitType1000 = checkAllocUnitType1000Constraints(value);
      serializeAllocUnitType1000(allocUnitType1000);
   } 

     /**
	 * 	Update AllocUnitType1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAllocUnitType1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAllocUnitType1000,allocUnitType1000.length);
   	
   }
   
   public void setAllocUnitType1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAllocUnitType1000,allocUnitType1000.length);
   	
   }
   
     /**
	 * 	Update AllocUnitType1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAllocUnitType1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocUnitType1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AllocUnitType1000 with another Field
	 *	@param value
	 */
   public void setAllocUnitType1000(Field source) {
       replace(source,0,source.length(),beginAllocUnitType1000,ALLOC_UNIT_TYPE_1000_LEN);
   	
   }  
   
     /**
	 * 	Update AllocUnitType1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAllocUnitType1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAllocUnitType1000,ALLOC_UNIT_TYPE_1000_LEN);
   	
   }
   
     /**
	 * 	Update AllocUnitType1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAllocUnitType1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocUnitType1000+targetIndex,targetLen);
    
   }
	char[] allocUnitTypeCyls88100088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isAllocUnitTypeCyls881000()
	 *	@return  Returns true if isAllocUnitTypeCyls881000() is "C"
	 */
   public boolean isAllocUnitTypeCyls881000() throws CFException {
      return (  compareChars( getAllocUnitType1000() , allocUnitTypeCyls88100088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setAllocUnitTypeCyls881000True() {  			
    	setAllocUnitType1000( allocUnitTypeCyls88100088Value);
   	}
	char[] allocUnitTypeTrks88100088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isAllocUnitTypeTrks881000()
	 *	@return  Returns true if isAllocUnitTypeTrks881000() is "T"
	 */
   public boolean isAllocUnitTypeTrks881000() throws CFException {
      return (  compareChars( getAllocUnitType1000() , allocUnitTypeTrks88100088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setAllocUnitTypeTrks881000True() {  			
    	setAllocUnitType1000( allocUnitTypeTrks88100088Value);
   	}
	char[] allocUnitTypeBlks88100088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isAllocUnitTypeBlks881000()
	 *	@return  Returns true if isAllocUnitTypeBlks881000() is "B"
	 */
   public boolean isAllocUnitTypeBlks881000() throws CFException {
      return (  compareChars( getAllocUnitType1000() , allocUnitTypeBlks88100088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setAllocUnitTypeBlks881000True() {  			
    	setAllocUnitType1000( allocUnitTypeBlks88100088Value);
   	}
	char[] allocUnitTypeNull88100088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isAllocUnitTypeNull881000()
	 *	@return  Returns true if isAllocUnitTypeNull881000() is " "
	 */
   public boolean isAllocUnitTypeNull881000() throws CFException {
      return (  compareChars( getAllocUnitType1000() , allocUnitTypeNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setAllocUnitTypeNull881000True() {  			
    	setAllocUnitType1000( allocUnitTypeNull88100088Value);
   	}
	/**
	 *	Returns the value of allocUnitsUsed1000
	 *	@return allocUnitsUsed1000
	 */
	public int getAllocUnitsUsed1000() throws CFException {
        if (isAllocUnitsUsed1000Modified()) { 
           allocUnitsUsed1000 = refreshAllocUnitsUsed1000();
        }
   		return allocUnitsUsed1000;
	}
	
	/**
	 * 	Update AllocUnitsUsed1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-ALLOC-UNITS-USED
	 *	@param number
	 */
	public void setAllocUnitsUsed1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    allocUnitsUsed1000 = checkAllocUnitsUsed1000MaxLimit(number); 
		serializeAllocUnitsUsed1000(allocUnitsUsed1000);
	}


	public void setAllocUnitsUsed1000(long number) {
	    number = checkAllocUnitsUsed1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAllocUnitsUsed1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isAllocUnitsUsedNull881000()
	 *	@return  Returns true if isAllocUnitsUsedNull881000() is 0
	 */
   public boolean isAllocUnitsUsedNull881000() throws CFException {
      return (  getAllocUnitsUsed1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAllocUnitsUsedNull881000True() {  			
    	setAllocUnitsUsed1000( 0);
   	}
	/**
	 *	Returns the value of recfm1000
	 *	@return recfm1000
	 */
   public char[] getRecfm1000() throws CFException{
     if (isRecfm1000Modified()) { 
        recfm1000 = refreshRecfm1000();
     }
   		return recfm1000;
   }

  
	/**
	*  set variable recfm1000
	*  Corresponding COBOL Variable is 1000-RECFM
	*  @param value
	**/
   public void setRecfm1000(char[] value) {
      recfm1000 = checkRecfm1000Constraints(value);
      serializeRecfm1000(recfm1000);
   } 

     /**
	 * 	Update Recfm1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecfm1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecfm1000,recfm1000.length);
   	
   }
   
   public void setRecfm1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm1000,recfm1000.length);
   	
   }
   
     /**
	 * 	Update Recfm1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecfm1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Recfm1000 with another Field
	 *	@param value
	 */
   public void setRecfm1000(Field source) {
       replace(source,0,source.length(),beginRecfm1000,RECFM_1000_LEN);
   	
   }  
   
     /**
	 * 	Update Recfm1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecfm1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecfm1000,RECFM_1000_LEN);
   	
   }
   
     /**
	 * 	Update Recfm1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecfm1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfm1000+targetIndex,targetLen);
    
   }
	char[] recfmNull88100088Value = "   ".toCharArray();
	/**
	 *	Test condition " " for isRecfmNull881000()
	 *	@return  Returns true if isRecfmNull881000() is " "
	 */
   public boolean isRecfmNull881000() throws CFException {
      return (  compareChars( getRecfm1000() , recfmNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setRecfmNull881000True() {  			
    	setRecfm1000( recfmNull88100088Value);
   	}
	/**
	 *	Returns the value of lrecl1000
	 *	@return lrecl1000
	 */
	public int getLrecl1000() throws CFException {
        if (isLrecl1000Modified()) { 
           lrecl1000 = refreshLrecl1000();
        }
   		return lrecl1000;
	}
	
	/**
	 * 	Update Lrecl1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-LRECL
	 *	@param number
	 */
	public void setLrecl1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lrecl1000 = checkLrecl1000MaxLimit(number); 
		serializeLrecl1000(lrecl1000);
	}


	public void setLrecl1000(long number) {
	    number = checkLrecl1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLrecl1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isLreclNull881000()
	 *	@return  Returns true if isLreclNull881000() is 0
	 */
   public boolean isLreclNull881000() throws CFException {
      return (  getLrecl1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setLreclNull881000True() {  			
    	setLrecl1000( 0);
   	}
	/**
	 *	Returns the value of blksz1000
	 *	@return blksz1000
	 */
	public int getBlksz1000() throws CFException {
        if (isBlksz1000Modified()) { 
           blksz1000 = refreshBlksz1000();
        }
   		return blksz1000;
	}
	
	/**
	 * 	Update Blksz1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-BLKSZ
	 *	@param number
	 */
	public void setBlksz1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    blksz1000 = checkBlksz1000MaxLimit(number); 
		serializeBlksz1000(blksz1000);
	}


	public void setBlksz1000(long number) {
	    number = checkBlksz1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBlksz1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isBlkszNull881000()
	 *	@return  Returns true if isBlkszNull881000() is 0
	 */
   public boolean isBlkszNull881000() throws CFException {
      return (  getBlksz1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setBlkszNull881000True() {  			
    	setBlksz1000( 0);
   	}
	/**
	 *	Returns the value of recordCopyCnt1000
	 *	@return recordCopyCnt1000
	 */
	public int getRecordCopyCnt1000() throws CFException {
        if (isRecordCopyCnt1000Modified()) { 
           recordCopyCnt1000 = refreshRecordCopyCnt1000();
        }
   		return recordCopyCnt1000;
	}
	
	/**
	 * 	Update RecordCopyCnt1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-RECORD-COPY-CNT
	 *	@param number
	 */
	public void setRecordCopyCnt1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordCopyCnt1000 = checkRecordCopyCnt1000MaxLimit(number); 
		serializeRecordCopyCnt1000(recordCopyCnt1000);
	}


	public void setRecordCopyCnt1000(long number) {
	    number = checkRecordCopyCnt1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordCopyCnt1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isNoRecordsCopied881000()
	 *	@return  Returns true if isNoRecordsCopied881000() is 0
	 */
   public boolean isNoRecordsCopied881000() throws CFException {
      return (  getRecordCopyCnt1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setNoRecordsCopied881000True() {  			
    	setRecordCopyCnt1000( 0);
   	}
	/**
	 *	Returns the value of broadcastEndpts1000
	 *	@return broadcastEndpts1000
	 */
	public int getBroadcastEndpts1000() throws CFException {
        if (isBroadcastEndpts1000Modified()) { 
           broadcastEndpts1000 = refreshBroadcastEndpts1000();
        }
   		return broadcastEndpts1000;
	}
	
	/**
	 * 	Update BroadcastEndpts1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-BROADCAST-ENDPTS
	 *	@param number
	 */
	public void setBroadcastEndpts1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    broadcastEndpts1000 = checkBroadcastEndpts1000MaxLimit(number); 
		serializeBroadcastEndpts1000(broadcastEndpts1000);
	}


	public void setBroadcastEndpts1000(long number) {
	    number = checkBroadcastEndpts1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBroadcastEndpts1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isNoBroadcastEndpts881000()
	 *	@return  Returns true if isNoBroadcastEndpts881000() is 0
	 */
   public boolean isNoBroadcastEndpts881000() throws CFException {
      return (  getBroadcastEndpts1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setNoBroadcastEndpts881000True() {  			
    	setBroadcastEndpts1000( 0);
   	}
	/**
	 *	Returns the value of broadcastErrors1000
	 *	@return broadcastErrors1000
	 */
	public int getBroadcastErrors1000() throws CFException {
        if (isBroadcastErrors1000Modified()) { 
           broadcastErrors1000 = refreshBroadcastErrors1000();
        }
   		return broadcastErrors1000;
	}
	
	/**
	 * 	Update BroadcastErrors1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-BROADCAST-ERRORS
	 *	@param number
	 */
	public void setBroadcastErrors1000(int number) {
	     // Truncate if the number is beyond +/- Max range
	    broadcastErrors1000 = checkBroadcastErrors1000MaxLimit(number); 
		serializeBroadcastErrors1000(broadcastErrors1000);
	}


	public void setBroadcastErrors1000(long number) {
	    number = checkBroadcastErrors1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBroadcastErrors1000((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isNoBroadcastErrors881000()
	 *	@return  Returns true if isNoBroadcastErrors881000() is 0
	 */
   public boolean isNoBroadcastErrors881000() throws CFException {
      return (  getBroadcastErrors1000()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setNoBroadcastErrors881000True() {  			
    	setBroadcastErrors1000( 0);
   	}
	/**
	 *	Returns the value of responseMessage1000
	 *	@return responseMessage1000
	 */
   public char[] getResponseMessage1000() throws CFException{
     if (isResponseMessage1000Modified()) { 
        responseMessage1000 = refreshResponseMessage1000();
     }
   		return responseMessage1000;
   }

  
	/**
	*  set variable responseMessage1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-MESSAGE
	*  @param value
	**/
   public void setResponseMessage1000(char[] value) {
      responseMessage1000 = checkResponseMessage1000Constraints(value);
      serializeResponseMessage1000(responseMessage1000);
   } 

     /**
	 * 	Update ResponseMessage1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseMessage1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseMessage1000,responseMessage1000.length);
   	
   }
   
   public void setResponseMessage1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseMessage1000,responseMessage1000.length);
   	
   }
   
     /**
	 * 	Update ResponseMessage1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseMessage1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseMessage1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseMessage1000 with another Field
	 *	@param value
	 */
   public void setResponseMessage1000(Field source) {
       replace(source,0,source.length(),beginResponseMessage1000,RESPONSE_MESSAGE_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseMessage1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseMessage1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseMessage1000,RESPONSE_MESSAGE_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseMessage1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseMessage1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseMessage1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of responseMessage1000Redefined
	 *	@return responseMessage1000Redefined
	 */   
	 public ResponseMessage1000Redefined getResponseMessage1000Redefined() {
   	return responseMessage1000Redefined;
   }
   /**
	* 	Update ResponseMessage1000Redefined with the passed value
	*   Corresponding COBOL Variable is 1000-RESPONSE-MESSAGE-REDEFINED
	*	@param value
	*/
   public void setResponseMessage1000Redefined(char[] value) {
      responseMessage1000Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ResponseMessage1000Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setResponseMessage1000Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,responseMessage1000Redefined.begin,responseMessage1000Redefined.length());
   }
   
     /**
	 * 	Update ResponseMessage1000Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseMessage1000Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,responseMessage1000Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ResponseMessage1000Redefined with another Field
	 *	@param value
	 */
   public void setResponseMessage1000Redefined(Field source) {
   	replace(source,0,source.length(),responseMessage1000Redefined.begin,responseMessage1000Redefined.length());
   }  
   
     /**
	 * 	Update ResponseMessage1000Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setResponseMessage1000Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,responseMessage1000Redefined.begin,responseMessage1000Redefined.length());
   }
   
     /**
	 * 	Update ResponseMessage1000Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseMessage1000Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,responseMessage1000Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of applProcDate1000
	 *	@return applProcDate1000
	 */
   public char[] getApplProcDate1000() throws CFException{
     if (isApplProcDate1000Modified()) { 
        applProcDate1000 = refreshApplProcDate1000();
     }
   		return applProcDate1000;
   }

  
	/**
	*  set variable applProcDate1000
	*  Corresponding COBOL Variable is 1000-APPL-PROC-DATE
	*  @param value
	**/
   public void setApplProcDate1000(char[] value) {
      applProcDate1000 = checkApplProcDate1000Constraints(value);
      serializeApplProcDate1000(applProcDate1000);
   } 

     /**
	 * 	Update ApplProcDate1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplProcDate1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplProcDate1000,applProcDate1000.length);
   	
   }
   
   public void setApplProcDate1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplProcDate1000,applProcDate1000.length);
   	
   }
   
     /**
	 * 	Update ApplProcDate1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplProcDate1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplProcDate1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplProcDate1000 with another Field
	 *	@param value
	 */
   public void setApplProcDate1000(Field source) {
       replace(source,0,source.length(),beginApplProcDate1000,APPL_PROC_DATE_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ApplProcDate1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplProcDate1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplProcDate1000,APPL_PROC_DATE_1000_LEN);
   	
   }
   
     /**
	 * 	Update ApplProcDate1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplProcDate1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplProcDate1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of applProcDateJul1000
	 *	@return applProcDateJul1000
	 */
   public char[] getApplProcDateJul1000() throws CFException{
     if (isApplProcDateJul1000Modified()) { 
        applProcDateJul1000 = refreshApplProcDateJul1000();
     }
   		return applProcDateJul1000;
   }

  
	/**
	*  set variable applProcDateJul1000
	*  Corresponding COBOL Variable is 1000-APPL-PROC-DATE-JUL
	*  @param value
	**/
   public void setApplProcDateJul1000(char[] value) {
      applProcDateJul1000 = checkApplProcDateJul1000Constraints(value);
      serializeApplProcDateJul1000(applProcDateJul1000);
   } 

     /**
	 * 	Update ApplProcDateJul1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplProcDateJul1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplProcDateJul1000,applProcDateJul1000.length);
   	
   }
   
   public void setApplProcDateJul1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplProcDateJul1000,applProcDateJul1000.length);
   	
   }
   
     /**
	 * 	Update ApplProcDateJul1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplProcDateJul1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplProcDateJul1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplProcDateJul1000 with another Field
	 *	@param value
	 */
   public void setApplProcDateJul1000(Field source) {
       replace(source,0,source.length(),beginApplProcDateJul1000,APPL_PROC_DATE_JUL_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ApplProcDateJul1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplProcDateJul1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplProcDateJul1000,APPL_PROC_DATE_JUL_1000_LEN);
   	
   }
   
     /**
	 * 	Update ApplProcDateJul1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplProcDateJul1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplProcDateJul1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of responseBusPrtnrId1000
	 *	@return responseBusPrtnrId1000
	 */
   public char[] getResponseBusPrtnrId1000() throws CFException{
     if (isResponseBusPrtnrId1000Modified()) { 
        responseBusPrtnrId1000 = refreshResponseBusPrtnrId1000();
     }
   		return responseBusPrtnrId1000;
   }

  
	/**
	*  set variable responseBusPrtnrId1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-BUS-PRTNR-ID
	*  @param value
	**/
   public void setResponseBusPrtnrId1000(char[] value) {
      responseBusPrtnrId1000 = checkResponseBusPrtnrId1000Constraints(value);
      serializeResponseBusPrtnrId1000(responseBusPrtnrId1000);
   } 

     /**
	 * 	Update ResponseBusPrtnrId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseBusPrtnrId1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseBusPrtnrId1000,responseBusPrtnrId1000.length);
   	
   }
   
   public void setResponseBusPrtnrId1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseBusPrtnrId1000,responseBusPrtnrId1000.length);
   	
   }
   
     /**
	 * 	Update ResponseBusPrtnrId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseBusPrtnrId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseBusPrtnrId1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseBusPrtnrId1000 with another Field
	 *	@param value
	 */
   public void setResponseBusPrtnrId1000(Field source) {
       replace(source,0,source.length(),beginResponseBusPrtnrId1000,RESPONSE_BUS_PRTNR_ID_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseBusPrtnrId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseBusPrtnrId1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseBusPrtnrId1000,RESPONSE_BUS_PRTNR_ID_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseBusPrtnrId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseBusPrtnrId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseBusPrtnrId1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of responseIca1000
	 *	@return responseIca1000
	 */
   public char[] getResponseIca1000() throws CFException{
     if (isResponseIca1000Modified()) { 
        responseIca1000 = refreshResponseIca1000();
     }
   		return responseIca1000;
   }

  
	/**
	*  set variable responseIca1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-ICA
	*  @param value
	**/
   public void setResponseIca1000(char[] value) {
      responseIca1000 = checkResponseIca1000Constraints(value);
      serializeResponseIca1000(responseIca1000);
   } 

     /**
	 * 	Update ResponseIca1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseIca1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseIca1000,responseIca1000.length);
   	
   }
   
   public void setResponseIca1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseIca1000,responseIca1000.length);
   	
   }
   
     /**
	 * 	Update ResponseIca1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseIca1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseIca1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseIca1000 with another Field
	 *	@param value
	 */
   public void setResponseIca1000(Field source) {
       replace(source,0,source.length(),beginResponseIca1000,RESPONSE_ICA_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseIca1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseIca1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseIca1000,RESPONSE_ICA_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseIca1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseIca1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseIca1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of responseTknname1000
	 *	@return responseTknname1000
	 */
   public char[] getResponseTknname1000() throws CFException{
     if (isResponseTknname1000Modified()) { 
        responseTknname1000 = refreshResponseTknname1000();
     }
   		return responseTknname1000;
   }

  
	/**
	*  set variable responseTknname1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-TKNNAME
	*  @param value
	**/
   public void setResponseTknname1000(char[] value) {
      responseTknname1000 = checkResponseTknname1000Constraints(value);
      serializeResponseTknname1000(responseTknname1000);
   } 

     /**
	 * 	Update ResponseTknname1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseTknname1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseTknname1000,responseTknname1000.length);
   	
   }
   
   public void setResponseTknname1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseTknname1000,responseTknname1000.length);
   	
   }
   
     /**
	 * 	Update ResponseTknname1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseTknname1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseTknname1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseTknname1000 with another Field
	 *	@param value
	 */
   public void setResponseTknname1000(Field source) {
       replace(source,0,source.length(),beginResponseTknname1000,RESPONSE_TKNNAME_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseTknname1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseTknname1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseTknname1000,RESPONSE_TKNNAME_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseTknname1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseTknname1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseTknname1000+targetIndex,targetLen);
    
   }
	char[] respTknnameNull88100088Value = "                                                                                                                                ".toCharArray();
	/**
	 *	Test condition " " for isRespTknnameNull881000()
	 *	@return  Returns true if isRespTknnameNull881000() is " "
	 */
   public boolean isRespTknnameNull881000() throws CFException {
      return (  compareChars( getResponseTknname1000() , respTknnameNull88100088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setRespTknnameNull881000True() {  			
    	setResponseTknname1000( respTknnameNull88100088Value);
   	}
	/**
	 *	Returns the value of responseGftDsnFail1000
	 *	@return responseGftDsnFail1000
	 */
   public char[] getResponseGftDsnFail1000() throws CFException{
     if (isResponseGftDsnFail1000Modified()) { 
        responseGftDsnFail1000 = refreshResponseGftDsnFail1000();
     }
   		return responseGftDsnFail1000;
   }

  
	/**
	*  set variable responseGftDsnFail1000
	*  Corresponding COBOL Variable is 1000-RESPONSE-GFT-DSN-FAIL
	*  @param value
	**/
   public void setResponseGftDsnFail1000(char[] value) {
      responseGftDsnFail1000 = checkResponseGftDsnFail1000Constraints(value);
      serializeResponseGftDsnFail1000(responseGftDsnFail1000);
   } 

     /**
	 * 	Update ResponseGftDsnFail1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResponseGftDsnFail1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResponseGftDsnFail1000,responseGftDsnFail1000.length);
   	
   }
   
   public void setResponseGftDsnFail1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResponseGftDsnFail1000,responseGftDsnFail1000.length);
   	
   }
   
     /**
	 * 	Update ResponseGftDsnFail1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResponseGftDsnFail1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseGftDsnFail1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResponseGftDsnFail1000 with another Field
	 *	@param value
	 */
   public void setResponseGftDsnFail1000(Field source) {
       replace(source,0,source.length(),beginResponseGftDsnFail1000,RESPONSE_GFT_DSN_FAIL_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ResponseGftDsnFail1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResponseGftDsnFail1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResponseGftDsnFail1000,RESPONSE_GFT_DSN_FAIL_1000_LEN);
   	
   }
   
     /**
	 * 	Update ResponseGftDsnFail1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResponseGftDsnFail1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResponseGftDsnFail1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getResponseParms1000FieldLength() {
			return RESPONSE_PARMS_1000_LENGTH;
		}

}
  
