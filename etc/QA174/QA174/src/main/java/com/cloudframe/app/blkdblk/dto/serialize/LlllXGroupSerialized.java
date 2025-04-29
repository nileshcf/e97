package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class LlllXGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LlllXGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LlllXGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LLLL_XGROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLlllX;
            protected  int beginLlll;
	
	/**
	* Constructor for LlllXGroupSerialized
	**/
    public LlllXGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LlllXGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LLLL_XGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLlllX = getStartOffset() + 0;	// set offset for serialization
  
             beginLlll = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLlllXCounter = -1;
     public boolean isLlllXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLlllXCounter != sharedCounter;
         localLlllXCounter = sharedCounter; return hasModified;
     }
	protected static final int LLLL_X_LEN = 4;
	/**
	 * 	serialize this LlllX
	 */
   protected void serializeLlllX(char[] llllX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(llllX,0,getStringValue(),beginLlllX,LLLL_X_LEN);
       localLlllXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLlllXConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshLlllX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLlllX() {	 
   		return (substring(getStringValue(),beginLlllX,beginLlllX + LLLL_X_LEN));
   	}
         int localLlllCounter = -1;
         public boolean isLlllModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLlllCounter != sharedCounter;
            localLlllCounter = sharedCounter; return hasModified; 
         }
   protected static final int LLLL_LEN = 4;
  	/**
	 * serializeLlll
	 */
	protected void serializeLlll(long llll) {
           replaceValue( //  save the value as string
                   getBinaryString( llll,LLLL_LEN)
                  ,beginLlll
                  ,LLLL_LEN
                 );
            localLlllCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkLlllMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLlll is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLlll() {	 
			return (getUnsignedInt(beginLlll));
   	}




}
  
