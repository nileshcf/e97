package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_15_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld115;
            protected  int beginASFld215;
	
	/**
	* Constructor for AS15Serialized
	**/
    public AS15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS15Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS15Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS15Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS15Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld115 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld215 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld115Counter = -1;
     public boolean isASFld115Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld115Counter != sharedCounter;
         localASFld115Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_115_LEN = 30;
	/**
	 * 	serialize this ASFld115
	 */
   protected void serializeASFld115(char[] aSFld115) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld115,0,getStringValue(),beginASFld115,A_SFLD_115_LEN);
       localASFld115Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld115Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld115() {	 
   		return (substring(getStringValue(),beginASFld115,beginASFld115 + A_SFLD_115_LEN));
   	}
     int localASFld215Counter = -1;
     public boolean isASFld215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld215Counter != sharedCounter;
         localASFld215Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_215_LEN = 40;
	/**
	 * 	serialize this ASFld215
	 */
   protected void serializeASFld215(char[] aSFld215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld215,0,getStringValue(),beginASFld215,A_SFLD_215_LEN);
       localASFld215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld215() {	 
   		return (substring(getStringValue(),beginASFld215,beginASFld215 + A_SFLD_215_LEN));
   	}




}
  
