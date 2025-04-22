package com.cloudframe.app.mcsort02.dto.serialize;

/**
*  The class AcceptInputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcceptInputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcceptInputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACCEPT_INPUT_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDdname;
	
	/**
	* Constructor for AcceptInputSerialized
	**/
    public AcceptInputSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AcceptInputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACCEPT_INPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDdname = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDdnameCounter = -1;
     public boolean isDdnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDdnameCounter != sharedCounter;
         localDdnameCounter = sharedCounter; return hasModified;
     }
	protected static final int DDNAME_LEN = 8;
	/**
	 * 	serialize this Ddname
	 */
   protected void serializeDdname(char[] ddname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ddname,0,getStringValue(),beginDdname,DDNAME_LEN);
       localDdnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDdnameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDdname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDdname() {	 
   		return (substring(getStringValue(),beginDdname,beginDdname + DDNAME_LEN));
   	}




}
  
