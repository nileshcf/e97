package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprControlBlock is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_seprControlBlock")

public class SeprControlBlock extends SeprControlBlockSerialized  implements InitializingBean {
   

								private int seprReturnCode;

						private char[] seprReturnDesc = Field.fillLowValue(20);

						private char[] seprDe48Sw = Field.fillLowValue(1);

								private int seprDataLength;

						private char[] seprBadId = Field.fillLowValue(3);

						private char[] seprBadLength = Field.fillLowValue(3);

						private char[] seprTccCd = Field.fillLowValue(1);

								private int seprDataAddr;

								private int seprDataPtr;
	
	/**
	* Constructor for SeprControlBlock
	**/
    public SeprControlBlock() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of seprReturnCode
	 *	@return seprReturnCode
	 */
	public int getSeprReturnCode() throws CFException {
       if (isSeprReturnCodeModified()) { 
           seprReturnCode = refreshSeprReturnCode();
        }
   		return seprReturnCode;
	}
	

	
	   
	/**
	 * 	Update SeprReturnCode with the passed value
	 *  Corresponding COBOL Variable is SEPR-RETURN-CODE
	 *	@param number
	 */
	public void setSeprReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    seprReturnCode = checkSeprReturnCodeMaxLimit(number); 
		serializeSeprReturnCode(seprReturnCode);
	}
	

	public void setSeprReturnCode(long number) {
	    number = checkSeprReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeprReturnCode((int)number);
	}
	
	/**
	 * 	Update SeprReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeprReturnCode(char[] value) throws CFException {
		 seprReturnCode = serializeSeprReturnCode(value);
	}
	/**
	 * 	Update SeprReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeprReturnCodeString(char[] value) throws CFException {
		 setSeprReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSeprRc000088()
	 *	@return  Returns true if isSeprRc000088() is 0
	 */
   public boolean isSeprRc000088() throws CFException {
      return (  getSeprReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSeprRc000088True() {  			
    	setSeprReturnCode( 0);
   	}
	
	/**
	 *	Test condition 2 for isSeprRc000288()
	 *	@return  Returns true if isSeprRc000288() is 2
	 */
   public boolean isSeprRc000288() throws CFException {
      return (  getSeprReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setSeprRc000288True() {  			
    	setSeprReturnCode( 2);
   	}
	
	/**
	 *	Test condition 3 for isSeprRc000388()
	 *	@return  Returns true if isSeprRc000388() is 3
	 */
   public boolean isSeprRc000388() throws CFException {
      return (  getSeprReturnCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setSeprRc000388True() {  			
    	setSeprReturnCode( 3);
   	}
	
	/**
	 *	Test condition 4 for isSeprRc000488()
	 *	@return  Returns true if isSeprRc000488() is 4
	 */
   public boolean isSeprRc000488() throws CFException {
      return (  getSeprReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setSeprRc000488True() {  			
    	setSeprReturnCode( 4);
   	}
	
	/**
	 *	Test condition 6 for isSeprRc000688()
	 *	@return  Returns true if isSeprRc000688() is 6
	 */
   public boolean isSeprRc000688() throws CFException {
      return (  getSeprReturnCode()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setSeprRc000688True() {  			
    	setSeprReturnCode( 6);
   	}
	
	/**
	 *	Test condition 7 for isSeprRc000788()
	 *	@return  Returns true if isSeprRc000788() is 7
	 */
   public boolean isSeprRc000788() throws CFException {
      return (  getSeprReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setSeprRc000788True() {  			
    	setSeprReturnCode( 7);
   	}
	
	/**
	 *	Test condition 7 for isSeprRc000888()
	 *	@return  Returns true if isSeprRc000888() is 7
	 */
   public boolean isSeprRc000888() throws CFException {
      return (  getSeprReturnCode()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setSeprRc000888True() {  			
    	setSeprReturnCode( 7);
   	}
	
	/**
	 *	Test condition 48 for isSeprRc004888()
	 *	@return  Returns true if isSeprRc004888() is 48
	 */
   public boolean isSeprRc004888() throws CFException {
      return (  getSeprReturnCode()  ==  48  );
   }


	/**
	*  set values 48
	*/
   	public void setSeprRc004888True() {  			
    	setSeprReturnCode( 48);
   	}
	/**
	 *	Returns the value of seprReturnDesc
	 *	@return seprReturnDesc
	 */
   public char[] getSeprReturnDesc() throws CFException{
     if (isSeprReturnDescModified()) { 
        seprReturnDesc = refreshSeprReturnDesc();
     }
   		return seprReturnDesc;
   }

  
	/**
	*  set variable seprReturnDesc
	*  Corresponding COBOL Variable is SEPR-RETURN-DESC
	*  @param value
	**/
   public void setSeprReturnDesc(char[] value) {
      seprReturnDesc = checkSeprReturnDescConstraints(value);
      serializeSeprReturnDesc(seprReturnDesc);
   } 

     /**
	 * 	Update SeprReturnDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeprReturnDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeprReturnDesc,seprReturnDesc.length);
   	
   }
   
   public void setSeprReturnDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeprReturnDesc,seprReturnDesc.length);
   	
   }
   
     /**
	 * 	Update SeprReturnDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprReturnDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprReturnDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeprReturnDesc with another Field
	 *	@param value
	 */
   public void setSeprReturnDesc(Field source) {
       replace(source,0,source.length(),beginSeprReturnDesc,SEPR_RETURN_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update SeprReturnDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeprReturnDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeprReturnDesc,SEPR_RETURN_DESC_LEN);
   	
   }
   
     /**
	 * 	Update SeprReturnDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprReturnDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprReturnDesc+targetIndex,targetLen);
    
   }
	char[] seprRcDesc00008888Value = "SUCCESS!            ".toCharArray();
	/**
	 *	Test condition "SUCCESS!            " for isSeprRcDesc000088()
	 *	@return  Returns true if isSeprRcDesc000088() is "SUCCESS!            "
	 */
   public boolean isSeprRcDesc000088() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00008888Value)  == 0  );
   }


	/**
	*  set values "SUCCESS!            "
	*/
   	public void setSeprRcDesc000088True() {  			
    	setSeprReturnDesc( seprRcDesc00008888Value);
   	}
	char[] seprRcDesc00028888Value = "INVALID SE-ID.      ".toCharArray();
	/**
	 *	Test condition "INVALID SE-ID.      " for isSeprRcDesc000288()
	 *	@return  Returns true if isSeprRcDesc000288() is "INVALID SE-ID.      "
	 */
   public boolean isSeprRcDesc000288() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00028888Value)  == 0  );
   }


	/**
	*  set values "INVALID SE-ID.      "
	*/
   	public void setSeprRcDesc000288True() {  			
    	setSeprReturnDesc( seprRcDesc00028888Value);
   	}
	char[] seprRcDesc00038888Value = "INVALID SE-LENGTH.  ".toCharArray();
	/**
	 *	Test condition "INVALID SE-LENGTH.  " for isSeprRcDesc000388()
	 *	@return  Returns true if isSeprRcDesc000388() is "INVALID SE-LENGTH.  "
	 */
   public boolean isSeprRcDesc000388() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00038888Value)  == 0  );
   }


	/**
	*  set values "INVALID SE-LENGTH.  "
	*/
   	public void setSeprRcDesc000388True() {  			
    	setSeprReturnDesc( seprRcDesc00038888Value);
   	}
	char[] seprRcDesc00048888Value = "DE LENGTH 0/INVALID.".toCharArray();
	/**
	 *	Test condition "DE LENGTH 0/INVALID." for isSeprRcDesc000488()
	 *	@return  Returns true if isSeprRcDesc000488() is "DE LENGTH 0/INVALID."
	 */
   public boolean isSeprRcDesc000488() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00048888Value)  == 0  );
   }


	/**
	*  set values "DE LENGTH 0/INVALID."
	*/
   	public void setSeprRcDesc000488True() {  			
    	setSeprReturnDesc( seprRcDesc00048888Value);
   	}
	char[] seprRcDesc00068888Value = "NO SE FOUND.        ".toCharArray();
	/**
	 *	Test condition "NO SE FOUND.        " for isSeprRcDesc000688()
	 *	@return  Returns true if isSeprRcDesc000688() is "NO SE FOUND.        "
	 */
   public boolean isSeprRcDesc000688() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00068888Value)  == 0  );
   }


	/**
	*  set values "NO SE FOUND.        "
	*/
   	public void setSeprRcDesc000688True() {  			
    	setSeprReturnDesc( seprRcDesc00068888Value);
   	}
	char[] seprRcDesc00078888Value = "SE VS DE LENGTH ERR.".toCharArray();
	/**
	 *	Test condition "SE VS DE LENGTH ERR." for isSeprRcDesc000788()
	 *	@return  Returns true if isSeprRcDesc000788() is "SE VS DE LENGTH ERR."
	 */
   public boolean isSeprRcDesc000788() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00078888Value)  == 0  );
   }


	/**
	*  set values "SE VS DE LENGTH ERR."
	*/
   	public void setSeprRcDesc000788True() {  			
    	setSeprReturnDesc( seprRcDesc00078888Value);
   	}
	char[] seprRcDesc00088888Value = "ADDR POINTER IS NULL".toCharArray();
	/**
	 *	Test condition "ADDR POINTER IS NULL" for isSeprRcDesc000888()
	 *	@return  Returns true if isSeprRcDesc000888() is "ADDR POINTER IS NULL"
	 */
   public boolean isSeprRcDesc000888() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00088888Value)  == 0  );
   }


	/**
	*  set values "ADDR POINTER IS NULL"
	*/
   	public void setSeprRcDesc000888True() {  			
    	setSeprReturnDesc( seprRcDesc00088888Value);
   	}
	char[] seprRcDesc00488888Value = "DE48 TCC IS INVALID.".toCharArray();
	/**
	 *	Test condition "DE48 TCC IS INVALID." for isSeprRcDesc004888()
	 *	@return  Returns true if isSeprRcDesc004888() is "DE48 TCC IS INVALID."
	 */
   public boolean isSeprRcDesc004888() throws CFException {
      return (  compareChars( getSeprReturnDesc() , seprRcDesc00488888Value)  == 0  );
   }


	/**
	*  set values "DE48 TCC IS INVALID."
	*/
   	public void setSeprRcDesc004888True() {  			
    	setSeprReturnDesc( seprRcDesc00488888Value);
   	}
	/**
	 *	Returns the value of seprDe48Sw
	 *	@return seprDe48Sw
	 */
   public char[] getSeprDe48Sw() throws CFException{
     if (isSeprDe48SwModified()) { 
        seprDe48Sw = refreshSeprDe48Sw();
     }
   		return seprDe48Sw;
   }

  
	/**
	*  set variable seprDe48Sw
	*  Corresponding COBOL Variable is SEPR-DE48-SW
	*  @param value
	**/
   public void setSeprDe48Sw(char[] value) {
      seprDe48Sw = checkSeprDe48SwConstraints(value);
      serializeSeprDe48Sw(seprDe48Sw);
   } 

     /**
	 * 	Update SeprDe48Sw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeprDe48Sw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeprDe48Sw,seprDe48Sw.length);
   	
   }
   
   public void setSeprDe48Sw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeprDe48Sw,seprDe48Sw.length);
   	
   }
   
     /**
	 * 	Update SeprDe48Sw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprDe48Sw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprDe48Sw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeprDe48Sw with another Field
	 *	@param value
	 */
   public void setSeprDe48Sw(Field source) {
       replace(source,0,source.length(),beginSeprDe48Sw,SEPR_DE_48_SW_LEN);
   	
   }  
   
     /**
	 * 	Update SeprDe48Sw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeprDe48Sw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeprDe48Sw,SEPR_DE_48_SW_LEN);
   	
   }
   
     /**
	 * 	Update SeprDe48Sw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprDe48Sw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprDe48Sw+targetIndex,targetLen);
    
   }
	char[] seprDe488888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSeprDe4888()
	 *	@return  Returns true if isSeprDe4888() is "Y"
	 */
   public boolean isSeprDe4888() throws CFException {
      return (  compareChars( getSeprDe48Sw() , seprDe488888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSeprDe4888True() {  			
    	setSeprDe48Sw( seprDe488888Value);
   	}
	char[] seprNoDe488888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSeprNoDe4888()
	 *	@return  Returns true if isSeprNoDe4888() is "N"
	 */
   public boolean isSeprNoDe4888() throws CFException {
      return (  compareChars( getSeprDe48Sw() , seprNoDe488888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSeprNoDe4888True() {  			
    	setSeprDe48Sw( seprNoDe488888Value);
   	}
	/**
	 *	Returns the value of seprDataLength
	 *	@return seprDataLength
	 */
	public int getSeprDataLength() throws CFException {
       if (isSeprDataLengthModified()) { 
           seprDataLength = refreshSeprDataLength();
        }
   		return seprDataLength;
	}
	

	
	   
	/**
	 * 	Update SeprDataLength with the passed value
	 *  Corresponding COBOL Variable is SEPR-DATA-LENGTH
	 *	@param number
	 */
	public void setSeprDataLength(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    seprDataLength = checkSeprDataLengthMaxLimit(number); 
		serializeSeprDataLength(seprDataLength);
	}
	

	public void setSeprDataLength(long number) {
	    number = checkSeprDataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeprDataLength((int)number);
	}
	
	/**
	 * 	Update SeprDataLength with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeprDataLength(char[] value) throws CFException {
		 seprDataLength = serializeSeprDataLength(value);
	}
	/**
	 * 	Update SeprDataLength with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeprDataLengthString(char[] value) throws CFException {
		 setSeprDataLength(value);
	}
	/**
	 *	Returns the value of seprBadId
	 *	@return seprBadId
	 */
   public char[] getSeprBadId() throws CFException{
     if (isSeprBadIdModified()) { 
        seprBadId = refreshSeprBadId();
     }
   		return seprBadId;
   }

  
	/**
	*  set variable seprBadId
	*  Corresponding COBOL Variable is SEPR-BAD-ID
	*  @param value
	**/
   public void setSeprBadId(char[] value) {
      seprBadId = checkSeprBadIdConstraints(value);
      serializeSeprBadId(seprBadId);
   } 

     /**
	 * 	Update SeprBadId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeprBadId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeprBadId,seprBadId.length);
   	
   }
   
   public void setSeprBadId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeprBadId,seprBadId.length);
   	
   }
   
     /**
	 * 	Update SeprBadId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprBadId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprBadId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeprBadId with another Field
	 *	@param value
	 */
   public void setSeprBadId(Field source) {
       replace(source,0,source.length(),beginSeprBadId,SEPR_BAD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SeprBadId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeprBadId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeprBadId,SEPR_BAD_ID_LEN);
   	
   }
   
     /**
	 * 	Update SeprBadId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprBadId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprBadId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of seprBadLength
	 *	@return seprBadLength
	 */
   public char[] getSeprBadLength() throws CFException{
     if (isSeprBadLengthModified()) { 
        seprBadLength = refreshSeprBadLength();
     }
   		return seprBadLength;
   }

  
	/**
	*  set variable seprBadLength
	*  Corresponding COBOL Variable is SEPR-BAD-LENGTH
	*  @param value
	**/
   public void setSeprBadLength(char[] value) {
      seprBadLength = checkSeprBadLengthConstraints(value);
      serializeSeprBadLength(seprBadLength);
   } 

     /**
	 * 	Update SeprBadLength 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeprBadLength(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeprBadLength,seprBadLength.length);
   	
   }
   
   public void setSeprBadLength(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeprBadLength,seprBadLength.length);
   	
   }
   
     /**
	 * 	Update SeprBadLength 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprBadLength(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprBadLength+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeprBadLength with another Field
	 *	@param value
	 */
   public void setSeprBadLength(Field source) {
       replace(source,0,source.length(),beginSeprBadLength,SEPR_BAD_LENGTH_LEN);
   	
   }  
   
     /**
	 * 	Update SeprBadLength 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeprBadLength(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeprBadLength,SEPR_BAD_LENGTH_LEN);
   	
   }
   
     /**
	 * 	Update SeprBadLength 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprBadLength(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprBadLength+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of seprTccCd
	 *	@return seprTccCd
	 */
   public char[] getSeprTccCd() throws CFException{
     if (isSeprTccCdModified()) { 
        seprTccCd = refreshSeprTccCd();
     }
   		return seprTccCd;
   }

  
	/**
	*  set variable seprTccCd
	*  Corresponding COBOL Variable is SEPR-TCC-CD
	*  @param value
	**/
   public void setSeprTccCd(char[] value) {
      seprTccCd = checkSeprTccCdConstraints(value);
      serializeSeprTccCd(seprTccCd);
   } 

     /**
	 * 	Update SeprTccCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSeprTccCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSeprTccCd,seprTccCd.length);
   	
   }
   
   public void setSeprTccCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSeprTccCd,seprTccCd.length);
   	
   }
   
     /**
	 * 	Update SeprTccCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSeprTccCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprTccCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SeprTccCd with another Field
	 *	@param value
	 */
   public void setSeprTccCd(Field source) {
       replace(source,0,source.length(),beginSeprTccCd,SEPR_TCC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update SeprTccCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSeprTccCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSeprTccCd,SEPR_TCC_CD_LEN);
   	
   }
   
     /**
	 * 	Update SeprTccCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSeprTccCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSeprTccCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of seprDataAddr
	 *	@return seprDataAddr
	 */
	public int getSeprDataAddr() throws CFException {
        if (isSeprDataAddrModified()) { 
           seprDataAddr = refreshSeprDataAddr();
        }
   		return seprDataAddr;
	}
	
	/**
	 * 	Update SeprDataAddr with the passed value
	 *  Corresponding COBOL Variable is SEPR-DATA-ADDR
	 *	@param number
	 */
	public void setSeprDataAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    seprDataAddr = checkSeprDataAddrMaxLimit(number); 
		serializeSeprDataAddr(seprDataAddr);
	}


	public void setSeprDataAddr(long number) {
	    number = checkSeprDataAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeprDataAddr((int)number);
	}
	
	/**
	 *	Returns the value of seprDataPtr
	 *	@return seprDataPtr
	 */
	public int getSeprDataPtr() throws CFException {
        if (isSeprDataPtrModified()) { 
           seprDataPtr = refreshSeprDataPtr();
        }
   		return seprDataPtr;
	}
	
	/**
	 * 	Update SeprDataPtr with the passed value
	 *  Corresponding COBOL Variable is SEPR-DATA-PTR
	 *	@param number
	 */
	public void setSeprDataPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    seprDataPtr = checkSeprDataPtrMaxLimit(number); 
		serializeSeprDataPtr(seprDataPtr);
	}


	public void setSeprDataPtr(long number) {
	    number = checkSeprDataPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeprDataPtr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes SeprControlBlock
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSeprReturnCode(0);
         setSeprReturnDesc(CONSTANTS.SPACE_20);
         setSeprDe48Sw(CONSTANTS.SPACE);
                     setSeprDataLength(0);
         setSeprBadId(CONSTANTS.SPACE_3);
         setSeprBadLength(CONSTANTS.SPACE_3);
         setSeprTccCd(CONSTANTS.SPACE);
                     setSeprDataAddr(0);
   }

		public static int getSeprControlBlockFieldLength() {
			return SEPR_CONTROL_BLOCK_LENGTH;
		}

}
  
