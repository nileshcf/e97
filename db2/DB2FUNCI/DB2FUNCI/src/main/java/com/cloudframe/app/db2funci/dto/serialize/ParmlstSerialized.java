package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class ParmlstSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmlstSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmlstSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMLST_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmlen;
            protected  int beginParmtxt;
	
	/**
	* Constructor for ParmlstSerialized
	**/
    public ParmlstSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ParmlstSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParmlstSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ParmlstSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ParmlstSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ParmlstSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMLST_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmlen = getStartOffset() + 0;	// set offset for serialization
  
             beginParmtxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParmlenCounter = -1;
         public boolean isParmlenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmlenCounter != sharedCounter;
            localParmlenCounter = sharedCounter; return hasModified; 
         }
   protected static final int PARMLEN_LEN = 2;
  	/**
	 * serializeParmlen
	 */
	protected void serializeParmlen(short parmlen) {
           replaceValue( //  save the value as string
                   getBinaryString( parmlen,PARMLEN_LEN)
                  ,beginParmlen
                  ,PARMLEN_LEN
                 );
            localParmlenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmlenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmlen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmlen() {	 
			return (getShort(beginParmlen));
   	}
     int localParmtxtCounter = -1;
     public boolean isParmtxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmtxtCounter != sharedCounter;
         localParmtxtCounter = sharedCounter; return hasModified;
     }
	protected static final int PARMTXT_LEN = 254;
	/**
	 * 	serialize this Parmtxt
	 */
   protected void serializeParmtxt(char[] parmtxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmtxt,0,getStringValue(),beginParmtxt,PARMTXT_LEN);
       localParmtxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmtxtConstraints(char[] value) {
   			return super.checkConstraints(value , 254 ,false, false);
   }
    /**
	 *	refreshParmtxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmtxt() {	 
   		return (substring(getStringValue(),beginParmtxt,beginParmtxt + PARMTXT_LEN));
   	}




}
  
