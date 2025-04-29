package com.cloudframe.app.cobpgmor.dto;

/**
*  The class HvErec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.cobpgmor.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class HvErec extends HvErecSerialized {
   

								private short hvEno;

						private char[] hvEname = Field.fillLowValue(15);

						private char[] hvEadd = Field.fillLowValue(20);

								private BigDecimal hvEsal = BigDecimal.ZERO;

						private char[] hvEdoj = Field.fillLowValue(10);
	
	/**
	* Constructor for HvErec
	**/
    public HvErec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of hvEno
	 *	@return hvEno
	 */
	public short getHvEno() throws CFException {
        if (isHvEnoModified()) { 
           hvEno = refreshHvEno();
        }
   		return hvEno;
	}
	
	/**
	 * 	Update HvEno with the passed value
	 *  Corresponding COBOL Variable is HV-ENO
	 *	@param number
	 */
	public void setHvEno(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvEno = checkHvEnoMaxLimit(number); 
		serializeHvEno(hvEno);
	}

	public void setHvEno(int number) {
	    number = checkHvEnoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvEno((short)number);
	}
	public void setHvEno(long number) {
	    number = checkHvEnoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvEno((short)number);
	}
	

	/**
	 *	Returns the value of hvEname
	 *	@return hvEname
	 */
   public char[] getHvEname() throws CFException{
     if (isHvEnameModified()) { 
        hvEname = refreshHvEname();
     }
   		return hvEname;
   }

  
	/**
	*  set variable hvEname
	*  Corresponding COBOL Variable is HV-ENAME
	*  @param value
	**/
   public void setHvEname(char[] value) {
      hvEname = checkHvEnameConstraints(value);
      serializeHvEname(hvEname);
   } 

     /**
	 * 	Update HvEname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvEname,hvEname.length);
   	
   }
   
   public void setHvEname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvEname,hvEname.length);
   	
   }
   
     /**
	 * 	Update HvEname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvEname with another Field
	 *	@param value
	 */
   public void setHvEname(Field source) {
       replace(source,0,source.length(),beginHvEname,HV_ENAME_LEN);
   	
   }  
   
     /**
	 * 	Update HvEname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvEname,HV_ENAME_LEN);
   	
   }
   
     /**
	 * 	Update HvEname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvEadd
	 *	@return hvEadd
	 */
   public char[] getHvEadd() throws CFException{
     if (isHvEaddModified()) { 
        hvEadd = refreshHvEadd();
     }
   		return hvEadd;
   }

  
	/**
	*  set variable hvEadd
	*  Corresponding COBOL Variable is HV-EADD
	*  @param value
	**/
   public void setHvEadd(char[] value) {
      hvEadd = checkHvEaddConstraints(value);
      serializeHvEadd(hvEadd);
   } 

     /**
	 * 	Update HvEadd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEadd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvEadd,hvEadd.length);
   	
   }
   
   public void setHvEadd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvEadd,hvEadd.length);
   	
   }
   
     /**
	 * 	Update HvEadd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEadd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEadd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvEadd with another Field
	 *	@param value
	 */
   public void setHvEadd(Field source) {
       replace(source,0,source.length(),beginHvEadd,HV_EADD_LEN);
   	
   }  
   
     /**
	 * 	Update HvEadd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEadd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvEadd,HV_EADD_LEN);
   	
   }
   
     /**
	 * 	Update HvEadd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEadd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEadd+targetIndex,targetLen);
    
   }
	public BigDecimal getHvEsal() throws CFException {
        if (isHvEsalModified()) { 
           hvEsal = refreshHvEsal();
        }
   		return hvEsal;
	}

    public char[] getHvEsalString() {
          return  hvEsalString();
    }
	
	/**
	 * 	Update HvEsal with the passed number
	 *  Corresponding COBOL Variable is HV-ESAL
	 *	@param number
	 */
	public void setHvEsal(BigDecimal number) {	
     hvEsal = checkHvEsalMaxLimit(number);
	    serializeHvEsal(hvEsal);
   }
	/**
	 *	Returns the value of hvEdoj
	 *	@return hvEdoj
	 */
   public char[] getHvEdoj() throws CFException{
     if (isHvEdojModified()) { 
        hvEdoj = refreshHvEdoj();
     }
   		return hvEdoj;
   }

  
	/**
	*  set variable hvEdoj
	*  Corresponding COBOL Variable is HV-EDOJ
	*  @param value
	**/
   public void setHvEdoj(char[] value) {
      hvEdoj = checkHvEdojConstraints(value);
      serializeHvEdoj(hvEdoj);
   } 

     /**
	 * 	Update HvEdoj 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEdoj(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvEdoj,hvEdoj.length);
   	
   }
   
   public void setHvEdoj(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvEdoj,hvEdoj.length);
   	
   }
   
     /**
	 * 	Update HvEdoj 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEdoj(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEdoj+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvEdoj with another Field
	 *	@param value
	 */
   public void setHvEdoj(Field source) {
       replace(source,0,source.length(),beginHvEdoj,HV_EDOJ_LEN);
   	
   }  
   
     /**
	 * 	Update HvEdoj 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEdoj(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvEdoj,HV_EDOJ_LEN);
   	
   }
   
     /**
	 * 	Update HvEdoj 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEdoj(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEdoj+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvErecFieldLength() {
			return HV_EREC_LENGTH;
		}

}
  
