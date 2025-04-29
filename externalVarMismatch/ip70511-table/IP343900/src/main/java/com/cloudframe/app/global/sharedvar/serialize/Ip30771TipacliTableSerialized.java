package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30771TipacliTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip30771TipacliTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30771TipacliTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30771_TIPACLI_TABLE_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30771ClrCyclId;
            protected  int beginIp30771SetlCyclId;
	
	/**
	* Constructor for Ip30771TipacliTableSerialized
	**/
    public Ip30771TipacliTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip30771TipacliTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30771_TIPACLI_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30771ClrCyclId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp30771SetlCyclId = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localIp30771ClrCyclIdCounter = -1;
        public boolean isIp30771ClrCyclIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp30771ClrCyclIdCounter != sharedCounter;
           localIp30771ClrCyclIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip30771ClrCyclIdIsNumeric() {
	      return decimalIsNumeric(beginIp30771ClrCyclId,IP_30771_CLR_CYCL_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_30771_CLR_CYCL_ID_LEN = 2;
  	/**
	 * 	serializeIp30771ClrCyclId
	 */
	protected void serializeIp30771ClrCyclId(short ip30771ClrCyclId) {
		   putDecimal(beginIp30771ClrCyclId,ip30771ClrCyclId,IP_30771_CLR_CYCL_ID_LEN,true);
   }
   

   protected short checkIp30771ClrCyclIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp30771ClrCyclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp30771ClrCyclId() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp30771ClrCyclId,IP_30771_CLR_CYCL_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip30771ClrCyclId", beginIp30771ClrCyclId,IP_30771_CLR_CYCL_ID_LEN);
     }
   	}
        int localIp30771SetlCyclIdCounter = -1;
        public boolean isIp30771SetlCyclIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp30771SetlCyclIdCounter != sharedCounter;
           localIp30771SetlCyclIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip30771SetlCyclIdIsNumeric() {
	      return decimalIsNumeric(beginIp30771SetlCyclId,IP_30771_SETL_CYCL_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_30771_SETL_CYCL_ID_LEN = 2;
  	/**
	 * 	serializeIp30771SetlCyclId
	 */
	protected void serializeIp30771SetlCyclId(short ip30771SetlCyclId) {
		   putDecimal(beginIp30771SetlCyclId,ip30771SetlCyclId,IP_30771_SETL_CYCL_ID_LEN,true);
   }
   

   protected short checkIp30771SetlCyclIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp30771SetlCyclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp30771SetlCyclId() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp30771SetlCyclId,IP_30771_SETL_CYCL_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip30771SetlCyclId", beginIp30771SetlCyclId,IP_30771_SETL_CYCL_ID_LEN);
     }
   	}




}
  
