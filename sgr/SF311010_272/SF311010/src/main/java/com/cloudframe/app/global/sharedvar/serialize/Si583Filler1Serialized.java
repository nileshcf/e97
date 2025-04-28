package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Si583Filler1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si583Filler1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si583Filler1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_583_FILLER_1_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSi583DePresentInd1;
            protected  int beginSi583DeStartingPos1;
            protected  int beginSi583DeLength1;
	
	/**
	* Constructor for Si583Filler1Serialized
	**/
    public Si583Filler1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si583Filler1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583Filler1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si583Filler1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,32876); // serialize this field at offset 32876 by default 
    }
    
	/**
	* sets parent for this Si583Filler1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 32876 by default
    }    
	/**
	* initializes the field in Si583Filler1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_583_FILLER_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSi583DePresentInd1 = getStartOffset() + 0;	// set offset for serialization
  
             beginSi583DeStartingPos1 = getStartOffset() + 1;	// set offset for serialization
  
             beginSi583DeLength1 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSi583DePresentInd1Counter = -1;
     public boolean isSi583DePresentInd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583DePresentInd1Counter != sharedCounter;
         localSi583DePresentInd1Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_583_DE_PRESENT_IND_1_LEN = 1;
	/**
	 * 	serialize this Si583DePresentInd1
	 */
   protected void serializeSi583DePresentInd1(char[] si583DePresentInd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si583DePresentInd1,0,getStringValue(),beginSi583DePresentInd1,SI_583_DE_PRESENT_IND_1_LEN);
       localSi583DePresentInd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi583DePresentInd1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSi583DePresentInd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi583DePresentInd1() {	 
   		return (substring(getStringValue(),beginSi583DePresentInd1,beginSi583DePresentInd1 + SI_583_DE_PRESENT_IND_1_LEN));
   	}
         int localSi583DeStartingPos1Counter = -1;
         public boolean isSi583DeStartingPos1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DeStartingPos1Counter != sharedCounter;
            localSi583DeStartingPos1Counter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DE_STARTING_POS_1_LEN = 2;
  	/**
	 * serializeSi583DeStartingPos1
	 */
	protected void serializeSi583DeStartingPos1(short si583DeStartingPos1) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DeStartingPos1,SI_583_DE_STARTING_POS_1_LEN)
                  ,beginSi583DeStartingPos1
                  ,SI_583_DE_STARTING_POS_1_LEN
                 );
            localSi583DeStartingPos1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi583DeStartingPos1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi583DeStartingPos1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi583DeStartingPos1() {	 
			return (getShort(beginSi583DeStartingPos1));
   	}
         int localSi583DeLength1Counter = -1;
         public boolean isSi583DeLength1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DeLength1Counter != sharedCounter;
            localSi583DeLength1Counter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DE_LENGTH_1_LEN = 2;
  	/**
	 * serializeSi583DeLength1
	 */
	protected void serializeSi583DeLength1(short si583DeLength1) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DeLength1,SI_583_DE_LENGTH_1_LEN)
                  ,beginSi583DeLength1
                  ,SI_583_DE_LENGTH_1_LEN
                 );
            localSi583DeLength1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi583DeLength1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi583DeLength1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi583DeLength1() {	 
			return (getShort(beginSi583DeLength1));
   	}




}
  
