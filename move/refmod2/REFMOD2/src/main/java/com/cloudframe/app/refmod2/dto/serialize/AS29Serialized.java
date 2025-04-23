package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AS29Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS29Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS29Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_29_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld129;
            protected  int beginASFld229;
	
	/**
	* Constructor for AS29Serialized
	**/
    public AS29Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS29Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS29Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS29Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS29Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS29Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_29_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld129 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld229 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld129Counter = -1;
     public boolean isASFld129Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld129Counter != sharedCounter;
         localASFld129Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_129_LEN = 30;
	/**
	 * 	serialize this ASFld129
	 */
   protected void serializeASFld129(char[] aSFld129) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld129,0,getStringValue(),beginASFld129,A_SFLD_129_LEN);
       localASFld129Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld129Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld129() {	 
   		return (substring(getStringValue(),beginASFld129,beginASFld129 + A_SFLD_129_LEN));
   	}
     int localASFld229Counter = -1;
     public boolean isASFld229Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld229Counter != sharedCounter;
         localASFld229Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_229_LEN = 40;
	/**
	 * 	serialize this ASFld229
	 */
   protected void serializeASFld229(char[] aSFld229) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld229,0,getStringValue(),beginASFld229,A_SFLD_229_LEN);
       localASFld229Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld229Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld229 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld229() {	 
   		return (substring(getStringValue(),beginASFld229,beginASFld229 + A_SFLD_229_LEN));
   	}




}
  
