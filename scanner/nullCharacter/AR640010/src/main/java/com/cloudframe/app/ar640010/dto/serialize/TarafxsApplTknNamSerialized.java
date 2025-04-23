package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TarafxsApplTknNamSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TarafxsApplTknNamSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TarafxsApplTknNamSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TARAFXS_APPL_TKN_NAM_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTarafxsApplTknNamLen;
            protected  int beginTarafxsApplTknNamTxt;
	
	/**
	* Constructor for TarafxsApplTknNamSerialized
	**/
    public TarafxsApplTknNamSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TarafxsApplTknNamSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsApplTknNamSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TarafxsApplTknNamSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1033); // serialize this field at offset 1033 by default 
    }
    
	/**
	* sets parent for this TarafxsApplTknNamSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1033 by default
    }    
	/**
	* initializes the field in TarafxsApplTknNamSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TARAFXS_APPL_TKN_NAM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTarafxsApplTknNamLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTarafxsApplTknNamTxt = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTarafxsApplTknNamLenCounter = -1;
         public boolean isTarafxsApplTknNamLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTarafxsApplTknNamLenCounter != sharedCounter;
            localTarafxsApplTknNamLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TARAFXS_APPL_TKN_NAM_LEN_LEN = 2;
  	/**
	 * serializeTarafxsApplTknNamLen
	 */
	protected void serializeTarafxsApplTknNamLen(short tarafxsApplTknNamLen) {
           replaceValue( //  save the value as string
                   getBinaryString( tarafxsApplTknNamLen,TARAFXS_APPL_TKN_NAM_LEN_LEN)
                  ,beginTarafxsApplTknNamLen
                  ,TARAFXS_APPL_TKN_NAM_LEN_LEN
                 );
            localTarafxsApplTknNamLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTarafxsApplTknNamLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTarafxsApplTknNamLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTarafxsApplTknNamLen() {	 
			return (getShort(beginTarafxsApplTknNamLen));
   	}
     int localTarafxsApplTknNamTxtCounter = -1;
     public boolean isTarafxsApplTknNamTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsApplTknNamTxtCounter != sharedCounter;
         localTarafxsApplTknNamTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int TARAFXS_APPL_TKN_NAM_TXT_LEN = 128;
	/**
	 * 	serialize this TarafxsApplTknNamTxt
	 */
   protected void serializeTarafxsApplTknNamTxt(char[] tarafxsApplTknNamTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tarafxsApplTknNamTxt,0,getStringValue(),beginTarafxsApplTknNamTxt,TARAFXS_APPL_TKN_NAM_TXT_LEN);
       localTarafxsApplTknNamTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTarafxsApplTknNamTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshTarafxsApplTknNamTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTarafxsApplTknNamTxt() {	 
   		return (substring(getStringValue(),beginTarafxsApplTknNamTxt,beginTarafxsApplTknNamTxt + TARAFXS_APPL_TKN_NAM_TXT_LEN));
   	}




}
  
