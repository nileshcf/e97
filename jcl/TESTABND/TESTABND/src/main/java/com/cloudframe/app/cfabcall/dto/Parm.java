package com.cloudframe.app.cfabcall.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.cfabcall.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm extends ParmSerialized {
   

								private short parmLen;

						private char[] abendTy = Field.fillLowValue(1);

								private int abendCode01;
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLen
	 *	@return parmLen
	 */
	public short getParmLen() throws CFException {
        if (isParmLenModified()) { 
           parmLen = refreshParmLen();
        }
   		return parmLen;
	}
	
	/**
	 * 	Update ParmLen with the passed value
	 *  Corresponding COBOL Variable is LK-PARM-LEN
	 *	@param number
	 */
	public void setParmLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLen = checkParmLenMaxLimit(number); 
		serializeParmLen(parmLen);
	}

	public void setParmLen(int number) {
	    number = checkParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLen((short)number);
	}
	public void setParmLen(long number) {
	    number = checkParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLen((short)number);
	}
	

	/**
	 *	Returns the value of abendTy
	 *	@return abendTy
	 */
   public char[] getAbendTy() throws CFException{
     if (isAbendTyModified()) { 
        abendTy = refreshAbendTy();
     }
   		return abendTy;
   }

  
	/**
	*  set variable abendTy
	*  Corresponding COBOL Variable is LK-ABEND-TY
	*  @param value
	**/
   public void setAbendTy(char[] value) {
      abendTy = checkAbendTyConstraints(value);
      serializeAbendTy(abendTy);
   } 

     /**
	 * 	Update AbendTy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendTy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendTy,abendTy.length);
   	
   }
   
   public void setAbendTy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendTy,abendTy.length);
   	
   }
   
     /**
	 * 	Update AbendTy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendTy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendTy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendTy with another Field
	 *	@param value
	 */
   public void setAbendTy(Field source) {
       replace(source,0,source.length(),beginAbendTy,ABEND_TY_LEN);
   	
   }  
   
     /**
	 * 	Update AbendTy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendTy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendTy,ABEND_TY_LEN);
   	
   }
   
     /**
	 * 	Update AbendTy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendTy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendTy+targetIndex,targetLen);
    
   }
	char[] abendIlboabn088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isAbendIlboabn0()
	 *	@return  Returns true if isAbendIlboabn0() is "I"
	 */
   public boolean isAbendIlboabn0() throws CFException {
      return (  compareChars( getAbendTy() , abendIlboabn088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setAbendIlboabn0True() {  			
    	setAbendTy( abendIlboabn088Value);
   	}
	char[] abendCee3abd88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isAbendCee3abd()
	 *	@return  Returns true if isAbendCee3abd() is "C"
	 */
   public boolean isAbendCee3abd() throws CFException {
      return (  compareChars( getAbendTy() , abendCee3abd88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setAbendCee3abdTrue() {  			
    	setAbendTy( abendCee3abd88Value);
   	}
	/**
	 *	Returns the value of abendCode01
	 *	@return abendCode01
	 */
	public int getAbendCode01() throws CFException {
       if (isAbendCode01Modified()) { 
           abendCode01 = refreshAbendCode01();
        }
   		return abendCode01;
	}
	

	
	   
	/**
	 * 	Update AbendCode01 with the passed value
	 *  Corresponding COBOL Variable is LK-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode01(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode01 = checkAbendCode01MaxLimit(number); 
		serializeAbendCode01(abendCode01);
	}
	

	public void setAbendCode01(long number) {
	    number = checkAbendCode01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode01((int)number);
	}
	
	/**
	 * 	Update AbendCode01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode01(char[] value) throws CFException {
		 abendCode01 = serializeAbendCode01(value);
	}
	/**
	 * 	Update AbendCode01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode01String(char[] value) throws CFException {
		 setAbendCode01(value);
	}

	
	
	

		public static int getParmFieldLength() {
			return PARM_LENGTH;
		}

}
  
