package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoExtractRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Sf31IsoExtractRec extends Sf31IsoExtractRecSerialized {
   

						private char[] sf31IsoCardholderNbr = new char[19];

								private BigDecimal sf31IsoTransactionAmt = BigDecimal.ZERO;

						private char[] sf31IsoAcquirerIca = Field.fillLowValue(6);

						private char[] sf31IsoForwardInstIdOnly = new char[6];

						private char[] sf31IsoAuthNumber = Field.fillLowValue(6);

						private char[] sf31IsoAuthResponse = Field.fillLowValue(2);

						private char[] sf31IsoAuthAddlData = Field.fillLowValue(25);

						private char[] sf31IsoCardholderExpdt = new char[4];

						private char[] sf31IsoPosDeviceType = new char[3];

						private char[] sf31IsoTrackTwoData = new char[37];

						private char[] sf31IsoTrackOneData = new char[76];

						private char[] sf31IsoTransactionType = new char[1];

						private char[] sf31IsoAvsRequestTag = new char[2];

						private char[] sf31IsoAvsRequestLgth = new char[2];

						private char[] sf31IsoAvsRequestCode = new char[2];

						private char[] sf31IsoAvsResponseTag = new char[2];

						private char[] sf31IsoAvsResponseLgth = new char[2];

						private char[] sf31IsoAvsResponseCode = new char[1];

						private char[] sf31IsoPosData = new char[26];

						private char[] sf31IsoFinNetworkCode = new char[3];

						private char[] sf31IsoProcessingCode = new char[6];

						private char[] sf31IsoDateTimeXmit = new char[10];

						private char[] sf31IsoMerchantType = new char[4];

						private char[] sf31IsoCountryCode = new char[3];

						private char[] sf31IsoPosPinCapture = new char[2];

						private char[] sf31IsoRetrievalRefno = new char[12];

						private char[] sf31IsoIdTerminal = new char[8];

						private char[] sf31IsoCardAcceptor = new char[15];

						private char[] sf31IsoAddtlData = new char[3];
				private Sf31IsoBkntData sf31IsoBkntData = new Sf31IsoBkntData();

						private char[] sf31IsoMerchantId = new char[16];
				private Sf31IsoTransDate sf31IsoTransDate = new Sf31IsoTransDate();

						private char[] sf31IsoIssUpIca = new char[6];

						private char[] sf31IsoStateCode = new char[2];

						private char[] sf31IsoBlIcSeqNo = new char[8];

						private char[] sf31IsoIcMagCc = new char[1];

						private char[] sf31IsoDe48Tag87Present = new char[1];

						private char[] sf31IsoDe48Tag88Present = new char[1];

						private char[] sf31IsoDe48Tag89Value = new char[1];
				private Sf31IsoAddlAvsii sf31IsoAddlAvsii = new Sf31IsoAddlAvsii();
				private Sf31IsoCrncyConvFields sf31IsoCrncyConvFields = new Sf31IsoCrncyConvFields();

						private char[] sf31IsoMemberData = new char[99];

						private char[] sf31IsoDe48Se24Sf1 = new char[5];

						private char[] sf31IsoDe48Se24Sf2 = new char[3];

						private char[] sf31IsoDe48Se24Sf3 = new char[3];

						private char[] sf31IsoDe48Se24Sf4 = new char[3];

						private char[] sf31IsoDe48Se43Aav = new char[32];

						private char[] sf31IsoDe48Se66Sf1 = new char[1];

						private char[] sf31IsoDe48Se66Sf2 = new char[36];


								private long sf31IsoTimeLocalTrans;

								private int sf31IsoDateLocalTrans;

						private char[] sf31IsoDe48Se42Len3 = new char[3];

						private char[] sf31IsoDe48Se42Sf2Sf3 = new char[4];

						private char[] sf31IsoDe48Se33Sf1 = new char[1];

						private char[] sf31IsoDe48Se33Sf2 = new char[19];

						private char[] sf31IsoDe48Se33Sf5 = new char[2];

						private char[] sf31IsoDe48Se33Sf6 = new char[11];

						private char[] sf31IsoDe48Se52Tic = new char[2];

						private char[] sf31FutureFiller = new char[27];
	
	/**
	* Constructor for Sf31IsoExtractRec
	**/
    public Sf31IsoExtractRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sf31IsoBkntData.setParent(this,getStartOffset() + 300);
	       			sf31IsoTransDate.setParent(this,getStartOffset() + 325);
	       			sf31IsoAddlAvsii.setParent(this,getStartOffset() + 349);
	       			sf31IsoCrncyConvFields.setParent(this,getStartOffset() + 524);
	   	/*  end of offset */
								setSf31IsoCardholderNbr(fillSpace(19));
								setSf31IsoTransactionAmt(BigDecimal.ZERO);
								setSf31IsoForwardInstIdOnly(fillSpace(6));
								setSf31IsoCardholderExpdt(fillSpace(4));
								setSf31IsoPosDeviceType(fillSpace(3));
								setSf31IsoTrackTwoData(fillSpace(37));
								setSf31IsoTrackOneData(pad(76," ".toCharArray(),' ',RIGHT_PAD));
								setSf31IsoTransactionType(fillSpace(1));
								setSf31IsoAvsRequestTag(fillSpace(2));
								setSf31IsoAvsRequestLgth(fillSpace(2));
								setSf31IsoAvsRequestCode(fillSpace(2));
								setSf31IsoAvsResponseTag(fillSpace(2));
								setSf31IsoAvsResponseLgth(fillSpace(2));
								setSf31IsoAvsResponseCode(fillSpace(1));
								setSf31IsoPosData(fillSpace(26));
								setSf31IsoFinNetworkCode(fillSpace(3));
								setSf31IsoProcessingCode(fillSpace(6));
								setSf31IsoDateTimeXmit(fillSpace(10));
								setSf31IsoMerchantType(fillSpace(4));
								setSf31IsoCountryCode(fillSpace(3));
								setSf31IsoPosPinCapture(fillSpace(2));
								setSf31IsoRetrievalRefno(fillSpace(12));
								setSf31IsoIdTerminal(fillSpace(8));
								setSf31IsoCardAcceptor(fillSpace(15));
								setSf31IsoAddtlData(fillSpace(3));
								setSf31IsoMerchantId(fillSpace(16));
								setSf31IsoIssUpIca(fillSpace(6));
								setSf31IsoStateCode(fillSpace(2));
								setSf31IsoBlIcSeqNo(fillSpace(8));
								setSf31IsoIcMagCc(fillSpace(1));
								setSf31IsoDe48Tag87Present(fillSpace(1));
								setSf31IsoDe48Tag88Present(fillSpace(1));
								setSf31IsoDe48Tag89Value(fillSpace(1));
								setSf31IsoMemberData(pad(99," ".toCharArray(),' ',RIGHT_PAD));
								setSf31IsoDe48Se24Sf1(fillSpace(5));
								setSf31IsoDe48Se24Sf2(fillSpace(3));
								setSf31IsoDe48Se24Sf3(fillSpace(3));
								setSf31IsoDe48Se24Sf4(fillSpace(3));
								setSf31IsoDe48Se43Aav(fillSpace(32));
								setSf31IsoDe48Se66Sf1(fillSpace(1));
								setSf31IsoDe48Se66Sf2(fillSpace(36));
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 804
             ,17
             );
								setSf31IsoTimeLocalTrans(0L);
								setSf31IsoDateLocalTrans(0);
								setSf31IsoDe48Se42Len3(fillSpace(3));
								setSf31IsoDe48Se42Sf2Sf3(fillSpace(4));
								setSf31IsoDe48Se33Sf1(fillSpace(1));
								setSf31IsoDe48Se33Sf2(fillSpace(19));
								setSf31IsoDe48Se33Sf5(fillSpace(2));
								setSf31IsoDe48Se33Sf6(fillSpace(11));
								setSf31IsoDe48Se52Tic(fillSpace(2));
								setSf31FutureFiller(fillSpace(27));
    }


 

	/**
	 *	Returns the value of sf31IsoCardholderNbr
	 *	@return sf31IsoCardholderNbr
	 */
   public char[] getSf31IsoCardholderNbr() throws CFException{
     if (isSf31IsoCardholderNbrModified()) { 
        sf31IsoCardholderNbr = refreshSf31IsoCardholderNbr();
     }
   		return sf31IsoCardholderNbr;
   }

  
	/**
	*  set variable sf31IsoCardholderNbr
	*  Corresponding COBOL Variable is SF31-ISO-CARDHOLDER-NBR
	*  @param value
	**/
   public void setSf31IsoCardholderNbr(char[] value) {
      sf31IsoCardholderNbr = checkSf31IsoCardholderNbrConstraints(value);
      serializeSf31IsoCardholderNbr(sf31IsoCardholderNbr);
   } 

     /**
	 * 	Update Sf31IsoCardholderNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCardholderNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoCardholderNbr,sf31IsoCardholderNbr.length);
   	
   }
   
   public void setSf31IsoCardholderNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderNbr,sf31IsoCardholderNbr.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoCardholderNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCardholderNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoCardholderNbr with another Field
	 *	@param value
	 */
   public void setSf31IsoCardholderNbr(Field source) {
       replace(source,0,source.length(),beginSf31IsoCardholderNbr,SF_31_ISO_CARDHOLDER_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoCardholderNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoCardholderNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderNbr,SF_31_ISO_CARDHOLDER_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoCardholderNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCardholderNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoTransactionAmt
	 *	@return sf31IsoTransactionAmt
	 */
	public BigDecimal getSf31IsoTransactionAmt() throws CFException {
       if (isSf31IsoTransactionAmtModified()) { 
           sf31IsoTransactionAmt = refreshSf31IsoTransactionAmt();
        }
   		return sf31IsoTransactionAmt;
	}
	

	
	   
	/**
	 * 	Update Sf31IsoTransactionAmt with the passed number
	 *  Corresponding COBOL Variable is SF31-ISO-TRANSACTION-AMT
	 *	@param number
	 */
	public void setSf31IsoTransactionAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       sf31IsoTransactionAmt = checkSf31IsoTransactionAmtMaxLimit(number);
	    serializeSf31IsoTransactionAmt(sf31IsoTransactionAmt);
   }
	/**
	 * 	Update Sf31IsoTransactionAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf31IsoTransactionAmt(char[] value) throws CFException {
		 sf31IsoTransactionAmt = serializeSf31IsoTransactionAmt(value);
	}   
	/**
	 *	Returns the value of sf31IsoAcquirerIca
	 *	@return sf31IsoAcquirerIca
	 */
   public char[] getSf31IsoAcquirerIca() throws CFException{
     if (isSf31IsoAcquirerIcaModified()) { 
        sf31IsoAcquirerIca = refreshSf31IsoAcquirerIca();
     }
   		return sf31IsoAcquirerIca;
   }

  
	/**
	*  set variable sf31IsoAcquirerIca
	*  Corresponding COBOL Variable is SF31-ISO-ACQUIRER-ICA
	*  @param value
	**/
   public void setSf31IsoAcquirerIca(char[] value) {
      sf31IsoAcquirerIca = checkSf31IsoAcquirerIcaConstraints(value);
      serializeSf31IsoAcquirerIca(sf31IsoAcquirerIca);
   } 

     /**
	 * 	Update Sf31IsoAcquirerIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAcquirerIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAcquirerIca,sf31IsoAcquirerIca.length);
   	
   }
   
   public void setSf31IsoAcquirerIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAcquirerIca,sf31IsoAcquirerIca.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAcquirerIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAcquirerIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAcquirerIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAcquirerIca with another Field
	 *	@param value
	 */
   public void setSf31IsoAcquirerIca(Field source) {
       replace(source,0,source.length(),beginSf31IsoAcquirerIca,SF_31_ISO_ACQUIRER_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAcquirerIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAcquirerIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAcquirerIca,SF_31_ISO_ACQUIRER_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAcquirerIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAcquirerIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAcquirerIca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoForwardInstIdOnly
	 *	@return sf31IsoForwardInstIdOnly
	 */
   public char[] getSf31IsoForwardInstIdOnly() throws CFException{
     if (isSf31IsoForwardInstIdOnlyModified()) { 
        sf31IsoForwardInstIdOnly = refreshSf31IsoForwardInstIdOnly();
     }
   		return sf31IsoForwardInstIdOnly;
   }

  
	/**
	*  set variable sf31IsoForwardInstIdOnly
	*  Corresponding COBOL Variable is SF31-ISO-FORWARD-INST-ID-ONLY
	*  @param value
	**/
   public void setSf31IsoForwardInstIdOnly(char[] value) {
      sf31IsoForwardInstIdOnly = checkSf31IsoForwardInstIdOnlyConstraints(value);
      serializeSf31IsoForwardInstIdOnly(sf31IsoForwardInstIdOnly);
   } 

     /**
	 * 	Update Sf31IsoForwardInstIdOnly 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoForwardInstIdOnly(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoForwardInstIdOnly,sf31IsoForwardInstIdOnly.length);
   	
   }
   
   public void setSf31IsoForwardInstIdOnly(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoForwardInstIdOnly,sf31IsoForwardInstIdOnly.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoForwardInstIdOnly 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoForwardInstIdOnly(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoForwardInstIdOnly+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoForwardInstIdOnly with another Field
	 *	@param value
	 */
   public void setSf31IsoForwardInstIdOnly(Field source) {
       replace(source,0,source.length(),beginSf31IsoForwardInstIdOnly,SF_31_ISO_FORWARD_INST_ID_ONLY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoForwardInstIdOnly 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoForwardInstIdOnly(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoForwardInstIdOnly,SF_31_ISO_FORWARD_INST_ID_ONLY_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoForwardInstIdOnly 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoForwardInstIdOnly(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoForwardInstIdOnly+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAuthNumber
	 *	@return sf31IsoAuthNumber
	 */
   public char[] getSf31IsoAuthNumber() throws CFException{
     if (isSf31IsoAuthNumberModified()) { 
        sf31IsoAuthNumber = refreshSf31IsoAuthNumber();
     }
   		return sf31IsoAuthNumber;
   }

  
	/**
	*  set variable sf31IsoAuthNumber
	*  Corresponding COBOL Variable is SF31-ISO-AUTH-NUMBER
	*  @param value
	**/
   public void setSf31IsoAuthNumber(char[] value) {
      sf31IsoAuthNumber = checkSf31IsoAuthNumberConstraints(value);
      serializeSf31IsoAuthNumber(sf31IsoAuthNumber);
   } 

     /**
	 * 	Update Sf31IsoAuthNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAuthNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAuthNumber,sf31IsoAuthNumber.length);
   	
   }
   
   public void setSf31IsoAuthNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthNumber,sf31IsoAuthNumber.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAuthNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAuthNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAuthNumber with another Field
	 *	@param value
	 */
   public void setSf31IsoAuthNumber(Field source) {
       replace(source,0,source.length(),beginSf31IsoAuthNumber,SF_31_ISO_AUTH_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAuthNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAuthNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAuthNumber,SF_31_ISO_AUTH_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAuthNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAuthNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAuthResponse
	 *	@return sf31IsoAuthResponse
	 */
   public char[] getSf31IsoAuthResponse() throws CFException{
     if (isSf31IsoAuthResponseModified()) { 
        sf31IsoAuthResponse = refreshSf31IsoAuthResponse();
     }
   		return sf31IsoAuthResponse;
   }

  
	/**
	*  set variable sf31IsoAuthResponse
	*  Corresponding COBOL Variable is SF31-ISO-AUTH-RESPONSE
	*  @param value
	**/
   public void setSf31IsoAuthResponse(char[] value) {
      sf31IsoAuthResponse = checkSf31IsoAuthResponseConstraints(value);
      serializeSf31IsoAuthResponse(sf31IsoAuthResponse);
   } 

     /**
	 * 	Update Sf31IsoAuthResponse 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAuthResponse(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAuthResponse,sf31IsoAuthResponse.length);
   	
   }
   
   public void setSf31IsoAuthResponse(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthResponse,sf31IsoAuthResponse.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAuthResponse 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAuthResponse(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthResponse+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAuthResponse with another Field
	 *	@param value
	 */
   public void setSf31IsoAuthResponse(Field source) {
       replace(source,0,source.length(),beginSf31IsoAuthResponse,SF_31_ISO_AUTH_RESPONSE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAuthResponse 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAuthResponse(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAuthResponse,SF_31_ISO_AUTH_RESPONSE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAuthResponse 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAuthResponse(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthResponse+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAuthAddlData
	 *	@return sf31IsoAuthAddlData
	 */
   public char[] getSf31IsoAuthAddlData() throws CFException{
     if (isSf31IsoAuthAddlDataModified()) { 
        sf31IsoAuthAddlData = refreshSf31IsoAuthAddlData();
     }
   		return sf31IsoAuthAddlData;
   }

  
	/**
	*  set variable sf31IsoAuthAddlData
	*  Corresponding COBOL Variable is SF31-ISO-AUTH-ADDL-DATA
	*  @param value
	**/
   public void setSf31IsoAuthAddlData(char[] value) {
      sf31IsoAuthAddlData = checkSf31IsoAuthAddlDataConstraints(value);
      serializeSf31IsoAuthAddlData(sf31IsoAuthAddlData);
   } 

     /**
	 * 	Update Sf31IsoAuthAddlData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAuthAddlData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAuthAddlData,sf31IsoAuthAddlData.length);
   	
   }
   
   public void setSf31IsoAuthAddlData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthAddlData,sf31IsoAuthAddlData.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAuthAddlData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAuthAddlData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthAddlData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAuthAddlData with another Field
	 *	@param value
	 */
   public void setSf31IsoAuthAddlData(Field source) {
       replace(source,0,source.length(),beginSf31IsoAuthAddlData,SF_31_ISO_AUTH_ADDL_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAuthAddlData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAuthAddlData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAuthAddlData,SF_31_ISO_AUTH_ADDL_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAuthAddlData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAuthAddlData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAuthAddlData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoCardholderExpdt
	 *	@return sf31IsoCardholderExpdt
	 */
   public char[] getSf31IsoCardholderExpdt() throws CFException{
     if (isSf31IsoCardholderExpdtModified()) { 
        sf31IsoCardholderExpdt = refreshSf31IsoCardholderExpdt();
     }
   		return sf31IsoCardholderExpdt;
   }

  
	/**
	*  set variable sf31IsoCardholderExpdt
	*  Corresponding COBOL Variable is SF31-ISO-CARDHOLDER-EXPDT
	*  @param value
	**/
   public void setSf31IsoCardholderExpdt(char[] value) {
      sf31IsoCardholderExpdt = checkSf31IsoCardholderExpdtConstraints(value);
      serializeSf31IsoCardholderExpdt(sf31IsoCardholderExpdt);
   } 

     /**
	 * 	Update Sf31IsoCardholderExpdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCardholderExpdt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoCardholderExpdt,sf31IsoCardholderExpdt.length);
   	
   }
   
   public void setSf31IsoCardholderExpdt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderExpdt,sf31IsoCardholderExpdt.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoCardholderExpdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCardholderExpdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderExpdt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoCardholderExpdt with another Field
	 *	@param value
	 */
   public void setSf31IsoCardholderExpdt(Field source) {
       replace(source,0,source.length(),beginSf31IsoCardholderExpdt,SF_31_ISO_CARDHOLDER_EXPDT_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoCardholderExpdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoCardholderExpdt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderExpdt,SF_31_ISO_CARDHOLDER_EXPDT_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoCardholderExpdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCardholderExpdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardholderExpdt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoPosDeviceType
	 *	@return sf31IsoPosDeviceType
	 */
   public char[] getSf31IsoPosDeviceType() throws CFException{
     if (isSf31IsoPosDeviceTypeModified()) { 
        sf31IsoPosDeviceType = refreshSf31IsoPosDeviceType();
     }
   		return sf31IsoPosDeviceType;
   }

  
	/**
	*  set variable sf31IsoPosDeviceType
	*  Corresponding COBOL Variable is SF31-ISO-POS-DEVICE-TYPE
	*  @param value
	**/
   public void setSf31IsoPosDeviceType(char[] value) {
      sf31IsoPosDeviceType = checkSf31IsoPosDeviceTypeConstraints(value);
      serializeSf31IsoPosDeviceType(sf31IsoPosDeviceType);
   } 

     /**
	 * 	Update Sf31IsoPosDeviceType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoPosDeviceType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoPosDeviceType,sf31IsoPosDeviceType.length);
   	
   }
   
   public void setSf31IsoPosDeviceType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosDeviceType,sf31IsoPosDeviceType.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoPosDeviceType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoPosDeviceType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosDeviceType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoPosDeviceType with another Field
	 *	@param value
	 */
   public void setSf31IsoPosDeviceType(Field source) {
       replace(source,0,source.length(),beginSf31IsoPosDeviceType,SF_31_ISO_POS_DEVICE_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoPosDeviceType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoPosDeviceType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoPosDeviceType,SF_31_ISO_POS_DEVICE_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoPosDeviceType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoPosDeviceType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosDeviceType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoTrackTwoData
	 *	@return sf31IsoTrackTwoData
	 */
   public char[] getSf31IsoTrackTwoData() throws CFException{
     if (isSf31IsoTrackTwoDataModified()) { 
        sf31IsoTrackTwoData = refreshSf31IsoTrackTwoData();
     }
   		return sf31IsoTrackTwoData;
   }

  
	/**
	*  set variable sf31IsoTrackTwoData
	*  Corresponding COBOL Variable is SF31-ISO-TRACK-TWO-DATA
	*  @param value
	**/
   public void setSf31IsoTrackTwoData(char[] value) {
      sf31IsoTrackTwoData = checkSf31IsoTrackTwoDataConstraints(value);
      serializeSf31IsoTrackTwoData(sf31IsoTrackTwoData);
   } 

     /**
	 * 	Update Sf31IsoTrackTwoData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoTrackTwoData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoTrackTwoData,sf31IsoTrackTwoData.length);
   	
   }
   
   public void setSf31IsoTrackTwoData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTrackTwoData,sf31IsoTrackTwoData.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoTrackTwoData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTrackTwoData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTrackTwoData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoTrackTwoData with another Field
	 *	@param value
	 */
   public void setSf31IsoTrackTwoData(Field source) {
       replace(source,0,source.length(),beginSf31IsoTrackTwoData,SF_31_ISO_TRACK_TWO_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoTrackTwoData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoTrackTwoData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoTrackTwoData,SF_31_ISO_TRACK_TWO_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoTrackTwoData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTrackTwoData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTrackTwoData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoTrackOneData
	 *	@return sf31IsoTrackOneData
	 */
   public char[] getSf31IsoTrackOneData() throws CFException{
     if (isSf31IsoTrackOneDataModified()) { 
        sf31IsoTrackOneData = refreshSf31IsoTrackOneData();
     }
   		return sf31IsoTrackOneData;
   }

  
	/**
	*  set variable sf31IsoTrackOneData
	*  Corresponding COBOL Variable is SF31-ISO-TRACK-ONE-DATA
	*  @param value
	**/
   public void setSf31IsoTrackOneData(char[] value) {
      sf31IsoTrackOneData = checkSf31IsoTrackOneDataConstraints(value);
      serializeSf31IsoTrackOneData(sf31IsoTrackOneData);
   } 

     /**
	 * 	Update Sf31IsoTrackOneData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoTrackOneData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoTrackOneData,sf31IsoTrackOneData.length);
   	
   }
   
   public void setSf31IsoTrackOneData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTrackOneData,sf31IsoTrackOneData.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoTrackOneData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTrackOneData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTrackOneData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoTrackOneData with another Field
	 *	@param value
	 */
   public void setSf31IsoTrackOneData(Field source) {
       replace(source,0,source.length(),beginSf31IsoTrackOneData,SF_31_ISO_TRACK_ONE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoTrackOneData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoTrackOneData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoTrackOneData,SF_31_ISO_TRACK_ONE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoTrackOneData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTrackOneData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTrackOneData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoTransactionType
	 *	@return sf31IsoTransactionType
	 */
   public char[] getSf31IsoTransactionType() throws CFException{
     if (isSf31IsoTransactionTypeModified()) { 
        sf31IsoTransactionType = refreshSf31IsoTransactionType();
     }
   		return sf31IsoTransactionType;
   }

  
	/**
	*  set variable sf31IsoTransactionType
	*  Corresponding COBOL Variable is SF31-ISO-TRANSACTION-TYPE
	*  @param value
	**/
   public void setSf31IsoTransactionType(char[] value) {
      sf31IsoTransactionType = checkSf31IsoTransactionTypeConstraints(value);
      serializeSf31IsoTransactionType(sf31IsoTransactionType);
   } 

     /**
	 * 	Update Sf31IsoTransactionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoTransactionType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoTransactionType,sf31IsoTransactionType.length);
   	
   }
   
   public void setSf31IsoTransactionType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTransactionType,sf31IsoTransactionType.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoTransactionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTransactionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTransactionType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoTransactionType with another Field
	 *	@param value
	 */
   public void setSf31IsoTransactionType(Field source) {
       replace(source,0,source.length(),beginSf31IsoTransactionType,SF_31_ISO_TRANSACTION_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoTransactionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoTransactionType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoTransactionType,SF_31_ISO_TRANSACTION_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoTransactionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTransactionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTransactionType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvsRequestTag
	 *	@return sf31IsoAvsRequestTag
	 */
   public char[] getSf31IsoAvsRequestTag() throws CFException{
     if (isSf31IsoAvsRequestTagModified()) { 
        sf31IsoAvsRequestTag = refreshSf31IsoAvsRequestTag();
     }
   		return sf31IsoAvsRequestTag;
   }

  
	/**
	*  set variable sf31IsoAvsRequestTag
	*  Corresponding COBOL Variable is SF31-ISO-AVS-REQUEST-TAG
	*  @param value
	**/
   public void setSf31IsoAvsRequestTag(char[] value) {
      sf31IsoAvsRequestTag = checkSf31IsoAvsRequestTagConstraints(value);
      serializeSf31IsoAvsRequestTag(sf31IsoAvsRequestTag);
   } 

     /**
	 * 	Update Sf31IsoAvsRequestTag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvsRequestTag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvsRequestTag,sf31IsoAvsRequestTag.length);
   	
   }
   
   public void setSf31IsoAvsRequestTag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestTag,sf31IsoAvsRequestTag.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsRequestTag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsRequestTag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestTag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvsRequestTag with another Field
	 *	@param value
	 */
   public void setSf31IsoAvsRequestTag(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvsRequestTag,SF_31_ISO_AVS_REQUEST_TAG_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvsRequestTag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvsRequestTag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestTag,SF_31_ISO_AVS_REQUEST_TAG_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsRequestTag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsRequestTag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestTag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvsRequestLgth
	 *	@return sf31IsoAvsRequestLgth
	 */
   public char[] getSf31IsoAvsRequestLgth() throws CFException{
     if (isSf31IsoAvsRequestLgthModified()) { 
        sf31IsoAvsRequestLgth = refreshSf31IsoAvsRequestLgth();
     }
   		return sf31IsoAvsRequestLgth;
   }

  
	/**
	*  set variable sf31IsoAvsRequestLgth
	*  Corresponding COBOL Variable is SF31-ISO-AVS-REQUEST-LGTH
	*  @param value
	**/
   public void setSf31IsoAvsRequestLgth(char[] value) {
      sf31IsoAvsRequestLgth = checkSf31IsoAvsRequestLgthConstraints(value);
      serializeSf31IsoAvsRequestLgth(sf31IsoAvsRequestLgth);
   } 

     /**
	 * 	Update Sf31IsoAvsRequestLgth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvsRequestLgth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvsRequestLgth,sf31IsoAvsRequestLgth.length);
   	
   }
   
   public void setSf31IsoAvsRequestLgth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestLgth,sf31IsoAvsRequestLgth.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsRequestLgth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsRequestLgth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestLgth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvsRequestLgth with another Field
	 *	@param value
	 */
   public void setSf31IsoAvsRequestLgth(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvsRequestLgth,SF_31_ISO_AVS_REQUEST_LGTH_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvsRequestLgth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvsRequestLgth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestLgth,SF_31_ISO_AVS_REQUEST_LGTH_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsRequestLgth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsRequestLgth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestLgth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvsRequestCode
	 *	@return sf31IsoAvsRequestCode
	 */
   public char[] getSf31IsoAvsRequestCode() throws CFException{
     if (isSf31IsoAvsRequestCodeModified()) { 
        sf31IsoAvsRequestCode = refreshSf31IsoAvsRequestCode();
     }
   		return sf31IsoAvsRequestCode;
   }

  
	/**
	*  set variable sf31IsoAvsRequestCode
	*  Corresponding COBOL Variable is SF31-ISO-AVS-REQUEST-CODE
	*  @param value
	**/
   public void setSf31IsoAvsRequestCode(char[] value) {
      sf31IsoAvsRequestCode = checkSf31IsoAvsRequestCodeConstraints(value);
      serializeSf31IsoAvsRequestCode(sf31IsoAvsRequestCode);
   } 

     /**
	 * 	Update Sf31IsoAvsRequestCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvsRequestCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvsRequestCode,sf31IsoAvsRequestCode.length);
   	
   }
   
   public void setSf31IsoAvsRequestCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestCode,sf31IsoAvsRequestCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsRequestCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsRequestCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvsRequestCode with another Field
	 *	@param value
	 */
   public void setSf31IsoAvsRequestCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvsRequestCode,SF_31_ISO_AVS_REQUEST_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvsRequestCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvsRequestCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestCode,SF_31_ISO_AVS_REQUEST_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsRequestCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsRequestCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsRequestCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvsResponseTag
	 *	@return sf31IsoAvsResponseTag
	 */
   public char[] getSf31IsoAvsResponseTag() throws CFException{
     if (isSf31IsoAvsResponseTagModified()) { 
        sf31IsoAvsResponseTag = refreshSf31IsoAvsResponseTag();
     }
   		return sf31IsoAvsResponseTag;
   }

  
	/**
	*  set variable sf31IsoAvsResponseTag
	*  Corresponding COBOL Variable is SF31-ISO-AVS-RESPONSE-TAG
	*  @param value
	**/
   public void setSf31IsoAvsResponseTag(char[] value) {
      sf31IsoAvsResponseTag = checkSf31IsoAvsResponseTagConstraints(value);
      serializeSf31IsoAvsResponseTag(sf31IsoAvsResponseTag);
   } 

     /**
	 * 	Update Sf31IsoAvsResponseTag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvsResponseTag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvsResponseTag,sf31IsoAvsResponseTag.length);
   	
   }
   
   public void setSf31IsoAvsResponseTag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseTag,sf31IsoAvsResponseTag.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsResponseTag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsResponseTag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseTag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvsResponseTag with another Field
	 *	@param value
	 */
   public void setSf31IsoAvsResponseTag(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvsResponseTag,SF_31_ISO_AVS_RESPONSE_TAG_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvsResponseTag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvsResponseTag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseTag,SF_31_ISO_AVS_RESPONSE_TAG_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsResponseTag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsResponseTag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseTag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvsResponseLgth
	 *	@return sf31IsoAvsResponseLgth
	 */
   public char[] getSf31IsoAvsResponseLgth() throws CFException{
     if (isSf31IsoAvsResponseLgthModified()) { 
        sf31IsoAvsResponseLgth = refreshSf31IsoAvsResponseLgth();
     }
   		return sf31IsoAvsResponseLgth;
   }

  
	/**
	*  set variable sf31IsoAvsResponseLgth
	*  Corresponding COBOL Variable is SF31-ISO-AVS-RESPONSE-LGTH
	*  @param value
	**/
   public void setSf31IsoAvsResponseLgth(char[] value) {
      sf31IsoAvsResponseLgth = checkSf31IsoAvsResponseLgthConstraints(value);
      serializeSf31IsoAvsResponseLgth(sf31IsoAvsResponseLgth);
   } 

     /**
	 * 	Update Sf31IsoAvsResponseLgth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvsResponseLgth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvsResponseLgth,sf31IsoAvsResponseLgth.length);
   	
   }
   
   public void setSf31IsoAvsResponseLgth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseLgth,sf31IsoAvsResponseLgth.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsResponseLgth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsResponseLgth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseLgth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvsResponseLgth with another Field
	 *	@param value
	 */
   public void setSf31IsoAvsResponseLgth(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvsResponseLgth,SF_31_ISO_AVS_RESPONSE_LGTH_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvsResponseLgth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvsResponseLgth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseLgth,SF_31_ISO_AVS_RESPONSE_LGTH_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsResponseLgth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsResponseLgth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseLgth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvsResponseCode
	 *	@return sf31IsoAvsResponseCode
	 */
   public char[] getSf31IsoAvsResponseCode() throws CFException{
     if (isSf31IsoAvsResponseCodeModified()) { 
        sf31IsoAvsResponseCode = refreshSf31IsoAvsResponseCode();
     }
   		return sf31IsoAvsResponseCode;
   }

  
	/**
	*  set variable sf31IsoAvsResponseCode
	*  Corresponding COBOL Variable is SF31-ISO-AVS-RESPONSE-CODE
	*  @param value
	**/
   public void setSf31IsoAvsResponseCode(char[] value) {
      sf31IsoAvsResponseCode = checkSf31IsoAvsResponseCodeConstraints(value);
      serializeSf31IsoAvsResponseCode(sf31IsoAvsResponseCode);
   } 

     /**
	 * 	Update Sf31IsoAvsResponseCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvsResponseCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvsResponseCode,sf31IsoAvsResponseCode.length);
   	
   }
   
   public void setSf31IsoAvsResponseCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseCode,sf31IsoAvsResponseCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsResponseCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsResponseCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvsResponseCode with another Field
	 *	@param value
	 */
   public void setSf31IsoAvsResponseCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvsResponseCode,SF_31_ISO_AVS_RESPONSE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvsResponseCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvsResponseCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseCode,SF_31_ISO_AVS_RESPONSE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvsResponseCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvsResponseCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvsResponseCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoPosData
	 *	@return sf31IsoPosData
	 */
   public char[] getSf31IsoPosData() throws CFException{
     if (isSf31IsoPosDataModified()) { 
        sf31IsoPosData = refreshSf31IsoPosData();
     }
   		return sf31IsoPosData;
   }

  
	/**
	*  set variable sf31IsoPosData
	*  Corresponding COBOL Variable is SF31-ISO-POS-DATA
	*  @param value
	**/
   public void setSf31IsoPosData(char[] value) {
      sf31IsoPosData = checkSf31IsoPosDataConstraints(value);
      serializeSf31IsoPosData(sf31IsoPosData);
   } 

     /**
	 * 	Update Sf31IsoPosData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoPosData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoPosData,sf31IsoPosData.length);
   	
   }
   
   public void setSf31IsoPosData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosData,sf31IsoPosData.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoPosData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoPosData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoPosData with another Field
	 *	@param value
	 */
   public void setSf31IsoPosData(Field source) {
       replace(source,0,source.length(),beginSf31IsoPosData,SF_31_ISO_POS_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoPosData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoPosData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoPosData,SF_31_ISO_POS_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoPosData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoPosData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoFinNetworkCode
	 *	@return sf31IsoFinNetworkCode
	 */
   public char[] getSf31IsoFinNetworkCode() throws CFException{
     if (isSf31IsoFinNetworkCodeModified()) { 
        sf31IsoFinNetworkCode = refreshSf31IsoFinNetworkCode();
     }
   		return sf31IsoFinNetworkCode;
   }

  
	/**
	*  set variable sf31IsoFinNetworkCode
	*  Corresponding COBOL Variable is SF31-ISO-FIN-NETWORK-CODE
	*  @param value
	**/
   public void setSf31IsoFinNetworkCode(char[] value) {
      sf31IsoFinNetworkCode = checkSf31IsoFinNetworkCodeConstraints(value);
      serializeSf31IsoFinNetworkCode(sf31IsoFinNetworkCode);
   } 

     /**
	 * 	Update Sf31IsoFinNetworkCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoFinNetworkCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoFinNetworkCode,sf31IsoFinNetworkCode.length);
   	
   }
   
   public void setSf31IsoFinNetworkCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoFinNetworkCode,sf31IsoFinNetworkCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoFinNetworkCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoFinNetworkCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoFinNetworkCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoFinNetworkCode with another Field
	 *	@param value
	 */
   public void setSf31IsoFinNetworkCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoFinNetworkCode,SF_31_ISO_FIN_NETWORK_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoFinNetworkCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoFinNetworkCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoFinNetworkCode,SF_31_ISO_FIN_NETWORK_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoFinNetworkCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoFinNetworkCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoFinNetworkCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoProcessingCode
	 *	@return sf31IsoProcessingCode
	 */
   public char[] getSf31IsoProcessingCode() throws CFException{
     if (isSf31IsoProcessingCodeModified()) { 
        sf31IsoProcessingCode = refreshSf31IsoProcessingCode();
     }
   		return sf31IsoProcessingCode;
   }

  
	/**
	*  set variable sf31IsoProcessingCode
	*  Corresponding COBOL Variable is SF31-ISO-PROCESSING-CODE
	*  @param value
	**/
   public void setSf31IsoProcessingCode(char[] value) {
      sf31IsoProcessingCode = checkSf31IsoProcessingCodeConstraints(value);
      serializeSf31IsoProcessingCode(sf31IsoProcessingCode);
   } 

     /**
	 * 	Update Sf31IsoProcessingCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoProcessingCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoProcessingCode,sf31IsoProcessingCode.length);
   	
   }
   
   public void setSf31IsoProcessingCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoProcessingCode,sf31IsoProcessingCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoProcessingCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoProcessingCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoProcessingCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoProcessingCode with another Field
	 *	@param value
	 */
   public void setSf31IsoProcessingCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoProcessingCode,SF_31_ISO_PROCESSING_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoProcessingCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoProcessingCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoProcessingCode,SF_31_ISO_PROCESSING_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoProcessingCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoProcessingCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoProcessingCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDateTimeXmit
	 *	@return sf31IsoDateTimeXmit
	 */
   public char[] getSf31IsoDateTimeXmit() throws CFException{
     if (isSf31IsoDateTimeXmitModified()) { 
        sf31IsoDateTimeXmit = refreshSf31IsoDateTimeXmit();
     }
   		return sf31IsoDateTimeXmit;
   }

  
	/**
	*  set variable sf31IsoDateTimeXmit
	*  Corresponding COBOL Variable is SF31-ISO-DATE-TIME-XMIT
	*  @param value
	**/
   public void setSf31IsoDateTimeXmit(char[] value) {
      sf31IsoDateTimeXmit = checkSf31IsoDateTimeXmitConstraints(value);
      serializeSf31IsoDateTimeXmit(sf31IsoDateTimeXmit);
   } 

     /**
	 * 	Update Sf31IsoDateTimeXmit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDateTimeXmit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDateTimeXmit,sf31IsoDateTimeXmit.length);
   	
   }
   
   public void setSf31IsoDateTimeXmit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDateTimeXmit,sf31IsoDateTimeXmit.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDateTimeXmit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDateTimeXmit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDateTimeXmit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDateTimeXmit with another Field
	 *	@param value
	 */
   public void setSf31IsoDateTimeXmit(Field source) {
       replace(source,0,source.length(),beginSf31IsoDateTimeXmit,SF_31_ISO_DATE_TIME_XMIT_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDateTimeXmit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDateTimeXmit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDateTimeXmit,SF_31_ISO_DATE_TIME_XMIT_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDateTimeXmit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDateTimeXmit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDateTimeXmit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoMerchantType
	 *	@return sf31IsoMerchantType
	 */
   public char[] getSf31IsoMerchantType() throws CFException{
     if (isSf31IsoMerchantTypeModified()) { 
        sf31IsoMerchantType = refreshSf31IsoMerchantType();
     }
   		return sf31IsoMerchantType;
   }

  
	/**
	*  set variable sf31IsoMerchantType
	*  Corresponding COBOL Variable is SF31-ISO-MERCHANT-TYPE
	*  @param value
	**/
   public void setSf31IsoMerchantType(char[] value) {
      sf31IsoMerchantType = checkSf31IsoMerchantTypeConstraints(value);
      serializeSf31IsoMerchantType(sf31IsoMerchantType);
   } 

     /**
	 * 	Update Sf31IsoMerchantType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoMerchantType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoMerchantType,sf31IsoMerchantType.length);
   	
   }
   
   public void setSf31IsoMerchantType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantType,sf31IsoMerchantType.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoMerchantType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoMerchantType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoMerchantType with another Field
	 *	@param value
	 */
   public void setSf31IsoMerchantType(Field source) {
       replace(source,0,source.length(),beginSf31IsoMerchantType,SF_31_ISO_MERCHANT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoMerchantType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoMerchantType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantType,SF_31_ISO_MERCHANT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoMerchantType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoMerchantType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoCountryCode
	 *	@return sf31IsoCountryCode
	 */
   public char[] getSf31IsoCountryCode() throws CFException{
     if (isSf31IsoCountryCodeModified()) { 
        sf31IsoCountryCode = refreshSf31IsoCountryCode();
     }
   		return sf31IsoCountryCode;
   }

  
	/**
	*  set variable sf31IsoCountryCode
	*  Corresponding COBOL Variable is SF31-ISO-COUNTRY-CODE
	*  @param value
	**/
   public void setSf31IsoCountryCode(char[] value) {
      sf31IsoCountryCode = checkSf31IsoCountryCodeConstraints(value);
      serializeSf31IsoCountryCode(sf31IsoCountryCode);
   } 

     /**
	 * 	Update Sf31IsoCountryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCountryCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoCountryCode,sf31IsoCountryCode.length);
   	
   }
   
   public void setSf31IsoCountryCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCountryCode,sf31IsoCountryCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoCountryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCountryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCountryCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoCountryCode with another Field
	 *	@param value
	 */
   public void setSf31IsoCountryCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoCountryCode,SF_31_ISO_COUNTRY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoCountryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoCountryCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoCountryCode,SF_31_ISO_COUNTRY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoCountryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCountryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCountryCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoPosPinCapture
	 *	@return sf31IsoPosPinCapture
	 */
   public char[] getSf31IsoPosPinCapture() throws CFException{
     if (isSf31IsoPosPinCaptureModified()) { 
        sf31IsoPosPinCapture = refreshSf31IsoPosPinCapture();
     }
   		return sf31IsoPosPinCapture;
   }

  
	/**
	*  set variable sf31IsoPosPinCapture
	*  Corresponding COBOL Variable is SF31-ISO-POS-PIN-CAPTURE
	*  @param value
	**/
   public void setSf31IsoPosPinCapture(char[] value) {
      sf31IsoPosPinCapture = checkSf31IsoPosPinCaptureConstraints(value);
      serializeSf31IsoPosPinCapture(sf31IsoPosPinCapture);
   } 

     /**
	 * 	Update Sf31IsoPosPinCapture 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoPosPinCapture(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoPosPinCapture,sf31IsoPosPinCapture.length);
   	
   }
   
   public void setSf31IsoPosPinCapture(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosPinCapture,sf31IsoPosPinCapture.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoPosPinCapture 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoPosPinCapture(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosPinCapture+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoPosPinCapture with another Field
	 *	@param value
	 */
   public void setSf31IsoPosPinCapture(Field source) {
       replace(source,0,source.length(),beginSf31IsoPosPinCapture,SF_31_ISO_POS_PIN_CAPTURE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoPosPinCapture 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoPosPinCapture(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoPosPinCapture,SF_31_ISO_POS_PIN_CAPTURE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoPosPinCapture 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoPosPinCapture(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoPosPinCapture+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoRetrievalRefno
	 *	@return sf31IsoRetrievalRefno
	 */
   public char[] getSf31IsoRetrievalRefno() throws CFException{
     if (isSf31IsoRetrievalRefnoModified()) { 
        sf31IsoRetrievalRefno = refreshSf31IsoRetrievalRefno();
     }
   		return sf31IsoRetrievalRefno;
   }

  
	/**
	*  set variable sf31IsoRetrievalRefno
	*  Corresponding COBOL Variable is SF31-ISO-RETRIEVAL-REFNO
	*  @param value
	**/
   public void setSf31IsoRetrievalRefno(char[] value) {
      sf31IsoRetrievalRefno = checkSf31IsoRetrievalRefnoConstraints(value);
      serializeSf31IsoRetrievalRefno(sf31IsoRetrievalRefno);
   } 

     /**
	 * 	Update Sf31IsoRetrievalRefno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoRetrievalRefno(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoRetrievalRefno,sf31IsoRetrievalRefno.length);
   	
   }
   
   public void setSf31IsoRetrievalRefno(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoRetrievalRefno,sf31IsoRetrievalRefno.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoRetrievalRefno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoRetrievalRefno(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoRetrievalRefno+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoRetrievalRefno with another Field
	 *	@param value
	 */
   public void setSf31IsoRetrievalRefno(Field source) {
       replace(source,0,source.length(),beginSf31IsoRetrievalRefno,SF_31_ISO_RETRIEVAL_REFNO_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoRetrievalRefno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoRetrievalRefno(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoRetrievalRefno,SF_31_ISO_RETRIEVAL_REFNO_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoRetrievalRefno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoRetrievalRefno(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoRetrievalRefno+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoIdTerminal
	 *	@return sf31IsoIdTerminal
	 */
   public char[] getSf31IsoIdTerminal() throws CFException{
     if (isSf31IsoIdTerminalModified()) { 
        sf31IsoIdTerminal = refreshSf31IsoIdTerminal();
     }
   		return sf31IsoIdTerminal;
   }

  
	/**
	*  set variable sf31IsoIdTerminal
	*  Corresponding COBOL Variable is SF31-ISO-ID-TERMINAL
	*  @param value
	**/
   public void setSf31IsoIdTerminal(char[] value) {
      sf31IsoIdTerminal = checkSf31IsoIdTerminalConstraints(value);
      serializeSf31IsoIdTerminal(sf31IsoIdTerminal);
   } 

     /**
	 * 	Update Sf31IsoIdTerminal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoIdTerminal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoIdTerminal,sf31IsoIdTerminal.length);
   	
   }
   
   public void setSf31IsoIdTerminal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIdTerminal,sf31IsoIdTerminal.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoIdTerminal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoIdTerminal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIdTerminal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoIdTerminal with another Field
	 *	@param value
	 */
   public void setSf31IsoIdTerminal(Field source) {
       replace(source,0,source.length(),beginSf31IsoIdTerminal,SF_31_ISO_ID_TERMINAL_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoIdTerminal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoIdTerminal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoIdTerminal,SF_31_ISO_ID_TERMINAL_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoIdTerminal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoIdTerminal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIdTerminal+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoCardAcceptor
	 *	@return sf31IsoCardAcceptor
	 */
   public char[] getSf31IsoCardAcceptor() throws CFException{
     if (isSf31IsoCardAcceptorModified()) { 
        sf31IsoCardAcceptor = refreshSf31IsoCardAcceptor();
     }
   		return sf31IsoCardAcceptor;
   }

  
	/**
	*  set variable sf31IsoCardAcceptor
	*  Corresponding COBOL Variable is SF31-ISO-CARD-ACCEPTOR
	*  @param value
	**/
   public void setSf31IsoCardAcceptor(char[] value) {
      sf31IsoCardAcceptor = checkSf31IsoCardAcceptorConstraints(value);
      serializeSf31IsoCardAcceptor(sf31IsoCardAcceptor);
   } 

     /**
	 * 	Update Sf31IsoCardAcceptor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCardAcceptor(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoCardAcceptor,sf31IsoCardAcceptor.length);
   	
   }
   
   public void setSf31IsoCardAcceptor(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardAcceptor,sf31IsoCardAcceptor.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoCardAcceptor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCardAcceptor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardAcceptor+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoCardAcceptor with another Field
	 *	@param value
	 */
   public void setSf31IsoCardAcceptor(Field source) {
       replace(source,0,source.length(),beginSf31IsoCardAcceptor,SF_31_ISO_CARD_ACCEPTOR_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoCardAcceptor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoCardAcceptor(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoCardAcceptor,SF_31_ISO_CARD_ACCEPTOR_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoCardAcceptor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCardAcceptor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoCardAcceptor+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAddtlData
	 *	@return sf31IsoAddtlData
	 */
   public char[] getSf31IsoAddtlData() throws CFException{
     if (isSf31IsoAddtlDataModified()) { 
        sf31IsoAddtlData = refreshSf31IsoAddtlData();
     }
   		return sf31IsoAddtlData;
   }

  
	/**
	*  set variable sf31IsoAddtlData
	*  Corresponding COBOL Variable is SF31-ISO-ADDTL-DATA
	*  @param value
	**/
   public void setSf31IsoAddtlData(char[] value) {
      sf31IsoAddtlData = checkSf31IsoAddtlDataConstraints(value);
      serializeSf31IsoAddtlData(sf31IsoAddtlData);
   } 

     /**
	 * 	Update Sf31IsoAddtlData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAddtlData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAddtlData,sf31IsoAddtlData.length);
   	
   }
   
   public void setSf31IsoAddtlData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAddtlData,sf31IsoAddtlData.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAddtlData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAddtlData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAddtlData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAddtlData with another Field
	 *	@param value
	 */
   public void setSf31IsoAddtlData(Field source) {
       replace(source,0,source.length(),beginSf31IsoAddtlData,SF_31_ISO_ADDTL_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAddtlData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAddtlData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAddtlData,SF_31_ISO_ADDTL_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAddtlData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAddtlData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAddtlData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoBkntData
	 *	@return sf31IsoBkntData
	 */   
	 public Sf31IsoBkntData getSf31IsoBkntData() {
   	return sf31IsoBkntData;
   }
   /**
	* 	Update Sf31IsoBkntData with the passed value
	*   Corresponding COBOL Variable is SF31-ISO-BKNT-DATA
	*	@param value
	*/
   public void setSf31IsoBkntData(char[] value) {
      sf31IsoBkntData.setString(value); 
   }   
    
     /**
	 * 	Update Sf31IsoBkntData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBkntData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntData.begin,sf31IsoBkntData.length());
   }
   
     /**
	 * 	Update Sf31IsoBkntData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf31IsoBkntData with another Field
	 *	@param value
	 */
   public void setSf31IsoBkntData(Field source) {
   	replace(source,0,source.length(),sf31IsoBkntData.begin,sf31IsoBkntData.length());
   }  
   
     /**
	 * 	Update Sf31IsoBkntData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBkntData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntData.begin,sf31IsoBkntData.length());
   }
   
     /**
	 * 	Update Sf31IsoBkntData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBkntData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoBkntData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf31IsoMerchantId
	 *	@return sf31IsoMerchantId
	 */
   public char[] getSf31IsoMerchantId() throws CFException{
     if (isSf31IsoMerchantIdModified()) { 
        sf31IsoMerchantId = refreshSf31IsoMerchantId();
     }
   		return sf31IsoMerchantId;
   }

  
	/**
	*  set variable sf31IsoMerchantId
	*  Corresponding COBOL Variable is SF31-ISO-MERCHANT-ID
	*  @param value
	**/
   public void setSf31IsoMerchantId(char[] value) {
      sf31IsoMerchantId = checkSf31IsoMerchantIdConstraints(value);
      serializeSf31IsoMerchantId(sf31IsoMerchantId);
   } 

     /**
	 * 	Update Sf31IsoMerchantId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoMerchantId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoMerchantId,sf31IsoMerchantId.length);
   	
   }
   
   public void setSf31IsoMerchantId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantId,sf31IsoMerchantId.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoMerchantId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoMerchantId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoMerchantId with another Field
	 *	@param value
	 */
   public void setSf31IsoMerchantId(Field source) {
       replace(source,0,source.length(),beginSf31IsoMerchantId,SF_31_ISO_MERCHANT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoMerchantId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoMerchantId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantId,SF_31_ISO_MERCHANT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoMerchantId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoMerchantId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMerchantId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoTransDate
	 *	@return sf31IsoTransDate
	 */   
	 public Sf31IsoTransDate getSf31IsoTransDate() {
   	return sf31IsoTransDate;
   }
   /**
	* 	Update Sf31IsoTransDate with the passed value
	*   Corresponding COBOL Variable is SF31-ISO-TRANS-DATE
	*	@param value
	*/
   public void setSf31IsoTransDate(char[] value) {
      sf31IsoTransDate.setString(value); 
   }   
    
     /**
	 * 	Update Sf31IsoTransDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoTransDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoTransDate.begin,sf31IsoTransDate.length());
   }
   
     /**
	 * 	Update Sf31IsoTransDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTransDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoTransDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf31IsoTransDate with another Field
	 *	@param value
	 */
   public void setSf31IsoTransDate(Field source) {
   	replace(source,0,source.length(),sf31IsoTransDate.begin,sf31IsoTransDate.length());
   }  
   
     /**
	 * 	Update Sf31IsoTransDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoTransDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoTransDate.begin,sf31IsoTransDate.length());
   }
   
     /**
	 * 	Update Sf31IsoTransDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTransDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoTransDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf31IsoIssUpIca
	 *	@return sf31IsoIssUpIca
	 */
   public char[] getSf31IsoIssUpIca() throws CFException{
     if (isSf31IsoIssUpIcaModified()) { 
        sf31IsoIssUpIca = refreshSf31IsoIssUpIca();
     }
   		return sf31IsoIssUpIca;
   }

  
	/**
	*  set variable sf31IsoIssUpIca
	*  Corresponding COBOL Variable is SF31-ISO-ISS-UP-ICA
	*  @param value
	**/
   public void setSf31IsoIssUpIca(char[] value) {
      sf31IsoIssUpIca = checkSf31IsoIssUpIcaConstraints(value);
      serializeSf31IsoIssUpIca(sf31IsoIssUpIca);
   } 

     /**
	 * 	Update Sf31IsoIssUpIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoIssUpIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoIssUpIca,sf31IsoIssUpIca.length);
   	
   }
   
   public void setSf31IsoIssUpIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIssUpIca,sf31IsoIssUpIca.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoIssUpIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoIssUpIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIssUpIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoIssUpIca with another Field
	 *	@param value
	 */
   public void setSf31IsoIssUpIca(Field source) {
       replace(source,0,source.length(),beginSf31IsoIssUpIca,SF_31_ISO_ISS_UP_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoIssUpIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoIssUpIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoIssUpIca,SF_31_ISO_ISS_UP_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoIssUpIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoIssUpIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIssUpIca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoStateCode
	 *	@return sf31IsoStateCode
	 */
   public char[] getSf31IsoStateCode() throws CFException{
     if (isSf31IsoStateCodeModified()) { 
        sf31IsoStateCode = refreshSf31IsoStateCode();
     }
   		return sf31IsoStateCode;
   }

  
	/**
	*  set variable sf31IsoStateCode
	*  Corresponding COBOL Variable is SF31-ISO-STATE-CODE
	*  @param value
	**/
   public void setSf31IsoStateCode(char[] value) {
      sf31IsoStateCode = checkSf31IsoStateCodeConstraints(value);
      serializeSf31IsoStateCode(sf31IsoStateCode);
   } 

     /**
	 * 	Update Sf31IsoStateCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoStateCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoStateCode,sf31IsoStateCode.length);
   	
   }
   
   public void setSf31IsoStateCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoStateCode,sf31IsoStateCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoStateCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoStateCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoStateCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoStateCode with another Field
	 *	@param value
	 */
   public void setSf31IsoStateCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoStateCode,SF_31_ISO_STATE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoStateCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoStateCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoStateCode,SF_31_ISO_STATE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoStateCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoStateCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoStateCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoBlIcSeqNo
	 *	@return sf31IsoBlIcSeqNo
	 */
   public char[] getSf31IsoBlIcSeqNo() throws CFException{
     if (isSf31IsoBlIcSeqNoModified()) { 
        sf31IsoBlIcSeqNo = refreshSf31IsoBlIcSeqNo();
     }
   		return sf31IsoBlIcSeqNo;
   }

  
	/**
	*  set variable sf31IsoBlIcSeqNo
	*  Corresponding COBOL Variable is SF31-ISO-BL-IC-SEQ-NO
	*  @param value
	**/
   public void setSf31IsoBlIcSeqNo(char[] value) {
      sf31IsoBlIcSeqNo = checkSf31IsoBlIcSeqNoConstraints(value);
      serializeSf31IsoBlIcSeqNo(sf31IsoBlIcSeqNo);
   } 

     /**
	 * 	Update Sf31IsoBlIcSeqNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoBlIcSeqNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoBlIcSeqNo,sf31IsoBlIcSeqNo.length);
   	
   }
   
   public void setSf31IsoBlIcSeqNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBlIcSeqNo,sf31IsoBlIcSeqNo.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoBlIcSeqNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBlIcSeqNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBlIcSeqNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoBlIcSeqNo with another Field
	 *	@param value
	 */
   public void setSf31IsoBlIcSeqNo(Field source) {
       replace(source,0,source.length(),beginSf31IsoBlIcSeqNo,SF_31_ISO_BL_IC_SEQ_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoBlIcSeqNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoBlIcSeqNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoBlIcSeqNo,SF_31_ISO_BL_IC_SEQ_NO_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoBlIcSeqNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoBlIcSeqNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoBlIcSeqNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoIcMagCc
	 *	@return sf31IsoIcMagCc
	 */
   public char[] getSf31IsoIcMagCc() throws CFException{
     if (isSf31IsoIcMagCcModified()) { 
        sf31IsoIcMagCc = refreshSf31IsoIcMagCc();
     }
   		return sf31IsoIcMagCc;
   }

  
	/**
	*  set variable sf31IsoIcMagCc
	*  Corresponding COBOL Variable is SF31-ISO-IC-MAG-CC
	*  @param value
	**/
   public void setSf31IsoIcMagCc(char[] value) {
      sf31IsoIcMagCc = checkSf31IsoIcMagCcConstraints(value);
      serializeSf31IsoIcMagCc(sf31IsoIcMagCc);
   } 

     /**
	 * 	Update Sf31IsoIcMagCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoIcMagCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoIcMagCc,sf31IsoIcMagCc.length);
   	
   }
   
   public void setSf31IsoIcMagCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIcMagCc,sf31IsoIcMagCc.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoIcMagCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoIcMagCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIcMagCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoIcMagCc with another Field
	 *	@param value
	 */
   public void setSf31IsoIcMagCc(Field source) {
       replace(source,0,source.length(),beginSf31IsoIcMagCc,SF_31_ISO_IC_MAG_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoIcMagCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoIcMagCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoIcMagCc,SF_31_ISO_IC_MAG_CC_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoIcMagCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoIcMagCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoIcMagCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Tag87Present
	 *	@return sf31IsoDe48Tag87Present
	 */
   public char[] getSf31IsoDe48Tag87Present() throws CFException{
     if (isSf31IsoDe48Tag87PresentModified()) { 
        sf31IsoDe48Tag87Present = refreshSf31IsoDe48Tag87Present();
     }
   		return sf31IsoDe48Tag87Present;
   }

  
	/**
	*  set variable sf31IsoDe48Tag87Present
	*  Corresponding COBOL Variable is SF31-ISO-DE48-TAG87-PRESENT
	*  @param value
	**/
   public void setSf31IsoDe48Tag87Present(char[] value) {
      sf31IsoDe48Tag87Present = checkSf31IsoDe48Tag87PresentConstraints(value);
      serializeSf31IsoDe48Tag87Present(sf31IsoDe48Tag87Present);
   } 

     /**
	 * 	Update Sf31IsoDe48Tag87Present 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Tag87Present(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Tag87Present,sf31IsoDe48Tag87Present.length);
   	
   }
   
   public void setSf31IsoDe48Tag87Present(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag87Present,sf31IsoDe48Tag87Present.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag87Present 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag87Present(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag87Present+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Tag87Present with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Tag87Present(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Tag87Present,SF_31_ISO_DE_48_TAG_87_PRESENT_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Tag87Present 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Tag87Present(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag87Present,SF_31_ISO_DE_48_TAG_87_PRESENT_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag87Present 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag87Present(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag87Present+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Tag88Present
	 *	@return sf31IsoDe48Tag88Present
	 */
   public char[] getSf31IsoDe48Tag88Present() throws CFException{
     if (isSf31IsoDe48Tag88PresentModified()) { 
        sf31IsoDe48Tag88Present = refreshSf31IsoDe48Tag88Present();
     }
   		return sf31IsoDe48Tag88Present;
   }

  
	/**
	*  set variable sf31IsoDe48Tag88Present
	*  Corresponding COBOL Variable is SF31-ISO-DE48-TAG88-PRESENT
	*  @param value
	**/
   public void setSf31IsoDe48Tag88Present(char[] value) {
      sf31IsoDe48Tag88Present = checkSf31IsoDe48Tag88PresentConstraints(value);
      serializeSf31IsoDe48Tag88Present(sf31IsoDe48Tag88Present);
   } 

     /**
	 * 	Update Sf31IsoDe48Tag88Present 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Tag88Present(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Tag88Present,sf31IsoDe48Tag88Present.length);
   	
   }
   
   public void setSf31IsoDe48Tag88Present(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag88Present,sf31IsoDe48Tag88Present.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag88Present 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag88Present(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag88Present+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Tag88Present with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Tag88Present(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Tag88Present,SF_31_ISO_DE_48_TAG_88_PRESENT_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Tag88Present 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Tag88Present(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag88Present,SF_31_ISO_DE_48_TAG_88_PRESENT_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag88Present 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag88Present(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag88Present+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Tag89Value
	 *	@return sf31IsoDe48Tag89Value
	 */
   public char[] getSf31IsoDe48Tag89Value() throws CFException{
     if (isSf31IsoDe48Tag89ValueModified()) { 
        sf31IsoDe48Tag89Value = refreshSf31IsoDe48Tag89Value();
     }
   		return sf31IsoDe48Tag89Value;
   }

  
	/**
	*  set variable sf31IsoDe48Tag89Value
	*  Corresponding COBOL Variable is SF31-ISO-DE48-TAG89-VALUE
	*  @param value
	**/
   public void setSf31IsoDe48Tag89Value(char[] value) {
      sf31IsoDe48Tag89Value = checkSf31IsoDe48Tag89ValueConstraints(value);
      serializeSf31IsoDe48Tag89Value(sf31IsoDe48Tag89Value);
   } 

     /**
	 * 	Update Sf31IsoDe48Tag89Value 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Tag89Value(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Tag89Value,sf31IsoDe48Tag89Value.length);
   	
   }
   
   public void setSf31IsoDe48Tag89Value(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag89Value,sf31IsoDe48Tag89Value.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag89Value 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag89Value(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag89Value+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Tag89Value with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Tag89Value(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Tag89Value,SF_31_ISO_DE_48_TAG_89_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Tag89Value 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Tag89Value(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag89Value,SF_31_ISO_DE_48_TAG_89_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Tag89Value 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Tag89Value(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Tag89Value+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAddlAvsii
	 *	@return sf31IsoAddlAvsii
	 */   
	 public Sf31IsoAddlAvsii getSf31IsoAddlAvsii() {
   	return sf31IsoAddlAvsii;
   }
   /**
	* 	Update Sf31IsoAddlAvsii with the passed value
	*   Corresponding COBOL Variable is SF31-ISO-ADDL-AVSII
	*	@param value
	*/
   public void setSf31IsoAddlAvsii(char[] value) {
      sf31IsoAddlAvsii.setString(value); 
   }   
    
     /**
	 * 	Update Sf31IsoAddlAvsii 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAddlAvsii(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoAddlAvsii.begin,sf31IsoAddlAvsii.length());
   }
   
     /**
	 * 	Update Sf31IsoAddlAvsii 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAddlAvsii(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoAddlAvsii.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf31IsoAddlAvsii with another Field
	 *	@param value
	 */
   public void setSf31IsoAddlAvsii(Field source) {
   	replace(source,0,source.length(),sf31IsoAddlAvsii.begin,sf31IsoAddlAvsii.length());
   }  
   
     /**
	 * 	Update Sf31IsoAddlAvsii 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAddlAvsii(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoAddlAvsii.begin,sf31IsoAddlAvsii.length());
   }
   
     /**
	 * 	Update Sf31IsoAddlAvsii 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAddlAvsii(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoAddlAvsii.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf31IsoCrncyConvFields
	 *	@return sf31IsoCrncyConvFields
	 */   
	 public Sf31IsoCrncyConvFields getSf31IsoCrncyConvFields() {
   	return sf31IsoCrncyConvFields;
   }
   /**
	* 	Update Sf31IsoCrncyConvFields with the passed value
	*   Corresponding COBOL Variable is SF31-ISO-CRNCY-CONV-FIELDS
	*	@param value
	*/
   public void setSf31IsoCrncyConvFields(char[] value) {
      sf31IsoCrncyConvFields.setString(value); 
   }   
    
     /**
	 * 	Update Sf31IsoCrncyConvFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCrncyConvFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCrncyConvFields.begin,sf31IsoCrncyConvFields.length());
   }
   
     /**
	 * 	Update Sf31IsoCrncyConvFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCrncyConvFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCrncyConvFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf31IsoCrncyConvFields with another Field
	 *	@param value
	 */
   public void setSf31IsoCrncyConvFields(Field source) {
   	replace(source,0,source.length(),sf31IsoCrncyConvFields.begin,sf31IsoCrncyConvFields.length());
   }  
   
     /**
	 * 	Update Sf31IsoCrncyConvFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoCrncyConvFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCrncyConvFields.begin,sf31IsoCrncyConvFields.length());
   }
   
     /**
	 * 	Update Sf31IsoCrncyConvFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoCrncyConvFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf31IsoCrncyConvFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf31IsoMemberData
	 *	@return sf31IsoMemberData
	 */
   public char[] getSf31IsoMemberData() throws CFException{
     if (isSf31IsoMemberDataModified()) { 
        sf31IsoMemberData = refreshSf31IsoMemberData();
     }
   		return sf31IsoMemberData;
   }

  
	/**
	*  set variable sf31IsoMemberData
	*  Corresponding COBOL Variable is SF31-ISO-MEMBER-DATA
	*  @param value
	**/
   public void setSf31IsoMemberData(char[] value) {
      sf31IsoMemberData = checkSf31IsoMemberDataConstraints(value);
      serializeSf31IsoMemberData(sf31IsoMemberData);
   } 

     /**
	 * 	Update Sf31IsoMemberData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoMemberData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoMemberData,sf31IsoMemberData.length);
   	
   }
   
   public void setSf31IsoMemberData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMemberData,sf31IsoMemberData.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoMemberData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoMemberData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMemberData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoMemberData with another Field
	 *	@param value
	 */
   public void setSf31IsoMemberData(Field source) {
       replace(source,0,source.length(),beginSf31IsoMemberData,SF_31_ISO_MEMBER_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoMemberData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoMemberData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoMemberData,SF_31_ISO_MEMBER_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoMemberData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoMemberData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoMemberData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se24Sf1
	 *	@return sf31IsoDe48Se24Sf1
	 */
   public char[] getSf31IsoDe48Se24Sf1() throws CFException{
     if (isSf31IsoDe48Se24Sf1Modified()) { 
        sf31IsoDe48Se24Sf1 = refreshSf31IsoDe48Se24Sf1();
     }
   		return sf31IsoDe48Se24Sf1;
   }

  
	/**
	*  set variable sf31IsoDe48Se24Sf1
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE24-SF1
	*  @param value
	**/
   public void setSf31IsoDe48Se24Sf1(char[] value) {
      sf31IsoDe48Se24Sf1 = checkSf31IsoDe48Se24Sf1Constraints(value);
      serializeSf31IsoDe48Se24Sf1(sf31IsoDe48Se24Sf1);
   } 

     /**
	 * 	Update Sf31IsoDe48Se24Sf1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se24Sf1,sf31IsoDe48Se24Sf1.length);
   	
   }
   
   public void setSf31IsoDe48Se24Sf1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf1,sf31IsoDe48Se24Sf1.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se24Sf1 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf1(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se24Sf1,SF_31_ISO_DE_48_SE_24_SF_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf1,SF_31_ISO_DE_48_SE_24_SF_1_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se24Sf2
	 *	@return sf31IsoDe48Se24Sf2
	 */
   public char[] getSf31IsoDe48Se24Sf2() throws CFException{
     if (isSf31IsoDe48Se24Sf2Modified()) { 
        sf31IsoDe48Se24Sf2 = refreshSf31IsoDe48Se24Sf2();
     }
   		return sf31IsoDe48Se24Sf2;
   }

  
	/**
	*  set variable sf31IsoDe48Se24Sf2
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE24-SF2
	*  @param value
	**/
   public void setSf31IsoDe48Se24Sf2(char[] value) {
      sf31IsoDe48Se24Sf2 = checkSf31IsoDe48Se24Sf2Constraints(value);
      serializeSf31IsoDe48Se24Sf2(sf31IsoDe48Se24Sf2);
   } 

     /**
	 * 	Update Sf31IsoDe48Se24Sf2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se24Sf2,sf31IsoDe48Se24Sf2.length);
   	
   }
   
   public void setSf31IsoDe48Se24Sf2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf2,sf31IsoDe48Se24Sf2.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se24Sf2 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf2(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se24Sf2,SF_31_ISO_DE_48_SE_24_SF_2_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf2,SF_31_ISO_DE_48_SE_24_SF_2_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se24Sf3
	 *	@return sf31IsoDe48Se24Sf3
	 */
   public char[] getSf31IsoDe48Se24Sf3() throws CFException{
     if (isSf31IsoDe48Se24Sf3Modified()) { 
        sf31IsoDe48Se24Sf3 = refreshSf31IsoDe48Se24Sf3();
     }
   		return sf31IsoDe48Se24Sf3;
   }

  
	/**
	*  set variable sf31IsoDe48Se24Sf3
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE24-SF3
	*  @param value
	**/
   public void setSf31IsoDe48Se24Sf3(char[] value) {
      sf31IsoDe48Se24Sf3 = checkSf31IsoDe48Se24Sf3Constraints(value);
      serializeSf31IsoDe48Se24Sf3(sf31IsoDe48Se24Sf3);
   } 

     /**
	 * 	Update Sf31IsoDe48Se24Sf3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se24Sf3,sf31IsoDe48Se24Sf3.length);
   	
   }
   
   public void setSf31IsoDe48Se24Sf3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf3,sf31IsoDe48Se24Sf3.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se24Sf3 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf3(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se24Sf3,SF_31_ISO_DE_48_SE_24_SF_3_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf3,SF_31_ISO_DE_48_SE_24_SF_3_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se24Sf4
	 *	@return sf31IsoDe48Se24Sf4
	 */
   public char[] getSf31IsoDe48Se24Sf4() throws CFException{
     if (isSf31IsoDe48Se24Sf4Modified()) { 
        sf31IsoDe48Se24Sf4 = refreshSf31IsoDe48Se24Sf4();
     }
   		return sf31IsoDe48Se24Sf4;
   }

  
	/**
	*  set variable sf31IsoDe48Se24Sf4
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE24-SF4
	*  @param value
	**/
   public void setSf31IsoDe48Se24Sf4(char[] value) {
      sf31IsoDe48Se24Sf4 = checkSf31IsoDe48Se24Sf4Constraints(value);
      serializeSf31IsoDe48Se24Sf4(sf31IsoDe48Se24Sf4);
   } 

     /**
	 * 	Update Sf31IsoDe48Se24Sf4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se24Sf4,sf31IsoDe48Se24Sf4.length);
   	
   }
   
   public void setSf31IsoDe48Se24Sf4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf4,sf31IsoDe48Se24Sf4.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se24Sf4 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf4(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se24Sf4,SF_31_ISO_DE_48_SE_24_SF_4_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf4,SF_31_ISO_DE_48_SE_24_SF_4_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se24Sf4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se24Sf4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se24Sf4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se43Aav
	 *	@return sf31IsoDe48Se43Aav
	 */
   public char[] getSf31IsoDe48Se43Aav() throws CFException{
     if (isSf31IsoDe48Se43AavModified()) { 
        sf31IsoDe48Se43Aav = refreshSf31IsoDe48Se43Aav();
     }
   		return sf31IsoDe48Se43Aav;
   }

  
	/**
	*  set variable sf31IsoDe48Se43Aav
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE43-AAV
	*  @param value
	**/
   public void setSf31IsoDe48Se43Aav(char[] value) {
      sf31IsoDe48Se43Aav = checkSf31IsoDe48Se43AavConstraints(value);
      serializeSf31IsoDe48Se43Aav(sf31IsoDe48Se43Aav);
   } 

     /**
	 * 	Update Sf31IsoDe48Se43Aav 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se43Aav(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se43Aav,sf31IsoDe48Se43Aav.length);
   	
   }
   
   public void setSf31IsoDe48Se43Aav(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se43Aav,sf31IsoDe48Se43Aav.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se43Aav 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se43Aav(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se43Aav+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se43Aav with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se43Aav(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se43Aav,SF_31_ISO_DE_48_SE_43_AAV_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se43Aav 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se43Aav(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se43Aav,SF_31_ISO_DE_48_SE_43_AAV_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se43Aav 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se43Aav(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se43Aav+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se66Sf1
	 *	@return sf31IsoDe48Se66Sf1
	 */
   public char[] getSf31IsoDe48Se66Sf1() throws CFException{
     if (isSf31IsoDe48Se66Sf1Modified()) { 
        sf31IsoDe48Se66Sf1 = refreshSf31IsoDe48Se66Sf1();
     }
   		return sf31IsoDe48Se66Sf1;
   }

  
	/**
	*  set variable sf31IsoDe48Se66Sf1
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE66-SF1
	*  @param value
	**/
   public void setSf31IsoDe48Se66Sf1(char[] value) {
      sf31IsoDe48Se66Sf1 = checkSf31IsoDe48Se66Sf1Constraints(value);
      serializeSf31IsoDe48Se66Sf1(sf31IsoDe48Se66Sf1);
   } 

     /**
	 * 	Update Sf31IsoDe48Se66Sf1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se66Sf1,sf31IsoDe48Se66Sf1.length);
   	
   }
   
   public void setSf31IsoDe48Se66Sf1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf1,sf31IsoDe48Se66Sf1.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se66Sf1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se66Sf1 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf1(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se66Sf1,SF_31_ISO_DE_48_SE_66_SF_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se66Sf1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf1,SF_31_ISO_DE_48_SE_66_SF_1_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se66Sf1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se66Sf2
	 *	@return sf31IsoDe48Se66Sf2
	 */
   public char[] getSf31IsoDe48Se66Sf2() throws CFException{
     if (isSf31IsoDe48Se66Sf2Modified()) { 
        sf31IsoDe48Se66Sf2 = refreshSf31IsoDe48Se66Sf2();
     }
   		return sf31IsoDe48Se66Sf2;
   }

  
	/**
	*  set variable sf31IsoDe48Se66Sf2
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE66-SF2
	*  @param value
	**/
   public void setSf31IsoDe48Se66Sf2(char[] value) {
      sf31IsoDe48Se66Sf2 = checkSf31IsoDe48Se66Sf2Constraints(value);
      serializeSf31IsoDe48Se66Sf2(sf31IsoDe48Se66Sf2);
   } 

     /**
	 * 	Update Sf31IsoDe48Se66Sf2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se66Sf2,sf31IsoDe48Se66Sf2.length);
   	
   }
   
   public void setSf31IsoDe48Se66Sf2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf2,sf31IsoDe48Se66Sf2.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se66Sf2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se66Sf2 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf2(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se66Sf2,SF_31_ISO_DE_48_SE_66_SF_2_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se66Sf2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf2,SF_31_ISO_DE_48_SE_66_SF_2_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se66Sf2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se66Sf2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se66Sf2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoTimeLocalTrans
	 *	@return sf31IsoTimeLocalTrans
	 */
	public long getSf31IsoTimeLocalTrans() throws CFException {
       if (isSf31IsoTimeLocalTransModified()) { 
           sf31IsoTimeLocalTrans = refreshSf31IsoTimeLocalTrans();
        }
   		return sf31IsoTimeLocalTrans;
	}
	

	
	   
	/**
	 * 	Update Sf31IsoTimeLocalTrans with the passed value
	 *  Corresponding COBOL Variable is SF31-ISO-TIME-LOCAL-TRANS
	 *	@param number
	 */
	public void setSf31IsoTimeLocalTrans(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sf31IsoTimeLocalTrans = checkSf31IsoTimeLocalTransMaxLimit(number); 
		serializeSf31IsoTimeLocalTrans(sf31IsoTimeLocalTrans);
	}
	

	/**
	 * 	Update Sf31IsoTimeLocalTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf31IsoTimeLocalTrans(char[] value) throws CFException {
		 sf31IsoTimeLocalTrans = serializeSf31IsoTimeLocalTrans(value);
	}
	/**
	 * 	Update Sf31IsoTimeLocalTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf31IsoTimeLocalTransString(char[] value) throws CFException {
		 setSf31IsoTimeLocalTrans(value);
	}
	/**
	 *	Returns the value of sf31IsoDateLocalTrans
	 *	@return sf31IsoDateLocalTrans
	 */
	public int getSf31IsoDateLocalTrans() throws CFException {
       if (isSf31IsoDateLocalTransModified()) { 
           sf31IsoDateLocalTrans = refreshSf31IsoDateLocalTrans();
        }
   		return sf31IsoDateLocalTrans;
	}
	

	
	   
	/**
	 * 	Update Sf31IsoDateLocalTrans with the passed value
	 *  Corresponding COBOL Variable is SF31-ISO-DATE-LOCAL-TRANS
	 *	@param number
	 */
	public void setSf31IsoDateLocalTrans(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sf31IsoDateLocalTrans = checkSf31IsoDateLocalTransMaxLimit(number); 
		serializeSf31IsoDateLocalTrans(sf31IsoDateLocalTrans);
	}
	

	public void setSf31IsoDateLocalTrans(long number) {
	    number = checkSf31IsoDateLocalTransMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf31IsoDateLocalTrans((int)number);
	}
	
	/**
	 * 	Update Sf31IsoDateLocalTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf31IsoDateLocalTrans(char[] value) throws CFException {
		 sf31IsoDateLocalTrans = serializeSf31IsoDateLocalTrans(value);
	}
	/**
	 * 	Update Sf31IsoDateLocalTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf31IsoDateLocalTransString(char[] value) throws CFException {
		 setSf31IsoDateLocalTrans(value);
	}
	/**
	 *	Returns the value of sf31IsoDe48Se42Len3
	 *	@return sf31IsoDe48Se42Len3
	 */
   public char[] getSf31IsoDe48Se42Len3() throws CFException{
     if (isSf31IsoDe48Se42Len3Modified()) { 
        sf31IsoDe48Se42Len3 = refreshSf31IsoDe48Se42Len3();
     }
   		return sf31IsoDe48Se42Len3;
   }

  
	/**
	*  set variable sf31IsoDe48Se42Len3
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE42-LEN3
	*  @param value
	**/
   public void setSf31IsoDe48Se42Len3(char[] value) {
      sf31IsoDe48Se42Len3 = checkSf31IsoDe48Se42Len3Constraints(value);
      serializeSf31IsoDe48Se42Len3(sf31IsoDe48Se42Len3);
   } 

     /**
	 * 	Update Sf31IsoDe48Se42Len3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Len3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se42Len3,sf31IsoDe48Se42Len3.length);
   	
   }
   
   public void setSf31IsoDe48Se42Len3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Len3,sf31IsoDe48Se42Len3.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se42Len3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Len3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Len3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se42Len3 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Len3(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se42Len3,SF_31_ISO_DE_48_SE_42_LEN_3_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se42Len3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Len3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Len3,SF_31_ISO_DE_48_SE_42_LEN_3_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se42Len3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Len3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Len3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se42Sf2Sf3
	 *	@return sf31IsoDe48Se42Sf2Sf3
	 */
   public char[] getSf31IsoDe48Se42Sf2Sf3() throws CFException{
     if (isSf31IsoDe48Se42Sf2Sf3Modified()) { 
        sf31IsoDe48Se42Sf2Sf3 = refreshSf31IsoDe48Se42Sf2Sf3();
     }
   		return sf31IsoDe48Se42Sf2Sf3;
   }

  
	/**
	*  set variable sf31IsoDe48Se42Sf2Sf3
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE42-SF2-SF3
	*  @param value
	**/
   public void setSf31IsoDe48Se42Sf2Sf3(char[] value) {
      sf31IsoDe48Se42Sf2Sf3 = checkSf31IsoDe48Se42Sf2Sf3Constraints(value);
      serializeSf31IsoDe48Se42Sf2Sf3(sf31IsoDe48Se42Sf2Sf3);
   } 

     /**
	 * 	Update Sf31IsoDe48Se42Sf2Sf3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Sf2Sf3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se42Sf2Sf3,sf31IsoDe48Se42Sf2Sf3.length);
   	
   }
   
   public void setSf31IsoDe48Se42Sf2Sf3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Sf2Sf3,sf31IsoDe48Se42Sf2Sf3.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se42Sf2Sf3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Sf2Sf3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Sf2Sf3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se42Sf2Sf3 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Sf2Sf3(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se42Sf2Sf3,SF_31_ISO_DE_48_SE_42_SF_2_SF_3_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se42Sf2Sf3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Sf2Sf3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Sf2Sf3,SF_31_ISO_DE_48_SE_42_SF_2_SF_3_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se42Sf2Sf3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se42Sf2Sf3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se42Sf2Sf3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se33Sf1
	 *	@return sf31IsoDe48Se33Sf1
	 */
   public char[] getSf31IsoDe48Se33Sf1() throws CFException{
     if (isSf31IsoDe48Se33Sf1Modified()) { 
        sf31IsoDe48Se33Sf1 = refreshSf31IsoDe48Se33Sf1();
     }
   		return sf31IsoDe48Se33Sf1;
   }

  
	/**
	*  set variable sf31IsoDe48Se33Sf1
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE33-SF1
	*  @param value
	**/
   public void setSf31IsoDe48Se33Sf1(char[] value) {
      sf31IsoDe48Se33Sf1 = checkSf31IsoDe48Se33Sf1Constraints(value);
      serializeSf31IsoDe48Se33Sf1(sf31IsoDe48Se33Sf1);
   } 

     /**
	 * 	Update Sf31IsoDe48Se33Sf1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se33Sf1,sf31IsoDe48Se33Sf1.length);
   	
   }
   
   public void setSf31IsoDe48Se33Sf1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf1,sf31IsoDe48Se33Sf1.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se33Sf1 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf1(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se33Sf1,SF_31_ISO_DE_48_SE_33_SF_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf1,SF_31_ISO_DE_48_SE_33_SF_1_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se33Sf2
	 *	@return sf31IsoDe48Se33Sf2
	 */
   public char[] getSf31IsoDe48Se33Sf2() throws CFException{
     if (isSf31IsoDe48Se33Sf2Modified()) { 
        sf31IsoDe48Se33Sf2 = refreshSf31IsoDe48Se33Sf2();
     }
   		return sf31IsoDe48Se33Sf2;
   }

  
	/**
	*  set variable sf31IsoDe48Se33Sf2
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE33-SF2
	*  @param value
	**/
   public void setSf31IsoDe48Se33Sf2(char[] value) {
      sf31IsoDe48Se33Sf2 = checkSf31IsoDe48Se33Sf2Constraints(value);
      serializeSf31IsoDe48Se33Sf2(sf31IsoDe48Se33Sf2);
   } 

     /**
	 * 	Update Sf31IsoDe48Se33Sf2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se33Sf2,sf31IsoDe48Se33Sf2.length);
   	
   }
   
   public void setSf31IsoDe48Se33Sf2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf2,sf31IsoDe48Se33Sf2.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se33Sf2 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf2(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se33Sf2,SF_31_ISO_DE_48_SE_33_SF_2_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf2,SF_31_ISO_DE_48_SE_33_SF_2_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se33Sf5
	 *	@return sf31IsoDe48Se33Sf5
	 */
   public char[] getSf31IsoDe48Se33Sf5() throws CFException{
     if (isSf31IsoDe48Se33Sf5Modified()) { 
        sf31IsoDe48Se33Sf5 = refreshSf31IsoDe48Se33Sf5();
     }
   		return sf31IsoDe48Se33Sf5;
   }

  
	/**
	*  set variable sf31IsoDe48Se33Sf5
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE33-SF5
	*  @param value
	**/
   public void setSf31IsoDe48Se33Sf5(char[] value) {
      sf31IsoDe48Se33Sf5 = checkSf31IsoDe48Se33Sf5Constraints(value);
      serializeSf31IsoDe48Se33Sf5(sf31IsoDe48Se33Sf5);
   } 

     /**
	 * 	Update Sf31IsoDe48Se33Sf5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se33Sf5,sf31IsoDe48Se33Sf5.length);
   	
   }
   
   public void setSf31IsoDe48Se33Sf5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf5,sf31IsoDe48Se33Sf5.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se33Sf5 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf5(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se33Sf5,SF_31_ISO_DE_48_SE_33_SF_5_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf5,SF_31_ISO_DE_48_SE_33_SF_5_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se33Sf6
	 *	@return sf31IsoDe48Se33Sf6
	 */
   public char[] getSf31IsoDe48Se33Sf6() throws CFException{
     if (isSf31IsoDe48Se33Sf6Modified()) { 
        sf31IsoDe48Se33Sf6 = refreshSf31IsoDe48Se33Sf6();
     }
   		return sf31IsoDe48Se33Sf6;
   }

  
	/**
	*  set variable sf31IsoDe48Se33Sf6
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE33-SF6
	*  @param value
	**/
   public void setSf31IsoDe48Se33Sf6(char[] value) {
      sf31IsoDe48Se33Sf6 = checkSf31IsoDe48Se33Sf6Constraints(value);
      serializeSf31IsoDe48Se33Sf6(sf31IsoDe48Se33Sf6);
   } 

     /**
	 * 	Update Sf31IsoDe48Se33Sf6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se33Sf6,sf31IsoDe48Se33Sf6.length);
   	
   }
   
   public void setSf31IsoDe48Se33Sf6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf6,sf31IsoDe48Se33Sf6.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se33Sf6 with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf6(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se33Sf6,SF_31_ISO_DE_48_SE_33_SF_6_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf6,SF_31_ISO_DE_48_SE_33_SF_6_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se33Sf6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se33Sf6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se33Sf6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoDe48Se52Tic
	 *	@return sf31IsoDe48Se52Tic
	 */
   public char[] getSf31IsoDe48Se52Tic() throws CFException{
     if (isSf31IsoDe48Se52TicModified()) { 
        sf31IsoDe48Se52Tic = refreshSf31IsoDe48Se52Tic();
     }
   		return sf31IsoDe48Se52Tic;
   }

  
	/**
	*  set variable sf31IsoDe48Se52Tic
	*  Corresponding COBOL Variable is SF31-ISO-DE48-SE52-TIC
	*  @param value
	**/
   public void setSf31IsoDe48Se52Tic(char[] value) {
      sf31IsoDe48Se52Tic = checkSf31IsoDe48Se52TicConstraints(value);
      serializeSf31IsoDe48Se52Tic(sf31IsoDe48Se52Tic);
   } 

     /**
	 * 	Update Sf31IsoDe48Se52Tic 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoDe48Se52Tic(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoDe48Se52Tic,sf31IsoDe48Se52Tic.length);
   	
   }
   
   public void setSf31IsoDe48Se52Tic(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se52Tic,sf31IsoDe48Se52Tic.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se52Tic 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se52Tic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se52Tic+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoDe48Se52Tic with another Field
	 *	@param value
	 */
   public void setSf31IsoDe48Se52Tic(Field source) {
       replace(source,0,source.length(),beginSf31IsoDe48Se52Tic,SF_31_ISO_DE_48_SE_52_TIC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoDe48Se52Tic 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoDe48Se52Tic(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se52Tic,SF_31_ISO_DE_48_SE_52_TIC_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoDe48Se52Tic 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoDe48Se52Tic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoDe48Se52Tic+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31FutureFiller
	 *	@return sf31FutureFiller
	 */
   public char[] getSf31FutureFiller() throws CFException{
     if (isSf31FutureFillerModified()) { 
        sf31FutureFiller = refreshSf31FutureFiller();
     }
   		return sf31FutureFiller;
   }

  
	/**
	*  set variable sf31FutureFiller
	*  Corresponding COBOL Variable is SF31-FUTURE-FILLER
	*  @param value
	**/
   public void setSf31FutureFiller(char[] value) {
      sf31FutureFiller = checkSf31FutureFillerConstraints(value);
      serializeSf31FutureFiller(sf31FutureFiller);
   } 

     /**
	 * 	Update Sf31FutureFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31FutureFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31FutureFiller,sf31FutureFiller.length);
   	
   }
   
   public void setSf31FutureFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31FutureFiller,sf31FutureFiller.length);
   	
   }
   
     /**
	 * 	Update Sf31FutureFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31FutureFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31FutureFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31FutureFiller with another Field
	 *	@param value
	 */
   public void setSf31FutureFiller(Field source) {
       replace(source,0,source.length(),beginSf31FutureFiller,SF_31_FUTURE_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31FutureFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31FutureFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31FutureFiller,SF_31_FUTURE_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Sf31FutureFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31FutureFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31FutureFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf31IsoExtractRecFieldLength() {
			return SF_31_ISO_EXTRACT_REC_LENGTH;
		}

}
  
