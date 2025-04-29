package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class AcquirerIca860RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcquirerIca860RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcquirerIca860RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACQUIRER_ICA_860_REDEFINED_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcquirerIcaOnly860;
	
	/**
	* Constructor for AcquirerIca860RedefinedSerialized
	**/
    public AcquirerIca860RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcquirerIca860RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcquirerIca860RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcquirerIca860RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,113); // serialize this field at offset 113 by default 
    }
    
	/**
	* sets parent for this AcquirerIca860RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 113 by default
    }    
	/**
	* initializes the field in AcquirerIca860RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACQUIRER_ICA_860_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcquirerIcaOnly860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAcquirerIcaOnly860Counter = -1;
     public boolean isAcquirerIcaOnly860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcquirerIcaOnly860Counter != sharedCounter;
         localAcquirerIcaOnly860Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of acquirerIcaOnly860
	 *	@return acquirerIcaOnly860
	 */
	public char[]  getAcquirerIcaOnly860String() {
	     return getCharArray(beginAcquirerIcaOnly860,ACQUIRER_ICA_ONLY_860_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean acquirerIcaOnly860IsNumeric() {
	    return isNumeric(beginAcquirerIcaOnly860
	                    ,beginAcquirerIcaOnly860 + ACQUIRER_ICA_ONLY_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ACQUIRER_ICA_ONLY_860_LEN = 6;
  	/**
	 * serializeAcquirerIcaOnly860
	 */
	protected void serializeAcquirerIcaOnly860(long acquirerIcaOnly860) {
		 putNumber(beginAcquirerIcaOnly860,acquirerIcaOnly860,ACQUIRER_ICA_ONLY_860_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAcquirerIcaOnly860Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAcquirerIcaOnly860
	 */
   	protected  long serializeAcquirerIcaOnly860(char[] value) {
	    long  acquirerIcaOnly860;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    acquirerIcaOnly860 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginAcquirerIcaOnly860
		       ,6
		      );
		 localAcquirerIcaOnly860Counter = shareString.getSerializedField().getModifiedCounter();
		return  acquirerIcaOnly860;
    }

   protected long checkAcquirerIcaOnly860MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAcquirerIcaOnly860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAcquirerIcaOnly860() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAcquirerIcaOnly860
			                 ,ACQUIRER_ICA_ONLY_860_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("acquirerIcaOnly860", beginAcquirerIcaOnly860,ACQUIRER_ICA_ONLY_860_LEN);
    }
   	}




}
  
