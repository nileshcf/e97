package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class Si520DeAndLengthsGroupArray1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si520DeAndLengthsGroupArray1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si520DeAndLengthsGroupArray1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSi520TblFomat;
            protected  int beginSi520TblLength;
	
	/**
	* Constructor for Si520DeAndLengthsGroupArray1Serialized
	**/
    public Si520DeAndLengthsGroupArray1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Si520DeAndLengthsGroupArray1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsGroupArray1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Si520DeAndLengthsGroupArray1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Si520DeAndLengthsGroupArray1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Si520DeAndLengthsGroupArray1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSi520TblFomat = getStartOffset() + 0;	// set offset for serialization
  
             beginSi520TblLength = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSi520TblFomatCounter = -1;
     public boolean isSi520TblFomatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi520TblFomatCounter != sharedCounter;
         localSi520TblFomatCounter = sharedCounter; return hasModified;
     }
	protected static final int SI_520_TBL_FOMAT_LEN = 1;
	/**
	 * 	serialize this Si520TblFomat
	 */
   protected void serializeSi520TblFomat(char[] si520TblFomat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si520TblFomat,0,getStringValue(),beginSi520TblFomat,SI_520_TBL_FOMAT_LEN);
       localSi520TblFomatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi520TblFomatConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSi520TblFomat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi520TblFomat() {	 
   		return (substring(getStringValue(),beginSi520TblFomat,beginSi520TblFomat + SI_520_TBL_FOMAT_LEN));
   	}
         int localSi520TblLengthCounter = -1;
         public boolean isSi520TblLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi520TblLengthCounter != sharedCounter;
            localSi520TblLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_520_TBL_LENGTH_LEN = 2;
  	/**
	 * serializeSi520TblLength
	 */
	protected void serializeSi520TblLength(short si520TblLength) {
           replaceValue( //  save the value as string
                   getBinaryString( si520TblLength,SI_520_TBL_LENGTH_LEN)
                  ,beginSi520TblLength
                  ,SI_520_TBL_LENGTH_LEN
                 );
            localSi520TblLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi520TblLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi520TblLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi520TblLength() {	 
			return (getShort(beginSi520TblLength));
   	}




}
  
