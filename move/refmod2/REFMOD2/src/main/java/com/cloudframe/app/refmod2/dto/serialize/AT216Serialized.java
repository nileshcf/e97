package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT216Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT216Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT216Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_216_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1216;
            protected  int beginATFld2216;
	
	/**
	* Constructor for AT216Serialized
	**/
    public AT216Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT216Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_216_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1216 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2216 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1216Counter = -1;
     public boolean isATFld1216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1216Counter != sharedCounter;
         localATFld1216Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1216_LEN = 20;
	/**
	 * 	serialize this ATFld1216
	 */
   protected void serializeATFld1216(char[] aTFld1216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1216,0,getStringValue(),beginATFld1216,A_TFLD_1216_LEN);
       localATFld1216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1216Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1216() {	 
   		return (substring(getStringValue(),beginATFld1216,beginATFld1216 + A_TFLD_1216_LEN));
   	}
     int localATFld2216Counter = -1;
     public boolean isATFld2216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2216Counter != sharedCounter;
         localATFld2216Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2216_LEN = 40;
	/**
	 * 	serialize this ATFld2216
	 */
   protected void serializeATFld2216(char[] aTFld2216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2216,0,getStringValue(),beginATFld2216,A_TFLD_2216_LEN);
       localATFld2216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2216Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2216() {	 
   		return (substring(getStringValue(),beginATFld2216,beginATFld2216 + A_TFLD_2216_LEN));
   	}




}
  
