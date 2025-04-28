package com.cloudframe.app.bankint1.dto.serialize;

/**
*  The class AcafscedErrorDb2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcafscedErrorDb2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcafscedErrorDb2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACAFSCED_ERROR_DB_2_LENGTH = 340;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcafscedSqlcode;
            protected  int beginAcafscedSqlca;
            protected  int beginAcafscedClaveAcceso;
	
	/**
	* Constructor for AcafscedErrorDb2Serialized
	**/
    public AcafscedErrorDb2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcafscedErrorDb2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedErrorDb2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcafscedErrorDb2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,168); // serialize this field at offset 168 by default 
    }
    
	/**
	* sets parent for this AcafscedErrorDb2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 168 by default
    }    
	/**
	* initializes the field in AcafscedErrorDb2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACAFSCED_ERROR_DB_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcafscedSqlcode = getStartOffset() + 0;	// set offset for serialization
  
             beginAcafscedSqlca = getStartOffset() + 4;	// set offset for serialization
  
             beginAcafscedClaveAcceso = getStartOffset() + 140;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAcafscedSqlcodeCounter = -1;
         public boolean isAcafscedSqlcodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAcafscedSqlcodeCounter != sharedCounter;
            localAcafscedSqlcodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int ACAFSCED_SQLCODE_LEN = 4;
  	/**
	 * serializeAcafscedSqlcode
	 */
	protected void serializeAcafscedSqlcode(int acafscedSqlcode) {
           replaceValue( //  save the value as string
                   getBinaryString( acafscedSqlcode,ACAFSCED_SQLCODE_LEN)
                  ,beginAcafscedSqlcode
                  ,ACAFSCED_SQLCODE_LEN
                 );
            localAcafscedSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAcafscedSqlcodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAcafscedSqlcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAcafscedSqlcode() {	 
			return (getInt(beginAcafscedSqlcode));
   	}
     int localAcafscedSqlcaCounter = -1;
     public boolean isAcafscedSqlcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedSqlcaCounter != sharedCounter;
         localAcafscedSqlcaCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_SQLCA_LEN = 136;
	/**
	 * 	serialize this AcafscedSqlca
	 */
   protected void serializeAcafscedSqlca(char[] acafscedSqlca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedSqlca,0,getStringValue(),beginAcafscedSqlca,ACAFSCED_SQLCA_LEN);
       localAcafscedSqlcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedSqlcaConstraints(char[] value) {
   			return super.checkConstraints(value , 136 ,false, false);
   }
    /**
	 *	refreshAcafscedSqlca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedSqlca() {	 
   		return (substring(getStringValue(),beginAcafscedSqlca,beginAcafscedSqlca + ACAFSCED_SQLCA_LEN));
   	}
     int localAcafscedClaveAccesoCounter = -1;
     public boolean isAcafscedClaveAccesoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcafscedClaveAccesoCounter != sharedCounter;
         localAcafscedClaveAccesoCounter = sharedCounter; return hasModified;
     }
	protected static final int ACAFSCED_CLAVE_ACCESO_LEN = 200;
	/**
	 * 	serialize this AcafscedClaveAcceso
	 */
   protected void serializeAcafscedClaveAcceso(char[] acafscedClaveAcceso) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acafscedClaveAcceso,0,getStringValue(),beginAcafscedClaveAcceso,ACAFSCED_CLAVE_ACCESO_LEN);
       localAcafscedClaveAccesoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcafscedClaveAccesoConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshAcafscedClaveAcceso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcafscedClaveAcceso() {	 
   		return (substring(getStringValue(),beginAcafscedClaveAcceso,beginAcafscedClaveAcceso + ACAFSCED_CLAVE_ACCESO_LEN));
   	}




}
  
