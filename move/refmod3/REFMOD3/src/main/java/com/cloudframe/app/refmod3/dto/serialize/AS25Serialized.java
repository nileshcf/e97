package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_25_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld125;
            protected  int beginASFld225;
	
	/**
	* Constructor for AS25Serialized
	**/
    public AS25Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS25Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS25Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS25Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS25Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld125 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld225 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld125Counter = -1;
     public boolean isASFld125Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld125Counter != sharedCounter;
         localASFld125Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_125_LEN = 30;
	/**
	 * 	serialize this ASFld125
	 */
   protected void serializeASFld125(char[] aSFld125) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld125,0,getStringValue(),beginASFld125,A_SFLD_125_LEN);
       localASFld125Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld125Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld125() {	 
   		return (substring(getStringValue(),beginASFld125,beginASFld125 + A_SFLD_125_LEN));
   	}
     int localASFld225Counter = -1;
     public boolean isASFld225Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld225Counter != sharedCounter;
         localASFld225Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_225_LEN = 40;
	/**
	 * 	serialize this ASFld225
	 */
   protected void serializeASFld225(char[] aSFld225) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld225,0,getStringValue(),beginASFld225,A_SFLD_225_LEN);
       localASFld225Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld225Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld225 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld225() {	 
   		return (substring(getStringValue(),beginASFld225,beginASFld225 + A_SFLD_225_LEN));
   	}




}
  
