package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class BslId800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BslId800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BslId800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BSL_ID_800_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBsl800;
            protected  int beginBsid800;
	
	/**
	* Constructor for BslId800Serialized
	**/
    public BslId800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BslId800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BslId800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BslId800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BslId800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BslId800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BSL_ID_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBsl800 = getStartOffset() + 0;	// set offset for serialization
  
             beginBsid800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBsl800Counter = -1;
     public boolean isBsl800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl800Counter != sharedCounter;
         localBsl800Counter = sharedCounter; return hasModified;
     }
	protected static final int BSL_800_LEN = 1;
	/**
	 * 	serialize this Bsl800
	 */
   protected void serializeBsl800(char[] bsl800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsl800,0,getStringValue(),beginBsl800,BSL_800_LEN);
       localBsl800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsl800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBsl800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsl800() {	 
   		return (substring(getStringValue(),beginBsl800,beginBsl800 + BSL_800_LEN));
   	}
     int localBsid800Counter = -1;
     public boolean isBsid800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsid800Counter != sharedCounter;
         localBsid800Counter = sharedCounter; return hasModified;
     }
	protected static final int BSID_800_LEN = 6;
	/**
	 * 	serialize this Bsid800
	 */
   protected void serializeBsid800(char[] bsid800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsid800,0,getStringValue(),beginBsid800,BSID_800_LEN);
       localBsid800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsid800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBsid800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsid800() {	 
   		return (substring(getStringValue(),beginBsid800,beginBsid800 + BSID_800_LEN));
   	}




}
  
