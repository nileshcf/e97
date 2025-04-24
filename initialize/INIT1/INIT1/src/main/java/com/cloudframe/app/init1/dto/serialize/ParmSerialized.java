package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmType;
            protected  int beginParmIdentifier;
            protected  int beginParmThreshold;
	
	/**
	* Constructor for ParmSerialized
	**/
    public ParmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ParmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ParmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,594); // serialize this field at offset 594 by default 
    }
    
	/**
	* sets parent for this ParmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 594 by default
    }    
	/**
	* initializes the field in ParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmType = getStartOffset() + 0;	// set offset for serialization
  
             beginParmIdentifier = getStartOffset() + 3;	// set offset for serialization
  
             beginParmThreshold = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParmTypeCounter = -1;
     public boolean isParmTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmTypeCounter != sharedCounter;
         localParmTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_TYPE_LEN = 3;
	/**
	 * 	serialize this ParmType
	 */
   protected void serializeParmType(char[] parmType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmType,0,getStringValue(),beginParmType,PARM_TYPE_LEN);
       localParmTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshParmType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmType() {	 
   		return (substring(getStringValue(),beginParmType,beginParmType + PARM_TYPE_LEN));
   	}
     int localParmIdentifierCounter = -1;
     public boolean isParmIdentifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmIdentifierCounter != sharedCounter;
         localParmIdentifierCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_IDENTIFIER_LEN = 3;
	/**
	 * 	serialize this ParmIdentifier
	 */
   protected void serializeParmIdentifier(char[] parmIdentifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmIdentifier,0,getStringValue(),beginParmIdentifier,PARM_IDENTIFIER_LEN);
       localParmIdentifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmIdentifierConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshParmIdentifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmIdentifier() {	 
   		return (substring(getStringValue(),beginParmIdentifier,beginParmIdentifier + PARM_IDENTIFIER_LEN));
   	}
     int localParmThresholdCounter = -1;
     public boolean isParmThresholdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmThresholdCounter != sharedCounter;
         localParmThresholdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of parmThreshold
	 *	@return parmThreshold
	 */
	public char[]  getParmThresholdString() {
	     return getCharArray(beginParmThreshold,PARM_THRESHOLD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmThresholdIsNumeric() {
	    return isNumeric(beginParmThreshold
	                    ,beginParmThreshold + PARM_THRESHOLD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PARM_THRESHOLD_LEN = 9;
  	/**
	 * serializeParmThreshold
	 */
	protected void serializeParmThreshold(long parmThreshold) {
		 putNumber(beginParmThreshold,parmThreshold,PARM_THRESHOLD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localParmThresholdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeParmThreshold
	 */
   	protected  long serializeParmThreshold(char[] value) {
	    long  parmThreshold;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    parmThreshold = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginParmThreshold
		       ,9
		      );
		 localParmThresholdCounter = shareString.getSerializedField().getModifiedCounter();
		return  parmThreshold;
    }

   protected long checkParmThresholdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshParmThreshold is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshParmThreshold() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginParmThreshold
			                 ,PARM_THRESHOLD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("parmThreshold", beginParmThreshold,PARM_THRESHOLD_LEN);
    }
   	}




}
  
