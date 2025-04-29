package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MciseqioLabelCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciseqioLabelCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciseqioLabelCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCISEQIO_LABEL_CODES_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciseqioLabelOnDd;
            protected  int beginMciseqioNoLabel;
            protected  int beginMciseqioStdLabel;
	
	/**
	* Constructor for MciseqioLabelCodesSerialized
	**/
    public MciseqioLabelCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciseqioLabelCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioLabelCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciseqioLabelCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,141); // serialize this field at offset 141 by default 
    }
    
	/**
	* sets parent for this MciseqioLabelCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 141 by default
    }    
	/**
	* initializes the field in MciseqioLabelCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCISEQIO_LABEL_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciseqioLabelOnDd = getStartOffset() + 0;	// set offset for serialization
  
             beginMciseqioNoLabel = getStartOffset() + 2;	// set offset for serialization
  
             beginMciseqioStdLabel = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciseqioLabelOnDdCounter = -1;
     public boolean isMciseqioLabelOnDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioLabelOnDdCounter != sharedCounter;
         localMciseqioLabelOnDdCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_LABEL_ON_DD_LEN = 2;
	/**
	 * 	serialize this MciseqioLabelOnDd
	 */
   protected void serializeMciseqioLabelOnDd(char[] mciseqioLabelOnDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioLabelOnDd,0,getStringValue(),beginMciseqioLabelOnDd,MCISEQIO_LABEL_ON_DD_LEN);
       localMciseqioLabelOnDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioLabelOnDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioLabelOnDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioLabelOnDd() {	 
   		return (substring(getStringValue(),beginMciseqioLabelOnDd,beginMciseqioLabelOnDd + MCISEQIO_LABEL_ON_DD_LEN));
   	}
     int localMciseqioNoLabelCounter = -1;
     public boolean isMciseqioNoLabelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioNoLabelCounter != sharedCounter;
         localMciseqioNoLabelCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_NO_LABEL_LEN = 2;
	/**
	 * 	serialize this MciseqioNoLabel
	 */
   protected void serializeMciseqioNoLabel(char[] mciseqioNoLabel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioNoLabel,0,getStringValue(),beginMciseqioNoLabel,MCISEQIO_NO_LABEL_LEN);
       localMciseqioNoLabelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioNoLabelConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioNoLabel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioNoLabel() {	 
   		return (substring(getStringValue(),beginMciseqioNoLabel,beginMciseqioNoLabel + MCISEQIO_NO_LABEL_LEN));
   	}
     int localMciseqioStdLabelCounter = -1;
     public boolean isMciseqioStdLabelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioStdLabelCounter != sharedCounter;
         localMciseqioStdLabelCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_STD_LABEL_LEN = 2;
	/**
	 * 	serialize this MciseqioStdLabel
	 */
   protected void serializeMciseqioStdLabel(char[] mciseqioStdLabel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioStdLabel,0,getStringValue(),beginMciseqioStdLabel,MCISEQIO_STD_LABEL_LEN);
       localMciseqioStdLabelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioStdLabelConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioStdLabel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioStdLabel() {	 
   		return (substring(getStringValue(),beginMciseqioStdLabel,beginMciseqioStdLabel + MCISEQIO_STD_LABEL_LEN));
   	}




}
  
