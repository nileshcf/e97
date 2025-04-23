package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class TipapmaLayout800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TipapmaLayout800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TipapmaLayout800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TIPAPMA_LAYOUT_800_LENGTH = 116;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVirtualAccountNbr800;
            protected  int beginPrimAccountNbr800;
	
	/**
	* Constructor for TipapmaLayout800Serialized
	**/
    public TipapmaLayout800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TipapmaLayout800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TIPAPMA_LAYOUT_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVirtualAccountNbr800 = getStartOffset() + 0;	// set offset for serialization
  
             beginPrimAccountNbr800 = getStartOffset() + 45;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localVirtualAccountNbr800Counter = -1;
     public boolean isVirtualAccountNbr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVirtualAccountNbr800Counter != sharedCounter;
         localVirtualAccountNbr800Counter = sharedCounter; return hasModified;
     }
	protected static final int VIRTUAL_ACCOUNT_NBR_800_LEN = 19;
	/**
	 * 	serialize this VirtualAccountNbr800
	 */
   protected void serializeVirtualAccountNbr800(char[] virtualAccountNbr800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(virtualAccountNbr800,0,getStringValue(),beginVirtualAccountNbr800,VIRTUAL_ACCOUNT_NBR_800_LEN);
       localVirtualAccountNbr800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVirtualAccountNbr800Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshVirtualAccountNbr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVirtualAccountNbr800() {	 
   		return (substring(getStringValue(),beginVirtualAccountNbr800,beginVirtualAccountNbr800 + VIRTUAL_ACCOUNT_NBR_800_LEN));
   	}
     int localPrimAccountNbr800Counter = -1;
     public boolean isPrimAccountNbr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimAccountNbr800Counter != sharedCounter;
         localPrimAccountNbr800Counter = sharedCounter; return hasModified;
     }
	protected static final int PRIM_ACCOUNT_NBR_800_LEN = 19;
	/**
	 * 	serialize this PrimAccountNbr800
	 */
   protected void serializePrimAccountNbr800(char[] primAccountNbr800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(primAccountNbr800,0,getStringValue(),beginPrimAccountNbr800,PRIM_ACCOUNT_NBR_800_LEN);
       localPrimAccountNbr800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrimAccountNbr800Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshPrimAccountNbr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrimAccountNbr800() {	 
   		return (substring(getStringValue(),beginPrimAccountNbr800,beginPrimAccountNbr800 + PRIM_ACCOUNT_NBR_800_LEN));
   	}




}
  
