package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WorkCompTwoGroup808Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkCompTwoGroup808Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkCompTwoGroup808Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_COMP_TWO_GROUP_808_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWorkCompTwo808;
	
	/**
	* Constructor for WorkCompTwoGroup808Serialized
	**/
    public WorkCompTwoGroup808Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkCompTwoGroup808Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_COMP_TWO_GROUP_808_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWorkCompTwo808 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localWorkCompTwo808Counter = -1;
         public boolean isWorkCompTwo808Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWorkCompTwo808Counter != sharedCounter;
            localWorkCompTwo808Counter = sharedCounter; return hasModified; 
         }
   protected static final int WORK_COMP_TWO_808_LEN = 2;
  	/**
	 * serializeWorkCompTwo808
	 */
	protected void serializeWorkCompTwo808(int workCompTwo808) {
           replaceValue( //  save the value as string
                   getBinaryString( workCompTwo808,WORK_COMP_TWO_808_LEN)
                  ,beginWorkCompTwo808
                  ,WORK_COMP_TWO_808_LEN
                 );
            localWorkCompTwo808Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWorkCompTwo808MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWorkCompTwo808 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWorkCompTwo808() {	 
			return (getUnsignedShort(beginWorkCompTwo808));
   	}




}
  
