package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip2ooo1ErrorInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip2ooo1ErrorInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip2ooo1ErrorInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_2OOO_1_ERROR_INFO_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp2ooo1ErrorMsgNumber;
            protected  int beginIp2ooo1IpmFieldType;
            protected  int beginIp2ooo1IpmFieldNumber;
            protected  int beginIp2ooo1IpmSubfldNumber;
	
	/**
	* Constructor for Ip2ooo1ErrorInfoSerialized
	**/
    public Ip2ooo1ErrorInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip2ooo1ErrorInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip2ooo1ErrorInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip2ooo1ErrorInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip2ooo1ErrorInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_2OOO_1_ERROR_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp2ooo1ErrorMsgNumber = getStartOffset() + 6;	// set offset for serialization
  
             beginIp2ooo1IpmFieldType = getStartOffset() + 10;	// set offset for serialization
  
             beginIp2ooo1IpmFieldNumber = getStartOffset() + 11;	// set offset for serialization
  
             beginIp2ooo1IpmSubfldNumber = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp2ooo1ErrorMsgNumberCounter = -1;
     public boolean isIp2ooo1ErrorMsgNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp2ooo1ErrorMsgNumberCounter != sharedCounter;
         localIp2ooo1ErrorMsgNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip2ooo1ErrorMsgNumber
	 *	@return ip2ooo1ErrorMsgNumber
	 */
	public char[]  getIp2ooo1ErrorMsgNumberString() {
	     return getCharArray(beginIp2ooo1ErrorMsgNumber,IP_2OOO_1_ERROR_MSG_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorMsgNumberIsNumeric() {
	    return isNumeric(beginIp2ooo1ErrorMsgNumber
	                    ,beginIp2ooo1ErrorMsgNumber + IP_2OOO_1_ERROR_MSG_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_2OOO_1_ERROR_MSG_NUMBER_LEN = 4;
  	/**
	 * serializeIp2ooo1ErrorMsgNumber
	 */
	protected void serializeIp2ooo1ErrorMsgNumber(int ip2ooo1ErrorMsgNumber) {
		 putNumber(beginIp2ooo1ErrorMsgNumber,ip2ooo1ErrorMsgNumber,IP_2OOO_1_ERROR_MSG_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp2ooo1ErrorMsgNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp2ooo1ErrorMsgNumber
	 */
   	protected  int serializeIp2ooo1ErrorMsgNumber(char[] value) {
	    int  ip2ooo1ErrorMsgNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip2ooo1ErrorMsgNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp2ooo1ErrorMsgNumber
		       ,4
		      );
		 localIp2ooo1ErrorMsgNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip2ooo1ErrorMsgNumber;
    }

   protected int checkIp2ooo1ErrorMsgNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp2ooo1ErrorMsgNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp2ooo1ErrorMsgNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp2ooo1ErrorMsgNumber
			                 ,IP_2OOO_1_ERROR_MSG_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip2ooo1ErrorMsgNumber", beginIp2ooo1ErrorMsgNumber,IP_2OOO_1_ERROR_MSG_NUMBER_LEN);
    }
   	}
     int localIp2ooo1IpmFieldTypeCounter = -1;
     public boolean isIp2ooo1IpmFieldTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp2ooo1IpmFieldTypeCounter != sharedCounter;
         localIp2ooo1IpmFieldTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_2OOO_1_IPM_FIELD_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip2ooo1IpmFieldType
	 */
   protected void serializeIp2ooo1IpmFieldType(char[] ip2ooo1IpmFieldType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip2ooo1IpmFieldType,0,getStringValue(),beginIp2ooo1IpmFieldType,IP_2OOO_1_IPM_FIELD_TYPE_LEN);
       localIp2ooo1IpmFieldTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp2ooo1IpmFieldTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp2ooo1IpmFieldType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp2ooo1IpmFieldType() {	 
   		return (substring(getStringValue(),beginIp2ooo1IpmFieldType,beginIp2ooo1IpmFieldType + IP_2OOO_1_IPM_FIELD_TYPE_LEN));
   	}
         int localIp2ooo1IpmFieldNumberCounter = -1;
         public boolean isIp2ooo1IpmFieldNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp2ooo1IpmFieldNumberCounter != sharedCounter;
            localIp2ooo1IpmFieldNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_2OOO_1_IPM_FIELD_NUMBER_LEN = 4;
  	/**
	 * serializeIp2ooo1IpmFieldNumber
	 */
	protected void serializeIp2ooo1IpmFieldNumber(long ip2ooo1IpmFieldNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip2ooo1IpmFieldNumber,IP_2OOO_1_IPM_FIELD_NUMBER_LEN)
                  ,beginIp2ooo1IpmFieldNumber
                  ,IP_2OOO_1_IPM_FIELD_NUMBER_LEN
                 );
            localIp2ooo1IpmFieldNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp2ooo1IpmFieldNumberMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp2ooo1IpmFieldNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp2ooo1IpmFieldNumber() {	 
			return (getUnsignedInt(beginIp2ooo1IpmFieldNumber));
   	}
         int localIp2ooo1IpmSubfldNumberCounter = -1;
         public boolean isIp2ooo1IpmSubfldNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp2ooo1IpmSubfldNumberCounter != sharedCounter;
            localIp2ooo1IpmSubfldNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_2OOO_1_IPM_SUBFLD_NUMBER_LEN = 4;
  	/**
	 * serializeIp2ooo1IpmSubfldNumber
	 */
	protected void serializeIp2ooo1IpmSubfldNumber(long ip2ooo1IpmSubfldNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip2ooo1IpmSubfldNumber,IP_2OOO_1_IPM_SUBFLD_NUMBER_LEN)
                  ,beginIp2ooo1IpmSubfldNumber
                  ,IP_2OOO_1_IPM_SUBFLD_NUMBER_LEN
                 );
            localIp2ooo1IpmSubfldNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp2ooo1IpmSubfldNumberMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp2ooo1IpmSubfldNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp2ooo1IpmSubfldNumber() {	 
			return (getUnsignedInt(beginIp2ooo1IpmSubfldNumber));
   	}




}
  
