package com.cloudframe.app.callprm2.dto.serialize;

/**
*  The class LsParm5GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsParm5GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParm5GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_5_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParm5;
	
	/**
	* Constructor for LsParm5GroupSerialized
	**/
    public LsParm5GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParm5GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_5_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParm5 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsParm5Counter = -1;
         public boolean isLsParm5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsParm5Counter != sharedCounter;
            localLsParm5Counter = sharedCounter; return hasModified; 
         }
   protected static final int LS_PARM_5_LEN = 2;
  	/**
	 * serializeLsParm5
	 */
	protected void serializeLsParm5(short lsParm5) {
           replaceValue( //  save the value as string
                   getBinaryString( lsParm5,LS_PARM_5_LEN)
                  ,beginLsParm5
                  ,LS_PARM_5_LEN
                 );
            localLsParm5Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLsParm5MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsParm5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLsParm5() {	 
			return (getShort(beginLsParm5));
   	}




}
  
