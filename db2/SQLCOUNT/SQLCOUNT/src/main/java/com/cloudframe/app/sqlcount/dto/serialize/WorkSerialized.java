package com.cloudframe.app.sqlcount.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCountComp34;
            protected  int beginCountComp38;
            protected  int beginCountComp311;
            protected  int beginCountComp314;
            protected  int beginCountComp3104;
            protected  int beginCountEdit;
            protected  int beginCountEdit2;
            protected  int beginSqlcode_Ws;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginCountComp34 = getStartOffset() + 0;	// set offset for serialization
  
             beginCountComp38 = getStartOffset() + 3;	// set offset for serialization
  
             beginCountComp311 = getStartOffset() + 8;	// set offset for serialization
  
             beginCountComp314 = getStartOffset() + 14;	// set offset for serialization
  
             beginCountComp3104 = getStartOffset() + 22;	// set offset for serialization
  
             beginCountEdit = getStartOffset() + 30;	// set offset for serialization
  
             beginCountEdit2 = getStartOffset() + 44;	// set offset for serialization
  
             beginSqlcode_Ws = getStartOffset() + 59;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localShortCountCompCounter = -1;
         public boolean isShortCountCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localShortCountCompCounter != sharedCounter;
            localShortCountCompCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkShortCountCompMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localIntCountCompCounter = -1;
         public boolean isIntCountCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIntCountCompCounter != sharedCounter;
            localIntCountCompCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIntCountCompMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localLongCountCompCounter = -1;
         public boolean isLongCountCompModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLongCountCompCounter != sharedCounter;
            localLongCountCompCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkLongCountCompMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
        int localCountComp34Counter = -1;
        public boolean isCountComp34Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCountComp34Counter != sharedCounter;
           localCountComp34Counter = sharedCounter; return hasModified; 
        }
	    public boolean countComp34IsNumeric() {
	      return decimalIsNumeric(beginCountComp34,COUNT_COMP_34_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COUNT_COMP_34_LEN = 3;
  	/**
	 * 	serializeCountComp34
	 */
	protected void serializeCountComp34(short countComp34) {
		   putDecimal(beginCountComp34,countComp34,COUNT_COMP_34_LEN,true);
   }
   

   protected short checkCountComp34MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshCountComp34 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCountComp34() throws CFException {	
   	try { 
		 return (getShortDecimal(beginCountComp34,COUNT_COMP_34_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("countComp34", beginCountComp34,COUNT_COMP_34_LEN);
     }
   	}
        int localCountComp38Counter = -1;
        public boolean isCountComp38Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCountComp38Counter != sharedCounter;
           localCountComp38Counter = sharedCounter; return hasModified; 
        }
	    public boolean countComp38IsNumeric() {
	      return decimalIsNumeric(beginCountComp38,COUNT_COMP_38_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COUNT_COMP_38_LEN = 5;
  	/**
	 * 	serializeCountComp38
	 */
	protected void serializeCountComp38(int countComp38) {
		   putDecimal(beginCountComp38,countComp38,COUNT_COMP_38_LEN,true);
   }
   

   protected int checkCountComp38MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCountComp38 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCountComp38() throws CFException {	
   	try { 
		 return (getIntDecimal(beginCountComp38,COUNT_COMP_38_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("countComp38", beginCountComp38,COUNT_COMP_38_LEN);
     }
   	}
        int localCountComp311Counter = -1;
        public boolean isCountComp311Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCountComp311Counter != sharedCounter;
           localCountComp311Counter = sharedCounter; return hasModified; 
        }
	    public boolean countComp311IsNumeric() {
	      return decimalIsNumeric(beginCountComp311,COUNT_COMP_311_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COUNT_COMP_311_LEN = 6;
  	/**
	 * 	serializeCountComp311
	 */
	protected void serializeCountComp311(long countComp311) {
		   putDecimal(beginCountComp311,countComp311,COUNT_COMP_311_LEN,true);
   }
   

   protected long checkCountComp311MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCountComp311 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCountComp311() throws CFException {	
   	try { 
		 return (getLongDecimal(beginCountComp311,COUNT_COMP_311_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("countComp311", beginCountComp311,COUNT_COMP_311_LEN);
     }
   	}
        int localCountComp314Counter = -1;
        public boolean isCountComp314Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCountComp314Counter != sharedCounter;
           localCountComp314Counter = sharedCounter; return hasModified; 
        }
	    public boolean countComp314IsNumeric() {
	      return decimalIsNumeric(beginCountComp314,COUNT_COMP_314_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int COUNT_COMP_314_LEN = 8;
  	/**
	 * 	serializeCountComp314
	 */
	protected void serializeCountComp314(long countComp314) {
		   putDecimal(beginCountComp314,countComp314,COUNT_COMP_314_LEN,true);
   }
   

   protected long checkCountComp314MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCountComp314 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCountComp314() throws CFException {	
   	try { 
		 return (getLongDecimal(beginCountComp314,COUNT_COMP_314_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("countComp314", beginCountComp314,COUNT_COMP_314_LEN);
     }
   	}
        int localCountComp3104Counter = -1;
        public boolean isCountComp3104Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCountComp3104Counter != sharedCounter;
           localCountComp3104Counter = sharedCounter; return hasModified; 
        }
	    public boolean countComp3104IsNumeric() {
	      return decimalIsNumeric(beginCountComp3104,COUNT_COMP_3104_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] countComp3104String() {
            return getPackedString(beginCountComp3104,COUNT_COMP_3104_LEN);
         }
   protected static final int COUNT_COMP_3104_LEN = 8;
   protected static final int COUNT_COMP_3104_SCALE = 4;
  	/**
	 * 	serializeCountComp3104
	 */
	protected void serializeCountComp3104(BigDecimal countComp3104) {
		   putDecimal(beginCountComp3104,countComp3104,COUNT_COMP_3104_LEN,COUNT_COMP_3104_SCALE,true);
		 localCountComp3104Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCountComp3104MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshCountComp3104 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCountComp3104() throws CFException {	
   	try { 
		 return (getDecimal(beginCountComp3104,COUNT_COMP_3104_LEN,COUNT_COMP_3104_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("countComp3104", beginCountComp3104,COUNT_COMP_3104_LEN);
     }
   	}
     int localCountEditCounter = -1;
     public boolean isCountEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountEditCounter != sharedCounter;
         localCountEditCounter = sharedCounter; return hasModified;
     }
	protected static final int COUNT_EDIT_LEN = 14;
	/**
	 * 	serialize this CountEdit
	 */
   protected void serializeCountEdit(char[] countEdit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(countEdit,0,getStringValue(),beginCountEdit,COUNT_EDIT_LEN);
       localCountEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountEditConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshCountEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountEdit() {	 
   		return (substring(getStringValue(),beginCountEdit,beginCountEdit + COUNT_EDIT_LEN));
   	}
     int localCountEdit2Counter = -1;
     public boolean isCountEdit2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountEdit2Counter != sharedCounter;
         localCountEdit2Counter = sharedCounter; return hasModified;
     }
	protected static final int COUNT_EDIT_2_LEN = 15;
	/**
	 * 	serialize this CountEdit2
	 */
   protected void serializeCountEdit2(char[] countEdit2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(countEdit2,0,getStringValue(),beginCountEdit2,COUNT_EDIT_2_LEN);
       localCountEdit2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountEdit2Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshCountEdit2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountEdit2() {	 
   		return (substring(getStringValue(),beginCountEdit2,beginCountEdit2 + COUNT_EDIT_2_LEN));
   	}
     int localSqlcode_WsCounter = -1;
     public boolean isSqlcode_WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcode_WsCounter != sharedCounter;
         localSqlcode_WsCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE__WS_LEN = 4;
	/**
	 * 	serialize this Sqlcode_Ws
	 */
   protected void serializeSqlcode_Ws(char[] sqlcode_Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcode_Ws,0,getStringValue(),beginSqlcode_Ws,SQLCODE__WS_LEN);
       localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcode_WsConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcode_Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcode_Ws() {	 
   		return (substring(getStringValue(),beginSqlcode_Ws,beginSqlcode_Ws + SQLCODE__WS_LEN));
   	}




}
  
