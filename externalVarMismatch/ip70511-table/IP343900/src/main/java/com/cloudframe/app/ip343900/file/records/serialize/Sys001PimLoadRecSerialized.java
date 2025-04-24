package com.cloudframe.app.ip343900.file.records.serialize;

/**
*  The class Sys001PimLoadRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001PimLoadRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001PimLoadRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_PIM_LOAD_REC_LENGTH = 94;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001StatCd;
	
	/**
	* Constructor for Sys001PimLoadRecSerialized
	**/
    public Sys001PimLoadRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001PimLoadRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_PIM_LOAD_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001StatCd = getStartOffset() + 93;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001StatCdCounter = -1;
     public boolean isSys001StatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001StatCdCounter != sharedCounter;
         localSys001StatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_STAT_CD_LEN = 1;
	/**
	 * 	serialize this Sys001StatCd
	 */
   protected void serializeSys001StatCd(char[] sys001StatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001StatCd,0,getStringValue(),beginSys001StatCd,SYS_001_STAT_CD_LEN);
       localSys001StatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001StatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys001StatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001StatCd() {	 
   		return (substring(getStringValue(),beginSys001StatCd,beginSys001StatCd + SYS_001_STAT_CD_LEN));
   	}




}
  
