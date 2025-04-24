package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class StrtLngth800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StrtLngth800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StrtLngth800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STRT_LNGTH_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCandidateStrt800;
            protected  int beginCandidateLnth800;
	
	/**
	* Constructor for StrtLngth800Serialized
	**/
    public StrtLngth800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StrtLngth800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STRT_LNGTH_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCandidateStrt800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCandidateLnth800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCandidateStrt800Counter = -1;
         public boolean isCandidateStrt800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCandidateStrt800Counter != sharedCounter;
            localCandidateStrt800Counter = sharedCounter; return hasModified; 
         }
   protected static final int CANDIDATE_STRT_800_LEN = 2;
  	/**
	 * serializeCandidateStrt800
	 */
	protected void serializeCandidateStrt800(short candidateStrt800) {
           replaceValue( //  save the value as string
                   getBinaryString( candidateStrt800,CANDIDATE_STRT_800_LEN)
                  ,beginCandidateStrt800
                  ,CANDIDATE_STRT_800_LEN
                 );
            localCandidateStrt800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCandidateStrt800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCandidateStrt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCandidateStrt800() {	 
			return (getShort(beginCandidateStrt800));
   	}
         int localCandidateLnth800Counter = -1;
         public boolean isCandidateLnth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCandidateLnth800Counter != sharedCounter;
            localCandidateLnth800Counter = sharedCounter; return hasModified; 
         }
   protected static final int CANDIDATE_LNTH_800_LEN = 2;
  	/**
	 * serializeCandidateLnth800
	 */
	protected void serializeCandidateLnth800(short candidateLnth800) {
           replaceValue( //  save the value as string
                   getBinaryString( candidateLnth800,CANDIDATE_LNTH_800_LEN)
                  ,beginCandidateLnth800
                  ,CANDIDATE_LNTH_800_LEN
                 );
            localCandidateLnth800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCandidateLnth800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCandidateLnth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCandidateLnth800() {	 
			return (getShort(beginCandidateLnth800));
   	}




}
  
