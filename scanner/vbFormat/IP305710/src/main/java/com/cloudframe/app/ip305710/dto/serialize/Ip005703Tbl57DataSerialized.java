package com.cloudframe.app.ip305710.dto.serialize;

/**
*  The class Ip005703Tbl57DataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip005703Tbl57DataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip005703Tbl57DataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_005703_TBL_57_DATA_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp005703ProdClass;
            protected  int beginIp005703CabCode;
            protected  int beginIp005703McAssgnId;
            protected  int beginIp005703OvrdePrtyNum;
            protected  int beginIp005703FeeCodePtr;
	
	/**
	* Constructor for Ip005703Tbl57DataSerialized
	**/
    public Ip005703Tbl57DataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip005703Tbl57DataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip005703Tbl57DataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip005703Tbl57DataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22); // serialize this field at offset 22 by default 
    }
    
	/**
	* sets parent for this Ip005703Tbl57DataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22 by default
    }    
	/**
	* initializes the field in Ip005703Tbl57DataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_005703_TBL_57_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp005703ProdClass = getStartOffset() + 0;	// set offset for serialization
  
             beginIp005703CabCode = getStartOffset() + 3;	// set offset for serialization
  
  
             beginIp005703McAssgnId = getStartOffset() + 7;	// set offset for serialization
  
             beginIp005703OvrdePrtyNum = getStartOffset() + 13;	// set offset for serialization
  
             beginIp005703FeeCodePtr = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp005703ProdClassCounter = -1;
     public boolean isIp005703ProdClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005703ProdClassCounter != sharedCounter;
         localIp005703ProdClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005703_PROD_CLASS_LEN = 3;
	/**
	 * 	serialize this Ip005703ProdClass
	 */
   protected void serializeIp005703ProdClass(char[] ip005703ProdClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005703ProdClass,0,getStringValue(),beginIp005703ProdClass,IP_005703_PROD_CLASS_LEN);
       localIp005703ProdClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005703ProdClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp005703ProdClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005703ProdClass() {	 
   		return (substring(getStringValue(),beginIp005703ProdClass,beginIp005703ProdClass + IP_005703_PROD_CLASS_LEN));
   	}
     int localIp005703CabCodeCounter = -1;
     public boolean isIp005703CabCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005703CabCodeCounter != sharedCounter;
         localIp005703CabCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005703_CAB_CODE_LEN = 4;
	/**
	 * 	serialize this Ip005703CabCode
	 */
   protected void serializeIp005703CabCode(char[] ip005703CabCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005703CabCode,0,getStringValue(),beginIp005703CabCode,IP_005703_CAB_CODE_LEN);
       localIp005703CabCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005703CabCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp005703CabCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005703CabCode() {	 
   		return (substring(getStringValue(),beginIp005703CabCode,beginIp005703CabCode + IP_005703_CAB_CODE_LEN));
   	}
     int localIp005703McAssgnIdCounter = -1;
     public boolean isIp005703McAssgnIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005703McAssgnIdCounter != sharedCounter;
         localIp005703McAssgnIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005703_MC_ASSGN_ID_LEN = 6;
	/**
	 * 	serialize this Ip005703McAssgnId
	 */
   protected void serializeIp005703McAssgnId(char[] ip005703McAssgnId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005703McAssgnId,0,getStringValue(),beginIp005703McAssgnId,IP_005703_MC_ASSGN_ID_LEN);
       localIp005703McAssgnIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005703McAssgnIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp005703McAssgnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005703McAssgnId() {	 
   		return (substring(getStringValue(),beginIp005703McAssgnId,beginIp005703McAssgnId + IP_005703_MC_ASSGN_ID_LEN));
   	}
     int localIp005703OvrdePrtyNumCounter = -1;
     public boolean isIp005703OvrdePrtyNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005703OvrdePrtyNumCounter != sharedCounter;
         localIp005703OvrdePrtyNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip005703OvrdePrtyNum
	 *	@return ip005703OvrdePrtyNum
	 */
	public char[]  getIp005703OvrdePrtyNumString() {
	     return getCharArray(beginIp005703OvrdePrtyNum,IP_005703_OVRDE_PRTY_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703OvrdePrtyNumIsNumeric() {
	    return isNumeric(beginIp005703OvrdePrtyNum
	                    ,beginIp005703OvrdePrtyNum + IP_005703_OVRDE_PRTY_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_005703_OVRDE_PRTY_NUM_LEN = 2;
  	/**
	 * serializeIp005703OvrdePrtyNum
	 */
	protected void serializeIp005703OvrdePrtyNum(int ip005703OvrdePrtyNum) {
		 putNumber(beginIp005703OvrdePrtyNum,ip005703OvrdePrtyNum,IP_005703_OVRDE_PRTY_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp005703OvrdePrtyNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp005703OvrdePrtyNum
	 */
   	protected  int serializeIp005703OvrdePrtyNum(char[] value) {
	    int  ip005703OvrdePrtyNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip005703OvrdePrtyNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp005703OvrdePrtyNum
		       ,2
		      );
		 localIp005703OvrdePrtyNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip005703OvrdePrtyNum;
    }

   protected int checkIp005703OvrdePrtyNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp005703OvrdePrtyNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp005703OvrdePrtyNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp005703OvrdePrtyNum
			                 ,IP_005703_OVRDE_PRTY_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip005703OvrdePrtyNum", beginIp005703OvrdePrtyNum,IP_005703_OVRDE_PRTY_NUM_LEN);
    }
   	}
     int localIp005703FeeCodePtrCounter = -1;
     public boolean isIp005703FeeCodePtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005703FeeCodePtrCounter != sharedCounter;
         localIp005703FeeCodePtrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip005703FeeCodePtr
	 *	@return ip005703FeeCodePtr
	 */
	public char[]  getIp005703FeeCodePtrString() {
	     return getCharArray(beginIp005703FeeCodePtr,IP_005703_FEE_CODE_PTR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703FeeCodePtrIsNumeric() {
	    return isNumeric(beginIp005703FeeCodePtr
	                    ,beginIp005703FeeCodePtr + IP_005703_FEE_CODE_PTR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_005703_FEE_CODE_PTR_LEN = 11;
  	/**
	 * serializeIp005703FeeCodePtr
	 */
	protected void serializeIp005703FeeCodePtr(long ip005703FeeCodePtr) {
		 putNumber(beginIp005703FeeCodePtr,ip005703FeeCodePtr,IP_005703_FEE_CODE_PTR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp005703FeeCodePtrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp005703FeeCodePtr
	 */
   	protected  long serializeIp005703FeeCodePtr(char[] value) {
	    long  ip005703FeeCodePtr;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip005703FeeCodePtr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp005703FeeCodePtr
		       ,11
		      );
		 localIp005703FeeCodePtrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip005703FeeCodePtr;
    }

   protected long checkIp005703FeeCodePtrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp005703FeeCodePtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp005703FeeCodePtr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp005703FeeCodePtr
			                 ,IP_005703_FEE_CODE_PTR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip005703FeeCodePtr", beginIp005703FeeCodePtr,IP_005703_FEE_CODE_PTR_LEN);
    }
   	}




}
  
