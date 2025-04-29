package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AS23Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS23Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS23Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_23_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld123;
            protected  int beginASFld223;
	
	/**
	* Constructor for AS23Serialized
	**/
    public AS23Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS23Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_23_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld123 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld223 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld123Counter = -1;
     public boolean isASFld123Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld123Counter != sharedCounter;
         localASFld123Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_123_LEN = 30;
	/**
	 * 	serialize this ASFld123
	 */
   protected void serializeASFld123(char[] aSFld123) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld123,0,getStringValue(),beginASFld123,A_SFLD_123_LEN);
       localASFld123Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld123Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld123() {	 
   		return (substring(getStringValue(),beginASFld123,beginASFld123 + A_SFLD_123_LEN));
   	}
     int localASFld223Counter = -1;
     public boolean isASFld223Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld223Counter != sharedCounter;
         localASFld223Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_223_LEN = 40;
	/**
	 * 	serialize this ASFld223
	 */
   protected void serializeASFld223(char[] aSFld223) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld223,0,getStringValue(),beginASFld223,A_SFLD_223_LEN);
       localASFld223Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld223Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld223 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld223() {	 
   		return (substring(getStringValue(),beginASFld223,beginASFld223 + A_SFLD_223_LEN));
   	}




}
  
