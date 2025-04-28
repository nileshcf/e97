package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00724CentralSiteFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00724CentralSiteFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00724CentralSiteFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00724_CENTRAL_SITE_FIELDS_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00724JpnCustId;
            protected  int beginIp00724GamingPartcptnSw;
            protected  int beginIp00724AckDtlPrsnmnt;
            protected  int beginIp00724AckDtlChgbk;
            protected  int beginIp00724AckDtlFeeColl;
            protected  int beginIp00724NotDtlPrsnmnt;
            protected  int beginIp00724NotDtlChgbk;
            protected  int beginIp00724NotDtlFeeColl;
            protected  int beginIp00724McSendPart;
            protected  int beginIp00724RegEcomOptoutSw;
            protected  int beginIp00724De54OptionInd;
            protected  int beginIp00724AcqAlmOptinFlag;
            protected  int beginIp00724VatExclusionFlag;
            protected  int beginIp00724DupOptOutInd;
            protected  int beginIp00724IcaMcsystemFlag;
            protected  int beginIp00724Filler2;
	
	/**
	* Constructor for Ip00724CentralSiteFieldsSerialized
	**/
    public Ip00724CentralSiteFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00724CentralSiteFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724CentralSiteFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00724CentralSiteFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,105); // serialize this field at offset 105 by default 
    }
    
	/**
	* sets parent for this Ip00724CentralSiteFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 105 by default
    }    
	/**
	* initializes the field in Ip00724CentralSiteFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00724_CENTRAL_SITE_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00724JpnCustId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00724GamingPartcptnSw = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00724AckDtlPrsnmnt = getStartOffset() + 7;	// set offset for serialization
  
             beginIp00724AckDtlChgbk = getStartOffset() + 8;	// set offset for serialization
  
             beginIp00724AckDtlFeeColl = getStartOffset() + 9;	// set offset for serialization
  
             beginIp00724NotDtlPrsnmnt = getStartOffset() + 10;	// set offset for serialization
  
             beginIp00724NotDtlChgbk = getStartOffset() + 11;	// set offset for serialization
  
             beginIp00724NotDtlFeeColl = getStartOffset() + 12;	// set offset for serialization
  
             beginIp00724McSendPart = getStartOffset() + 13;	// set offset for serialization
  
             beginIp00724RegEcomOptoutSw = getStartOffset() + 14;	// set offset for serialization
  
             beginIp00724De54OptionInd = getStartOffset() + 15;	// set offset for serialization
  
             beginIp00724AcqAlmOptinFlag = getStartOffset() + 16;	// set offset for serialization
  
             beginIp00724VatExclusionFlag = getStartOffset() + 17;	// set offset for serialization
  
             beginIp00724DupOptOutInd = getStartOffset() + 18;	// set offset for serialization
  
             beginIp00724IcaMcsystemFlag = getStartOffset() + 19;	// set offset for serialization
  
             beginIp00724Filler2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00724JpnCustIdCounter = -1;
     public boolean isIp00724JpnCustIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724JpnCustIdCounter != sharedCounter;
         localIp00724JpnCustIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724JpnCustId
	 *	@return ip00724JpnCustId
	 */
	public char[]  getIp00724JpnCustIdString() {
	     return getCharArray(beginIp00724JpnCustId,IP_00724_JPN_CUST_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724JpnCustIdIsNumeric() {
	    return isNumeric(beginIp00724JpnCustId
	                    ,beginIp00724JpnCustId + IP_00724_JPN_CUST_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_JPN_CUST_ID_LEN = 6;
  	/**
	 * serializeIp00724JpnCustId
	 */
	protected void serializeIp00724JpnCustId(long ip00724JpnCustId) {
		 putNumber(beginIp00724JpnCustId,ip00724JpnCustId,IP_00724_JPN_CUST_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724JpnCustIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724JpnCustId
	 */
   	protected  long serializeIp00724JpnCustId(char[] value) {
	    long  ip00724JpnCustId;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724JpnCustId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00724JpnCustId
		       ,6
		      );
		 localIp00724JpnCustIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724JpnCustId;
    }

   protected long checkIp00724JpnCustIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724JpnCustId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00724JpnCustId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00724JpnCustId
			                 ,IP_00724_JPN_CUST_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724JpnCustId", beginIp00724JpnCustId,IP_00724_JPN_CUST_ID_LEN);
    }
   	}
     int localIp00724GamingPartcptnSwCounter = -1;
     public boolean isIp00724GamingPartcptnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724GamingPartcptnSwCounter != sharedCounter;
         localIp00724GamingPartcptnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_GAMING_PARTCPTN_SW_LEN = 1;
	/**
	 * 	serialize this Ip00724GamingPartcptnSw
	 */
   protected void serializeIp00724GamingPartcptnSw(char[] ip00724GamingPartcptnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724GamingPartcptnSw,0,getStringValue(),beginIp00724GamingPartcptnSw,IP_00724_GAMING_PARTCPTN_SW_LEN);
       localIp00724GamingPartcptnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724GamingPartcptnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724GamingPartcptnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724GamingPartcptnSw() {	 
   		return (substring(getStringValue(),beginIp00724GamingPartcptnSw,beginIp00724GamingPartcptnSw + IP_00724_GAMING_PARTCPTN_SW_LEN));
   	}
     int localIp00724AckDtlPrsnmntCounter = -1;
     public boolean isIp00724AckDtlPrsnmntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724AckDtlPrsnmntCounter != sharedCounter;
         localIp00724AckDtlPrsnmntCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ACK_DTL_PRSNMNT_LEN = 1;
	/**
	 * 	serialize this Ip00724AckDtlPrsnmnt
	 */
   protected void serializeIp00724AckDtlPrsnmnt(char[] ip00724AckDtlPrsnmnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724AckDtlPrsnmnt,0,getStringValue(),beginIp00724AckDtlPrsnmnt,IP_00724_ACK_DTL_PRSNMNT_LEN);
       localIp00724AckDtlPrsnmntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724AckDtlPrsnmntConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724AckDtlPrsnmnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724AckDtlPrsnmnt() {	 
   		return (substring(getStringValue(),beginIp00724AckDtlPrsnmnt,beginIp00724AckDtlPrsnmnt + IP_00724_ACK_DTL_PRSNMNT_LEN));
   	}
     int localIp00724AckDtlChgbkCounter = -1;
     public boolean isIp00724AckDtlChgbkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724AckDtlChgbkCounter != sharedCounter;
         localIp00724AckDtlChgbkCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ACK_DTL_CHGBK_LEN = 1;
	/**
	 * 	serialize this Ip00724AckDtlChgbk
	 */
   protected void serializeIp00724AckDtlChgbk(char[] ip00724AckDtlChgbk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724AckDtlChgbk,0,getStringValue(),beginIp00724AckDtlChgbk,IP_00724_ACK_DTL_CHGBK_LEN);
       localIp00724AckDtlChgbkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724AckDtlChgbkConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724AckDtlChgbk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724AckDtlChgbk() {	 
   		return (substring(getStringValue(),beginIp00724AckDtlChgbk,beginIp00724AckDtlChgbk + IP_00724_ACK_DTL_CHGBK_LEN));
   	}
     int localIp00724AckDtlFeeCollCounter = -1;
     public boolean isIp00724AckDtlFeeCollModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724AckDtlFeeCollCounter != sharedCounter;
         localIp00724AckDtlFeeCollCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ACK_DTL_FEE_COLL_LEN = 1;
	/**
	 * 	serialize this Ip00724AckDtlFeeColl
	 */
   protected void serializeIp00724AckDtlFeeColl(char[] ip00724AckDtlFeeColl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724AckDtlFeeColl,0,getStringValue(),beginIp00724AckDtlFeeColl,IP_00724_ACK_DTL_FEE_COLL_LEN);
       localIp00724AckDtlFeeCollCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724AckDtlFeeCollConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724AckDtlFeeColl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724AckDtlFeeColl() {	 
   		return (substring(getStringValue(),beginIp00724AckDtlFeeColl,beginIp00724AckDtlFeeColl + IP_00724_ACK_DTL_FEE_COLL_LEN));
   	}
     int localIp00724NotDtlPrsnmntCounter = -1;
     public boolean isIp00724NotDtlPrsnmntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724NotDtlPrsnmntCounter != sharedCounter;
         localIp00724NotDtlPrsnmntCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_NOT_DTL_PRSNMNT_LEN = 1;
	/**
	 * 	serialize this Ip00724NotDtlPrsnmnt
	 */
   protected void serializeIp00724NotDtlPrsnmnt(char[] ip00724NotDtlPrsnmnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724NotDtlPrsnmnt,0,getStringValue(),beginIp00724NotDtlPrsnmnt,IP_00724_NOT_DTL_PRSNMNT_LEN);
       localIp00724NotDtlPrsnmntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724NotDtlPrsnmntConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724NotDtlPrsnmnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724NotDtlPrsnmnt() {	 
   		return (substring(getStringValue(),beginIp00724NotDtlPrsnmnt,beginIp00724NotDtlPrsnmnt + IP_00724_NOT_DTL_PRSNMNT_LEN));
   	}
     int localIp00724NotDtlChgbkCounter = -1;
     public boolean isIp00724NotDtlChgbkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724NotDtlChgbkCounter != sharedCounter;
         localIp00724NotDtlChgbkCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_NOT_DTL_CHGBK_LEN = 1;
	/**
	 * 	serialize this Ip00724NotDtlChgbk
	 */
   protected void serializeIp00724NotDtlChgbk(char[] ip00724NotDtlChgbk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724NotDtlChgbk,0,getStringValue(),beginIp00724NotDtlChgbk,IP_00724_NOT_DTL_CHGBK_LEN);
       localIp00724NotDtlChgbkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724NotDtlChgbkConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724NotDtlChgbk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724NotDtlChgbk() {	 
   		return (substring(getStringValue(),beginIp00724NotDtlChgbk,beginIp00724NotDtlChgbk + IP_00724_NOT_DTL_CHGBK_LEN));
   	}
     int localIp00724NotDtlFeeCollCounter = -1;
     public boolean isIp00724NotDtlFeeCollModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724NotDtlFeeCollCounter != sharedCounter;
         localIp00724NotDtlFeeCollCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_NOT_DTL_FEE_COLL_LEN = 1;
	/**
	 * 	serialize this Ip00724NotDtlFeeColl
	 */
   protected void serializeIp00724NotDtlFeeColl(char[] ip00724NotDtlFeeColl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724NotDtlFeeColl,0,getStringValue(),beginIp00724NotDtlFeeColl,IP_00724_NOT_DTL_FEE_COLL_LEN);
       localIp00724NotDtlFeeCollCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724NotDtlFeeCollConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724NotDtlFeeColl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724NotDtlFeeColl() {	 
   		return (substring(getStringValue(),beginIp00724NotDtlFeeColl,beginIp00724NotDtlFeeColl + IP_00724_NOT_DTL_FEE_COLL_LEN));
   	}
     int localIp00724McSendPartCounter = -1;
     public boolean isIp00724McSendPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724McSendPartCounter != sharedCounter;
         localIp00724McSendPartCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_MC_SEND_PART_LEN = 1;
	/**
	 * 	serialize this Ip00724McSendPart
	 */
   protected void serializeIp00724McSendPart(char[] ip00724McSendPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724McSendPart,0,getStringValue(),beginIp00724McSendPart,IP_00724_MC_SEND_PART_LEN);
       localIp00724McSendPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724McSendPartConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724McSendPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724McSendPart() {	 
   		return (substring(getStringValue(),beginIp00724McSendPart,beginIp00724McSendPart + IP_00724_MC_SEND_PART_LEN));
   	}
     int localIp00724RegEcomOptoutSwCounter = -1;
     public boolean isIp00724RegEcomOptoutSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724RegEcomOptoutSwCounter != sharedCounter;
         localIp00724RegEcomOptoutSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_REG_ECOM_OPTOUT_SW_LEN = 1;
	/**
	 * 	serialize this Ip00724RegEcomOptoutSw
	 */
   protected void serializeIp00724RegEcomOptoutSw(char[] ip00724RegEcomOptoutSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724RegEcomOptoutSw,0,getStringValue(),beginIp00724RegEcomOptoutSw,IP_00724_REG_ECOM_OPTOUT_SW_LEN);
       localIp00724RegEcomOptoutSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724RegEcomOptoutSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724RegEcomOptoutSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724RegEcomOptoutSw() {	 
   		return (substring(getStringValue(),beginIp00724RegEcomOptoutSw,beginIp00724RegEcomOptoutSw + IP_00724_REG_ECOM_OPTOUT_SW_LEN));
   	}
     int localIp00724De54OptionIndCounter = -1;
     public boolean isIp00724De54OptionIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724De54OptionIndCounter != sharedCounter;
         localIp00724De54OptionIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_DE_54_OPTION_IND_LEN = 1;
	/**
	 * 	serialize this Ip00724De54OptionInd
	 */
   protected void serializeIp00724De54OptionInd(char[] ip00724De54OptionInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724De54OptionInd,0,getStringValue(),beginIp00724De54OptionInd,IP_00724_DE_54_OPTION_IND_LEN);
       localIp00724De54OptionIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724De54OptionIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724De54OptionInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724De54OptionInd() {	 
   		return (substring(getStringValue(),beginIp00724De54OptionInd,beginIp00724De54OptionInd + IP_00724_DE_54_OPTION_IND_LEN));
   	}
     int localIp00724AcqAlmOptinFlagCounter = -1;
     public boolean isIp00724AcqAlmOptinFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724AcqAlmOptinFlagCounter != sharedCounter;
         localIp00724AcqAlmOptinFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ACQ_ALM_OPTIN_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip00724AcqAlmOptinFlag
	 */
   protected void serializeIp00724AcqAlmOptinFlag(char[] ip00724AcqAlmOptinFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724AcqAlmOptinFlag,0,getStringValue(),beginIp00724AcqAlmOptinFlag,IP_00724_ACQ_ALM_OPTIN_FLAG_LEN);
       localIp00724AcqAlmOptinFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724AcqAlmOptinFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724AcqAlmOptinFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724AcqAlmOptinFlag() {	 
   		return (substring(getStringValue(),beginIp00724AcqAlmOptinFlag,beginIp00724AcqAlmOptinFlag + IP_00724_ACQ_ALM_OPTIN_FLAG_LEN));
   	}
     int localIp00724VatExclusionFlagCounter = -1;
     public boolean isIp00724VatExclusionFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724VatExclusionFlagCounter != sharedCounter;
         localIp00724VatExclusionFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_VAT_EXCLUSION_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip00724VatExclusionFlag
	 */
   protected void serializeIp00724VatExclusionFlag(char[] ip00724VatExclusionFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724VatExclusionFlag,0,getStringValue(),beginIp00724VatExclusionFlag,IP_00724_VAT_EXCLUSION_FLAG_LEN);
       localIp00724VatExclusionFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724VatExclusionFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724VatExclusionFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724VatExclusionFlag() {	 
   		return (substring(getStringValue(),beginIp00724VatExclusionFlag,beginIp00724VatExclusionFlag + IP_00724_VAT_EXCLUSION_FLAG_LEN));
   	}
     int localIp00724DupOptOutIndCounter = -1;
     public boolean isIp00724DupOptOutIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724DupOptOutIndCounter != sharedCounter;
         localIp00724DupOptOutIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_DUP_OPT_OUT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00724DupOptOutInd
	 */
   protected void serializeIp00724DupOptOutInd(char[] ip00724DupOptOutInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724DupOptOutInd,0,getStringValue(),beginIp00724DupOptOutInd,IP_00724_DUP_OPT_OUT_IND_LEN);
       localIp00724DupOptOutIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724DupOptOutIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724DupOptOutInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724DupOptOutInd() {	 
   		return (substring(getStringValue(),beginIp00724DupOptOutInd,beginIp00724DupOptOutInd + IP_00724_DUP_OPT_OUT_IND_LEN));
   	}
     int localIp00724IcaMcsystemFlagCounter = -1;
     public boolean isIp00724IcaMcsystemFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IcaMcsystemFlagCounter != sharedCounter;
         localIp00724IcaMcsystemFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ICA_MCSYSTEM_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip00724IcaMcsystemFlag
	 */
   protected void serializeIp00724IcaMcsystemFlag(char[] ip00724IcaMcsystemFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724IcaMcsystemFlag,0,getStringValue(),beginIp00724IcaMcsystemFlag,IP_00724_ICA_MCSYSTEM_FLAG_LEN);
       localIp00724IcaMcsystemFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724IcaMcsystemFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724IcaMcsystemFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724IcaMcsystemFlag() {	 
   		return (substring(getStringValue(),beginIp00724IcaMcsystemFlag,beginIp00724IcaMcsystemFlag + IP_00724_ICA_MCSYSTEM_FLAG_LEN));
   	}
     int localIp00724Filler2Counter = -1;
     public boolean isIp00724Filler2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724Filler2Counter != sharedCounter;
         localIp00724Filler2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_FILLER_2_LEN = 1;
	/**
	 * 	serialize this Ip00724Filler2
	 */
   protected void serializeIp00724Filler2(char[] ip00724Filler2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724Filler2,0,getStringValue(),beginIp00724Filler2,IP_00724_FILLER_2_LEN);
       localIp00724Filler2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724Filler2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724Filler2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724Filler2() {	 
   		return (substring(getStringValue(),beginIp00724Filler2,beginIp00724Filler2 + IP_00724_FILLER_2_LEN));
   	}




}
  
