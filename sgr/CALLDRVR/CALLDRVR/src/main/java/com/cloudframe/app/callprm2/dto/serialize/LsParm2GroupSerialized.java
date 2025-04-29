package com.cloudframe.app.callprm2.dto.serialize;

/**
*  The class LsParm2GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsParm2GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParm2GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_2_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParm2;
	
	/**
	* Constructor for LsParm2GroupSerialized
	**/
    public LsParm2GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParm2GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_2_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParm2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsParm2Counter = -1;
         public boolean isLsParm2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsParm2Counter != sharedCounter;
            localLsParm2Counter = sharedCounter; return hasModified; 
         }
   protected static final int LS_PARM_2_LEN = 2;
  	/**
	 * serializeLsParm2
	 */
	protected void serializeLsParm2(short lsParm2) {
           replaceValue( //  save the value as string
                   getBinaryString( lsParm2,LS_PARM_2_LEN)
                  ,beginLsParm2
                  ,LS_PARM_2_LEN
                 );
            localLsParm2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLsParm2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsParm2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLsParm2() {	 
			return (getShort(beginLsParm2));
   	}




}
  
