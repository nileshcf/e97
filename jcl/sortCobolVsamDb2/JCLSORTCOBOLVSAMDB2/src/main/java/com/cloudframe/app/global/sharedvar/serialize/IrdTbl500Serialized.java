package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IrdTbl500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IrdTbl500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IrdTbl500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IRD_TBL_500_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIrd500;
            protected  int beginIrdResStatus500;
	
	/**
	* Constructor for IrdTbl500Serialized
	**/
    public IrdTbl500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IrdTbl500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IrdTbl500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IrdTbl500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this IrdTbl500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in IrdTbl500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IRD_TBL_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIrd500 = getStartOffset() + 0;	// set offset for serialization
  
             beginIrdResStatus500 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIrd500Counter = -1;
     public boolean isIrd500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIrd500Counter != sharedCounter;
         localIrd500Counter = sharedCounter; return hasModified;
     }
	protected static final int IRD_500_LEN = 2;
	/**
	 * 	serialize this Ird500
	 */
   protected void serializeIrd500(char[] ird500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ird500,0,getStringValue(),beginIrd500,IRD_500_LEN);
       localIrd500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIrd500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIrd500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIrd500() {	 
   		return (substring(getStringValue(),beginIrd500,beginIrd500 + IRD_500_LEN));
   	}
     int localIrdResStatus500Counter = -1;
     public boolean isIrdResStatus500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIrdResStatus500Counter != sharedCounter;
         localIrdResStatus500Counter = sharedCounter; return hasModified;
     }
	protected static final int IRD_RES_STATUS_500_LEN = 1;
	/**
	 * 	serialize this IrdResStatus500
	 */
   protected void serializeIrdResStatus500(char[] irdResStatus500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(irdResStatus500,0,getStringValue(),beginIrdResStatus500,IRD_RES_STATUS_500_LEN);
       localIrdResStatus500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIrdResStatus500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIrdResStatus500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIrdResStatus500() {	 
   		return (substring(getStringValue(),beginIrdResStatus500,beginIrdResStatus500 + IRD_RES_STATUS_500_LEN));
   	}




}
  
