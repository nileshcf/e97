package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004FinStatRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004FinStatRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004FinStatRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_FIN_STAT_REC_LENGTH = 578;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004TransmissionId;
            protected  int beginIp40004FinancialInd;
            protected  int beginIp40004MtiFunc;
            protected  int beginIp40004ReversalInd;
            protected  int beginIp40004ReversalDate;
            protected  int beginIp40004TransType2;
            protected  int beginIp40004Mcc;
            protected  int beginIp40004Ird;
            protected  int beginIp40004CurrencyCode;
            protected  int beginIp40004CurrencyExp;
           protected int beginIp40004InvDtlData;
           protected static final int IP_40004_INV_DTL_DATA_SIZE = 10;
	
	/**
	* Constructor for Ip40004FinStatRecSerialized
	**/
    public Ip40004FinStatRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004FinStatRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FinStatRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004FinStatRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,35); // serialize this field at offset 35 by default 
    }
    
	/**
	* sets parent for this Ip40004FinStatRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 35 by default
    }    
	/**
	* initializes the field in Ip40004FinStatRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_FIN_STAT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004TransmissionId = getStartOffset() + 0;	// set offset for serialization
  
  
             beginIp40004FinancialInd = getStartOffset() + 50;	// set offset for serialization
  
             beginIp40004MtiFunc = getStartOffset() + 51;	// set offset for serialization
  
             beginIp40004ReversalInd = getStartOffset() + 59;	// set offset for serialization
  
             beginIp40004ReversalDate = getStartOffset() + 60;	// set offset for serialization
  
             beginIp40004TransType2 = getStartOffset() + 66;	// set offset for serialization
  
             beginIp40004Mcc = getStartOffset() + 68;	// set offset for serialization
  
             beginIp40004Ird = getStartOffset() + 72;	// set offset for serialization
  
             beginIp40004CurrencyCode = getStartOffset() + 74;	// set offset for serialization
  
             beginIp40004CurrencyExp = getStartOffset() + 77;	// set offset for serialization
  
	        beginIp40004InvDtlData = getStartOffset() + 78; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40004TransmissionIdCounter = -1;
     public boolean isIp40004TransmissionIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransmissionIdCounter != sharedCounter;
         localIp40004TransmissionIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_TRANSMISSION_ID_LEN = 25;
	/**
	 * 	serialize this Ip40004TransmissionId
	 */
   protected void serializeIp40004TransmissionId(char[] ip40004TransmissionId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004TransmissionId,0,getStringValue(),beginIp40004TransmissionId,IP_40004_TRANSMISSION_ID_LEN);
       localIp40004TransmissionIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004TransmissionIdConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp40004TransmissionId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004TransmissionId() {	 
   		return (substring(getStringValue(),beginIp40004TransmissionId,beginIp40004TransmissionId + IP_40004_TRANSMISSION_ID_LEN));
   	}
     int localIp40004FinancialIndCounter = -1;
     public boolean isIp40004FinancialIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FinancialIndCounter != sharedCounter;
         localIp40004FinancialIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_FINANCIAL_IND_LEN = 1;
	/**
	 * 	serialize this Ip40004FinancialInd
	 */
   protected void serializeIp40004FinancialInd(char[] ip40004FinancialInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004FinancialInd,0,getStringValue(),beginIp40004FinancialInd,IP_40004_FINANCIAL_IND_LEN);
       localIp40004FinancialIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004FinancialIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004FinancialInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004FinancialInd() {	 
   		return (substring(getStringValue(),beginIp40004FinancialInd,beginIp40004FinancialInd + IP_40004_FINANCIAL_IND_LEN));
   	}
     int localIp40004MtiFuncCounter = -1;
     public boolean isIp40004MtiFuncModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004MtiFuncCounter != sharedCounter;
         localIp40004MtiFuncCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_MTI_FUNC_LEN = 8;
	/**
	 * 	serialize this Ip40004MtiFunc
	 */
   protected void serializeIp40004MtiFunc(char[] ip40004MtiFunc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004MtiFunc,0,getStringValue(),beginIp40004MtiFunc,IP_40004_MTI_FUNC_LEN);
       localIp40004MtiFuncCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004MtiFuncConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp40004MtiFunc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004MtiFunc() {	 
   		return (substring(getStringValue(),beginIp40004MtiFunc,beginIp40004MtiFunc + IP_40004_MTI_FUNC_LEN));
   	}
     int localIp40004ReversalIndCounter = -1;
     public boolean isIp40004ReversalIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ReversalIndCounter != sharedCounter;
         localIp40004ReversalIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_REVERSAL_IND_LEN = 1;
	/**
	 * 	serialize this Ip40004ReversalInd
	 */
   protected void serializeIp40004ReversalInd(char[] ip40004ReversalInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004ReversalInd,0,getStringValue(),beginIp40004ReversalInd,IP_40004_REVERSAL_IND_LEN);
       localIp40004ReversalIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004ReversalIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004ReversalInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004ReversalInd() {	 
   		return (substring(getStringValue(),beginIp40004ReversalInd,beginIp40004ReversalInd + IP_40004_REVERSAL_IND_LEN));
   	}
     int localIp40004ReversalDateCounter = -1;
     public boolean isIp40004ReversalDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004ReversalDateCounter != sharedCounter;
         localIp40004ReversalDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_REVERSAL_DATE_LEN = 6;
	/**
	 * 	serialize this Ip40004ReversalDate
	 */
   protected void serializeIp40004ReversalDate(char[] ip40004ReversalDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004ReversalDate,0,getStringValue(),beginIp40004ReversalDate,IP_40004_REVERSAL_DATE_LEN);
       localIp40004ReversalDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004ReversalDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp40004ReversalDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004ReversalDate() {	 
   		return (substring(getStringValue(),beginIp40004ReversalDate,beginIp40004ReversalDate + IP_40004_REVERSAL_DATE_LEN));
   	}
     int localIp40004TransType2Counter = -1;
     public boolean isIp40004TransType2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004TransType2Counter != sharedCounter;
         localIp40004TransType2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_TRANS_TYPE_2_LEN = 2;
	/**
	 * 	serialize this Ip40004TransType2
	 */
   protected void serializeIp40004TransType2(char[] ip40004TransType2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004TransType2,0,getStringValue(),beginIp40004TransType2,IP_40004_TRANS_TYPE_2_LEN);
       localIp40004TransType2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004TransType2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp40004TransType2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004TransType2() {	 
   		return (substring(getStringValue(),beginIp40004TransType2,beginIp40004TransType2 + IP_40004_TRANS_TYPE_2_LEN));
   	}
     int localIp40004MccCounter = -1;
     public boolean isIp40004MccModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004MccCounter != sharedCounter;
         localIp40004MccCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004Mcc
	 *	@return ip40004Mcc
	 */
	public char[]  getIp40004MccString() {
	     return getCharArray(beginIp40004Mcc,IP_40004_MCC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004MccIsNumeric() {
	    return isNumeric(beginIp40004Mcc
	                    ,beginIp40004Mcc + IP_40004_MCC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_MCC_LEN = 4;
  	/**
	 * serializeIp40004Mcc
	 */
	protected void serializeIp40004Mcc(int ip40004Mcc) {
		 putNumber(beginIp40004Mcc,ip40004Mcc,IP_40004_MCC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004MccCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004Mcc
	 */
   	protected  int serializeIp40004Mcc(char[] value) {
	    int  ip40004Mcc;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004Mcc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp40004Mcc
		       ,4
		      );
		 localIp40004MccCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004Mcc;
    }

   protected int checkIp40004MccMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004Mcc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004Mcc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004Mcc
			                 ,IP_40004_MCC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004Mcc", beginIp40004Mcc,IP_40004_MCC_LEN);
    }
   	}
     int localIp40004IrdCounter = -1;
     public boolean isIp40004IrdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004IrdCounter != sharedCounter;
         localIp40004IrdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_IRD_LEN = 2;
	/**
	 * 	serialize this Ip40004Ird
	 */
   protected void serializeIp40004Ird(char[] ip40004Ird) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004Ird,0,getStringValue(),beginIp40004Ird,IP_40004_IRD_LEN);
       localIp40004IrdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004IrdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp40004Ird is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004Ird() {	 
   		return (substring(getStringValue(),beginIp40004Ird,beginIp40004Ird + IP_40004_IRD_LEN));
   	}
     int localIp40004CurrencyCodeCounter = -1;
     public boolean isIp40004CurrencyCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004CurrencyCodeCounter != sharedCounter;
         localIp40004CurrencyCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_CURRENCY_CODE_LEN = 3;
	/**
	 * 	serialize this Ip40004CurrencyCode
	 */
   protected void serializeIp40004CurrencyCode(char[] ip40004CurrencyCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004CurrencyCode,0,getStringValue(),beginIp40004CurrencyCode,IP_40004_CURRENCY_CODE_LEN);
       localIp40004CurrencyCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004CurrencyCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp40004CurrencyCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004CurrencyCode() {	 
   		return (substring(getStringValue(),beginIp40004CurrencyCode,beginIp40004CurrencyCode + IP_40004_CURRENCY_CODE_LEN));
   	}
     int localIp40004CurrencyExpCounter = -1;
     public boolean isIp40004CurrencyExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004CurrencyExpCounter != sharedCounter;
         localIp40004CurrencyExpCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_CURRENCY_EXP_LEN = 1;
	/**
	 * 	serialize this Ip40004CurrencyExp
	 */
   protected void serializeIp40004CurrencyExp(char[] ip40004CurrencyExp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004CurrencyExp,0,getStringValue(),beginIp40004CurrencyExp,IP_40004_CURRENCY_EXP_LEN);
       localIp40004CurrencyExpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004CurrencyExpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp40004CurrencyExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004CurrencyExp() {	 
   		return (substring(getStringValue(),beginIp40004CurrencyExp,beginIp40004CurrencyExp + IP_40004_CURRENCY_EXP_LEN));
   	}
 
   
  protected  static final int IP_40004_INV_DTL_DATA_LEN = 50;
   /**
	 *	serializeIp40004InvDtlData as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp40004InvDtlData(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp40004InvDtlData + index*IP_40004_INV_DTL_DATA_LEN)
   	          , IP_40004_INV_DTL_DATA_LEN 
   	          );
   }

		public int ip40004InvDtlDataSize() {
			return IP_40004_INV_DTL_DATA_SIZE;
		}



}
  
