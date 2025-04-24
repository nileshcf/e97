package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DeleteIntervalGroup340Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DeleteIntervalGroup340Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DeleteIntervalGroup340Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DELETE_INTERVAL_GROUP_340_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDeleteInterval340;
	
	/**
	* Constructor for DeleteIntervalGroup340Serialized
	**/
    public DeleteIntervalGroup340Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DeleteIntervalGroup340Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DeleteIntervalGroup340Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DeleteIntervalGroup340Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this DeleteIntervalGroup340Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in DeleteIntervalGroup340Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DELETE_INTERVAL_GROUP_340_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDeleteInterval340 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDeleteInterval340Counter = -1;
     public boolean isDeleteInterval340Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeleteInterval340Counter != sharedCounter;
         localDeleteInterval340Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of deleteInterval340
	 *	@return deleteInterval340
	 */
	public char[]  getDeleteInterval340String() {
	     return getCharArray(beginDeleteInterval340,DELETE_INTERVAL_340_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean deleteInterval340IsNumeric() {
	    return isNumeric(beginDeleteInterval340
	                    ,beginDeleteInterval340 + DELETE_INTERVAL_340_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DELETE_INTERVAL_340_LEN = 8;
  	/**
	 * serializeDeleteInterval340
	 */
	protected void serializeDeleteInterval340(long deleteInterval340) {
		 putNumber(beginDeleteInterval340,deleteInterval340,DELETE_INTERVAL_340_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDeleteInterval340Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDeleteInterval340
	 */
   	protected  long serializeDeleteInterval340(char[] value) {
	    long  deleteInterval340;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    deleteInterval340 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDeleteInterval340
		       ,8
		      );
		 localDeleteInterval340Counter = shareString.getSerializedField().getModifiedCounter();
		return  deleteInterval340;
    }

   protected long checkDeleteInterval340MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDeleteInterval340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDeleteInterval340() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDeleteInterval340
			                 ,DELETE_INTERVAL_340_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("deleteInterval340", beginDeleteInterval340,DELETE_INTERVAL_340_LEN);
    }
   	}




}
  
