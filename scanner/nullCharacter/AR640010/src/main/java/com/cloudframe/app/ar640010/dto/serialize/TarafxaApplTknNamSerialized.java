package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxaApplTknNamSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarafxaApplTknNamSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxaApplTknNamSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXA_APPL_TKN_NAM_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxaApplTknNamLen;
            protected  int beginTarafxaApplTknNamTxt;
	
	/**
	* Constructor for TarafxaApplTknNamSerialized
	**/
    public TarafxaApplTknNamSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TarafxaApplTknNamSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaApplTknNamSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TarafxaApplTknNamSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1033); // serialize this field at offset 1033 by default 
    }
    
	/**
	* sets parent for this TarafxaApplTknNamSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1033 by default
    }    
	/**
	* initializes the field in TarafxaApplTknNamSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXA_APPL_TKN_NAM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxaApplTknNamLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxaApplTknNamTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxaApplTknNamLenCounter = -1;
         public boolean isTarafxaApplTknNamLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxaApplTknNamLenCounter != sharedCounter;
            localTarafxaApplTknNamLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXA_APPL_TKN_NAM_LEN_LEN = 2;
  	/**
	 * serializeTarafxaApplTknNamLen
	 */
	protected void serializeTarafxaApplTknNamLen(short tarafxaApplTknNamLen) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxaApplTknNamLen,TARAFXA_APPL_TKN_NAM_LEN_LEN)
                  ,beginTarafxaApplTknNamLen
                  ,TARAFXA_APPL_TKN_NAM_LEN_LEN
                 );
            localTarafxaApplTknNamLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxaApplTknNamLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxaApplTknNamLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxaApplTknNamLen() {	 
			return (getShort(beginTarafxaApplTknNamLen));
   	}
     int localTarafxaApplTknNamTxtCounter = -1;
     public boolean isTarafxaApplTknNamTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaApplTknNamTxtCounter != sharedCounter;
         localTarafxaApplTknNamTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXA_APPL_TKN_NAM_TXT_LEN = 128;
	/**
	 * 	serialize this TarafxaApplTknNamTxt
	 */
   protected void serializeTarafxaApplTknNamTxt(char[] tarafxaApplTknNamTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxaApplTknNamTxt,0,getStringValue(),beginTarafxaApplTknNamTxt,TARAFXA_APPL_TKN_NAM_TXT_LEN);
       localTarafxaApplTknNamTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxaApplTknNamTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshTarafxaApplTknNamTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxaApplTknNamTxt() {	 
   		return (substring(getStringValue(),beginTarafxaApplTknNamTxt,beginTarafxaApplTknNamTxt + TARAFXA_APPL_TKN_NAM_TXT_LEN));
   	}




}
  
