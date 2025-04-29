package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647Parms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar647Parms extends Ar647ParmsSerialized {
   

						private char[] ar647ProgramId = new char[8];

								private short ar647ReturnCode;

						private char[] ar647OldDsn = new char[44];

						private char[] ar647NewDsn = new char[44];
				private Ar647FunctionFailureCodes ar647FunctionFailureCodes = new Ar647FunctionFailureCodes();
	
	/**
	* Constructor for Ar647Parms
	**/
    public Ar647Parms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ar647FunctionFailureCodes.setParent(this,getStartOffset() + 98);
	   	/*  end of offset */
								setAr647ProgramId(("AR647010").toCharArray());
								setAr647ReturnCode((short)0);
								setAr647OldDsn(fillSpace(44));
								setAr647NewDsn(fillSpace(44));
    }


 

	/**
	 *	Returns the value of ar647ProgramId
	 *	@return ar647ProgramId
	 */
   public char[] getAr647ProgramId() throws CFException{
     if (isAr647ProgramIdModified()) { 
        ar647ProgramId = refreshAr647ProgramId();
     }
   		return ar647ProgramId;
   }

  
	/**
	*  set variable ar647ProgramId
	*  Corresponding COBOL Variable is AR647-PROGRAM-ID
	*  @param value
	**/
   public void setAr647ProgramId(char[] value) {
      ar647ProgramId = checkAr647ProgramIdConstraints(value);
      serializeAr647ProgramId(ar647ProgramId);
   } 

     /**
	 * 	Update Ar647ProgramId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr647ProgramId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr647ProgramId,ar647ProgramId.length);
   	
   }
   
   public void setAr647ProgramId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr647ProgramId,ar647ProgramId.length);
   	
   }
   
     /**
	 * 	Update Ar647ProgramId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr647ProgramId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr647ProgramId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar647ProgramId with another Field
	 *	@param value
	 */
   public void setAr647ProgramId(Field source) {
       replace(source,0,source.length(),beginAr647ProgramId,AR_647_PROGRAM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar647ProgramId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr647ProgramId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr647ProgramId,AR_647_PROGRAM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar647ProgramId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr647ProgramId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr647ProgramId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar647ReturnCode
	 *	@return ar647ReturnCode
	 */
	public short getAr647ReturnCode() throws CFException {
        if (isAr647ReturnCodeModified()) { 
           ar647ReturnCode = refreshAr647ReturnCode();
        }
   		return ar647ReturnCode;
	}
	
	/**
	 * 	Update Ar647ReturnCode with the passed value
	 *  Corresponding COBOL Variable is AR647-RETURN-CODE
	 *	@param number
	 */
	public void setAr647ReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ar647ReturnCode = checkAr647ReturnCodeMaxLimit(number); 
		serializeAr647ReturnCode(ar647ReturnCode);
	}

	public void setAr647ReturnCode(int number) {
	    number = checkAr647ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr647ReturnCode((short)number);
	}
	public void setAr647ReturnCode(long number) {
	    number = checkAr647ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr647ReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isAr647RequestSuccessful88()
	 *	@return  Returns true if isAr647RequestSuccessful88() is 0
	 */
   public boolean isAr647RequestSuccessful88() throws CFException {
      return (  getAr647ReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAr647RequestSuccessful88True() {  			
    	setAr647ReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 4 for isAr647NewDsnCatal88()
	 *	@return  Returns true if isAr647NewDsnCatal88() is 4
	 */
   public boolean isAr647NewDsnCatal88() throws CFException {
      return (  getAr647ReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setAr647NewDsnCatal88True() {  			
    	setAr647ReturnCode( (short)4);
   	}
	
	/**
	 *	Test condition 8 for isAr647OldDsnInUse88()
	 *	@return  Returns true if isAr647OldDsnInUse88() is 8
	 */
   public boolean isAr647OldDsnInUse88() throws CFException {
      return (  getAr647ReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setAr647OldDsnInUse88True() {  			
    	setAr647ReturnCode( (short)8);
   	}
	
	/**
	 *	Test condition 12 for isAr647OldDsnNotCatal88()
	 *	@return  Returns true if isAr647OldDsnNotCatal88() is 12
	 */
   public boolean isAr647OldDsnNotCatal88() throws CFException {
      return (  getAr647ReturnCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setAr647OldDsnNotCatal88True() {  			
    	setAr647ReturnCode( (short)12);
   	}
	
	/**
	 *	Test condition 16 for isAr647OldDsnInvalid88()
	 *	@return  Returns true if isAr647OldDsnInvalid88() is 16
	 */
   public boolean isAr647OldDsnInvalid88() throws CFException {
      return (  getAr647ReturnCode()  ==  16  );
   }


	/**
	*  set values 16
	*/
   	public void setAr647OldDsnInvalid88True() {  			
    	setAr647ReturnCode( (short)16);
   	}
	
	/**
	 *	Test condition 20 for isAr647NewDsnInvalid88()
	 *	@return  Returns true if isAr647NewDsnInvalid88() is 20
	 */
   public boolean isAr647NewDsnInvalid88() throws CFException {
      return (  getAr647ReturnCode()  ==  20  );
   }


	/**
	*  set values 20
	*/
   	public void setAr647NewDsnInvalid88True() {  			
    	setAr647ReturnCode( (short)20);
   	}
	
	/**
	 *	Test condition 24 for isAr647RexxFunctionError88()
	 *	@return  Returns true if isAr647RexxFunctionError88() is 24
	 */
   public boolean isAr647RexxFunctionError88() throws CFException {
      return (  getAr647ReturnCode()  ==  24  );
   }


	/**
	*  set values 24
	*/
   	public void setAr647RexxFunctionError88True() {  			
    	setAr647ReturnCode( (short)24);
   	}
	
	/**
	 *	Test condition 28 for isAr647RexxCallError88()
	 *	@return  Returns true if isAr647RexxCallError88() is 28
	 */
   public boolean isAr647RexxCallError88() throws CFException {
      return (  getAr647ReturnCode()  ==  28  );
   }


	/**
	*  set values 28
	*/
   	public void setAr647RexxCallError88True() {  			
    	setAr647ReturnCode( (short)28);
   	}
	
	/**
	 *	Test condition 32 for isAr647TsoFunctionError88()
	 *	@return  Returns true if isAr647TsoFunctionError88() is 32
	 */
   public boolean isAr647TsoFunctionError88() throws CFException {
      return (  getAr647ReturnCode()  ==  32  );
   }


	/**
	*  set values 32
	*/
   	public void setAr647TsoFunctionError88True() {  			
    	setAr647ReturnCode( (short)32);
   	}
	/**
	 *	Returns the value of ar647OldDsn
	 *	@return ar647OldDsn
	 */
   public char[] getAr647OldDsn() throws CFException{
     if (isAr647OldDsnModified()) { 
        ar647OldDsn = refreshAr647OldDsn();
     }
   		return ar647OldDsn;
   }

  
	/**
	*  set variable ar647OldDsn
	*  Corresponding COBOL Variable is AR647-OLD-DSN
	*  @param value
	**/
   public void setAr647OldDsn(char[] value) {
      ar647OldDsn = checkAr647OldDsnConstraints(value);
      serializeAr647OldDsn(ar647OldDsn);
   } 

     /**
	 * 	Update Ar647OldDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr647OldDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr647OldDsn,ar647OldDsn.length);
   	
   }
   
   public void setAr647OldDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr647OldDsn,ar647OldDsn.length);
   	
   }
   
     /**
	 * 	Update Ar647OldDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr647OldDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr647OldDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar647OldDsn with another Field
	 *	@param value
	 */
   public void setAr647OldDsn(Field source) {
       replace(source,0,source.length(),beginAr647OldDsn,AR_647_OLD_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update Ar647OldDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr647OldDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr647OldDsn,AR_647_OLD_DSN_LEN);
   	
   }
   
     /**
	 * 	Update Ar647OldDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr647OldDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr647OldDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar647NewDsn
	 *	@return ar647NewDsn
	 */
   public char[] getAr647NewDsn() throws CFException{
     if (isAr647NewDsnModified()) { 
        ar647NewDsn = refreshAr647NewDsn();
     }
   		return ar647NewDsn;
   }

  
	/**
	*  set variable ar647NewDsn
	*  Corresponding COBOL Variable is AR647-NEW-DSN
	*  @param value
	**/
   public void setAr647NewDsn(char[] value) {
      ar647NewDsn = checkAr647NewDsnConstraints(value);
      serializeAr647NewDsn(ar647NewDsn);
   } 

     /**
	 * 	Update Ar647NewDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr647NewDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr647NewDsn,ar647NewDsn.length);
   	
   }
   
   public void setAr647NewDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr647NewDsn,ar647NewDsn.length);
   	
   }
   
     /**
	 * 	Update Ar647NewDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr647NewDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr647NewDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar647NewDsn with another Field
	 *	@param value
	 */
   public void setAr647NewDsn(Field source) {
       replace(source,0,source.length(),beginAr647NewDsn,AR_647_NEW_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update Ar647NewDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr647NewDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr647NewDsn,AR_647_NEW_DSN_LEN);
   	
   }
   
     /**
	 * 	Update Ar647NewDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr647NewDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr647NewDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar647FunctionFailureCodes
	 *	@return ar647FunctionFailureCodes
	 */   
	 public Ar647FunctionFailureCodes getAr647FunctionFailureCodes() {
   	return ar647FunctionFailureCodes;
   }
   /**
	* 	Update Ar647FunctionFailureCodes with the passed value
	*   Corresponding COBOL Variable is AR647-FUNCTION-FAILURE-CODES
	*	@param value
	*/
   public void setAr647FunctionFailureCodes(char[] value) {
      ar647FunctionFailureCodes.setString(value); 
   }   
    
     /**
	 * 	Update Ar647FunctionFailureCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAr647FunctionFailureCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar647FunctionFailureCodes.begin,ar647FunctionFailureCodes.length());
   }
   
     /**
	 * 	Update Ar647FunctionFailureCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr647FunctionFailureCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar647FunctionFailureCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ar647FunctionFailureCodes with another Field
	 *	@param value
	 */
   public void setAr647FunctionFailureCodes(Field source) {
   	replace(source,0,source.length(),ar647FunctionFailureCodes.begin,ar647FunctionFailureCodes.length());
   }  
   
     /**
	 * 	Update Ar647FunctionFailureCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAr647FunctionFailureCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar647FunctionFailureCodes.begin,ar647FunctionFailureCodes.length());
   }
   
     /**
	 * 	Update Ar647FunctionFailureCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr647FunctionFailureCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar647FunctionFailureCodes.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAr647ParmsFieldLength() {
			return AR_647_PARMS_LENGTH;
		}

}
  
