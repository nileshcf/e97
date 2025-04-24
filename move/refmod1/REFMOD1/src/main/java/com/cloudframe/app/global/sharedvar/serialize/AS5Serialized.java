package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_5_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld15;
            protected  int beginASFld25;
	
	/**
	* Constructor for AS5Serialized
	**/
    public AS5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld15 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld25 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld15Counter = -1;
     public boolean isASFld15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld15Counter != sharedCounter;
         localASFld15Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_15_LEN = 30;
	/**
	 * 	serialize this ASFld15
	 */
   protected void serializeASFld15(char[] aSFld15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld15,0,getStringValue(),beginASFld15,A_SFLD_15_LEN);
       localASFld15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld15Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld15() {	 
   		return (substring(getStringValue(),beginASFld15,beginASFld15 + A_SFLD_15_LEN));
   	}
     int localASFld25Counter = -1;
     public boolean isASFld25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld25Counter != sharedCounter;
         localASFld25Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_25_LEN = 40;
	/**
	 * 	serialize this ASFld25
	 */
   protected void serializeASFld25(char[] aSFld25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld25,0,getStringValue(),beginASFld25,A_SFLD_25_LEN);
       localASFld25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld25Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld25() {	 
   		return (substring(getStringValue(),beginASFld25,beginASFld25 + A_SFLD_25_LEN));
   	}




}
  
