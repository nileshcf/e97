package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateConvInputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateConvInputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateConvInputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CONV_INPUT_AREA_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateConvType;
	
	/**
	* Constructor for CmnDateConvInputAreaSerialized
	**/
    public CmnDateConvInputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateConvInputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvInputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateConvInputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnDateConvInputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnDateConvInputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CONV_INPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateConvType = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateConvTypeCounter = -1;
     public boolean isCmnDateConvTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateConvTypeCounter != sharedCounter;
         localCmnDateConvTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateConvType
	 *	@return cmnDateConvType
	 */
	public char[]  getCmnDateConvTypeString() {
	     return getCharArray(beginCmnDateConvType,CMN_DATE_CONV_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateConvTypeIsNumeric() {
	    return isNumeric(beginCmnDateConvType
	                    ,beginCmnDateConvType + CMN_DATE_CONV_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CONV_TYPE_LEN = 1;
  	/**
	 * serializeCmnDateConvType
	 */
	protected void serializeCmnDateConvType(int cmnDateConvType) {
		 putNumber(beginCmnDateConvType,cmnDateConvType,CMN_DATE_CONV_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateConvTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateConvType
	 */
   	protected  int serializeCmnDateConvType(char[] value) {
	    int  cmnDateConvType;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateConvType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnDateConvType
		       ,1
		      );
		 localCmnDateConvTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateConvType;
    }

   protected int checkCmnDateConvTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateConvType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateConvType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateConvType
			                 ,CMN_DATE_CONV_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateConvType", beginCmnDateConvType,CMN_DATE_CONV_TYPE_LEN);
    }
   	}




}
  
