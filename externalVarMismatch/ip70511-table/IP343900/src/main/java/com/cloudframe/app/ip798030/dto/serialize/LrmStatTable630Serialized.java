package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class LrmStatTable630Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LrmStatTable630Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LrmStatTable630Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LRM_STAT_TABLE_630_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLrmStatError630;
	
	/**
	* Constructor for LrmStatTable630Serialized
	**/
    public LrmStatTable630Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LrmStatTable630Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LrmStatTable630Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LrmStatTable630Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this LrmStatTable630Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in LrmStatTable630Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LRM_STAT_TABLE_630_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLrmStatError630 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLrmStatError630Counter = -1;
     public boolean isLrmStatError630Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLrmStatError630Counter != sharedCounter;
         localLrmStatError630Counter = sharedCounter; return hasModified;
     }
	protected static final int LRM_STAT_ERROR_630_LEN = 66;
	/**
	 * 	serialize this LrmStatError630
	 */
   protected void serializeLrmStatError630(char[] lrmStatError630) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lrmStatError630,0,getStringValue(),beginLrmStatError630,LRM_STAT_ERROR_630_LEN);
       localLrmStatError630Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLrmStatError630Constraints(char[] value) {
   			return super.checkConstraints(value , 66 ,false, false);
   }
    /**
	 *	refreshLrmStatError630 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLrmStatError630() {	 
   		return (substring(getStringValue(),beginLrmStatError630,beginLrmStatError630 + LRM_STAT_ERROR_630_LEN));
   	}




}
  
