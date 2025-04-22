package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class SrceTrgCurExpErr0rMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SrceTrgCurExpErr0rMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SrceTrgCurExpErr0rMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRCE_TRG_CUR_EXP_ERR_0R_MSG_600_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSrceCurrValue600;
            protected  int beginSrceExpValue600;
            protected  int beginTrgCurrValue600;
            protected  int beginTrgExpValue600;
	
	/**
	* Constructor for SrceTrgCurExpErr0rMsg600Serialized
	**/
    public SrceTrgCurExpErr0rMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SrceTrgCurExpErr0rMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRCE_TRG_CUR_EXP_ERR_0R_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginSrceCurrValue600 = getStartOffset() + 29;	// set offset for serialization
  
  
             beginSrceExpValue600 = getStartOffset() + 33;	// set offset for serialization
  
  
  
             beginTrgCurrValue600 = getStartOffset() + 43;	// set offset for serialization
  
  
             beginTrgExpValue600 = getStartOffset() + 47;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSrceCurrValue600Counter = -1;
     public boolean isSrceCurrValue600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrceCurrValue600Counter != sharedCounter;
         localSrceCurrValue600Counter = sharedCounter; return hasModified;
     }
	protected static final int SRCE_CURR_VALUE_600_LEN = 3;
	/**
	 * 	serialize this SrceCurrValue600
	 */
   protected void serializeSrceCurrValue600(char[] srceCurrValue600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srceCurrValue600,0,getStringValue(),beginSrceCurrValue600,SRCE_CURR_VALUE_600_LEN);
       localSrceCurrValue600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrceCurrValue600Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSrceCurrValue600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrceCurrValue600() {	 
   		return (substring(getStringValue(),beginSrceCurrValue600,beginSrceCurrValue600 + SRCE_CURR_VALUE_600_LEN));
   	}
     int localSrceExpValue600Counter = -1;
     public boolean isSrceExpValue600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrceExpValue600Counter != sharedCounter;
         localSrceExpValue600Counter = sharedCounter; return hasModified;
     }
	protected static final int SRCE_EXP_VALUE_600_LEN = 1;
	/**
	 * 	serialize this SrceExpValue600
	 */
   protected void serializeSrceExpValue600(char[] srceExpValue600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srceExpValue600,0,getStringValue(),beginSrceExpValue600,SRCE_EXP_VALUE_600_LEN);
       localSrceExpValue600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrceExpValue600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSrceExpValue600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrceExpValue600() {	 
   		return (substring(getStringValue(),beginSrceExpValue600,beginSrceExpValue600 + SRCE_EXP_VALUE_600_LEN));
   	}
     int localTrgCurrValue600Counter = -1;
     public boolean isTrgCurrValue600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrgCurrValue600Counter != sharedCounter;
         localTrgCurrValue600Counter = sharedCounter; return hasModified;
     }
	protected static final int TRG_CURR_VALUE_600_LEN = 3;
	/**
	 * 	serialize this TrgCurrValue600
	 */
   protected void serializeTrgCurrValue600(char[] trgCurrValue600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trgCurrValue600,0,getStringValue(),beginTrgCurrValue600,TRG_CURR_VALUE_600_LEN);
       localTrgCurrValue600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrgCurrValue600Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTrgCurrValue600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrgCurrValue600() {	 
   		return (substring(getStringValue(),beginTrgCurrValue600,beginTrgCurrValue600 + TRG_CURR_VALUE_600_LEN));
   	}
     int localTrgExpValue600Counter = -1;
     public boolean isTrgExpValue600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrgExpValue600Counter != sharedCounter;
         localTrgExpValue600Counter = sharedCounter; return hasModified;
     }
	protected static final int TRG_EXP_VALUE_600_LEN = 1;
	/**
	 * 	serialize this TrgExpValue600
	 */
   protected void serializeTrgExpValue600(char[] trgExpValue600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(trgExpValue600,0,getStringValue(),beginTrgExpValue600,TRG_EXP_VALUE_600_LEN);
       localTrgExpValue600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTrgExpValue600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTrgExpValue600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTrgExpValue600() {	 
   		return (substring(getStringValue(),beginTrgExpValue600,beginTrgExpValue600 + TRG_EXP_VALUE_600_LEN));
   	}




}
  
