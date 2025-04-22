package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class TblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCharA;
            protected  int beginIntA;
            protected  int beginChar2A;
	
	/**
	* Constructor for TblSerialized
	**/
    public TblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14); // serialize this field at offset 14 by default 
    }
    
	/**
	* sets parent for this TblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14 by default
    }    
	/**
	* initializes the field in TblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCharA = getStartOffset() + 3;	// set offset for serialization
  
             beginIntA = getStartOffset() + 4;	// set offset for serialization
  
             beginChar2A = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCharACounter = -1;
     public boolean isCharAModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharACounter != sharedCounter;
         localCharACounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_A_LEN = 1;
	/**
	 * 	serialize this CharA
	 */
   protected void serializeCharA(char[] charA) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charA,0,getStringValue(),beginCharA,CHAR_A_LEN);
       localCharACounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharAConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharA() {	 
   		return (substring(getStringValue(),beginCharA,beginCharA + CHAR_A_LEN));
   	}
         int localIntACounter = -1;
         public boolean isIntAModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIntACounter != sharedCounter;
            localIntACounter = sharedCounter; return hasModified; 
         }
   protected static final int INT_A_LEN = 4;
  	/**
	 * serializeIntA
	 */
	protected void serializeIntA(int intA) {
           replaceValue( //  save the value as string
                   getBinaryString( intA,INT_A_LEN)
                  ,beginIntA
                  ,INT_A_LEN
                 );
            localIntACounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIntA() {	 
			return (getInt(beginIntA));
   	}
     int localChar2ACounter = -1;
     public boolean isChar2AModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChar2ACounter != sharedCounter;
         localChar2ACounter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_2_A_LEN = 5;
	/**
	 * 	serialize this Char2A
	 */
   protected void serializeChar2A(char[] char2A) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(char2A,0,getStringValue(),beginChar2A,CHAR_2_A_LEN);
       localChar2ACounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChar2AConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshChar2A is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChar2A() {	 
   		return (substring(getStringValue(),beginChar2A,beginChar2A + CHAR_2_A_LEN));
   	}




}
  
