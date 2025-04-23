package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip57901TipaqprEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip57901TipaqprEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip57901TipaqprEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_57901_TIPAQPR_ENTRIES_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp57901JobGroup;
            protected  int beginIp57901JobGrpNum;
            protected  int beginIp57901ProcPriorityNum;
            protected  int beginIp57901ServCd;
            protected  int beginIp57901FuncCd;
            protected  int beginIp57901QueueNum;
	
	/**
	* Constructor for Ip57901TipaqprEntriesSerialized
	**/
    public Ip57901TipaqprEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip57901TipaqprEntriesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip57901TipaqprEntriesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip57901TipaqprEntriesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip57901TipaqprEntriesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip57901TipaqprEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_57901_TIPAQPR_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp57901JobGroup = getStartOffset() + 0;	// set offset for serialization
  
             beginIp57901JobGrpNum = getStartOffset() + 6;	// set offset for serialization
  
             beginIp57901ProcPriorityNum = getStartOffset() + 8;	// set offset for serialization
  
             beginIp57901ServCd = getStartOffset() + 10;	// set offset for serialization
  
             beginIp57901FuncCd = getStartOffset() + 14;	// set offset for serialization
  
             beginIp57901QueueNum = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp57901JobGroupCounter = -1;
     public boolean isIp57901JobGroupModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp57901JobGroupCounter != sharedCounter;
         localIp57901JobGroupCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_57901_JOB_GROUP_LEN = 6;
	/**
	 * 	serialize this Ip57901JobGroup
	 */
   protected void serializeIp57901JobGroup(char[] ip57901JobGroup) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip57901JobGroup,0,getStringValue(),beginIp57901JobGroup,IP_57901_JOB_GROUP_LEN);
       localIp57901JobGroupCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp57901JobGroupConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp57901JobGroup is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp57901JobGroup() {	 
   		return (substring(getStringValue(),beginIp57901JobGroup,beginIp57901JobGroup + IP_57901_JOB_GROUP_LEN));
   	}
        int localIp57901JobGrpNumCounter = -1;
        public boolean isIp57901JobGrpNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp57901JobGrpNumCounter != sharedCounter;
           localIp57901JobGrpNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip57901JobGrpNumIsNumeric() {
	      return decimalIsNumeric(beginIp57901JobGrpNum,IP_57901_JOB_GRP_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_57901_JOB_GRP_NUM_LEN = 2;
  	/**
	 * 	serializeIp57901JobGrpNum
	 */
	protected void serializeIp57901JobGrpNum(short ip57901JobGrpNum) {
		   putDecimal(beginIp57901JobGrpNum,ip57901JobGrpNum,IP_57901_JOB_GRP_NUM_LEN,true);
   }
   

   protected short checkIp57901JobGrpNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_100 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp57901JobGrpNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp57901JobGrpNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp57901JobGrpNum,IP_57901_JOB_GRP_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip57901JobGrpNum", beginIp57901JobGrpNum,IP_57901_JOB_GRP_NUM_LEN);
     }
   	}
        int localIp57901ProcPriorityNumCounter = -1;
        public boolean isIp57901ProcPriorityNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp57901ProcPriorityNumCounter != sharedCounter;
           localIp57901ProcPriorityNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip57901ProcPriorityNumIsNumeric() {
	      return decimalIsNumeric(beginIp57901ProcPriorityNum,IP_57901_PROC_PRIORITY_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_57901_PROC_PRIORITY_NUM_LEN = 2;
  	/**
	 * 	serializeIp57901ProcPriorityNum
	 */
	protected void serializeIp57901ProcPriorityNum(short ip57901ProcPriorityNum) {
		   putDecimal(beginIp57901ProcPriorityNum,ip57901ProcPriorityNum,IP_57901_PROC_PRIORITY_NUM_LEN,true);
   }
   

   protected short checkIp57901ProcPriorityNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp57901ProcPriorityNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp57901ProcPriorityNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp57901ProcPriorityNum,IP_57901_PROC_PRIORITY_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip57901ProcPriorityNum", beginIp57901ProcPriorityNum,IP_57901_PROC_PRIORITY_NUM_LEN);
     }
   	}
     int localIp57901ServCdCounter = -1;
     public boolean isIp57901ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp57901ServCdCounter != sharedCounter;
         localIp57901ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_57901_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip57901ServCd
	 */
   protected void serializeIp57901ServCd(char[] ip57901ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip57901ServCd,0,getStringValue(),beginIp57901ServCd,IP_57901_SERV_CD_LEN);
       localIp57901ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp57901ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp57901ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp57901ServCd() {	 
   		return (substring(getStringValue(),beginIp57901ServCd,beginIp57901ServCd + IP_57901_SERV_CD_LEN));
   	}
     int localIp57901FuncCdCounter = -1;
     public boolean isIp57901FuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp57901FuncCdCounter != sharedCounter;
         localIp57901FuncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_57901_FUNC_CD_LEN = 4;
	/**
	 * 	serialize this Ip57901FuncCd
	 */
   protected void serializeIp57901FuncCd(char[] ip57901FuncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip57901FuncCd,0,getStringValue(),beginIp57901FuncCd,IP_57901_FUNC_CD_LEN);
       localIp57901FuncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp57901FuncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp57901FuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp57901FuncCd() {	 
   		return (substring(getStringValue(),beginIp57901FuncCd,beginIp57901FuncCd + IP_57901_FUNC_CD_LEN));
   	}
        int localIp57901QueueNumCounter = -1;
        public boolean isIp57901QueueNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp57901QueueNumCounter != sharedCounter;
           localIp57901QueueNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip57901QueueNumIsNumeric() {
	      return decimalIsNumeric(beginIp57901QueueNum,IP_57901_QUEUE_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_57901_QUEUE_NUM_LEN = 2;
  	/**
	 * 	serializeIp57901QueueNum
	 */
	protected void serializeIp57901QueueNum(short ip57901QueueNum) {
		   putDecimal(beginIp57901QueueNum,ip57901QueueNum,IP_57901_QUEUE_NUM_LEN,true);
   }
   

   protected short checkIp57901QueueNumMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp57901QueueNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp57901QueueNum() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp57901QueueNum,IP_57901_QUEUE_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip57901QueueNum", beginIp57901QueueNum,IP_57901_QUEUE_NUM_LEN);
     }
   	}




}
  
