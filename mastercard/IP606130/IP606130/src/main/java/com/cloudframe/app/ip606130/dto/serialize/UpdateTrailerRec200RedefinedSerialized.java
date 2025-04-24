package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class UpdateTrailerRec200RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UpdateTrailerRec200RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UpdateTrailerRec200RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int UPDATE_TRAILER_REC_200_REDEFINED_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUpdateTrailerTable1200;
            protected  int beginUpdateTrailerCount1200;
	
	/**
	* Constructor for UpdateTrailerRec200RedefinedSerialized
	**/
    public UpdateTrailerRec200RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for UpdateTrailerRec200RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UpdateTrailerRec200RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this UpdateTrailerRec200RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this UpdateTrailerRec200RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in UpdateTrailerRec200RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(UPDATE_TRAILER_REC_200_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUpdateTrailerTable1200 = getStartOffset() + 15;	// set offset for serialization
  
             beginUpdateTrailerCount1200 = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUpdateTrailerTable1200Counter = -1;
     public boolean isUpdateTrailerTable1200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUpdateTrailerTable1200Counter != sharedCounter;
         localUpdateTrailerTable1200Counter = sharedCounter; return hasModified;
     }
	protected static final int UPDATE_TRAILER_TABLE_1200_LEN = 8;
	/**
	 * 	serialize this UpdateTrailerTable1200
	 */
   protected void serializeUpdateTrailerTable1200(char[] updateTrailerTable1200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(updateTrailerTable1200,0,getStringValue(),beginUpdateTrailerTable1200,UPDATE_TRAILER_TABLE_1200_LEN);
       localUpdateTrailerTable1200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUpdateTrailerTable1200Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshUpdateTrailerTable1200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUpdateTrailerTable1200() {	 
   		return (substring(getStringValue(),beginUpdateTrailerTable1200,beginUpdateTrailerTable1200 + UPDATE_TRAILER_TABLE_1200_LEN));
   	}
     int localUpdateTrailerCount1200Counter = -1;
     public boolean isUpdateTrailerCount1200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUpdateTrailerCount1200Counter != sharedCounter;
         localUpdateTrailerCount1200Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of updateTrailerCount1200
	 *	@return updateTrailerCount1200
	 */
	public char[]  getUpdateTrailerCount1200String() {
	     return getCharArray(beginUpdateTrailerCount1200,UPDATE_TRAILER_COUNT_1200_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean updateTrailerCount1200IsNumeric() {
	    return isNumeric(beginUpdateTrailerCount1200
	                    ,beginUpdateTrailerCount1200 + UPDATE_TRAILER_COUNT_1200_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int UPDATE_TRAILER_COUNT_1200_LEN = 8;
  	/**
	 * serializeUpdateTrailerCount1200
	 */
	protected void serializeUpdateTrailerCount1200(long updateTrailerCount1200) {
		 putNumber(beginUpdateTrailerCount1200,updateTrailerCount1200,UPDATE_TRAILER_COUNT_1200_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUpdateTrailerCount1200Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUpdateTrailerCount1200
	 */
   	protected  long serializeUpdateTrailerCount1200(char[] value) {
	    long  updateTrailerCount1200;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    updateTrailerCount1200 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginUpdateTrailerCount1200
		       ,8
		      );
		 localUpdateTrailerCount1200Counter = shareString.getSerializedField().getModifiedCounter();
		return  updateTrailerCount1200;
    }

   protected long checkUpdateTrailerCount1200MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUpdateTrailerCount1200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshUpdateTrailerCount1200() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginUpdateTrailerCount1200
			                 ,UPDATE_TRAILER_COUNT_1200_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("updateTrailerCount1200", beginUpdateTrailerCount1200,UPDATE_TRAILER_COUNT_1200_LEN);
    }
   	}




}
  
