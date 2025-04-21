package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642Parameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar642Parameters extends Ar642ParametersSerialized {
   

						private char[] ar642ProgramId = new char[8];

						private char[] ar642DatasetId = new char[54];

								private short ar642ReturnCode;

						private char[] ar642AllocUnit = new char[1];

						private char[] ar642RecordFormat = new char[3];

								private long ar642UnitsUsed;

								private long ar642RecordLength;

								private long ar642BlockSize;

						private char[] ar642ReturnDsn = new char[44];

								private long ar642PrimarySpace;

								private long ar642SecondarySpace;
				private Ar642FunctionFailureCodes ar642FunctionFailureCodes = new Ar642FunctionFailureCodes();
	
	/**
	* Constructor for Ar642Parameters
	**/
    public Ar642Parameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ar642FunctionFailureCodes.setParent(this,getStartOffset() + 132);
	   	/*  end of offset */
								setAr642ProgramId(("AR642010").toCharArray());
								setAr642DatasetId(fillSpace(54));
								setAr642ReturnCode((short)0);
								setAr642AllocUnit(fillSpace(1));
								setAr642RecordFormat(fillSpace(3));
								setAr642UnitsUsed(0L);
								setAr642RecordLength(0L);
								setAr642BlockSize(0L);
								setAr642ReturnDsn(fillSpace(44));
								setAr642PrimarySpace(0L);
								setAr642SecondarySpace(0L);
    }


 

	/**
	 *	Returns the value of ar642ProgramId
	 *	@return ar642ProgramId
	 */
   public char[] getAr642ProgramId() throws CFException{
     if (isAr642ProgramIdModified()) { 
        ar642ProgramId = refreshAr642ProgramId();
     }
   		return ar642ProgramId;
   }

  
	/**
	*  set variable ar642ProgramId
	*  Corresponding COBOL Variable is AR642-PROGRAM-ID
	*  @param value
	**/
   public void setAr642ProgramId(char[] value) {
      ar642ProgramId = checkAr642ProgramIdConstraints(value);
      serializeAr642ProgramId(ar642ProgramId);
   } 

     /**
	 * 	Update Ar642ProgramId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr642ProgramId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr642ProgramId,ar642ProgramId.length);
   	
   }
   
   public void setAr642ProgramId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ProgramId,ar642ProgramId.length);
   	
   }
   
     /**
	 * 	Update Ar642ProgramId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642ProgramId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ProgramId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar642ProgramId with another Field
	 *	@param value
	 */
   public void setAr642ProgramId(Field source) {
       replace(source,0,source.length(),beginAr642ProgramId,AR_642_PROGRAM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar642ProgramId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr642ProgramId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr642ProgramId,AR_642_PROGRAM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar642ProgramId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642ProgramId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ProgramId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar642DatasetId
	 *	@return ar642DatasetId
	 */
   public char[] getAr642DatasetId() throws CFException{
     if (isAr642DatasetIdModified()) { 
        ar642DatasetId = refreshAr642DatasetId();
     }
   		return ar642DatasetId;
   }

  
	/**
	*  set variable ar642DatasetId
	*  Corresponding COBOL Variable is AR642-DATASET-ID
	*  @param value
	**/
   public void setAr642DatasetId(char[] value) {
      ar642DatasetId = checkAr642DatasetIdConstraints(value);
      serializeAr642DatasetId(ar642DatasetId);
   } 

     /**
	 * 	Update Ar642DatasetId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr642DatasetId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr642DatasetId,ar642DatasetId.length);
   	
   }
   
   public void setAr642DatasetId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr642DatasetId,ar642DatasetId.length);
   	
   }
   
     /**
	 * 	Update Ar642DatasetId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642DatasetId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642DatasetId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar642DatasetId with another Field
	 *	@param value
	 */
   public void setAr642DatasetId(Field source) {
       replace(source,0,source.length(),beginAr642DatasetId,AR_642_DATASET_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar642DatasetId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr642DatasetId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr642DatasetId,AR_642_DATASET_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar642DatasetId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642DatasetId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642DatasetId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar642ReturnCode
	 *	@return ar642ReturnCode
	 */
	public short getAr642ReturnCode() throws CFException {
        if (isAr642ReturnCodeModified()) { 
           ar642ReturnCode = refreshAr642ReturnCode();
        }
   		return ar642ReturnCode;
	}
	
	/**
	 * 	Update Ar642ReturnCode with the passed value
	 *  Corresponding COBOL Variable is AR642-RETURN-CODE
	 *	@param number
	 */
	public void setAr642ReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642ReturnCode = checkAr642ReturnCodeMaxLimit(number); 
		serializeAr642ReturnCode(ar642ReturnCode);
	}

	public void setAr642ReturnCode(int number) {
	    number = checkAr642ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr642ReturnCode((short)number);
	}
	public void setAr642ReturnCode(long number) {
	    number = checkAr642ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr642ReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isAr642RequestSuccessful88()
	 *	@return  Returns true if isAr642RequestSuccessful88() is 0
	 */
   public boolean isAr642RequestSuccessful88() throws CFException {
      return (  getAr642ReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAr642RequestSuccessful88True() {  			
    	setAr642ReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 4 for isAr642DatasetIdMissing88()
	 *	@return  Returns true if isAr642DatasetIdMissing88() is 4
	 */
   public boolean isAr642DatasetIdMissing88() throws CFException {
      return (  getAr642ReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setAr642DatasetIdMissing88True() {  			
    	setAr642ReturnCode( (short)4);
   	}
	
	/**
	 *	Test condition 8 for isAr642DatasetIdInvalid88()
	 *	@return  Returns true if isAr642DatasetIdInvalid88() is 8
	 */
   public boolean isAr642DatasetIdInvalid88() throws CFException {
      return (  getAr642ReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setAr642DatasetIdInvalid88True() {  			
    	setAr642ReturnCode( (short)8);
   	}
	
	/**
	 *	Test condition 12 for isAr642TsoFunctionError88()
	 *	@return  Returns true if isAr642TsoFunctionError88() is 12
	 */
   public boolean isAr642TsoFunctionError88() throws CFException {
      return (  getAr642ReturnCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setAr642TsoFunctionError88True() {  			
    	setAr642ReturnCode( (short)12);
   	}
	
	/**
	 *	Test condition 16 for isAr642RexxCallError88()
	 *	@return  Returns true if isAr642RexxCallError88() is 16
	 */
   public boolean isAr642RexxCallError88() throws CFException {
      return (  getAr642ReturnCode()  ==  16  );
   }


	/**
	*  set values 16
	*/
   	public void setAr642RexxCallError88True() {  			
    	setAr642ReturnCode( (short)16);
   	}
	
	/**
	 *	Test condition 20 for isAr642RexxFunctionError88()
	 *	@return  Returns true if isAr642RexxFunctionError88() is 20
	 */
   public boolean isAr642RexxFunctionError88() throws CFException {
      return (  getAr642ReturnCode()  ==  20  );
   }


	/**
	*  set values 20
	*/
   	public void setAr642RexxFunctionError88True() {  			
    	setAr642ReturnCode( (short)20);
   	}
	
	/**
	 *	Test condition 24 for isAr642RexxParamError88()
	 *	@return  Returns true if isAr642RexxParamError88() is 24
	 */
   public boolean isAr642RexxParamError88() throws CFException {
      return (  getAr642ReturnCode()  ==  24  );
   }


	/**
	*  set values 24
	*/
   	public void setAr642RexxParamError88True() {  			
    	setAr642ReturnCode( (short)24);
   	}
	
	/**
	 *	Test condition 28 for isAr642DatasetNotCatal88()
	 *	@return  Returns true if isAr642DatasetNotCatal88() is 28
	 */
   public boolean isAr642DatasetNotCatal88() throws CFException {
      return (  getAr642ReturnCode()  ==  28  );
   }


	/**
	*  set values 28
	*/
   	public void setAr642DatasetNotCatal88True() {  			
    	setAr642ReturnCode( (short)28);
   	}
	
	/**
	 *	Test condition 32 for isAr642DdnameNotInJcl88()
	 *	@return  Returns true if isAr642DdnameNotInJcl88() is 32
	 */
   public boolean isAr642DdnameNotInJcl88() throws CFException {
      return (  getAr642ReturnCode()  ==  32  );
   }


	/**
	*  set values 32
	*/
   	public void setAr642DdnameNotInJcl88True() {  			
    	setAr642ReturnCode( (short)32);
   	}
	
	/**
	 *	Test condition 36 for isAr642VsamNotSupported88()
	 *	@return  Returns true if isAr642VsamNotSupported88() is 36
	 */
   public boolean isAr642VsamNotSupported88() throws CFException {
      return (  getAr642ReturnCode()  ==  36  );
   }


	/**
	*  set values 36
	*/
   	public void setAr642VsamNotSupported88True() {  			
    	setAr642ReturnCode( (short)36);
   	}
	
	/**
	 *	Test condition 40 for isAr642TypeNotProcessed88()
	 *	@return  Returns true if isAr642TypeNotProcessed88() is 40
	 */
   public boolean isAr642TypeNotProcessed88() throws CFException {
      return (  getAr642ReturnCode()  ==  40  );
   }


	/**
	*  set values 40
	*/
   	public void setAr642TypeNotProcessed88True() {  			
    	setAr642ReturnCode( (short)40);
   	}
	
	/**
	 *	Test condition 44 for isAr642DatasetNotFound88()
	 *	@return  Returns true if isAr642DatasetNotFound88() is 44
	 */
   public boolean isAr642DatasetNotFound88() throws CFException {
      return (  getAr642ReturnCode()  ==  44  );
   }


	/**
	*  set values 44
	*/
   	public void setAr642DatasetNotFound88True() {  			
    	setAr642ReturnCode( (short)44);
   	}
	
	/**
	 *	Test condition 48 for isAr642DatasetNotAvail88()
	 *	@return  Returns true if isAr642DatasetNotAvail88() is 48
	 */
   public boolean isAr642DatasetNotAvail88() throws CFException {
      return (  getAr642ReturnCode()  ==  48  );
   }


	/**
	*  set values 48
	*/
   	public void setAr642DatasetNotAvail88True() {  			
    	setAr642ReturnCode( (short)48);
   	}
	
	/**
	 *	Test condition 52 for isAr642DatasetError88()
	 *	@return  Returns true if isAr642DatasetError88() is 52
	 */
   public boolean isAr642DatasetError88() throws CFException {
      return (  getAr642ReturnCode()  ==  52  );
   }


	/**
	*  set values 52
	*/
   	public void setAr642DatasetError88True() {  			
    	setAr642ReturnCode( (short)52);
   	}
	
	/**
	 *	Test condition 99 for isAr642ListdsiError88()
	 *	@return  Returns true if isAr642ListdsiError88() is 99
	 */
   public boolean isAr642ListdsiError88() throws CFException {
      return (  getAr642ReturnCode()  ==  99  );
   }


	/**
	*  set values 99
	*/
   	public void setAr642ListdsiError88True() {  			
    	setAr642ReturnCode( (short)99);
   	}
	
	/**
	 *	Test condition 100 for isAr642GdgNotFound88()
	 *	@return  Returns true if isAr642GdgNotFound88() is 100
	 */
   public boolean isAr642GdgNotFound88() throws CFException {
      return (  getAr642ReturnCode()  ==  100  );
   }


	/**
	*  set values 100
	*/
   	public void setAr642GdgNotFound88True() {  			
    	setAr642ReturnCode( (short)100);
   	}
	
	/**
	 *	Test condition 104 for isAr642PdsMbrNotFound88()
	 *	@return  Returns true if isAr642PdsMbrNotFound88() is 104
	 */
   public boolean isAr642PdsMbrNotFound88() throws CFException {
      return (  getAr642ReturnCode()  ==  104  );
   }


	/**
	*  set values 104
	*/
   	public void setAr642PdsMbrNotFound88True() {  			
    	setAr642ReturnCode( (short)104);
   	}
	
	/**
	 *	Test condition 108 for isAr642PdsNotValid88()
	 *	@return  Returns true if isAr642PdsNotValid88() is 108
	 */
   public boolean isAr642PdsNotValid88() throws CFException {
      return (  getAr642ReturnCode()  ==  108  );
   }


	/**
	*  set values 108
	*/
   	public void setAr642PdsNotValid88True() {  			
    	setAr642ReturnCode( (short)108);
   	}
	
	/**
	 *	Test condition 112 for isAr642PdsProtected88()
	 *	@return  Returns true if isAr642PdsProtected88() is 112
	 */
   public boolean isAr642PdsProtected88() throws CFException {
      return (  getAr642ReturnCode()  ==  112  );
   }


	/**
	*  set values 112
	*/
   	public void setAr642PdsProtected88True() {  			
    	setAr642ReturnCode( (short)112);
   	}
	
	/**
	 *	Test condition 116 for isAr642PdsNotAvail88()
	 *	@return  Returns true if isAr642PdsNotAvail88() is 116
	 */
   public boolean isAr642PdsNotAvail88() throws CFException {
      return (  getAr642ReturnCode()  ==  116  );
   }


	/**
	*  set values 116
	*/
   	public void setAr642PdsNotAvail88True() {  			
    	setAr642ReturnCode( (short)116);
   	}
	
	/**
	 *	Test condition 199 for isAr642SysdsnError88()
	 *	@return  Returns true if isAr642SysdsnError88() is 199
	 */
   public boolean isAr642SysdsnError88() throws CFException {
      return (  getAr642ReturnCode()  ==  199  );
   }


	/**
	*  set values 199
	*/
   	public void setAr642SysdsnError88True() {  			
    	setAr642ReturnCode( (short)199);
   	}
	/**
	 *	Returns the value of ar642AllocUnit
	 *	@return ar642AllocUnit
	 */
   public char[] getAr642AllocUnit() throws CFException{
     if (isAr642AllocUnitModified()) { 
        ar642AllocUnit = refreshAr642AllocUnit();
     }
   		return ar642AllocUnit;
   }

  
	/**
	*  set variable ar642AllocUnit
	*  Corresponding COBOL Variable is AR642-ALLOC-UNIT
	*  @param value
	**/
   public void setAr642AllocUnit(char[] value) {
      ar642AllocUnit = checkAr642AllocUnitConstraints(value);
      serializeAr642AllocUnit(ar642AllocUnit);
   } 

     /**
	 * 	Update Ar642AllocUnit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr642AllocUnit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr642AllocUnit,ar642AllocUnit.length);
   	
   }
   
   public void setAr642AllocUnit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr642AllocUnit,ar642AllocUnit.length);
   	
   }
   
     /**
	 * 	Update Ar642AllocUnit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642AllocUnit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642AllocUnit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar642AllocUnit with another Field
	 *	@param value
	 */
   public void setAr642AllocUnit(Field source) {
       replace(source,0,source.length(),beginAr642AllocUnit,AR_642_ALLOC_UNIT_LEN);
   	
   }  
   
     /**
	 * 	Update Ar642AllocUnit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr642AllocUnit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr642AllocUnit,AR_642_ALLOC_UNIT_LEN);
   	
   }
   
     /**
	 * 	Update Ar642AllocUnit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642AllocUnit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642AllocUnit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar642RecordFormat
	 *	@return ar642RecordFormat
	 */
   public char[] getAr642RecordFormat() throws CFException{
     if (isAr642RecordFormatModified()) { 
        ar642RecordFormat = refreshAr642RecordFormat();
     }
   		return ar642RecordFormat;
   }

  
	/**
	*  set variable ar642RecordFormat
	*  Corresponding COBOL Variable is AR642-RECORD-FORMAT
	*  @param value
	**/
   public void setAr642RecordFormat(char[] value) {
      ar642RecordFormat = checkAr642RecordFormatConstraints(value);
      serializeAr642RecordFormat(ar642RecordFormat);
   } 

     /**
	 * 	Update Ar642RecordFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr642RecordFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr642RecordFormat,ar642RecordFormat.length);
   	
   }
   
   public void setAr642RecordFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr642RecordFormat,ar642RecordFormat.length);
   	
   }
   
     /**
	 * 	Update Ar642RecordFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642RecordFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642RecordFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar642RecordFormat with another Field
	 *	@param value
	 */
   public void setAr642RecordFormat(Field source) {
       replace(source,0,source.length(),beginAr642RecordFormat,AR_642_RECORD_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ar642RecordFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr642RecordFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr642RecordFormat,AR_642_RECORD_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update Ar642RecordFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642RecordFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642RecordFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar642UnitsUsed
	 *	@return ar642UnitsUsed
	 */
	public long getAr642UnitsUsed() throws CFException {
        if (isAr642UnitsUsedModified()) { 
           ar642UnitsUsed = refreshAr642UnitsUsed();
        }
   		return ar642UnitsUsed;
	}
	
	/**
	 * 	Update Ar642UnitsUsed with the passed value
	 *  Corresponding COBOL Variable is AR642-UNITS-USED
	 *	@param number
	 */
	public void setAr642UnitsUsed(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642UnitsUsed = checkAr642UnitsUsedMaxLimit(number); 
		serializeAr642UnitsUsed(ar642UnitsUsed);
	}


	/**
	 *	Returns the value of ar642RecordLength
	 *	@return ar642RecordLength
	 */
	public long getAr642RecordLength() throws CFException {
        if (isAr642RecordLengthModified()) { 
           ar642RecordLength = refreshAr642RecordLength();
        }
   		return ar642RecordLength;
	}
	
	/**
	 * 	Update Ar642RecordLength with the passed value
	 *  Corresponding COBOL Variable is AR642-RECORD-LENGTH
	 *	@param number
	 */
	public void setAr642RecordLength(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642RecordLength = checkAr642RecordLengthMaxLimit(number); 
		serializeAr642RecordLength(ar642RecordLength);
	}


	/**
	 *	Returns the value of ar642BlockSize
	 *	@return ar642BlockSize
	 */
	public long getAr642BlockSize() throws CFException {
        if (isAr642BlockSizeModified()) { 
           ar642BlockSize = refreshAr642BlockSize();
        }
   		return ar642BlockSize;
	}
	
	/**
	 * 	Update Ar642BlockSize with the passed value
	 *  Corresponding COBOL Variable is AR642-BLOCK-SIZE
	 *	@param number
	 */
	public void setAr642BlockSize(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642BlockSize = checkAr642BlockSizeMaxLimit(number); 
		serializeAr642BlockSize(ar642BlockSize);
	}


	/**
	 *	Returns the value of ar642ReturnDsn
	 *	@return ar642ReturnDsn
	 */
   public char[] getAr642ReturnDsn() throws CFException{
     if (isAr642ReturnDsnModified()) { 
        ar642ReturnDsn = refreshAr642ReturnDsn();
     }
   		return ar642ReturnDsn;
   }

  
	/**
	*  set variable ar642ReturnDsn
	*  Corresponding COBOL Variable is AR642-RETURN-DSN
	*  @param value
	**/
   public void setAr642ReturnDsn(char[] value) {
      ar642ReturnDsn = checkAr642ReturnDsnConstraints(value);
      serializeAr642ReturnDsn(ar642ReturnDsn);
   } 

     /**
	 * 	Update Ar642ReturnDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr642ReturnDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr642ReturnDsn,ar642ReturnDsn.length);
   	
   }
   
   public void setAr642ReturnDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ReturnDsn,ar642ReturnDsn.length);
   	
   }
   
     /**
	 * 	Update Ar642ReturnDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642ReturnDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ReturnDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar642ReturnDsn with another Field
	 *	@param value
	 */
   public void setAr642ReturnDsn(Field source) {
       replace(source,0,source.length(),beginAr642ReturnDsn,AR_642_RETURN_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update Ar642ReturnDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr642ReturnDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr642ReturnDsn,AR_642_RETURN_DSN_LEN);
   	
   }
   
     /**
	 * 	Update Ar642ReturnDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642ReturnDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr642ReturnDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar642PrimarySpace
	 *	@return ar642PrimarySpace
	 */
	public long getAr642PrimarySpace() throws CFException {
        if (isAr642PrimarySpaceModified()) { 
           ar642PrimarySpace = refreshAr642PrimarySpace();
        }
   		return ar642PrimarySpace;
	}
	
	/**
	 * 	Update Ar642PrimarySpace with the passed value
	 *  Corresponding COBOL Variable is AR642-PRIMARY-SPACE
	 *	@param number
	 */
	public void setAr642PrimarySpace(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642PrimarySpace = checkAr642PrimarySpaceMaxLimit(number); 
		serializeAr642PrimarySpace(ar642PrimarySpace);
	}


	/**
	 *	Returns the value of ar642SecondarySpace
	 *	@return ar642SecondarySpace
	 */
	public long getAr642SecondarySpace() throws CFException {
        if (isAr642SecondarySpaceModified()) { 
           ar642SecondarySpace = refreshAr642SecondarySpace();
        }
   		return ar642SecondarySpace;
	}
	
	/**
	 * 	Update Ar642SecondarySpace with the passed value
	 *  Corresponding COBOL Variable is AR642-SECONDARY-SPACE
	 *	@param number
	 */
	public void setAr642SecondarySpace(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ar642SecondarySpace = checkAr642SecondarySpaceMaxLimit(number); 
		serializeAr642SecondarySpace(ar642SecondarySpace);
	}


	/**
	 *	Returns the value of ar642FunctionFailureCodes
	 *	@return ar642FunctionFailureCodes
	 */   
	 public Ar642FunctionFailureCodes getAr642FunctionFailureCodes() {
   	return ar642FunctionFailureCodes;
   }
   /**
	* 	Update Ar642FunctionFailureCodes with the passed value
	*   Corresponding COBOL Variable is AR642-FUNCTION-FAILURE-CODES
	*	@param value
	*/
   public void setAr642FunctionFailureCodes(char[] value) {
      ar642FunctionFailureCodes.setString(value); 
   }   
    
     /**
	 * 	Update Ar642FunctionFailureCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAr642FunctionFailureCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar642FunctionFailureCodes.begin,ar642FunctionFailureCodes.length());
   }
   
     /**
	 * 	Update Ar642FunctionFailureCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr642FunctionFailureCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar642FunctionFailureCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ar642FunctionFailureCodes with another Field
	 *	@param value
	 */
   public void setAr642FunctionFailureCodes(Field source) {
   	replace(source,0,source.length(),ar642FunctionFailureCodes.begin,ar642FunctionFailureCodes.length());
   }  
   
     /**
	 * 	Update Ar642FunctionFailureCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAr642FunctionFailureCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar642FunctionFailureCodes.begin,ar642FunctionFailureCodes.length());
   }
   
     /**
	 * 	Update Ar642FunctionFailureCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr642FunctionFailureCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar642FunctionFailureCodes.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAr642ParametersFieldLength() {
			return AR_642_PARAMETERS_LENGTH;
		}

}
  
