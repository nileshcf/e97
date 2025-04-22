package com.cloudframe.app.ip305710.dto.serialize;

/**
*  The class Ip005704Tbl57DataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip005704Tbl57DataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip005704Tbl57DataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_005704_TBL_57_DATA_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp005704ProdClass;
            protected  int beginIp005704CabCode;
            protected  int beginIp005704McAssgnId;
            protected  int beginIp005704OvrdePrtyNum;
            protected  int beginIp005704FeeCodePtr;
	
	/**
	* Constructor for Ip005704Tbl57DataSerialized
	**/
    public Ip005704Tbl57DataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip005704Tbl57DataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip005704Tbl57DataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip005704Tbl57DataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip005704Tbl57DataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip005704Tbl57DataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_005704_TBL_57_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp005704ProdClass = getStartOffset() + 0;	// set offset for serialization
  
             beginIp005704CabCode = getStartOffset() + 3;	// set offset for serialization
  
  
             beginIp005704McAssgnId = getStartOffset() + 7;	// set offset for serialization
  
             beginIp005704OvrdePrtyNum = getStartOffset() + 13;	// set offset for serialization
  
             beginIp005704FeeCodePtr = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp005704ProdClassCounter = -1;
     public boolean isIp005704ProdClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005704ProdClassCounter != sharedCounter;
         localIp005704ProdClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005704_PROD_CLASS_LEN = 3;
	/**
	 * 	serialize this Ip005704ProdClass
	 */
   protected void serializeIp005704ProdClass(char[] ip005704ProdClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005704ProdClass,0,getStringValue(),beginIp005704ProdClass,IP_005704_PROD_CLASS_LEN);
       localIp005704ProdClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005704ProdClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp005704ProdClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005704ProdClass() {	 
   		return (substring(getStringValue(),beginIp005704ProdClass,beginIp005704ProdClass + IP_005704_PROD_CLASS_LEN));
   	}
     int localIp005704CabCodeCounter = -1;
     public boolean isIp005704CabCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005704CabCodeCounter != sharedCounter;
         localIp005704CabCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005704_CAB_CODE_LEN = 4;
	/**
	 * 	serialize this Ip005704CabCode
	 */
   protected void serializeIp005704CabCode(char[] ip005704CabCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005704CabCode,0,getStringValue(),beginIp005704CabCode,IP_005704_CAB_CODE_LEN);
       localIp005704CabCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005704CabCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp005704CabCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005704CabCode() {	 
   		return (substring(getStringValue(),beginIp005704CabCode,beginIp005704CabCode + IP_005704_CAB_CODE_LEN));
   	}
     int localIp005704McAssgnIdCounter = -1;
     public boolean isIp005704McAssgnIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005704McAssgnIdCounter != sharedCounter;
         localIp005704McAssgnIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005704_MC_ASSGN_ID_LEN = 6;
	/**
	 * 	serialize this Ip005704McAssgnId
	 */
   protected void serializeIp005704McAssgnId(char[] ip005704McAssgnId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005704McAssgnId,0,getStringValue(),beginIp005704McAssgnId,IP_005704_MC_ASSGN_ID_LEN);
       localIp005704McAssgnIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005704McAssgnIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp005704McAssgnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005704McAssgnId() {	 
   		return (substring(getStringValue(),beginIp005704McAssgnId,beginIp005704McAssgnId + IP_005704_MC_ASSGN_ID_LEN));
   	}
     int localIp005704OvrdePrtyNumCounter = -1;
     public boolean isIp005704OvrdePrtyNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005704OvrdePrtyNumCounter != sharedCounter;
         localIp005704OvrdePrtyNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip005704OvrdePrtyNum
	 *	@return ip005704OvrdePrtyNum
	 */
	public char[]  getIp005704OvrdePrtyNumString() {
	     return getCharArray(beginIp005704OvrdePrtyNum,IP_005704_OVRDE_PRTY_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005704OvrdePrtyNumIsNumeric() {
	    return isNumeric(beginIp005704OvrdePrtyNum
	                    ,beginIp005704OvrdePrtyNum + IP_005704_OVRDE_PRTY_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_005704_OVRDE_PRTY_NUM_LEN = 2;
  	/**
	 * serializeIp005704OvrdePrtyNum
	 */
	protected void serializeIp005704OvrdePrtyNum(int ip005704OvrdePrtyNum) {
		 putNumber(beginIp005704OvrdePrtyNum,ip005704OvrdePrtyNum,IP_005704_OVRDE_PRTY_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp005704OvrdePrtyNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp005704OvrdePrtyNum
	 */
   	protected  int serializeIp005704OvrdePrtyNum(char[] value) {
	    int  ip005704OvrdePrtyNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip005704OvrdePrtyNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp005704OvrdePrtyNum
		       ,2
		      );
		 localIp005704OvrdePrtyNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip005704OvrdePrtyNum;
    }

   protected int checkIp005704OvrdePrtyNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp005704OvrdePrtyNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp005704OvrdePrtyNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp005704OvrdePrtyNum
			                 ,IP_005704_OVRDE_PRTY_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip005704OvrdePrtyNum", beginIp005704OvrdePrtyNum,IP_005704_OVRDE_PRTY_NUM_LEN);
    }
   	}
        int localIp005704FeeCodePtrCounter = -1;
        public boolean isIp005704FeeCodePtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp005704FeeCodePtrCounter != sharedCounter;
           localIp005704FeeCodePtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip005704FeeCodePtrIsNumeric() {
	      return decimalIsNumeric(beginIp005704FeeCodePtr,IP_005704_FEE_CODE_PTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_005704_FEE_CODE_PTR_LEN = 6;
  	/**
	 * 	serializeIp005704FeeCodePtr
	 */
	protected void serializeIp005704FeeCodePtr(long ip005704FeeCodePtr) {
		   putDecimal(beginIp005704FeeCodePtr,ip005704FeeCodePtr,IP_005704_FEE_CODE_PTR_LEN,false);
   }
   

   protected long checkIp005704FeeCodePtrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshIp005704FeeCodePtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp005704FeeCodePtr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginIp005704FeeCodePtr,IP_005704_FEE_CODE_PTR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip005704FeeCodePtr", beginIp005704FeeCodePtr,IP_005704_FEE_CODE_PTR_LEN);
     }
   	}




}
  
