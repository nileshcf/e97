package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AAcqA09DeniedCntSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360AAcqA09DeniedCntSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AAcqA09DeniedCntSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_AACQ_A_09_DENIED_CNT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360AAcqA09DeniedCntCr;
            protected  int beginX360AAcqA09DeniedCntDb;
	
	/**
	* Constructor for X360AAcqA09DeniedCntSerialized
	**/
    public X360AAcqA09DeniedCntSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AAcqA09DeniedCntSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AAcqA09DeniedCntSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AAcqA09DeniedCntSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1072); // serialize this field at offset 1072 by default 
    }
    
	/**
	* sets parent for this X360AAcqA09DeniedCntSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1072 by default
    }    
	/**
	* initializes the field in X360AAcqA09DeniedCntSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_AACQ_A_09_DENIED_CNT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360AAcqA09DeniedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360AAcqA09DeniedCntDb = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360AAcqA09DeniedCntCrCounter = -1;
        public boolean isX360AAcqA09DeniedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09DeniedCntCrCounter != sharedCounter;
           localX360AAcqA09DeniedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09DeniedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09DeniedCntCr,X_360_AACQ_A_09_DENIED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_DENIED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AAcqA09DeniedCntCr
	 */
	protected void serializeX360AAcqA09DeniedCntCr(int x360AAcqA09DeniedCntCr) {
		   putDecimal(beginX360AAcqA09DeniedCntCr,x360AAcqA09DeniedCntCr,X_360_AACQ_A_09_DENIED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AAcqA09DeniedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09DeniedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqA09DeniedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqA09DeniedCntCr,X_360_AACQ_A_09_DENIED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09DeniedCntCr", beginX360AAcqA09DeniedCntCr,X_360_AACQ_A_09_DENIED_CNT_CR_LEN);
     }
   	}
        int localX360AAcqA09DeniedCntDbCounter = -1;
        public boolean isX360AAcqA09DeniedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09DeniedCntDbCounter != sharedCounter;
           localX360AAcqA09DeniedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09DeniedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09DeniedCntDb,X_360_AACQ_A_09_DENIED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_DENIED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AAcqA09DeniedCntDb
	 */
	protected void serializeX360AAcqA09DeniedCntDb(int x360AAcqA09DeniedCntDb) {
		   putDecimal(beginX360AAcqA09DeniedCntDb,x360AAcqA09DeniedCntDb,X_360_AACQ_A_09_DENIED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AAcqA09DeniedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09DeniedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqA09DeniedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqA09DeniedCntDb,X_360_AACQ_A_09_DENIED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09DeniedCntDb", beginX360AAcqA09DeniedCntDb,X_360_AACQ_A_09_DENIED_CNT_DB_LEN);
     }
   	}




}
  
