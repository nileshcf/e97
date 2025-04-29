package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip90134EditGroupKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90134EditGroupKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90134EditGroupKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90134_EDIT_GROUP_KEY_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp90134EditGroup;
            protected  int beginIp90134AccBrand;
            protected  int beginIp90134ElementType;
            protected  int beginIp90134ElementNum;
            protected  int beginIp90134ElementSubNum;
            protected  int beginIp90134EditNumber;
	
	/**
	* Constructor for Ip90134EditGroupKeySerialized
	**/
    public Ip90134EditGroupKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip90134EditGroupKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90134EditGroupKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip90134EditGroupKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip90134EditGroupKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip90134EditGroupKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90134_EDIT_GROUP_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp90134EditGroup = getStartOffset() + 0;	// set offset for serialization
  
             beginIp90134AccBrand = getStartOffset() + 1;	// set offset for serialization
  
             beginIp90134ElementType = getStartOffset() + 4;	// set offset for serialization
  
             beginIp90134ElementNum = getStartOffset() + 5;	// set offset for serialization
  
             beginIp90134ElementSubNum = getStartOffset() + 9;	// set offset for serialization
  
             beginIp90134EditNumber = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp90134EditGroupCounter = -1;
     public boolean isIp90134EditGroupModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134EditGroupCounter != sharedCounter;
         localIp90134EditGroupCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_90134_EDIT_GROUP_LEN = 1;
	/**
	 * 	serialize this Ip90134EditGroup
	 */
   protected void serializeIp90134EditGroup(char[] ip90134EditGroup) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip90134EditGroup,0,getStringValue(),beginIp90134EditGroup,IP_90134_EDIT_GROUP_LEN);
       localIp90134EditGroupCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp90134EditGroupConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp90134EditGroup is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp90134EditGroup() {	 
   		return (substring(getStringValue(),beginIp90134EditGroup,beginIp90134EditGroup + IP_90134_EDIT_GROUP_LEN));
   	}
     int localIp90134AccBrandCounter = -1;
     public boolean isIp90134AccBrandModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134AccBrandCounter != sharedCounter;
         localIp90134AccBrandCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_90134_ACC_BRAND_LEN = 3;
	/**
	 * 	serialize this Ip90134AccBrand
	 */
   protected void serializeIp90134AccBrand(char[] ip90134AccBrand) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip90134AccBrand,0,getStringValue(),beginIp90134AccBrand,IP_90134_ACC_BRAND_LEN);
       localIp90134AccBrandCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp90134AccBrandConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp90134AccBrand is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp90134AccBrand() {	 
   		return (substring(getStringValue(),beginIp90134AccBrand,beginIp90134AccBrand + IP_90134_ACC_BRAND_LEN));
   	}
     int localIp90134ElementTypeCounter = -1;
     public boolean isIp90134ElementTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134ElementTypeCounter != sharedCounter;
         localIp90134ElementTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90134ElementType
	 *	@return ip90134ElementType
	 */
	public char[]  getIp90134ElementTypeString() {
	     return getCharArray(beginIp90134ElementType,IP_90134_ELEMENT_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134ElementTypeIsNumeric() {
	    return isNumeric(beginIp90134ElementType
	                    ,beginIp90134ElementType + IP_90134_ELEMENT_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90134_ELEMENT_TYPE_LEN = 1;
  	/**
	 * serializeIp90134ElementType
	 */
	protected void serializeIp90134ElementType(int ip90134ElementType) {
		 putNumber(beginIp90134ElementType,ip90134ElementType,IP_90134_ELEMENT_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90134ElementTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90134ElementType
	 */
   	protected  int serializeIp90134ElementType(char[] value) {
	    int  ip90134ElementType;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90134ElementType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp90134ElementType
		       ,1
		      );
		 localIp90134ElementTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90134ElementType;
    }

   protected int checkIp90134ElementTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90134ElementType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90134ElementType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90134ElementType
			                 ,IP_90134_ELEMENT_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90134ElementType", beginIp90134ElementType,IP_90134_ELEMENT_TYPE_LEN);
    }
   	}
     int localIp90134ElementNumCounter = -1;
     public boolean isIp90134ElementNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134ElementNumCounter != sharedCounter;
         localIp90134ElementNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90134ElementNum
	 *	@return ip90134ElementNum
	 */
	public char[]  getIp90134ElementNumString() {
	     return getCharArray(beginIp90134ElementNum,IP_90134_ELEMENT_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134ElementNumIsNumeric() {
	    return isNumeric(beginIp90134ElementNum
	                    ,beginIp90134ElementNum + IP_90134_ELEMENT_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90134_ELEMENT_NUM_LEN = 4;
  	/**
	 * serializeIp90134ElementNum
	 */
	protected void serializeIp90134ElementNum(int ip90134ElementNum) {
		 putNumber(beginIp90134ElementNum,ip90134ElementNum,IP_90134_ELEMENT_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90134ElementNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90134ElementNum
	 */
   	protected  int serializeIp90134ElementNum(char[] value) {
	    int  ip90134ElementNum;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90134ElementNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp90134ElementNum
		       ,4
		      );
		 localIp90134ElementNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90134ElementNum;
    }

   protected int checkIp90134ElementNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90134ElementNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90134ElementNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90134ElementNum
			                 ,IP_90134_ELEMENT_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90134ElementNum", beginIp90134ElementNum,IP_90134_ELEMENT_NUM_LEN);
    }
   	}
     int localIp90134ElementSubNumCounter = -1;
     public boolean isIp90134ElementSubNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134ElementSubNumCounter != sharedCounter;
         localIp90134ElementSubNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90134ElementSubNum
	 *	@return ip90134ElementSubNum
	 */
	public char[]  getIp90134ElementSubNumString() {
	     return getCharArray(beginIp90134ElementSubNum,IP_90134_ELEMENT_SUB_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134ElementSubNumIsNumeric() {
	    return isNumeric(beginIp90134ElementSubNum
	                    ,beginIp90134ElementSubNum + IP_90134_ELEMENT_SUB_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90134_ELEMENT_SUB_NUM_LEN = 2;
  	/**
	 * serializeIp90134ElementSubNum
	 */
	protected void serializeIp90134ElementSubNum(int ip90134ElementSubNum) {
		 putNumber(beginIp90134ElementSubNum,ip90134ElementSubNum,IP_90134_ELEMENT_SUB_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90134ElementSubNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90134ElementSubNum
	 */
   	protected  int serializeIp90134ElementSubNum(char[] value) {
	    int  ip90134ElementSubNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90134ElementSubNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp90134ElementSubNum
		       ,2
		      );
		 localIp90134ElementSubNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90134ElementSubNum;
    }

   protected int checkIp90134ElementSubNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90134ElementSubNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90134ElementSubNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90134ElementSubNum
			                 ,IP_90134_ELEMENT_SUB_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90134ElementSubNum", beginIp90134ElementSubNum,IP_90134_ELEMENT_SUB_NUM_LEN);
    }
   	}
     int localIp90134EditNumberCounter = -1;
     public boolean isIp90134EditNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134EditNumberCounter != sharedCounter;
         localIp90134EditNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90134EditNumber
	 *	@return ip90134EditNumber
	 */
	public char[]  getIp90134EditNumberString() {
	     return getCharArray(beginIp90134EditNumber,IP_90134_EDIT_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134EditNumberIsNumeric() {
	    return isNumeric(beginIp90134EditNumber
	                    ,beginIp90134EditNumber + IP_90134_EDIT_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90134_EDIT_NUMBER_LEN = 4;
  	/**
	 * serializeIp90134EditNumber
	 */
	protected void serializeIp90134EditNumber(int ip90134EditNumber) {
		 putNumber(beginIp90134EditNumber,ip90134EditNumber,IP_90134_EDIT_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90134EditNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90134EditNumber
	 */
   	protected  int serializeIp90134EditNumber(char[] value) {
	    int  ip90134EditNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90134EditNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp90134EditNumber
		       ,4
		      );
		 localIp90134EditNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90134EditNumber;
    }

   protected int checkIp90134EditNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90134EditNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90134EditNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90134EditNumber
			                 ,IP_90134_EDIT_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90134EditNumber", beginIp90134EditNumber,IP_90134_EDIT_NUMBER_LEN);
    }
   	}




}
  
