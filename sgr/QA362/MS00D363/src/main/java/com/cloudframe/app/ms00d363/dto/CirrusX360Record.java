package com.cloudframe.app.ms00d363.dto;

/**
*  The class CirrusX360Record is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class CirrusX360Record extends CirrusX360RecordSerialized {
   

						private char[] x360RecordType = Field.fillLowValue(1);
				private X360HeaderRecord x360HeaderRecord = new X360HeaderRecord();
				private X360DataRecord x360DataRecord = new X360DataRecord();
	
	/**
	* Constructor for CirrusX360Record
	**/
    public CirrusX360Record() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			x360HeaderRecord.setParent(this,getStartOffset() + 1);
	       			x360DataRecord.setParent(this,getStartOffset() + 1);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of x360RecordType
	 *	@return x360RecordType
	 */
   public char[] getX360RecordType() throws CFException{
     if (isX360RecordTypeModified()) { 
        x360RecordType = refreshX360RecordType();
     }
   		return x360RecordType;
   }

  
	/**
	*  set variable x360RecordType
	*  Corresponding COBOL Variable is X360-RECORD-TYPE
	*  @param value
	**/
   public void setX360RecordType(char[] value) {
      x360RecordType = checkX360RecordTypeConstraints(value);
      serializeX360RecordType(x360RecordType);
   } 

     /**
	 * 	Update X360RecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360RecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360RecordType,x360RecordType.length);
   	
   }
   
   public void setX360RecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360RecordType,x360RecordType.length);
   	
   }
   
     /**
	 * 	Update X360RecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360RecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360RecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360RecordType with another Field
	 *	@param value
	 */
   public void setX360RecordType(Field source) {
       replace(source,0,source.length(),beginX360RecordType,X_360_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update X360RecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360RecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360RecordType,X_360_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update X360RecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360RecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360RecordType+targetIndex,targetLen);
    
   }
	char[] x360RecTypeHeader88Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isX360RecTypeHeader()
	 *	@return  Returns true if isX360RecTypeHeader() is "0"
	 */
   public boolean isX360RecTypeHeader() throws CFException {
      return (  compareChars( getX360RecordType() , x360RecTypeHeader88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setX360RecTypeHeaderTrue() {  			
    	setX360RecordType( x360RecTypeHeader88Value);
   	}
	char[] x360RecTypeData88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isX360RecTypeData()
	 *	@return  Returns true if isX360RecTypeData() is "1"
	 */
   public boolean isX360RecTypeData() throws CFException {
      return (  compareChars( getX360RecordType() , x360RecTypeData88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setX360RecTypeDataTrue() {  			
    	setX360RecordType( x360RecTypeData88Value);
   	}
	char[] x360RecTypeTrailer88Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isX360RecTypeTrailer()
	 *	@return  Returns true if isX360RecTypeTrailer() is "9"
	 */
   public boolean isX360RecTypeTrailer() throws CFException {
      return (  compareChars( getX360RecordType() , x360RecTypeTrailer88Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setX360RecTypeTrailerTrue() {  			
    	setX360RecordType( x360RecTypeTrailer88Value);
   	}
	/**
	 *	Returns the value of x360HeaderRecord
	 *	@return x360HeaderRecord
	 */   
	 public X360HeaderRecord getX360HeaderRecord() {
   	return x360HeaderRecord;
   }
   /**
	* 	Update X360HeaderRecord with the passed value
	*   Corresponding COBOL Variable is X360-HEADER-RECORD
	*	@param value
	*/
   public void setX360HeaderRecord(char[] value) {
      x360HeaderRecord.setString(value); 
   }   
    
     /**
	 * 	Update X360HeaderRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderRecord.begin,x360HeaderRecord.length());
   }
   
     /**
	 * 	Update X360HeaderRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360HeaderRecord with another Field
	 *	@param value
	 */
   public void setX360HeaderRecord(Field source) {
   	replace(source,0,source.length(),x360HeaderRecord.begin,x360HeaderRecord.length());
   }  
   
     /**
	 * 	Update X360HeaderRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderRecord.begin,x360HeaderRecord.length());
   }
   
     /**
	 * 	Update X360HeaderRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360DataRecord
	 *	@return x360DataRecord
	 */   
	 public X360DataRecord getX360DataRecord() {
   	return x360DataRecord;
   }
   /**
	* 	Update X360DataRecord with the passed value
	*   Corresponding COBOL Variable is X360-DATA-RECORD
	*	@param value
	*/
   public void setX360DataRecord(char[] value) {
      x360DataRecord.setString(value); 
   }   
    
     /**
	 * 	Update X360DataRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360DataRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360DataRecord.begin,x360DataRecord.length());
   }
   
     /**
	 * 	Update X360DataRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360DataRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360DataRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360DataRecord with another Field
	 *	@param value
	 */
   public void setX360DataRecord(Field source) {
   	replace(source,0,source.length(),x360DataRecord.begin,x360DataRecord.length());
   }  
   
     /**
	 * 	Update X360DataRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360DataRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360DataRecord.begin,x360DataRecord.length());
   }
   
     /**
	 * 	Update X360DataRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360DataRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360DataRecord.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes CirrusX360Record
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setX360RecordType(CONSTANTS.SPACE);
          x360HeaderRecord.initialize();
     
   }

		public static int getCirrusX360RecordFieldLength() {
			return CIRRUS_X_360_RECORD_LENGTH;
		}

}
  
