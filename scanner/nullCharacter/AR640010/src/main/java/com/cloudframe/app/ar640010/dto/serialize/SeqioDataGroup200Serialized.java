package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SeqioDataGroup200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeqioDataGroup200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeqioDataGroup200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEQIO_DATA_GROUP_200_LENGTH = 32768;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeqioData200;
	
	/**
	* Constructor for SeqioDataGroup200Serialized
	**/
    public SeqioDataGroup200Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SeqioDataGroup200Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioDataGroup200Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SeqioDataGroup200Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this SeqioDataGroup200Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in SeqioDataGroup200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEQIO_DATA_GROUP_200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSeqioData200 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSeqioData200Counter = -1;
     public boolean isSeqioData200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioData200Counter != sharedCounter;
         localSeqioData200Counter = sharedCounter; return hasModified;
     }
	protected static final int SEQIO_DATA_200_LEN = 32768;
	/**
	 * 	serialize this SeqioData200
	 */
   protected void serializeSeqioData200(char[] seqioData200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seqioData200,0,getStringValue(),beginSeqioData200,SEQIO_DATA_200_LEN);
       localSeqioData200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeqioData200Constraints(char[] value) {
   			return super.checkConstraints(value , 32768 ,false, false);
   }
    /**
	 *	refreshSeqioData200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeqioData200() {	 
   		return (substring(getStringValue(),beginSeqioData200,beginSeqioData200 + SEQIO_DATA_200_LEN));
   	}




}
  
