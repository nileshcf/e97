package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00002TableIdDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00002TableIdDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00002TableIdDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00002_TABLE_ID_DATA_LENGTH = 240;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00002TableIdInfo;
            protected  int beginIp00002TableKeyLngth;
            protected  int beginIp00002TblSubId;
	
	/**
	* Constructor for Ip00002TableIdDataSerialized
	**/
    public Ip00002TableIdDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00002TableIdDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00002TableIdDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00002TableIdDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip00002TableIdDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip00002TableIdDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00002_TABLE_ID_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00002TableIdInfo = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00002TableKeyLngth = getStartOffset() + 36;	// set offset for serialization
  
             beginIp00002TblSubId = getStartOffset() + 224;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00002TableIdInfoCounter = -1;
     public boolean isIp00002TableIdInfoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00002TableIdInfoCounter != sharedCounter;
         localIp00002TableIdInfoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00002_TABLE_ID_INFO_LEN = 8;
	/**
	 * 	serialize this Ip00002TableIdInfo
	 */
   protected void serializeIp00002TableIdInfo(char[] ip00002TableIdInfo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00002TableIdInfo,0,getStringValue(),beginIp00002TableIdInfo,IP_00002_TABLE_ID_INFO_LEN);
       localIp00002TableIdInfoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00002TableIdInfoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp00002TableIdInfo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00002TableIdInfo() {	 
   		return (substring(getStringValue(),beginIp00002TableIdInfo,beginIp00002TableIdInfo + IP_00002_TABLE_ID_INFO_LEN));
   	}
     int localIp00002TableKeyLngthCounter = -1;
     public boolean isIp00002TableKeyLngthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00002TableKeyLngthCounter != sharedCounter;
         localIp00002TableKeyLngthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00002TableKeyLngth
	 *	@return ip00002TableKeyLngth
	 */
	public char[]  getIp00002TableKeyLngthString() {
	     return getCharArray(beginIp00002TableKeyLngth,IP_00002_TABLE_KEY_LNGTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00002TableKeyLngthIsNumeric() {
	    return isNumeric(beginIp00002TableKeyLngth
	                    ,beginIp00002TableKeyLngth + IP_00002_TABLE_KEY_LNGTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00002_TABLE_KEY_LNGTH_LEN = 5;
  	/**
	 * serializeIp00002TableKeyLngth
	 */
	protected void serializeIp00002TableKeyLngth(long ip00002TableKeyLngth) {
		 putNumber(beginIp00002TableKeyLngth,ip00002TableKeyLngth,IP_00002_TABLE_KEY_LNGTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00002TableKeyLngthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00002TableKeyLngth
	 */
   	protected  long serializeIp00002TableKeyLngth(char[] value) {
	    long  ip00002TableKeyLngth;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00002TableKeyLngth = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp00002TableKeyLngth
		       ,5
		      );
		 localIp00002TableKeyLngthCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00002TableKeyLngth;
    }

   protected long checkIp00002TableKeyLngthMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00002TableKeyLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00002TableKeyLngth() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00002TableKeyLngth
			                 ,IP_00002_TABLE_KEY_LNGTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00002TableKeyLngth", beginIp00002TableKeyLngth,IP_00002_TABLE_KEY_LNGTH_LEN);
    }
   	}
     int localIp00002TblSubIdCounter = -1;
     public boolean isIp00002TblSubIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00002TblSubIdCounter != sharedCounter;
         localIp00002TblSubIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00002_TBL_SUB_ID_LEN = 3;
	/**
	 * 	serialize this Ip00002TblSubId
	 */
   protected void serializeIp00002TblSubId(char[] ip00002TblSubId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00002TblSubId,0,getStringValue(),beginIp00002TblSubId,IP_00002_TBL_SUB_ID_LEN);
       localIp00002TblSubIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00002TblSubIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00002TblSubId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00002TblSubId() {	 
   		return (substring(getStringValue(),beginIp00002TblSubId,beginIp00002TblSubId + IP_00002_TBL_SUB_ID_LEN));
   	}




}
  
