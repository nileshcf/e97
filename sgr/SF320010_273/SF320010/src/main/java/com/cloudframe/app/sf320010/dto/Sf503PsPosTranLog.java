package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503PsPosTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503PsPosTranLog extends Sf503PsPosTranLogSerialized { 
   

						private char[] sf503PsRecordType = Field.fillLowValue(1);

						private char[] sf503PsReferenceNbr = Field.fillLowValue(6);

						private char[] sf503PsTime = Field.fillLowValue(8);

						private char[] sf503PsTransDate = Field.fillLowValue(8);

						private char[] sf503PsFloorLimInd = Field.fillLowValue(1);

								private long sf503PsFloorLimAmt;

						private char[] sf503PsPosResponse = Field.fillLowValue(1);

						private char[] sf503PsRejectReason = Field.fillLowValue(1);

						private char[] sf503PsInasTransCode = Field.fillLowValue(3);

						private char[] sf503PsInasResponse = Field.fillLowValue(1);

						private char[] sf503PsAuthorizationCode = Field.fillLowValue(6);

						private char[] sf503PsIcaNumber = Field.fillLowValue(6);

						private char[] sf503PsTerminalId = Field.fillLowValue(18);

						private char[] sf503PsCardholderNbr = Field.fillLowValue(19);

						private char[] sf503PsExpirationDate = Field.fillLowValue(4);
				private Sf503PsTransAmountX sf503PsTransAmountX = new Sf503PsTransAmountX();

						private char[] sf503PsMagneticStripeInd = Field.fillLowValue(1);

						private char[] sf503PsMessageStatus = Field.fillLowValue(1);

						private char[] sf503PsNetworkType = Field.fillLowValue(1);

								private int sf503PsQueueIdInputPort;
				private Sf503PsTimeInSystem sf503PsTimeInSystem = new Sf503PsTimeInSystem();

						private char[] sf503PsTerminalAuthCode = Field.fillLowValue(6);
	
	/**
	* Constructor for Sf503PsPosTranLog
	**/
    public Sf503PsPosTranLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503PsPosTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsPosTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf503PsTransAmountX.setParent(this,getStartOffset() + 95);
	       			sf503PsTimeInSystem.setParent(this,getStartOffset() + 111);
    } 

	/**
	 *	Returns the value of sf503PsRecordType
	 *	@return sf503PsRecordType
	 */
   public char[] getSf503PsRecordType() throws CFException{
     if (isSf503PsRecordTypeModified()) { 
        sf503PsRecordType = refreshSf503PsRecordType();
     }
   		return sf503PsRecordType;
   }

  
	/**
	*  set variable sf503PsRecordType
	*  Corresponding COBOL Variable is SF503-PS-RECORD-TYPE
	*  @param value
	**/
   public void setSf503PsRecordType(char[] value) {
      sf503PsRecordType = checkSf503PsRecordTypeConstraints(value);
      serializeSf503PsRecordType(sf503PsRecordType);
   } 

     /**
	 * 	Update Sf503PsRecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsRecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsRecordType,sf503PsRecordType.length);
   	
   }
   
   public void setSf503PsRecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsRecordType,sf503PsRecordType.length);
   	
   }
   
     /**
	 * 	Update Sf503PsRecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsRecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsRecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsRecordType with another Field
	 *	@param value
	 */
   public void setSf503PsRecordType(Field source) {
       replace(source,0,source.length(),beginSf503PsRecordType,SF_503_PS_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsRecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsRecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsRecordType,SF_503_PS_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsRecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsRecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsRecordType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsReferenceNbr
	 *	@return sf503PsReferenceNbr
	 */
   public char[] getSf503PsReferenceNbr() throws CFException{
     if (isSf503PsReferenceNbrModified()) { 
        sf503PsReferenceNbr = refreshSf503PsReferenceNbr();
     }
   		return sf503PsReferenceNbr;
   }

  
	/**
	*  set variable sf503PsReferenceNbr
	*  Corresponding COBOL Variable is SF503-PS-REFERENCE-NBR
	*  @param value
	**/
   public void setSf503PsReferenceNbr(char[] value) {
      sf503PsReferenceNbr = checkSf503PsReferenceNbrConstraints(value);
      serializeSf503PsReferenceNbr(sf503PsReferenceNbr);
   } 

     /**
	 * 	Update Sf503PsReferenceNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsReferenceNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsReferenceNbr,sf503PsReferenceNbr.length);
   	
   }
   
   public void setSf503PsReferenceNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsReferenceNbr,sf503PsReferenceNbr.length);
   	
   }
   
     /**
	 * 	Update Sf503PsReferenceNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsReferenceNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsReferenceNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsReferenceNbr with another Field
	 *	@param value
	 */
   public void setSf503PsReferenceNbr(Field source) {
       replace(source,0,source.length(),beginSf503PsReferenceNbr,SF_503_PS_REFERENCE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsReferenceNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsReferenceNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsReferenceNbr,SF_503_PS_REFERENCE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsReferenceNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsReferenceNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsReferenceNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsTime
	 *	@return sf503PsTime
	 */
   public char[] getSf503PsTime() throws CFException{
     if (isSf503PsTimeModified()) { 
        sf503PsTime = refreshSf503PsTime();
     }
   		return sf503PsTime;
   }

  
	/**
	*  set variable sf503PsTime
	*  Corresponding COBOL Variable is SF503-PS-TIME
	*  @param value
	**/
   public void setSf503PsTime(char[] value) {
      sf503PsTime = checkSf503PsTimeConstraints(value);
      serializeSf503PsTime(sf503PsTime);
   } 

     /**
	 * 	Update Sf503PsTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsTime,sf503PsTime.length);
   	
   }
   
   public void setSf503PsTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTime,sf503PsTime.length);
   	
   }
   
     /**
	 * 	Update Sf503PsTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsTime with another Field
	 *	@param value
	 */
   public void setSf503PsTime(Field source) {
       replace(source,0,source.length(),beginSf503PsTime,SF_503_PS_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsTime,SF_503_PS_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsTransDate
	 *	@return sf503PsTransDate
	 */
   public char[] getSf503PsTransDate() throws CFException{
     if (isSf503PsTransDateModified()) { 
        sf503PsTransDate = refreshSf503PsTransDate();
     }
   		return sf503PsTransDate;
   }

  
	/**
	*  set variable sf503PsTransDate
	*  Corresponding COBOL Variable is SF503-PS-TRANS-DATE
	*  @param value
	**/
   public void setSf503PsTransDate(char[] value) {
      sf503PsTransDate = checkSf503PsTransDateConstraints(value);
      serializeSf503PsTransDate(sf503PsTransDate);
   } 

     /**
	 * 	Update Sf503PsTransDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTransDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsTransDate,sf503PsTransDate.length);
   	
   }
   
   public void setSf503PsTransDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTransDate,sf503PsTransDate.length);
   	
   }
   
     /**
	 * 	Update Sf503PsTransDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTransDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTransDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsTransDate with another Field
	 *	@param value
	 */
   public void setSf503PsTransDate(Field source) {
       replace(source,0,source.length(),beginSf503PsTransDate,SF_503_PS_TRANS_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsTransDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsTransDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsTransDate,SF_503_PS_TRANS_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsTransDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTransDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTransDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsFloorLimInd
	 *	@return sf503PsFloorLimInd
	 */
   public char[] getSf503PsFloorLimInd() throws CFException{
     if (isSf503PsFloorLimIndModified()) { 
        sf503PsFloorLimInd = refreshSf503PsFloorLimInd();
     }
   		return sf503PsFloorLimInd;
   }

  
	/**
	*  set variable sf503PsFloorLimInd
	*  Corresponding COBOL Variable is SF503-PS-FLOOR-LIM-IND
	*  @param value
	**/
   public void setSf503PsFloorLimInd(char[] value) {
      sf503PsFloorLimInd = checkSf503PsFloorLimIndConstraints(value);
      serializeSf503PsFloorLimInd(sf503PsFloorLimInd);
   } 

     /**
	 * 	Update Sf503PsFloorLimInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsFloorLimInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsFloorLimInd,sf503PsFloorLimInd.length);
   	
   }
   
   public void setSf503PsFloorLimInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsFloorLimInd,sf503PsFloorLimInd.length);
   	
   }
   
     /**
	 * 	Update Sf503PsFloorLimInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsFloorLimInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsFloorLimInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsFloorLimInd with another Field
	 *	@param value
	 */
   public void setSf503PsFloorLimInd(Field source) {
       replace(source,0,source.length(),beginSf503PsFloorLimInd,SF_503_PS_FLOOR_LIM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsFloorLimInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsFloorLimInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsFloorLimInd,SF_503_PS_FLOOR_LIM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsFloorLimInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsFloorLimInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsFloorLimInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsFloorLimAmt
	 *	@return sf503PsFloorLimAmt
	 */
	public long getSf503PsFloorLimAmt() throws CFException {
       if (isSf503PsFloorLimAmtModified()) { 
           sf503PsFloorLimAmt = refreshSf503PsFloorLimAmt();
        }
   		return sf503PsFloorLimAmt;
	}
	

	
	   
	/**
	 * 	Update Sf503PsFloorLimAmt with the passed value
	 *  Corresponding COBOL Variable is SF503-PS-FLOOR-LIM-AMT
	 *	@param number
	 */
	public void setSf503PsFloorLimAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sf503PsFloorLimAmt = checkSf503PsFloorLimAmtMaxLimit(number); 
		serializeSf503PsFloorLimAmt(sf503PsFloorLimAmt);
	}
	

	/**
	 * 	Update Sf503PsFloorLimAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf503PsFloorLimAmt(char[] value) throws CFException {
		 sf503PsFloorLimAmt = serializeSf503PsFloorLimAmt(value);
	}
	/**
	 * 	Update Sf503PsFloorLimAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf503PsFloorLimAmtString(char[] value) throws CFException {
		 setSf503PsFloorLimAmt(value);
	}
	/**
	 *	Returns the value of sf503PsPosResponse
	 *	@return sf503PsPosResponse
	 */
   public char[] getSf503PsPosResponse() throws CFException{
     if (isSf503PsPosResponseModified()) { 
        sf503PsPosResponse = refreshSf503PsPosResponse();
     }
   		return sf503PsPosResponse;
   }

  
	/**
	*  set variable sf503PsPosResponse
	*  Corresponding COBOL Variable is SF503-PS-POS-RESPONSE
	*  @param value
	**/
   public void setSf503PsPosResponse(char[] value) {
      sf503PsPosResponse = checkSf503PsPosResponseConstraints(value);
      serializeSf503PsPosResponse(sf503PsPosResponse);
   } 

     /**
	 * 	Update Sf503PsPosResponse 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsPosResponse(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsPosResponse,sf503PsPosResponse.length);
   	
   }
   
   public void setSf503PsPosResponse(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsPosResponse,sf503PsPosResponse.length);
   	
   }
   
     /**
	 * 	Update Sf503PsPosResponse 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsPosResponse(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsPosResponse+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsPosResponse with another Field
	 *	@param value
	 */
   public void setSf503PsPosResponse(Field source) {
       replace(source,0,source.length(),beginSf503PsPosResponse,SF_503_PS_POS_RESPONSE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsPosResponse 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsPosResponse(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsPosResponse,SF_503_PS_POS_RESPONSE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsPosResponse 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsPosResponse(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsPosResponse+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsRejectReason
	 *	@return sf503PsRejectReason
	 */
   public char[] getSf503PsRejectReason() throws CFException{
     if (isSf503PsRejectReasonModified()) { 
        sf503PsRejectReason = refreshSf503PsRejectReason();
     }
   		return sf503PsRejectReason;
   }

  
	/**
	*  set variable sf503PsRejectReason
	*  Corresponding COBOL Variable is SF503-PS-REJECT-REASON
	*  @param value
	**/
   public void setSf503PsRejectReason(char[] value) {
      sf503PsRejectReason = checkSf503PsRejectReasonConstraints(value);
      serializeSf503PsRejectReason(sf503PsRejectReason);
   } 

     /**
	 * 	Update Sf503PsRejectReason 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsRejectReason(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsRejectReason,sf503PsRejectReason.length);
   	
   }
   
   public void setSf503PsRejectReason(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsRejectReason,sf503PsRejectReason.length);
   	
   }
   
     /**
	 * 	Update Sf503PsRejectReason 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsRejectReason(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsRejectReason+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsRejectReason with another Field
	 *	@param value
	 */
   public void setSf503PsRejectReason(Field source) {
       replace(source,0,source.length(),beginSf503PsRejectReason,SF_503_PS_REJECT_REASON_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsRejectReason 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsRejectReason(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsRejectReason,SF_503_PS_REJECT_REASON_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsRejectReason 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsRejectReason(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsRejectReason+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsInasTransCode
	 *	@return sf503PsInasTransCode
	 */
   public char[] getSf503PsInasTransCode() throws CFException{
     if (isSf503PsInasTransCodeModified()) { 
        sf503PsInasTransCode = refreshSf503PsInasTransCode();
     }
   		return sf503PsInasTransCode;
   }

  
	/**
	*  set variable sf503PsInasTransCode
	*  Corresponding COBOL Variable is SF503-PS-INAS-TRANS-CODE
	*  @param value
	**/
   public void setSf503PsInasTransCode(char[] value) {
      sf503PsInasTransCode = checkSf503PsInasTransCodeConstraints(value);
      serializeSf503PsInasTransCode(sf503PsInasTransCode);
   } 

     /**
	 * 	Update Sf503PsInasTransCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsInasTransCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsInasTransCode,sf503PsInasTransCode.length);
   	
   }
   
   public void setSf503PsInasTransCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsInasTransCode,sf503PsInasTransCode.length);
   	
   }
   
     /**
	 * 	Update Sf503PsInasTransCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsInasTransCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsInasTransCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsInasTransCode with another Field
	 *	@param value
	 */
   public void setSf503PsInasTransCode(Field source) {
       replace(source,0,source.length(),beginSf503PsInasTransCode,SF_503_PS_INAS_TRANS_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsInasTransCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsInasTransCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsInasTransCode,SF_503_PS_INAS_TRANS_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsInasTransCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsInasTransCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsInasTransCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsInasResponse
	 *	@return sf503PsInasResponse
	 */
   public char[] getSf503PsInasResponse() throws CFException{
     if (isSf503PsInasResponseModified()) { 
        sf503PsInasResponse = refreshSf503PsInasResponse();
     }
   		return sf503PsInasResponse;
   }

  
	/**
	*  set variable sf503PsInasResponse
	*  Corresponding COBOL Variable is SF503-PS-INAS-RESPONSE
	*  @param value
	**/
   public void setSf503PsInasResponse(char[] value) {
      sf503PsInasResponse = checkSf503PsInasResponseConstraints(value);
      serializeSf503PsInasResponse(sf503PsInasResponse);
   } 

     /**
	 * 	Update Sf503PsInasResponse 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsInasResponse(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsInasResponse,sf503PsInasResponse.length);
   	
   }
   
   public void setSf503PsInasResponse(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsInasResponse,sf503PsInasResponse.length);
   	
   }
   
     /**
	 * 	Update Sf503PsInasResponse 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsInasResponse(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsInasResponse+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsInasResponse with another Field
	 *	@param value
	 */
   public void setSf503PsInasResponse(Field source) {
       replace(source,0,source.length(),beginSf503PsInasResponse,SF_503_PS_INAS_RESPONSE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsInasResponse 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsInasResponse(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsInasResponse,SF_503_PS_INAS_RESPONSE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsInasResponse 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsInasResponse(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsInasResponse+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsAuthorizationCode
	 *	@return sf503PsAuthorizationCode
	 */
   public char[] getSf503PsAuthorizationCode() throws CFException{
     if (isSf503PsAuthorizationCodeModified()) { 
        sf503PsAuthorizationCode = refreshSf503PsAuthorizationCode();
     }
   		return sf503PsAuthorizationCode;
   }

  
	/**
	*  set variable sf503PsAuthorizationCode
	*  Corresponding COBOL Variable is SF503-PS-AUTHORIZATION-CODE
	*  @param value
	**/
   public void setSf503PsAuthorizationCode(char[] value) {
      sf503PsAuthorizationCode = checkSf503PsAuthorizationCodeConstraints(value);
      serializeSf503PsAuthorizationCode(sf503PsAuthorizationCode);
   } 

     /**
	 * 	Update Sf503PsAuthorizationCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsAuthorizationCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsAuthorizationCode,sf503PsAuthorizationCode.length);
   	
   }
   
   public void setSf503PsAuthorizationCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsAuthorizationCode,sf503PsAuthorizationCode.length);
   	
   }
   
     /**
	 * 	Update Sf503PsAuthorizationCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsAuthorizationCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsAuthorizationCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsAuthorizationCode with another Field
	 *	@param value
	 */
   public void setSf503PsAuthorizationCode(Field source) {
       replace(source,0,source.length(),beginSf503PsAuthorizationCode,SF_503_PS_AUTHORIZATION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsAuthorizationCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsAuthorizationCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsAuthorizationCode,SF_503_PS_AUTHORIZATION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsAuthorizationCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsAuthorizationCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsAuthorizationCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsIcaNumber
	 *	@return sf503PsIcaNumber
	 */
   public char[] getSf503PsIcaNumber() throws CFException{
     if (isSf503PsIcaNumberModified()) { 
        sf503PsIcaNumber = refreshSf503PsIcaNumber();
     }
   		return sf503PsIcaNumber;
   }

  
	/**
	*  set variable sf503PsIcaNumber
	*  Corresponding COBOL Variable is SF503-PS-ICA-NUMBER
	*  @param value
	**/
   public void setSf503PsIcaNumber(char[] value) {
      sf503PsIcaNumber = checkSf503PsIcaNumberConstraints(value);
      serializeSf503PsIcaNumber(sf503PsIcaNumber);
   } 

     /**
	 * 	Update Sf503PsIcaNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsIcaNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsIcaNumber,sf503PsIcaNumber.length);
   	
   }
   
   public void setSf503PsIcaNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsIcaNumber,sf503PsIcaNumber.length);
   	
   }
   
     /**
	 * 	Update Sf503PsIcaNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsIcaNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsIcaNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsIcaNumber with another Field
	 *	@param value
	 */
   public void setSf503PsIcaNumber(Field source) {
       replace(source,0,source.length(),beginSf503PsIcaNumber,SF_503_PS_ICA_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsIcaNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsIcaNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsIcaNumber,SF_503_PS_ICA_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsIcaNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsIcaNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsIcaNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsTerminalId
	 *	@return sf503PsTerminalId
	 */
   public char[] getSf503PsTerminalId() throws CFException{
     if (isSf503PsTerminalIdModified()) { 
        sf503PsTerminalId = refreshSf503PsTerminalId();
     }
   		return sf503PsTerminalId;
   }

  
	/**
	*  set variable sf503PsTerminalId
	*  Corresponding COBOL Variable is SF503-PS-TERMINAL-ID
	*  @param value
	**/
   public void setSf503PsTerminalId(char[] value) {
      sf503PsTerminalId = checkSf503PsTerminalIdConstraints(value);
      serializeSf503PsTerminalId(sf503PsTerminalId);
   } 

     /**
	 * 	Update Sf503PsTerminalId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTerminalId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsTerminalId,sf503PsTerminalId.length);
   	
   }
   
   public void setSf503PsTerminalId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTerminalId,sf503PsTerminalId.length);
   	
   }
   
     /**
	 * 	Update Sf503PsTerminalId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTerminalId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTerminalId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsTerminalId with another Field
	 *	@param value
	 */
   public void setSf503PsTerminalId(Field source) {
       replace(source,0,source.length(),beginSf503PsTerminalId,SF_503_PS_TERMINAL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsTerminalId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsTerminalId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsTerminalId,SF_503_PS_TERMINAL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsTerminalId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTerminalId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTerminalId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsCardholderNbr
	 *	@return sf503PsCardholderNbr
	 */
   public char[] getSf503PsCardholderNbr() throws CFException{
     if (isSf503PsCardholderNbrModified()) { 
        sf503PsCardholderNbr = refreshSf503PsCardholderNbr();
     }
   		return sf503PsCardholderNbr;
   }

  
	/**
	*  set variable sf503PsCardholderNbr
	*  Corresponding COBOL Variable is SF503-PS-CARDHOLDER-NBR
	*  @param value
	**/
   public void setSf503PsCardholderNbr(char[] value) {
      sf503PsCardholderNbr = checkSf503PsCardholderNbrConstraints(value);
      serializeSf503PsCardholderNbr(sf503PsCardholderNbr);
   } 

     /**
	 * 	Update Sf503PsCardholderNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsCardholderNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsCardholderNbr,sf503PsCardholderNbr.length);
   	
   }
   
   public void setSf503PsCardholderNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsCardholderNbr,sf503PsCardholderNbr.length);
   	
   }
   
     /**
	 * 	Update Sf503PsCardholderNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsCardholderNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsCardholderNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsCardholderNbr with another Field
	 *	@param value
	 */
   public void setSf503PsCardholderNbr(Field source) {
       replace(source,0,source.length(),beginSf503PsCardholderNbr,SF_503_PS_CARDHOLDER_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsCardholderNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsCardholderNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsCardholderNbr,SF_503_PS_CARDHOLDER_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsCardholderNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsCardholderNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsCardholderNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsExpirationDate
	 *	@return sf503PsExpirationDate
	 */
   public char[] getSf503PsExpirationDate() throws CFException{
     if (isSf503PsExpirationDateModified()) { 
        sf503PsExpirationDate = refreshSf503PsExpirationDate();
     }
   		return sf503PsExpirationDate;
   }

  
	/**
	*  set variable sf503PsExpirationDate
	*  Corresponding COBOL Variable is SF503-PS-EXPIRATION-DATE
	*  @param value
	**/
   public void setSf503PsExpirationDate(char[] value) {
      sf503PsExpirationDate = checkSf503PsExpirationDateConstraints(value);
      serializeSf503PsExpirationDate(sf503PsExpirationDate);
   } 

     /**
	 * 	Update Sf503PsExpirationDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsExpirationDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsExpirationDate,sf503PsExpirationDate.length);
   	
   }
   
   public void setSf503PsExpirationDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsExpirationDate,sf503PsExpirationDate.length);
   	
   }
   
     /**
	 * 	Update Sf503PsExpirationDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsExpirationDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsExpirationDate with another Field
	 *	@param value
	 */
   public void setSf503PsExpirationDate(Field source) {
       replace(source,0,source.length(),beginSf503PsExpirationDate,SF_503_PS_EXPIRATION_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsExpirationDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsExpirationDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsExpirationDate,SF_503_PS_EXPIRATION_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsExpirationDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsTransAmountX
	 *	@return sf503PsTransAmountX
	 */   
	 public Sf503PsTransAmountX getSf503PsTransAmountX() {
   	return sf503PsTransAmountX;
   }
   /**
	* 	Update Sf503PsTransAmountX with the passed value
	*   Corresponding COBOL Variable is SF503-PS-TRANS-AMOUNT-X
	*	@param value
	*/
   public void setSf503PsTransAmountX(char[] value) {
      sf503PsTransAmountX.setString(value); 
   }   
    
     /**
	 * 	Update Sf503PsTransAmountX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTransAmountX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTransAmountX.begin,sf503PsTransAmountX.length());
   }
   
     /**
	 * 	Update Sf503PsTransAmountX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTransAmountX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTransAmountX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503PsTransAmountX with another Field
	 *	@param value
	 */
   public void setSf503PsTransAmountX(Field source) {
   	replace(source,0,source.length(),sf503PsTransAmountX.begin,sf503PsTransAmountX.length());
   }  
   
     /**
	 * 	Update Sf503PsTransAmountX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTransAmountX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTransAmountX.begin,sf503PsTransAmountX.length());
   }
   
     /**
	 * 	Update Sf503PsTransAmountX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTransAmountX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTransAmountX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503PsMagneticStripeInd
	 *	@return sf503PsMagneticStripeInd
	 */
   public char[] getSf503PsMagneticStripeInd() throws CFException{
     if (isSf503PsMagneticStripeIndModified()) { 
        sf503PsMagneticStripeInd = refreshSf503PsMagneticStripeInd();
     }
   		return sf503PsMagneticStripeInd;
   }

  
	/**
	*  set variable sf503PsMagneticStripeInd
	*  Corresponding COBOL Variable is SF503-PS-MAGNETIC-STRIPE-IND
	*  @param value
	**/
   public void setSf503PsMagneticStripeInd(char[] value) {
      sf503PsMagneticStripeInd = checkSf503PsMagneticStripeIndConstraints(value);
      serializeSf503PsMagneticStripeInd(sf503PsMagneticStripeInd);
   } 

     /**
	 * 	Update Sf503PsMagneticStripeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsMagneticStripeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsMagneticStripeInd,sf503PsMagneticStripeInd.length);
   	
   }
   
   public void setSf503PsMagneticStripeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsMagneticStripeInd,sf503PsMagneticStripeInd.length);
   	
   }
   
     /**
	 * 	Update Sf503PsMagneticStripeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsMagneticStripeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsMagneticStripeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsMagneticStripeInd with another Field
	 *	@param value
	 */
   public void setSf503PsMagneticStripeInd(Field source) {
       replace(source,0,source.length(),beginSf503PsMagneticStripeInd,SF_503_PS_MAGNETIC_STRIPE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsMagneticStripeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsMagneticStripeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsMagneticStripeInd,SF_503_PS_MAGNETIC_STRIPE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsMagneticStripeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsMagneticStripeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsMagneticStripeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsMessageStatus
	 *	@return sf503PsMessageStatus
	 */
   public char[] getSf503PsMessageStatus() throws CFException{
     if (isSf503PsMessageStatusModified()) { 
        sf503PsMessageStatus = refreshSf503PsMessageStatus();
     }
   		return sf503PsMessageStatus;
   }

  
	/**
	*  set variable sf503PsMessageStatus
	*  Corresponding COBOL Variable is SF503-PS-MESSAGE-STATUS
	*  @param value
	**/
   public void setSf503PsMessageStatus(char[] value) {
      sf503PsMessageStatus = checkSf503PsMessageStatusConstraints(value);
      serializeSf503PsMessageStatus(sf503PsMessageStatus);
   } 

     /**
	 * 	Update Sf503PsMessageStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsMessageStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsMessageStatus,sf503PsMessageStatus.length);
   	
   }
   
   public void setSf503PsMessageStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsMessageStatus,sf503PsMessageStatus.length);
   	
   }
   
     /**
	 * 	Update Sf503PsMessageStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsMessageStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsMessageStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsMessageStatus with another Field
	 *	@param value
	 */
   public void setSf503PsMessageStatus(Field source) {
       replace(source,0,source.length(),beginSf503PsMessageStatus,SF_503_PS_MESSAGE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsMessageStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsMessageStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsMessageStatus,SF_503_PS_MESSAGE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsMessageStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsMessageStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsMessageStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsNetworkType
	 *	@return sf503PsNetworkType
	 */
   public char[] getSf503PsNetworkType() throws CFException{
     if (isSf503PsNetworkTypeModified()) { 
        sf503PsNetworkType = refreshSf503PsNetworkType();
     }
   		return sf503PsNetworkType;
   }

  
	/**
	*  set variable sf503PsNetworkType
	*  Corresponding COBOL Variable is SF503-PS-NETWORK-TYPE
	*  @param value
	**/
   public void setSf503PsNetworkType(char[] value) {
      sf503PsNetworkType = checkSf503PsNetworkTypeConstraints(value);
      serializeSf503PsNetworkType(sf503PsNetworkType);
   } 

     /**
	 * 	Update Sf503PsNetworkType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsNetworkType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsNetworkType,sf503PsNetworkType.length);
   	
   }
   
   public void setSf503PsNetworkType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsNetworkType,sf503PsNetworkType.length);
   	
   }
   
     /**
	 * 	Update Sf503PsNetworkType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsNetworkType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsNetworkType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsNetworkType with another Field
	 *	@param value
	 */
   public void setSf503PsNetworkType(Field source) {
       replace(source,0,source.length(),beginSf503PsNetworkType,SF_503_PS_NETWORK_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsNetworkType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsNetworkType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsNetworkType,SF_503_PS_NETWORK_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsNetworkType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsNetworkType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsNetworkType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503PsQueueIdInputPort
	 *	@return sf503PsQueueIdInputPort
	 */
	public int getSf503PsQueueIdInputPort() throws CFException {
        if (isSf503PsQueueIdInputPortModified()) { 
           sf503PsQueueIdInputPort = refreshSf503PsQueueIdInputPort();
        }
   		return sf503PsQueueIdInputPort;
	}
	
	/**
	 * 	Update Sf503PsQueueIdInputPort with the passed value
	 *  Corresponding COBOL Variable is SF503-PS-QUEUE-ID-INPUT-PORT
	 *	@param number
	 */
	public void setSf503PsQueueIdInputPort(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503PsQueueIdInputPort = checkSf503PsQueueIdInputPortMaxLimit(number); 
		serializeSf503PsQueueIdInputPort(sf503PsQueueIdInputPort);
	}


	public void setSf503PsQueueIdInputPort(long number) {
	    number = checkSf503PsQueueIdInputPortMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503PsQueueIdInputPort((int)number);
	}
	
	/**
	 *	Returns the value of sf503PsTimeInSystem
	 *	@return sf503PsTimeInSystem
	 */   
	 public Sf503PsTimeInSystem getSf503PsTimeInSystem() {
   	return sf503PsTimeInSystem;
   }
   /**
	* 	Update Sf503PsTimeInSystem with the passed value
	*   Corresponding COBOL Variable is SF503-PS-TIME-IN-SYSTEM
	*	@param value
	*/
   public void setSf503PsTimeInSystem(char[] value) {
      sf503PsTimeInSystem.setString(value); 
   }   
    
     /**
	 * 	Update Sf503PsTimeInSystem 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTimeInSystem(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTimeInSystem.begin,sf503PsTimeInSystem.length());
   }
   
     /**
	 * 	Update Sf503PsTimeInSystem 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTimeInSystem(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTimeInSystem.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503PsTimeInSystem with another Field
	 *	@param value
	 */
   public void setSf503PsTimeInSystem(Field source) {
   	replace(source,0,source.length(),sf503PsTimeInSystem.begin,sf503PsTimeInSystem.length());
   }  
   
     /**
	 * 	Update Sf503PsTimeInSystem 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTimeInSystem(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTimeInSystem.begin,sf503PsTimeInSystem.length());
   }
   
     /**
	 * 	Update Sf503PsTimeInSystem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTimeInSystem(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503PsTimeInSystem.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503PsTerminalAuthCode
	 *	@return sf503PsTerminalAuthCode
	 */
   public char[] getSf503PsTerminalAuthCode() throws CFException{
     if (isSf503PsTerminalAuthCodeModified()) { 
        sf503PsTerminalAuthCode = refreshSf503PsTerminalAuthCode();
     }
   		return sf503PsTerminalAuthCode;
   }

  
	/**
	*  set variable sf503PsTerminalAuthCode
	*  Corresponding COBOL Variable is SF503-PS-TERMINAL-AUTH-CODE
	*  @param value
	**/
   public void setSf503PsTerminalAuthCode(char[] value) {
      sf503PsTerminalAuthCode = checkSf503PsTerminalAuthCodeConstraints(value);
      serializeSf503PsTerminalAuthCode(sf503PsTerminalAuthCode);
   } 

     /**
	 * 	Update Sf503PsTerminalAuthCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503PsTerminalAuthCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503PsTerminalAuthCode,sf503PsTerminalAuthCode.length);
   	
   }
   
   public void setSf503PsTerminalAuthCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTerminalAuthCode,sf503PsTerminalAuthCode.length);
   	
   }
   
     /**
	 * 	Update Sf503PsTerminalAuthCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTerminalAuthCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTerminalAuthCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503PsTerminalAuthCode with another Field
	 *	@param value
	 */
   public void setSf503PsTerminalAuthCode(Field source) {
       replace(source,0,source.length(),beginSf503PsTerminalAuthCode,SF_503_PS_TERMINAL_AUTH_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503PsTerminalAuthCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503PsTerminalAuthCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503PsTerminalAuthCode,SF_503_PS_TERMINAL_AUTH_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503PsTerminalAuthCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503PsTerminalAuthCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503PsTerminalAuthCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503PsPosTranLogFieldLength() {
			return SF_503_PS_POS_TRAN_LOG_LENGTH;
		}

}
  
