package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeConvInputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeConvInputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeConvInputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CONV_INPUT_AREA_LENGTH = 23;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeConvType;
	
	/**
	* Constructor for CmnTimeConvInputAreaSerialized
	**/
    public CmnTimeConvInputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeConvInputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeConvInputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeConvInputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnTimeConvInputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnTimeConvInputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CONV_INPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeConvType = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnTimeConvTypeCounter = -1;
     public boolean isCmnTimeConvTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeConvTypeCounter != sharedCounter;
         localCmnTimeConvTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeConvType
	 *	@return cmnTimeConvType
	 */
	public char[]  getCmnTimeConvTypeString() {
	     return getCharArray(beginCmnTimeConvType,CMN_TIME_CONV_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeConvTypeIsNumeric() {
	    return isNumeric(beginCmnTimeConvType
	                    ,beginCmnTimeConvType + CMN_TIME_CONV_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CONV_TYPE_LEN = 1;
  	/**
	 * serializeCmnTimeConvType
	 */
	protected void serializeCmnTimeConvType(int cmnTimeConvType) {
		 putNumber(beginCmnTimeConvType,cmnTimeConvType,CMN_TIME_CONV_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeConvTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeConvType
	 */
   	protected  int serializeCmnTimeConvType(char[] value) {
	    int  cmnTimeConvType;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeConvType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnTimeConvType
		       ,1
		      );
		 localCmnTimeConvTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeConvType;
    }

   protected int checkCmnTimeConvTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeConvType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeConvType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeConvType
			                 ,CMN_TIME_CONV_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeConvType", beginCmnTimeConvType,CMN_TIME_CONV_TYPE_LEN);
    }
   	}




}
  
