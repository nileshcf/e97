package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class GftDsn1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GftDsn1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GftDsn1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GFT_DSN_1000_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGftDd1000;
	
	/**
	* Constructor for GftDsn1000Serialized
	**/
    public GftDsn1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GftDsn1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftDsn1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GftDsn1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this GftDsn1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in GftDsn1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GFT_DSN_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGftDd1000 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localGftDd1000Counter = -1;
     public boolean isGftDd1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftDd1000Counter != sharedCounter;
         localGftDd1000Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_DD_1000_LEN = 8;
	/**
	 * 	serialize this GftDd1000
	 */
   protected void serializeGftDd1000(char[] gftDd1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftDd1000,0,getStringValue(),beginGftDd1000,GFT_DD_1000_LEN);
       localGftDd1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftDd1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshGftDd1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftDd1000() {	 
   		return (substring(getStringValue(),beginGftDd1000,beginGftDd1000 + GFT_DD_1000_LEN));
   	}




}
  
