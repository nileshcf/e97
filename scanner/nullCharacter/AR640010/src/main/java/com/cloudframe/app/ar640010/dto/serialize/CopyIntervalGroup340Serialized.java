package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CopyIntervalGroup340Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CopyIntervalGroup340Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CopyIntervalGroup340Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COPY_INTERVAL_GROUP_340_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCopyInterval340;
	
	/**
	* Constructor for CopyIntervalGroup340Serialized
	**/
    public CopyIntervalGroup340Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CopyIntervalGroup340Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopyIntervalGroup340Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CopyIntervalGroup340Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this CopyIntervalGroup340Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in CopyIntervalGroup340Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COPY_INTERVAL_GROUP_340_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCopyInterval340 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCopyInterval340Counter = -1;
     public boolean isCopyInterval340Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyInterval340Counter != sharedCounter;
         localCopyInterval340Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of copyInterval340
	 *	@return copyInterval340
	 */
	public char[]  getCopyInterval340String() {
	     return getCharArray(beginCopyInterval340,COPY_INTERVAL_340_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean copyInterval340IsNumeric() {
	    return isNumeric(beginCopyInterval340
	                    ,beginCopyInterval340 + COPY_INTERVAL_340_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COPY_INTERVAL_340_LEN = 8;
  	/**
	 * serializeCopyInterval340
	 */
	protected void serializeCopyInterval340(long copyInterval340) {
		 putNumber(beginCopyInterval340,copyInterval340,COPY_INTERVAL_340_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCopyInterval340Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCopyInterval340
	 */
   	protected  long serializeCopyInterval340(char[] value) {
	    long  copyInterval340;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    copyInterval340 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCopyInterval340
		       ,8
		      );
		 localCopyInterval340Counter = shareString.getSerializedField().getModifiedCounter();
		return  copyInterval340;
    }

   protected long checkCopyInterval340MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCopyInterval340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCopyInterval340() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCopyInterval340
			                 ,COPY_INTERVAL_340_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("copyInterval340", beginCopyInterval340,COPY_INTERVAL_340_LEN);
    }
   	}




}
  
