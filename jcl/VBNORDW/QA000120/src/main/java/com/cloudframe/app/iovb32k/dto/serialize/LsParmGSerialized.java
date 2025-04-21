package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class LsParmGSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsParmGSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParmGSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_G_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParmMode;
            protected  int beginLsParmDataLenMin;
            protected  int beginLsParmDataLenMax;
	
	/**
	* Constructor for LsParmGSerialized
	**/
    public LsParmGSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LsParmGSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsParmGSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LsParmGSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this LsParmGSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in LsParmGSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_G_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParmMode = getStartOffset() + 0;	// set offset for serialization
  
  
             beginLsParmDataLenMin = getStartOffset() + 2;	// set offset for serialization
  
  
             beginLsParmDataLenMax = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsParmModeCounter = -1;
     public boolean isLsParmModeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsParmModeCounter != sharedCounter;
         localLsParmModeCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_PARM_MODE_LEN = 1;
	/**
	 * 	serialize this LsParmMode
	 */
   protected void serializeLsParmMode(char[] lsParmMode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsParmMode,0,getStringValue(),beginLsParmMode,LS_PARM_MODE_LEN);
       localLsParmModeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsParmModeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsParmMode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsParmMode() {	 
   		return (substring(getStringValue(),beginLsParmMode,beginLsParmMode + LS_PARM_MODE_LEN));
   	}
     int localLsParmDataLenMinCounter = -1;
     public boolean isLsParmDataLenMinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsParmDataLenMinCounter != sharedCounter;
         localLsParmDataLenMinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsParmDataLenMin
	 *	@return lsParmDataLenMin
	 */
	public char[]  getLsParmDataLenMinString() {
	     return getCharArray(beginLsParmDataLenMin,LS_PARM_DATA_LEN_MIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsParmDataLenMinIsNumeric() {
	    return isNumeric(beginLsParmDataLenMin
	                    ,beginLsParmDataLenMin + LS_PARM_DATA_LEN_MIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_PARM_DATA_LEN_MIN_LEN = 5;
  	/**
	 * serializeLsParmDataLenMin
	 */
	protected void serializeLsParmDataLenMin(long lsParmDataLenMin) {
		 putNumber(beginLsParmDataLenMin,lsParmDataLenMin,LS_PARM_DATA_LEN_MIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsParmDataLenMinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsParmDataLenMin
	 */
   	protected  long serializeLsParmDataLenMin(char[] value) {
	    long  lsParmDataLenMin;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsParmDataLenMin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginLsParmDataLenMin
		       ,5
		      );
		 localLsParmDataLenMinCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsParmDataLenMin;
    }

   protected long checkLsParmDataLenMinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsParmDataLenMin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsParmDataLenMin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsParmDataLenMin
			                 ,LS_PARM_DATA_LEN_MIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsParmDataLenMin", beginLsParmDataLenMin,LS_PARM_DATA_LEN_MIN_LEN);
    }
   	}
     int localLsParmDataLenMaxCounter = -1;
     public boolean isLsParmDataLenMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsParmDataLenMaxCounter != sharedCounter;
         localLsParmDataLenMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsParmDataLenMax
	 *	@return lsParmDataLenMax
	 */
	public char[]  getLsParmDataLenMaxString() {
	     return getCharArray(beginLsParmDataLenMax,LS_PARM_DATA_LEN_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsParmDataLenMaxIsNumeric() {
	    return isNumeric(beginLsParmDataLenMax
	                    ,beginLsParmDataLenMax + LS_PARM_DATA_LEN_MAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_PARM_DATA_LEN_MAX_LEN = 5;
  	/**
	 * serializeLsParmDataLenMax
	 */
	protected void serializeLsParmDataLenMax(long lsParmDataLenMax) {
		 putNumber(beginLsParmDataLenMax,lsParmDataLenMax,LS_PARM_DATA_LEN_MAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsParmDataLenMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsParmDataLenMax
	 */
   	protected  long serializeLsParmDataLenMax(char[] value) {
	    long  lsParmDataLenMax;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsParmDataLenMax = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginLsParmDataLenMax
		       ,5
		      );
		 localLsParmDataLenMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsParmDataLenMax;
    }

   protected long checkLsParmDataLenMaxMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsParmDataLenMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsParmDataLenMax() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsParmDataLenMax
			                 ,LS_PARM_DATA_LEN_MAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsParmDataLenMax", beginLsParmDataLenMax,LS_PARM_DATA_LEN_MAX_LEN);
    }
   	}




}
  
