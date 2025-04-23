package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT22Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT22Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT22Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_22_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld122;
            protected  int beginATFld222;
	
	/**
	* Constructor for AT22Serialized
	**/
    public AT22Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT22Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_22_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld122 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld222 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld122Counter = -1;
     public boolean isATFld122Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld122Counter != sharedCounter;
         localATFld122Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_122_LEN = 20;
	/**
	 * 	serialize this ATFld122
	 */
   protected void serializeATFld122(char[] aTFld122) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld122,0,getStringValue(),beginATFld122,A_TFLD_122_LEN);
       localATFld122Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld122Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld122 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld122() {	 
   		return (substring(getStringValue(),beginATFld122,beginATFld122 + A_TFLD_122_LEN));
   	}
     int localATFld222Counter = -1;
     public boolean isATFld222Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld222Counter != sharedCounter;
         localATFld222Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_222_LEN = 40;
	/**
	 * 	serialize this ATFld222
	 */
   protected void serializeATFld222(char[] aTFld222) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld222,0,getStringValue(),beginATFld222,A_TFLD_222_LEN);
       localATFld222Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld222Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld222 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld222() {	 
   		return (substring(getStringValue(),beginATFld222,beginATFld222 + A_TFLD_222_LEN));
   	}




}
  
