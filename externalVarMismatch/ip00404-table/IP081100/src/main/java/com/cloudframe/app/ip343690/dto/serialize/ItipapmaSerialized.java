package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class ItipapmaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ItipapmaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ItipapmaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ITIPAPMA_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTipapmaPrimAcctSeqNumN;
	
	/**
	* Constructor for ItipapmaSerialized
	**/
    public ItipapmaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ItipapmaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ITIPAPMA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTipapmaPrimAcctSeqNumN = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTipapmaPrimAcctSeqNumNCounter = -1;
         public boolean isTipapmaPrimAcctSeqNumNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTipapmaPrimAcctSeqNumNCounter != sharedCounter;
            localTipapmaPrimAcctSeqNumNCounter = sharedCounter; return hasModified; 
         }
   protected static final int TIPAPMA_PRIM_ACCT_SEQ_NUM_N_LEN = 2;
  	/**
	 * serializeTipapmaPrimAcctSeqNumN
	 */
	protected void serializeTipapmaPrimAcctSeqNumN(short tipapmaPrimAcctSeqNumN) {
           replaceValue( //  save the value as string
                   getBinaryString( tipapmaPrimAcctSeqNumN,TIPAPMA_PRIM_ACCT_SEQ_NUM_N_LEN)
                  ,beginTipapmaPrimAcctSeqNumN
                  ,TIPAPMA_PRIM_ACCT_SEQ_NUM_N_LEN
                 );
            localTipapmaPrimAcctSeqNumNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTipapmaPrimAcctSeqNumNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTipapmaPrimAcctSeqNumN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTipapmaPrimAcctSeqNumN() {	 
			return (getShort(beginTipapmaPrimAcctSeqNumN));
   	}




}
  
