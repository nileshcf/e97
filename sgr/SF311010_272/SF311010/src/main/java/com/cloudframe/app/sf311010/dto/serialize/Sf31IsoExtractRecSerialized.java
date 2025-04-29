package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoExtractRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Sf31IsoExtractRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoExtractRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_EXTRACT_REC_LENGTH = 900;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf31IsoCardholderNbr;
            protected  int beginSf31IsoTransactionAmt;
            protected  int beginSf31IsoAcquirerIca;
            protected  int beginSf31IsoForwardInstIdOnly;
            protected  int beginSf31IsoAuthNumber;
            protected  int beginSf31IsoAuthResponse;
            protected  int beginSf31IsoAuthAddlData;
            protected  int beginSf31IsoCardholderExpdt;
            protected  int beginSf31IsoPosDeviceType;
            protected  int beginSf31IsoTrackTwoData;
            protected  int beginSf31IsoTrackOneData;
            protected  int beginSf31IsoTransactionType;
            protected  int beginSf31IsoAvsRequestTag;
            protected  int beginSf31IsoAvsRequestLgth;
            protected  int beginSf31IsoAvsRequestCode;
            protected  int beginSf31IsoAvsResponseTag;
            protected  int beginSf31IsoAvsResponseLgth;
            protected  int beginSf31IsoAvsResponseCode;
            protected  int beginSf31IsoPosData;
            protected  int beginSf31IsoFinNetworkCode;
            protected  int beginSf31IsoProcessingCode;
            protected  int beginSf31IsoDateTimeXmit;
            protected  int beginSf31IsoMerchantType;
            protected  int beginSf31IsoCountryCode;
            protected  int beginSf31IsoPosPinCapture;
            protected  int beginSf31IsoRetrievalRefno;
            protected  int beginSf31IsoIdTerminal;
            protected  int beginSf31IsoCardAcceptor;
            protected  int beginSf31IsoAddtlData;
            protected  int beginSf31IsoMerchantId;
            protected  int beginSf31IsoIssUpIca;
            protected  int beginSf31IsoStateCode;
            protected  int beginSf31IsoBlIcSeqNo;
            protected  int beginSf31IsoIcMagCc;
            protected  int beginSf31IsoDe48Tag87Present;
            protected  int beginSf31IsoDe48Tag88Present;
            protected  int beginSf31IsoDe48Tag89Value;
            protected  int beginSf31IsoMemberData;
            protected  int beginSf31IsoDe48Se24Sf1;
            protected  int beginSf31IsoDe48Se24Sf2;
            protected  int beginSf31IsoDe48Se24Sf3;
            protected  int beginSf31IsoDe48Se24Sf4;
            protected  int beginSf31IsoDe48Se43Aav;
            protected  int beginSf31IsoDe48Se66Sf1;
            protected  int beginSf31IsoDe48Se66Sf2;
            protected  int beginSf31IsoTimeLocalTrans;
            protected  int beginSf31IsoDateLocalTrans;
            protected  int beginSf31IsoDe48Se42Len3;
            protected  int beginSf31IsoDe48Se42Sf2Sf3;
            protected  int beginSf31IsoDe48Se33Sf1;
            protected  int beginSf31IsoDe48Se33Sf2;
            protected  int beginSf31IsoDe48Se33Sf5;
            protected  int beginSf31IsoDe48Se33Sf6;
            protected  int beginSf31IsoDe48Se52Tic;
            protected  int beginSf31FutureFiller;
	
	/**
	* Constructor for Sf31IsoExtractRecSerialized
	**/
    public Sf31IsoExtractRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sf31IsoExtractRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_EXTRACT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf31IsoCardholderNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginSf31IsoTransactionAmt = getStartOffset() + 19;	// set offset for serialization
  
             beginSf31IsoAcquirerIca = getStartOffset() + 31;	// set offset for serialization
  
             beginSf31IsoForwardInstIdOnly = getStartOffset() + 37;	// set offset for serialization
  
             beginSf31IsoAuthNumber = getStartOffset() + 43;	// set offset for serialization
  
             beginSf31IsoAuthResponse = getStartOffset() + 49;	// set offset for serialization
  
             beginSf31IsoAuthAddlData = getStartOffset() + 51;	// set offset for serialization
  
             beginSf31IsoCardholderExpdt = getStartOffset() + 76;	// set offset for serialization
  
             beginSf31IsoPosDeviceType = getStartOffset() + 80;	// set offset for serialization
  
             beginSf31IsoTrackTwoData = getStartOffset() + 83;	// set offset for serialization
  
             beginSf31IsoTrackOneData = getStartOffset() + 120;	// set offset for serialization
  
             beginSf31IsoTransactionType = getStartOffset() + 196;	// set offset for serialization
  
             beginSf31IsoAvsRequestTag = getStartOffset() + 197;	// set offset for serialization
  
             beginSf31IsoAvsRequestLgth = getStartOffset() + 199;	// set offset for serialization
  
             beginSf31IsoAvsRequestCode = getStartOffset() + 201;	// set offset for serialization
  
             beginSf31IsoAvsResponseTag = getStartOffset() + 203;	// set offset for serialization
  
             beginSf31IsoAvsResponseLgth = getStartOffset() + 205;	// set offset for serialization
  
             beginSf31IsoAvsResponseCode = getStartOffset() + 207;	// set offset for serialization
  
             beginSf31IsoPosData = getStartOffset() + 208;	// set offset for serialization
  
             beginSf31IsoFinNetworkCode = getStartOffset() + 234;	// set offset for serialization
  
             beginSf31IsoProcessingCode = getStartOffset() + 237;	// set offset for serialization
  
             beginSf31IsoDateTimeXmit = getStartOffset() + 243;	// set offset for serialization
  
             beginSf31IsoMerchantType = getStartOffset() + 253;	// set offset for serialization
  
             beginSf31IsoCountryCode = getStartOffset() + 257;	// set offset for serialization
  
             beginSf31IsoPosPinCapture = getStartOffset() + 260;	// set offset for serialization
  
             beginSf31IsoRetrievalRefno = getStartOffset() + 262;	// set offset for serialization
  
             beginSf31IsoIdTerminal = getStartOffset() + 274;	// set offset for serialization
  
             beginSf31IsoCardAcceptor = getStartOffset() + 282;	// set offset for serialization
  
             beginSf31IsoAddtlData = getStartOffset() + 297;	// set offset for serialization
  
  
             beginSf31IsoMerchantId = getStartOffset() + 309;	// set offset for serialization
  
  
             beginSf31IsoIssUpIca = getStartOffset() + 329;	// set offset for serialization
  
             beginSf31IsoStateCode = getStartOffset() + 335;	// set offset for serialization
  
             beginSf31IsoBlIcSeqNo = getStartOffset() + 337;	// set offset for serialization
  
             beginSf31IsoIcMagCc = getStartOffset() + 345;	// set offset for serialization
  
             beginSf31IsoDe48Tag87Present = getStartOffset() + 346;	// set offset for serialization
  
             beginSf31IsoDe48Tag88Present = getStartOffset() + 347;	// set offset for serialization
  
             beginSf31IsoDe48Tag89Value = getStartOffset() + 348;	// set offset for serialization
  
  
  
             beginSf31IsoMemberData = getStartOffset() + 622;	// set offset for serialization
  
             beginSf31IsoDe48Se24Sf1 = getStartOffset() + 721;	// set offset for serialization
  
             beginSf31IsoDe48Se24Sf2 = getStartOffset() + 726;	// set offset for serialization
  
             beginSf31IsoDe48Se24Sf3 = getStartOffset() + 729;	// set offset for serialization
  
             beginSf31IsoDe48Se24Sf4 = getStartOffset() + 732;	// set offset for serialization
  
             beginSf31IsoDe48Se43Aav = getStartOffset() + 735;	// set offset for serialization
  
             beginSf31IsoDe48Se66Sf1 = getStartOffset() + 767;	// set offset for serialization
  
             beginSf31IsoDe48Se66Sf2 = getStartOffset() + 768;	// set offset for serialization
  
  
             beginSf31IsoTimeLocalTrans = getStartOffset() + 821;	// set offset for serialization
  
             beginSf31IsoDateLocalTrans = getStartOffset() + 827;	// set offset for serialization
  
             beginSf31IsoDe48Se42Len3 = getStartOffset() + 831;	// set offset for serialization
  
             beginSf31IsoDe48Se42Sf2Sf3 = getStartOffset() + 834;	// set offset for serialization
  
             beginSf31IsoDe48Se33Sf1 = getStartOffset() + 838;	// set offset for serialization
  
             beginSf31IsoDe48Se33Sf2 = getStartOffset() + 839;	// set offset for serialization
  
             beginSf31IsoDe48Se33Sf5 = getStartOffset() + 858;	// set offset for serialization
  
             beginSf31IsoDe48Se33Sf6 = getStartOffset() + 860;	// set offset for serialization
  
             beginSf31IsoDe48Se52Tic = getStartOffset() + 871;	// set offset for serialization
  
             beginSf31FutureFiller = getStartOffset() + 873;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf31IsoCardholderNbrCounter = -1;
     public boolean isSf31IsoCardholderNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoCardholderNbrCounter != sharedCounter;
         localSf31IsoCardholderNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_CARDHOLDER_NBR_LEN = 19;
	/**
	 * 	serialize this Sf31IsoCardholderNbr
	 */
   protected void serializeSf31IsoCardholderNbr(char[] sf31IsoCardholderNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoCardholderNbr,0,getStringValue(),beginSf31IsoCardholderNbr,SF_31_ISO_CARDHOLDER_NBR_LEN);
       localSf31IsoCardholderNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoCardholderNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshSf31IsoCardholderNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoCardholderNbr() {	 
   		return (substring(getStringValue(),beginSf31IsoCardholderNbr,beginSf31IsoCardholderNbr + SF_31_ISO_CARDHOLDER_NBR_LEN));
   	}
     int localSf31IsoTransactionAmtCounter = -1;
     
     public boolean isSf31IsoTransactionAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoTransactionAmtCounter != sharedCounter;
         localSf31IsoTransactionAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sf31IsoTransactionAmt
	 *	@return sf31IsoTransactionAmt
	 */
	public char[]  getSf31IsoTransactionAmtString() {
	    return getCharArray(beginSf31IsoTransactionAmt,SF_31_ISO_TRANSACTION_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf31IsoTransactionAmtIsNumeric() {
		    return isNumeric(beginSf31IsoTransactionAmt
	                    ,beginSf31IsoTransactionAmt + SF_31_ISO_TRANSACTION_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SF_31_ISO_TRANSACTION_AMT_LEN = 12;
  protected  static final int SF_31_ISO_TRANSACTION_AMT_SCALE = 2;

   protected BigDecimal checkSf31IsoTransactionAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSf31IsoTransactionAmt
	 */
	protected void serializeSf31IsoTransactionAmt(BigDecimal sf31IsoTransactionAmt) {
	       putNumber(beginSf31IsoTransactionAmt,sf31IsoTransactionAmt,SF_31_ISO_TRANSACTION_AMT_LEN,SF_31_ISO_TRANSACTION_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf31IsoTransactionAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSf31IsoTransactionAmt
	 */
   	protected  BigDecimal serializeSf31IsoTransactionAmt(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSf31IsoTransactionAmt
		       ,12
		      );		 localSf31IsoTransactionAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SF_31_ISO_TRANSACTION_AMT_LEN,SF_31_ISO_TRANSACTION_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sf31IsoTransactionAmt", beginSf31IsoTransactionAmt,SF_31_ISO_TRANSACTION_AMT_LEN);
    	}
    }
    /**
	 *	refreshSf31IsoTransactionAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSf31IsoTransactionAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSf31IsoTransactionAmt
			            ,SF_31_ISO_TRANSACTION_AMT_LEN
			            ,SF_31_ISO_TRANSACTION_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sf31IsoTransactionAmt", beginSf31IsoTransactionAmt,SF_31_ISO_TRANSACTION_AMT_LEN);
    }
   	}
     int localSf31IsoAcquirerIcaCounter = -1;
     public boolean isSf31IsoAcquirerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAcquirerIcaCounter != sharedCounter;
         localSf31IsoAcquirerIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_ACQUIRER_ICA_LEN = 6;
	/**
	 * 	serialize this Sf31IsoAcquirerIca
	 */
   protected void serializeSf31IsoAcquirerIca(char[] sf31IsoAcquirerIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAcquirerIca,0,getStringValue(),beginSf31IsoAcquirerIca,SF_31_ISO_ACQUIRER_ICA_LEN);
       localSf31IsoAcquirerIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAcquirerIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf31IsoAcquirerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAcquirerIca() {	 
   		return (substring(getStringValue(),beginSf31IsoAcquirerIca,beginSf31IsoAcquirerIca + SF_31_ISO_ACQUIRER_ICA_LEN));
   	}
     int localSf31IsoForwardInstIdOnlyCounter = -1;
     public boolean isSf31IsoForwardInstIdOnlyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoForwardInstIdOnlyCounter != sharedCounter;
         localSf31IsoForwardInstIdOnlyCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_FORWARD_INST_ID_ONLY_LEN = 6;
	/**
	 * 	serialize this Sf31IsoForwardInstIdOnly
	 */
   protected void serializeSf31IsoForwardInstIdOnly(char[] sf31IsoForwardInstIdOnly) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoForwardInstIdOnly,0,getStringValue(),beginSf31IsoForwardInstIdOnly,SF_31_ISO_FORWARD_INST_ID_ONLY_LEN);
       localSf31IsoForwardInstIdOnlyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoForwardInstIdOnlyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf31IsoForwardInstIdOnly is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoForwardInstIdOnly() {	 
   		return (substring(getStringValue(),beginSf31IsoForwardInstIdOnly,beginSf31IsoForwardInstIdOnly + SF_31_ISO_FORWARD_INST_ID_ONLY_LEN));
   	}
     int localSf31IsoAuthNumberCounter = -1;
     public boolean isSf31IsoAuthNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAuthNumberCounter != sharedCounter;
         localSf31IsoAuthNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AUTH_NUMBER_LEN = 6;
	/**
	 * 	serialize this Sf31IsoAuthNumber
	 */
   protected void serializeSf31IsoAuthNumber(char[] sf31IsoAuthNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAuthNumber,0,getStringValue(),beginSf31IsoAuthNumber,SF_31_ISO_AUTH_NUMBER_LEN);
       localSf31IsoAuthNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAuthNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf31IsoAuthNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAuthNumber() {	 
   		return (substring(getStringValue(),beginSf31IsoAuthNumber,beginSf31IsoAuthNumber + SF_31_ISO_AUTH_NUMBER_LEN));
   	}
     int localSf31IsoAuthResponseCounter = -1;
     public boolean isSf31IsoAuthResponseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAuthResponseCounter != sharedCounter;
         localSf31IsoAuthResponseCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AUTH_RESPONSE_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAuthResponse
	 */
   protected void serializeSf31IsoAuthResponse(char[] sf31IsoAuthResponse) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAuthResponse,0,getStringValue(),beginSf31IsoAuthResponse,SF_31_ISO_AUTH_RESPONSE_LEN);
       localSf31IsoAuthResponseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAuthResponseConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAuthResponse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAuthResponse() {	 
   		return (substring(getStringValue(),beginSf31IsoAuthResponse,beginSf31IsoAuthResponse + SF_31_ISO_AUTH_RESPONSE_LEN));
   	}
     int localSf31IsoAuthAddlDataCounter = -1;
     public boolean isSf31IsoAuthAddlDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAuthAddlDataCounter != sharedCounter;
         localSf31IsoAuthAddlDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AUTH_ADDL_DATA_LEN = 25;
	/**
	 * 	serialize this Sf31IsoAuthAddlData
	 */
   protected void serializeSf31IsoAuthAddlData(char[] sf31IsoAuthAddlData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAuthAddlData,0,getStringValue(),beginSf31IsoAuthAddlData,SF_31_ISO_AUTH_ADDL_DATA_LEN);
       localSf31IsoAuthAddlDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAuthAddlDataConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshSf31IsoAuthAddlData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAuthAddlData() {	 
   		return (substring(getStringValue(),beginSf31IsoAuthAddlData,beginSf31IsoAuthAddlData + SF_31_ISO_AUTH_ADDL_DATA_LEN));
   	}
     int localSf31IsoCardholderExpdtCounter = -1;
     public boolean isSf31IsoCardholderExpdtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoCardholderExpdtCounter != sharedCounter;
         localSf31IsoCardholderExpdtCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_CARDHOLDER_EXPDT_LEN = 4;
	/**
	 * 	serialize this Sf31IsoCardholderExpdt
	 */
   protected void serializeSf31IsoCardholderExpdt(char[] sf31IsoCardholderExpdt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoCardholderExpdt,0,getStringValue(),beginSf31IsoCardholderExpdt,SF_31_ISO_CARDHOLDER_EXPDT_LEN);
       localSf31IsoCardholderExpdtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoCardholderExpdtConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf31IsoCardholderExpdt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoCardholderExpdt() {	 
   		return (substring(getStringValue(),beginSf31IsoCardholderExpdt,beginSf31IsoCardholderExpdt + SF_31_ISO_CARDHOLDER_EXPDT_LEN));
   	}
     int localSf31IsoPosDeviceTypeCounter = -1;
     public boolean isSf31IsoPosDeviceTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoPosDeviceTypeCounter != sharedCounter;
         localSf31IsoPosDeviceTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_POS_DEVICE_TYPE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoPosDeviceType
	 */
   protected void serializeSf31IsoPosDeviceType(char[] sf31IsoPosDeviceType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoPosDeviceType,0,getStringValue(),beginSf31IsoPosDeviceType,SF_31_ISO_POS_DEVICE_TYPE_LEN);
       localSf31IsoPosDeviceTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoPosDeviceTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoPosDeviceType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoPosDeviceType() {	 
   		return (substring(getStringValue(),beginSf31IsoPosDeviceType,beginSf31IsoPosDeviceType + SF_31_ISO_POS_DEVICE_TYPE_LEN));
   	}
     int localSf31IsoTrackTwoDataCounter = -1;
     public boolean isSf31IsoTrackTwoDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoTrackTwoDataCounter != sharedCounter;
         localSf31IsoTrackTwoDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_TRACK_TWO_DATA_LEN = 37;
	/**
	 * 	serialize this Sf31IsoTrackTwoData
	 */
   protected void serializeSf31IsoTrackTwoData(char[] sf31IsoTrackTwoData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoTrackTwoData,0,getStringValue(),beginSf31IsoTrackTwoData,SF_31_ISO_TRACK_TWO_DATA_LEN);
       localSf31IsoTrackTwoDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoTrackTwoDataConstraints(char[] value) {
   			return super.checkConstraints(value , 37 ,false, false);
   }
    /**
	 *	refreshSf31IsoTrackTwoData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoTrackTwoData() {	 
   		return (substring(getStringValue(),beginSf31IsoTrackTwoData,beginSf31IsoTrackTwoData + SF_31_ISO_TRACK_TWO_DATA_LEN));
   	}
     int localSf31IsoTrackOneDataCounter = -1;
     public boolean isSf31IsoTrackOneDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoTrackOneDataCounter != sharedCounter;
         localSf31IsoTrackOneDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_TRACK_ONE_DATA_LEN = 76;
	/**
	 * 	serialize this Sf31IsoTrackOneData
	 */
   protected void serializeSf31IsoTrackOneData(char[] sf31IsoTrackOneData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoTrackOneData,0,getStringValue(),beginSf31IsoTrackOneData,SF_31_ISO_TRACK_ONE_DATA_LEN);
       localSf31IsoTrackOneDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoTrackOneDataConstraints(char[] value) {
   			return super.checkConstraints(value , 76 ,false, false);
   }
    /**
	 *	refreshSf31IsoTrackOneData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoTrackOneData() {	 
   		return (substring(getStringValue(),beginSf31IsoTrackOneData,beginSf31IsoTrackOneData + SF_31_ISO_TRACK_ONE_DATA_LEN));
   	}
     int localSf31IsoTransactionTypeCounter = -1;
     public boolean isSf31IsoTransactionTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoTransactionTypeCounter != sharedCounter;
         localSf31IsoTransactionTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_TRANSACTION_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf31IsoTransactionType
	 */
   protected void serializeSf31IsoTransactionType(char[] sf31IsoTransactionType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoTransactionType,0,getStringValue(),beginSf31IsoTransactionType,SF_31_ISO_TRANSACTION_TYPE_LEN);
       localSf31IsoTransactionTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoTransactionTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoTransactionType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoTransactionType() {	 
   		return (substring(getStringValue(),beginSf31IsoTransactionType,beginSf31IsoTransactionType + SF_31_ISO_TRANSACTION_TYPE_LEN));
   	}
     int localSf31IsoAvsRequestTagCounter = -1;
     public boolean isSf31IsoAvsRequestTagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvsRequestTagCounter != sharedCounter;
         localSf31IsoAvsRequestTagCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_REQUEST_TAG_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvsRequestTag
	 */
   protected void serializeSf31IsoAvsRequestTag(char[] sf31IsoAvsRequestTag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvsRequestTag,0,getStringValue(),beginSf31IsoAvsRequestTag,SF_31_ISO_AVS_REQUEST_TAG_LEN);
       localSf31IsoAvsRequestTagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvsRequestTagConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvsRequestTag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvsRequestTag() {	 
   		return (substring(getStringValue(),beginSf31IsoAvsRequestTag,beginSf31IsoAvsRequestTag + SF_31_ISO_AVS_REQUEST_TAG_LEN));
   	}
     int localSf31IsoAvsRequestLgthCounter = -1;
     public boolean isSf31IsoAvsRequestLgthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvsRequestLgthCounter != sharedCounter;
         localSf31IsoAvsRequestLgthCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_REQUEST_LGTH_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvsRequestLgth
	 */
   protected void serializeSf31IsoAvsRequestLgth(char[] sf31IsoAvsRequestLgth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvsRequestLgth,0,getStringValue(),beginSf31IsoAvsRequestLgth,SF_31_ISO_AVS_REQUEST_LGTH_LEN);
       localSf31IsoAvsRequestLgthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvsRequestLgthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvsRequestLgth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvsRequestLgth() {	 
   		return (substring(getStringValue(),beginSf31IsoAvsRequestLgth,beginSf31IsoAvsRequestLgth + SF_31_ISO_AVS_REQUEST_LGTH_LEN));
   	}
     int localSf31IsoAvsRequestCodeCounter = -1;
     public boolean isSf31IsoAvsRequestCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvsRequestCodeCounter != sharedCounter;
         localSf31IsoAvsRequestCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_REQUEST_CODE_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvsRequestCode
	 */
   protected void serializeSf31IsoAvsRequestCode(char[] sf31IsoAvsRequestCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvsRequestCode,0,getStringValue(),beginSf31IsoAvsRequestCode,SF_31_ISO_AVS_REQUEST_CODE_LEN);
       localSf31IsoAvsRequestCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvsRequestCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvsRequestCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvsRequestCode() {	 
   		return (substring(getStringValue(),beginSf31IsoAvsRequestCode,beginSf31IsoAvsRequestCode + SF_31_ISO_AVS_REQUEST_CODE_LEN));
   	}
     int localSf31IsoAvsResponseTagCounter = -1;
     public boolean isSf31IsoAvsResponseTagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvsResponseTagCounter != sharedCounter;
         localSf31IsoAvsResponseTagCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_RESPONSE_TAG_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvsResponseTag
	 */
   protected void serializeSf31IsoAvsResponseTag(char[] sf31IsoAvsResponseTag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvsResponseTag,0,getStringValue(),beginSf31IsoAvsResponseTag,SF_31_ISO_AVS_RESPONSE_TAG_LEN);
       localSf31IsoAvsResponseTagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvsResponseTagConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvsResponseTag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvsResponseTag() {	 
   		return (substring(getStringValue(),beginSf31IsoAvsResponseTag,beginSf31IsoAvsResponseTag + SF_31_ISO_AVS_RESPONSE_TAG_LEN));
   	}
     int localSf31IsoAvsResponseLgthCounter = -1;
     public boolean isSf31IsoAvsResponseLgthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvsResponseLgthCounter != sharedCounter;
         localSf31IsoAvsResponseLgthCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_RESPONSE_LGTH_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvsResponseLgth
	 */
   protected void serializeSf31IsoAvsResponseLgth(char[] sf31IsoAvsResponseLgth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvsResponseLgth,0,getStringValue(),beginSf31IsoAvsResponseLgth,SF_31_ISO_AVS_RESPONSE_LGTH_LEN);
       localSf31IsoAvsResponseLgthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvsResponseLgthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvsResponseLgth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvsResponseLgth() {	 
   		return (substring(getStringValue(),beginSf31IsoAvsResponseLgth,beginSf31IsoAvsResponseLgth + SF_31_ISO_AVS_RESPONSE_LGTH_LEN));
   	}
     int localSf31IsoAvsResponseCodeCounter = -1;
     public boolean isSf31IsoAvsResponseCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvsResponseCodeCounter != sharedCounter;
         localSf31IsoAvsResponseCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_RESPONSE_CODE_LEN = 1;
	/**
	 * 	serialize this Sf31IsoAvsResponseCode
	 */
   protected void serializeSf31IsoAvsResponseCode(char[] sf31IsoAvsResponseCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvsResponseCode,0,getStringValue(),beginSf31IsoAvsResponseCode,SF_31_ISO_AVS_RESPONSE_CODE_LEN);
       localSf31IsoAvsResponseCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvsResponseCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvsResponseCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvsResponseCode() {	 
   		return (substring(getStringValue(),beginSf31IsoAvsResponseCode,beginSf31IsoAvsResponseCode + SF_31_ISO_AVS_RESPONSE_CODE_LEN));
   	}
     int localSf31IsoPosDataCounter = -1;
     public boolean isSf31IsoPosDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoPosDataCounter != sharedCounter;
         localSf31IsoPosDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_POS_DATA_LEN = 26;
	/**
	 * 	serialize this Sf31IsoPosData
	 */
   protected void serializeSf31IsoPosData(char[] sf31IsoPosData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoPosData,0,getStringValue(),beginSf31IsoPosData,SF_31_ISO_POS_DATA_LEN);
       localSf31IsoPosDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoPosDataConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshSf31IsoPosData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoPosData() {	 
   		return (substring(getStringValue(),beginSf31IsoPosData,beginSf31IsoPosData + SF_31_ISO_POS_DATA_LEN));
   	}
     int localSf31IsoFinNetworkCodeCounter = -1;
     public boolean isSf31IsoFinNetworkCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoFinNetworkCodeCounter != sharedCounter;
         localSf31IsoFinNetworkCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_FIN_NETWORK_CODE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoFinNetworkCode
	 */
   protected void serializeSf31IsoFinNetworkCode(char[] sf31IsoFinNetworkCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoFinNetworkCode,0,getStringValue(),beginSf31IsoFinNetworkCode,SF_31_ISO_FIN_NETWORK_CODE_LEN);
       localSf31IsoFinNetworkCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoFinNetworkCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoFinNetworkCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoFinNetworkCode() {	 
   		return (substring(getStringValue(),beginSf31IsoFinNetworkCode,beginSf31IsoFinNetworkCode + SF_31_ISO_FIN_NETWORK_CODE_LEN));
   	}
     int localSf31IsoProcessingCodeCounter = -1;
     public boolean isSf31IsoProcessingCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoProcessingCodeCounter != sharedCounter;
         localSf31IsoProcessingCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_PROCESSING_CODE_LEN = 6;
	/**
	 * 	serialize this Sf31IsoProcessingCode
	 */
   protected void serializeSf31IsoProcessingCode(char[] sf31IsoProcessingCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoProcessingCode,0,getStringValue(),beginSf31IsoProcessingCode,SF_31_ISO_PROCESSING_CODE_LEN);
       localSf31IsoProcessingCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoProcessingCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf31IsoProcessingCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoProcessingCode() {	 
   		return (substring(getStringValue(),beginSf31IsoProcessingCode,beginSf31IsoProcessingCode + SF_31_ISO_PROCESSING_CODE_LEN));
   	}
     int localSf31IsoDateTimeXmitCounter = -1;
     public boolean isSf31IsoDateTimeXmitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDateTimeXmitCounter != sharedCounter;
         localSf31IsoDateTimeXmitCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DATE_TIME_XMIT_LEN = 10;
	/**
	 * 	serialize this Sf31IsoDateTimeXmit
	 */
   protected void serializeSf31IsoDateTimeXmit(char[] sf31IsoDateTimeXmit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDateTimeXmit,0,getStringValue(),beginSf31IsoDateTimeXmit,SF_31_ISO_DATE_TIME_XMIT_LEN);
       localSf31IsoDateTimeXmitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDateTimeXmitConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSf31IsoDateTimeXmit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDateTimeXmit() {	 
   		return (substring(getStringValue(),beginSf31IsoDateTimeXmit,beginSf31IsoDateTimeXmit + SF_31_ISO_DATE_TIME_XMIT_LEN));
   	}
     int localSf31IsoMerchantTypeCounter = -1;
     public boolean isSf31IsoMerchantTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoMerchantTypeCounter != sharedCounter;
         localSf31IsoMerchantTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_MERCHANT_TYPE_LEN = 4;
	/**
	 * 	serialize this Sf31IsoMerchantType
	 */
   protected void serializeSf31IsoMerchantType(char[] sf31IsoMerchantType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoMerchantType,0,getStringValue(),beginSf31IsoMerchantType,SF_31_ISO_MERCHANT_TYPE_LEN);
       localSf31IsoMerchantTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoMerchantTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf31IsoMerchantType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoMerchantType() {	 
   		return (substring(getStringValue(),beginSf31IsoMerchantType,beginSf31IsoMerchantType + SF_31_ISO_MERCHANT_TYPE_LEN));
   	}
     int localSf31IsoCountryCodeCounter = -1;
     public boolean isSf31IsoCountryCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoCountryCodeCounter != sharedCounter;
         localSf31IsoCountryCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_COUNTRY_CODE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoCountryCode
	 */
   protected void serializeSf31IsoCountryCode(char[] sf31IsoCountryCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoCountryCode,0,getStringValue(),beginSf31IsoCountryCode,SF_31_ISO_COUNTRY_CODE_LEN);
       localSf31IsoCountryCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoCountryCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoCountryCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoCountryCode() {	 
   		return (substring(getStringValue(),beginSf31IsoCountryCode,beginSf31IsoCountryCode + SF_31_ISO_COUNTRY_CODE_LEN));
   	}
     int localSf31IsoPosPinCaptureCounter = -1;
     public boolean isSf31IsoPosPinCaptureModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoPosPinCaptureCounter != sharedCounter;
         localSf31IsoPosPinCaptureCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_POS_PIN_CAPTURE_LEN = 2;
	/**
	 * 	serialize this Sf31IsoPosPinCapture
	 */
   protected void serializeSf31IsoPosPinCapture(char[] sf31IsoPosPinCapture) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoPosPinCapture,0,getStringValue(),beginSf31IsoPosPinCapture,SF_31_ISO_POS_PIN_CAPTURE_LEN);
       localSf31IsoPosPinCaptureCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoPosPinCaptureConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoPosPinCapture is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoPosPinCapture() {	 
   		return (substring(getStringValue(),beginSf31IsoPosPinCapture,beginSf31IsoPosPinCapture + SF_31_ISO_POS_PIN_CAPTURE_LEN));
   	}
     int localSf31IsoRetrievalRefnoCounter = -1;
     public boolean isSf31IsoRetrievalRefnoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoRetrievalRefnoCounter != sharedCounter;
         localSf31IsoRetrievalRefnoCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_RETRIEVAL_REFNO_LEN = 12;
	/**
	 * 	serialize this Sf31IsoRetrievalRefno
	 */
   protected void serializeSf31IsoRetrievalRefno(char[] sf31IsoRetrievalRefno) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoRetrievalRefno,0,getStringValue(),beginSf31IsoRetrievalRefno,SF_31_ISO_RETRIEVAL_REFNO_LEN);
       localSf31IsoRetrievalRefnoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoRetrievalRefnoConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshSf31IsoRetrievalRefno is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoRetrievalRefno() {	 
   		return (substring(getStringValue(),beginSf31IsoRetrievalRefno,beginSf31IsoRetrievalRefno + SF_31_ISO_RETRIEVAL_REFNO_LEN));
   	}
     int localSf31IsoIdTerminalCounter = -1;
     public boolean isSf31IsoIdTerminalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoIdTerminalCounter != sharedCounter;
         localSf31IsoIdTerminalCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_ID_TERMINAL_LEN = 8;
	/**
	 * 	serialize this Sf31IsoIdTerminal
	 */
   protected void serializeSf31IsoIdTerminal(char[] sf31IsoIdTerminal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoIdTerminal,0,getStringValue(),beginSf31IsoIdTerminal,SF_31_ISO_ID_TERMINAL_LEN);
       localSf31IsoIdTerminalCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoIdTerminalConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf31IsoIdTerminal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoIdTerminal() {	 
   		return (substring(getStringValue(),beginSf31IsoIdTerminal,beginSf31IsoIdTerminal + SF_31_ISO_ID_TERMINAL_LEN));
   	}
     int localSf31IsoCardAcceptorCounter = -1;
     public boolean isSf31IsoCardAcceptorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoCardAcceptorCounter != sharedCounter;
         localSf31IsoCardAcceptorCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_CARD_ACCEPTOR_LEN = 15;
	/**
	 * 	serialize this Sf31IsoCardAcceptor
	 */
   protected void serializeSf31IsoCardAcceptor(char[] sf31IsoCardAcceptor) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoCardAcceptor,0,getStringValue(),beginSf31IsoCardAcceptor,SF_31_ISO_CARD_ACCEPTOR_LEN);
       localSf31IsoCardAcceptorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoCardAcceptorConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshSf31IsoCardAcceptor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoCardAcceptor() {	 
   		return (substring(getStringValue(),beginSf31IsoCardAcceptor,beginSf31IsoCardAcceptor + SF_31_ISO_CARD_ACCEPTOR_LEN));
   	}
     int localSf31IsoAddtlDataCounter = -1;
     public boolean isSf31IsoAddtlDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAddtlDataCounter != sharedCounter;
         localSf31IsoAddtlDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_ADDTL_DATA_LEN = 3;
	/**
	 * 	serialize this Sf31IsoAddtlData
	 */
   protected void serializeSf31IsoAddtlData(char[] sf31IsoAddtlData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAddtlData,0,getStringValue(),beginSf31IsoAddtlData,SF_31_ISO_ADDTL_DATA_LEN);
       localSf31IsoAddtlDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAddtlDataConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoAddtlData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAddtlData() {	 
   		return (substring(getStringValue(),beginSf31IsoAddtlData,beginSf31IsoAddtlData + SF_31_ISO_ADDTL_DATA_LEN));
   	}
     int localSf31IsoMerchantIdCounter = -1;
     public boolean isSf31IsoMerchantIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoMerchantIdCounter != sharedCounter;
         localSf31IsoMerchantIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_MERCHANT_ID_LEN = 16;
	/**
	 * 	serialize this Sf31IsoMerchantId
	 */
   protected void serializeSf31IsoMerchantId(char[] sf31IsoMerchantId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoMerchantId,0,getStringValue(),beginSf31IsoMerchantId,SF_31_ISO_MERCHANT_ID_LEN);
       localSf31IsoMerchantIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoMerchantIdConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSf31IsoMerchantId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoMerchantId() {	 
   		return (substring(getStringValue(),beginSf31IsoMerchantId,beginSf31IsoMerchantId + SF_31_ISO_MERCHANT_ID_LEN));
   	}
     int localSf31IsoIssUpIcaCounter = -1;
     public boolean isSf31IsoIssUpIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoIssUpIcaCounter != sharedCounter;
         localSf31IsoIssUpIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_ISS_UP_ICA_LEN = 6;
	/**
	 * 	serialize this Sf31IsoIssUpIca
	 */
   protected void serializeSf31IsoIssUpIca(char[] sf31IsoIssUpIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoIssUpIca,0,getStringValue(),beginSf31IsoIssUpIca,SF_31_ISO_ISS_UP_ICA_LEN);
       localSf31IsoIssUpIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoIssUpIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf31IsoIssUpIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoIssUpIca() {	 
   		return (substring(getStringValue(),beginSf31IsoIssUpIca,beginSf31IsoIssUpIca + SF_31_ISO_ISS_UP_ICA_LEN));
   	}
     int localSf31IsoStateCodeCounter = -1;
     public boolean isSf31IsoStateCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoStateCodeCounter != sharedCounter;
         localSf31IsoStateCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_STATE_CODE_LEN = 2;
	/**
	 * 	serialize this Sf31IsoStateCode
	 */
   protected void serializeSf31IsoStateCode(char[] sf31IsoStateCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoStateCode,0,getStringValue(),beginSf31IsoStateCode,SF_31_ISO_STATE_CODE_LEN);
       localSf31IsoStateCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoStateCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoStateCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoStateCode() {	 
   		return (substring(getStringValue(),beginSf31IsoStateCode,beginSf31IsoStateCode + SF_31_ISO_STATE_CODE_LEN));
   	}
     int localSf31IsoBlIcSeqNoCounter = -1;
     public boolean isSf31IsoBlIcSeqNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoBlIcSeqNoCounter != sharedCounter;
         localSf31IsoBlIcSeqNoCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_BL_IC_SEQ_NO_LEN = 8;
	/**
	 * 	serialize this Sf31IsoBlIcSeqNo
	 */
   protected void serializeSf31IsoBlIcSeqNo(char[] sf31IsoBlIcSeqNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoBlIcSeqNo,0,getStringValue(),beginSf31IsoBlIcSeqNo,SF_31_ISO_BL_IC_SEQ_NO_LEN);
       localSf31IsoBlIcSeqNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoBlIcSeqNoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf31IsoBlIcSeqNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoBlIcSeqNo() {	 
   		return (substring(getStringValue(),beginSf31IsoBlIcSeqNo,beginSf31IsoBlIcSeqNo + SF_31_ISO_BL_IC_SEQ_NO_LEN));
   	}
     int localSf31IsoIcMagCcCounter = -1;
     public boolean isSf31IsoIcMagCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoIcMagCcCounter != sharedCounter;
         localSf31IsoIcMagCcCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_IC_MAG_CC_LEN = 1;
	/**
	 * 	serialize this Sf31IsoIcMagCc
	 */
   protected void serializeSf31IsoIcMagCc(char[] sf31IsoIcMagCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoIcMagCc,0,getStringValue(),beginSf31IsoIcMagCc,SF_31_ISO_IC_MAG_CC_LEN);
       localSf31IsoIcMagCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoIcMagCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoIcMagCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoIcMagCc() {	 
   		return (substring(getStringValue(),beginSf31IsoIcMagCc,beginSf31IsoIcMagCc + SF_31_ISO_IC_MAG_CC_LEN));
   	}
     int localSf31IsoDe48Tag87PresentCounter = -1;
     public boolean isSf31IsoDe48Tag87PresentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Tag87PresentCounter != sharedCounter;
         localSf31IsoDe48Tag87PresentCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_TAG_87_PRESENT_LEN = 1;
	/**
	 * 	serialize this Sf31IsoDe48Tag87Present
	 */
   protected void serializeSf31IsoDe48Tag87Present(char[] sf31IsoDe48Tag87Present) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Tag87Present,0,getStringValue(),beginSf31IsoDe48Tag87Present,SF_31_ISO_DE_48_TAG_87_PRESENT_LEN);
       localSf31IsoDe48Tag87PresentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Tag87PresentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Tag87Present is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Tag87Present() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Tag87Present,beginSf31IsoDe48Tag87Present + SF_31_ISO_DE_48_TAG_87_PRESENT_LEN));
   	}
     int localSf31IsoDe48Tag88PresentCounter = -1;
     public boolean isSf31IsoDe48Tag88PresentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Tag88PresentCounter != sharedCounter;
         localSf31IsoDe48Tag88PresentCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_TAG_88_PRESENT_LEN = 1;
	/**
	 * 	serialize this Sf31IsoDe48Tag88Present
	 */
   protected void serializeSf31IsoDe48Tag88Present(char[] sf31IsoDe48Tag88Present) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Tag88Present,0,getStringValue(),beginSf31IsoDe48Tag88Present,SF_31_ISO_DE_48_TAG_88_PRESENT_LEN);
       localSf31IsoDe48Tag88PresentCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Tag88PresentConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Tag88Present is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Tag88Present() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Tag88Present,beginSf31IsoDe48Tag88Present + SF_31_ISO_DE_48_TAG_88_PRESENT_LEN));
   	}
     int localSf31IsoDe48Tag89ValueCounter = -1;
     public boolean isSf31IsoDe48Tag89ValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Tag89ValueCounter != sharedCounter;
         localSf31IsoDe48Tag89ValueCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_TAG_89_VALUE_LEN = 1;
	/**
	 * 	serialize this Sf31IsoDe48Tag89Value
	 */
   protected void serializeSf31IsoDe48Tag89Value(char[] sf31IsoDe48Tag89Value) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Tag89Value,0,getStringValue(),beginSf31IsoDe48Tag89Value,SF_31_ISO_DE_48_TAG_89_VALUE_LEN);
       localSf31IsoDe48Tag89ValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Tag89ValueConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Tag89Value is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Tag89Value() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Tag89Value,beginSf31IsoDe48Tag89Value + SF_31_ISO_DE_48_TAG_89_VALUE_LEN));
   	}
     int localSf31IsoMemberDataCounter = -1;
     public boolean isSf31IsoMemberDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoMemberDataCounter != sharedCounter;
         localSf31IsoMemberDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_MEMBER_DATA_LEN = 99;
	/**
	 * 	serialize this Sf31IsoMemberData
	 */
   protected void serializeSf31IsoMemberData(char[] sf31IsoMemberData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoMemberData,0,getStringValue(),beginSf31IsoMemberData,SF_31_ISO_MEMBER_DATA_LEN);
       localSf31IsoMemberDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoMemberDataConstraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
    /**
	 *	refreshSf31IsoMemberData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoMemberData() {	 
   		return (substring(getStringValue(),beginSf31IsoMemberData,beginSf31IsoMemberData + SF_31_ISO_MEMBER_DATA_LEN));
   	}
     int localSf31IsoDe48Se24Sf1Counter = -1;
     public boolean isSf31IsoDe48Se24Sf1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se24Sf1Counter != sharedCounter;
         localSf31IsoDe48Se24Sf1Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_24_SF_1_LEN = 5;
	/**
	 * 	serialize this Sf31IsoDe48Se24Sf1
	 */
   protected void serializeSf31IsoDe48Se24Sf1(char[] sf31IsoDe48Se24Sf1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se24Sf1,0,getStringValue(),beginSf31IsoDe48Se24Sf1,SF_31_ISO_DE_48_SE_24_SF_1_LEN);
       localSf31IsoDe48Se24Sf1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se24Sf1Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se24Sf1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se24Sf1() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se24Sf1,beginSf31IsoDe48Se24Sf1 + SF_31_ISO_DE_48_SE_24_SF_1_LEN));
   	}
     int localSf31IsoDe48Se24Sf2Counter = -1;
     public boolean isSf31IsoDe48Se24Sf2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se24Sf2Counter != sharedCounter;
         localSf31IsoDe48Se24Sf2Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_24_SF_2_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe48Se24Sf2
	 */
   protected void serializeSf31IsoDe48Se24Sf2(char[] sf31IsoDe48Se24Sf2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se24Sf2,0,getStringValue(),beginSf31IsoDe48Se24Sf2,SF_31_ISO_DE_48_SE_24_SF_2_LEN);
       localSf31IsoDe48Se24Sf2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se24Sf2Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se24Sf2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se24Sf2() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se24Sf2,beginSf31IsoDe48Se24Sf2 + SF_31_ISO_DE_48_SE_24_SF_2_LEN));
   	}
     int localSf31IsoDe48Se24Sf3Counter = -1;
     public boolean isSf31IsoDe48Se24Sf3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se24Sf3Counter != sharedCounter;
         localSf31IsoDe48Se24Sf3Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_24_SF_3_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe48Se24Sf3
	 */
   protected void serializeSf31IsoDe48Se24Sf3(char[] sf31IsoDe48Se24Sf3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se24Sf3,0,getStringValue(),beginSf31IsoDe48Se24Sf3,SF_31_ISO_DE_48_SE_24_SF_3_LEN);
       localSf31IsoDe48Se24Sf3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se24Sf3Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se24Sf3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se24Sf3() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se24Sf3,beginSf31IsoDe48Se24Sf3 + SF_31_ISO_DE_48_SE_24_SF_3_LEN));
   	}
     int localSf31IsoDe48Se24Sf4Counter = -1;
     public boolean isSf31IsoDe48Se24Sf4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se24Sf4Counter != sharedCounter;
         localSf31IsoDe48Se24Sf4Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_24_SF_4_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe48Se24Sf4
	 */
   protected void serializeSf31IsoDe48Se24Sf4(char[] sf31IsoDe48Se24Sf4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se24Sf4,0,getStringValue(),beginSf31IsoDe48Se24Sf4,SF_31_ISO_DE_48_SE_24_SF_4_LEN);
       localSf31IsoDe48Se24Sf4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se24Sf4Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se24Sf4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se24Sf4() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se24Sf4,beginSf31IsoDe48Se24Sf4 + SF_31_ISO_DE_48_SE_24_SF_4_LEN));
   	}
     int localSf31IsoDe48Se43AavCounter = -1;
     public boolean isSf31IsoDe48Se43AavModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se43AavCounter != sharedCounter;
         localSf31IsoDe48Se43AavCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_43_AAV_LEN = 32;
	/**
	 * 	serialize this Sf31IsoDe48Se43Aav
	 */
   protected void serializeSf31IsoDe48Se43Aav(char[] sf31IsoDe48Se43Aav) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se43Aav,0,getStringValue(),beginSf31IsoDe48Se43Aav,SF_31_ISO_DE_48_SE_43_AAV_LEN);
       localSf31IsoDe48Se43AavCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se43AavConstraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se43Aav is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se43Aav() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se43Aav,beginSf31IsoDe48Se43Aav + SF_31_ISO_DE_48_SE_43_AAV_LEN));
   	}
     int localSf31IsoDe48Se66Sf1Counter = -1;
     public boolean isSf31IsoDe48Se66Sf1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se66Sf1Counter != sharedCounter;
         localSf31IsoDe48Se66Sf1Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_66_SF_1_LEN = 1;
	/**
	 * 	serialize this Sf31IsoDe48Se66Sf1
	 */
   protected void serializeSf31IsoDe48Se66Sf1(char[] sf31IsoDe48Se66Sf1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se66Sf1,0,getStringValue(),beginSf31IsoDe48Se66Sf1,SF_31_ISO_DE_48_SE_66_SF_1_LEN);
       localSf31IsoDe48Se66Sf1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se66Sf1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se66Sf1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se66Sf1() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se66Sf1,beginSf31IsoDe48Se66Sf1 + SF_31_ISO_DE_48_SE_66_SF_1_LEN));
   	}
     int localSf31IsoDe48Se66Sf2Counter = -1;
     public boolean isSf31IsoDe48Se66Sf2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se66Sf2Counter != sharedCounter;
         localSf31IsoDe48Se66Sf2Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_66_SF_2_LEN = 36;
	/**
	 * 	serialize this Sf31IsoDe48Se66Sf2
	 */
   protected void serializeSf31IsoDe48Se66Sf2(char[] sf31IsoDe48Se66Sf2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se66Sf2,0,getStringValue(),beginSf31IsoDe48Se66Sf2,SF_31_ISO_DE_48_SE_66_SF_2_LEN);
       localSf31IsoDe48Se66Sf2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se66Sf2Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se66Sf2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se66Sf2() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se66Sf2,beginSf31IsoDe48Se66Sf2 + SF_31_ISO_DE_48_SE_66_SF_2_LEN));
   	}
     int localSf31IsoTimeLocalTransCounter = -1;
     public boolean isSf31IsoTimeLocalTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoTimeLocalTransCounter != sharedCounter;
         localSf31IsoTimeLocalTransCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sf31IsoTimeLocalTrans
	 *	@return sf31IsoTimeLocalTrans
	 */
	public char[]  getSf31IsoTimeLocalTransString() {
	     return getCharArray(beginSf31IsoTimeLocalTrans,SF_31_ISO_TIME_LOCAL_TRANS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf31IsoTimeLocalTransIsNumeric() {
	    return isNumeric(beginSf31IsoTimeLocalTrans
	                    ,beginSf31IsoTimeLocalTrans + SF_31_ISO_TIME_LOCAL_TRANS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SF_31_ISO_TIME_LOCAL_TRANS_LEN = 6;
  	/**
	 * serializeSf31IsoTimeLocalTrans
	 */
	protected void serializeSf31IsoTimeLocalTrans(long sf31IsoTimeLocalTrans) {
		 putNumber(beginSf31IsoTimeLocalTrans,sf31IsoTimeLocalTrans,SF_31_ISO_TIME_LOCAL_TRANS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf31IsoTimeLocalTransCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSf31IsoTimeLocalTrans
	 */
   	protected  long serializeSf31IsoTimeLocalTrans(char[] value) {
	    long  sf31IsoTimeLocalTrans;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sf31IsoTimeLocalTrans = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSf31IsoTimeLocalTrans
		       ,6
		      );
		 localSf31IsoTimeLocalTransCounter = shareString.getSerializedField().getModifiedCounter();
		return  sf31IsoTimeLocalTrans;
    }

   protected long checkSf31IsoTimeLocalTransMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSf31IsoTimeLocalTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf31IsoTimeLocalTrans() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSf31IsoTimeLocalTrans
			                 ,SF_31_ISO_TIME_LOCAL_TRANS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sf31IsoTimeLocalTrans", beginSf31IsoTimeLocalTrans,SF_31_ISO_TIME_LOCAL_TRANS_LEN);
    }
   	}
     int localSf31IsoDateLocalTransCounter = -1;
     public boolean isSf31IsoDateLocalTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDateLocalTransCounter != sharedCounter;
         localSf31IsoDateLocalTransCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sf31IsoDateLocalTrans
	 *	@return sf31IsoDateLocalTrans
	 */
	public char[]  getSf31IsoDateLocalTransString() {
	     return getCharArray(beginSf31IsoDateLocalTrans,SF_31_ISO_DATE_LOCAL_TRANS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf31IsoDateLocalTransIsNumeric() {
	    return isNumeric(beginSf31IsoDateLocalTrans
	                    ,beginSf31IsoDateLocalTrans + SF_31_ISO_DATE_LOCAL_TRANS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SF_31_ISO_DATE_LOCAL_TRANS_LEN = 4;
  	/**
	 * serializeSf31IsoDateLocalTrans
	 */
	protected void serializeSf31IsoDateLocalTrans(int sf31IsoDateLocalTrans) {
		 putNumber(beginSf31IsoDateLocalTrans,sf31IsoDateLocalTrans,SF_31_ISO_DATE_LOCAL_TRANS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf31IsoDateLocalTransCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSf31IsoDateLocalTrans
	 */
   	protected  int serializeSf31IsoDateLocalTrans(char[] value) {
	    int  sf31IsoDateLocalTrans;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sf31IsoDateLocalTrans = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSf31IsoDateLocalTrans
		       ,4
		      );
		 localSf31IsoDateLocalTransCounter = shareString.getSerializedField().getModifiedCounter();
		return  sf31IsoDateLocalTrans;
    }

   protected int checkSf31IsoDateLocalTransMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSf31IsoDateLocalTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf31IsoDateLocalTrans() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSf31IsoDateLocalTrans
			                 ,SF_31_ISO_DATE_LOCAL_TRANS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sf31IsoDateLocalTrans", beginSf31IsoDateLocalTrans,SF_31_ISO_DATE_LOCAL_TRANS_LEN);
    }
   	}
     int localSf31IsoDe48Se42Len3Counter = -1;
     public boolean isSf31IsoDe48Se42Len3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se42Len3Counter != sharedCounter;
         localSf31IsoDe48Se42Len3Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_42_LEN_3_LEN = 3;
	/**
	 * 	serialize this Sf31IsoDe48Se42Len3
	 */
   protected void serializeSf31IsoDe48Se42Len3(char[] sf31IsoDe48Se42Len3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se42Len3,0,getStringValue(),beginSf31IsoDe48Se42Len3,SF_31_ISO_DE_48_SE_42_LEN_3_LEN);
       localSf31IsoDe48Se42Len3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se42Len3Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se42Len3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se42Len3() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se42Len3,beginSf31IsoDe48Se42Len3 + SF_31_ISO_DE_48_SE_42_LEN_3_LEN));
   	}
     int localSf31IsoDe48Se42Sf2Sf3Counter = -1;
     public boolean isSf31IsoDe48Se42Sf2Sf3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se42Sf2Sf3Counter != sharedCounter;
         localSf31IsoDe48Se42Sf2Sf3Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_42_SF_2_SF_3_LEN = 4;
	/**
	 * 	serialize this Sf31IsoDe48Se42Sf2Sf3
	 */
   protected void serializeSf31IsoDe48Se42Sf2Sf3(char[] sf31IsoDe48Se42Sf2Sf3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se42Sf2Sf3,0,getStringValue(),beginSf31IsoDe48Se42Sf2Sf3,SF_31_ISO_DE_48_SE_42_SF_2_SF_3_LEN);
       localSf31IsoDe48Se42Sf2Sf3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se42Sf2Sf3Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se42Sf2Sf3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se42Sf2Sf3() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se42Sf2Sf3,beginSf31IsoDe48Se42Sf2Sf3 + SF_31_ISO_DE_48_SE_42_SF_2_SF_3_LEN));
   	}
     int localSf31IsoDe48Se33Sf1Counter = -1;
     public boolean isSf31IsoDe48Se33Sf1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se33Sf1Counter != sharedCounter;
         localSf31IsoDe48Se33Sf1Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_33_SF_1_LEN = 1;
	/**
	 * 	serialize this Sf31IsoDe48Se33Sf1
	 */
   protected void serializeSf31IsoDe48Se33Sf1(char[] sf31IsoDe48Se33Sf1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se33Sf1,0,getStringValue(),beginSf31IsoDe48Se33Sf1,SF_31_ISO_DE_48_SE_33_SF_1_LEN);
       localSf31IsoDe48Se33Sf1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se33Sf1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se33Sf1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se33Sf1() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se33Sf1,beginSf31IsoDe48Se33Sf1 + SF_31_ISO_DE_48_SE_33_SF_1_LEN));
   	}
     int localSf31IsoDe48Se33Sf2Counter = -1;
     public boolean isSf31IsoDe48Se33Sf2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se33Sf2Counter != sharedCounter;
         localSf31IsoDe48Se33Sf2Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_33_SF_2_LEN = 19;
	/**
	 * 	serialize this Sf31IsoDe48Se33Sf2
	 */
   protected void serializeSf31IsoDe48Se33Sf2(char[] sf31IsoDe48Se33Sf2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se33Sf2,0,getStringValue(),beginSf31IsoDe48Se33Sf2,SF_31_ISO_DE_48_SE_33_SF_2_LEN);
       localSf31IsoDe48Se33Sf2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se33Sf2Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se33Sf2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se33Sf2() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se33Sf2,beginSf31IsoDe48Se33Sf2 + SF_31_ISO_DE_48_SE_33_SF_2_LEN));
   	}
     int localSf31IsoDe48Se33Sf5Counter = -1;
     public boolean isSf31IsoDe48Se33Sf5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se33Sf5Counter != sharedCounter;
         localSf31IsoDe48Se33Sf5Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_33_SF_5_LEN = 2;
	/**
	 * 	serialize this Sf31IsoDe48Se33Sf5
	 */
   protected void serializeSf31IsoDe48Se33Sf5(char[] sf31IsoDe48Se33Sf5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se33Sf5,0,getStringValue(),beginSf31IsoDe48Se33Sf5,SF_31_ISO_DE_48_SE_33_SF_5_LEN);
       localSf31IsoDe48Se33Sf5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se33Sf5Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se33Sf5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se33Sf5() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se33Sf5,beginSf31IsoDe48Se33Sf5 + SF_31_ISO_DE_48_SE_33_SF_5_LEN));
   	}
     int localSf31IsoDe48Se33Sf6Counter = -1;
     public boolean isSf31IsoDe48Se33Sf6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se33Sf6Counter != sharedCounter;
         localSf31IsoDe48Se33Sf6Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_33_SF_6_LEN = 11;
	/**
	 * 	serialize this Sf31IsoDe48Se33Sf6
	 */
   protected void serializeSf31IsoDe48Se33Sf6(char[] sf31IsoDe48Se33Sf6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se33Sf6,0,getStringValue(),beginSf31IsoDe48Se33Sf6,SF_31_ISO_DE_48_SE_33_SF_6_LEN);
       localSf31IsoDe48Se33Sf6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se33Sf6Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se33Sf6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se33Sf6() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se33Sf6,beginSf31IsoDe48Se33Sf6 + SF_31_ISO_DE_48_SE_33_SF_6_LEN));
   	}
     int localSf31IsoDe48Se52TicCounter = -1;
     public boolean isSf31IsoDe48Se52TicModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoDe48Se52TicCounter != sharedCounter;
         localSf31IsoDe48Se52TicCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_DE_48_SE_52_TIC_LEN = 2;
	/**
	 * 	serialize this Sf31IsoDe48Se52Tic
	 */
   protected void serializeSf31IsoDe48Se52Tic(char[] sf31IsoDe48Se52Tic) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoDe48Se52Tic,0,getStringValue(),beginSf31IsoDe48Se52Tic,SF_31_ISO_DE_48_SE_52_TIC_LEN);
       localSf31IsoDe48Se52TicCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoDe48Se52TicConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoDe48Se52Tic is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoDe48Se52Tic() {	 
   		return (substring(getStringValue(),beginSf31IsoDe48Se52Tic,beginSf31IsoDe48Se52Tic + SF_31_ISO_DE_48_SE_52_TIC_LEN));
   	}
     int localSf31FutureFillerCounter = -1;
     public boolean isSf31FutureFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31FutureFillerCounter != sharedCounter;
         localSf31FutureFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_FUTURE_FILLER_LEN = 27;
	/**
	 * 	serialize this Sf31FutureFiller
	 */
   protected void serializeSf31FutureFiller(char[] sf31FutureFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31FutureFiller,0,getStringValue(),beginSf31FutureFiller,SF_31_FUTURE_FILLER_LEN);
       localSf31FutureFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31FutureFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
    /**
	 *	refreshSf31FutureFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31FutureFiller() {	 
   		return (substring(getStringValue(),beginSf31FutureFiller,beginSf31FutureFiller + SF_31_FUTURE_FILLER_LEN));
   	}




}
  
