package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS215Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS215Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS215Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_215_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld1215;
            protected  int beginASFld2215;
	
	/**
	* Constructor for AS215Serialized
	**/
    public AS215Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS215Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS215Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS215Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS215Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS215Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_215_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld1215 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld2215 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld1215Counter = -1;
     public boolean isASFld1215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld1215Counter != sharedCounter;
         localASFld1215Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_1215_LEN = 30;
	/**
	 * 	serialize this ASFld1215
	 */
   protected void serializeASFld1215(char[] aSFld1215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld1215,0,getStringValue(),beginASFld1215,A_SFLD_1215_LEN);
       localASFld1215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld1215Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld1215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld1215() {	 
   		return (substring(getStringValue(),beginASFld1215,beginASFld1215 + A_SFLD_1215_LEN));
   	}
     int localASFld2215Counter = -1;
     public boolean isASFld2215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld2215Counter != sharedCounter;
         localASFld2215Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_2215_LEN = 40;
	/**
	 * 	serialize this ASFld2215
	 */
   protected void serializeASFld2215(char[] aSFld2215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld2215,0,getStringValue(),beginASFld2215,A_SFLD_2215_LEN);
       localASFld2215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld2215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld2215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld2215() {	 
   		return (substring(getStringValue(),beginASFld2215,beginASFld2215 + A_SFLD_2215_LEN));
   	}




}
  
