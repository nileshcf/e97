package com.cloudframe.app.sf320010.dto;

/**
*  The class RpPsDetail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpPsDetail extends RpPsDetailSerialized {
   

						private char[] rpPsDCc = Field.fillLowValue(1);

						private char[] rpPsRecordType = Field.fillLowValue(1);


						private char[] rpPsReferenceNbr = Field.fillLowValue(6);


						private char[] rpPsTime = Field.fillLowValue(6);


						private char[] rpPsTransDate = Field.fillLowValue(6);


						private char[] rpPsFloorLimInd = Field.fillLowValue(1);


								private long rpPsFloorLimAmt;


						private char[] rpPsPosResponse = Field.fillLowValue(1);


						private char[] rpPsRejectReason = Field.fillLowValue(1);


						private char[] rpPsInasTransCode = Field.fillLowValue(3);


						private char[] rpPsInasResponse = Field.fillLowValue(1);


						private char[] rpPsAuthorizationCode = Field.fillLowValue(6);


						private char[] rpPsIcaNumber = Field.fillLowValue(6);


						private char[] rpPsTerminalId = Field.fillLowValue(18);


						private char[] rpPsCardholderNbr = Field.fillLowValue(19);


						private char[] rpPsExpirationDate = Field.fillLowValue(4);

				private RpPsTransAmountX rpPsTransAmountX = new RpPsTransAmountX();


						private char[] rpPsMagneticStripeInd = Field.fillLowValue(1);


						private char[] rpPsMessageStatus = Field.fillLowValue(1);


						private char[] rpPsNetworkType = Field.fillLowValue(1);


								private int rpPsQueueIdInputPort;


								private int rpPsTimeInSystemHh;

								private int rpPsTimeInSystemMm;

								private int rpPsTimeInSystemSs;


						private char[] rpPsTerminalAuthCode = Field.fillLowValue(6);
	
	/**
	* Constructor for RpPsDetail
	**/
    public RpPsDetail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rpPsTransAmountX.setParent(this,getStartOffset() + 100);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 9
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 16
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 23
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 25
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 31
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 33
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 35
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 41
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 48
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 55
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 74
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 94
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 99
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 108
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 110
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 112
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 114
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 119
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 126
             ,1
             );
    }


 

	/**
	 *	Returns the value of rpPsDCc
	 *	@return rpPsDCc
	 */
   public char[] getRpPsDCc() throws CFException{
     if (isRpPsDCcModified()) { 
        rpPsDCc = refreshRpPsDCc();
     }
   		return rpPsDCc;
   }

  
	/**
	*  set variable rpPsDCc
	*  Corresponding COBOL Variable is RP-PS-D-CC
	*  @param value
	**/
   public void setRpPsDCc(char[] value) {
      rpPsDCc = checkRpPsDCcConstraints(value);
      serializeRpPsDCc(rpPsDCc);
   } 

     /**
	 * 	Update RpPsDCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsDCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsDCc,rpPsDCc.length);
   	
   }
   
   public void setRpPsDCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsDCc,rpPsDCc.length);
   	
   }
   
     /**
	 * 	Update RpPsDCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsDCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsDCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsDCc with another Field
	 *	@param value
	 */
   public void setRpPsDCc(Field source) {
       replace(source,0,source.length(),beginRpPsDCc,RP_PS_DCC_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsDCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsDCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsDCc,RP_PS_DCC_LEN);
   	
   }
   
     /**
	 * 	Update RpPsDCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsDCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsDCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsRecordType
	 *	@return rpPsRecordType
	 */
   public char[] getRpPsRecordType() throws CFException{
     if (isRpPsRecordTypeModified()) { 
        rpPsRecordType = refreshRpPsRecordType();
     }
   		return rpPsRecordType;
   }

  
	/**
	*  set variable rpPsRecordType
	*  Corresponding COBOL Variable is RP-PS-RECORD-TYPE
	*  @param value
	**/
   public void setRpPsRecordType(char[] value) {
      rpPsRecordType = checkRpPsRecordTypeConstraints(value);
      serializeRpPsRecordType(rpPsRecordType);
   } 

     /**
	 * 	Update RpPsRecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsRecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsRecordType,rpPsRecordType.length);
   	
   }
   
   public void setRpPsRecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsRecordType,rpPsRecordType.length);
   	
   }
   
     /**
	 * 	Update RpPsRecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsRecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsRecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsRecordType with another Field
	 *	@param value
	 */
   public void setRpPsRecordType(Field source) {
       replace(source,0,source.length(),beginRpPsRecordType,RP_PS_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsRecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsRecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsRecordType,RP_PS_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsRecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsRecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsRecordType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsReferenceNbr
	 *	@return rpPsReferenceNbr
	 */
   public char[] getRpPsReferenceNbr() throws CFException{
     if (isRpPsReferenceNbrModified()) { 
        rpPsReferenceNbr = refreshRpPsReferenceNbr();
     }
   		return rpPsReferenceNbr;
   }

  
	/**
	*  set variable rpPsReferenceNbr
	*  Corresponding COBOL Variable is RP-PS-REFERENCE-NBR
	*  @param value
	**/
   public void setRpPsReferenceNbr(char[] value) {
      rpPsReferenceNbr = checkRpPsReferenceNbrConstraints(value);
      serializeRpPsReferenceNbr(rpPsReferenceNbr);
   } 

     /**
	 * 	Update RpPsReferenceNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsReferenceNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsReferenceNbr,rpPsReferenceNbr.length);
   	
   }
   
   public void setRpPsReferenceNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsReferenceNbr,rpPsReferenceNbr.length);
   	
   }
   
     /**
	 * 	Update RpPsReferenceNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsReferenceNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsReferenceNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsReferenceNbr with another Field
	 *	@param value
	 */
   public void setRpPsReferenceNbr(Field source) {
       replace(source,0,source.length(),beginRpPsReferenceNbr,RP_PS_REFERENCE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsReferenceNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsReferenceNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsReferenceNbr,RP_PS_REFERENCE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update RpPsReferenceNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsReferenceNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsReferenceNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsTime
	 *	@return rpPsTime
	 */
   public char[] getRpPsTime() throws CFException{
     if (isRpPsTimeModified()) { 
        rpPsTime = refreshRpPsTime();
     }
   		return rpPsTime;
   }

  
	/**
	*  set variable rpPsTime
	*  Corresponding COBOL Variable is RP-PS-TIME
	*  @param value
	**/
   public void setRpPsTime(char[] value) {
      rpPsTime = checkRpPsTimeConstraints(value);
      serializeRpPsTime(rpPsTime);
   } 

     /**
	 * 	Update RpPsTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsTime,rpPsTime.length);
   	
   }
   
   public void setRpPsTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTime,rpPsTime.length);
   	
   }
   
     /**
	 * 	Update RpPsTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsTime with another Field
	 *	@param value
	 */
   public void setRpPsTime(Field source) {
       replace(source,0,source.length(),beginRpPsTime,RP_PS_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsTime,RP_PS_TIME_LEN);
   	
   }
   
     /**
	 * 	Update RpPsTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsTransDate
	 *	@return rpPsTransDate
	 */
   public char[] getRpPsTransDate() throws CFException{
     if (isRpPsTransDateModified()) { 
        rpPsTransDate = refreshRpPsTransDate();
     }
   		return rpPsTransDate;
   }

  
	/**
	*  set variable rpPsTransDate
	*  Corresponding COBOL Variable is RP-PS-TRANS-DATE
	*  @param value
	**/
   public void setRpPsTransDate(char[] value) {
      rpPsTransDate = checkRpPsTransDateConstraints(value);
      serializeRpPsTransDate(rpPsTransDate);
   } 

     /**
	 * 	Update RpPsTransDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsTransDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsTransDate,rpPsTransDate.length);
   	
   }
   
   public void setRpPsTransDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTransDate,rpPsTransDate.length);
   	
   }
   
     /**
	 * 	Update RpPsTransDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTransDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTransDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsTransDate with another Field
	 *	@param value
	 */
   public void setRpPsTransDate(Field source) {
       replace(source,0,source.length(),beginRpPsTransDate,RP_PS_TRANS_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsTransDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsTransDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsTransDate,RP_PS_TRANS_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsTransDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTransDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTransDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsFloorLimInd
	 *	@return rpPsFloorLimInd
	 */
   public char[] getRpPsFloorLimInd() throws CFException{
     if (isRpPsFloorLimIndModified()) { 
        rpPsFloorLimInd = refreshRpPsFloorLimInd();
     }
   		return rpPsFloorLimInd;
   }

  
	/**
	*  set variable rpPsFloorLimInd
	*  Corresponding COBOL Variable is RP-PS-FLOOR-LIM-IND
	*  @param value
	**/
   public void setRpPsFloorLimInd(char[] value) {
      rpPsFloorLimInd = checkRpPsFloorLimIndConstraints(value);
      serializeRpPsFloorLimInd(rpPsFloorLimInd);
   } 

     /**
	 * 	Update RpPsFloorLimInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsFloorLimInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsFloorLimInd,rpPsFloorLimInd.length);
   	
   }
   
   public void setRpPsFloorLimInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsFloorLimInd,rpPsFloorLimInd.length);
   	
   }
   
     /**
	 * 	Update RpPsFloorLimInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsFloorLimInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsFloorLimInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsFloorLimInd with another Field
	 *	@param value
	 */
   public void setRpPsFloorLimInd(Field source) {
       replace(source,0,source.length(),beginRpPsFloorLimInd,RP_PS_FLOOR_LIM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsFloorLimInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsFloorLimInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsFloorLimInd,RP_PS_FLOOR_LIM_IND_LEN);
   	
   }
   
     /**
	 * 	Update RpPsFloorLimInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsFloorLimInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsFloorLimInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsFloorLimAmt
	 *	@return rpPsFloorLimAmt
	 */
	public long getRpPsFloorLimAmt() throws CFException {
       if (isRpPsFloorLimAmtModified()) { 
           rpPsFloorLimAmt = refreshRpPsFloorLimAmt();
        }
   		return rpPsFloorLimAmt;
	}
	

	
	   
	/**
	 * 	Update RpPsFloorLimAmt with the passed value
	 *  Corresponding COBOL Variable is RP-PS-FLOOR-LIM-AMT
	 *	@param number
	 */
	public void setRpPsFloorLimAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rpPsFloorLimAmt = checkRpPsFloorLimAmtMaxLimit(number); 
		serializeRpPsFloorLimAmt(rpPsFloorLimAmt);
	}
	

	/**
	 * 	Update RpPsFloorLimAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setRpPsFloorLimAmt(char[] value) throws CFException {
		 rpPsFloorLimAmt = serializeRpPsFloorLimAmt(value);
	}
	/**
	 * 	Update RpPsFloorLimAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRpPsFloorLimAmtString(char[] value) throws CFException {
		 setRpPsFloorLimAmt(value);
	}
	/**
	 *	Returns the value of rpPsPosResponse
	 *	@return rpPsPosResponse
	 */
   public char[] getRpPsPosResponse() throws CFException{
     if (isRpPsPosResponseModified()) { 
        rpPsPosResponse = refreshRpPsPosResponse();
     }
   		return rpPsPosResponse;
   }

  
	/**
	*  set variable rpPsPosResponse
	*  Corresponding COBOL Variable is RP-PS-POS-RESPONSE
	*  @param value
	**/
   public void setRpPsPosResponse(char[] value) {
      rpPsPosResponse = checkRpPsPosResponseConstraints(value);
      serializeRpPsPosResponse(rpPsPosResponse);
   } 

     /**
	 * 	Update RpPsPosResponse 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsPosResponse(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsPosResponse,rpPsPosResponse.length);
   	
   }
   
   public void setRpPsPosResponse(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsPosResponse,rpPsPosResponse.length);
   	
   }
   
     /**
	 * 	Update RpPsPosResponse 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsPosResponse(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsPosResponse+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsPosResponse with another Field
	 *	@param value
	 */
   public void setRpPsPosResponse(Field source) {
       replace(source,0,source.length(),beginRpPsPosResponse,RP_PS_POS_RESPONSE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsPosResponse 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsPosResponse(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsPosResponse,RP_PS_POS_RESPONSE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsPosResponse 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsPosResponse(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsPosResponse+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsRejectReason
	 *	@return rpPsRejectReason
	 */
   public char[] getRpPsRejectReason() throws CFException{
     if (isRpPsRejectReasonModified()) { 
        rpPsRejectReason = refreshRpPsRejectReason();
     }
   		return rpPsRejectReason;
   }

  
	/**
	*  set variable rpPsRejectReason
	*  Corresponding COBOL Variable is RP-PS-REJECT-REASON
	*  @param value
	**/
   public void setRpPsRejectReason(char[] value) {
      rpPsRejectReason = checkRpPsRejectReasonConstraints(value);
      serializeRpPsRejectReason(rpPsRejectReason);
   } 

     /**
	 * 	Update RpPsRejectReason 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsRejectReason(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsRejectReason,rpPsRejectReason.length);
   	
   }
   
   public void setRpPsRejectReason(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsRejectReason,rpPsRejectReason.length);
   	
   }
   
     /**
	 * 	Update RpPsRejectReason 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsRejectReason(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsRejectReason+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsRejectReason with another Field
	 *	@param value
	 */
   public void setRpPsRejectReason(Field source) {
       replace(source,0,source.length(),beginRpPsRejectReason,RP_PS_REJECT_REASON_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsRejectReason 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsRejectReason(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsRejectReason,RP_PS_REJECT_REASON_LEN);
   	
   }
   
     /**
	 * 	Update RpPsRejectReason 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsRejectReason(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsRejectReason+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsInasTransCode
	 *	@return rpPsInasTransCode
	 */
   public char[] getRpPsInasTransCode() throws CFException{
     if (isRpPsInasTransCodeModified()) { 
        rpPsInasTransCode = refreshRpPsInasTransCode();
     }
   		return rpPsInasTransCode;
   }

  
	/**
	*  set variable rpPsInasTransCode
	*  Corresponding COBOL Variable is RP-PS-INAS-TRANS-CODE
	*  @param value
	**/
   public void setRpPsInasTransCode(char[] value) {
      rpPsInasTransCode = checkRpPsInasTransCodeConstraints(value);
      serializeRpPsInasTransCode(rpPsInasTransCode);
   } 

     /**
	 * 	Update RpPsInasTransCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsInasTransCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsInasTransCode,rpPsInasTransCode.length);
   	
   }
   
   public void setRpPsInasTransCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsInasTransCode,rpPsInasTransCode.length);
   	
   }
   
     /**
	 * 	Update RpPsInasTransCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsInasTransCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsInasTransCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsInasTransCode with another Field
	 *	@param value
	 */
   public void setRpPsInasTransCode(Field source) {
       replace(source,0,source.length(),beginRpPsInasTransCode,RP_PS_INAS_TRANS_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsInasTransCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsInasTransCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsInasTransCode,RP_PS_INAS_TRANS_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsInasTransCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsInasTransCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsInasTransCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsInasResponse
	 *	@return rpPsInasResponse
	 */
   public char[] getRpPsInasResponse() throws CFException{
     if (isRpPsInasResponseModified()) { 
        rpPsInasResponse = refreshRpPsInasResponse();
     }
   		return rpPsInasResponse;
   }

  
	/**
	*  set variable rpPsInasResponse
	*  Corresponding COBOL Variable is RP-PS-INAS-RESPONSE
	*  @param value
	**/
   public void setRpPsInasResponse(char[] value) {
      rpPsInasResponse = checkRpPsInasResponseConstraints(value);
      serializeRpPsInasResponse(rpPsInasResponse);
   } 

     /**
	 * 	Update RpPsInasResponse 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsInasResponse(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsInasResponse,rpPsInasResponse.length);
   	
   }
   
   public void setRpPsInasResponse(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsInasResponse,rpPsInasResponse.length);
   	
   }
   
     /**
	 * 	Update RpPsInasResponse 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsInasResponse(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsInasResponse+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsInasResponse with another Field
	 *	@param value
	 */
   public void setRpPsInasResponse(Field source) {
       replace(source,0,source.length(),beginRpPsInasResponse,RP_PS_INAS_RESPONSE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsInasResponse 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsInasResponse(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsInasResponse,RP_PS_INAS_RESPONSE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsInasResponse 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsInasResponse(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsInasResponse+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsAuthorizationCode
	 *	@return rpPsAuthorizationCode
	 */
   public char[] getRpPsAuthorizationCode() throws CFException{
     if (isRpPsAuthorizationCodeModified()) { 
        rpPsAuthorizationCode = refreshRpPsAuthorizationCode();
     }
   		return rpPsAuthorizationCode;
   }

  
	/**
	*  set variable rpPsAuthorizationCode
	*  Corresponding COBOL Variable is RP-PS-AUTHORIZATION-CODE
	*  @param value
	**/
   public void setRpPsAuthorizationCode(char[] value) {
      rpPsAuthorizationCode = checkRpPsAuthorizationCodeConstraints(value);
      serializeRpPsAuthorizationCode(rpPsAuthorizationCode);
   } 

     /**
	 * 	Update RpPsAuthorizationCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsAuthorizationCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsAuthorizationCode,rpPsAuthorizationCode.length);
   	
   }
   
   public void setRpPsAuthorizationCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsAuthorizationCode,rpPsAuthorizationCode.length);
   	
   }
   
     /**
	 * 	Update RpPsAuthorizationCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsAuthorizationCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsAuthorizationCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsAuthorizationCode with another Field
	 *	@param value
	 */
   public void setRpPsAuthorizationCode(Field source) {
       replace(source,0,source.length(),beginRpPsAuthorizationCode,RP_PS_AUTHORIZATION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsAuthorizationCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsAuthorizationCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsAuthorizationCode,RP_PS_AUTHORIZATION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsAuthorizationCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsAuthorizationCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsAuthorizationCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsIcaNumber
	 *	@return rpPsIcaNumber
	 */
   public char[] getRpPsIcaNumber() throws CFException{
     if (isRpPsIcaNumberModified()) { 
        rpPsIcaNumber = refreshRpPsIcaNumber();
     }
   		return rpPsIcaNumber;
   }

  
	/**
	*  set variable rpPsIcaNumber
	*  Corresponding COBOL Variable is RP-PS-ICA-NUMBER
	*  @param value
	**/
   public void setRpPsIcaNumber(char[] value) {
      rpPsIcaNumber = checkRpPsIcaNumberConstraints(value);
      serializeRpPsIcaNumber(rpPsIcaNumber);
   } 

     /**
	 * 	Update RpPsIcaNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsIcaNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsIcaNumber,rpPsIcaNumber.length);
   	
   }
   
   public void setRpPsIcaNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsIcaNumber,rpPsIcaNumber.length);
   	
   }
   
     /**
	 * 	Update RpPsIcaNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsIcaNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsIcaNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsIcaNumber with another Field
	 *	@param value
	 */
   public void setRpPsIcaNumber(Field source) {
       replace(source,0,source.length(),beginRpPsIcaNumber,RP_PS_ICA_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsIcaNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsIcaNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsIcaNumber,RP_PS_ICA_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update RpPsIcaNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsIcaNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsIcaNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsTerminalId
	 *	@return rpPsTerminalId
	 */
   public char[] getRpPsTerminalId() throws CFException{
     if (isRpPsTerminalIdModified()) { 
        rpPsTerminalId = refreshRpPsTerminalId();
     }
   		return rpPsTerminalId;
   }

  
	/**
	*  set variable rpPsTerminalId
	*  Corresponding COBOL Variable is RP-PS-TERMINAL-ID
	*  @param value
	**/
   public void setRpPsTerminalId(char[] value) {
      rpPsTerminalId = checkRpPsTerminalIdConstraints(value);
      serializeRpPsTerminalId(rpPsTerminalId);
   } 

     /**
	 * 	Update RpPsTerminalId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsTerminalId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsTerminalId,rpPsTerminalId.length);
   	
   }
   
   public void setRpPsTerminalId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTerminalId,rpPsTerminalId.length);
   	
   }
   
     /**
	 * 	Update RpPsTerminalId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTerminalId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTerminalId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsTerminalId with another Field
	 *	@param value
	 */
   public void setRpPsTerminalId(Field source) {
       replace(source,0,source.length(),beginRpPsTerminalId,RP_PS_TERMINAL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsTerminalId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsTerminalId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsTerminalId,RP_PS_TERMINAL_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpPsTerminalId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTerminalId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTerminalId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsCardholderNbr
	 *	@return rpPsCardholderNbr
	 */
   public char[] getRpPsCardholderNbr() throws CFException{
     if (isRpPsCardholderNbrModified()) { 
        rpPsCardholderNbr = refreshRpPsCardholderNbr();
     }
   		return rpPsCardholderNbr;
   }

  
	/**
	*  set variable rpPsCardholderNbr
	*  Corresponding COBOL Variable is RP-PS-CARDHOLDER-NBR
	*  @param value
	**/
   public void setRpPsCardholderNbr(char[] value) {
      rpPsCardholderNbr = checkRpPsCardholderNbrConstraints(value);
      serializeRpPsCardholderNbr(rpPsCardholderNbr);
   } 

     /**
	 * 	Update RpPsCardholderNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsCardholderNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsCardholderNbr,rpPsCardholderNbr.length);
   	
   }
   
   public void setRpPsCardholderNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsCardholderNbr,rpPsCardholderNbr.length);
   	
   }
   
     /**
	 * 	Update RpPsCardholderNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsCardholderNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsCardholderNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsCardholderNbr with another Field
	 *	@param value
	 */
   public void setRpPsCardholderNbr(Field source) {
       replace(source,0,source.length(),beginRpPsCardholderNbr,RP_PS_CARDHOLDER_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsCardholderNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsCardholderNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsCardholderNbr,RP_PS_CARDHOLDER_NBR_LEN);
   	
   }
   
     /**
	 * 	Update RpPsCardholderNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsCardholderNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsCardholderNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsExpirationDate
	 *	@return rpPsExpirationDate
	 */
   public char[] getRpPsExpirationDate() throws CFException{
     if (isRpPsExpirationDateModified()) { 
        rpPsExpirationDate = refreshRpPsExpirationDate();
     }
   		return rpPsExpirationDate;
   }

  
	/**
	*  set variable rpPsExpirationDate
	*  Corresponding COBOL Variable is RP-PS-EXPIRATION-DATE
	*  @param value
	**/
   public void setRpPsExpirationDate(char[] value) {
      rpPsExpirationDate = checkRpPsExpirationDateConstraints(value);
      serializeRpPsExpirationDate(rpPsExpirationDate);
   } 

     /**
	 * 	Update RpPsExpirationDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsExpirationDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsExpirationDate,rpPsExpirationDate.length);
   	
   }
   
   public void setRpPsExpirationDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsExpirationDate,rpPsExpirationDate.length);
   	
   }
   
     /**
	 * 	Update RpPsExpirationDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsExpirationDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsExpirationDate with another Field
	 *	@param value
	 */
   public void setRpPsExpirationDate(Field source) {
       replace(source,0,source.length(),beginRpPsExpirationDate,RP_PS_EXPIRATION_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsExpirationDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsExpirationDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsExpirationDate,RP_PS_EXPIRATION_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsExpirationDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsTransAmountX
	 *	@return rpPsTransAmountX
	 */   
	 public RpPsTransAmountX getRpPsTransAmountX() {
   	return rpPsTransAmountX;
   }
   /**
	* 	Update RpPsTransAmountX with the passed value
	*   Corresponding COBOL Variable is RP-PS-TRANS-AMOUNT-X
	*	@param value
	*/
   public void setRpPsTransAmountX(char[] value) {
      rpPsTransAmountX.setString(value); 
   }   
    
     /**
	 * 	Update RpPsTransAmountX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRpPsTransAmountX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rpPsTransAmountX.begin,rpPsTransAmountX.length());
   }
   
     /**
	 * 	Update RpPsTransAmountX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTransAmountX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rpPsTransAmountX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RpPsTransAmountX with another Field
	 *	@param value
	 */
   public void setRpPsTransAmountX(Field source) {
   	replace(source,0,source.length(),rpPsTransAmountX.begin,rpPsTransAmountX.length());
   }  
   
     /**
	 * 	Update RpPsTransAmountX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRpPsTransAmountX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rpPsTransAmountX.begin,rpPsTransAmountX.length());
   }
   
     /**
	 * 	Update RpPsTransAmountX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTransAmountX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rpPsTransAmountX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rpPsMagneticStripeInd
	 *	@return rpPsMagneticStripeInd
	 */
   public char[] getRpPsMagneticStripeInd() throws CFException{
     if (isRpPsMagneticStripeIndModified()) { 
        rpPsMagneticStripeInd = refreshRpPsMagneticStripeInd();
     }
   		return rpPsMagneticStripeInd;
   }

  
	/**
	*  set variable rpPsMagneticStripeInd
	*  Corresponding COBOL Variable is RP-PS-MAGNETIC-STRIPE-IND
	*  @param value
	**/
   public void setRpPsMagneticStripeInd(char[] value) {
      rpPsMagneticStripeInd = checkRpPsMagneticStripeIndConstraints(value);
      serializeRpPsMagneticStripeInd(rpPsMagneticStripeInd);
   } 

     /**
	 * 	Update RpPsMagneticStripeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsMagneticStripeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsMagneticStripeInd,rpPsMagneticStripeInd.length);
   	
   }
   
   public void setRpPsMagneticStripeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsMagneticStripeInd,rpPsMagneticStripeInd.length);
   	
   }
   
     /**
	 * 	Update RpPsMagneticStripeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsMagneticStripeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsMagneticStripeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsMagneticStripeInd with another Field
	 *	@param value
	 */
   public void setRpPsMagneticStripeInd(Field source) {
       replace(source,0,source.length(),beginRpPsMagneticStripeInd,RP_PS_MAGNETIC_STRIPE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsMagneticStripeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsMagneticStripeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsMagneticStripeInd,RP_PS_MAGNETIC_STRIPE_IND_LEN);
   	
   }
   
     /**
	 * 	Update RpPsMagneticStripeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsMagneticStripeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsMagneticStripeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsMessageStatus
	 *	@return rpPsMessageStatus
	 */
   public char[] getRpPsMessageStatus() throws CFException{
     if (isRpPsMessageStatusModified()) { 
        rpPsMessageStatus = refreshRpPsMessageStatus();
     }
   		return rpPsMessageStatus;
   }

  
	/**
	*  set variable rpPsMessageStatus
	*  Corresponding COBOL Variable is RP-PS-MESSAGE-STATUS
	*  @param value
	**/
   public void setRpPsMessageStatus(char[] value) {
      rpPsMessageStatus = checkRpPsMessageStatusConstraints(value);
      serializeRpPsMessageStatus(rpPsMessageStatus);
   } 

     /**
	 * 	Update RpPsMessageStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsMessageStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsMessageStatus,rpPsMessageStatus.length);
   	
   }
   
   public void setRpPsMessageStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsMessageStatus,rpPsMessageStatus.length);
   	
   }
   
     /**
	 * 	Update RpPsMessageStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsMessageStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsMessageStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsMessageStatus with another Field
	 *	@param value
	 */
   public void setRpPsMessageStatus(Field source) {
       replace(source,0,source.length(),beginRpPsMessageStatus,RP_PS_MESSAGE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsMessageStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsMessageStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsMessageStatus,RP_PS_MESSAGE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update RpPsMessageStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsMessageStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsMessageStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsNetworkType
	 *	@return rpPsNetworkType
	 */
   public char[] getRpPsNetworkType() throws CFException{
     if (isRpPsNetworkTypeModified()) { 
        rpPsNetworkType = refreshRpPsNetworkType();
     }
   		return rpPsNetworkType;
   }

  
	/**
	*  set variable rpPsNetworkType
	*  Corresponding COBOL Variable is RP-PS-NETWORK-TYPE
	*  @param value
	**/
   public void setRpPsNetworkType(char[] value) {
      rpPsNetworkType = checkRpPsNetworkTypeConstraints(value);
      serializeRpPsNetworkType(rpPsNetworkType);
   } 

     /**
	 * 	Update RpPsNetworkType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsNetworkType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsNetworkType,rpPsNetworkType.length);
   	
   }
   
   public void setRpPsNetworkType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsNetworkType,rpPsNetworkType.length);
   	
   }
   
     /**
	 * 	Update RpPsNetworkType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsNetworkType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsNetworkType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsNetworkType with another Field
	 *	@param value
	 */
   public void setRpPsNetworkType(Field source) {
       replace(source,0,source.length(),beginRpPsNetworkType,RP_PS_NETWORK_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsNetworkType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsNetworkType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsNetworkType,RP_PS_NETWORK_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsNetworkType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsNetworkType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsNetworkType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPsQueueIdInputPort
	 *	@return rpPsQueueIdInputPort
	 */
	public int getRpPsQueueIdInputPort() throws CFException {
       if (isRpPsQueueIdInputPortModified()) { 
           rpPsQueueIdInputPort = refreshRpPsQueueIdInputPort();
        }
   		return rpPsQueueIdInputPort;
	}
	

	
	   
	/**
	 * 	Update RpPsQueueIdInputPort with the passed value
	 *  Corresponding COBOL Variable is RP-PS-QUEUE-ID-INPUT-PORT
	 *	@param number
	 */
	public void setRpPsQueueIdInputPort(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rpPsQueueIdInputPort = checkRpPsQueueIdInputPortMaxLimit(number); 
		serializeRpPsQueueIdInputPort(rpPsQueueIdInputPort);
	}
	

	public void setRpPsQueueIdInputPort(long number) {
	    number = checkRpPsQueueIdInputPortMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRpPsQueueIdInputPort((int)number);
	}
	
	/**
	 * 	Update RpPsQueueIdInputPort with the passed value
	 *	@param value (String or char[])
	 */
	public void setRpPsQueueIdInputPort(char[] value) throws CFException {
		 rpPsQueueIdInputPort = serializeRpPsQueueIdInputPort(value);
	}
	/**
	 * 	Update RpPsQueueIdInputPort with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRpPsQueueIdInputPortString(char[] value) throws CFException {
		 setRpPsQueueIdInputPort(value);
	}
	/**
	 *	Returns the value of rpPsTimeInSystemHh
	 *	@return rpPsTimeInSystemHh
	 */
	public int getRpPsTimeInSystemHh() throws CFException {
       if (isRpPsTimeInSystemHhModified()) { 
           rpPsTimeInSystemHh = refreshRpPsTimeInSystemHh();
        }
   		return rpPsTimeInSystemHh;
	}
	

	
	   
	/**
	 * 	Update RpPsTimeInSystemHh with the passed value
	 *  Corresponding COBOL Variable is RP-PS-TIME-IN-SYSTEM-HH
	 *	@param number
	 */
	public void setRpPsTimeInSystemHh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rpPsTimeInSystemHh = checkRpPsTimeInSystemHhMaxLimit(number); 
		serializeRpPsTimeInSystemHh(rpPsTimeInSystemHh);
	}
	

	public void setRpPsTimeInSystemHh(long number) {
	    number = checkRpPsTimeInSystemHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRpPsTimeInSystemHh((int)number);
	}
	
	/**
	 * 	Update RpPsTimeInSystemHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setRpPsTimeInSystemHh(char[] value) throws CFException {
		 rpPsTimeInSystemHh = serializeRpPsTimeInSystemHh(value);
	}
	/**
	 * 	Update RpPsTimeInSystemHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRpPsTimeInSystemHhString(char[] value) throws CFException {
		 setRpPsTimeInSystemHh(value);
	}
	/**
	 *	Returns the value of rpPsTimeInSystemMm
	 *	@return rpPsTimeInSystemMm
	 */
	public int getRpPsTimeInSystemMm() throws CFException {
       if (isRpPsTimeInSystemMmModified()) { 
           rpPsTimeInSystemMm = refreshRpPsTimeInSystemMm();
        }
   		return rpPsTimeInSystemMm;
	}
	

	
	   
	/**
	 * 	Update RpPsTimeInSystemMm with the passed value
	 *  Corresponding COBOL Variable is RP-PS-TIME-IN-SYSTEM-MM
	 *	@param number
	 */
	public void setRpPsTimeInSystemMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rpPsTimeInSystemMm = checkRpPsTimeInSystemMmMaxLimit(number); 
		serializeRpPsTimeInSystemMm(rpPsTimeInSystemMm);
	}
	

	public void setRpPsTimeInSystemMm(long number) {
	    number = checkRpPsTimeInSystemMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRpPsTimeInSystemMm((int)number);
	}
	
	/**
	 * 	Update RpPsTimeInSystemMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRpPsTimeInSystemMm(char[] value) throws CFException {
		 rpPsTimeInSystemMm = serializeRpPsTimeInSystemMm(value);
	}
	/**
	 * 	Update RpPsTimeInSystemMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRpPsTimeInSystemMmString(char[] value) throws CFException {
		 setRpPsTimeInSystemMm(value);
	}
	/**
	 *	Returns the value of rpPsTimeInSystemSs
	 *	@return rpPsTimeInSystemSs
	 */
	public int getRpPsTimeInSystemSs() throws CFException {
       if (isRpPsTimeInSystemSsModified()) { 
           rpPsTimeInSystemSs = refreshRpPsTimeInSystemSs();
        }
   		return rpPsTimeInSystemSs;
	}
	

	
	   
	/**
	 * 	Update RpPsTimeInSystemSs with the passed value
	 *  Corresponding COBOL Variable is RP-PS-TIME-IN-SYSTEM-SS
	 *	@param number
	 */
	public void setRpPsTimeInSystemSs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rpPsTimeInSystemSs = checkRpPsTimeInSystemSsMaxLimit(number); 
		serializeRpPsTimeInSystemSs(rpPsTimeInSystemSs);
	}
	

	public void setRpPsTimeInSystemSs(long number) {
	    number = checkRpPsTimeInSystemSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRpPsTimeInSystemSs((int)number);
	}
	
	/**
	 * 	Update RpPsTimeInSystemSs with the passed value
	 *	@param value (String or char[])
	 */
	public void setRpPsTimeInSystemSs(char[] value) throws CFException {
		 rpPsTimeInSystemSs = serializeRpPsTimeInSystemSs(value);
	}
	/**
	 * 	Update RpPsTimeInSystemSs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRpPsTimeInSystemSsString(char[] value) throws CFException {
		 setRpPsTimeInSystemSs(value);
	}
	/**
	 *	Returns the value of rpPsTerminalAuthCode
	 *	@return rpPsTerminalAuthCode
	 */
   public char[] getRpPsTerminalAuthCode() throws CFException{
     if (isRpPsTerminalAuthCodeModified()) { 
        rpPsTerminalAuthCode = refreshRpPsTerminalAuthCode();
     }
   		return rpPsTerminalAuthCode;
   }

  
	/**
	*  set variable rpPsTerminalAuthCode
	*  Corresponding COBOL Variable is RP-PS-TERMINAL-AUTH-CODE
	*  @param value
	**/
   public void setRpPsTerminalAuthCode(char[] value) {
      rpPsTerminalAuthCode = checkRpPsTerminalAuthCodeConstraints(value);
      serializeRpPsTerminalAuthCode(rpPsTerminalAuthCode);
   } 

     /**
	 * 	Update RpPsTerminalAuthCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPsTerminalAuthCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPsTerminalAuthCode,rpPsTerminalAuthCode.length);
   	
   }
   
   public void setRpPsTerminalAuthCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTerminalAuthCode,rpPsTerminalAuthCode.length);
   	
   }
   
     /**
	 * 	Update RpPsTerminalAuthCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTerminalAuthCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTerminalAuthCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPsTerminalAuthCode with another Field
	 *	@param value
	 */
   public void setRpPsTerminalAuthCode(Field source) {
       replace(source,0,source.length(),beginRpPsTerminalAuthCode,RP_PS_TERMINAL_AUTH_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPsTerminalAuthCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPsTerminalAuthCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPsTerminalAuthCode,RP_PS_TERMINAL_AUTH_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RpPsTerminalAuthCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPsTerminalAuthCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPsTerminalAuthCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpPsDetailFieldLength() {
			return RP_PS_DETAIL_LENGTH;
		}

}
  
