package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class GftRetrieveDsn1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GftRetrieveDsn1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GftRetrieveDsn1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GFT_RETRIEVE_DSN_1000_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGftRetrieveDd1000;
	
	/**
	* Constructor for GftRetrieveDsn1000Serialized
	**/
    public GftRetrieveDsn1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GftRetrieveDsn1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftRetrieveDsn1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GftRetrieveDsn1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this GftRetrieveDsn1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in GftRetrieveDsn1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GFT_RETRIEVE_DSN_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGftRetrieveDd1000 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localGftRetrieveDd1000Counter = -1;
     public boolean isGftRetrieveDd1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftRetrieveDd1000Counter != sharedCounter;
         localGftRetrieveDd1000Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_RETRIEVE_DD_1000_LEN = 8;
	/**
	 * 	serialize this GftRetrieveDd1000
	 */
   protected void serializeGftRetrieveDd1000(char[] gftRetrieveDd1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftRetrieveDd1000,0,getStringValue(),beginGftRetrieveDd1000,GFT_RETRIEVE_DD_1000_LEN);
       localGftRetrieveDd1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftRetrieveDd1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshGftRetrieveDd1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftRetrieveDd1000() {	 
   		return (substring(getStringValue(),beginGftRetrieveDd1000,beginGftRetrieveDd1000 + GFT_RETRIEVE_DD_1000_LEN));
   	}




}
  
