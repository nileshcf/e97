package com.cloudframe.app.cfsort09.dto.serialize;

/**
*  The class LParmGSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LParmGSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LParmGSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_PARM_G_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLParmLen;
            protected  int beginLParmSortKey;
	
	/**
	* Constructor for LParmGSerialized
	**/
    public LParmGSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LParmGSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_PARM_G_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLParmLen = getStartOffset() + 0;	// set offset for serialization
  
             beginLParmSortKey = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLParmLenCounter = -1;
         public boolean isLParmLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLParmLenCounter != sharedCounter;
            localLParmLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int L_PARM_LEN_LEN = 2;
  	/**
	 * serializeLParmLen
	 */
	protected void serializeLParmLen(short lParmLen) {
           replaceValue( //  save the value as string
                   getBinaryString( lParmLen,L_PARM_LEN_LEN)
                  ,beginLParmLen
                  ,L_PARM_LEN_LEN
                 );
            localLParmLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLParmLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLParmLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLParmLen() {	 
			return (getShort(beginLParmLen));
   	}
     int localLParmSortKeyCounter = -1;
     public boolean isLParmSortKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLParmSortKeyCounter != sharedCounter;
         localLParmSortKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int L_PARM_SORT_KEY_LEN = 8;
	/**
	 * 	serialize this LParmSortKey
	 */
   protected void serializeLParmSortKey(char[] lParmSortKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lParmSortKey,0,getStringValue(),beginLParmSortKey,L_PARM_SORT_KEY_LEN);
       localLParmSortKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLParmSortKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshLParmSortKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLParmSortKey() {	 
   		return (substring(getStringValue(),beginLParmSortKey,beginLParmSortKey + L_PARM_SORT_KEY_LEN));
   	}




}
  
