package com.cloudframe.app.asaprnt4.dto.serialize;

/**
*  The class ReprecGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReprecGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReprecGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REPREC_GRP_LENGTH = 287;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReprec;
	
	/**
	* Constructor for ReprecGrpSerialized
	**/
    public ReprecGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReprecGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REPREC_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReprec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReprecCounter = -1;
     public boolean isReprecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReprecCounter != sharedCounter;
         localReprecCounter = sharedCounter; return hasModified;
     }
	protected static final int REPREC_LEN = 286;
	/**
	 * 	serialize this Reprec
	 */
   protected void serializeReprec(char[] reprec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reprec,0,getStringValue(),beginReprec,REPREC_LEN);
       localReprecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReprecConstraints(char[] value) {
   			return super.checkConstraints(value , 286 ,false, false);
   }
    /**
	 *	refreshReprec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReprec() {	 
   		return (substring(getStringValue(),beginReprec,beginReprec + REPREC_LEN));
   	}




}
  
