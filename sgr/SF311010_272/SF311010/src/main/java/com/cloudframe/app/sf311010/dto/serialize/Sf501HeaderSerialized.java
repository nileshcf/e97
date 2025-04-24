package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501HeaderSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501HeaderSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501HeaderSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_HEADER_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501BkntRefNo;
            protected  int beginSf501JResponseInd;
            protected  int beginSf501JDownOption;
            protected  int beginSf501JMotoOption;
            protected  int beginSf501JPosEntryPoint;
	
	/**
	* Constructor for Sf501HeaderSerialized
	**/
    public Sf501HeaderSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501HeaderSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HeaderSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501HeaderSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Sf501HeaderSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Sf501HeaderSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_HEADER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501BkntRefNo = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginSf501JResponseInd = getStartOffset() + 28;	// set offset for serialization
  
             beginSf501JDownOption = getStartOffset() + 29;	// set offset for serialization
  
             beginSf501JMotoOption = getStartOffset() + 30;	// set offset for serialization
  
             beginSf501JPosEntryPoint = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501BkntRefNoCounter = -1;
     public boolean isSf501BkntRefNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501BkntRefNoCounter != sharedCounter;
         localSf501BkntRefNoCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_BKNT_REF_NO_LEN = 6;
	/**
	 * 	serialize this Sf501BkntRefNo
	 */
   protected void serializeSf501BkntRefNo(char[] sf501BkntRefNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501BkntRefNo,0,getStringValue(),beginSf501BkntRefNo,SF_501_BKNT_REF_NO_LEN);
       localSf501BkntRefNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501BkntRefNoConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf501BkntRefNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501BkntRefNo() {	 
   		return (substring(getStringValue(),beginSf501BkntRefNo,beginSf501BkntRefNo + SF_501_BKNT_REF_NO_LEN));
   	}
     int localSf501JResponseIndCounter = -1;
     public boolean isSf501JResponseIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501JResponseIndCounter != sharedCounter;
         localSf501JResponseIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_JRESPONSE_IND_LEN = 1;
	/**
	 * 	serialize this Sf501JResponseInd
	 */
   protected void serializeSf501JResponseInd(char[] sf501JResponseInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501JResponseInd,0,getStringValue(),beginSf501JResponseInd,SF_501_JRESPONSE_IND_LEN);
       localSf501JResponseIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501JResponseIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501JResponseInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501JResponseInd() {	 
   		return (substring(getStringValue(),beginSf501JResponseInd,beginSf501JResponseInd + SF_501_JRESPONSE_IND_LEN));
   	}
     int localSf501JDownOptionCounter = -1;
     public boolean isSf501JDownOptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501JDownOptionCounter != sharedCounter;
         localSf501JDownOptionCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_JDOWN_OPTION_LEN = 1;
	/**
	 * 	serialize this Sf501JDownOption
	 */
   protected void serializeSf501JDownOption(char[] sf501JDownOption) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501JDownOption,0,getStringValue(),beginSf501JDownOption,SF_501_JDOWN_OPTION_LEN);
       localSf501JDownOptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501JDownOptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501JDownOption is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501JDownOption() {	 
   		return (substring(getStringValue(),beginSf501JDownOption,beginSf501JDownOption + SF_501_JDOWN_OPTION_LEN));
   	}
     int localSf501JMotoOptionCounter = -1;
     public boolean isSf501JMotoOptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501JMotoOptionCounter != sharedCounter;
         localSf501JMotoOptionCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_JMOTO_OPTION_LEN = 1;
	/**
	 * 	serialize this Sf501JMotoOption
	 */
   protected void serializeSf501JMotoOption(char[] sf501JMotoOption) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501JMotoOption,0,getStringValue(),beginSf501JMotoOption,SF_501_JMOTO_OPTION_LEN);
       localSf501JMotoOptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501JMotoOptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501JMotoOption is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501JMotoOption() {	 
   		return (substring(getStringValue(),beginSf501JMotoOption,beginSf501JMotoOption + SF_501_JMOTO_OPTION_LEN));
   	}
     int localSf501JPosEntryPointCounter = -1;
     public boolean isSf501JPosEntryPointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501JPosEntryPointCounter != sharedCounter;
         localSf501JPosEntryPointCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_JPOS_ENTRY_POINT_LEN = 2;
	/**
	 * 	serialize this Sf501JPosEntryPoint
	 */
   protected void serializeSf501JPosEntryPoint(char[] sf501JPosEntryPoint) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501JPosEntryPoint,0,getStringValue(),beginSf501JPosEntryPoint,SF_501_JPOS_ENTRY_POINT_LEN);
       localSf501JPosEntryPointCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501JPosEntryPointConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf501JPosEntryPoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501JPosEntryPoint() {	 
   		return (substring(getStringValue(),beginSf501JPosEntryPoint,beginSf501JPosEntryPoint + SF_501_JPOS_ENTRY_POINT_LEN));
   	}




}
  
