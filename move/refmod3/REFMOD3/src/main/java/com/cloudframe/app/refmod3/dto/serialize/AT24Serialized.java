package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT24Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT24Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT24Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_24_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld124;
            protected  int beginATFld224;
	
	/**
	* Constructor for AT24Serialized
	**/
    public AT24Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT24Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_24_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld124 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld224 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld124Counter = -1;
     public boolean isATFld124Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld124Counter != sharedCounter;
         localATFld124Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_124_LEN = 20;
	/**
	 * 	serialize this ATFld124
	 */
   protected void serializeATFld124(char[] aTFld124) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld124,0,getStringValue(),beginATFld124,A_TFLD_124_LEN);
       localATFld124Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld124Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld124() {	 
   		return (substring(getStringValue(),beginATFld124,beginATFld124 + A_TFLD_124_LEN));
   	}
     int localATFld224Counter = -1;
     public boolean isATFld224Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld224Counter != sharedCounter;
         localATFld224Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_224_LEN = 40;
	/**
	 * 	serialize this ATFld224
	 */
   protected void serializeATFld224(char[] aTFld224) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld224,0,getStringValue(),beginATFld224,A_TFLD_224_LEN);
       localATFld224Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld224Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld224 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld224() {	 
   		return (substring(getStringValue(),beginATFld224,beginATFld224 + A_TFLD_224_LEN));
   	}




}
  
