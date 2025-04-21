package com.cloudframe.app.ar640010.dto;

/**
*  The class ApplExitWork810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ApplExitWork810 extends ApplExitWork810Serialized { 
   

								private short applExitDsnLen810;

								private short applExitMbrLen810;

						private char[] applExitDsnDlm810 = new char[1];

						private char[] applExitMbrDlm810 = new char[1];

						private char[] applExitDsn810 = new char[44];

						private char[] applExitMbr810 = new char[8];

						private char[] applExitWrk810 = new char[44];
	
	/**
	* Constructor for ApplExitWork810
	**/
    public ApplExitWork810() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ApplExitWork810. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplExitWork810(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplExitDsnLen810((short)0);
								setApplExitMbrLen810((short)0);
								setApplExitDsnDlm810(fillSpace(1));
								setApplExitMbrDlm810(fillSpace(1));
								setApplExitDsn810(fillSpace(44));
								setApplExitMbr810(fillSpace(8));
								setApplExitWrk810(fillSpace(44));
    } 

	/**
	 *	Returns the value of applExitDsnLen810
	 *	@return applExitDsnLen810
	 */
	public short getApplExitDsnLen810() throws CFException {
        if (isApplExitDsnLen810Modified()) { 
           applExitDsnLen810 = refreshApplExitDsnLen810();
        }
   		return applExitDsnLen810;
	}
	
	/**
	 * 	Update ApplExitDsnLen810 with the passed value
	 *  Corresponding COBOL Variable is 810-APPL-EXIT-DSN-LEN
	 *	@param number
	 */
	public void setApplExitDsnLen810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    applExitDsnLen810 = checkApplExitDsnLen810MaxLimit(number); 
		serializeApplExitDsnLen810(applExitDsnLen810);
	}

	public void setApplExitDsnLen810(int number) {
	    number = checkApplExitDsnLen810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setApplExitDsnLen810((short)number);
	}
	public void setApplExitDsnLen810(long number) {
	    number = checkApplExitDsnLen810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setApplExitDsnLen810((short)number);
	}
	

	/**
	 *	Returns the value of applExitMbrLen810
	 *	@return applExitMbrLen810
	 */
	public short getApplExitMbrLen810() throws CFException {
        if (isApplExitMbrLen810Modified()) { 
           applExitMbrLen810 = refreshApplExitMbrLen810();
        }
   		return applExitMbrLen810;
	}
	
	/**
	 * 	Update ApplExitMbrLen810 with the passed value
	 *  Corresponding COBOL Variable is 810-APPL-EXIT-MBR-LEN
	 *	@param number
	 */
	public void setApplExitMbrLen810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    applExitMbrLen810 = checkApplExitMbrLen810MaxLimit(number); 
		serializeApplExitMbrLen810(applExitMbrLen810);
	}

	public void setApplExitMbrLen810(int number) {
	    number = checkApplExitMbrLen810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setApplExitMbrLen810((short)number);
	}
	public void setApplExitMbrLen810(long number) {
	    number = checkApplExitMbrLen810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setApplExitMbrLen810((short)number);
	}
	

	/**
	 *	Returns the value of applExitDsnDlm810
	 *	@return applExitDsnDlm810
	 */
   public char[] getApplExitDsnDlm810() throws CFException{
     if (isApplExitDsnDlm810Modified()) { 
        applExitDsnDlm810 = refreshApplExitDsnDlm810();
     }
   		return applExitDsnDlm810;
   }

  
	/**
	*  set variable applExitDsnDlm810
	*  Corresponding COBOL Variable is 810-APPL-EXIT-DSN-DLM
	*  @param value
	**/
   public void setApplExitDsnDlm810(char[] value) {
      applExitDsnDlm810 = checkApplExitDsnDlm810Constraints(value);
      serializeApplExitDsnDlm810(applExitDsnDlm810);
   } 

     /**
	 * 	Update ApplExitDsnDlm810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplExitDsnDlm810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplExitDsnDlm810,applExitDsnDlm810.length);
   	
   }
   
   public void setApplExitDsnDlm810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitDsnDlm810,applExitDsnDlm810.length);
   	
   }
   
     /**
	 * 	Update ApplExitDsnDlm810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplExitDsnDlm810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitDsnDlm810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplExitDsnDlm810 with another Field
	 *	@param value
	 */
   public void setApplExitDsnDlm810(Field source) {
       replace(source,0,source.length(),beginApplExitDsnDlm810,APPL_EXIT_DSN_DLM_810_LEN);
   	
   }  
   
     /**
	 * 	Update ApplExitDsnDlm810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplExitDsnDlm810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplExitDsnDlm810,APPL_EXIT_DSN_DLM_810_LEN);
   	
   }
   
     /**
	 * 	Update ApplExitDsnDlm810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplExitDsnDlm810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitDsnDlm810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of applExitMbrDlm810
	 *	@return applExitMbrDlm810
	 */
   public char[] getApplExitMbrDlm810() throws CFException{
     if (isApplExitMbrDlm810Modified()) { 
        applExitMbrDlm810 = refreshApplExitMbrDlm810();
     }
   		return applExitMbrDlm810;
   }

  
	/**
	*  set variable applExitMbrDlm810
	*  Corresponding COBOL Variable is 810-APPL-EXIT-MBR-DLM
	*  @param value
	**/
   public void setApplExitMbrDlm810(char[] value) {
      applExitMbrDlm810 = checkApplExitMbrDlm810Constraints(value);
      serializeApplExitMbrDlm810(applExitMbrDlm810);
   } 

     /**
	 * 	Update ApplExitMbrDlm810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplExitMbrDlm810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplExitMbrDlm810,applExitMbrDlm810.length);
   	
   }
   
   public void setApplExitMbrDlm810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitMbrDlm810,applExitMbrDlm810.length);
   	
   }
   
     /**
	 * 	Update ApplExitMbrDlm810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplExitMbrDlm810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitMbrDlm810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplExitMbrDlm810 with another Field
	 *	@param value
	 */
   public void setApplExitMbrDlm810(Field source) {
       replace(source,0,source.length(),beginApplExitMbrDlm810,APPL_EXIT_MBR_DLM_810_LEN);
   	
   }  
   
     /**
	 * 	Update ApplExitMbrDlm810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplExitMbrDlm810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplExitMbrDlm810,APPL_EXIT_MBR_DLM_810_LEN);
   	
   }
   
     /**
	 * 	Update ApplExitMbrDlm810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplExitMbrDlm810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitMbrDlm810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of applExitDsn810
	 *	@return applExitDsn810
	 */
   public char[] getApplExitDsn810() throws CFException{
     if (isApplExitDsn810Modified()) { 
        applExitDsn810 = refreshApplExitDsn810();
     }
   		return applExitDsn810;
   }

  
	/**
	*  set variable applExitDsn810
	*  Corresponding COBOL Variable is 810-APPL-EXIT-DSN
	*  @param value
	**/
   public void setApplExitDsn810(char[] value) {
      applExitDsn810 = checkApplExitDsn810Constraints(value);
      serializeApplExitDsn810(applExitDsn810);
   } 

     /**
	 * 	Update ApplExitDsn810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplExitDsn810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplExitDsn810,applExitDsn810.length);
   	
   }
   
   public void setApplExitDsn810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitDsn810,applExitDsn810.length);
   	
   }
   
     /**
	 * 	Update ApplExitDsn810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplExitDsn810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitDsn810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplExitDsn810 with another Field
	 *	@param value
	 */
   public void setApplExitDsn810(Field source) {
       replace(source,0,source.length(),beginApplExitDsn810,APPL_EXIT_DSN_810_LEN);
   	
   }  
   
     /**
	 * 	Update ApplExitDsn810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplExitDsn810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplExitDsn810,APPL_EXIT_DSN_810_LEN);
   	
   }
   
     /**
	 * 	Update ApplExitDsn810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplExitDsn810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitDsn810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of applExitMbr810
	 *	@return applExitMbr810
	 */
   public char[] getApplExitMbr810() throws CFException{
     if (isApplExitMbr810Modified()) { 
        applExitMbr810 = refreshApplExitMbr810();
     }
   		return applExitMbr810;
   }

  
	/**
	*  set variable applExitMbr810
	*  Corresponding COBOL Variable is 810-APPL-EXIT-MBR
	*  @param value
	**/
   public void setApplExitMbr810(char[] value) {
      applExitMbr810 = checkApplExitMbr810Constraints(value);
      serializeApplExitMbr810(applExitMbr810);
   } 

     /**
	 * 	Update ApplExitMbr810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplExitMbr810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplExitMbr810,applExitMbr810.length);
   	
   }
   
   public void setApplExitMbr810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitMbr810,applExitMbr810.length);
   	
   }
   
     /**
	 * 	Update ApplExitMbr810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplExitMbr810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitMbr810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplExitMbr810 with another Field
	 *	@param value
	 */
   public void setApplExitMbr810(Field source) {
       replace(source,0,source.length(),beginApplExitMbr810,APPL_EXIT_MBR_810_LEN);
   	
   }  
   
     /**
	 * 	Update ApplExitMbr810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplExitMbr810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplExitMbr810,APPL_EXIT_MBR_810_LEN);
   	
   }
   
     /**
	 * 	Update ApplExitMbr810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplExitMbr810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitMbr810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of applExitWrk810
	 *	@return applExitWrk810
	 */
   public char[] getApplExitWrk810() throws CFException{
     if (isApplExitWrk810Modified()) { 
        applExitWrk810 = refreshApplExitWrk810();
     }
   		return applExitWrk810;
   }

  
	/**
	*  set variable applExitWrk810
	*  Corresponding COBOL Variable is 810-APPL-EXIT-WRK
	*  @param value
	**/
   public void setApplExitWrk810(char[] value) {
      applExitWrk810 = checkApplExitWrk810Constraints(value);
      serializeApplExitWrk810(applExitWrk810);
   } 

     /**
	 * 	Update ApplExitWrk810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplExitWrk810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplExitWrk810,applExitWrk810.length);
   	
   }
   
   public void setApplExitWrk810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitWrk810,applExitWrk810.length);
   	
   }
   
     /**
	 * 	Update ApplExitWrk810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplExitWrk810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitWrk810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplExitWrk810 with another Field
	 *	@param value
	 */
   public void setApplExitWrk810(Field source) {
       replace(source,0,source.length(),beginApplExitWrk810,APPL_EXIT_WRK_810_LEN);
   	
   }  
   
     /**
	 * 	Update ApplExitWrk810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplExitWrk810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplExitWrk810,APPL_EXIT_WRK_810_LEN);
   	
   }
   
     /**
	 * 	Update ApplExitWrk810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplExitWrk810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplExitWrk810+targetIndex,targetLen);
    
   }
	char[] applExitOverflow8881088Value = "** OVERFLOW **                              ".toCharArray();
	/**
	 *	Test condition "** OVERFLOW **" for isApplExitOverflow88810()
	 *	@return  Returns true if isApplExitOverflow88810() is "** OVERFLOW **"
	 */
   public boolean isApplExitOverflow88810() throws CFException {
      return (  compareChars( getApplExitWrk810() , applExitOverflow8881088Value)  == 0  );
   }


	/**
	*  set values "** OVERFLOW **"
	*/
   	public void setApplExitOverflow88810True() {  			
    	setApplExitWrk810( applExitOverflow8881088Value);
   	}

	
	
	
	/**
	 * 	initializes ApplExitWork810
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setApplExitDsnLen810((short)0);
         	setApplExitMbrLen810((short)0);
         setApplExitDsnDlm810(CONSTANTS.SPACE);
         setApplExitMbrDlm810(CONSTANTS.SPACE);
         setApplExitDsn810(CONSTANTS.SPACE_44);
         setApplExitMbr810(CONSTANTS.SPACE_8);
         setApplExitWrk810(CONSTANTS.SPACE_44);
   }

		public static int getApplExitWork810FieldLength() {
			return APPL_EXIT_WORK_810_LENGTH;
		}

}
  
