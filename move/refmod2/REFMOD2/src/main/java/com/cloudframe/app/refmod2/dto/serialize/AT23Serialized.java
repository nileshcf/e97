package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT23Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT23Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT23Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_23_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld123;
            protected  int beginATFld223;
	
	/**
	* Constructor for AT23Serialized
	**/
    public AT23Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT23Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_23_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld123 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld223 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld123Counter = -1;
     public boolean isATFld123Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld123Counter != sharedCounter;
         localATFld123Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_123_LEN = 20;
	/**
	 * 	serialize this ATFld123
	 */
   protected void serializeATFld123(char[] aTFld123) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld123,0,getStringValue(),beginATFld123,A_TFLD_123_LEN);
       localATFld123Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld123Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld123() {	 
   		return (substring(getStringValue(),beginATFld123,beginATFld123 + A_TFLD_123_LEN));
   	}
     int localATFld223Counter = -1;
     public boolean isATFld223Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld223Counter != sharedCounter;
         localATFld223Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_223_LEN = 40;
	/**
	 * 	serialize this ATFld223
	 */
   protected void serializeATFld223(char[] aTFld223) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld223,0,getStringValue(),beginATFld223,A_TFLD_223_LEN);
       localATFld223Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld223Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld223 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld223() {	 
   		return (substring(getStringValue(),beginATFld223,beginATFld223 + A_TFLD_223_LEN));
   	}




}
  
