package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class UpdateTrailerRec200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UpdateTrailerRec200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UpdateTrailerRec200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int UPDATE_TRAILER_REC_200_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUpdateRestOfData200;
	
	/**
	* Constructor for UpdateTrailerRec200Serialized
	**/
    public UpdateTrailerRec200Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for UpdateTrailerRec200Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UpdateTrailerRec200Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this UpdateTrailerRec200Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this UpdateTrailerRec200Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in UpdateTrailerRec200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(UPDATE_TRAILER_REC_200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUpdateRestOfData200 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUpdateRestOfData200Counter = -1;
     public boolean isUpdateRestOfData200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUpdateRestOfData200Counter != sharedCounter;
         localUpdateRestOfData200Counter = sharedCounter; return hasModified;
     }
	protected static final int UPDATE_REST_OF_DATA_200_LEN = 50;
	/**
	 * 	serialize this UpdateRestOfData200
	 */
   protected void serializeUpdateRestOfData200(char[] updateRestOfData200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(updateRestOfData200,0,getStringValue(),beginUpdateRestOfData200,UPDATE_REST_OF_DATA_200_LEN);
       localUpdateRestOfData200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUpdateRestOfData200Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshUpdateRestOfData200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUpdateRestOfData200() {	 
   		return (substring(getStringValue(),beginUpdateRestOfData200,beginUpdateRestOfData200 + UPDATE_REST_OF_DATA_200_LEN));
   	}




}
  
