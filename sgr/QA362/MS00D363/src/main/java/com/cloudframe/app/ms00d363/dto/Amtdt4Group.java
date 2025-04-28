package com.cloudframe.app.ms00d363.dto;

/**
*  The class Amtdt4Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Amtdt4Group extends Amtdt4GroupSerialized {
   

						private char[] amtdt4 = Field.fillLowValue(24);

								private char[] amtdt40 = Field.fillLowValue(24);

								private char[] amtdt41 = Field.fillLowValue(24);

								private char[] amtdt42 = Field.fillLowValue(24);

								private char[] amtdt43 = Field.fillLowValue(24);

								private char[] amtdt44 = Field.fillLowValue(24);

								private char[] amtdt45 = Field.fillLowValue(24);

								private char[] amtdt46 = Field.fillLowValue(24);

								private char[] amtdt47 = Field.fillLowValue(24);
	
	/**
	* Constructor for Amtdt4Group
	**/
    public Amtdt4Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of amtdt4
	 *	@return amtdt4
	 */
   public char[] getAmtdt4() throws CFException{
     if (isAmtdt4Modified()) { 
        amtdt4 = refreshAmtdt4();
     }
   		return amtdt4;
   }

  
	/**
	*  set variable amtdt4
	*  Corresponding COBOL Variable is WS-AMTDT4
	*  @param value
	**/
   public void setAmtdt4(char[] value) {
      amtdt4 = checkAmtdt4Constraints(value);
      serializeAmtdt4(amtdt4);
   } 

     /**
	 * 	Update Amtdt4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt4,amtdt4.length);
   	
   }
   
   public void setAmtdt4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt4,amtdt4.length);
   	
   }
   
     /**
	 * 	Update Amtdt4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt4 with another Field
	 *	@param value
	 */
   public void setAmtdt4(Field source) {
       replace(source,0,source.length(),beginAmtdt4,AMTDT_4_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt4,AMTDT_4_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt40
	 *	@return amtdt40
	 */
   public char[] getAmtdt40() throws CFException{
     if (isAmtdt40Modified()) { 
        amtdt40 = refreshAmtdt40();
     }
   		return amtdt40;
   }

  
	/**
	*  set variable amtdt40
	*  Corresponding COBOL Variable is WS-AMTDT40
	*  @param value
	**/
   public void setAmtdt40(char[] value) {
      amtdt40 = checkAmtdt40Constraints(value);
      serializeAmtdt40(amtdt40);
   } 

     /**
	 * 	Update Amtdt40 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt40(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt40,amtdt40.length);
   	
   }
   
   public void setAmtdt40(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt40,amtdt40.length);
   	
   }
   
     /**
	 * 	Update Amtdt40 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt40(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt40+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt40 with another Field
	 *	@param value
	 */
   public void setAmtdt40(Field source) {
       replace(source,0,source.length(),beginAmtdt40,AMTDT_40_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt40 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt40(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt40,AMTDT_40_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt40 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt40(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt40+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt41
	 *	@return amtdt41
	 */
   public char[] getAmtdt41() throws CFException{
     if (isAmtdt41Modified()) { 
        amtdt41 = refreshAmtdt41();
     }
   		return amtdt41;
   }

  
	/**
	*  set variable amtdt41
	*  Corresponding COBOL Variable is WS-AMTDT41
	*  @param value
	**/
   public void setAmtdt41(char[] value) {
      amtdt41 = checkAmtdt41Constraints(value);
      serializeAmtdt41(amtdt41);
   } 

     /**
	 * 	Update Amtdt41 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt41(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt41,amtdt41.length);
   	
   }
   
   public void setAmtdt41(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt41,amtdt41.length);
   	
   }
   
     /**
	 * 	Update Amtdt41 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt41(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt41+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt41 with another Field
	 *	@param value
	 */
   public void setAmtdt41(Field source) {
       replace(source,0,source.length(),beginAmtdt41,AMTDT_41_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt41 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt41(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt41,AMTDT_41_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt41 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt41(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt41+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt42
	 *	@return amtdt42
	 */
   public char[] getAmtdt42() throws CFException{
     if (isAmtdt42Modified()) { 
        amtdt42 = refreshAmtdt42();
     }
   		return amtdt42;
   }

  
	/**
	*  set variable amtdt42
	*  Corresponding COBOL Variable is WS-AMTDT42
	*  @param value
	**/
   public void setAmtdt42(char[] value) {
      amtdt42 = checkAmtdt42Constraints(value);
      serializeAmtdt42(amtdt42);
   } 

     /**
	 * 	Update Amtdt42 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt42(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt42,amtdt42.length);
   	
   }
   
   public void setAmtdt42(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt42,amtdt42.length);
   	
   }
   
     /**
	 * 	Update Amtdt42 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt42(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt42+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt42 with another Field
	 *	@param value
	 */
   public void setAmtdt42(Field source) {
       replace(source,0,source.length(),beginAmtdt42,AMTDT_42_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt42 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt42(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt42,AMTDT_42_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt42 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt42(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt42+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt43
	 *	@return amtdt43
	 */
   public char[] getAmtdt43() throws CFException{
     if (isAmtdt43Modified()) { 
        amtdt43 = refreshAmtdt43();
     }
   		return amtdt43;
   }

  
	/**
	*  set variable amtdt43
	*  Corresponding COBOL Variable is WS-AMTDT43
	*  @param value
	**/
   public void setAmtdt43(char[] value) {
      amtdt43 = checkAmtdt43Constraints(value);
      serializeAmtdt43(amtdt43);
   } 

     /**
	 * 	Update Amtdt43 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt43(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt43,amtdt43.length);
   	
   }
   
   public void setAmtdt43(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt43,amtdt43.length);
   	
   }
   
     /**
	 * 	Update Amtdt43 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt43(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt43+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt43 with another Field
	 *	@param value
	 */
   public void setAmtdt43(Field source) {
       replace(source,0,source.length(),beginAmtdt43,AMTDT_43_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt43 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt43(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt43,AMTDT_43_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt43 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt43(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt43+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt44
	 *	@return amtdt44
	 */
   public char[] getAmtdt44() throws CFException{
     if (isAmtdt44Modified()) { 
        amtdt44 = refreshAmtdt44();
     }
   		return amtdt44;
   }

  
	/**
	*  set variable amtdt44
	*  Corresponding COBOL Variable is WS-AMTDT44
	*  @param value
	**/
   public void setAmtdt44(char[] value) {
      amtdt44 = checkAmtdt44Constraints(value);
      serializeAmtdt44(amtdt44);
   } 

     /**
	 * 	Update Amtdt44 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt44(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt44,amtdt44.length);
   	
   }
   
   public void setAmtdt44(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt44,amtdt44.length);
   	
   }
   
     /**
	 * 	Update Amtdt44 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt44(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt44+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt44 with another Field
	 *	@param value
	 */
   public void setAmtdt44(Field source) {
       replace(source,0,source.length(),beginAmtdt44,AMTDT_44_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt44 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt44(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt44,AMTDT_44_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt44 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt44(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt44+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt45
	 *	@return amtdt45
	 */
   public char[] getAmtdt45() throws CFException{
     if (isAmtdt45Modified()) { 
        amtdt45 = refreshAmtdt45();
     }
   		return amtdt45;
   }

  
	/**
	*  set variable amtdt45
	*  Corresponding COBOL Variable is WS-AMTDT45
	*  @param value
	**/
   public void setAmtdt45(char[] value) {
      amtdt45 = checkAmtdt45Constraints(value);
      serializeAmtdt45(amtdt45);
   } 

     /**
	 * 	Update Amtdt45 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt45(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt45,amtdt45.length);
   	
   }
   
   public void setAmtdt45(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt45,amtdt45.length);
   	
   }
   
     /**
	 * 	Update Amtdt45 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt45(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt45+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt45 with another Field
	 *	@param value
	 */
   public void setAmtdt45(Field source) {
       replace(source,0,source.length(),beginAmtdt45,AMTDT_45_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt45 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt45(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt45,AMTDT_45_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt45 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt45(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt45+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt46
	 *	@return amtdt46
	 */
   public char[] getAmtdt46() throws CFException{
     if (isAmtdt46Modified()) { 
        amtdt46 = refreshAmtdt46();
     }
   		return amtdt46;
   }

  
	/**
	*  set variable amtdt46
	*  Corresponding COBOL Variable is WS-AMTDT46
	*  @param value
	**/
   public void setAmtdt46(char[] value) {
      amtdt46 = checkAmtdt46Constraints(value);
      serializeAmtdt46(amtdt46);
   } 

     /**
	 * 	Update Amtdt46 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt46(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt46,amtdt46.length);
   	
   }
   
   public void setAmtdt46(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt46,amtdt46.length);
   	
   }
   
     /**
	 * 	Update Amtdt46 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt46(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt46+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt46 with another Field
	 *	@param value
	 */
   public void setAmtdt46(Field source) {
       replace(source,0,source.length(),beginAmtdt46,AMTDT_46_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt46 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt46(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt46,AMTDT_46_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt46 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt46(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt46+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtdt47
	 *	@return amtdt47
	 */
   public char[] getAmtdt47() throws CFException{
     if (isAmtdt47Modified()) { 
        amtdt47 = refreshAmtdt47();
     }
   		return amtdt47;
   }

  
	/**
	*  set variable amtdt47
	*  Corresponding COBOL Variable is WS-AMTDT47
	*  @param value
	**/
   public void setAmtdt47(char[] value) {
      amtdt47 = checkAmtdt47Constraints(value);
      serializeAmtdt47(amtdt47);
   } 

     /**
	 * 	Update Amtdt47 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt47(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtdt47,amtdt47.length);
   	
   }
   
   public void setAmtdt47(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt47,amtdt47.length);
   	
   }
   
     /**
	 * 	Update Amtdt47 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt47(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt47+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtdt47 with another Field
	 *	@param value
	 */
   public void setAmtdt47(Field source) {
       replace(source,0,source.length(),beginAmtdt47,AMTDT_47_LEN);
   	
   }  
   
     /**
	 * 	Update Amtdt47 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt47(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtdt47,AMTDT_47_LEN);
   	
   }
   
     /**
	 * 	Update Amtdt47 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt47(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtdt47+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAmtdt4GroupFieldLength() {
			return AMTDT_4_GROUP_LENGTH;
		}

}
  
