package com.cloudframe.app.crazy88.dto.serialize;

/**
*  The class WISerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WISerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WISerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_I_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginI;
	
	/**
	* Constructor for WISerialized
	**/
    public WISerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WISerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_I_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginI = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
   protected static final int I_LEN = 2;
  	/**
	 * serializeI
	 */
	protected void serializeI(short i) {
           replaceValue( //  save the value as string
                   getBinaryString( i,I_LEN)
                  ,beginI
                  ,I_LEN
                 );
            localICounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshI() {	 
			return (getShort(beginI));
   	}




}
  
