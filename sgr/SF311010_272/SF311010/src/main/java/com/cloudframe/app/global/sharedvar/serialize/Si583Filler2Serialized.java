package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Si583Filler2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si583Filler2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si583Filler2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_583_FILLER_2_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSi583DePresentInd2;
            protected  int beginSi583DeStartingPos2;
            protected  int beginSi583DeLength2;
	
	/**
	* Constructor for Si583Filler2Serialized
	**/
    public Si583Filler2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si583Filler2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583Filler2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si583Filler2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,33516); // serialize this field at offset 33516 by default 
    }
    
	/**
	* sets parent for this Si583Filler2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 33516 by default
    }    
	/**
	* initializes the field in Si583Filler2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_583_FILLER_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSi583DePresentInd2 = getStartOffset() + 0;	// set offset for serialization
  
             beginSi583DeStartingPos2 = getStartOffset() + 1;	// set offset for serialization
  
             beginSi583DeLength2 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSi583DePresentInd2Counter = -1;
     public boolean isSi583DePresentInd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583DePresentInd2Counter != sharedCounter;
         localSi583DePresentInd2Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_583_DE_PRESENT_IND_2_LEN = 1;
	/**
	 * 	serialize this Si583DePresentInd2
	 */
   protected void serializeSi583DePresentInd2(char[] si583DePresentInd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si583DePresentInd2,0,getStringValue(),beginSi583DePresentInd2,SI_583_DE_PRESENT_IND_2_LEN);
       localSi583DePresentInd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi583DePresentInd2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSi583DePresentInd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi583DePresentInd2() {	 
   		return (substring(getStringValue(),beginSi583DePresentInd2,beginSi583DePresentInd2 + SI_583_DE_PRESENT_IND_2_LEN));
   	}
         int localSi583DeStartingPos2Counter = -1;
         public boolean isSi583DeStartingPos2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DeStartingPos2Counter != sharedCounter;
            localSi583DeStartingPos2Counter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DE_STARTING_POS_2_LEN = 2;
  	/**
	 * serializeSi583DeStartingPos2
	 */
	protected void serializeSi583DeStartingPos2(short si583DeStartingPos2) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DeStartingPos2,SI_583_DE_STARTING_POS_2_LEN)
                  ,beginSi583DeStartingPos2
                  ,SI_583_DE_STARTING_POS_2_LEN
                 );
            localSi583DeStartingPos2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi583DeStartingPos2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi583DeStartingPos2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi583DeStartingPos2() {	 
			return (getShort(beginSi583DeStartingPos2));
   	}
         int localSi583DeLength2Counter = -1;
         public boolean isSi583DeLength2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DeLength2Counter != sharedCounter;
            localSi583DeLength2Counter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DE_LENGTH_2_LEN = 2;
  	/**
	 * serializeSi583DeLength2
	 */
	protected void serializeSi583DeLength2(short si583DeLength2) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DeLength2,SI_583_DE_LENGTH_2_LEN)
                  ,beginSi583DeLength2
                  ,SI_583_DE_LENGTH_2_LEN
                 );
            localSi583DeLength2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi583DeLength2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi583DeLength2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi583DeLength2() {	 
			return (getShort(beginSi583DeLength2));
   	}




}
  
